//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.entity.player.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.text.*;
import net.minecraft.util.math.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import net.minecraft.item.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.*;
import net.minecraft.init.*;
import net.minecraft.enchantment.*;
import net.minecraft.nbt.*;
import net.minecraft.entity.*;

public class Class968 extends Class42
{
    private final Class44 Field12145;
    private final Class44 Field12146;
    private final Class44 Field12147;
    private final Class44 Field12148;
    private final Class44 Field12149;
    private final Class44 Field12150;
    private final Class44 Field12151;
    private final Class44 Field12152;
    private final Class44 Field12153;
    private final Class411 Field12154;
    public static Class968 Field12155;
    private int Field12156;
    private final HashMap Field12157;
    private final HashMap Field12158;
    private ArrayList Field12159;
    private String Field12160 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class968() {
        super("NameTags", Class97.Field8342);
        this.Field12145 = this.Method23(new Class44("Range", (Class42)this, 0.0, Double.longBitsToDouble((long)2074243120 ^ 0x404900007BA27030L), Double.longBitsToDouble(4636737291354636288L), false));
        this.Field12146 = this.Method23(new Class44("Scale", (Class42)this, Double.longBitsToDouble((long)1204520297 ^ 0x3FB99999E7CB8569L), Double.longBitsToDouble(4591870180174331904L), Double.longBitsToDouble((long)1627877436 ^ 0x3FD333332107703CL), false));
        this.Field12147 = this.Method23(new Class44("BG Alpha", (Class42)this, Double.longBitsToDouble((long)1067421423 ^ 0x406000003F9F8EEFL), 0.0, Double.longBitsToDouble(4643000109586448384L), true));
        this.Field12148 = this.Method23(new Class44("Ping", (Class42)this, true));
        this.Field12149 = this.Method23(new Class44("Items", (Class42)this, true));
        this.Field12150 = this.Method23(new Class44("Damage Display", (Class42)this, true));
        this.Field12151 = this.Method23(new Class44("Atheist", (Class42)this, true));
        this.Field12152 = this.Method23(new Class44("Desc", (Class42)this, false));
        this.Field12153 = this.Method23(new Class44("No Bots", (Class42)this, false));
        this.Field12154 = this.Method54();
        this.Field12157 = new HashMap();
        this.Field12158 = new HashMap();
        this.Field12159 = new ArrayList();
        Class968.Field12155 = this;
    }
    
