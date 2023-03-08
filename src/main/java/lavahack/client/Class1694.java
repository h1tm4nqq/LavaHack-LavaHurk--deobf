//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class1694 extends Class438
{
    private String Field15855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class824 Method6499() {
        return new Class824(0.0f, 0.0f, 0.0f);
    }
    
    public Class1694 Method6500(final int n) {
        GL20.glUniform3f(n, ((Class824)this.Method647()).Method3521(), ((Class824)this.Method647()).Method3523(), ((Class824)this.Method647()).Method3525());
        return this;
    }
    
    @Override
    public Object Method646(final int n) {
        return this.Method6500(n);
    }
    
    @Override
    public Object Method645() {
        return this.Method6499();
    }
}
