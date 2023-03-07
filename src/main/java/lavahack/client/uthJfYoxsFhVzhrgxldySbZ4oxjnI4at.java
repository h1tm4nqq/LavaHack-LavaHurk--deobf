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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class uthJfYoxsFhVzhrgxldySbZ4oxjnI4at
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16360 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Time To Remove", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1988176670 ^ 0x4008000076812B1EL), 1.0, Double.longBitsToDouble((long)353911363 ^ 0x4014000015184243L), ((int)-2023628201L ^ 0x8761E256) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16361 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x6B41D31CDFCEDAA2L ^ 0x2B75D31CDFCEDAA2L), 1.0, Double.longBitsToDouble(0xF69733B35CD8A9F6L ^ 0xB6DE33B35CD8A9F6L), ((int)-1609366156L ^ 0xA0130575) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16362 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Self", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1954806232 ^ (long)1954806233)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16363 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Heal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1615077178L ^ 0x9FBBE0C7) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16364 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Heal Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Heal Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)364007591 ^ (long)364007591), (int)((long)-1684720493 ^ (long)-1684720532), (int)((long)-913280871 ^ (long)-913280871))).Method313(this.Field16363::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16365 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1804573986L ^ 0x6B8F9D23) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16366 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Damage Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1357524965 ^ (long)-1357524764), (int)-1728112038L ^ 0x98FF1A5A, (int)-1893701884L ^ 0x8F206704)).Method313(this.Field16365::Method365));
    private final HashMap Field16367 = new HashMap();
    private final List Field16368 = new ArrayList();
    private String Field16369 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public uthJfYoxsFhVzhrgxldySbZ4oxjnI4at() {
        super("DamageESP", "Thank you, gerald(man)", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field16367.clear();
        this.Field16368.clear();
    }

    @Override
    public void Method45() {
        if (uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Iterator iterator = uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            EntityLiving entityLiving;
            Entity entity = (Entity)iterator.next();
            if (entity == uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && !this.Field16362.Method365()) continue;
            if (entity instanceof EntityLiving) {
                entityLiving = (EntityLiving)entity;
                if (!this.Field16367.containsKey(entityLiving)) {
                    this.Field16367.put(entityLiving, Float.valueOf(entityLiving.getHealth()));
                    continue;
                }
                if (((Float)this.Field16367.get(entityLiving)).floatValue() > entityLiving.getHealth()) {
                    this.Field16368.add(new uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(entity, System.currentTimeMillis(), ((Float)this.Field16367.get(entityLiving)).floatValue() - entityLiving.getHealth(), (int)((long)-1908280924 ^ (long)-1908280923)));
                    this.Field16367.replace(entityLiving, Float.valueOf(entityLiving.getHealth()));
                    continue;
                }
                if (!(((Float)this.Field16367.get(entityLiving)).floatValue() < entityLiving.getHealth())) continue;
                this.Field16368.add(new uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(entity, System.currentTimeMillis(), entityLiving.getHealth() - ((Float)this.Field16367.get(entityLiving)).floatValue(), ((int)1331314797L ^ 0x4F5A406C) << 1));
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
                this.Field16368.add(new uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(entity, System.currentTimeMillis(), ((Float)this.Field16367.get(entityLiving)).floatValue() - entityLiving.getHealth(), (int)2028433310L ^ 0x78E76F9F));
                this.Field16367.replace(entityLiving, Float.valueOf(entityLiving.getHealth()));
                continue;
            }
            if (!(((Float)this.Field16367.get(entityLiving)).floatValue() < entityLiving.getHealth())) continue;
            this.Field16368.add(new uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(entity, System.currentTimeMillis(), entityLiving.getHealth() - ((Float)this.Field16367.get(entityLiving)).floatValue(), (int)((long)1039622035 ^ (long)1039622034) << 1));
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
            uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
            if (uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7005(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) > (float)this.Field16361.Method335()) continue;
            if (System.currentTimeMillis() - uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7006(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) >= (long)this.Field16360.Method335() * (0x1310ABE8L & 0x608D03F9L)) {
                this.Field16368.remove(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
                return;
            }
            if (uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7005(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) > (float)this.Field16361.Method335()) continue;
            double d = (double)((float)uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getX() + (float)(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getX() - uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getX()) * text.getPartialTicks()) - uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosX;
            double d2 = (double)((float)uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getY() + (float)(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getY() - uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getY()) * text.getPartialTicks()) - uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosY + (double)uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getEyeHeight() + Double.longBitsToDouble((long)1955411144 ^ 0x3FE00000748D34C8L);
            double d3 = (double)((float)uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getZ() + (float)(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getZ() - uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7002().getPosition().getZ()) * text.getPartialTicks()) - uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().viewerPosZ;
            float f = uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.thirdPersonView == ((int)1948389606L ^ 0x742210E7) << 1 ? Float.intBitsToFloat((int)((long)295429083 ^ (long)-1373903909)) : 1.0f;
            GL11.glPushMatrix();
            GL11.glEnable((int)(((int)1304003386L ^ 0x4DB986CB) << 1));
            GL11.glEnable((int)(((int)-1249568827L ^ 0xB5851234) << 1));
            GL11.glBlendFunc((int)((int)((long)1583309322 ^ (long)1583309707) << 1), (int)((int)((long)-177455371 ^ (long)-177455626)));
            GL11.glEnable((int)(((int)414936709L ^ 0x18BB6EDC) << 5));
            GL11.glDisable((int)((int)-680461861L ^ 0xD770F43A));
            GL11.glDisable((int)((int)730708293L ^ 0x2B8DB234));
            uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.setupCameraTransform(text.getPartialTicks(), (int)851881222L ^ 0x32C6AD06);
            GL11.glTranslated((double)d, (double)d2, (double)d3);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewX, (float)f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)Double.longBitsToDouble((long)2078862236 ^ 0xBFA5555513E8EB9CL), (double)Double.longBitsToDouble((long)1797235547 ^ 0xBFA55555031FA35BL), (double)Double.longBitsToDouble(0x486253F6D6489939L ^ 0x77C706A3BE489939L));
            long l = uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7006(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) + (0x45B47FEL & 0x12033E8L) - System.currentTimeMillis();
            float f2 = l < (0x26C5806BL & 0x81236CFL) ? Math.min((float)l / Float.intBitsToFloat(0x5DBC6E70 ^ 0x1F2A6E70), 1.0f) : Math.min((float)(System.currentTimeMillis() - uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7006(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) / Float.intBitsToFloat((int)((long)1888985525 ^ (long)880910773)), 1.0f);
            Gui.drawRect((int)((int)((long)205171305 ^ (long)-205171211)), (int)((int)1231580393L ^ 0xB6979375), (int)(((int)1869983517L ^ 0x6F75AF04) << 2), (int)(((int)-836797286L ^ 0xCE1F7C83) << 2), (int)new Color((int)-1384156686L ^ 0xAD7F710D, (int)-1790518085L ^ 0x9546DCBB, (int)((long)1835331504 ^ (long)1835331504), (int)((long)262810030 ^ (long)262810030)).getRGB());
            switch (uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7004()) {
                case 2: {
                    if (!this.Field16363.Method365()) {
                        return;
                    }
                    uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(new DecimalFormat("#.#").format(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7007(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)), 0.0f, (float)((int)(-f2)), this.Field16364.Method339().Method3626());
                    break;
                }
                case 1: {
                    if (!this.Field16365.Method365()) {
                        return;
                    }
                    uthJfYoxsFhVzhrgxldySbZ4oxjnI4at.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(new DecimalFormat("#.#").format(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7007(uthJfYoxsFhVzhrgxldySbZ4oxjnI4at$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)), 0.0f, (float)((int)(-f2)), this.Field16366.Method339().Method3626());
                    break;
                }
            }
            GL11.glDisable((int)(((int)-208515279L ^ 0xF3924AC0) << 1));
            GL11.glEnable((int)((int)1697199536L ^ 0x65293851));
            GL11.glDisable((int)(((int)-979744813L ^ 0xC59A478A) << 5));
            GL11.glDisable((int)((int)((long)-1463257268 ^ (long)-1463258435) << 1));
            GL11.glEnable((int)((int)1983633116L ^ 0x763BDDAD));
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.popMatrix();
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-979082084 ^ (long)-979082084);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-84312774L ^ 0xFAF97DC5);
            int n2 = (int)((long)1756955862 ^ (long)1756955865) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-642979355L ^ 0xD9ACAAAA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

