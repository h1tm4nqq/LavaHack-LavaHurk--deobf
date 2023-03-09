//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1126;
import lavahack.client.Class115;
import lavahack.client.Class1703;
import lavahack.client.Class1861;
import lavahack.client.Class1917;
import lavahack.client.Class1989;
import lavahack.client.Class394;
import lavahack.client.Class44;
import lavahack.client.Class562;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$6", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "lastPos", "Lnet/minecraft/util/math/BlockPos;", "getLastPos", "()Lnet/minecraft/util/math/BlockPos;", "setLastPos", "(Lnet/minecraft/util/math/BlockPos;)V", "y", "", "getY", "()D", "setY", "(D)V", "getMotion", "Lcom/kisman/cc/features/module/movement/speed/util/Motion;", "onEnable", "", "update", "kisman.cc"})
public final class Class1712
implements Class1703 {
    @Nullable
    private BlockPos Field15904;
    private double Field15905 = 1.0;
    private String Field15906 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Nullable
    @Nullable
    public final BlockPos Method6552() {
        return this.Field15904;
    }

    public final void Method6553(@Nullable @Nullable BlockPos blockPos) {
        this.Field15904 = blockPos;
    }

    public final double Method6554() {
        return this.Field15905;
    }

    public final void Method6555(double d) {
        this.Field15905 = d;
    }

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        Class562 class562 = this.Method6556();
        EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        entityPlayerSP.setSprinting(true);
        KeyBinding keyBinding = Class2142.Field17803.gameSettings.keyBindForward;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindForward");
        if (!keyBinding.isKeyDown()) return;
        if (Class2142.Field17803.player.onGround) {
            Class44 class44 = Class1989.Field17152.Method7384();
            if (class44 == null) {
                Intrinsics.throwNpe();
            }
            if (class44.Method365() && class562 != null) {
                switch (Class1861.Field16557[class562.ordinal()]) {
                    case 1: {
                        Class2142.Field17803.player.motionX += Double.longBitsToDouble((long)32720456 ^ 0x3FB99999986ADFD2L);
                        break;
                    }
                    case 2: {
                        Class2142.Field17803.player.motionZ += Double.longBitsToDouble(4591870180066957722L);
                        break;
                    }
                    case 3: {
                        Class2142.Field17803.player.motionX -= Double.longBitsToDouble((long)1368875233 ^ 0x3FB99999C80EF97BL);
                        break;
                    }
                    case 4: {
                        Class2142.Field17803.player.motionZ -= Double.longBitsToDouble((long)1753293870 ^ 0x3FB99999F118BDB4L);
                        break;
                    }
                }
            }
            this.Field15905 = 1.0;
            Class394.Method1953();
            Class44 class442 = Class1989.Field17152.Method7376();
            if (class442 == null) {
                Intrinsics.throwNpe();
            }
            if (class442.Method365()) {
                Class115.Field8400.Field8401.Method6523(Class1126.Field13077, 2, Float.intBitsToFloat(1067869798));
            }
            Class2142.Field17803.player.jump();
            Class44 class443 = Class1989.Field17152.Method7380();
            if (class443 == null) {
                Intrinsics.throwNpe();
            }
            double d = Class1917.Method7154(class443.Method365(), Double.longBitsToDouble((long)1899740033 ^ 0x3FD2631FFB32B95FL));
            Class44 class444 = Class1989.Field17152.Method7388();
            if (class444 == null) {
                Intrinsics.throwNpe();
            }
            double d2 = d * class444.Method367();
            Class44 class445 = Class1989.Field17152.Method7389();
            if (class445 == null) {
                Intrinsics.throwNpe();
            }
            double[] dArray = Class1917.Method7150(d2 + (class445.Method365() ? Double.longBitsToDouble(0x3FD3333333333333L) : 0.0));
            Class2142.Field17803.player.motionX = dArray[0];
            Class2142.Field17803.player.motionZ = dArray[1];
            return;
        }
        Class44 class44 = Class1989.Field17152.Method7387();
        if (class44 == null) {
            Intrinsics.throwNpe();
        }
        if (class44.Method365()) {
            EntityPlayerSP entityPlayerSP2 = Class2142.Field17803.player;
            Class44 class446 = Class1989.Field17152.Method7386();
            if (class446 == null) {
                Intrinsics.throwNpe();
            }
            entityPlayerSP2.jumpMovementFactor = class446.Method368();
        }
        if (this.Field15905 == 1.0) {
            EntityPlayerSP entityPlayerSP3 = Class2142.Field17803.player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
            this.Field15905 = entityPlayerSP3.getPositionVector().y;
            return;
        }
        EntityPlayerSP entityPlayerSP4 = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
        if (entityPlayerSP4.getPositionVector().y < this.Field15905) {
            EntityPlayerSP entityPlayerSP5 = Class2142.Field17803.player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP5, (String)"mc.player");
            this.Field15905 = entityPlayerSP5.getPositionVector().y;
            Class2142.Field17803.player.motionX = 0.0;
            Class2142.Field17803.player.motionZ = 0.0;
            Class44 class447 = Class1989.Field17152.Method7376();
            if (class447 == null) {
                Intrinsics.throwNpe();
            }
            if (class447.Method365()) {
                Class394.Method1953();
            }
            Class115.Field8400.Field8401.Method6523(Class1126.Field13077, 2, Float.intBitsToFloat(1098907648));
            return;
        }
        EntityPlayerSP entityPlayerSP6 = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
        this.Field15905 = entityPlayerSP6.getPositionVector().y;
        Class44 class448 = Class1989.Field17152.Method7385();
        if (class448 == null) {
            Intrinsics.throwNpe();
        }
        if (!class448.Method365()) return;
        if (class562 == null) return;
        switch (Class1861.Field16558[class562.ordinal()]) {
            case 1: {
                Class2142.Field17803.player.motionX += Double.longBitsToDouble((long)987986868 ^ 0x3FC99999A37AE22EL);
                return;
            }
            case 2: {
                Class2142.Field17803.player.motionY += Double.longBitsToDouble((long)1657025519 ^ 0x3FC99999FB5DAA75L);
                return;
            }
            case 3: {
                Class2142.Field17803.player.motionX -= Double.longBitsToDouble(4596373779694328218L);
                return;
            }
            case 4: {
                Class2142.Field17803.player.motionY -= Double.longBitsToDouble(4596373779694328218L);
                return;
            }
        }
    }

    private final Class562 Method6556() {
        BlockPos blockPos = Class394.Method1921((Entity)Class2142.Field17803.player);
        if (Intrinsics.areEqual((Object)Class2142.Field17803.world.getBlockState(blockPos), (Object)Blocks.AIR) && this.Field15904 != null) {
            if (!(Intrinsics.areEqual((Object)blockPos, (Object)this.Field15904) ^ true)) return null;
            BlockPos blockPos2 = this.Field15904;
            if (Intrinsics.areEqual((Object)(blockPos2 != null ? blockPos2.add(0, 0, -1) : null), (Object)blockPos)) {
                return Class562.Field10395;
            }
            BlockPos blockPos3 = this.Field15904;
            if (Intrinsics.areEqual((Object)(blockPos3 != null ? blockPos3.add(0, 0, 1) : null), (Object)blockPos)) {
                return Class562.Field10393;
            }
            BlockPos blockPos4 = this.Field15904;
            if (Intrinsics.areEqual((Object)(blockPos4 != null ? blockPos4.add(1, 0, 0) : null), (Object)blockPos)) {
                return Class562.Field10392;
            }
            BlockPos blockPos5 = this.Field15904;
            if (!Intrinsics.areEqual((Object)(blockPos5 != null ? blockPos5.add(-1, 0, 0) : null), (Object)blockPos)) return null;
            return Class562.Field10394;
        }
        this.Field15904 = Class394.Method1921((Entity)Class2142.Field17803.player);
        return null;
    }

    Class1712() {
    }

    private static String Method6557(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 208;
            cArray2[n] = (char)(cArray[n] ^ (0x7DAB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

