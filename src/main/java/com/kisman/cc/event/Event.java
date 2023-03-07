/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package com.kisman.cc.event;

import com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import java.lang.reflect.Constructor;
import lavahack.client.WkowkMIYywGBZ1LvpVpVCHmyCihJiruH;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Event
extends WkowkMIYywGBZ1LvpVpVCHmyCihJiruH {
    private boolean Field17857;
    public Event Field17858 = null;
    private Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17859;
    private static boolean Field17860 = (int)432114501L ^ 0x19C18B44;
    private static Class[] Field17861 = new Class[(int)-208091820L ^ 0xF398C554];
    private static Constructor Field17862 = null;
    private int Field17863;

    public Event(Object ... objectArray) {
        if (Field17862 == null && Field17860) {
            if (objectArray.length != 0) {
                Field17861 = new Class[objectArray.length];
                for (int i = (int)65701537L ^ 0x3EA86A1; i < objectArray.length; ++i) {
                    Event.Field17861[i] = objectArray[i].getClass();
                }
            }
            Field17860 = (Field17862 = Class.forName("the.kis.devs.api.event.events." + Event.class.getSimpleName()).getConstructor(Field17861)) != null ? (int)((long)-357876976 ^ (long)-357876975) : (int)445355125L ^ 0x1A8B9475;
        }
        if (Field17862 == null) return;
        this.Field17858 = (Event)Field17862.newInstance(objectArray);
    }

    public Event(Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, Object ... objectArray) {
        this(objectArray);
        this.Field17859 = event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    public Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method160() {
        return this.Field17859;
    }

    public void Method161(Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        this.Field17859 = event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    public LuaValue Method162() {
        return CoerceJavaToLua.coerce((Object)this);
    }

    public String Method163() {
        return "other_event";
    }

    public boolean Method164() {
        return this.Field17859.equals((Object)Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746);
    }

    public boolean Method165() {
        return this.Field17859.equals((Object)Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13747);
    }

    public String Method166() {
        return this.Field17859.name();
    }

    public void Method167() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(this);
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
        int n = (int)((long)-839039778 ^ (long)-839039778);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-857575890 ^ (long)-857575727);
            int n2 = (int)((long)-1975702208 ^ (long)-1975702207) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)-819621373L ^ 0xCF258418) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

