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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.Ffcv07tLImFck2OjGznu2fLGW0hkgJEV;
import lavahack.client.I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO;
import lavahack.client.J7H41tMidXYmXODs8Hate12YWxlVbQWi;
import lavahack.client.KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l;
import lavahack.client.ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$6", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "lastPos", "Lnet/minecraft/util/math/BlockPos;", "getLastPos", "()Lnet/minecraft/util/math/BlockPos;", "setLastPos", "(Lnet/minecraft/util/math/BlockPos;)V", "y", "", "getY", "()D", "setY", "(D)V", "getMotion", "Lcom/kisman/cc/features/module/movement/speed/util/Motion;", "onEnable", "", "update", "kisman.cc"})
public final class aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$6
implements KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l {
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
        sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt2 = this.Method6556();
        EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        entityPlayerSP.setSprinting((boolean)((long)-1108694423 ^ (long)-1108694424));
        KeyBinding keyBinding = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.keyBindForward;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindForward");
        if (!keyBinding.isKeyDown()) return;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.onGround) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7384();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
                Intrinsics.throwNpe();
            }
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt2 != null) {
                switch (J7H41tMidXYmXODs8Hate12YWxlVbQWi.Field16557[sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt2.ordinal()]) {
                    case 1: {
                        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX += Double.longBitsToDouble((long)32720456 ^ 0x3FB99999986ADFD2L);
                        break;
                    }
                    case 2: {
                        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionZ += Double.longBitsToDouble(0x3072F411B678672L ^ 0x3CBEB6D882FE1FE8L);
                        break;
                    }
                    case 3: {
                        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX -= Double.longBitsToDouble((long)1368875233 ^ 0x3FB99999C80EF97BL);
                        break;
                    }
                    case 4: {
                        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionZ -= Double.longBitsToDouble((long)1753293870 ^ 0x3FB99999F118BDB4L);
                        break;
                    }
                }
            }
            this.Field15905 = 1.0;
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7376();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 == null) {
                Intrinsics.throwNpe();
            }
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Field8401.Method6523(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.Field13077, ((int)1676169744L ^ 0x63E85211) << 1, Float.intBitsToFloat((int)((long)1890307623 ^ (long)1326295105)));
            }
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.jump();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7380();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 == null) {
                Intrinsics.throwNpe();
            }
            double d = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365(), Double.longBitsToDouble((long)1899740033 ^ 0x3FD2631FFB32B95FL));
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7388();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 == null) {
                Intrinsics.throwNpe();
            }
            double d2 = d * qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method367();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7389();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 == null) {
                Intrinsics.throwNpe();
            }
            double[] dArray = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7150(d2 + (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365() ? Double.longBitsToDouble(0xE3D39769B304D61EL ^ 0xDC00A45A8037E52DL) : 0.0));
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX = dArray[(int)((long)-807761309 ^ (long)-807761309)];
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionZ = dArray[(int)1444530103L ^ 0x5619C7B6];
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7387();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 == null) {
            Intrinsics.throwNpe();
        }
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method365()) {
            EntityPlayerSP entityPlayerSP2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7386();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 == null) {
                Intrinsics.throwNpe();
            }
            entityPlayerSP2.jumpMovementFactor = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method368();
        }
        if (this.Field15905 == 1.0) {
            EntityPlayerSP entityPlayerSP3 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
            this.Field15905 = entityPlayerSP3.getPositionVector().y;
            return;
        }
        EntityPlayerSP entityPlayerSP4 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
        if (entityPlayerSP4.getPositionVector().y < this.Field15905) {
            EntityPlayerSP entityPlayerSP5 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP5, (String)"mc.player");
            this.Field15905 = entityPlayerSP5.getPositionVector().y;
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX = 0.0;
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionZ = 0.0;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7376();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 == null) {
                Intrinsics.throwNpe();
            }
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method365()) {
                EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
            }
            I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Field8401.Method6523(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.Field13077, ((int)-1284933781L ^ 0xB369776A) << 1, Float.intBitsToFloat((int)((long)1435373868 ^ (long)336466220)));
            return;
        }
        EntityPlayerSP entityPlayerSP6 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
        this.Field15905 = entityPlayerSP6.getPositionVector().y;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7385();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 == null) {
            Intrinsics.throwNpe();
        }
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method365()) return;
        if (sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt2 == null) return;
        switch (J7H41tMidXYmXODs8Hate12YWxlVbQWi.Field16558[sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt2.ordinal()]) {
            case 1: {
                Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX += Double.longBitsToDouble((long)987986868 ^ 0x3FC99999A37AE22EL);
                return;
            }
            case 2: {
                Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionY += Double.longBitsToDouble((long)1657025519 ^ 0x3FC99999FB5DAA75L);
                return;
            }
            case 3: {
                Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX -= Double.longBitsToDouble(0xCD6F942464E6AB87L ^ 0xF2A60DBDFD7F321DL);
                return;
            }
            case 4: {
                Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionY -= Double.longBitsToDouble(0x7C4FC64A0918880AL ^ 0x43865FD390811190L);
                return;
            }
        }
    }

    private final sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt Method6556() {
        BlockPos blockPos = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player);
        if (Intrinsics.areEqual((Object)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos), (Object)Blocks.AIR) && this.Field15904 != null) {
            if ((Intrinsics.areEqual((Object)blockPos, (Object)this.Field15904) ^ (int)((long)160575545 ^ (long)160575544)) == 0) return null;
            BlockPos blockPos2 = this.Field15904;
            if (Intrinsics.areEqual(blockPos2 != null ? blockPos2.add((int)((long)1317734885 ^ (long)1317734885), (int)((long)-615622157 ^ (long)-615622157), (int)-2044545122L ^ 0x79DD4861) : null, (Object)blockPos)) {
                return sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt.Field10395;
            }
            BlockPos blockPos3 = this.Field15904;
            if (Intrinsics.areEqual(blockPos3 != null ? blockPos3.add((int)((long)894206671 ^ (long)894206671), (int)-1624362805L ^ 0x9F2E30CB, (int)((long)130175821 ^ (long)130175820)) : null, (Object)blockPos)) {
                return sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt.Field10393;
            }
            BlockPos blockPos4 = this.Field15904;
            if (Intrinsics.areEqual(blockPos4 != null ? blockPos4.add((int)1369846216L ^ 0x51A631C9, (int)-214078996L ^ 0xF33D69EC, (int)-754251997L ^ 0xD30B0723) : null, (Object)blockPos)) {
                return sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt.Field10392;
            }
            BlockPos blockPos5 = this.Field15904;
            if (!Intrinsics.areEqual(blockPos5 != null ? blockPos5.add((int)((long)-493263861 ^ (long)493263860), (int)-2005885798L ^ 0x88709C9A, (int)-290418721L ^ 0xEEB08FDF) : null, (Object)blockPos)) return null;
            return sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt.Field10394;
        }
        this.Field15904 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player);
        return null;
    }

    aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$6() {
    }

    private static String Method6557(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-344867450 ^ (long)-344867450);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1192963971 ^ (long)1192963964);
            int n2 = ((int)422841077L ^ 0x19340AF8) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1823976816L ^ 0x93482F3B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

