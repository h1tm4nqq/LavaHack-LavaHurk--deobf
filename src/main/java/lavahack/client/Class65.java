//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class65 extends Class438
{
    private String Field8216 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2011 Method649() {
        return new Class2011(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public Class65 Method650(final int n) {
        GL20.glUniform4f(n, ((Class2011)this.Method647()).Method7460(), ((Class2011)this.Method647()).Method7462(), ((Class2011)this.Method647()).Method7464(), ((Class2011)this.Method647()).Method7466());
        return this;
    }
    
    public Object Method646(final int n) {
        return this.Method650(n);
    }
    
    public Object Method645() {
        return this.Method649();
    }
}
