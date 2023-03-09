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
import lavahack.client.Class2018;
import lavahack.client.Class753;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class Class1977
implements GuiListExtended.IGuiListEntry {
    private Minecraft Field17098 = Minecraft.getMinecraft();
    private String Field17099;
    private String Field17100;
    private String Field17101;
    private YggdrasilUserAuthentication Field17102;
    private ResourceLocation Field17103 = new ResourceLocation("textures/misc/unknown_server.png");
    private ResourceLocation Field17104 = new ResourceLocation("textures/gui/world_selection.png");
    private String Field17105 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1977(String string, String string2) {
        this.Field17099 = string;
        this.Field17100 = "";
        this.Field17101 = string2;
        this.Field17102 = Class2018.Method7474(string, string2, false);
    }

    public void updatePosition(int n, int n2, int n3, float f) {
    }

    public void drawEntry(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.Field17098.fontRenderer.drawStringWithShadow(this.Field17102.getSelectedProfile().getName(), (float)(n2 + 36), (float)(n3 + 2), -1);
        this.Field17098.fontRenderer.drawStringWithShadow(this.Field17099, (float)(n2 + 36), (float)(n3 + 12), -7829368);
        this.Field17098.fontRenderer.drawStringWithShadow("Premium", (float)(n2 + 36), (float)(n3 + 22), -11141291);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        ResourceLocation resourceLocation = DefaultPlayerSkin.getDefaultSkinLegacy();
        Map map = this.Field17098.getSkinManager().loadSkinFromCache(this.Field17102.getSelectedProfile());
        if (map.containsKey(MinecraftProfileTexture.Type.SKIN)) {
            resourceLocation = this.Field17098.getSkinManager().loadSkin((MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
        }
        this.Field17098.getTextureManager().bindTexture(resourceLocation);
        GL11.glEnable((int)3042);
        Gui.drawModalRectWithCustomSizedTexture((int)n2, (int)n3, (float)0.0f, (float)0.0f, (int)32, (int)32, (float)Float.intBitsToFloat(0x42000000), (float)Float.intBitsToFloat(0x42000000));
        GL11.glDisable((int)3042);
        if (!bl) return;
        this.Field17098.getTextureManager().bindTexture(this.Field17104);
        Class753.drawRect((int)n2, (int)n3, (int)32, (int)32, (int)-1601138544);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Gui.drawModalRectWithCustomSizedTexture((int)(n2 - 6), (int)(n3 + 3), (float)Float.intBitsToFloat(0x42000000), (float)Float.intBitsToFloat(0x40400000), (int)32, (int)32, (float)Float.intBitsToFloat(1132462080), (float)Float.intBitsToFloat(1132462080));
    }

    public boolean mousePressed(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 > 32) return false;
        if (n5 >= 32) return false;
        Class2018.Method7474(this.Field17099, this.Field17101, true);
        return true;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 190;
            cArray2[n] = (char)(cArray[n] ^ (0x204B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

