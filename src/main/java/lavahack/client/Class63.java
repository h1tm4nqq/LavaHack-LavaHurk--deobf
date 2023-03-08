//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.net.*;
import java.util.*;

public final class Class63
{
    private final Set Field8210;
    private ClassLoader Field8211;
    private final Class Field8212;
    private Predicate[] Field8213;
    private Class750 Field8214;
    private String Field8215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class63(final Class field8212) {
        this.Field8211 = Thread.currentThread().getContextClassLoader();
        this.Field8212 = field8212;
        this.Field8210 = new HashSet(32);
        this.Field8213 = new Predicate[0];
        this.Field8214 = Class750.Method3133();
    }
    
    public Class63(final Class field8212, final ClassLoader field8213) {
        this.Field8211 = field8213;
        this.Field8212 = field8212;
        this.Field8210 = new HashSet(32);
        this.Field8213 = new Predicate[0];
        this.Field8214 = Class750.Method3133();
    }
    
    @Class1638
    @Class1638
    public Class63(final ClassLoader field8211, final Object... array) {
        this.Field8211 = field8211;
        this.Field8212 = array.getClass().getComponentType();
        this.Field8210 = new HashSet(32);
        this.Field8213 = new Predicate[0];
        this.Field8214 = Class750.Method3133();
    }
    
    @Class1638
    @Class1638
    public Class63(final Object... array) {
        this.Field8211 = Thread.currentThread().getContextClassLoader();
        this.Field8212 = array.getClass().getComponentType();
        this.Field8210 = new HashSet(32);
        this.Field8213 = new Predicate[0];
        this.Field8214 = Class750.Method3133();
    }
    
    Class1807 Method600(final URL url) {
        if (url == null) {
            return new Class969(this.Field8211);
        }
        final String protocol = url.getProtocol();
        if (protocol.equals("file")) {
            return new Class710(this.Field8211, this.Field8212, this.Field8210);
        }
        if (protocol.equals("jar")) {
            return (Class1807)new Class1020(this.Field8211, this.Field8212, this.Field8210);
        }
        return new Class969(this.Field8211);
    }
    
    Class1807 Method601(final String s) {
        return this.Method600(this.Field8211.getResource(s.replace('.', '/')));
    }
    
    Class1807 Method602(final String s) {
        return this.Method600(this.Field8211.getResource(s.replace('.', '/') + ".class"));
    }
    
    Class1807 Method603(final String name) {
        return this.Method600(this.Field8211.getResource(name));
    }
    
    private boolean Method604(final String name) {
        Class.forName(name, false, this.Field8211);
        return true;
    }
    
    public ClassLoader Method605() {
        return this.Field8211;
    }
    
    public ClassLoader Method606(final ClassLoader classLoader) {
        return this.Field8211 = ((classLoader != null) ? classLoader : Thread.currentThread().getContextClassLoader());
    }
    
    public void Method607(final Class750 field8214) {
        this.Field8214 = field8214;
    }
    
    @SafeVarargs
    @SafeVarargs
    public final void Method608(final Predicate... field8213) {
        this.Field8213 = field8213;
    }
    
    public List Method609(final String s) {
        return this.Method601(s).Method2958(this.Field8213).Method2959(this.Field8214).Method2962(s);
    }
    
    public List Method610(final String s) {
        return this.Method601(s).Method2958(this.Field8213).Method2959(this.Field8214).Method2963(s);
    }
    
    public Object Method611(final Class clazz) {
        final Object method3132 = this.Field8214.Method3132(clazz);
        if (this.Field8212.isAssignableFrom(method3132.getClass())) {
            return method3132;
        }
        return null;
    }
    
    public Object Method612(final String className) {
        final Object method3132 = this.Field8214.Method3132(Class.forName(className));
        if (this.Field8212.isAssignableFrom(method3132.getClass())) {
            return method3132;
        }
        return null;
    }
    
    public void Method613(final Class clazz) {
        this.Field8210.add(clazz.getName());
    }
    
    public void Method614(final String s) {
        if (!this.Method604(s)) {
            return;
        }
        this.Field8210.add(s);
    }
    
    public void Method615(final Class clazz) {
        this.Field8210.remove(clazz.getName());
    }
    
    public void Method616(final String s) {
        if (!this.Method604(s)) {
            return;
        }
        this.Field8210.remove(s);
    }
    
    public Class1655 Method617(final Class clazz) {
        return this.Method602(clazz.getName()).Method2964(clazz);
    }
    
    public Class1655 Method618(final String s) {
        return this.Method602(s).Method2965(s);
    }
    
    public Class1655 Method619(final Package package1) {
        return this.Method601(package1.getName()).Method2966(package1);
    }
    
    public Class1655 Method620(final String s) {
        return this.Method601(s).Method2967(s);
    }
    
    public Class1655 Method621(final String s) {
        return this.Method603(s).Method2968(s);
    }
    
    private static String Method622(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5A07 ^ 0x3D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
