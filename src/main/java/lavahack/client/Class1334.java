//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import net.minecraft.entity.*;

public class Class1334 extends Class2157
{
    public MoverType Field14102;
    public double Field14103;
    public double Field14104;
    public double Field14105;
    private String Field14106 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1334(final MoverType field14102, final double field14103, final double field14104, final double field14105) {
        super(new Object[0]);
        this.Field14102 = field14102;
        this.Field14103 = field14103;
        this.Field14104 = field14104;
        this.Field14105 = field14105;
    }
    
    public String Method163() {
        return "player_move";
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x78F7 ^ 0x23));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
