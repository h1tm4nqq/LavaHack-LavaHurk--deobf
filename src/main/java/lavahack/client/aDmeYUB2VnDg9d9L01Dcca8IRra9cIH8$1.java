//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.entity.EntityPlayerSP
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import lavahack.client.KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2={"com/kisman/cc/features/module/movement/speed/SpeedModes$1", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "onEnable", "", "update", "kisman.cc"})
public final class aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$1
implements KERrE2LuaTOrvMyD8cdKgzP1mK1VMR0l {
    private String Field15917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method6529() {
    }

    @Override
    public void Method6530() {
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.hurtTime >= ((int)1120436458L ^ 0x42C880EF)) return;
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.onGround) {
            Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionY = Double.longBitsToDouble(0xFC4FC63C15893760L ^ 0xC3962DB90B31668CL);
            float f = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7160();
            EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
            double d = entityPlayerSP.motionX;
            EntityPlayerSP entityPlayerSP2 = entityPlayerSP;
            int n = (int)((long)288776971 ^ (long)288776971);
            float f2 = (float)Math.sin(f);
            entityPlayerSP2.motionX = d - (double)f2 * Double.longBitsToDouble((long)886047033 ^ 0x3FC99999AD4998A3L);
            EntityPlayerSP entityPlayerSP3 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
            d = entityPlayerSP3.motionZ;
            entityPlayerSP2 = entityPlayerSP3;
            n = (int)((long)182540372 ^ (long)182540372);
            f2 = (float)Math.cos(f);
            entityPlayerSP2.motionZ = d + (double)f2 * Double.longBitsToDouble((long)947573513 ^ 0x3FC99999A1E34A93L);
            return;
        }
        double d = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX * Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionX + Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionZ * Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.motionZ;
        int n = (int)771101054L ^ 0x2DF6117E;
        double d2 = Math.sqrt(d);
        float f = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYawHead - Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw;
        int n2 = (int)((long)-844858181 ^ (long)-844858181);
        d = Math.abs(f) < (float)((int)((long)-1861288684 ^ (long)-1861288647) << 1) ? Double.longBitsToDouble(0xA1C791DA79313864L ^ 0x9E378BEC9BDA2427L) : Double.longBitsToDouble(0x2B793AB9910BD688L ^ 0x14893EA1027F6AE2L);
        f = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7160();
        EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        n2 = (int)((long)-2093602471 ^ (long)-2093602471);
        float f3 = (float)Math.sin(f);
        entityPlayerSP.motionX = (double)(-f3) * d * d2;
        entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        n2 = (int)-2065022855L ^ 0x84EA4079;
        f3 = (float)Math.cos(f);
        entityPlayerSP.motionY = (double)f3 * d * d2;
    }

    aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8$1() {
    }
}

