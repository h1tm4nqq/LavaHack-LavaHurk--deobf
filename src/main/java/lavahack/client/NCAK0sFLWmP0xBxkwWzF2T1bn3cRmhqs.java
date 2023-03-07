//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiNewChat
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 */
package lavahack.client;

import com.kisman.cc.util.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import lavahack.client.AjBmyKpzQVGYEFjSFHe4ojZSKrgkuhpj;
import lavahack.client.JyEqsJUAppboUuQpm7W7NU8HdHDl24C9;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YHpT2zKPEKmMmU8whZa1fJFTMPIfbykX;
import lavahack.client.fo73Z5e8TpdyudhbHc7qwFR4O908RcBz;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.mzU9GQNMqhLmTfolJ1ZjR9TCXEwNAe1x;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs {
    private static final Minecraft Field14313;
    static final Map Field14314;
    private static final gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Field14315;
    private static final gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Field14316;
    private static final gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Field14317;
    private static final gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Field14318;
    private static final gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Field14319;
    private int Field14320;

    private static void Method5502() {
        int n = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.size();
        int n2 = (int)-724791537L ^ 0xD4CC8F0F;
        while (n2 < n) {
            WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.get(n2);
            Field14314.put(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.getClass(), wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
            ++n2;
        }
    }

    public static gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Method5503() {
        Field14315.Method1871(x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk.Method4652());
        return Field14315;
    }

    public static gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Method5504() {
        Field14316.Method1871(x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk.Method4652());
        return Field14316;
    }

    public static gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Method5505() {
        Field14317.Method1871(x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk.Method4652());
        return Field14317;
    }

    public static gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Method5506() {
        Field14318.Method1871(x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk.Method4652());
        return Field14318;
    }

    public static gIvxvpNAI6XugtMxK19p7peBbgdbr5DL Method5507() {
        Field14319.Method1871(x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk.Method4652());
        return Field14319;
    }

    public static void Method5508(String string) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Field14313.ingameGUI.getChatGUI().printChatMessage((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-248827829 ^ (long)-248827829)]));
    }

    public static void Method5509(ITextComponent iTextComponent) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5510(iTextComponent, (int)((long)1081465978 ^ (long)1081465978));
    }

    public static void Method5510(ITextComponent iTextComponent, int n) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5511(arg_0 -> NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5513(iTextComponent, n, arg_0));
    }

    public static void Method5511(Consumer consumer) {
        GuiNewChat guiNewChat = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5512();
        if (guiNewChat == null) return;
        consumer.accept(guiNewChat);
    }

    public static GuiNewChat Method5512() {
        if (NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Field14313.ingameGUI == null) return null;
        return NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Field14313.ingameGUI.getChatGUI();
    }

    private static void Method5513(ITextComponent iTextComponent, int n, GuiNewChat guiNewChat) {
        guiNewChat.printChatMessageWithOptionalDeletion(iTextComponent, n);
    }

    static {
        Field14315 = new fo73Z5e8TpdyudhbHc7qwFR4O908RcBz();
        Field14316 = new mzU9GQNMqhLmTfolJ1ZjR9TCXEwNAe1x();
        Field14317 = new YHpT2zKPEKmMmU8whZa1fJFTMPIfbykX();
        Field14318 = new AjBmyKpzQVGYEFjSFHe4ojZSKrgkuhpj();
        Field14319 = new JyEqsJUAppboUuQpm7W7NU8HdHDl24C9();
        Field14313 = Minecraft.getMinecraft();
        Field14314 = new HashMap(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.size());
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5502();
    }
}

