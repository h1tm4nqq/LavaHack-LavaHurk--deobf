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

import com.kisman.cc.util.Class1150;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import lavahack.client.Class1174;
import lavahack.client.Class1740;
import lavahack.client.Class1796;
import lavahack.client.Class1869;
import lavahack.client.Class388;
import lavahack.client.Class42;
import lavahack.client.Class704;
import lavahack.client.Class823;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class Class1393 {
    private static final Minecraft Field14313;
    static final Map Field14314;
    private static final Class1740 Field14315;
    private static final Class1740 Field14316;
    private static final Class1740 Field14317;
    private static final Class1740 Field14318;
    private static final Class1740 Field14319;
    private int Field14320;

    private static void Method5502() {
        int n = Class1796.Field16241.Field16254.Field8854.size();
        int n2 = 0;
        while (n2 < n) {
            Class42 class42 = (Class42)Class1796.Field16241.Field16254.Field8854.get(n2);
            Field14314.put(class42.getClass(), class42);
            ++n2;
        }
    }

    public static Class1740 Method5503() {
        Field14315.Method1871(Class1150.Method4652());
        return Field14315;
    }

    public static Class1740 Method5504() {
        Field14316.Method1871(Class1150.Method4652());
        return Field14316;
    }

    public static Class1740 Method5505() {
        Field14317.Method1871(Class1150.Method4652());
        return Field14317;
    }

    public static Class1740 Method5506() {
        Field14318.Method1871(Class1150.Method4652());
        return Field14318;
    }

    public static Class1740 Method5507() {
        Field14319.Method1871(Class1150.Method4652());
        return Field14319;
    }

    public static void Method5508(String string) {
        Class1393.Field14313.ingameGUI.getChatGUI().printChatMessage((ITextComponent)new TextComponentTranslation(string, new Object[0]));
    }

    public static void Method5509(ITextComponent iTextComponent) {
        Class1393.Method5510(iTextComponent, 0);
    }

    public static void Method5510(ITextComponent iTextComponent, int n) {
        Class1393.Method5511(arg_0 -> Class1393.Method5513(iTextComponent, n, arg_0));
    }

    public static void Method5511(Consumer consumer) {
        GuiNewChat guiNewChat = Class1393.Method5512();
        if (guiNewChat == null) return;
        consumer.accept(guiNewChat);
    }

    public static GuiNewChat Method5512() {
        if (Class1393.Field14313.ingameGUI == null) return null;
        return Class1393.Field14313.ingameGUI.getChatGUI();
    }

    private static void Method5513(ITextComponent iTextComponent, int n, GuiNewChat guiNewChat) {
        guiNewChat.printChatMessageWithOptionalDeletion(iTextComponent, n);
    }

    static {
        Field14315 = new Class1174();
        Field14316 = new Class704();
        Field14317 = new Class823();
        Field14318 = new Class388();
        Field14319 = new Class1869();
        Field14313 = Minecraft.getMinecraft();
        Field14314 = new HashMap(Class1796.Field16241.Field16254.Field8854.size());
        Class1393.Method5502();
    }
}

