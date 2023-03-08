//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import org.lwjgl.opengl.*;

public class Class1626 extends Class438
{
    private String Field15605 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Vec3i Method6358() {
        return new Vec3i(0, 0, 0);
    }
    
    public Class1626 Method6359(final int n) {
        GL20.glUniform3i(n, ((Vec3i)this.Method647()).getX(), ((Vec3i)this.Method647()).getY(), ((Vec3i)this.Method647()).getZ());
        return this;
    }
    
    @Override
    public Object Method646(final int n) {
        return this.Method6359(n);
    }
    
    @Override
    public Object Method645() {
        return this.Method6358();
    }
}
