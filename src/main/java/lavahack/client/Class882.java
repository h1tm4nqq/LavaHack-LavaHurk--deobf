//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.*;

public final class Class882
{
    private String Field11711 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static List Method3681(final Class clazz, final String s) {
        return new Class63(clazz).Method609(s);
    }
    
    public static List Method3682(final Class clazz, final String s) {
        return new Class63(clazz).Method610(s);
    }
    
    public static void Method3683(final List list, final Class clazz, final String s, final Function function) {
        final Iterator<Object> iterator = new Class63(clazz).Method609(s).iterator();
        while (iterator.hasNext()) {
            list.add(function.apply(iterator.next()));
        }
    }
    
    public static void Method3684(final List list, final Class clazz, final String s, final Function function) {
        final Iterator<Object> iterator = new Class63(clazz).Method610(s).iterator();
        while (iterator.hasNext()) {
            list.add(function.apply(iterator.next()));
        }
    }
}
