//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.stream.*;
import net.minecraft.util.text.*;
import com.mojang.realmsclient.gui.*;
import java.util.*;

public class Class554 extends Class158
{
    private String Field10352 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class554() {
        super("help");
    }
    
    public void Method443(final String s, final String[] array) {
        if (Class554.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.currentScreen instanceof Class264) {
            final List<Object> list = Class2045.Field17384.values().stream().sorted(Comparator.comparing((Function<? super Object, ? extends Comparable>)Class158::Method442)).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
            this.Method437("Command:");
            for (final Class158 class158 : list) {
                final String method2462 = Method2462(class158.Method442());
                final String method2463 = Method2462(class158.Method448());
                final String method2464 = Method2462(class158.Method447());
                new Class967(TextFormatting.GOLD + "> Command: " + method2462).Method167();
                new Class967(TextFormatting.GREEN + ">> Usage: " + TextFormatting.RESET + method2463).Method167();
                new Class967(TextFormatting.DARK_GREEN + ">> Description: " + TextFormatting.RESET + method2464).Method167();
            }
            return;
        }
        final List<Object> list2 = Class2045.Field17384.values().stream().sorted(Comparator.comparing((Function<? super Object, ? extends Comparable>)Class158::Method442)).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
        Class1393.Method5503().Method1892("Commands:");
        for (final Class158 class159 : list2) {
            final String method2465 = Method2462(class159.Method442());
            final String method2466 = Method2462(class159.Method448());
            final String method2467 = Method2462(class159.Method447());
            Class1393.Method5506().Method1875(ChatFormatting.GOLD + "> Command: " + method2465);
            Class1393.Method5506().Method1875(ChatFormatting.GREEN + ">> Usage: " + ChatFormatting.RESET + method2466);
            Class1393.Method5506().Method1875(ChatFormatting.DARK_GREEN + ">> Description: " + ChatFormatting.RESET + method2467);
        }
    }
    
    private static String Method2462(final String s) {
        return (s == null) ? "(not available)" : s;
    }
    
    public String Method447() {
        return "help of commands";
    }
    
    public String Method448() {
        return "help";
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5EBD ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
