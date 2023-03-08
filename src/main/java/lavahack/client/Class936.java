//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;

public enum Class936 implements Class2142
{
    Field11994("CHECKED_CHECKBOX", 0, new ResourceLocation("kismancc:icons/enabled1.png")), 
    Field11995("LOGO", 1, new ResourceLocation("kismancc:icons/logo.png")), 
    Field11996("LOGO_NEW", 2, new ResourceLocation("kismancc:icons/sex.png")), 
    Field11997("COLOR_PICKER", 3, new ResourceLocation("kismancc:icons/color-picker.png")), 
    Field11998("LOADING_SCREEN_IMAGE", 4, new ResourceLocation("kismancc:icons/loadingscreen.png"));
    
    public final ResourceLocation Field11999;
    private static final Class936[] Field12000;
    private String Field12001 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class936(final String name, final int ordinal, final ResourceLocation field11999) {
        this.Field11999 = field11999;
    }
    
    public void Method3868(final double n, final double n2, final double n3, final double n4) {
        this.Method3869(n, n2, n3, n4, new Class2027(-1));
    }
    
    public void Method3869(final double n, final double n2, final double n3, final double n4, final Class2027 class2027) {
        GL11.glPushMatrix();
        Class936.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getTextureManager().bindTexture(this.Field11999);
        GL11.glColor4f(class2027.Field17325, class2027.Field17326, class2027.Field17327, class2027.Field17328);
        Class753.drawModalRectWithCustomSizedTexture(n, n2, 0.0f, 0.0f, n3, n4, n3, n4);
        GL11.glPopMatrix();
    }
    
    static {
        Field12000 = new Class936[] { Class936.Field11994, Class936.Field11995, Class936.Field11996, Class936.Field11997, Class936.Field11998 };
    }
    
    private static String Method3870(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x255A ^ 0x94));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
