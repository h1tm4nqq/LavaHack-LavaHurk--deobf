//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class574
{
    private final Object Field10444;
    private final Object Field10445;
    private int Field10446;
    
    public Class574(final Object field10444, final Object field10445) {
        this.Field10444 = field10444;
        this.Field10445 = field10445;
    }
    
    public Object Method2522() {
        return this.Field10444;
    }
    
    public Object Method2523() {
        return this.Field10445;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class574)) {
            return false;
        }
        final Class574 class574 = (Class574)o;
        return Objects.equals(this.Field10444, class574.Field10444) && Objects.equals(this.Field10445, class574.Field10445);
    }
}
