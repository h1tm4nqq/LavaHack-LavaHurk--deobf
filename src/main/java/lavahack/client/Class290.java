//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.relauncher.*;
import mcp.*;
import javax.annotation.*;
import net.minecraft.client.renderer.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.world.*;

@SideOnly(Side.CLIENT)
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class Class290 extends ListedRenderChunk
{
    private String Field9245 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class290(final World world, final RenderGlobal renderGlobal, final BlockPos blockPos, final int n) {
        super(world, renderGlobal, n);
    }
    
    public void rebuildChunk(final float n, final float n2, final float n3, final ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        chunkCompileTaskGenerator.getLock().lock();
        if (chunkCompileTaskGenerator.getStatus() == ChunkCompileTaskGenerator$Status.COMPILING) {
            final BlockPos getPosition = this.getPosition();
            final Class1479 class1479 = (Class1479)this.getWorld();
            if (getPosition.getX() < 0 || getPosition.getZ() < 0 || getPosition.getX() >= class1479.getWidth() || getPosition.getZ() >= class1479.getLength()) {
                final SetVisibility setVisibility = new SetVisibility();
                setVisibility.setAllVisible(true);
                final CompiledChunk compiledChunk = new CompiledChunk();
                compiledChunk.setVisibility(setVisibility);
                chunkCompileTaskGenerator.setCompiledChunk(compiledChunk);
                chunkCompileTaskGenerator.getLock().unlock();
                return;
            }
        }
        chunkCompileTaskGenerator.getLock().unlock();
        super.rebuildChunk(n, n2, n3, chunkCompileTaskGenerator);
    }
    
    protected ChunkCache createRegionRenderCache(final World world, final BlockPos blockPos, final BlockPos blockPos2, final int n) {
        return (ChunkCache)new Class1600(world, blockPos, blockPos2, n);
    }
}
