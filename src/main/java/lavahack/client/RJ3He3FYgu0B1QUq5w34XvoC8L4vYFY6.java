//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiListExtended$IGuiListEntry
 *  net.minecraft.client.resources.DefaultPlayerSkin
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.util.Map;
import lavahack.client.d8NUi994osLCmt6QS9gn2nL3bytx8gy3;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6
implements GuiListExtended.IGuiListEntry {
    private Minecraft Field17098 = Minecraft.getMinecraft();
    private String Field17099;
    private String Field17100;
    private String Field17101;
    private YggdrasilUserAuthentication Field17102;
    private ResourceLocation Field17103 = new ResourceLocation("textures/misc/unknown_server.png");
    private ResourceLocation Field17104 = new ResourceLocation("textures/gui/world_selection.png");
    private String Field17105 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6(String string, String string2) {
        this.Field17099 = string;
        this.Field17100 = "";
        this.Field17101 = string2;
        this.Field17102 = d8NUi994osLCmt6QS9gn2nL3bytx8gy3.Method7474(string, string2, (boolean)((long)1738082897 ^ (long)1738082897));
    }

    public void updatePosition(int n, int n2, int n3, float f) {
    }

    public void drawEntry(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.Field17098.fontRenderer.drawStringWithShadow(this.Field17102.getSelectedProfile().getName(), (float)(n2 + (((int)-1287984665L ^ 0xB33AE9EE) << 2)), (float)(n3 + ((int)((long)1232900780 ^ (long)1232900781) << 1)), (int)((long)99889567 ^ (long)-99889568));
        this.Field17098.fontRenderer.drawStringWithShadow(this.Field17099, (float)(n2 + ((int)((long)-1080208198 ^ (long)-1080208205) << 2)), (float)(n3 + ((int)((long)86693783 ^ (long)86693780) << 2)), (int)((long)-1883202122 ^ (long)1883772222));
        this.Field17098.fontRenderer.drawStringWithShadow("Premium", (float)(n2 + ((int)((long)1873882572 ^ (long)1873882565) << 2)), (float)(n3 + (((int)451141173L ^ 0x1AE3DE3E) << 1)), (int)((long)-351599353 ^ (long)341768786));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation resourceLocation = DefaultPlayerSkin.getDefaultSkinLegacy();
        Map map = this.Field17098.getSkinManager().loadSkinFromCache(this.Field17102.getSelectedProfile());
        if (map.containsKey(MinecraftProfileTexture.Type.SKIN)) {
            resourceLocation = this.Field17098.getSkinManager().loadSkin((MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
        }
        this.Field17098.getTextureManager().bindTexture(resourceLocation);
        GL11.glEnable((int)((int)((long)358642424 ^ (long)358643465) << 1));
        Gui.drawModalRectWithCustomSizedTexture((int)n2, (int)n3, (float)0.0f, (float)0.0f, (int)(((int)1367301233L ^ 0x517F5C70) << 5), (int)(((int)-1996087503L ^ 0x89061F30) << 5), (float)Float.intBitsToFloat((int)((long)1067672250 ^ (long)2107859642)), (float)Float.intBitsToFloat((int)((long)503527834 ^ (long)1543715226)));
        GL11.glDisable((int)((int)((long)-1567867673 ^ (long)-1567868650) << 1));
        if (!bl) return;
        this.Field17098.getTextureManager().bindTexture(this.Field17104);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRect((int)n2, (int)n3, (int)(((int)-280996656L ^ 0xEF4054D1) << 5), (int)(((int)-254506753L ^ 0xF0D488FE) << 5), (int)((int)((long)-128366974 ^ (long)1489622546)));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Gui.drawModalRectWithCustomSizedTexture((int)(n2 - ((int)((long)1507165874 ^ (long)1507165873) << 1)), (int)(n3 + (int)((long)1445097837 ^ (long)1445097838)), (float)Float.intBitsToFloat(0x134A4381 ^ 0x514A4381), (float)Float.intBitsToFloat((int)914415003L ^ 0x76C0DD9B), (int)((int)((long)-1490267826 ^ (long)-1490267825) << 5), (int)((int)((long)-18083486 ^ (long)-18083485) << 5), (float)Float.intBitsToFloat((int)2123921032L ^ 0x3D187688), (float)Float.intBitsToFloat((int)((long)936852153 ^ (long)1951873721)));
    }

    public boolean mousePressed(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 > (int)((long)46247978 ^ (long)46247979) << 5) return ((int)-341128744L ^ 0xEBAAC9D8) != 0;
        if (n5 >= ((int)1246242475L ^ 0x4A4826AA) << 5) return ((int)-341128744L ^ 0xEBAAC9D8) != 0;
        d8NUi994osLCmt6QS9gn2nL3bytx8gy3.Method7474(this.Field17099, this.Field17101, ((int)-522017267L ^ 0xE0E2A60C) != 0);
        return (int)((long)301240655 ^ (long)301240654) != 0;
    }

    public void mouseReleased(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public String getName() {
        return this.Field17102.getSelectedProfile().getName();
    }

    public String getEmail() {
        return this.Field17099;
    }

    public String getPassword() {
        return this.Field17101;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-495862654 ^ (long)-495862654);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)891741458 ^ (long)891741677);
            int n2 = ((int)-1088961252L ^ 0xBF17C543) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)925018771 ^ (long)925010648) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

