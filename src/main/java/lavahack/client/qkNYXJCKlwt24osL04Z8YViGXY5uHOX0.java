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
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.lpZWTyPbfPSkdxxNzMqnmbfWu0EWRf6K;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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

public class qkNYXJCKlwt24osL04Z8YViGXY5uHOX0
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12145 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble((long)2074243120 ^ 0x404900007BA27030L), Double.longBitsToDouble(0x36BAEF16D977957EL ^ 0x76E3EF16D977957EL), (boolean)((long)714261658 ^ (long)714261658)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12146 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1204520297 ^ 0x3FB99999E7CB8569L), Double.longBitsToDouble(0xA9438681CBAAD5E6L ^ 0x96FA1F186BAAD5E6L), Double.longBitsToDouble((long)1627877436 ^ 0x3FD333332107703CL), (boolean)((long)-444136590 ^ (long)-444136590)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12147 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BG Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1067421423 ^ 0x406000003F9F8EEFL), 0.0, Double.longBitsToDouble(0x1FB78887608B05CAL ^ 0x5FD8C887608B05CAL), ((int)1932212177L ^ 0x732B37D0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12148 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ping", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1948024701 ^ (long)-1948024702)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12149 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1668421470 ^ (long)1668421471)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12150 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage Display", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-215861374L ^ 0xF3223783) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12151 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Atheist", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2006165968 ^ (long)-2006165967)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12152 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Desc", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-683999277L ^ 0xD73AFFD3) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12153 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Bots", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1653138251L ^ 0x6288E34B) != 0));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field12154 = this.Method54();
    public static qkNYXJCKlwt24osL04Z8YViGXY5uHOX0 Field12155;
    private int Field12156;
    private final HashMap Field12157 = new HashMap();
    private final HashMap Field12158 = new HashMap();
    private ArrayList Field12159 = new ArrayList();
    private String Field12160 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public qkNYXJCKlwt24osL04Z8YViGXY5uHOX0() {
        super("NameTags", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
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
            double d = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double)qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            double d2 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double)qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            double d3 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double)qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            Entity entity = qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderViewEntity;
            if (entity == null) {
                entity = qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            }
            if (entity == null) {
                return;
            }
            double d4 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            double d5 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            double d6 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.renderPartialTicks;
            this.Method3970(entityPlayer, d - d4, d2 - d5, d3 - d6);
        }
    }

    public void Method3970(EntityPlayer entityPlayer, double d, double d2, double d3) {
        int n;
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3437();
        TextFormatting textFormatting = TextFormatting.WHITE;
        String string = "";
        if (n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(entityPlayer.getName())) {
            textFormatting = TextFormatting.AQUA;
            if (!this.Field12151.Method365()) {
                string = "\u271d ";
            }
        } else if (lpZWTyPbfPSkdxxNzMqnmbfWu0EWRf6K.Field15860.Method6506(entityPlayer)) {
            textFormatting = TextFormatting.RED;
        }
        int n2 = (int)2115505212L ^ 0x81E7F3C3;
        n2 = qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getPlayerInfo(entityPlayer.getUniqueID()).getResponseTime();
        String string2 = n2 + "ms  ";
        if (!this.Field12148.Method365()) {
            string2 = "";
        }
        int n3 = MathHelper.ceil((float)(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()));
        boolean bl = this.Field12150.Method365();
        TextFormatting textFormatting2 = n3 > (int)((long)1706331690 ^ (long)1706331691) << 4 ? TextFormatting.GREEN : (n3 > ((int)-2001225184L ^ 0x88B7BA23) << 2 ? TextFormatting.YELLOW : (n3 > ((int)-984239968L ^ 0xC555B0A1) << 3 ? TextFormatting.GOLD : (n3 > ((int)-816186479L ^ 0xCF59FB94) ? TextFormatting.RED : TextFormatting.DARK_RED)));
        int n4 = (int)-847533457L ^ 0xCD7BAA6F;
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
        float f = Float.intBitsToFloat((int)((long)1885150836 ^ (long)1289066237)) * this.Method3971((EntityLivingBase)entityPlayer);
        GL11.glTranslated((double)d, (double)(d2 + Double.longBitsToDouble((long)1350037767 ^ 0x400400005077F107L) + (double)(f * Float.intBitsToFloat((int)((long)458123690 ^ (long)1517185450)))), (double)d3);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().playerViewX, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f), (float)(-f), (float)f);
        GlStateManager.disableLighting();
        GlStateManager.depthMask(((int)-139743635L ^ 0xF7ABAE6D) != 0);
        GL11.glDisable((int)((int)((long)-1137358247 ^ (long)-1137360600)));
        int n5 = qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.getStringWidth(string4) / ((int)((long)-1565318783 ^ (long)-1565318784) << 1);
        double d4 = this.Field12147.Method367();
        int[] nArray = new int[(int)((long)-127213630 ^ (long)-127213629)];
        nArray[(int)((long)984685925 ^ (long)984685925)] = (int)((long)-49188011 ^ (long)-49188012);
        int[] nArray2 = nArray;
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawSmoothRect(-n5 - ((int)422021688L ^ 0x19278A3B), Float.intBitsToFloat(0x21253DF5 ^ 0x60353DF5), n5 + ((int)((long)160017883 ^ (long)160017882) << 2), Float.intBitsToFloat((int)((long)774894273 ^ (long)1872229057)), new Color((int)676765765L ^ 0x2856A045, (int)((long)-1369358145 ^ (long)-1369358145), (int)-99806513L ^ 0xFA0D12CF, (int)d4).getRGB());
        int[] nArray3 = nArray2;
        int n6 = n = (int)-1596220910L ^ 0xA0DB9A12;
        nArray3[n6] = nArray3[n6] + (int)((long)-1257672709 ^ (long)-1257672710);
        qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string4, (float)(-n5), Float.intBitsToFloat((int)227437359L ^ 0x4C0E6B2F) - (float)qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.FONT_HEIGHT / 2.0f, Color.red.getRGB());
        boolean bl2 = this.Field12149.Method365();
        if (!bl2) {
            exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3438();
            return;
        }
        int n7 = (int)19022578L ^ 0xFEDDBD0A;
        for (ItemStack itemStack : entityPlayer.inventory.armorInventory) {
            if (itemStack == null) continue;
            n7 -= 8;
        }
        if (!entityPlayer.getHeldItemMainhand().isEmpty()) {
            Iterator iterator = entityPlayer.getHeldItemMainhand().copy();
            this.Method3972((ItemStack)iterator, n7 -= 8, (int)((long)497316139 ^ (long)-497316131));
            n7 += 16;
        }
        int n8 = (int)((long)1119945864 ^ (long)1119945867);
        while (true) {
            ItemStack itemStack;
            if (!(itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(n8)).isEmpty()) {
                ItemStack itemStack2 = itemStack.copy();
                this.Method3972(itemStack2, n7, (int)529570866L ^ 0xE06F63C4);
                n7 += 16;
            }
            --n8;
        }
    }

    public float Method3971(EntityLivingBase entityLivingBase) {
        ScaledResolution scaledResolution = new ScaledResolution(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi);
        double d = (double)scaledResolution.getScaleFactor() / Math.pow(scaledResolution.getScaleFactor(), Double.longBitsToDouble(0x3BED30A37E56C6AFL ^ 0x7BED30A37E56C6AFL));
        double d2 = this.Field12146.Method367();
        return (float)d2 * Float.intBitsToFloat((int)((long)437631566 ^ (long)1523956302)) * ((float)d + (float)(entityLivingBase.getDistance(qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderViewEntity.posX, qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity().posY, qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity().posZ) / Double.longBitsToDouble(0xDFB737EF8E61ABF5L ^ 0x9F9237EF8E61ABF5L)));
    }

    public void Method3972(ItemStack itemStack, int n, int n2) {
        GL11.glPushMatrix();
        GL11.glDepthMask((boolean)((long)161477499 ^ (long)161477498));
        GlStateManager.clear((int)((int)((long)900560391 ^ (long)900560390) << 8));
        GlStateManager.disableDepth();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
        qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = Float.intBitsToFloat((int)((long)1453002722 ^ (long)-1806495774));
        GlStateManager.scale((float)1.0f, (float)1.0f, (float)Float.intBitsToFloat(0x1E6132DE ^ 0x2242E5D4));
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2 / ((int)((long)-502095599 ^ (long)-502095600) << 1) - (((int)-1629923996L ^ 0x9ED95567) << 2));
        if (itemStack.getItem() == Items.GOLDEN_APPLE) {
            qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderItem.renderItemOverlays(qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack, n - (int)((long)-1170207305 ^ (long)-1170207310), n2 / (((int)868592023L ^ 0x33C5A996) << 1) - (((int)156671948L ^ 0x9569FCB) << 2));
        } else {
            qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderItem.renderItemOverlays(qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack, n, n2 / ((int)((long)609745145 ^ (long)609745144) << 1) - (((int)-1174245888L ^ 0xBA026E01) << 3));
        }
        qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = 0.0f;
        GlStateManager.scale((float)1.0f, (float)1.0f, (float)1.0f);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableLighting();
        GlStateManager.scale((double)Double.longBitsToDouble(0xADE81D23F3DCAB97L ^ 0x92081D23F3DCAB97L), (double)Double.longBitsToDouble((long)84312864 ^ 0x3FE0000005068320L), (double)Double.longBitsToDouble((long)1591717712 ^ 0x3FE000005EDFAF50L));
        GlStateManager.disableDepth();
        boolean bl = this.Field12152.Method365();
        if (bl) {
            this.Method3973(itemStack, n, n2 - (((int)1982660196L ^ 0x762CFE6D) << 1));
        }
        GlStateManager.enableDepth();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glPopMatrix();
    }

    public void Method3973(ItemStack itemStack, int n, int n2) {
        int n3 = n2 - ((int)((long)1063941637 ^ (long)1063941644) << 1);
        int n4 = n3 + (int)((long)1912829331 ^ (long)1912829334);
        NBTTagList nBTTagList = itemStack.getEnchantmentTagList();
        if (nBTTagList.isEmpty()) return;
        int n5 = (int)((long)-1491656481 ^ (long)-1491656481);
        while (n5 < nBTTagList.tagCount()) {
            short s = nBTTagList.getCompoundTagAt(n5).getShort("id");
            short s2 = nBTTagList.getCompoundTagAt(n5).getShort("lvl");
            Enchantment enchantment = Enchantment.getEnchantmentByID((int)s);
            if (enchantment != null) {
                String string = enchantment.getTranslatedName((int)s2).substring((int)((long)-1339441381 ^ (long)-1339441381), (int)-261768657L ^ 0xF065BA2E).toLowerCase();
                string = string + s2;
                GL11.glPushMatrix();
                GL11.glScalef((float)1.0f, (float)1.0f, (float)0.0f);
                if (s2 == ((int)-1874617141L ^ 0x90439CCA)) {
                    qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * ((int)((long)-656020667 ^ (long)-656020668) << 1) + (((int)-1893538500L ^ 0x8F22E539) << 1)), (float)n4, new Color(((int)813646624L ^ 0x307F4345) << 1, ((int)-1389356198L ^ 0xAD301B3F) << 1, ((int)-592188534L ^ 0xDCB3EBEF) << 1, (int)1430907689L ^ 0x5549EBD6).getRGB());
                } else if (s2 == (int)((long)333788163 ^ (long)333788162) << 1) {
                    qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * (((int)1247634813L ^ 0x4A5D657C) << 1) + ((int)((long)-1542872207 ^ (long)-1542872204) << 1)), (float)n4, new Color(((int)-252467060L ^ 0xF0F3A8F7) << 1, (int)((long)-2056363081 ^ (long)-2056363046) << 1, (int)-461097083L ^ 0xE48437A8, (int)((long)1715491003 ^ (long)1715490884)).getRGB());
                } else if (s2 == ((int)529405484L ^ 0x1F8E162F)) {
                    qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * ((int)((long)1623617986 ^ (long)1623617987) << 1) + (((int)-809445265L ^ 0xCFC0D86A) << 1)), (float)n4, new Color((int)((long)-243264809 ^ (long)-243264974), ((int)1305227668L ^ 0x4DCC3195) << 7, (int)-1573868972L ^ 0xA230AA54, (int)((long)1673365132 ^ (long)1673365107)).getRGB());
                } else if (s2 == ((int)1170202879L ^ 0x45BFE0FE) << 2) {
                    qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * (((int)1488751681L ^ 0x58BC8C40) << 1) + (((int)1344563200L ^ 0x50246805) << 1)), (float)n4, new Color((int)((long)1562076585 ^ (long)1562076558) << 2, (int)((long)-414154732 ^ (long)-414154705), (int)884029527L ^ 0x34B138AA, (int)86005544L ^ 0x52057D7).getRGB());
                } else {
                    qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer.drawStringWithShadow(string, (float)(n * (((int)942949815L ^ 0x383445B6) << 1) + (((int)-2134706768L ^ 0x80C2F5B5) << 1)), (float)n4, new Color((int)((long)2006811387 ^ (long)2006811156), (int)((long)-137886793 ^ (long)-137886793), (int)-185870186L ^ 0xF4EBD896, (int)1921380919L ^ 0x7285F2C8).getRGB());
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
        for (EntityPlayer entityPlayer : qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            if (this.Field12153.Method365()) {
                qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.getPlayerInfo(entityPlayer.getUniqueID()).getResponseTime();
            }
            if (entityPlayer != qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && qkNYXJCKlwt24osL04Z8YViGXY5uHOX0.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= (float)this.Field12145.Method335() && entityPlayer != vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity() && entityPlayer.isEntityAlive()) {
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
            if (this.Field12156 != (int)((long)-1085845808 ^ (long)-1085846391) || !this.Field12150.Method365()) continue;
            this.Field12157.remove(entityPlayer.getName());
            this.Field12158.remove(entityPlayer.getName());
        }
        if (this.Field12156 == ((int)833652123L ^ 0x31B087C2)) {
            this.Field12156 = (int)-810444977L ^ 0xCFB1974F;
        }
        this.Field12156 += (int)-2070066605L ^ 0x849D4A52;
        this.Field12159 = arrayList;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1192789550 ^ (long)-1192789550);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-496863662L ^ 0xE26276AD);
            int n2 = (int)-158029384L ^ 0xF694A99D;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1162491048L ^ 0xBAB5C24F) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

