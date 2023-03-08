//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import baritone.api.*;
import org.jetbrains.annotations.*;
import baritone.api.process.*;
import baritone.api.behavior.*;
import net.minecraft.util.math.*;
import baritone.api.pathing.goals.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u00002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f\u001a\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f\u001a\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0006\u0010\u0014\u001a\u00020\u0007?\u0006\u0015" }, d2 = { "active", "", "baritone", "Lbaritone/api/IBaritone;", "goalProcess", "Lbaritone/api/process/ICustomGoalProcess;", "gotoPos", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "gotoXYZ", "x", "", "y", "z", "gotoXZ", "gotoXZInverted", "gotoY", "pathingBehavior", "Lbaritone/api/behavior/IPathingBehavior;", "stop", "kisman.cc" })
public final class Class1495
{
    private String Field14997 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public static final IBaritone Method5981() {
        final IBaritoneProvider provider = BaritoneAPI.getProvider();
        Intrinsics.checkExpressionValueIsNotNull((Object)provider, "BaritoneAPI.getProvider()");
        final IBaritone primaryBaritone = provider.getPrimaryBaritone();
        Intrinsics.checkExpressionValueIsNotNull((Object)primaryBaritone, "BaritoneAPI.getProvider().primaryBaritone");
        return primaryBaritone;
    }
    
    @NotNull
    @NotNull
    public static final ICustomGoalProcess Method5982() {
        final ICustomGoalProcess customGoalProcess = Method5981().getCustomGoalProcess();
        Intrinsics.checkExpressionValueIsNotNull((Object)customGoalProcess, "baritone().customGoalProcess");
        return customGoalProcess;
    }
    
    @NotNull
    @NotNull
    public static final IPathingBehavior Method5983() {
        final IPathingBehavior pathingBehavior = Method5981().getPathingBehavior();
        Intrinsics.checkExpressionValueIsNotNull((Object)pathingBehavior, "baritone().pathingBehavior");
        return pathingBehavior;
    }
    
    public static final void Method5984(final int n, final int n2) {
        Method5982().setGoalAndPath((Goal)new GoalXZ(n, n2));
    }
    
    public static final void Method5985(final int n, final int n2, final int n3) {
        Method5982().setGoalAndPath((Goal)new GoalBlock(new BlockPos(n, n2, n3)));
    }
    
    public static final void Method5986(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        Method5982().setGoalAndPath((Goal)new GoalBlock(blockPos));
    }
    
    public static final void Method5987(final int n) {
        Method5982().setGoalAndPath((Goal)new GoalYLevel(n));
    }
    
    public static final void Method5988(final int n, final int n2) {
        Method5982().setGoalAndPath((Goal)new GoalInverted((Goal)new GoalXZ(n, n2)));
    }
    
    public static final void Method5989() {
        Method5983().cancelEverything();
    }
    
    public static final boolean Method5990() {
        return Method5982().isActive();
    }
    
    private static String Method5991(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x60FA ^ 0x91));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
