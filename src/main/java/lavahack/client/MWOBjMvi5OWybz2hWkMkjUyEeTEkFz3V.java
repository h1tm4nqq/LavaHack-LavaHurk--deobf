//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.MWOBjMvi5OWybz2hWkMkjUyEeTEkFz3V$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/module/Debug/TextFieldTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "gui", "Lcom/kisman/cc/features/module/Debug/TextFieldTest$TestGui;", "getGui", "()Lcom/kisman/cc/features/module/Debug/TextFieldTest$TestGui;", "onEnable", "", "TestGui", "kisman.cc"})
public final class MWOBjMvi5OWybz2hWkMkjUyEeTEkFz3V
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @NotNull
    private final MWOBjMvi5OWybz2hWkMkjUyEeTEkFz3V$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16030 = new MWOBjMvi5OWybz2hWkMkjUyEeTEkFz3V$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field16031 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final MWOBjMvi5OWybz2hWkMkjUyEeTEkFz3V$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method6676() {
        return this.Field16030;
    }

    @Override
    public void Method38() {
        MWOBjMvi5OWybz2hWkMkjUyEeTEkFz3V.Method6677().displayGuiScreen((GuiScreen)this.Field16030);
        this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = (int)((long)1311383878 ^ (long)1311383878);
    }

    public MWOBjMvi5OWybz2hWkMkjUyEeTEkFz3V() {
        super("TextFieldTest", "Test of GuiTextField handler", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    public static final Minecraft Method6677() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method6678(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-585040957L ^ 0xDD20FBC3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)318762873 ^ (long)318762886);
            int n2 = (int)((long)1101787236 ^ (long)1101787243) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1925054796 ^ (long)1925054695) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

