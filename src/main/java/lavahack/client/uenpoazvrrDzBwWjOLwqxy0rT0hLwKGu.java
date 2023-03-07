//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.GBxhTiWnr4BHCPe0SbG4zKhj9Z9uTrP4;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.uenpoazvrrDzBwWjOLwqxy0rT0hLwKGu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

public class uenpoazvrrDzBwWjOLwqxy0rT0hLwKGu
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private long Field10542 = 0L;
    private int Field10543;

    public uenpoazvrrDzBwWjOLwqxy0rT0hLwKGu() {
        super("EventSystemTest", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @GBxhTiWnr4BHCPe0SbG4zKhj9Z9uTrP4
    @GBxhTiWnr4BHCPe0SbG4zKhj9Z9uTrP4
    public void Method2582(uenpoazvrrDzBwWjOLwqxy0rT0hLwKGu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi uenpoazvrrDzBwWjOLwqxy0rT0hLwKGu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        if (uenpoazvrrDzBwWjOLwqxy0rT0hLwKGu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (uenpoazvrrDzBwWjOLwqxy0rT0hLwKGu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("Ticks passed" + this.Field10542++);
    }

    @Override
    public void Method45() {
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1500709965 ^ (long)-1500709965);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1547902206L ^ 0xA3BCE3FD);
            int n2 = (int)408014952L ^ 0x1851D0E9;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-752340364 ^ (long)-752340651) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

