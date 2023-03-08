//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import org.luaj.vm2.lib.jse.*;
import org.luaj.vm2.*;

public class Class1700 extends Class42
{
    private final Class1089 Field15868;
    private static LuaValue Field15869;
    private LuaClosure Field15870;
    private LuaClosure Field15871;
    private String Field15872 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1700(final String s, final String s2, final Class97 class97, final Class1089 field15868) {
        super(s, s2, class97);
        this.Field15868 = field15868;
        super.Field8063 = false;
    }
    
    public Class1700(final String s, final String s2, final String s3, final Class1089 field15868) {
        super(s, s2, Class97.valueOf(s3));
        this.Field15868 = field15868;
        super.Field8063 = false;
    }
    
    public Class1089 Method6511() {
        return this.Field15868;
    }
    
    public void Method6512(final LuaClosure luaClosure) {
        Class2153.Method7744((Class42)this.Field15868, luaClosure, new LuaValue[0]);
        this.Method20();
    }
    
    public Class183 Method6513(final String s, final LuaClosure luaClosure) {
        final Class183 class183 = new Class183(s, luaClosure, this);
        this.Field15868.Field12882.add(class183);
        return class183;
    }
    
    public void Method6514(final String s, final LuaValue luaValue) {
        if (this.Field15868.Field12882 == null) {
            return;
        }
        this.Field15868.Field12882.stream().filter(Class1700::Method6519).forEach(Class1700::Method6518);
    }
    
    public void Method20() {
        this.Field15868.Method4459(this);
    }
    
    public void Method6515(final LuaClosure field15870) {
        this.Field15870 = field15870;
    }
    
    public void Method6516(final LuaClosure field15871) {
        this.Field15871 = field15871;
    }
    
    @Override
    public void Method38() {
        if (!this.Field15868.Method35()) {
            return;
        }
        Class2153.Method7745(this.Field15870, new LuaValue[0]);
    }
    
    @Override
    public void Method39() {
        if (!this.Field15868.Method35()) {
            return;
        }
        Class2153.Method7745(this.Field15871, new LuaValue[0]);
    }
    
    public static LuaValue Method6517() {
        if (Class1700.Field15869 == null) {
            final LuaValue coerce = CoerceJavaToLua.coerce((Object)Class1700.class);
            final LuaTable luaTable = new LuaTable();
            luaTable.set("new", (LuaValue)new Class612());
            luaTable.set("__index", (LuaValue)luaTable);
            coerce.setmetatable((LuaValue)luaTable);
            Class1700.Field15869 = coerce;
        }
        return Class1700.Field15869;
    }
    
    @Override
    public String toString() {
        return "ModuleLua{script=" + this.Field15868 + "} " + super.toString();
    }
    
    private static void Method6518(final LuaValue luaValue, final Class183 class183) {
        class183.Method1110(luaValue);
    }
    
    private static boolean Method6519(final String anotherString, final Class183 class183) {
        return class183.Field8798.equalsIgnoreCase(anotherString);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xC06 ^ 0x94));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
