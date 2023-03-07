//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockShulkerBox
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.inventory.ItemStackHelper
 *  net.minecraft.item.ItemShulkerBox
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.NonNullList
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import java.awt.Color;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ahJMkUtzzEf7tJjbemx3021mGngs1J3z;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.BlockShulkerBox;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8379 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Container Shadow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1023438944L ^ 0xC2FF8FA0) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8380 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Item ESP", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)731408531 ^ (long)731408531)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8381 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Tool Tip", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8382 = this.Method23(this.Field8381.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shulkers", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1655729896 ^ (long)1655729896))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8383 = this.Method23(this.Field8381.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scrollable", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-207810188 ^ (long)-207810188))));
    public static Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye Field8384;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8385 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method826, new Predicate[(int)1417486402L ^ 0x547D2042]);
    private String Field8386 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye() {
        super("ContainerModifier", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        Field8384 = this;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field8385);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field8385);
    }

    private void Method825(ItemStack itemStack, int n, int n2) {
        NBTTagCompound nBTTagCompound = itemStack.getTagCompound();
        GlStateManager.enableBlend();
        GlStateManager.disableRescaleNormal();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        float f = Math.max((int)((long)-673427081 ^ (long)-673427074) << 4, fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(itemStack.getDisplayName()) + ((int)459808261L ^ 0x1B681E06));
        int n3 = n + ((int)((long)856594799 ^ (long)856594796) << 2);
        int n4 = n2 - ((int)((long)910650892 ^ (long)910650895) << 2);
        int n5 = ((int)((long)1591185921 ^ (long)1591185922) << 4) + fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
        Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = Float.intBitsToFloat((int)((long)659720365 ^ (long)1690601645));
        Color color = new Color(((BlockShulkerBox)((ItemShulkerBox)itemStack.getItem()).getBlock()).getColor().getColorValue());
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((long)1876773742 ^ (long)1876773669) << 1);
        GuiScreen.drawRect((int)(n3 - (int)((long)-1723388045 ^ (long)-1723388048)), (int)(n4 - ((int)-1140856968L ^ 0xBBFFE77B)), (int)((int)((float)n3 + f + Float.intBitsToFloat(0x164FC53 ^ 0x4124FC53))), (int)(n4 + n5 + (int)((long)-142315007 ^ (long)-142315006)), (int)color2.getRGB());
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(itemStack.getDisplayName(), n + (((int)-16165432L ^ 0xFF0955CB) << 2), n2 - ((int)((long)-1040292176 ^ (long)-1040292173) << 2), (int)((long)684111612 ^ (long)-684111613));
        GlStateManager.enableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.enableTexture2D();
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        RenderHelper.enableGUIStandardItemLighting();
        if (nBTTagCompound != null) {
            NBTTagCompound nBTTagCompound2 = nBTTagCompound.getCompoundTag("BlockEntityTag");
            NonNullList nonNullList = NonNullList.withSize((int)((int)-653984198L ^ 0xD904FE21), (Object)ItemStack.EMPTY);
            ItemStackHelper.loadAllItems((NBTTagCompound)nBTTagCompound2, (NonNullList)nonNullList);
            for (int i = (int)((long)-1517694177 ^ (long)-1517694177); i < nonNullList.size(); ++i) {
                int n6 = n + i % ((int)1135643765L ^ 0x43B08C7C) * ((int)((long)-1221602567 ^ (long)-1221602568) << 4) + ((int)-488242242L ^ 0xE2E603B5);
                int n7 = n2 + i / ((int)1126326271L ^ 0x43225FF6) * (((int)-1983392299L ^ 0x89C7D5D4) << 4) - (int)((long)1747265356 ^ (long)1747265351) + (((int)-1337231525L ^ 0xB04B775A) << 3);
                ItemStack itemStack2 = (ItemStack)nonNullList.get(i);
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemAndEffectIntoGUI(itemStack2, n6, n7);
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().renderItemOverlayIntoGUI(Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.fontRenderer, itemStack2, n6, n7, null);
            }
        }
        RenderHelper.disableStandardItemLighting();
        Rh5xLxOy3QHVr6kAVhiXwDszrGnrU2ye.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderItem().zLevel = 0.0f;
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.enableRescaleNormal();
    }

    private void Method826(ahJMkUtzzEf7tJjbemx3021mGngs1J3z ahJMkUtzzEf7tJjbemx3021mGngs1J3z2) {
        if (this.Field8382.Method365() && ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9200.getItem() instanceof ItemShulkerBox) {
            this.Method825(ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9200, ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9201, ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9202);
            ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Method158();
            return;
        }
        if (!this.Field8383.Method365()) return;
        if (ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9202 >= 0) return;
        int n = Mouse.getDWheel();
        if (n == 0) return;
        if (null.Field11783.Method365() && Keyboard.isKeyDown((int)null.Field11784.Method337())) {
            ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9201 = n < 0 ? ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9201 + ((int)((long)-1752652626 ^ (long)-1752652629) << 1) : ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9201 - ((int)((long)1773505321 ^ (long)1773505324) << 1);
            return;
        }
        ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9201 = n < 0 ? ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9201 - (((int)1134848138L ^ 0x43A4688F) << 1) : ahJMkUtzzEf7tJjbemx3021mGngs1J3z2.Field9201 + (((int)1227137440L ^ 0x4924A1A5) << 1);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1148937573 ^ (long)-1148937573);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1094633137L ^ 0x413EC64E);
            int n2 = (int)-261900868L ^ 0xF063B55B;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1667200392L ^ 0x9CA0B00D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

