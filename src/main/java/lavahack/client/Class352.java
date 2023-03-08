//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.*;

public class Class352 implements Runnable
{
    private final Queue Field9455;
    private BooleanSupplier Field9456;
    private int Field9457;
    
    public Class352() {
        this.Field9455 = new LinkedList();
        this.Field9456 = Class352::x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;
    }
    
    public void Method1766(final Runnable runnable) {
        this.Field9455.offer(runnable);
    }
    
    public void Method1767(final Class1781 class1781, final Object... array) {
        this.Field9455.offer(Class352::Method1778);
    }
    
    public void Method1768() {
        this.Field9455.poll();
        final Runnable runnable = this.Field9455.peek();
        if (runnable == null) {
            return;
        }
        runnable.run();
    }
    
    public void Method1769() {
        final Runnable runnable = this.Field9455.peek();
        if (runnable == null) {
            return;
        }
        runnable.run();
    }
    
    public void Method1770() {
        if (!this.Field9456.getAsBoolean()) {
            return;
        }
        this.Method1768();
    }
    
    @Override
    public void run() {
        if (this.Field9456.getAsBoolean()) {
            this.Method1768();
            return;
        }
        this.Method1769();
    }
    
    public void Method1771() {
        while (this.Method1773()) {
            this.Method1768();
        }
    }
    
    public void Method1772() {
        if (!this.Field9456.getAsBoolean()) {
            return;
        }
        this.Method1771();
    }
    
    public boolean Method1773() {
        return !this.Field9455.isEmpty();
    }
    
    public int Method1774() {
        return this.Field9455.size();
    }
    
    public void Method1775(final BooleanSupplier field9456) {
        this.Field9456 = field9456;
    }
    
    public Runnable[] Method1776() {
        return (Runnable[])this.Field9455.toArray(new Runnable[0]);
    }
    
    public void Method1777() {
        this.Field9455.clear();
    }
    
    private static void Method1778(final Class1781 class1781, final Object[] array) {
        class1781.Method6745(array);
    }
}
