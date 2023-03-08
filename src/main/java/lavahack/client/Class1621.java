//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class1621
{
    private final Object Field15577;
    private final Object Field15578;
    private String Field15579 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1621(final Object field15577, final Object field15578) {
        this.Field15577 = field15577;
        this.Field15578 = field15578;
    }
    
    public Object Method6307() {
        return this.Field15577;
    }
    
    public Object Method6308() {
        return this.Field15578;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class1621)) {
            return false;
        }
        final Class1621 class1621 = (Class1621)o;
        return Objects.equals(this.Field15577, class1621.Field15577) && Objects.equals(this.Field15578, class1621.Field15578);
    }
}
