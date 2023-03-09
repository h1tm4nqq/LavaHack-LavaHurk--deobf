//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.mojang.authlib.GameProfile;
import java.awt.Color;
import lavahack.client.Class1102;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class742
extends Class42 {
    public Class44 Field11133 = new Class44("SelfPop", (Class42)this, false);
    private Class44 Field11134 = new Class44("Angle", (Class42)this, false);
    private Class44 Field11135 = new Class44("AngleSpeed", (Class42)this, Double.longBitsToDouble(4639481672377565184L), 0.0, Double.longBitsToDouble((long)320148279 ^ 0x407F400013151337L), true);
    private Class44 Field11136 = new Class44("FadeSpeed", (Class42)this, Double.longBitsToDouble(4641240890982006784L), 0.0, Double.longBitsToDouble((long)1028469818 ^ 0x407F40003D4D343AL), true);
    private Class44 Field11137 = new Class44("Width", (Class42)this, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4592351369239484559L)) ^ 0x7FB34F3D2F4C588FL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1326479520 ^ 0x4006AF77A0E67D9EL)) ^ 0x7FE6AF77EFF6053EL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)58697526 ^ 0x3FC239EA0D21D5A7L)) ^ 0x7FD639EA0E5E7291L), false);
    private Class44 Field11138 = new Class44("ColorR", (Class42)this, 1.0, 0.0, 1.0, false);
    private Class44 Field11139 = new Class44("ColorG", (Class42)this, 1.0, 0.0, 1.0, false);
    private Class44 Field11140 = new Class44("ColorB", (Class42)this, 1.0, 0.0, 1.0, false);
    private Class44 Field11141 = new Class44("ColorA", (Class42)this, 1.0, 0.0, 1.0, false);
    private EntityOtherPlayerMP Field11142;
    private EntityPlayer Field11143;
    private Color Field11144;
    public long Field11145;
    public float Field11146;
    public long Field11147;
    public long Field11148;
    public float Field11149;
    private String Field11150 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class742() {
        super("PopCharms", "and?", Class97.Field8342);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11133);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11134);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11135);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11136);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11137);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11138);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11139);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11140);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field11141);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3066(Class1102 class1102) {
        if (!this.Field11133.Method365() && class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() == Class742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
            return;
        }
        if (!(class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() instanceof EntityPlayer)) {
            return;
        }
        this.Field11143 = (EntityPlayer)class1102.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        GameProfile gameProfile = new GameProfile(this.Field11143.getUniqueID(), "");
        this.Field11142 = new EntityOtherPlayerMP((World)Class742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, gameProfile);
        this.Field11142.copyLocationAndAnglesFrom((Entity)this.Field11143);
        this.Field11142.rotationYaw = this.Field11143.rotationYaw;
        this.Field11142.rotationYawHead = this.Field11143.rotationYawHead;
        this.Field11142.rotationPitch = this.Field11143.rotationPitch;
        this.Field11142.prevRotationPitch = this.Field11143.prevRotationPitch;
        this.Field11142.prevRotationYaw = this.Field11143.prevRotationYaw;
        this.Field11142.renderYawOffset = this.Field11143.renderYawOffset;
        this.Field11145 = System.currentTimeMillis();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3067(RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field11142 == null) return;
        if (this.Field11143 == null) {
            return;
        }
        this.Field11144 = new Color(255, 255, 255, 255);
        this.Field11146 = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2130059971)) ^ 0x7EF622C3);
        this.Field11147 = System.currentTimeMillis();
        this.Field11148 = this.Field11147 - this.Field11145;
        this.Field11149 = (float)this.Field11144.getAlpha() / Float.intBitsToFloat(1132396544);
        if (this.Field11148 < (long)(this.Field11136.Method335() * 10)) {
            this.Field11146 = this.Field11149 - (float)this.Field11148 / (float)(this.Field11136.Method335() * 10);
        }
        if (this.Field11148 >= (long)(this.Field11136.Method335() * 10)) return;
        GL11.glPushMatrix();
        if (this.Field11134.Method365()) {
            GlStateManager.translate((float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2126158493)) ^ 0x7EBA9A9D), (float)((float)this.Field11148 / (float)(this.Field11135.Method335() * 10)), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2137313146)) ^ 0x7F64CF7A));
        }
        Class742.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderEntityStatic((Entity)this.Field11142, Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1086660056)) ^ 0x7F451DD8), false);
        GlStateManager.translate((float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2137461605)) ^ 0x7F671365), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2103872223)) ^ 0x7D668ADF), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(2132032490)) ^ 0x7F143BEA));
        GL11.glPopMatrix();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 135;
            cArray2[n] = (char)(cArray[n] ^ (0x4ABC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

