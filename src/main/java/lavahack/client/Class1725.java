//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public final class Class1725
{
    private final String Field15925;
    private final UUID Field15926;
    private String Field15927 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1725(final String field15925, final UUID field15926) {
        this.Field15925 = field15925;
        this.Field15926 = field15926;
    }
    
    public Class1725(final String s, final String name) {
        this(s, UUID.fromString(name));
    }
    
    public String Method6594() {
        return this.Field15925;
    }
    
    public UUID Method6595() {
        return this.Field15926;
    }
    
    public String Method6596() {
        return this.Field15926.toString();
    }
}
