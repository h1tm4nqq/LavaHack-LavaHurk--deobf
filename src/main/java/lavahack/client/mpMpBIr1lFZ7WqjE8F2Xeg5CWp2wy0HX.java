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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/Debug/BaritoneTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "onEnable", "", "kisman.cc"})
public final class mpMpBIr1lFZ7WqjE8F2Xeg5CWp2wy0HX
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field13452 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        if (mpMpBIr1lFZ7WqjE8F2Xeg5CWp2wy0HX.Method4835().player == null) return;
        if (mpMpBIr1lFZ7WqjE8F2Xeg5CWp2wy0HX.Method4835().world == null) {
            return;
        }
        IBaritoneProvider iBaritoneProvider = BaritoneAPI.getProvider();
        Intrinsics.checkExpressionValueIsNotNull((Object)iBaritoneProvider, (String)"BaritoneAPI.getProvider()");
        IBaritone iBaritone = iBaritoneProvider.getPrimaryBaritone();
        Intrinsics.checkExpressionValueIsNotNull((Object)iBaritone, (String)"BaritoneAPI.getProvider().primaryBaritone");
        iBaritone.getCustomGoalProcess().setGoalAndPath((Goal)new GoalXZ((int)((long)-711245452 ^ (long)-711245559) << 3, ((int)-1661383002L ^ 0x9CF94EDB) << 3));
    }

    public mpMpBIr1lFZ7WqjE8F2Xeg5CWp2wy0HX() {
        super("BaritoneTest", "Test of baritone", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    public static final Minecraft Method4835() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4836(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)115253820 ^ (long)115253820);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1468673496 ^ (long)1468673319);
            int n2 = (int)((long)-1188223677 ^ (long)-1188223674) << 5;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1845439047L ^ 0x9200D4AC) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

