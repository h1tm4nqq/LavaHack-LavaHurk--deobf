//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.world.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.chunk.*;

class Class1208 implements Class1688
{
    final Class934 Field13488;
    private String Field13489 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1208(final Class934 field13488) {
        this.Field13488 = field13488;
    }
    
    public RenderChunk Method4874(final World world, final RenderGlobal renderGlobal, final int n) {
        return new Class1438(world, renderGlobal, n);
    }
    
    @Override
    public Class1467 makeRenderOverlay(final World world, final RenderGlobal renderGlobal, final int n) {
        return new Class1467(world, renderGlobal, n);
    }
}
