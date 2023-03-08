//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import java.util.*;

public class Class1628 extends Class158
{
    private int Field15607;
    
    public Class1628() {
        super("macro");
    }
    
    public String Method447() {
        return "";
    }
    
    public String Method448() {
        return "";
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        final String method6360 = Method6360(array);
        final String substring = method6360.substring(method6360.indexOf(40) + 1, method6360.indexOf(41));
        final String[] split = method6360.substring(method6360.indexOf(123) + 1, method6360.indexOf(125)).split(":");
        final String trim = split[0].trim();
        final String trim2 = split[1].trim();
        final Class1866 method6361 = Class1424.Method5688(trim);
        if (method6361 == null) {
            Method6361("[MacroCommand] " + trim + " is an invalid macro");
            return;
        }
        final Class1164 method6362 = method6361.Method6962(trim2);
        final String[] split2 = method6360.substring(method6360.indexOf(91) + 1, method6360.indexOf(93)).split(",");
        final ArrayList<Class488> list = new ArrayList<Class488>();
        final String[] array2 = split2;
        for (int length = array2.length, i = 0; i < length; ++i) {
            final String[] split3 = array2[i].trim().split(":");
            final String trim3 = split3[0].trim();
            final String trim4 = split3[1].trim();
            final Class2099 method6363 = Class1127.Method4617(trim3);
            if (method6363 == null) {
                Method6361("[MacroCommand] " + trim3 + " is an invalid activator");
                return;
            }
            list.add(method6363.Method7634(trim4, method6362));
        }
        final Class1255 class1255 = new Class1255(substring, method6362, (List)list);
        class1255.Method5065();
        Class82.Method729(class1255);
    }
    
    private static String Method6360(final String[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; ++i) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    
    private static void Method6361(final String s) {
        Class1796.Field16243.error(s);
        Class1393.Method5504().Method1882(s);
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7073 ^ 0x23));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
