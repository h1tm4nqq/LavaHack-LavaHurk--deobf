//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.mmeg18oY4uIMDyPf1InyU6fi9CsvOLTd;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@mmeg18oY4uIMDyPf1InyU6fi9CsvOLTd(parents={"AutoRer"})
@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0006\u0010\u0018\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/features/module/combat/Crystals;", "Lcom/kisman/cc/features/module/Module;", "()V", "debug", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "pos", "Lnet/minecraft/util/math/BlockPos;", "getPos", "()Lnet/minecraft/util/math/BlockPos;", "setPos", "(Lnet/minecraft/util/math/BlockPos;)V", "state", "", "getState", "()Z", "setState", "(Z)V", "onDisable", "", "onEnable", "onLeftClickBlock", "event", "Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$LeftClickBlock;", "reset", "kisman.cc"})
public final class GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12829;
    @Nullable
    private static BlockPos Field12830;
    private static boolean Field12831;
    public static final GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2 Field12832;
    private String Field12833 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Nullable
    @Nullable
    public final BlockPos Method4368() {
        return Field12830;
    }

    public final void Method4369(@Nullable @Nullable BlockPos blockPos) {
        Field12830 = blockPos;
    }

    public final boolean Method27() {
        return Field12831;
    }

    public final void Method4370(boolean bl) {
        Field12831 = bl;
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Method4371();
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Method4371();
    }

    public final void Method4371() {
        Field12830 = null;
        Field12831 = (int)-1281017576L ^ 0xB3A53918;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4372(@NotNull @NotNull PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        Intrinsics.checkParameterIsNotNull((Object)leftClickBlock, (String)"event");
        IBlockState iBlockState = GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2.Method4373().world.getBlockState(leftClickBlock.getPos());
        if (!Intrinsics.areEqual((Object)iBlockState, (Object)Blocks.OBSIDIAN)) {
            if (!Intrinsics.areEqual((Object)iBlockState, (Object)Blocks.BEDROCK)) return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field12829;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"debug");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            String string = "meow2 its obby or bebrock";
            int n = (int)32193344L ^ 0x1EB3B40;
            System.out.println((Object)string);
        }
        Field12830 = leftClickBlock.getPos();
        Field12831 = (int)498953128L ^ 0x1DBD6BA9;
    }

    private GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2() {
        super("Crystals", "Changes place of of AutoRer if he have no valid place pos. Useful for breaking surround.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    static {
        GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2 gSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2;
        Field12832 = gSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2 = new GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2();
        Field12829 = gSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Debug", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)gSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2, (boolean)((long)-1048122528 ^ (long)-1048122527)));
    }

    public static final Minecraft Method4373() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4374(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1305147600L ^ 0xB2350730;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1692898045L ^ 0x9B186DFC);
            int n2 = (int)1081296861L ^ 0x407347CE;
            cArray2[n] = (char)(cArray[n] ^ ((int)230496154L ^ 0xDBD5431 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

