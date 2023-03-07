//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 */
package lavahack.client;

import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class PfqCMvgubmGDB5MFjxrd6KOCsFLrOPb4 {
    private static Minecraft Field10587 = Minecraft.getMinecraft();
    private String Field10588 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method2627(double d, double d2, double d3) {
        PfqCMvgubmGDB5MFjxrd6KOCsFLrOPb4.Field10587.player.setVelocity(0.0, 0.0, 0.0);
        PfqCMvgubmGDB5MFjxrd6KOCsFLrOPb4.Field10587.player.setPosition(d, d2, d3);
        PfqCMvgubmGDB5MFjxrd6KOCsFLrOPb4.Field10587.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, ((int)1330753423L ^ 0x4F51AF8E) != 0));
    }

    public static void Method2628(double d, double d2, double d3) {
        PfqCMvgubmGDB5MFjxrd6KOCsFLrOPb4.Field10587.player.setVelocity(0.0, 0.0, 0.0);
        PfqCMvgubmGDB5MFjxrd6KOCsFLrOPb4.Field10587.player.setPosition(d, d2, d3);
    }

    public static void Method2629(double d, double d2, double d3) {
        PfqCMvgubmGDB5MFjxrd6KOCsFLrOPb4.Field10587.player.setPosition(d, d2, d3);
    }
}

