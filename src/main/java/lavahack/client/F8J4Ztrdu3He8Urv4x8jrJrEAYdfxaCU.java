//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.client.F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15810 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Target", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9836);
    private String Field15811 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public F8J4Ztrdu3He8Urv4x8jrJrEAYdfxaCU() {
        super("TotemPopCounter", "totem pops count!", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15810);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6468(BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh brWsHdiLAwYGSB35z3ypQAx8eRulUOBh) {
        if (!(brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi() instanceof EntityPlayer)) return;
        boolean bl = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16256.Method3042((EntityPlayer)brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        if (bl && this.Field15810.Method359().equals("Only Other Players")) {
            return;
        }
        if (!bl && this.Field15810.Method359().equals("Only Friends")) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886((bl ? TextFormatting.AQUA : TextFormatting.GRAY) + brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.leqS0IyKEB621E1SrHdAcHHAUjScjmKi().getName() + TextFormatting.GRAY + " was popped totem!");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-222050522 ^ (long)-222050522);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1652707561 ^ (long)1652707350);
            int n2 = (int)((long)1748405688 ^ (long)1748405651) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1259890981L ^ 0xB4E7AE82) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

