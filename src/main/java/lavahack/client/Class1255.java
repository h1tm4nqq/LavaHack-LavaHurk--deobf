//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.*;

public class Class1255
{
    private final Class1164 Field13690;
    private final List Field13691;
    private final String Field13692;
    private String Field13693 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1255(final String field13692, final Class1164 field13693, final List field13694) {
        this.Field13690 = field13693;
        this.Field13691 = field13694;
        this.Field13692 = field13692;
    }
    
    public String Method5062() {
        return this.Field13692;
    }
    
    public Class1164 Method5063() {
        return this.Field13690;
    }
    
    public List Method5064() {
        return this.Field13691;
    }
    
    public void Method5065() {
        this.Field13691.forEach(Class488::Method2262);
    }
    
    public void Method5066() {
        this.Field13691.forEach(Class488::Method2263);
    }
    
    public void Method5067(final String s, final String s2, final boolean b) {
        final Class2099 method4617 = Class1127.Method4617(s);
        if (method4617 == null) {
            return;
        }
        final Class488 method4618 = method4617.Method7634(s2, this.Field13690);
        if (b) {
            method4618.Method2262();
        }
        this.Field13691.add(method4618);
    }
    
    public void Method5068(final Class clazz, final String s, final boolean b) {
        final Class2099 method4618 = Class1127.Method4618(clazz);
        if (method4618 == null) {
            return;
        }
        final Class488 method4619 = method4618.Method7634(s, this.Field13690);
        if (b) {
            method4619.Method2262();
        }
        this.Field13691.add(method4619);
    }
    
    public boolean Method5069() {
        final Iterator<Class488> iterator = this.Field13691.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().Method2264()) {
                return true;
            }
        }
        return false;
    }
}
