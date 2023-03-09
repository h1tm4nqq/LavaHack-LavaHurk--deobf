/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.Locale;
import lavahack.client.Class153;
import org.apache.commons.io.FilenameUtils;

public class Class1169
implements FileFilter {
    private final boolean Field13270;
    private String Field13271 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1169(boolean bl) {
        this.Field13270 = bl;
    }

    @Override
    public boolean accept(File file) {
        Class153 class153;
        if (this.Field13270) {
            return file.isDirectory();
        }
        String string = "." + FilenameUtils.getExtension(file.getName().toLowerCase(Locale.ROOT));
        Iterator iterator = Class153.Field8593.values().iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!(class153 = (Class153)iterator.next()).Method993().equals(string));
        return true;
    }

    private static String Method4695(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 228;
            cArray2[n] = (char)(cArray[n] ^ (0x4DBC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

