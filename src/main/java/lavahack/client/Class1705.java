//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.*;
import java.util.*;
import java.util.function.*;

public class Class1705
{
    public ArrayList Field15891;
    public static boolean Field15892;
    private String Field15893 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1705() {
        this.Field15891 = new ArrayList();
    }
    
    public Class1705 Method6532() {
        return this;
    }
    
    public Class1705 Method6533() {
        this.Field15891.clear();
        return this;
    }
    
    public void Method6534(final String s, final LuaValue luaValue) {
        for (final Class1089 class1089 : this.Field15891) {
            if (class1089.Method35()) {
                if (!class1089.Method29()) {
                    continue;
                }
                class1089.Method4457(s, luaValue);
            }
        }
    }
    
    public void Method6535(final String s) {
        this.Method6534(s, LuaValue.NIL);
    }
    
    public Class1089 Method6536(final String s) {
        return (Class1089)this.Field15891.stream().filter(Class1705::Method6538).findFirst().orElse(null);
    }
    
    public boolean Method6537(final String anotherString) {
        final Iterator<Class1089> iterator = this.Field15891.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().Method40().equalsIgnoreCase(anotherString)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean Method6538(final String anotherString, final Class1089 class1089) {
        return class1089.Method40().equalsIgnoreCase(anotherString);
    }
    
    static {
        Class1705.Field15892 = false;
    }
}
