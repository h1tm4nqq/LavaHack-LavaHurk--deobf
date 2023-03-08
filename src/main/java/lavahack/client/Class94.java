//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;

public class Class94
{
    public final int Field8325;
    public int Field8326;
    public Item Field8327;
    private int Field8328;
    
    public Class94(final int field8325, final Item field8326) {
        this.Field8326 = -1;
        this.Field8325 = field8325;
        this.Field8327 = field8326;
    }
    
    public void Method801() {
        if (this.Field8327 != null) {
            this.Field8326 = Class9.Method104(this.Field8327);
        }
    }
}
