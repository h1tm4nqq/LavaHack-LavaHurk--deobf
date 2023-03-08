//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class1360 extends Class438
{
    private String Field14194 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Boolean Method5429() {
        return false;
    }
    
    public Class1360 Method5430(final int n) {
        GL20.glUniform1i(n, (int)(((boolean)this.Method647()) ? 1 : 0));
        return this;
    }
    
    @Override
    public Object Method646(final int n) {
        return this.Method5430(n);
    }
    
    @Override
    public Object Method645() {
        return this.Method5429();
    }
}
