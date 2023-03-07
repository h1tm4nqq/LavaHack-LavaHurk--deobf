//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.Iterator;
import java.util.List;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU;
import lavahack.client.kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TdBQB1REDDiDHGmWnLqAvns14rJdUP1x
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8492 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0x78EAA819F3F3493DL ^ 0x38C4A819F3F3493DL), Double.longBitsToDouble(0xEF0C7D9BF865B14CL ^ 0xAF327D9BF865B14CL), ((int)2092241519L ^ 0x7CB5126F) != 0));
    private String Field8493 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public TdBQB1REDDiDHGmWnLqAvns14rJdUP1x() {
        super("HoleTest", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345, ((int)1492638962L ^ 0x58F7DCF3) != 0);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method911(RenderWorldLastEvent renderWorldLastEvent) {
        if (TdBQB1REDDiDHGmWnLqAvns14rJdUP1x.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (TdBQB1REDDiDHGmWnLqAvns14rJdUP1x.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        List list = kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU.Method6031(this.Field8492.Method367());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)iterator.next();
            exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(kD8A0XW80bdjzvpfOacwFvL1Lk9tiNtU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method7277()), 2.0f, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1580781235 ^ (long)1580781132), (int)-896206615L ^ 0xCA94F816, (int)-1351325005L ^ 0xAF746A4C, (int)((long)-1877817882 ^ (long)-1877817879) << 3), new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1790555331 ^ (long)-1790555198), (int)((long)-1560405215 ^ (long)-1560405026), (int)((long)-1344483292 ^ (long)-1344483109), (int)((long)1099361335 ^ (long)1099361336) << 3), exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17214);
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)336806562 ^ (long)336806562);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2028189491L ^ 0x871C4832);
            int n2 = (int)((long)1427240803 ^ (long)1427240896);
            cArray2[n] = (char)(cArray[n] ^ ((int)-434624116L ^ 0xE618069F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

