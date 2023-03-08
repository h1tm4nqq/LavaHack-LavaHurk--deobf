//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;

public class Class1803 extends Class1514
{
    protected List Field16306;
    protected Map Field16307;
    protected Class1834 Field16308;
    private final Class1997 Field16309;
    private String Field16310 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1803(final Class1876 class1876, final Class1997 field16309) {
        super(class1876);
        this.Field16306 = new ArrayList();
        this.Field16307 = new HashMap();
        this.Field16309 = field16309;
    }
    
    public void Method668() {
        if (this.Method679()) {
            this.Method6813();
            this.Method6811();
        }
        this.Method6812();
        final Iterator<Class1514> iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method668();
        }
    }
    
    public void Method669() {
        final Iterator<Class1514> iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method669();
        }
    }
    
    public boolean Method679() {
        final Iterator<Class1514> iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().Method679()) {
                return true;
            }
        }
        return super.Method679();
    }
    
    private void Method6811() {
        final Iterator<Class1514> iterator = this.Field16306.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method680(false);
        }
    }
    
    protected void Method6812() {
        for (final Class1514 class1514 : this.Field16306) {
            final int[] array = this.Field16307.get(class1514);
            if (array == null) {
                this.Method6813();
                this.Method6812();
                return;
            }
            class1514.Method672(this.Method671() + array[0]);
            class1514.Method674(this.Method673() + array[1]);
        }
    }
    
    public void Method6813() {
        this.Method6814(this.Method675(), this.Method677(), true);
    }
    
    protected void Method6814(final int n, final int n2, final boolean b) {
        this.Field16308 = this.Field16309.Method150(this.Field16306, n, n2);
        this.Field16307 = this.Field16308.Method6901();
        if (b) {
            this.Method678(this.Field16308.Method6903());
        }
    }
    
    public void Method6815(final Class1514 class1514) {
        this.Field16306.add(class1514);
        this.Method6814(super.Method675(), super.Method677(), true);
    }
    
    public boolean Method683(final int n, final int n2, final boolean b) {
        final boolean[] array = { false };
        this.Field16306.stream().sorted(Comparator.comparingInt(Class1514::Method670)).forEach(Class1803::Method6821);
        return array[0];
    }
    
    public boolean Method684(final int n, final int n2, final int n3, final boolean b) {
        final boolean[] array = { false };
        this.Field16306.stream().sorted(Comparator.comparingInt(Class1514::Method670)).forEach(Class1803::Method6820);
        return array[0];
    }
    
    public boolean Method682(final int n, final int n2, final int n3, final boolean b) {
        final boolean[] array = { false };
        this.Field16306.stream().sorted(Comparator.comparingInt(Class1514::Method670)).forEach(Class1803::Method6819);
        return array[0];
    }
    
    public boolean Method681(final int n, final char c) {
        final boolean[] array = { false };
        this.Field16306.stream().sorted(Comparator.comparingInt(Class1514::Method670)).forEach(Class1803::Method6818);
        return array[0];
    }
    
    public int Method675() {
        if (super.Method675() <= 0) {
            this.Method6816();
        }
        return super.Method675();
    }
    
    public int Method677() {
        if (super.Method677() <= 0) {
            this.Method6816();
        }
        return super.Method677();
    }
    
    private void Method6816() {
        for (final Class1514 class1514 : this.Field16306) {
            if (class1514 instanceof Class1803) {
                ((Class1803)class1514).Method6816();
            }
        }
        final int[] method149 = this.Field16309.Method149(this.Field16306, Integer.MAX_VALUE);
        if (super.Method675() <= 0) {
            this.Method676(method149[0]);
        }
        if (super.Method677() <= 0) {
            this.Method678(method149[1]);
        }
    }
    
    public void Method6817() {
        this.Field16306.clear();
        this.Method6814(super.Method675(), super.Method677(), true);
    }
    
    private static void Method6818(final boolean[] array, final int n, final char c, final Class1514 class1514) {
        if (!array[0] && class1514.Method681(n, c)) {
            array[0] = true;
        }
    }
    
    private static void Method6819(final boolean[] array, final int n, final int n2, final int n3, final boolean b, final Class1514 class1514) {
        if (!array[0] && class1514.Method682(n, n2, n3, b)) {
            array[0] = true;
        }
    }
    
    private static void Method6820(final boolean[] array, final int n, final int n2, final int n3, final boolean b, final Class1514 class1514) {
        if (!array[0] && class1514.Method684(n, n2, n3, b)) {
            array[0] = true;
        }
    }
    
    private static void Method6821(final boolean[] array, final int n, final int n2, final boolean b, final Class1514 class1514) {
        if (!array[0] && class1514.Method683(n, n2, b)) {
            array[0] = true;
        }
    }
}
