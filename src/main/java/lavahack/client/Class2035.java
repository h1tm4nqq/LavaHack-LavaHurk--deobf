//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class2035 extends Class438
{
    private String Field17362 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Integer Method7530() {
        return 0;
    }
    
    public Class2035 Method7531(final int n) {
        GL13.glActiveTexture(33992);
        GL11.glBindTexture(3553, (int)this.Method647());
        GL20.glUniform1i(n, 8);
        GL13.glActiveTexture(33984);
        return this;
    }
    
    @Override
    public Object Method646(final int n) {
        return this.Method7531(n);
    }
    
    @Override
    public Object Method645() {
        return this.Method7530();
    }
}
