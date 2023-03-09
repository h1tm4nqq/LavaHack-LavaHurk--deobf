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
import lavahack.client.Class1393;
import lavahack.client.Class1495;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/client/PauseBaritone;", "Lcom/kisman/cc/features/module/Module;", "()V", "onEnable", "", "kisman.cc"})
public final class Class997
extends Class42 {
    private String Field12289 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        if (Class997.Method4034().player != null && Class997.Method4034().world != null) {
            if (Class1495.Method5990()) {
                Class1495.Method5989();
                Class1393.Method5503().Method1886("Successfully stopped baritone!");
            } else {
                Class1393.Method5504().Method1886("Baritone have any active processes!");
            }
        }
        super.Method21(false);
    }

    public Class997() {
        super("PauseBaritone", "Pauses current baritone process.", Class97.Field8339);
    }

    public static final Minecraft Method4034() {
        return Class42.Field8052;
    }

    public static final void Method4035(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 23;
            cArray2[n] = (char)(cArray[n] ^ (0x1FC4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

