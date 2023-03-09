//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorFontRenderer;
import kotlin.Metadata;
import kotlin.TypeCastException;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/client/ClientFixer;", "Lcom/kisman/cc/features/module/Module;", "()V", "onDisable", "", "onEnable", "kisman.cc"})
public final class Class1108
extends Class42 {
    public static final Class1108 Field12992;
    private String Field12993 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        FontRenderer fontRenderer = Class1108.Method4538().fontRenderer;
        if (fontRenderer == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorFontRenderer");
        }
        ((AccessorFontRenderer)fontRenderer).Method6040(new ResourceLocation("textures/font/ascii_fat.png"));
    }

    @Override
    public void Method39() {
        super.Method39();
        FontRenderer fontRenderer = Class1108.Method4538().fontRenderer;
        if (fontRenderer == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorFontRenderer");
        }
        ((AccessorFontRenderer)fontRenderer).Method6040(new ResourceLocation("textures/font/ascii.png"));
    }

    private Class1108() {
        super("ClientFixer", "Implementation of Client Fixer mod", Class97.Field8339);
    }

    static {
        Class1108 class1108;
        Field12992 = class1108 = new Class1108();
    }

    public static final Minecraft Method4538() {
        return Class42.Field8052;
    }

    public static final void Method4539(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 246;
            cArray2[n] = (char)(cArray[n] ^ (0x757A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

