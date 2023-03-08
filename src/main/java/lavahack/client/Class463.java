//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class463 extends Class1249
{
    private final Class451 Field9924;
    private String Field9925 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class463() {
        super("ServerIp", "", true);
        this.Field9924 = this.Method275();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2176(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        this.Method273((double)Class1178.Method4741("Server: " + (Class463.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? "SingePlayer" : Class463.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getCurrentServerData().serverIP.toLowerCase())));
        this.Method274((double)Class1178.Method4748());
        Class1178.Method4745("Server: " + TextFormatting.GRAY + (Class463.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? "SingePlayer" : Class463.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getCurrentServerData().serverIP.toLowerCase()), this.Method267(), this.Method268(), this.Field9924.Method2151().Method3626());
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x192C ^ 0xD1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
