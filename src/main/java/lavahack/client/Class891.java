//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;

public class Class891 extends Class158
{
    private int Field11734;
    
    public Class891() {
        super("displaytitle");
    }
    
    public String Method447() {
        return "Changes the name of the display";
    }
    
    public String Method448() {
        return "displaytitle <title>";
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Display.setTitle(Class2131.Method7669((CharSequence[])array, 0, array.length).toString());
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6719 ^ 0x3C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
