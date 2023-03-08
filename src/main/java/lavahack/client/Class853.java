//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.server.*;
import net.minecraft.util.text.*;

public class Class853 extends Class42
{
    private String Field11601 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class853() {
        super("AutoLog", "5", Class97.Field8343);
        Class1796.Field16241.Field16258.Method7569(new Class44("Health", (Class42)this, Double.longBitsToDouble((long)1420157164 ^ 0x4024000054A5E0ECL), 1.0, Double.longBitsToDouble(4630263366890291200L), true));
    }
    
    public void Method45() {
        if (Class853.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class853.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final int i = (int)Class1796.Field16241.Field16258.Method7572((Class42)this, "Health").Method367();
        if (Class853.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() < i) {
            Class853.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.handleDisconnect(new SPacketDisconnect((ITextComponent)new TextComponentString("your health < " + i)));
            this.Method21(false);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2FB ^ 0xC3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
