//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class Class607
{
    private static Minecraft Field10587;
    private String Field10588 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method2627(final double n, final double n2, final double n3) {
        Class607.Field10587.player.setVelocity(0.0, 0.0, 0.0);
        Class607.Field10587.player.setPosition(n, n2, n3);
        Class607.Field10587.player.connection.sendPacket((Packet)new CPacketPlayer$Position(n, n2, n3, true));
    }
    
    public static void Method2628(final double n, final double n2, final double n3) {
        Class607.Field10587.player.setVelocity(0.0, 0.0, 0.0);
        Class607.Field10587.player.setPosition(n, n2, n3);
    }
    
    public static void Method2629(final double n, final double n2, final double n3) {
        Class607.Field10587.player.setPosition(n, n2, n3);
    }
    
    static {
        Class607.Field10587 = Minecraft.getMinecraft();
    }
}
