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
import lavahack.client.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class H4RaeciKTdlDqjKK7pb6HPKsZrN3tup5
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11133 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SelfPop", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2059918875 ^ (long)2059918875));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11134 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Angle", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-701885320 ^ (long)-701885320));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11135 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AngleSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x3BEC26BC48261752L ^ 0x7B8EE6BC48261752L), 0.0, Double.longBitsToDouble((long)320148279 ^ 0x407F400013151337L), (boolean)((long)-1852539595 ^ (long)-1852539596));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11136 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FadeSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x953176A0E5FA4F4AL ^ 0xD55876A0E5FA4F4AL), 0.0, Double.longBitsToDouble((long)1028469818 ^ 0x407F40003D4D343AL), (boolean)((long)-2055088808 ^ (long)-2055088807));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11137 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x3E0860F035413C79L ^ 0x1B32FCD1A0D64F6L)) ^ 0x7FB34F3D2F6C58CFL & 0x7FB34F3D2FCCFAAFL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1326479520 ^ 0x4006AF77A0E67D9EL)) ^ 0x7FE6AF77EFF6053EL & 0x7FE6AF77EFFF07FEL), Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)58697526 ^ 0x3FC239EA0D21D5A7L)) ^ 0x7FD639EA0F5E77B9L & 0x7FD639EA5E5EF291L), (boolean)((long)-560805833 ^ (long)-560805833));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11138 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ColorR", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, (boolean)((long)-231207553 ^ (long)-231207553));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11139 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ColorG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, (boolean)((long)58501961 ^ (long)58501961));
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11140 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ColorB", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)-934405643L ^ 0xC84E19F5) != 0);
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11141 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ColorA", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, (boolean)((long)-1506503828 ^ (long)-1506503828));
    private EntityOtherPlayerMP Field11142;
    private EntityPlayer Field11143;
    private Color Field11144;
    public long Field11145;
    public float Field11146;
    public long Field11147;
    public long Field11148;
    public float Field11149;
    private String Field11150 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public H4RaeciKTdlDqjKK7pb6HPKsZrN3tup5() {
        super("PopCharms", "and?", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
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
    public void Method3066(BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh brWsHdiLAwYGSB35z3ypQAx8eRulUOBh) {
        if (!this.Field11133.Method365() && brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() == H4RaeciKTdlDqjKK7pb6HPKsZrN3tup5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
            return;
        }
        if (!(brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() instanceof EntityPlayer)) {
            return;
        }
        this.Field11143 = (EntityPlayer)brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        GameProfile gameProfile = new GameProfile(this.Field11143.getUniqueID(), "");
        this.Field11142 = new EntityOtherPlayerMP((World)H4RaeciKTdlDqjKK7pb6HPKsZrN3tup5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, gameProfile);
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
        this.Field11144 = new Color((int)((long)57531372 ^ (long)57531155), (int)1557398208L ^ 0x5CD4023F, (int)-1306855887L ^ 0xB21AF6CE, (int)((long)2143356843 ^ (long)2143356756));
        this.Field11146 = Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)((long)220279075 ^ (long)1943475168))) ^ (int)((long)942761405 ^ (long)1187465086));
        this.Field11147 = System.currentTimeMillis();
        this.Field11148 = this.Field11147 - this.Field11145;
        this.Field11149 = (float)this.Field11144.getAlpha() / Float.intBitsToFloat((int)((long)1811613497 ^ (long)679741241));
        if (this.Field11148 < (long)(this.Field11136.Method335() * ((int)((long)-1277646857 ^ (long)-1277646862) << 1))) {
            this.Field11146 = this.Field11149 - (float)this.Field11148 / (float)(this.Field11136.Method335() * ((int)((long)-554616278 ^ (long)-554616273) << 1));
        }
        if (this.Field11148 >= (long)(this.Field11136.Method335() * (((int)1992558981L ^ 0x76C40980) << 1))) return;
        GL11.glPushMatrix();
        if (this.Field11134.Method365()) {
            GlStateManager.translate((float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)1991872977L ^ 0x8030B4C)) ^ ((int)-1342098623L ^ 0xCEBBA9DC)), (float)((float)this.Field11148 / (float)(this.Field11135.Method335() * (((int)1038724904L ^ 0x3DE9AF2D) << 1))), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)885460626L ^ 0x4BA3C1E8)) ^ (int)((long)-498035344 ^ (long)-572329267) << 1));
        }
        H4RaeciKTdlDqjKK7pb6HPKsZrN3tup5.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderEntityStatic((Entity)this.Field11142, Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)((long)1804693592 ^ (long)726953344))) ^ ((int)649342844L ^ 0x295C8CC7) << 3), ((int)1096444180L ^ 0x415A6914) != 0);
        GlStateManager.translate((float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)2086376272L ^ 0x33C8035)) ^ (int)((long)1481833039 ^ (long)657844522)), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)740222775L ^ 0x51786DE8)) ^ (int)((long)1105506600 ^ (long)1015167991)), (float)Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)((long)1953838312 ^ (long)190910210))) ^ (int)((long)1282280947 ^ (long)1944326150) << 1));
        GL11.glPopMatrix();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-954415898L ^ 0xC71CC4E6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1923192752 ^ (long)-1923192657);
            int n2 = (int)124833893L ^ 0x770D0E2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1018630923 ^ (long)1018626468) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

