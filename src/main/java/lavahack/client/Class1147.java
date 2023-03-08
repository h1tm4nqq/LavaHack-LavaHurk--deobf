//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.client.gui.*;
import org.luaj.vm2.*;

public class Class1147 implements Class2142
{
    private static LuaValue Field13176;
    private final String Field13177;
    private boolean Field13178;
    private LuaClosure Field13179;
    private LuaClosure Field13180;
    private LuaClosure Field13181;
    private LuaClosure Field13182;
    private LuaClosure Field13183;
    private LuaClosure Field13184;
    private LuaClosure Field13185;
    private LuaClosure Field13186;
    private boolean Field13187;
    private String Field13188 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1147(final String field13177) {
        this.Field13187 = true;
        this.Field13177 = field13177;
    }
    
    public Class1147 Method4633(final LuaClosure field13180) {
        this.Field13180 = field13180;
        return this;
    }
    
    public Class1147 Method4634(final LuaClosure field13179) {
        this.Field13179 = field13179;
        return this;
    }
    
    public void Method4635(final boolean field13178) {
        this.Field13178 = field13178;
    }
    
    public Class1147 Method4636(final boolean field13187) {
        this.Field13187 = field13187;
        return this;
    }
    
    public Class1147 Method4637(final LuaClosure field13183) {
        this.Field13183 = field13183;
        return this;
    }
    
    public Class1147 Method4638(final LuaClosure field13184) {
        this.Field13184 = field13184;
        return this;
    }
    
    public Class1147 Method4639(final LuaClosure field13185) {
        this.Field13185 = field13185;
        return this;
    }
    
    public void Method4640(final LuaClosure field13181) {
        this.Field13181 = field13181;
    }
    
    public void Method4641(final LuaClosure field13182) {
        this.Field13182 = field13182;
    }
    
    public void Method4642(final LuaClosure field13186) {
        this.Field13186 = field13186;
    }
    
    public GuiScreen Method4643() {
        return new Class692(this);
    }
    
    public static LuaValue Method4644() {
        if (Class1147.Field13176 == null) {
            final LuaTable field13176 = new LuaTable();
            field13176.set("new", (LuaValue)new Class1855());
            field13176.set("__index", (LuaValue)field13176);
            Class1147.Field13176 = (LuaValue)field13176;
        }
        return Class1147.Field13176;
    }
    
    static LuaClosure Method4645(final Class1147 class1147) {
        return class1147.Field13179;
    }
    
    static LuaClosure Method4646(final Class1147 class1147) {
        return class1147.Field13180;
    }
    
    static boolean Method4647(final Class1147 class1147) {
        return class1147.Field13187;
    }
    
    static LuaClosure Method4648(final Class1147 class1147) {
        return class1147.Field13184;
    }
    
    static LuaClosure Method4649(final Class1147 class1147) {
        return class1147.Field13185;
    }
    
    static LuaClosure Method4650(final Class1147 class1147) {
        return class1147.Field13181;
    }
    
    private static String Method4651(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x217F ^ 0x1D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
