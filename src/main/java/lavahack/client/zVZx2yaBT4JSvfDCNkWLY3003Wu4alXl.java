/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import lavahack.client.DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import org.jetbrains.annotations.NotNull;

public class zVZx2yaBT4JSvfDCNkWLY3003Wu4alXl
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private int Field17036;

    public zVZx2yaBT4JSvfDCNkWLY3003Wu4alXl() {
        super("getuuid");
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (stringArray.length < ((int)-353230580L ^ 0xEAF2210D) << 1) {
            this.Method438("Too few arguments");
            return;
        }
        long l = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
        if (stringArray.length >= ((int)-1764309545L ^ 0x96D6C5D4)) {
            l = Long.parseLong(stringArray[((int)-1346310956L ^ 0xAFC0ECD5) << 1]);
        }
        boolean bl = stringArray[(int)((long)248106194 ^ (long)248106194)].split(":")[(int)((long)-580473790 ^ (long)-580473789)].equalsIgnoreCase("true");
        String string2 = stringArray[(int)-1278762099L ^ 0xB3C7A38C];
        Long.compare(l, 0L);
        String string3 = DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7559(string2);
        if (string3 == null) {
            this.Method438("The player " + string2 + " does not exist");
            return;
        }
        if (string3.equals("error")) {
            this.Method438("Request timed out");
            return;
        }
        if (bl) {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(string3), null);
        }
        this.Method437("The UUID of " + string2 + " is " + string3);
    }

    @Override
    public String Method447() {
        return "gets the uuid of the specified player";
    }

    @Override
    public String Method448() {
        return "getuuid copy:<true/false> <player> <timeOutMillis(Optional)>";
    }

    private static String Method7282(String string) throws Exception {
        return DHzpocPNzjx2zpZIRy1vsm9XKKGwx1Ac.Method7559(string);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1150442278 ^ (long)1150442278);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-460269331 ^ (long)-460269550);
            int n2 = ((int)-14562004L ^ 0xFF21CD41) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1297051326L ^ 0xB2B0B741) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

