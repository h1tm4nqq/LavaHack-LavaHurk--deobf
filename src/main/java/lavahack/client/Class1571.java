//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import java.lang.reflect.*;
import java.lang.annotation.*;

public class Class1571
{
    private String Field15326 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method6196(final Object o) {
        if (o.getClass().getAnnotation(Class614.class) == null) {
            return;
        }
        Arrays.stream(o.getClass().getDeclaredFields()).filter(Class1571::Method6199).filter(Class1571::Method6198).forEach(Class1571::Method6197);
    }
    
    private static void Method6197(final Object obj, final Field field) {
        field.setAccessible(true);
        Class1796.Field16241.Field16258.Method7569((Class44)field.get(obj));
    }
    
    private static boolean Method6198(final Field field) {
        return Class44.class.isAssignableFrom(field.getType());
    }
    
    private static boolean Method6199(final Field field) {
        return !field.isAnnotationPresent(Class2002.class);
    }
}
