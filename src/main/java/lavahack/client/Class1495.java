/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.IBaritoneProvider
 *  baritone.api.behavior.IPathingBehavior
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalInverted
 *  baritone.api.pathing.goals.GoalXZ
 *  baritone.api.pathing.goals.GoalYLevel
 *  baritone.api.process.ICustomGoalProcess
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.IBaritoneProvider;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalInverted;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.process.ICustomGoalProcess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f\u001a\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0006\u0010\u0014\u001a\u00020\u0007\u00a8\u0006\u0015"}, d2={"active", "", "baritone", "Lbaritone/api/IBaritone;", "goalProcess", "Lbaritone/api/process/ICustomGoalProcess;", "gotoPos", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "gotoXYZ", "x", "", "y", "z", "gotoXZ", "gotoXZInverted", "gotoY", "pathingBehavior", "Lbaritone/api/behavior/IPathingBehavior;", "stop", "kisman.cc"})
public final class Class1495 {
    private String Field14997 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static final IBaritone Method5981() {
        IBaritoneProvider iBaritoneProvider = BaritoneAPI.getProvider();
        Intrinsics.checkExpressionValueIsNotNull((Object)iBaritoneProvider, (String)"BaritoneAPI.getProvider()");
        IBaritone iBaritone = iBaritoneProvider.getPrimaryBaritone();
        Intrinsics.checkExpressionValueIsNotNull((Object)iBaritone, (String)"BaritoneAPI.getProvider().primaryBaritone");
        return iBaritone;
    }

    @NotNull
    @NotNull
    public static final ICustomGoalProcess Method5982() {
        ICustomGoalProcess iCustomGoalProcess = Class1495.Method5981().getCustomGoalProcess();
        Intrinsics.checkExpressionValueIsNotNull((Object)iCustomGoalProcess, (String)"baritone().customGoalProcess");
        return iCustomGoalProcess;
    }

    @NotNull
    @NotNull
    public static final IPathingBehavior Method5983() {
        IPathingBehavior iPathingBehavior = Class1495.Method5981().getPathingBehavior();
        Intrinsics.checkExpressionValueIsNotNull((Object)iPathingBehavior, (String)"baritone().pathingBehavior");
        return iPathingBehavior;
    }

    public static final void Method5984(int n, int n2) {
        Class1495.Method5982().setGoalAndPath((Goal)new GoalXZ(n, n2));
    }

    public static final void Method5985(int n, int n2, int n3) {
        Class1495.Method5982().setGoalAndPath((Goal)new GoalBlock(new BlockPos(n, n2, n3)));
    }

    public static final void Method5986(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Class1495.Method5982().setGoalAndPath((Goal)new GoalBlock(blockPos));
    }

    public static final void Method5987(int n) {
        Class1495.Method5982().setGoalAndPath((Goal)new GoalYLevel(n));
    }

    public static final void Method5988(int n, int n2) {
        Class1495.Method5982().setGoalAndPath((Goal)new GoalInverted((Goal)new GoalXZ(n, n2)));
    }

    public static final void Method5989() {
        Class1495.Method5983().cancelEverything();
    }

    public static final boolean Method5990() {
        return Class1495.Method5982().isActive();
    }

    private static String Method5991(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 145;
            cArray2[n] = (char)(cArray[n] ^ (0x60FA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

