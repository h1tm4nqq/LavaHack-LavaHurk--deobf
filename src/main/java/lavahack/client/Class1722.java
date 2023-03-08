//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.objectweb.asm.*;
import java.util.*;

public class Class1722
{
    private String Field15921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static String Method6582(final String s, final String s2, final String s3, final Class1790 class1790) {
        final String method6583 = Method6583(s, s2, s3, class1790);
        return (method6583 == null) ? s2 : method6583;
    }
    
    private static String Method6583(final String anObject, final String s, final String anObject2, final Class1790 class1790) {
        final List<Class149> list = class1790.Method6771().get(s);
        if (list == null) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0).Method988();
        }
        double d2 = 0.0;
        Class149 class1791 = null;
        for (final Class149 class1792 : list) {
            double d3 = 0.0;
            if (class1792.Method989().equals(anObject2)) {
                ++d3;
            }
            if (class1792.Method987().equals(anObject)) {
                ++d3;
            }
            if (s.contains("_" + class1792.Method988())) {
                d3 += Double.longBitsToDouble(4602678819172646912L);
            }
            if (class1791 != null) {
                Double.compare(d3, d2);
            }
            else {
                d2 = d3;
                class1791 = class1792;
            }
        }
        return (class1791 == null) ? null : class1791.Method988();
    }
    
    public static List Method6584(final List list, final Class1790 class1790) {
        if (list == null) {
            return null;
        }
        final ArrayList<String> list2 = new ArrayList<String>(list.size());
        for (String s : list) {
            if (s instanceof String) {
                final String s2 = s;
                if (s2.startsWith("[")) {
                    s = Method6589(s2, class1790);
                }
                else {
                    s = class1790.Method6769().getOrDefault(s2, s2);
                }
            }
            list2.add(s);
        }
        return list2;
    }
    
    public static Handle Method6585(final Handle handle, final Class1790 class1790) {
        final String name = handle.getName();
        final String owner = handle.getOwner();
        final String desc = handle.getDesc();
        String method6583 = Method6583(owner, name, desc, class1790);
        if (method6583 == null) {
            method6583 = class1790.Method6770().getOrDefault(handle.getName(), handle.getName());
        }
        return new Handle(handle.getTag(), (String)class1790.Method6769().getOrDefault(owner, owner), method6583, Method6589(desc, class1790), handle.isInterface());
    }
    
    public static Type Method6586(final Type type, final Class1790 class1790) {
        return Type.getType(Method6589(type.getDescriptor(), class1790));
    }
    
    public static String[] Method6587(final String s) {
        final int lastIndex = s.lastIndexOf("/");
        return new String[] { s.substring(0, lastIndex), s.substring(lastIndex + 1) };
    }
    
    public static String[] Method6588(final String s) {
        final String[] split = s.split("(\\()");
        final int lastIndex = split[0].lastIndexOf("/");
        return new String[] { split[0].substring(0, lastIndex), split[0].substring(lastIndex + 1), "(" + split[1] };
    }
    
    public static String Method6589(final String s, final Class1790 class1790) {
        return Method6592(s, class1790, Method6591(s, ';'));
    }
    
    public static String Method6590(final String s, final Class1790 class1790) {
        return Method6592(s, class1790, Method6591(s, '<', ';'));
    }
    
    private static Set Method6591(final String s, final char... array) {
        final HashSet set = new HashSet();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'L') {}
        }
        return set;
    }
    
    private static String Method6592(final String s, final Class1790 class1790, final Set set) {
        String replace = s;
        for (final String target : set) {
            final String substring = target.substring(0, target.length() - 1);
            final String substring2 = target.substring(target.length() - 1);
            final String str = class1790.Method6769().get(substring);
            if (str != null) {
                replace = replace.replace(target, str + substring2);
            }
        }
        return replace;
    }
    
    private static String Method6593(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5483 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
