//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;
import net.minecraft.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/gui/GuiBlur;", "", "()V", "blurred", "", "getBlurred", "()Z", "setBlurred", "(Z)V", "update", "", "kisman.cc" })
public final class Class2023
{
    private boolean Field17305;
    private String Field17306 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final boolean Method7483() {
        return this.Field17305;
    }
    
    public final void Method7484(final boolean field17305) {
        this.Field17305 = field17305;
    }
    
    public final void Method7485() {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        if (getMinecraft.player == null || getMinecraft.world == null) {
            return;
        }
        if (getMinecraft.currentScreen instanceof Class1419 || getMinecraft.currentScreen instanceof Class2004 || getMinecraft.currentScreen instanceof Class264) {
            if (!this.Field17305) {
                getMinecraft.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
            }
        }
        else if (this.Field17305 && getMinecraft.player != null && getMinecraft.world != null) {
            getMinecraft.entityRenderer.getShaderGroup().deleteShaderGroup();
        }
        if ((!(getMinecraft.currentScreen instanceof Class1419) && !(getMinecraft.currentScreen instanceof Class2004) && !(getMinecraft.currentScreen instanceof Class264)) || !this.Field17305) {}
    }
    
    private static String Method7486(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xA56 ^ 0x49));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
