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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.play.server.SPacketDisconnect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class X950dA6CX1rtDQtTPaet4LchwwaxEDjR
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field11601 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public X950dA6CX1rtDQtTPaet4LchwwaxEDjR() {
        super("AutoLog", "5", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7569(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Health", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1420157164 ^ 0x4024000054A5E0ECL), 1.0, Double.longBitsToDouble(0x230F4AE4FFDAAD42L ^ 0x634D4AE4FFDAAD42L), ((int)1825768747L ^ 0x6CD3052A) != 0));
    }

    @Override
    public void Method45() {
        if (X950dA6CX1rtDQtTPaet4LchwwaxEDjR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (X950dA6CX1rtDQtTPaet4LchwwaxEDjR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = (int)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7572(this, "Health").Method367();
        if (!(X950dA6CX1rtDQtTPaet4LchwwaxEDjR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() < (float)n)) return;
        X950dA6CX1rtDQtTPaet4LchwwaxEDjR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.handleDisconnect(new SPacketDisconnect((ITextComponent)new TextComponentString("your health < " + n)));
        this.Method21((boolean)((long)2122057518 ^ (long)2122057518));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)285957549 ^ (long)285957549);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-770232828L ^ 0xD2172EFB);
            int n2 = (int)((long)-959860584 ^ (long)-959860645);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1195286173L ^ 0xB8C16398 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

