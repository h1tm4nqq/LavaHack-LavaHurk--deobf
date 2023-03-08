//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import org.luaj.vm2.lib.jse.*;
import org.luaj.vm2.*;

public class Class771 extends Class1249
{
    private final Class1089 Field11264;
    private static LuaValue Field11265;
    private LuaClosure Field11266;
    private LuaClosure Field11267;
    private int Field11268;
    
    public Class771(final String s, final String s2, final boolean b, final Class1089 field11264) {
        super(s, s2, b);
        this.Field11264 = field11264;
    }
    
    public Class1089 Method3206() {
        return this.Field11264;
    }
    
    public void Method3207(final LuaClosure luaClosure) {
        Class2153.Method7744((Class42)this.Field11264, luaClosure, new LuaValue[0]);
        this.Method20();
    }
    
    public Class183 Method3208(final String s, final LuaClosure luaClosure) {
        final Class183 class183 = new Class183(s, luaClosure, (Class42)this);
        this.Field11264.Field12882.add(class183);
        return class183;
    }
    
    public void Method3209(final String s, final LuaValue luaValue) {
        if (this.Field11264.Field12882 == null) {
            return;
        }
        this.Field11264.Field12882.stream().filter(Class771::Method3217).forEach(Class771::Method3216);
    }
    
    public void Method20() {
        this.Field11264.Method4460(this);
    }
    
    public void Method3210(final Class870 class870) {
        this.Method271(class870.Field11662);
        this.Method272(class870.Field11663);
    }
    
    public void Method3211(final Class870 class870) {
        this.Method273(class870.Field11662);
        this.Method274(class870.Field11663);
    }
    
    public void Method3212(final Class870 class870, final Class870 class871) {
        this.Method3210(class870);
        this.Method3211(class871);
    }
    
    public void Method3213(final LuaClosure field11266) {
        this.Field11266 = field11266;
    }
    
    public void Method3214(final LuaClosure field11267) {
        this.Field11267 = field11267;
    }
    
    public void Method38() {
        if (!this.Field11264.Method35()) {
            return;
        }
        Class2153.Method7745(this.Field11266, new LuaValue[0]);
    }
    
    public void Method39() {
        if (!this.Field11264.Method35()) {
            return;
        }
        Class2153.Method7745(this.Field11267, new LuaValue[0]);
    }
    
    public static LuaValue Method3215() {
        if (Class771.Field11265 == null) {
            final LuaValue coerce = CoerceJavaToLua.coerce((Object)Class771.class);
            final LuaTable luaTable = new LuaTable();
            luaTable.set("new", (LuaValue)new Class2169());
            luaTable.set("__index", (LuaValue)luaTable);
            coerce.setmetatable((LuaValue)luaTable);
            Class771.Field11265 = coerce;
        }
        return Class771.Field11265;
    }
    
    public String toString() {
        return "HudModuleLua{script=" + this.Field11264 + "} " + super.toString();
    }
    
    private static void Method3216(final LuaValue luaValue, final Class183 class183) {
        class183.Method1110(luaValue);
    }
    
    private static boolean Method3217(final String anotherString, final Class183 class183) {
        return class183.Field8798.equalsIgnoreCase(anotherString);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x574 ^ 0x95));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
