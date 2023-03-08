//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.text.translation.*;

public class Class320 extends Exception
{
    private int Field9359;
    
    public Class320(final String s) {
        super(I18n.translateToLocal(s));
    }
    
    public Class320(final String s, final Object... array) {
        super(I18n.translateToLocalFormatted(s, array));
    }
}
