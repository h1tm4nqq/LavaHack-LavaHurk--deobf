//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1887;
import lavahack.client.Class1891;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class794;
import lavahack.client.Class97;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@Class794
@Class1887
public class Class1819
extends Class42 {
    private final Class44 Field16360 = this.Method23(new Class44("Time To Remove", (Class42)this, Double.longBitsToDouble((long)1988176670 ^ 0x4008000076812B1EL), 1.0, Double.longBitsToDouble((long)353911363 ^ 0x4014000015184243L), true));
    private final Class44 Field16361 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4034000000000000L), 1.0, Double.longBitsToDouble(0x4049000000000000L), true));
    private final Class44 Field16362 = this.Method23(new Class44("Self", (Class42)this, true));
    private final Class44 Field16363 = this.Method23(new Class44("Heal", (Class42)this, true));
    private final Class44 Field16364 = this.Method23(new Class44("Heal Color", (Class42)this, "Heal Color", new Class2027(0, 255, 0)).Method313(this.Field16363::Method365));
    private final Class44 Field16365 = this.Method23(new Class44("Damage", (Class42)this, true));
    private final Class44 Field16366 = this.Method23(new Class44("Damage Color", (Class42)this, "Damage Color", new Class2027(255, 0, 0)).Method313(this.Field16365::Method365));
    private final HashMap Field16367 = new HashMap();
    private final List Field16368 = new ArrayList();
    private String Field16369 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1819() {
        super("DamageESP", "Thank you, gerald(man)", Class97.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field16367.clear();
        this.Field16368.clear();
    }

    @Override
    public void Method45() {
        if (Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Iterator iterator = Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            EntityLiving entityLiving;
            Entity entity = (Entity)iterator.next();
            if (entity == Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && !this.Field16362.Method365()) continue;
            if (entity instanceof EntityLiving) {
                entityLiving = (EntityLiving)entity;
                if (!this.Field16367.containsKey(entityLiving)) {
                    this.Field16367.put(entityLiving, Float.valueOf(entityLiving.getHealth()));
                    continue;
                }
                if (((Float)this.Field16367.get(entityLiving)).floatValue() > entityLiving.getHealth()) {
                    this.Field16368.add(new Class1891(entity, System.currentTimeMillis(), ((Float)this.Field16367.get(entityLiving)).floatValue() - entityLiving.getHealth(), 1));
                    this.Field16367.replace(entityLiving, Float.valueOf(entityLiving.getHealth()));
                    continue;
                }
                if (!(((Float)this.Field16367.get(entityLiving)).floatValue() < entityLiving.getHealth())) continue;
                this.Field16368.add(new Class1891(entity, System.currentTimeMillis(), entityLiving.getHealth() - ((Float)this.Field16367.get(entityLiving)).floatValue(), 2));
                this.Field16367.replace(entityLiving, Float.valueOf(entityLiving.getHealth()));
                continue;
            }
            if (!(entity instanceof EntityPlayer)) continue;
            entityLiving = (EntityPlayer)entity;
            if (!this.Field16367.containsKey(entityLiving)) {
                this.Field16367.put(entityLiving, Float.valueOf(entityLiving.getHealth()));
                continue;
            }
            if (((Float)this.Field16367.get(entityLiving)).floatValue() > entityLiving.getHealth()) {
                this.Field16368.add(new Class1891(entity, System.currentTimeMillis(), ((Float)this.Field16367.get(entityLiving)).floatValue() - entityLiving.getHealth(), 1));
                this.Field16367.replace(entityLiving, Float.valueOf(entityLiving.getHealth()));
                continue;
            }
            if (!(((Float)this.Field16367.get(entityLiving)).floatValue() < entityLiving.getHealth())) continue;
            this.Field16368.add(new Class1891(entity, System.currentTimeMillis(), entityLiving.getHealth() - ((Float)this.Field16367.get(entityLiving)).floatValue(), 2));
            this.Field16367.replace(entityLiving, Float.valueOf(entityLiving.getHealth()));
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6855(RenderGameOverlayEvent.Text text) {
        if (this.Field16368.isEmpty()) {
            return;
        }
        Iterator iterator = this.Field16368.iterator();
        while (iterator.hasNext()) {
            Class1891 class1891 = (Class1891)iterator.next();
            if (Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(Class1891.Method7005(class1891)) > (float)this.Field16361.Method335()) continue;
            if (System.currentTimeMillis() - Class1891.Method7006(class1891) >= (long)this.Field16360.Method335() * 1000L) {
                this.Field16368.remove(class1891);
                return;
            }
            if (Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(Class1891.Method7005(class1891)) > (float)this.Field16361.Method335()) continue;
            double d = (double)((float)class1891.Method7002().getPosition().getX() + (float)(class1891.Method7002().getPosition().getX() - class1891.Method7002().getPosition().getX()) * text.getPartialTicks()) - Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX;
            double d2 = (double)((float)class1891.Method7002().getPosition().getY() + (float)(class1891.Method7002().getPosition().getY() - class1891.Method7002().getPosition().getY()) * text.getPartialTicks()) - Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY + (double)class1891.Method7002().getEyeHeight() + Double.longBitsToDouble((long)1955411144 ^ 0x3FE00000748D34C8L);
            double d3 = (double)((float)class1891.Method7002().getPosition().getZ() + (float)(class1891.Method7002().getPosition().getZ() - class1891.Method7002().getPosition().getZ()) * text.getPartialTicks()) - Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ;
            float f = Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.thirdPersonView == 2 ? Float.intBitsToFloat(-1082130432) : 1.0f;
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)2848);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2929);
            Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(text.getPartialTicks(), 0);
            GL11.glTranslated((double)d, (double)d2, (double)d3);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewX, (float)f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)Double.longBitsToDouble((long)2078862236 ^ 0xBFA5555513E8EB9CL), (double)Double.longBitsToDouble((long)1797235547 ^ 0xBFA55555031FA35BL), (double)Double.longBitsToDouble(4586165620852129792L));
            long l = Class1891.Method7006(class1891) + 1000L - System.currentTimeMillis();
            float f2 = l < 75L ? Math.min((float)l / Float.intBitsToFloat(1117126656), 1.0f) : Math.min((float)(System.currentTimeMillis() - Class1891.Method7006(class1891)) / Float.intBitsToFloat(1142292480), 1.0f);
            Gui.drawRect((int)-100, (int)-100, (int)100, (int)100, (int)new Color(255, 0, 0, 0).getRGB());
            switch (class1891.Method7004()) {
                case 2: {
                    if (!this.Field16363.Method365()) {
                        return;
                    }
                    Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(new DecimalFormat("#.#").format(Class1891.Method7007(class1891)), 0.0f, (float)((int)(-f2)), this.Field16364.Method339().Method3626());
                    break;
                }
                case 1: {
                    if (!this.Field16365.Method365()) {
                        return;
                    }
                    Class1819.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(new DecimalFormat("#.#").format(Class1891.Method7007(class1891)), 0.0f, (float)((int)(-f2)), this.Field16366.Method339().Method3626());
                    break;
                }
            }
            GL11.glDisable((int)3042);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)2848);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2929);
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.popMatrix();
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 120;
            cArray2[n] = (char)(cArray[n] ^ (0x434F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

