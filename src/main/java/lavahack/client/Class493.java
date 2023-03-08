//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraftforge.client.event.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class493 extends Class1249
{
    private final Class44 Field10047;
    private final Class44 Field10048;
    private String Field10049 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class493() {
        super("CrystalPerSecond", true);
        this.Field10047 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Field10048 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2281(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final int n = this.Field10047.Method365() ? Class1172.Method4709(100, 100) : this.Field10048.Method339().Method3626();
        final String string = "Crystal/Sec: " + TextFormatting.GRAY + Class115.Field8400.Field8403.Method3990();
        Class1178.Method4745(string, this.Method267(), this.Method268(), n);
        this.Method273((double)Class1178.Method4741(string));
        this.Method274((double)Class1178.Method4748());
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4BF6 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
