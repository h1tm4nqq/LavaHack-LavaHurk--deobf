//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class1959 extends Class438
{
    private int Field17029;
    
    public Integer Method7274() {
        return 0;
    }
    
    public Class1959 Method7275(final int n) {
        GL20.glUniform1i(n, (int)this.Method647());
        return this;
    }
    
    @Override
    public Object Method646(final int n) {
        return this.Method7275(n);
    }
    
    @Override
    public Object Method645() {
        return this.Method7274();
    }
}
