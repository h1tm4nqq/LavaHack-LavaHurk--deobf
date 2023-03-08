//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.chunk.*;

public class Class1957 extends Class1467
{
    private final int Field17025;
    private String Field17026 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1957(final World world, final RenderGlobal renderGlobal, final BlockPos blockPos, final int n) {
        super(world, renderGlobal, n);
        this.Field17025 = GLAllocation.generateDisplayLists(1);
    }
    
    public int Method7271(final BlockRenderLayer blockRenderLayer, final CompiledChunk compiledChunk) {
        return compiledChunk.isLayerEmpty(blockRenderLayer) ? -1 : this.Field17025;
    }
    
    public void deleteGlResources() {
        super.deleteGlResources();
        GLAllocation.deleteDisplayLists(this.Field17025);
    }
}
