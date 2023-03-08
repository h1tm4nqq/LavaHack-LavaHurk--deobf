//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.*;

public class Class183
{
    public String Field8798;
    public LuaClosure Field8799;
    public Class42 Field8800;
    private String Field8801 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class183(final String field8798, final LuaClosure field8799, final Class42 field8800) {
        this.Field8798 = field8798;
        this.Field8799 = field8799;
        this.Field8800 = field8800;
    }
    
    public void Method1110(final LuaValue luaValue) {
        if (this.Field8800.Method35()) {
            Class2153.Method7744(this.Field8800, this.Field8799, luaValue);
        }
    }
}
