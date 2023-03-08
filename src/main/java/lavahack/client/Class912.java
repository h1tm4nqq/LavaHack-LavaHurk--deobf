//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;

public class Class912 extends RuntimeException
{
    private final UnsupportedEncodingException Field11870;
    private String Field11871 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class912(final UnsupportedEncodingException field11870) {
        if (field11870 == null) {
            throw new IllegalArgumentException();
        }
        this.Field11870 = field11870;
    }
    
    public UnsupportedEncodingException Method3824() {
        return this.Field11870;
    }
}
