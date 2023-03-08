//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import org.lwjgl.opengl.*;

public class Class1469 extends Class438
{
    private String Field14867 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Vec2f Method5913() {
        return new Vec2f(0.0f, 0.0f);
    }
    
    public Class1469 Method5914(final int n) {
        GL20.glUniform2f(n, ((Vec2f)this.Method647()).x, ((Vec2f)this.Method647()).y);
        return this;
    }
    
    @Override
    public Object Method646(final int n) {
        return this.Method5914(n);
    }
    
    @Override
    public Object Method645() {
        return this.Method5913();
    }
}
