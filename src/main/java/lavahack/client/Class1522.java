//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import java.util.function.*;
import java.lang.reflect.*;
import java.util.*;

class Class1522 implements Class323
{
    private final Map Field15112;
    private final Map Field15113;
    private int Field15114;
    
    public Class1522() {
        this.Field15112 = new ConcurrentHashMap(128);
        this.Field15113 = new ConcurrentHashMap(256);
    }
    
    @Override
    public void Method1633(final Class clazz) {
        this.Method6050(clazz, null);
    }
    
    @Override
    public void Method1634(final Object o) {
        this.Method6050(o.getClass(), o);
    }
    
    private void Method6050(final Class clazz, final Object o) {
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int length = declaredMethods.length, i = 0; i < length; ++i) {
            final Class1528 class1528 = new Class1528(declaredMethods[i], o);
            final Class996 method4027 = Class996.Method4027(class1528);
            if (method4027 != null) {
                final List<Class996> list = this.Field15112.computeIfAbsent(method4027.Method4030(), Class1522::Method6054);
                list.add(method4027);
                list.sort(Comparator.comparingInt((ToIntFunction<? super Class996>)Class1522::Method6053));
                this.Field15113.put(class1528, method4027);
            }
        }
    }
    
    @Override
    public void Method1635(final Class clazz) {
        this.Method6051(clazz, null);
    }
    
    @Override
    public void Method1636(final Object o) {
        this.Method6051(o.getClass(), o);
    }
    
    private void Method6051(final Class clazz, final Object o) {
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int length = declaredMethods.length, i = 0; i < length; ++i) {
            final Class1528 class1528 = new Class1528(declaredMethods[i], o);
            final Class996 class1529 = this.Field15113.get(class1528);
            if (class1529 != null) {
                ((List)this.Field15112.computeIfAbsent(class1529.Method4030(), Class1522::Method6052)).remove(class1529);
                this.Field15113.remove(class1528);
            }
        }
    }
    
    @Override
    public void Method1637(final Object o) {
        final List<Class996> list = this.Field15112.get(o.getClass());
        if (list == null) {
            return;
        }
        final Iterator<Class996> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method4028(o);
        }
    }
    
    private static List Method6052(final Class clazz) {
        return new ArrayList(64);
    }
    
    private static int Method6053(final Class996 class996) {
        return class996.Method4032().Method6767();
    }
    
    private static List Method6054(final Class clazz) {
        return new ArrayList(64);
    }
}
