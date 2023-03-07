//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/client/PauseBaritone;", "Lcom/kisman/cc/features/module/Module;", "()V", "onEnable", "", "kisman.cc"})
public final class VzDK4ga0tCTR4TfBwzEI7Rgjzm2BKVfF
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field12289 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        if (VzDK4ga0tCTR4TfBwzEI7Rgjzm2BKVfF.Method4034().player != null && VzDK4ga0tCTR4TfBwzEI7Rgjzm2BKVfF.Method4034().world != null) {
            if (apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5990()) {
                apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5989();
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Successfully stopped baritone!");
            } else {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Baritone have any active processes!");
            }
        }
        super.Method21(((int)-1345136750L ^ 0xAFD2D792) != 0);
    }

    public VzDK4ga0tCTR4TfBwzEI7Rgjzm2BKVfF() {
        super("PauseBaritone", "Pauses current baritone process.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
    }

    public static final Minecraft Method4034() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4035(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1945369594L ^ 0x8C0C0406;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-723083630 ^ (long)-723083667);
            int n2 = (int)-1314300332L ^ 0xB1A95E43;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1718891650 ^ (long)-1718891377) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

