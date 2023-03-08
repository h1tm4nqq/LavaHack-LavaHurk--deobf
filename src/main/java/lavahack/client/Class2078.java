//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.renderer.*;
import java.util.*;
import com.google.common.collect.*;

public abstract class Class2078 extends ChunkRenderContainer
{
    protected List Field17502;
    private String Field17503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2078() {
        this.Field17502 = Lists.newArrayListWithCapacity(17424);
    }
    
    public void initialize(final double n, final double n2, final double n3) {
        super.initialize(n, n2, n3);
        this.Field17502.clear();
    }
    
    public void addRenderOverlay(final Class1467 class1467) {
        this.Field17502.add(class1467);
    }
    
    public abstract void renderOverlay();
}
