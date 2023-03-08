//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class277 extends Class438
{
    private int Field9215;
    
    public Float Method1468() {
        return 0.0f;
    }
    
    public Class277 Method1469(final int n) {
        GL20.glUniform1f(n, (float)this.Method647());
        return this;
    }
    
    @Override
    public Object Method646(final int n) {
        return this.Method1469(n);
    }
    
    @Override
    public Object Method645() {
        return this.Method1468();
    }
}
