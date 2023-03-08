//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class33 extends Class1249
{
    private final Class44 Field8022;
    private final Class44 Field8023;
    private String Field8024 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class33() {
        super("Welcomer", true);
        this.Field8022 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Field8023 = this.Method23(new Class44("Color", (Class42)this, "Color", new Class2027(-1)));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method276(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final int n = this.Field8022.Method365() ? Class1172.Method4709(100, 100) : this.Field8023.Method339().Method3626();
        this.Method273((double)Class1178.Method4741("Welcome to " + Class1796.Method6783() + ", " + Class33.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + "!"));
        this.Method274((double)Class1178.Method4748());
        Class1178.Method4745("Welcome to " + Class1796.Method6783() + ", " + Class33.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.player.getName() + "!", this.Method267(), this.Method268(), n);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x233A ^ 0x25));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
