//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.util.math.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.item.*;

@Deprecated
public class Class766 extends Class42
{
    private double Field11239;
    private double Field11240;
    private double Field11241;
    private double Field11242;
    private double Field11243;
    private double Field11244;
    private double Field11245;
    private double Field11246;
    private double Field11247;
    private String Field11248 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class766() {
        super("TrajectoriesRewrite", Class97.Field8342);
        this.Field11242 = 0.0;
        this.Field11243 = 1.0;
        this.Field11244 = 0.0;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3157(final RenderWorldLastEvent renderWorldLastEvent) {
        final EntityPlayerSP player = Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
        if (player.inventory.getCurrentItem() != null && this.Method3160(player.inventory.getCurrentItem().getItem())) {
            this.Field11245 = player.lastTickPosX + (player.posX - player.lastTickPosX) * Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks - MathHelper.cos((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw)) * Float.intBitsToFloat(1042536202);
            this.Field11246 = Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosY + (Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosY) * Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks + Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight() - Double.longBitsToDouble((long)745640762 ^ 0x3FB9A35DB5E839D1L);
            this.Field11247 = Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosZ + (Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastTickPosZ) * Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks - MathHelper.sin((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw)) * Float.intBitsToFloat(1042536202);
            float intBitsToFloat = 1.0f;
            if (!(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() instanceof ItemBow)) {
                intBitsToFloat = Float.intBitsToFloat(1053609165);
            }
            this.Field11239 = -MathHelper.sin((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw)) * MathHelper.cos((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch)) * intBitsToFloat;
            this.Field11240 = MathHelper.cos((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw)) * MathHelper.cos((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch)) * intBitsToFloat;
            this.Field11241 = -MathHelper.sin((float)Math.toRadians(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch)) * intBitsToFloat;
            final double sqrt = Math.sqrt(this.Field11239 * this.Field11239 + this.Field11241 * this.Field11241 + this.Field11240 * this.Field11240);
            this.Field11239 /= sqrt;
            this.Field11241 /= sqrt;
            this.Field11240 /= sqrt;
            if (Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() instanceof ItemBow) {
                final float n = (72000 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseCount()) / Float.intBitsToFloat(1101004800);
                float n2 = (n * n + n * 2.0f) / Float.intBitsToFloat(1077936128);
                if (n2 > 1.0f) {
                    n2 = 1.0f;
                }
                if (n2 <= Float.intBitsToFloat(1036831949)) {
                    n2 = 1.0f;
                }
                final float n3 = n2 * 2.0f * Float.intBitsToFloat(1069547520);
                this.Field11239 *= n3;
                this.Field11241 *= n3;
                this.Field11240 *= n3;
            }
            else {
                this.Field11239 *= Double.longBitsToDouble(4609434218613702656L);
                this.Field11241 *= Double.longBitsToDouble(4609434218613702656L);
                this.Field11240 *= Double.longBitsToDouble(4609434218613702656L);
            }
            final Vec3d vec3d = new Vec3d(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            GL11.glPushMatrix();
            this.Method20();
            GL11.glLineWidth(Float.intBitsToFloat(1072064102));
            GL11.glColor3d(this.Field11242, this.Field11243, this.Field11244);
            GL11.glBegin(3);
            final double method3159 = this.Method3159(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem());
            int n4 = 0;
            while (true) {
                GL11.glVertex3d(this.Field11245 * 1.0 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX, this.Field11246 * 1.0 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY, this.Field11247 * 1.0 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ);
                this.Field11245 += this.Field11239;
                this.Field11246 += this.Field11241;
                this.Field11247 += this.Field11240;
                this.Field11239 *= Double.longBitsToDouble((long)1900998420 ^ 0x3FEFAE140BAFA8BAL);
                this.Field11241 *= Double.longBitsToDouble((long)2120782677 ^ 0x3FEFAE140489D4FBL);
                this.Field11240 *= Double.longBitsToDouble(4607092346807469998L);
                this.Field11241 -= method3159;
                if (Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, new Vec3d(this.Field11245, this.Field11246, this.Field11247)) != null) {
                    break;
                }
                ++n4;
            }
            GL11.glEnd();
            GL11.glTranslated(this.Field11245 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX, this.Field11246 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY, this.Field11247 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ);
            GL11.glRotatef(Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, 0.0f, (float)(this.Field11246 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY), 0.0f);
            GL11.glTranslated(-(this.Field11245 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosX), -(this.Field11246 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosY), -(this.Field11247 - Class766.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.renderPosZ));
            this.Method3158();
            GL11.glPopMatrix();
        }
    }
    
    public void Method20() {
        GL11.glDisable(2896);
        GL11.glEnable(2848);
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glEnable(32925);
        GL11.glDepthMask(false);
    }
    
    public void Method3158() {
        GL11.glDisable(3042);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(32925);
        GL11.glDepthMask(true);
        GL11.glDisable(2848);
        GL11.glEnable(2896);
    }
    
    private double Method3159(final Item item) {
        return (item instanceof ItemBow) ? Double.longBitsToDouble(4587366580439587226L) : Double.longBitsToDouble(4584304132692975288L);
    }
    
    private boolean Method3160(final Item item) {
        return item instanceof ItemBow || item instanceof ItemSnowball || item instanceof ItemEgg || item instanceof ItemEnderPearl;
    }
    
    public void Method3161(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        GL11.glVertex3d((double)n, (double)n2, (double)n3);
        GL11.glVertex3d((double)n4, (double)n5, (double)n6);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x42F8 ^ 0x21));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
