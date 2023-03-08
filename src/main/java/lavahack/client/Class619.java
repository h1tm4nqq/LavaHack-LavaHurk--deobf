//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.util.text.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class619 extends Class1249
{
    private final Class44 Field10644;
    private String Field10645 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class619() {
        super("Ping", "", true);
        this.Field10644 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2653(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final String string = "Ping: " + TextFormatting.GRAY + (Class619.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? 0 : Class1796.Field16241.Field16275.Method7401());
        this.Method273((double)Class1178.Method4741(string));
        this.Method274((double)Class1178.Method4748());
        Class1178.Method4745(string, this.Method267(), this.Method268(), this.Field10644.Method365() ? Class1172.Method4709(100, 100) : -1);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2ADE ^ 0x68));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
