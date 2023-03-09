/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package com.kisman.cc.event;

import com.kisman.cc.event.Class1273;
import java.lang.reflect.Constructor;
import lavahack.client.Class1185;
import lavahack.client.Class1796;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Class2157
extends Class1185 {
    private boolean Field17857;
    public Class2157 Field17858 = null;
    private Class1273 Field17859;
    private static boolean Field17860 = true;
    private static Class[] Field17861 = new Class[0];
    private static Constructor Field17862 = null;
    private int Field17863;

    public Class2157(Object ... objectArray) {
        if (Field17862 == null && Field17860) {
            if (objectArray.length != 0) {
                Field17861 = new Class[objectArray.length];
                for (int i = 0; i < objectArray.length; ++i) {
                    Class2157.Field17861[i] = objectArray[i].getClass();
                }
            }
            Field17860 = (Field17862 = Class.forName("the.kis.devs.api.event.events." + Class2157.class.getSimpleName()).getConstructor(Field17861)) != null;
        }
        if (Field17862 == null) return;
        this.Field17858 = (Class2157)Field17862.newInstance(objectArray);
    }

    public Class2157(Class1273 class1273, Object ... objectArray) {
        this(objectArray);
        this.Field17859 = class1273;
    }

    public Class1273 Method160() {
        return this.Field17859;
    }

    public void Method161(Class1273 class1273) {
        this.Field17859 = class1273;
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
        Class1796.Field16242.Method715(this);
    }

    public boolean Method168() {
        return this.Field17857;
    }

    public void Method169(boolean bl) {
        this.Field17857 = bl;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 16;
            cArray2[n] = (char)(cArray[n] ^ (0x2C36 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

