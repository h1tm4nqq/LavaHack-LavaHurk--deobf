//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import java.util.*;
import net.minecraftforge.client.event.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import java.text.*;
import net.minecraft.client.renderer.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Class794
@Class1887
public class Class1819 extends Class42
{
    private final Class44 Field16360;
    private final Class44 Field16361;
    private final Class44 Field16362;
    private final Class44 Field16363;
    private final Class44 Field16364;
    private final Class44 Field16365;
    private final Class44 Field16366;
    private final HashMap Field16367;
    private final List Field16368;
    private String Field16369 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1819() {
        super("DamageESP", "Thank you, gerald(man)", Class97.Field8342);
        this.Field16360 = this.Method23(new Class44("Time To Remove", this, Double.longBitsToDouble((long)1988176670 ^ 0x4008000076812B1EL), 1.0, Double.longBitsToDouble((long)353911363 ^ 0x4014000015184243L), true));
        this.Field16361 = this.Method23(new Class44("Range", this, Double.longBitsToDouble(4626322717216342016L), 1.0, Double.longBitsToDouble(4632233691727265792L), true));
        this.Field16362 = this.Method23(new Class44("Self", this, true));
        this.Field16363 = this.Method23(new Class44("Heal", this, true));
        this.Field16364 = this.Method23(new Class44("Heal Color", this, "Heal Color", new Class2027(0, 255, 0)).Method313(this.Field16363::Method365));
        this.Field16365 = this.Method23(new Class44("Damage", this, true));
        this.Field16366 = this.Method23(new Class44("Damage Color", this, "Damage Color", new Class2027(255, 0, 0)).Method313(this.Field16365::Method365));
        this.Field16367 = new HashMap();
        this.Field16368 = new ArrayList();
    }
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field16367.clear();
        this.Field16368.clear();
    }
    
    @Override
    public void Method45() {
        if (Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        for (final Entity entity : Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (entity == Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && !this.Field16362.Method365()) {
                continue;
            }
            if (entity instanceof EntityLiving) {
                final EntityLiving entityLiving = (EntityLiving)entity;
                if (!this.Field16367.containsKey(entityLiving)) {
                    this.Field16367.put(entityLiving, entityLiving.getHealth());
                }
                else if ((float)this.Field16367.get(entityLiving) > entityLiving.getHealth()) {
                    this.Field16368.add(new Class1891(entity, System.currentTimeMillis(), (float)this.Field16367.get(entityLiving) - entityLiving.getHealth(), 1));
                    this.Field16367.replace(entityLiving, entityLiving.getHealth());
                }
                else {
                    if ((float)this.Field16367.get(entityLiving) >= entityLiving.getHealth()) {
                        continue;
                    }
                    this.Field16368.add(new Class1891(entity, System.currentTimeMillis(), entityLiving.getHealth() - (float)this.Field16367.get(entityLiving), 2));
                    this.Field16367.replace(entityLiving, entityLiving.getHealth());
                }
            }
            else {
                if (!(entity instanceof EntityPlayer)) {
                    continue;
                }
                final EntityPlayer entityPlayer = (EntityPlayer)entity;
                if (!this.Field16367.containsKey(entityPlayer)) {
                    this.Field16367.put(entityPlayer, entityPlayer.getHealth());
                }
                else if ((float)this.Field16367.get(entityPlayer) > entityPlayer.getHealth()) {
                    this.Field16368.add(new Class1891(entity, System.currentTimeMillis(), (float)this.Field16367.get(entityPlayer) - entityPlayer.getHealth(), 1));
                    this.Field16367.replace(entityPlayer, entityPlayer.getHealth());
                }
                else {
                    if ((float)this.Field16367.get(entityPlayer) >= entityPlayer.getHealth()) {
                        continue;
                    }
                    this.Field16368.add(new Class1891(entity, System.currentTimeMillis(), entityPlayer.getHealth() - (float)this.Field16367.get(entityPlayer), 2));
                    this.Field16367.replace(entityPlayer, entityPlayer.getHealth());
                }
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6855(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        if (this.Field16368.isEmpty()) {
            return;
        }
        for (final Class1891 class1891 : this.Field16368) {
            if (Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(Class1891.Method7005(class1891)) > this.Field16361.Method335()) {
                continue;
            }
            if (System.currentTimeMillis() - Class1891.Method7006(class1891) >= this.Field16360.Method335() * 1000L) {
                this.Field16368.remove(class1891);
                return;
            }
            if (Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(Class1891.Method7005(class1891)) > this.Field16361.Method335()) {
                continue;
            }
            final double n = class1891.Method7002().getPosition().getX() + (class1891.Method7002().getPosition().getX() - class1891.Method7002().getPosition().getX()) * renderGameOverlayEvent$Text.getPartialTicks() - Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX;
            final double n2 = class1891.Method7002().getPosition().getY() + (class1891.Method7002().getPosition().getY() - class1891.Method7002().getPosition().getY()) * renderGameOverlayEvent$Text.getPartialTicks() - Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY + class1891.Method7002().getEyeHeight() + Double.longBitsToDouble((long)1955411144 ^ 0x3FE00000748D34C8L);
            final double n3 = class1891.Method7002().getPosition().getZ() + (class1891.Method7002().getPosition().getZ() - class1891.Method7002().getPosition().getZ()) * renderGameOverlayEvent$Text.getPartialTicks() - Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ;
            final float n4 = (Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.thirdPersonView == 2) ? Float.intBitsToFloat(-1082130432) : 1.0f;
            GL11.glPushMatrix();
            GL11.glEnable(3042);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(2848);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(renderGameOverlayEvent$Text.getPartialTicks(), 0);
            GL11.glTranslated(n, n2, n3);
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewY, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewX, n4, 0.0f, 0.0f);
            GL11.glScaled(Double.longBitsToDouble((long)2078862236 ^ 0xBFA5555513E8EB9CL), Double.longBitsToDouble((long)1797235547 ^ 0xBFA55555031FA35BL), Double.longBitsToDouble(4586165620852129792L));
            final long n5 = Class1891.Method7006(class1891) + 1000L - System.currentTimeMillis();
            float n6;
            if (n5 < 75L) {
                n6 = Math.min(n5 / Float.intBitsToFloat(1117126656), 1.0f);
            }
            else {
                n6 = Math.min((System.currentTimeMillis() - Class1891.Method7006(class1891)) / Float.intBitsToFloat(1142292480), 1.0f);
            }
            Gui.drawRect(-100, -100, 100, 100, new Color(255, 0, 0, 0).getRGB());
            switch (class1891.Method7004()) {
                case 2: {
                    if (!this.Field16363.Method365()) {
                        return;
                    }
                    Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(new DecimalFormat("#.#").format(Class1891.Method7007(class1891)), 0.0f, (float)(int)(-n6), this.Field16364.Method339().Method3626());
                    break;
                }
                case 1: {
                    if (!this.Field16365.Method365()) {
                        return;
                    }
                    Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(new DecimalFormat("#.#").format(Class1891.Method7007(class1891)), 0.0f, (float)(int)(-n6), this.Field16366.Method339().Method3626());
                    break;
                }
            }
            GL11.glDisable(3042);
            GL11.glEnable(3553);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
            GL11.glEnable(2929);
            GlStateManager.color(1.0f, 1.0f, 1.0f);
            GlStateManager.popMatrix();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x434F ^ 0x78));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
