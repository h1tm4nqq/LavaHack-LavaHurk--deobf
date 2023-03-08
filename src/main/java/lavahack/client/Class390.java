//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.jetbrains.annotations.*;

class Class390 extends AbstractQueue implements Queue
{
    private Object[] Field9643;
    private int Field9644;
    private int Field9645;
    private String Field9646 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class390(final Object[] field9643, final int field9644) {
        this.Field9643 = field9643;
        this.Field9644 = field9644;
        this.Field9645 = 0;
    }
    
    private Class390(final Object[] array) {
        this(array, array.length);
    }
    
    private void Method1906(final int n) {
        if (this.Field9644 + n < this.Field9643.length) {
            return;
        }
        final Object[] field9643 = new Object[this.Field9643.length << 1];
        System.arraycopy(this.Field9643, 0, field9643, 0, this.Field9644);
        this.Field9643 = field9643;
    }
    
    @NotNull
    @NotNull
    @Override
    public Iterator iterator() {
        return (Iterator)new Class1061(this, (Class1452)null);
    }
    
    @Override
    public int size() {
        return this.Field9644;
    }
    
    @Override
    public boolean offer(final Object o) {
        this.Method1906(1);
        this.Field9643[this.Field9644++] = o;
        ++this.Field9645;
        return true;
    }
    
    @Override
    public Object poll() {
        final Object[] field9643 = this.Field9643;
        final int field9644 = this.Field9644 - 1;
        this.Field9644 = field9644;
        final Object o = field9643[field9644];
        this.Field9643[this.Field9644] = null;
        ++this.Field9645;
        return o;
    }
    
    @Override
    public Object peek() {
        return this.Field9643[this.Field9644 - 1];
    }
    
    Class390(final Object[] array, final Class1452 class1452) {
        this(array);
    }
    
    static int Method1907(final Class390 class390) {
        return class390.Field9645;
    }
    
    static int Method1908(final Class390 class390) {
        return class390.Field9644;
    }
    
    static Object[] Method1909(final Class390 class390) {
        return class390.Field9643;
    }
}
