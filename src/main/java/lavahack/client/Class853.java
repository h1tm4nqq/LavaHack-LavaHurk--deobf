//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketDisconnect
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 */
package lavahack.client;

import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketDisconnect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class Class853
extends Class42 {
    private String Field11601 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class853() {
        super("AutoLog", "5", Class97.Field8343);
        Class1796.Field16241.Field16258.Method7569(new Class44("Health", (Class42)this, Double.longBitsToDouble((long)1420157164 ^ 0x4024000054A5E0ECL), 1.0, Double.longBitsToDouble(0x4042000000000000L), true));
    }

    @Override
    public void Method45() {
        if (Class853.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class853.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = (int)Class1796.Field16241.Field16258.Method7572(this, "Health").Method367();
        if (!(Class853.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() < (float)n)) return;
        Class853.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.handleDisconnect(new SPacketDisconnect((ITextComponent)new TextComponentString("your health < " + n)));
        this.Method21(false);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 195;
            cArray2[n] = (char)(cArray[n] ^ (0x2FB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

