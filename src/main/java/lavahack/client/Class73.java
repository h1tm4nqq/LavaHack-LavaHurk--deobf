//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class73 extends Class1249
{
    private String Field8243 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class73() {
        super("Tps", "");
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method660(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final ScaledResolution scaledResolution = new ScaledResolution(Class73.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        final String string = TextFormatting.WHITE + "TPS: " + TextFormatting.GRAY + Class1796.Field16241.Field16275.Method7398();
        Class1178.Method4745(string, (double)(scaledResolution.getScaledWidth() - 1 - Class1178.Method4741(string)), (double)(scaledResolution.getScaledHeight() - 3 - Class1178.Method4748() * 2), -1);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x57EF ^ 0xD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