    public void Method38() {
        super.Method38();
        this.Field12154.Method2004();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3969(final RenderWorldLastEvent renderWorldLastEvent) {
        this.Field12154.Method2005(this::Method20);
        for (final EntityPlayer entityPlayer : this.Field12159) {
            final double n = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            final double n2 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            final double n3 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            Object o = Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderViewEntity;
            if (o == null) {
                o = Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            }
            if (o == null) {
                return;
            }
            this.Method3970(entityPlayer, n - (((Entity)o).lastTickPosX + (((Entity)o).posX - ((Entity)o).lastTickPosX) * Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks), n2 - (((Entity)o).lastTickPosY + (((Entity)o).posY - ((Entity)o).lastTickPosY) * Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks), n3 - (((Entity)o).lastTickPosZ + (((Entity)o).posZ - ((Entity)o).lastTickPosZ) * Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks));
        }
    }
    
    public void Method3970(final EntityPlayer entityPlayer, final double n, final double n2, final double n3) {
        Class815.Method3437();
        TextFormatting obj = TextFormatting.WHITE;
        String str = "";
        if (Class726.Field11086.Method3043(entityPlayer.getName())) {
            obj = TextFormatting.AQUA;
            if (!this.Field12151.Method365()) {
                str = "\u271d ";
            }
        }
        else if (Class1696.Field15860.Method6506(entityPlayer)) {
            obj = TextFormatting.RED;
        }
        String string = Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getPlayerInfo(entityPlayer.getUniqueID()).getResponseTime() + "ms  ";
        if (!this.Field12148.Method365()) {
            string = "";
        }
        final int ceil = MathHelper.ceil(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount());
        final boolean method365 = this.Field12150.Method365();
        TextFormatting obj2;
        if (ceil > 16) {
            obj2 = TextFormatting.GREEN;
        }
        else if (ceil > 12) {
            obj2 = TextFormatting.YELLOW;
        }
        else if (ceil > 8) {
            obj2 = TextFormatting.GOLD;
        }
        else if (ceil > 5) {
            obj2 = TextFormatting.RED;
        }
        else {
            obj2 = TextFormatting.DARK_RED;
        }
        final int intValue = this.Field12157.get(entityPlayer.getName());
        if (method365) {
            if (intValue > ceil) {
                this.Field12158.put(entityPlayer.getName(), TextFormatting.RED + " -" + (intValue - ceil));
            }
            this.Field12157.put(entityPlayer.getName(), ceil);
        }
        String str2 = "";
        if (method365 && this.Field12158.containsKey(entityPlayer.getName())) {
            str2 = this.Field12158.get(entityPlayer.getName());
        }
        final String replace = (str + obj + string + entityPlayer.getName() + " " + obj2 + ceil + str2).replace(".0", "");
        final float n4 = Float.intBitsToFloat(1015580809) * this.Method3971((EntityLivingBase)entityPlayer);
        GL11.glTranslated(n, n2 + Double.longBitsToDouble((long)1350037767 ^ 0x400400005077F107L) + n4 * Float.intBitsToFloat(1092616192), n3);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewY, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewX, 1.0f, 0.0f, 0.0f);
        GL11.glScalef(-n4, -n4, n4);
        GlStateManager.disableLighting();
        GlStateManager.depthMask(false);
        GL11.glDisable(2929);
        final int n5 = Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.getStringWidth(replace) / 2;
        final double method366 = this.Field12147.Method367();
        final int[] array = { 1 };
        Class753.drawSmoothRect((float)(-n5 - 3), Float.intBitsToFloat(1091567616), (float)(n5 + 4), Float.intBitsToFloat(1102577664), new Color(0, 0, 0, (int)method366).getRGB());
        final int[] array2 = array;
        final int n6 = 0;
        final int[] array3 = array2;
        final int n7 = n6;
        ++array3[n7];
        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(replace, (float)(-n5), Float.intBitsToFloat(1098907648) - Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.FONT_HEIGHT / 2.0f, Color.red.getRGB());
        if (!this.Field12149.Method365()) {
            Class815.Method3438();
            return;
        }
        int n8 = -8;
        final Iterator iterator = entityPlayer.inventory.armorInventory.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != null) {
                n8 -= 8;
            }
        }
        if (!entityPlayer.getHeldItemMainhand().isEmpty()) {
            n8 -= 8;
            this.Method3972(entityPlayer.getHeldItemMainhand().copy(), n8, -10);
            n8 += 16;
        }
        int n9 = 3;
        while (true) {
            final ItemStack itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(n9);
            if (!itemStack.isEmpty()) {
                this.Method3972(itemStack.copy(), n8, -10);
                n8 += 16;
            }
            --n9;
        }
    }
    
    public float Method3971(final EntityLivingBase entityLivingBase) {
        final ScaledResolution scaledResolution = new ScaledResolution(Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi);
        return (float)this.Field12146.Method367() * Float.intBitsToFloat(1086324736) * ((float)(scaledResolution.getScaleFactor() / Math.pow(scaledResolution.getScaleFactor(), Double.longBitsToDouble(4611686018427387904L))) + (float)(entityLivingBase.getDistance(Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderViewEntity.posX, Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity().posY, Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity().posZ) / Double.longBitsToDouble(4622100592565682176L)));
    }
    
    public void Method3972(final ItemStack itemStack, final int n, final int n2) {
        GL11.glPushMatrix();
        GL11.glDepthMask(true);
        GlStateManager.clear(256);
        GlStateManager.disableDepth();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = Float.intBitsToFloat(-1027080192);
        GlStateManager.scale(1.0f, 1.0f, Float.intBitsToFloat(1008981770));
        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2 / 2 - 12);
        if (itemStack.getItem() == Items.GOLDEN_APPLE) {
            Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderItem.renderItemOverlays(Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack, n - 5, n2 / 2 - 28);
        }
        else {
            Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderItem.renderItemOverlays(Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack, n, n2 / 2 - 8);
        }
        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = 0.0f;
        GlStateManager.scale(1.0f, 1.0f, 1.0f);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableLighting();
        GlStateManager.scale(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)84312864 ^ 0x3FE0000005068320L), Double.longBitsToDouble((long)1591717712 ^ 0x3FE000005EDFAF50L));
        GlStateManager.disableDepth();
        if (this.Field12152.Method365()) {
            this.Method3973(itemStack, n, n2 - 18);
        }
        GlStateManager.enableDepth();
        GlStateManager.scale(2.0f, 2.0f, 2.0f);
        GL11.glPopMatrix();
    }
    
    public void Method3973(final ItemStack itemStack, final int n, final int n2) {
        int n3 = n2 - 18;
        int n4 = n3 + 5;
        final NBTTagList getEnchantmentTagList = itemStack.getEnchantmentTagList();
        if (!getEnchantmentTagList.isEmpty()) {
            for (int i = 0; i < getEnchantmentTagList.tagCount(); ++i) {
                final short getShort = getEnchantmentTagList.getCompoundTagAt(i).getShort("id");
                final short getShort2 = getEnchantmentTagList.getCompoundTagAt(i).getShort("lvl");
                final Enchantment getEnchantmentByID = Enchantment.getEnchantmentByID((int)getShort);
                if (getEnchantmentByID != null) {
                    final String string = getEnchantmentByID.getTranslatedName((int)getShort2).substring(0, 1).toLowerCase() + getShort2;
                    GL11.glPushMatrix();
                    GL11.glScalef(1.0f, 1.0f, 0.0f);
                    if (getShort2 == 1) {
                        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(202, 202, 202, 255).getRGB());
                    }
                    else if (getShort2 == 2) {
                        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(246, 218, 45, 255).getRGB());
                    }
                    else if (getShort2 == 3) {
                        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(229, 128, 0, 255).getRGB());
                    }
                    else if (getShort2 == 4) {
                        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(156, 59, 253, 255).getRGB());
                    }
                    else {
                        Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * 2 + 10), (float)n4, new Color(239, 0, 0, 255).getRGB());
                    }
                    GL11.glScalef(1.0f, 1.0f, 1.0f);
                    GL11.glPopMatrix();
                    n3 += 8;
                    n4 -= 10;
                }
            }
        }
    }
    
    private void Method20() {
        final ArrayList<Entity> field12159 = new ArrayList<Entity>();
        for (final EntityPlayer e : Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            if (this.Field12153.Method365()) {
                Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getPlayerInfo(e.getUniqueID()).getResponseTime();
            }
            if (e != Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)e) <= this.Field12145.Method335() && e != Class968.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity() && e.isEntityAlive()) {
                if (this.Field12150.Method365()) {
                    if (!this.Field12157.containsKey(e.getName())) {
                        this.Field12157.put(e.getName(), (int)e.getHealth());
                        this.Field12158.put(e.getName(), "");
                    }
                    if (e.isDead || e.getHealth() <= 0.0f) {
                        this.Field12157.remove(e.getName());
                        this.Field12158.remove(e.getName());
                    }
                }
                field12159.add((Entity)e);
            }
            if (this.Field12156 == 601 && this.Field12150.Method365()) {
                this.Field12157.remove(e.getName());
                this.Field12158.remove(e.getName());
            }
        }
        if (this.Field12156 == 601) {
            this.Field12156 = 0;
        }
        ++this.Field12156;
        this.Field12159 = field12159;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x245C ^ 0x25));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
