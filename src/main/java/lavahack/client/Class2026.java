//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;

public class Class2026 extends Class2157
{
    private final BlockPos Field17315;
    private IBlockState Field17316;
    private int Field17317;
    
    public Class2026(final BlockPos field17315) {
        super(new Object[0]);
        this.Field17316 = null;
        this.Field17315 = field17315;
    }
    
    public BlockPos Method7493() {
        return this.Field17315;
    }
    
    public IBlockState Method7494() {
        return this.Field17316;
    }
    
    public void Method7495(final IBlockState field17316) {
        this.Field17316 = field17316;
    }
}
