//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import com.kisman.cc.util.*;
import net.minecraft.util.text.*;
import java.util.function.*;
import net.minecraft.client.gui.*;
import java.util.*;

public class Class1393
{
    private static final Minecraft Field14313;
    static final Map Field14314;
    private static final Class1740 Field14315;
    private static final Class1740 Field14316;
    private static final Class1740 Field14317;
    private static final Class1740 Field14318;
    private static final Class1740 Field14319;
    private int Field14320;
    
    private static void Method5502() {
        for (int size = Class1796.Field16241.Field16254.Field8854.size(), i = 0; i < size; ++i) {
            final Class42 class42 = Class1796.Field16241.Field16254.Field8854.get(i);
            Class1393.Field14314.put(class42.getClass(), class42);
        }
    }
    
    public static Class1740 Method5503() {
        Class1393.Field14315.Method1871(Class1150.Method4652());
        return Class1393.Field14315;
    }
    
    public static Class1740 Method5504() {
        Class1393.Field14316.Method1871(Class1150.Method4652());
        return Class1393.Field14316;
    }
    
    public static Class1740 Method5505() {
        Class1393.Field14317.Method1871(Class1150.Method4652());
        return Class1393.Field14317;
    }
    
    public static Class1740 Method5506() {
        Class1393.Field14318.Method1871(Class1150.Method4652());
        return Class1393.Field14318;
    }
    
    public static Class1740 Method5507() {
        Class1393.Field14319.Method1871(Class1150.Method4652());
        return Class1393.Field14319;
    }
    
    public static void Method5508(final String s) {
        Class1393.Field14313.ingameGUI.getChatGUI().printChatMessage((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    public static void Method5509(final ITextComponent textComponent) {
        Method5510(textComponent, 0);
    }
    
    public static void Method5510(final ITextComponent textComponent, final int n) {
        Method5511(Class1393::Method5513);
    }
    
    public static void Method5511(final Consumer consumer) {
        final GuiNewChat method5512 = Method5512();
        if (method5512 != null) {
            consumer.accept(method5512);
        }
    }
    
    public static GuiNewChat Method5512() {
        if (Class1393.Field14313.ingameGUI != null) {
            return Class1393.Field14313.ingameGUI.getChatGUI();
        }
        return null;
    }
    
    private static void Method5513(final ITextComponent textComponent, final int n, final GuiNewChat guiNewChat) {
        guiNewChat.printChatMessageWithOptionalDeletion(textComponent, n);
    }
    
    static {
        Field14315 = (Class1740)new Class1174();
        Field14316 = new Class704();
        Field14317 = new Class823();
        Field14318 = new Class388();
        Field14319 = new Class1869();
        Field14313 = Minecraft.getMinecraft();
        Field14314 = new HashMap(Class1796.Field16241.Field16254.Field8854.size());
        Method5502();
    }
}
