//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.event;

import java.lang.reflect.*;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;
import lavahack.client.*;

public class Class2157 extends Class1185
{
    private boolean Field17857;
    public Class2157 Field17858;
    private Class1273 Field17859;
    private static boolean Field17860;
    private static Class[] Field17861;
    private static Constructor Field17862;
    private int Field17863;
    
    public Class2157(final Object... initargs) {
        this.Field17858 = null;
        if (Class2157.Field17862 == null && Class2157.Field17860) {
            if (initargs.length != 0) {
                Class2157.Field17861 = new Class[initargs.length];
                for (int i = 0; i < initargs.length; ++i) {
                    Class2157.Field17861[i] = initargs[i].getClass();
                }
            }
            Class2157.Field17862 = Class.forName("the.kis.devs.api.event.events." + Class2157.class.getSimpleName()).getConstructor((Class<?>[])Class2157.Field17861);
            Class2157.Field17860 = (Class2157.Field17862 != null);
        }
        if (Class2157.Field17862 != null) {
            this.Field17858 = Class2157.Field17862.newInstance(initargs);
        }
    }
    
    public Class2157(final Class1273 field17859, final Object... array) {
        this(array);
        this.Field17859 = field17859;
    }
    
    public Class1273 Method160() {
        return this.Field17859;
    }
    
    public void Method161(final Class1273 field17859) {
        this.Field17859 = field17859;
    }
    
    public LuaValue Method162() {
        return CoerceJavaToLua.coerce((Object)this);
    }
    
    public String Method163() {
        return "other_event";
    }
    
    public boolean Method164() {
        return this.Field17859.equals((Object)Class1273.Field13746);
    }
    
    public boolean Method165() {
        return this.Field17859.equals((Object)Class1273.Field13747);
    }
    
    public String Method166() {
        return this.Field17859.name();
    }
    
    public void Method167() {
        Class1796.Field16242.Method715((Object)this);
    }
    
    public boolean Method168() {
        return this.Field17857;
    }
    
    public void Method169(final boolean field17857) {
        this.Field17857 = field17857;
    }
    
    static {
        Class2157.Field17860 = true;
        Class2157.Field17861 = new Class[0];
        Class2157.Field17862 = null;
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2C36 ^ 0x10));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
