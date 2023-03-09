//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.IBaritoneProvider
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalXZ
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.IBaritoneProvider;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalXZ;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/Debug/BaritoneTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "onEnable", "", "kisman.cc"})
public final class Class1203
extends Class42 {
    private String Field13452 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        if (Class1203.Method4835().player == null) return;
        if (Class1203.Method4835().world == null) {
            return;
        }
        IBaritoneProvider iBaritoneProvider = BaritoneAPI.getProvider();
        Intrinsics.checkExpressionValueIsNotNull((Object)iBaritoneProvider, (String)"BaritoneAPI.getProvider()");
        IBaritone iBaritone = iBaritoneProvider.getPrimaryBaritone();
        Intrinsics.checkExpressionValueIsNotNull((Object)iBaritone, (String)"BaritoneAPI.getProvider().primaryBaritone");
        iBaritone.getCustomGoalProcess().setGoalAndPath((Goal)new GoalXZ(1000, 1000));
    }

    public Class1203() {
        super("BaritoneTest", "Test of baritone", Class97.Field8345);
    }

    public static final Minecraft Method4835() {
        return Class42.Field8052;
    }

    public static final void Method4836(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 160;
            cArray2[n] = (char)(cArray[n] ^ (0x8A8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

