//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.io.*;
import java.net.*;

class Class710 extends Class1807
{
    private final Class Field11024;
    private int Field11025;
    
    Class710(final ClassLoader classLoader, final Class field11024, final Set set) {
        super(classLoader, set);
        this.Field11024 = field11024;
    }
    
    List Method2962(final String s) {
        return this.Method2970(s, false);
    }
    
    List Method2963(final String s) {
        return this.Method2970(s, true);
    }
    
    private List Method2970(final String s, final boolean b) {
        final ArrayList list = new ArrayList();
        this.Method2971(((Class787)this.Method2967(s)).Method3276(), s, list, b);
        return list;
    }
    
    private void Method2971(final File parent, final String s, final List list, final boolean b) {
        if (!parent.exists() || !parent.isDirectory()) {
            return;
        }
        final String[] list2 = parent.list();
        if (list2 == null) {
            return;
        }
        for (final String s2 : list2) {
            final File file = new File(parent, s2);
            if (b && file.isDirectory()) {
                this.Method2971(file, s + "." + s2, list, true);
            }
            if (s2.endsWith(".class")) {
                final String string = s + "." + s2.substring(0, s2.length() - 6);
                final Class<?> forName = Class.forName(string);
                if (!this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(string)) {
                    final Object method3132 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(forName);
                    if (this.Method2961((Class)method3132.getClass(), this.Field11024)) {
                        final Object o = method3132;
                        if (this.Method2960(o)) {
                            list.add(o);
                        }
                    }
                }
            }
        }
    }
    
    Class1655 Method2964(final Class clazz) {
        return this.Method2965(clazz.getName());
    }
    
    Class1655 Method2965(final String name) {
        Class.forName(name, false, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        final URL resource = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(this.Method2953(name));
        if (resource == null) {
            return null;
        }
        return this.Method2955(new File(resource.getPath()));
    }
    
    Class1655 Method2966(final Package package1) {
        return this.Method2967(package1.getName());
    }
    
    Class1655 Method2967(final String name) {
        if (Package.getPackage(name) == null) {
            return null;
        }
        final URL resource = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(this.Method2954(name));
        if (resource == null) {
            return null;
        }
        return this.Method2955(new File(resource.getPath()));
    }
    
    Class1655 Method2968(final String name) {
        if (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(name) == null) {
            return null;
        }
        return (Class1655)this.Method2957(name);
    }
    
    private static String Method2969(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2001 ^ 0x29));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
