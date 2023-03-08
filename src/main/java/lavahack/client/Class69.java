//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;

public class Class69
{
    public BlockPos Field8234;
    public float Field8235;
    public float Field8236;
    private String Field8237 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class69(final BlockPos field8234, final float field8235, final float field8236) {
        this.Field8234 = field8234;
        this.Field8235 = field8235;
        this.Field8236 = field8236;
    }
    
    public BlockPos Method656() {
        if (this.Field8234 == null) {
            return BlockPos.ORIGIN;
        }
        return this.Field8234.down();
    }
}
