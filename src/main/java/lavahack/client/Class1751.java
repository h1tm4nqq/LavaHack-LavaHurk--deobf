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
import lavahack.client.Class2127;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/module/Debug/TextFieldTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "gui", "Lcom/kisman/cc/features/module/Debug/TextFieldTest$TestGui;", "getGui", "()Lcom/kisman/cc/features/module/Debug/TextFieldTest$TestGui;", "onEnable", "", "TestGui", "kisman.cc"})
public final class Class1751
extends Class42 {
    @NotNull
    private final Class2127 Field16030 = new Class2127();
    private String Field16031 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class2127 Method6676() {
        return this.Field16030;
    }

    @Override
    public void Method38() {
        Class1751.Method6677().displayGuiScreen((GuiScreen)this.Field16030);
        this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = false;
    }

    public Class1751() {
        super("TextFieldTest", "Test of GuiTextField handler", Class97.Field8345);
    }

    public static final Minecraft Method6677() {
        return Class42.Field8052;
    }

    public static final void Method6678(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 120;
            cArray2[n] = (char)(cArray[n] ^ (0x1AB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

