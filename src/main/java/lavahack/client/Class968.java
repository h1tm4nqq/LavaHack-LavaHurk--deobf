//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import lavahack.client.Class1696;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class726;
import lavahack.client.Class753;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class Class968
extends Class42 {
    private final Class44 Field12145 = this.Method23(new Class44("Range", (Class42)this, 0.0, Double.longBitsToDouble((long)2074243120 ^ 0x404900007BA27030L), Double.longBitsToDouble(4636737291354636288L), false));
    private final Class44 Field12146 = this.Method23(new Class44("Scale", (Class42)this, Double.longBitsToDouble((long)1204520297 ^ 0x3FB99999E7CB8569L), Double.longBitsToDouble(4591870180174331904L), Double.longBitsToDouble((long)1627877436 ^ 0x3FD333332107703CL), false));
    private final Class44 Field12147 = this.Method23(new Class44("BG Alpha", (Class42)this, Double.longBitsToDouble((long)1067421423 ^ 0x406000003F9F8EEFL), 0.0, Double.longBitsToDouble(4643000109586448384L), true));
    private final Class44 Field12148 = this.Method23(new Class44("Ping", (Class42)this, true));
    private final Class44 Field12149 = this.Method23(new Class44("Items", (Class42)this, true));
    private final Class44 Field12150 = this.Method23(new Class44("Damage Display", (Class42)this, true));
    private final Class44 Field12151 = this.Method23(new Class44("Atheist", (Class42)this, true));
    private final Class44 Field12152 = this.Method23(new Class44("Desc", (Class42)this, false));
    private final Class44 Field12153 = this.Method23(new Class44("No Bots", (Class42)this, false));
    private final Class411 Field12154 = this.Method54();
    public static Class968 Field12155;
    private int Field12156;
    private final HashMap Field12157 = new HashMap();
    private final HashMap Field12158 = new HashMap();
    private ArrayList Field12159 = new ArrayList();
    private String Field12160 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class968() {
        super("NameTags", Class97.Field8342);
        Field12155 = this;
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field12154.Method2004();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3969(RenderWorldLastEvent renderWorldLastEvent) {
        this.Field12154.Method2005(this::Method20);
        Iterator iterator = this.Field12159.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer = (EntityPlayer)iterator.next();
            double d = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double)Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            double d2 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double)Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            double d3 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double)Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            Entity entity = Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderViewEntity;
            if (entity == null) {
                entity = Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            }
            if (entity == null) {
                return;
            }
            double d4 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            double d5 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            double d6 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            this.Method3970(entityPlayer, d - d4, d2 - d5, d3 - d6);
        }
    }

    public void Method3970(EntityPlayer entityPlayer, double d, double d2, double d3) {
        int n;
        Class815.Method3437();
        TextFormatting textFormatting = TextFormatting.WHITE;
        String string = "";
        if (Class726.Field11086.Method3043(entityPlayer.getName())) {
            textFormatting = TextFormatting.AQUA;
            if (!this.Field12151.Method365()) {
                string = "\u271d ";
            }
        } else if (Class1696.Field15860.Method6506(entityPlayer)) {
            textFormatting = TextFormatting.RED;
        }
        int n2 = -1;
        n2 = Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getPlayerInfo(entityPlayer.getUniqueID()).getResponseTime();
        String string2 = n2 + "ms  ";
        if (!this.Field12148.Method365()) {
            string2 = "";
        }
        int n3 = MathHelper.ceil((float)(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()));
        boolean bl = this.Field12150.Method365();
        TextFormatting textFormatting2 = n3 > 16 ? TextFormatting.GREEN : (n3 > 12 ? TextFormatting.YELLOW : (n3 > 8 ? TextFormatting.GOLD : (n3 > 5 ? TextFormatting.RED : TextFormatting.DARK_RED)));
        int n4 = 0;
        n4 = (Integer)this.Field12157.get(entityPlayer.getName());
        if (bl) {
            if (n4 > n3) {
                this.Field12158.put(entityPlayer.getName(), TextFormatting.RED + " -" + (n4 - n3));
            }
            this.Field12157.put(entityPlayer.getName(), n3);
        }
        String string3 = "";
        if (bl && this.Field12158.containsKey(entityPlayer.getName())) {
            string3 = (String)this.Field12158.get(entityPlayer.getName());
        }
        String string4 = string + textFormatting + string2 + entityPlayer.getName() + " " + textFormatting2 + n3 + string3;
        string4 = string4.replace(".0", "");
        float f = Float.intBitsToFloat(1015580809) * this.Method3971((EntityLivingBase)entityPlayer);
        GL11.glTranslated((double)d, (double)(d2 + Double.longBitsToDouble((long)1350037767 ^ 0x400400005077F107L) + (double)(f * Float.intBitsToFloat(1092616192))), (double)d3);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewX, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f), (float)(-f), (float)f);
        GlStateManager.disableLighting();
        GlStateManager.depthMask((boolean)false);
        GL11.glDisable((int)2929);
        int n5 = Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.getStringWidth(string4) / 2;
        double d4 = this.Field12147.Method367();
        int[] nArray = new int[]{1};
        Class753.drawSmoothRect(-n5 - 3, Float.intBitsToFloat(0x41100000), n5 + 4, Float.intBitsToFloat(1102577664), new Color(0, 0, 0, (int)d4).getRGB());
        int[] nArray2 = nArray;
        int n6 = n = 0;
        nArray2[n6] = nArray2[n6] + 1;
        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string4, (float)(-n5), Float.intBitsToFloat(1098907648) - (float)Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.FONT_HEIGHT / 2.0f, Color.red.getRGB());
        boolean bl2 = this.Field12149.Method365();
        if (!bl2) {
            Class815.Method3438();
            return;
        }
        int n7 = -8;
        for (ItemStack itemStack : entityPlayer.inventory.armorInventory) {
            if (itemStack == null) continue;
            n7 -= 8;
        }
        if (!entityPlayer.getHeldItemMainhand().isEmpty()) {
            Iterator iterator = entityPlayer.getHeldItemMainhand().copy();
            this.Method3972((ItemStack)iterator, n7 -= 8, -10);
            n7 += 16;
        }
        int n8 = 3;
        while (true) {
            ItemStack itemStack;
            if (!(itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(n8)).isEmpty()) {
                ItemStack itemStack2 = itemStack.copy();
                this.Method3972(itemStack2, n7, -10);
                n7 += 16;
            }
            --n8;
        }
    }

    public float Method3971(EntityLivingBase entityLivingBase) {
        ScaledResolution scaledResolution = new ScaledResolution(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi);
        double d = (double)scaledResolution.getScaleFactor() / Math.pow(scaledResolution.getScaleFactor(), Double.longBitsToDouble(0x4000000000000000L));
        double d2 = this.Field12146.Method367();
        return (float)d2 * Float.intBitsToFloat(0x40C00000) * ((float)d + (float)(entityLivingBase.getDistance(Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderViewEntity.posX, Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity().posY, Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity().posZ) / Double.longBitsToDouble(4622100592565682176L)));
    }

    public void Method3972(ItemStack itemStack, int n, int n2) {
        GL11.glPushMatrix();
        GL11.glDepthMask((boolean)true);
        GlStateManager.clear((int)256);
        GlStateManager.disableDepth();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = Float.intBitsToFloat(-1027080192);
        GlStateManager.scale((float)1.0f, (float)1.0f, (float)Float.intBitsToFloat(1008981770));
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2 / 2 - 12);
        if (itemStack.getItem() == Items.GOLDEN_APPLE) {
            Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderItem.renderItemOverlays(Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack, n - 5, n2 / 2 - 28);
        } else {
            Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderItem.renderItemOverlays(Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack, n, n2 / 2 - 8);
        }
        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = 0.0f;
        GlStateManager.scale((float)1.0f, (float)1.0f, (float)1.0f);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableLighting();
        GlStateManager.scale((double)Double.longBitsToDouble(4602678819172646912L), (double)Double.longBitsToDouble((long)84312864 ^ 0x3FE0000005068320L), (double)Double.longBitsToDouble((long)1591717712 ^ 0x3FE000005EDFAF50L));
        GlStateManager.disableDepth();
        boolean bl = this.Field12152.Method365();
        if (bl) {
            this.Method3973(itemStack, n, n2 - 18);
        }
        GlStateManager.enableDepth();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glPopMatrix();
    }

    public void Method3973(ItemStack itemStack, int n, int n2) {
        int n3 = n2 - 18;
        int n4 = n3 + 5;
        NBTTagList nBTTagList = itemStack.getEnchantmentTagList();
        if (nBTTagList.isEmpty()) return;
        int n5 = 0;
        while (n5 < nBTTagList.tagCount()) {
            short s = nBTTagList.getCompoundTagAt(n5).getShort("id");
            short s2 = nBTTagList.getCompoundTagAt(n5).getShort("lvl");
            Enchantment enchantment = Enchantment.getEnchantmentByID((int)s);
            if (enchantment != null) {
                String string = enchantment.getTranslatedName((int)s2).substring(0, 1).toLowerCase();
                string = string + s2;
                GL11.glPushMatrix();
                GL11.glScalef((float)1.0f, (float)1.0f, (float)0.0f);
                if (s2 == 1) {
                    Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(202, 202, 202, 255).getRGB());
                } else if (s2 == 2) {
                    Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(246, 218, 45, 255).getRGB());
                } else if (s2 == 3) {
                    Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(229, 128, 0, 255).getRGB());
                } else if (s2 == 4) {
                    Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(156, 59, 253, 255).getRGB());
                } else {
                    Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(239, 0, 0, 255).getRGB());
                }
                GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glPopMatrix();
                n3 += 8;
                n4 -= 10;
            }
            ++n5;
        }
    }

    private void Method20() {
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>();
        for (EntityPlayer entityPlayer : Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            if (this.Field12153.Method365()) {
                Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getPlayerInfo(entityPlayer.getUniqueID()).getResponseTime();
            }
            if (entityPlayer != Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= (float)this.Field12145.Method335() && entityPlayer != vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity() && entityPlayer.isEntityAlive()) {
                if (this.Field12150.Method365()) {
                    if (!this.Field12157.containsKey(entityPlayer.getName())) {
                        this.Field12157.put(entityPlayer.getName(), (int)entityPlayer.getHealth());
                        this.Field12158.put(entityPlayer.getName(), "");
                    }
                    if (entityPlayer.isDead || entityPlayer.getHealth() <= 0.0f) {
                        this.Field12157.remove(entityPlayer.getName());
                        this.Field12158.remove(entityPlayer.getName());
                    }
                }
                arrayList.add(entityPlayer);
            }
            if (this.Field12156 != 601 || !this.Field12150.Method365()) continue;
            this.Field12157.remove(entityPlayer.getName());
            this.Field12158.remove(entityPlayer.getName());
        }
        if (this.Field12156 == 601) {
            this.Field12156 = 0;
        }
        ++this.Field12156;
        this.Field12159 = arrayList;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 37;
            cArray2[n] = (char)(cArray[n] ^ (0x245C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

