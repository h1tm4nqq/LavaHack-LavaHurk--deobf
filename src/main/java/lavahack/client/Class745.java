//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class745
{
    private Object Field11163;
    private Object Field11164;
    private String Field11165 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class745(final Object field11163, final Object field11164) {
        this.Field11163 = field11163;
        this.Field11164 = field11164;
    }
    
    public Object Method3083() {
        return this.Field11163;
    }
    
    public void Method3084(final Object field11163) {
        this.Field11163 = field11163;
    }
    
    public Object Method3085() {
        return this.Field11164;
    }
    
    public void Method3086(final Object field11164) {
        this.Field11164 = field11164;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class745)) {
            return false;
        }
        final Class745 class745 = (Class745)o;
        return Objects.equals(this.Field11163, class745.Field11163) && Objects.equals(this.Field11164, class745.Field11164);
    }
}
