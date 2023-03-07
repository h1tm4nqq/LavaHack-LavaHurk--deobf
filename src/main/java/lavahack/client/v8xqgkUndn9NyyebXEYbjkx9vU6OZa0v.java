/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.Locale;
import lavahack.client.MWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
import org.apache.commons.io.FilenameUtils;

public class v8xqgkUndn9NyyebXEYbjkx9vU6OZa0v
implements FileFilter {
    private final boolean Field13270;
    private String Field13271 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public v8xqgkUndn9NyyebXEYbjkx9vU6OZa0v(boolean bl) {
        this.Field13270 = bl;
    }

    @Override
    public boolean accept(File file) {
        MWKsjf2F7eDKYSgsSUOF8imukA0mof8z mWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
        if (this.Field13270) {
            return file.isDirectory();
        }
        String string = "." + FilenameUtils.getExtension(file.getName().toLowerCase(Locale.ROOT));
        Iterator iterator = MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Field8593.values().iterator();
        do {
            if (!iterator.hasNext()) return (int)((long)269382921 ^ (long)269382921) != 0;
        } while (!(mWKsjf2F7eDKYSgsSUOF8imukA0mof8z = (MWKsjf2F7eDKYSgsSUOF8imukA0mof8z)iterator.next()).Method993().equals(string));
        return (int)((long)1980941788 ^ (long)1980941789) != 0;
    }

    private static String Method4695(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)933573626 ^ (long)933573626);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2094873243L ^ 0x8322C59A);
            int n2 = (int)((long)1554082550 ^ (long)1554082511) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)423375237 ^ (long)423371498) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

