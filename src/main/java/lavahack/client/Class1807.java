//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.io.*;
import java.net.*;
import java.util.*;

abstract class Class1807
{
    final Set Field16315;
    ClassLoader Field16316;
    Predicate[] Field16317;
    Class750 Field16318;
    private String Field16319 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1807(final ClassLoader classLoader, final Set field16315) {
        this.Field16316 = ((classLoader != null) ? classLoader : this.Method2952());
        this.Field16315 = field16315;
    }
    
    final ClassLoader Method2950() {
        return this.Field16316;
    }
    
    final void Method2951(final ClassLoader classLoader) {
        this.Field16316 = ((classLoader != null) ? classLoader : this.Method2952());
    }
    
    ClassLoader Method2952() {
        return Thread.currentThread().getContextClassLoader();
    }
    
    String Method2953(final String s) {
        return s.replace('.', '/') + ".class";
    }
    
    String Method2954(final String s) {
        return s.replace('.', '/');
    }
    
    Class787 Method2955(final File file) {
        return new Class787(file, this.Field16316);
    }
    
    Class1695 Method2956(final JarURLConnection jarURLConnection) {
        return new Class1695(jarURLConnection, this.Field16316);
    }
    
    Class18 Method2957(final String s) {
        return new Class18(s, this.Field16316);
    }
    
    Class1807 Method2958(final Predicate[] field16317) {
        this.Field16317 = field16317;
        return this;
    }
    
    Class1807 Method2959(final Class750 field16318) {
        this.Field16318 = field16318;
        return this;
    }
    
    boolean Method2960(final Object o) {
        if (this.Field16317.length < 1) {
            return true;
        }
        final Predicate[] field16317 = this.Field16317;
        for (int length = field16317.length, i = 0; i < length; ++i) {
            if (!field16317[i].test(o)) {
                return false;
            }
        }
        return true;
    }
    
    boolean Method2961(final Class clazz, final Class clazz2) {
        return clazz2.isAssignableFrom(clazz);
    }
    
    abstract List Method2962(final String p0);
    
    abstract List Method2963(final String p0);
    
    abstract Class1655 Method2964(final Class p0);
    
    abstract Class1655 Method2965(final String p0);
    
    abstract Class1655 Method2966(final Package p0);
    
    abstract Class1655 Method2967(final String p0);
    
    abstract Class1655 Method2968(final String p0);
    
    private static String Method2969(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x54C6 ^ 0xDF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
