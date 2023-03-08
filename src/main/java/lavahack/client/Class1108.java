//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.mixin.mixins.accessor.*;
import net.minecraft.util.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016?\u0006\u0006" }, d2 = { "Lcom/kisman/cc/features/module/client/ClientFixer;", "Lcom/kisman/cc/features/module/Module;", "()V", "onDisable", "", "onEnable", "kisman.cc" })
public final class Class1108 extends Class42
{
    public static final Class1108 Field12992;
    private String Field12993 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        super.Method38();
        final FontRenderer fontRenderer = Method4538().fontRenderer;
        if (fontRenderer == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorFontRenderer");
        }
        ((AccessorFontRenderer)fontRenderer).Method6040(new ResourceLocation("textures/font/ascii_fat.png"));
    }
    
    @Override
    public void Method39() {
        super.Method39();
        final FontRenderer fontRenderer = Method4538().fontRenderer;
        if (fontRenderer == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorFontRenderer");
        }
        ((AccessorFontRenderer)fontRenderer).Method6040(new ResourceLocation("textures/font/ascii.png"));
    }
    
    private Class1108() {
        super("ClientFixer", "Implementation of Client Fixer mod", Class97.Field8339);
    }
    
    static {
        Field12992 = new Class1108();
    }
    
    public static final Minecraft Method4538() {
        return Class42.Field8052;
    }
    
    public static final void Method4539(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x757A ^ 0xF6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
