//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class860 extends Class438
{
    private String Field11634 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class594 Method3643() {
        return new Class594(0, 0, 0, 0);
    }
    
    public Class860 Method3644(final int n) {
        GL20.glUniform4i(n, ((Class594)this.Method647()).Method2572(), ((Class594)this.Method647()).Method2574(), ((Class594)this.Method647()).Method2576(), ((Class594)this.Method647()).Method2578());
        return this;
    }
    
    public Object Method646(final int n) {
        return this.Method3644(n);
    }
    
    public Object Method645() {
        return this.Method3643();
    }
}
