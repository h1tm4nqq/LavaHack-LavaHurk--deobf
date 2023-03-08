//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;

class Class1061 implements Iterator
{
    private final int Field12681;
    private int Field12682;
    final Class390 Field12683;
    private int Field12684;
    
    private Class1061(final Class390 field12683) {
        this.Field12683 = field12683;
        this.Field12681 = Class390.Method1907(field12683);
        this.Field12682 = 0;
    }
    
    private void Method4315() {
        if (this.Field12681 != Class390.Method1907(this.Field12683)) {
            throw new ConcurrentModificationException();
        }
    }
    
    @Override
    public boolean hasNext() {
        this.Method4315();
        return this.Field12682 < Class390.Method1908(this.Field12683) - 1;
    }
    
    @Override
    public Object next() {
        this.Method4315();
        return Class390.Method1909(this.Field12683)[this.Field12682++];
    }
    
    @Override
    public void forEachRemaining(final Consumer consumer) {
        this.Method4315();
        if (consumer == null) {
            throw new NullPointerException();
        }
        while (this.Field12682 < Class390.Method1908(this.Field12683) - 1) {
            consumer.accept(Class390.Method1909(this.Field12683)[this.Field12682++]);
        }
    }
    
    Class1061(final Class390 class390, final Class1452 class391) {
        this(class390);
    }
}
