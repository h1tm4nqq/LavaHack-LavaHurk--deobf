//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import com.mojang.authlib.yggdrasil.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.resources.*;
import com.mojang.authlib.minecraft.*;
import net.minecraft.client.gui.*;
import java.util.*;

public class Class1977 implements GuiListExtended$IGuiListEntry
{
    private Minecraft Field17098;
    private String Field17099;
    private String Field17100;
    private String Field17101;
    private YggdrasilUserAuthentication Field17102;
    private ResourceLocation Field17103;
    private ResourceLocation Field17104;
    private String Field17105 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1977(final String field17099, final String field17100) {
        this.Field17098 = Minecraft.getMinecraft();
        this.Field17103 = new ResourceLocation("textures/misc/unknown_server.png");
        this.Field17104 = new ResourceLocation("textures/gui/world_selection.png");
        this.Field17099 = field17099;
        this.Field17100 = "";
        this.Field17101 = field17100;
        this.Field17102 = Class2018.Method7474(field17099, field17100, false);
    }
    
    public void updatePosition(final int n, final int n2, final int n3, final float n4) {
    }
    
    public void drawEntry(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.Field17098.fontRenderer.drawStringWithShadow(this.Field17102.getSelectedProfile().getName(), (float)(n2 + 36), (float)(n3 + 2), -1);
        this.Field17098.fontRenderer.drawStringWithShadow(this.Field17099, (float)(n2 + 36), (float)(n3 + 12), -7829368);
        this.Field17098.fontRenderer.drawStringWithShadow("Premium", (float)(n2 + 36), (float)(n3 + 22), -11141291);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        ResourceLocation resourceLocation = DefaultPlayerSkin.getDefaultSkinLegacy();
        final Map loadSkinFromCache = this.Field17098.getSkinManager().loadSkinFromCache(this.Field17102.getSelectedProfile());
        if (loadSkinFromCache.containsKey(MinecraftProfileTexture$Type.SKIN)) {
            resourceLocation = this.Field17098.getSkinManager().loadSkin((MinecraftProfileTexture)loadSkinFromCache.get(MinecraftProfileTexture$Type.SKIN), MinecraftProfileTexture$Type.SKIN);
        }
        this.Field17098.getTextureManager().bindTexture(resourceLocation);
        GL11.glEnable(3042);
        Gui.drawModalRectWithCustomSizedTexture(n2, n3, 0.0f, 0.0f, 32, 32, Float.intBitsToFloat(1107296256), Float.intBitsToFloat(1107296256));
        GL11.glDisable(3042);
        if (b) {
            this.Field17098.getTextureManager().bindTexture(this.Field17104);
            Class753.drawRect(n2, n3, 32, 32, -1601138544);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            Gui.drawModalRectWithCustomSizedTexture(n2 - 6, n3 + 3, Float.intBitsToFloat(1107296256), Float.intBitsToFloat(1077936128), 32, 32, Float.intBitsToFloat(1132462080), Float.intBitsToFloat(1132462080));
        }
    }
    
    public boolean mousePressed(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n5 <= 32 && n5 < 32) {
            Class2018.Method7474(this.Field17099, this.Field17101, true);
            return true;
        }
        return false;
    }
    
    public void mouseReleased(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
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
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x204B ^ 0xBE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
