/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import lavahack.client.Class158;
import lavahack.client.Class2044;
import org.jetbrains.annotations.NotNull;

public class Class1962
extends Class158 {
    private int Field17036;

    public Class1962() {
        super("getuuid");
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        if (stringArray.length < 2) {
            this.Method438("Too few arguments");
            return;
        }
        long l = -1L;
        if (stringArray.length >= 3) {
            l = Long.parseLong(stringArray[2]);
        }
        boolean bl = stringArray[0].split(":")[1].equalsIgnoreCase("true");
        String string2 = stringArray[1];
        Long.compare(l, 0L);
        String string3 = Class2044.Method7559(string2);
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
        return Class2044.Method7559(string);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 218;
            cArray2[n] = (char)(cArray[n] ^ (0x4C06 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

