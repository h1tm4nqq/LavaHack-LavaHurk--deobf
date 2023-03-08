//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.jar.*;
import java.util.*;
import java.net.*;

class Class1020 extends Class1807
{
    private final Class Field12433;
    private int Field12434;
    
    Class1020(final ClassLoader classLoader, final Class field12433, final Set set) {
        super(classLoader, set);
        this.Field12433 = field12433;
    }
    
    @Override
    List Method2962(final String s) {
        return this.Method4136(s, false);
    }
    
    @Override
    List Method2963(final String s) {
        return this.Method4136(s, true);
    }
    
    private List Method4136(final String s, final boolean b) {
        final ArrayList list = new ArrayList();
        final Class1695 class1695 = (Class1695)this.Method2967(s);
        if (class1695 == null) {
            return list;
        }
        final JarFile method6502 = class1695.Method6502();
        if (method6502 == null) {
            return list;
        }
        this.Method4137(s, method6502, list, b);
        return list;
    }
    
    private void Method4137(final String s, final JarFile jarFile, final List list, final boolean b) {
        final Enumeration<JarEntry> entries = jarFile.entries();
        JarEntry jarEntry;
        while (entries.hasMoreElements() && (jarEntry = entries.nextElement()) != null) {
            final String name = jarEntry.getName();
            if (!name.endsWith(".class")) {
                continue;
            }
            final String substring = name.replace('/', '.').substring(0, name.length() - 6);
            if (b) {
                if (!substring.startsWith(s)) {
                    continue;
                }
                final Class<?> forName = Class.forName(substring);
                if (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(substring)) {
                    continue;
                }
                final Object method3132 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(forName);
                if (!this.Method2961(method3132.getClass(), this.Field12433)) {
                    continue;
                }
                final Object o = method3132;
                if (!this.Method2960(o)) {
                    continue;
                }
                list.add(o);
            }
            else {
                if (!substring.startsWith(s)) {
                    continue;
                }
                if (substring.lastIndexOf(46) > s.length()) {
                    continue;
                }
                final Class<?> forName2 = Class.forName(substring);
                if (this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.contains(substring)) {
                    continue;
                }
                final Object method3133 = this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3132(forName2);
                if (!this.Method2961(method3133.getClass(), this.Field12433)) {
                    continue;
                }
                final Object o2 = method3133;
                if (!this.Method2960(o2)) {
                    continue;
                }
                list.add(o2);
            }
        }
    }
    
    @Override
    Class1655 Method2964(final Class clazz) {
        return this.Method2965(clazz.getName());
    }
    
    @Override
    Class1655 Method2965(final String name) {
        Class.forName(name, false, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        final URL resource = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(this.Method2953(name));
        if (resource == null) {
            return null;
        }
        return this.Method2956((JarURLConnection)resource.openConnection());
    }
    
    @Override
    Class1655 Method2966(final Package package1) {
        return this.Method2967(package1.getName());
    }
    
    @Override
    Class1655 Method2967(final String name) {
        if (Package.getPackage(name) == null) {
            return null;
        }
        final URL resource = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(this.Method2954(name));
        if (resource == null) {
            return null;
        }
        return this.Method2956((JarURLConnection)resource.openConnection());
    }
    
    @Override
    Class1655 Method2968(final String name) {
        if (this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getResource(name) == null) {
            return null;
        }
        return this.Method2957(name);
    }
    
    private static String Method2969(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x19B7 ^ 0x9A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
