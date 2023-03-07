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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/client/ClientFixer;", "Lcom/kisman/cc/features/module/Module;", "()V", "onDisable", "", "onEnable", "kisman.cc"})
public final class TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static final TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E Field12992;
    private String Field12993 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        FontRenderer fontRenderer = TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E.Method4538().fontRenderer;
        if (fontRenderer == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorFontRenderer");
        }
        ((AccessorFontRenderer)fontRenderer).Method6040(new ResourceLocation("textures/font/ascii_fat.png"));
    }

    @Override
    public void Method39() {
        super.Method39();
        FontRenderer fontRenderer = TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E.Method4538().fontRenderer;
        if (fontRenderer == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.mixins.accessor.AccessorFontRenderer");
        }
        ((AccessorFontRenderer)fontRenderer).Method6040(new ResourceLocation("textures/font/ascii.png"));
    }

    private TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E() {
        super("ClientFixer", "Implementation of Client Fixer mod", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
    }

    static {
        TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E tZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E;
        Field12992 = tZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E = new TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E();
    }

    public static final Minecraft Method4538() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4539(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)464339485 ^ (long)464339485);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1249452156 ^ (long)-1249452165);
            int n2 = ((int)1884752353L ^ 0x7057099A) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1422431457L ^ 0x54C8AE5C) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

