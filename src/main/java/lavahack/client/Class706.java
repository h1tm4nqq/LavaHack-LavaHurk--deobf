//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.client.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class706 extends Class1249
{
    private final Class44 Field11014;
    private String Field11015 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class706() {
        super("Fps", true);
        this.Field11014 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Method271(1.0);
        this.Method272(1.0);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2945(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        this.Method273((double)Class1178.Method4741("Fps: " + Minecraft.getDebugFPS()));
        this.Method274((double)Class1178.Method4748());
        Class1178.Method4745("Fps: " + TextFormatting.GRAY + Minecraft.getDebugFPS(), this.Method267(), this.Method268(), this.Field11014.Method365() ? Class1172.Method4709(100, 100) : -1);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6707 ^ 0xD7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
