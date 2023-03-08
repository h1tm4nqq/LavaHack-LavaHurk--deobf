//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.tileentity.*;
import net.minecraft.entity.*;

public class Class50 extends Exception
{
    private int Field8145;
    
    public Class50(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public Class50(final TileEntity obj, final Throwable cause) {
        super(String.valueOf(obj), cause);
    }
    
    public Class50(final Entity obj, final Throwable cause) {
        super(String.valueOf(obj), cause);
    }
}
