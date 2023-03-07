//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.Ffcv07tLImFck2OjGznu2fLGW0hkgJEV;
import lavahack.client.I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO;
import lavahack.client.KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l;
import lavahack.client.aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$3", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "boost", "", "getBoost", "()Z", "setBoost", "(Z)V", "distance", "", "getDistance", "()D", "setDistance", "(D)V", "speed", "getSpeed", "setSpeed", "stage", "", "getStage", "()I", "setStage", "(I)V", "onEnable", "", "update", "kisman.cc"})
public final class aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$3
implements KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l {
    private int Field15909 = ((int)-442718777L ^ 0xE59CA5C6) << 2;
    private double Field15910;
    private double Field15911;
    private boolean Field15912;
    private int Field15913;

    public final int Method6560() {
        return this.Field15909;
    }

    public final void Method6561(int n) {
        this.Field15909 = n;
    }

    public final double Method6562() {
        return this.Field15910;
    }

    public final void Method6563(double d) {
        this.Field15910 = d;
    }

    public final double Method6564() {
        return this.Field15911;
    }

    public final void Method6565(double d) {
        this.Field15911 = d;
    }

    public final boolean Method6566() {
        return this.Field15912;
    }

    public final void Method6567(boolean bl) {
        this.Field15912 = bl;
    }

    @Override
    public void Method6529() {
        this.Field15909 = (int)((long)1167493206 ^ (long)1167493207) << 2;
        this.Field15911 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7157();
        this.Field15910 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7153();
    }

    @Override
    public void Method6530() {
        double d;
        EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isElytraFlying()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7376();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
            Intrinsics.throwNpe();
        }
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Method837((int)((long)1030785701 ^ (long)1030785752) << 1)) {
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)((long)1472072177 ^ (long)1748325437)));
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7383();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 == null) {
            Intrinsics.throwNpe();
        }
        if (!I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Method837(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335())) {
            return;
        }
        switch (this.Field15909) {
            case 1: {
                if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) break;
                double d2 = Double.longBitsToDouble(0x4ADA96B749AE82BBL ^ 0x752F0F2ED0371B21L);
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7380();
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 == null) {
                    Intrinsics.throwNpe();
                }
                boolean bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7379();
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 == null) {
                    Intrinsics.throwNpe();
                }
                this.Field15910 = d2 * o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(bl, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method367()) - Double.longBitsToDouble(0xC5AB0BDFE3EF8639L ^ 0xFA2F713EA4419242L);
                break;
            }
            case 2: {
                if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159() || !Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.onGround) break;
                Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionY = Double.longBitsToDouble((long)433985284 ^ 0x3FD997F632B4F0D1L) + o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7155();
                this.Field15910 *= this.Field15912 ? Double.longBitsToDouble((long)555842640 ^ 0x3FFAEF9D930C7206L) : Double.longBitsToDouble((long)19448368 ^ 0x3FF651EB84367A62L);
                break;
            }
            case 3: {
                double d3 = Double.longBitsToDouble(0xB291BC801992A604L ^ 0x8D74A2384879231BL);
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7380();
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 == null) {
                    Intrinsics.throwNpe();
                }
                boolean bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7379();
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 == null) {
                    Intrinsics.throwNpe();
                }
                this.Field15910 = this.Field15911 - d3 * (this.Field15911 - o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(bl, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method367()));
                this.Field15912 = !this.Field15912 ? (int)1919680515L ^ 0x726C0002 : (int)-104674859L ^ 0xF9C2C9D5;
                break;
            }
            default: {
                WorldClient worldClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world;
                EntityPlayerSP entityPlayerSP2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
                if ((worldClient.getCollisionBoxes(null, entityPlayerSP2.getEntityBoundingBox().offset(0.0, Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionY, 0.0)).size() > 0 || Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.collidedHorizontally) && this.Field15909 > 0) {
                    this.Field15909 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159() ? (int)((long)-2035363898 ^ (long)-2035363897) : (int)1965099066L ^ 0x7521083A;
                }
                this.Field15910 = this.Field15911 - this.Field15911 / (double)((int)-1785148864L ^ 0x9598CADF);
            }
        }
        double d4 = this.Field15910;
        double d5 = aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8.Field12102.Method6679();
        aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$3 aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$3 = this;
        int n = (int)1898429484L ^ 0x7127BC2C;
        aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$3.Field15910 = d = Math.min(d4, d5);
        d4 = this.Field15910;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7380();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 == null) {
            Intrinsics.throwNpe();
        }
        boolean bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method365();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Field17152.Method7379();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 == null) {
            Intrinsics.throwNpe();
        }
        d5 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(bl, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method367());
        aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$3 = this;
        n = (int)1925241142L ^ 0x72C0D936;
        aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$3.Field15910 = d = Math.max(d4, d5);
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7158((float)this.Field15910);
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
        int n2 = this.Field15909;
        this.Field15909 = n2 + ((int)-902710997L ^ 0xCA31B92A);
    }

    aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$3() {
    }

    private static String Method6568(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1086005500L ^ 0x40BB20FC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1612318654L ^ 0x9FE5F8BD);
            int n2 = ((int)753828614L ^ 0x2CEE830D) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)-971576752L ^ 0xC616EC25) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

