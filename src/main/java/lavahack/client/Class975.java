//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class975 extends Class42
{
    private String Field12180 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class975() {
        super("NoPushOutBlock", Class97.Field8340, true);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3978(final PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        playerSPPushOutOfBlocksEvent.setCanceled(true);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x38B6 ^ 0x42));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
