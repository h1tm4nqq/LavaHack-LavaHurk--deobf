//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import com.kisman.cc.util.*;

public class Class1100 extends Class2157
{
    public boolean Field12956;
    private String Field12957 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1100() {
        this(false);
    }
    
    public Class1100(final boolean field12956) {
        super(new Object[0]);
        this.Field12956 = false;
        this.Field12956 = field12956;
    }
    
    public String Method163() {
        return "tick";
    }
    
    public boolean Method4497() {
        return Class2142.Field17803.player != null && Class2142.Field17803.world != null;
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4940 ^ 0xA1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
