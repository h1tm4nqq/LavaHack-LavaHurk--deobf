//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.BlockShulkerBox
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class2155;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.block.BlockShulkerBox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/features/module/misc/AntiRegear;", "Lcom/kisman/cc/features/module/Module;", "()V", "breakQueue", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "oldSlot", "", "getOldSlot", "()I", "setOldSlot", "(I)V", "range", "Lcom/kisman/cc/settings/Setting;", "getRange", "()Lcom/kisman/cc/settings/Setting;", "switchToPick", "update", "", "kisman.cc"})
public final class Class1104
extends Class42 {
    @NotNull
    private final Class44 Field12980 = new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble((long)1414134738 ^ 0x401800005449FBD2L), true);
    private final Class44 Field12981 = new Class44("Switch To Pick", (Class42)this, true);
    private int Field12982 = -1;
    private final ArrayList Field12983 = new ArrayList();
    private String Field12984 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class44 Method4520() {
        return this.Field12980;
    }

    public final int Method4521() {
        return this.Field12982;
    }

    public final void Method4522(int n) {
        this.Field12982 = n;
    }

    @Override
    public void Method45() {
        Object object2;
        if (Class1104.Method4523().player == null) return;
        if (Class1104.Method4523().world == null) {
            return;
        }
        if (this.Field12983.isEmpty() && this.Field12982 != -1) {
            EntityPlayerSP entityPlayerSP = Class1104.Method4523().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (entityPlayerSP.getHeldItemMainhand().item instanceof ItemPickaxe && this.Field12981.Method365()) {
                Class1393.Method5505().Method1886("Switching back to original slot.");
                Class9.Method110(this.Field12982, false);
                this.Field12982 = -1;
            }
        }
        for (Object object2 : Class2155.Method7756((Entity)Class1104.Method4523().player, this.Field12980.Method368(), false, true)) {
            IBlockState iBlockState = Class1104.Method4523().world.getBlockState((BlockPos)object2);
            Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
            if (!(iBlockState.getBlock() instanceof BlockShulkerBox) || this.Field12983.contains(object2)) continue;
            this.Field12983.add(object2);
        }
        object2 = this.Field12983;
        boolean bl = false;
        if (object2.isEmpty()) return;
    }

    public Class1104() {
        super("AntiRegear", "Breaks shulkers for you.", Class97.Field8343);
    }

    public static final Minecraft Method4523() {
        return Class42.Field8052;
    }

    public static final void Method4524(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 248;
            cArray2[n] = (char)(cArray[n] ^ (0x70D5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

