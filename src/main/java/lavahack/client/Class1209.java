//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.world.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.util.math.*;

class Class1209 implements Class1688
{
    final Class934 Field13490;
    private int Field13491;
    
    Class1209(final Class934 field13490) {
        this.Field13490 = field13490;
    }
    
    public RenderChunk Method4875(final World world, final RenderGlobal renderGlobal, final int n) {
        return (RenderChunk)new Class290(world, renderGlobal, null, n);
    }
    
    @Override
    public Class1467 makeRenderOverlay(final World world, final RenderGlobal renderGlobal, final int n) {
        return new Class1957(world, renderGlobal, null, n);
    }
}
