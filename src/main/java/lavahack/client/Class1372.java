//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class1372 extends Class438
{
    private String Field14236 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class783 Method5469() {
        return new Class783();
    }
    
    public Class1372 Method5470(final int n) {
        GL20.glUniform2i(n, ((Class783)this.Method647()).Field11301, ((Class783)this.Method647()).Field11302);
        return this;
    }
    
    @Override
    public Object Method646(final int n) {
        return this.Method5470(n);
    }
    
    @Override
    public Object Method645() {
        return this.Method5469();
    }
}
