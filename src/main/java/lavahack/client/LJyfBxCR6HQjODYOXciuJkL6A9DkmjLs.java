//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LJyfBxCR6HQjODYOXciuJkL6A9DkmjLs
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11562 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("XVal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1813376185 ^ 0x401000006C15ECB9L), Double.longBitsToDouble((long)150203151 ^ 0xC024000008F3EB0FL), Double.longBitsToDouble(0xD76D63F67AE50AE5L ^ 0x974963F67AE50AE5L), ((int)2651026L ^ 0x287393) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11563 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ZVal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1604976983 ^ 0x401000005FAA0157L), Double.longBitsToDouble(0x7C165503DCEC1637L ^ 0xBC325503DCEC1637L), Double.longBitsToDouble((long)1921199825 ^ 0x4024000072832ED1L), ((int)-675393551L ^ 0xD7BE4FF0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11564 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Connect", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)796508191L ^ 0x2F79C01F) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11565;
    private String Field11566 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public LJyfBxCR6HQjODYOXciuJkL6A9DkmjLs() {
        super("BlockLiner", "dev/debug module", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        String[] stringArray = new String[(int)((long)-1231062442 ^ (long)-1231062441) << 1];
        stringArray[(int)((long)-1718162135 ^ (long)-1718162135)] = "Inside";
        stringArray[(int)((long)2073858789 ^ (long)2073858788)] = "Outside";
        this.Field11565 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Inside", Arrays.asList(stringArray)));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3564(RenderWorldLastEvent renderWorldLastEvent) {
        if (LJyfBxCR6HQjODYOXciuJkL6A9DkmjLs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (LJyfBxCR6HQjODYOXciuJkL6A9DkmjLs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        System.out.println("Rendering...");
        BlockPos blockPos = new BlockPos(LJyfBxCR6HQjODYOXciuJkL6A9DkmjLs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Double.longBitsToDouble(0x3B7A0F44DBB5C053L ^ 0x7B6A0F44DBB5C053L), LJyfBxCR6HQjODYOXciuJkL6A9DkmjLs.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        BlockPos blockPos2 = blockPos.add(this.Field11562.Method367(), 0.0, this.Field11563.Method367());
        List list = bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD.Method4535(blockPos, blockPos2, this.Field11564.Method365(), this.Field11565.Method359().equals("Outside"));
        System.out.println(list.isEmpty());
        if (list.isEmpty()) {
            return;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos3 = (BlockPos)iterator.next();
            AxisAlignedBB axisAlignedBB = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(new AxisAlignedBB(blockPos3));
            exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(axisAlignedBB, 2.0f, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1363053145 ^ (long)-1363053224), (int)((long)1491122390 ^ (long)1491122217), (int)67599027L ^ 0x4077A4C, (int)((long)864935903 ^ (long)864935888) << 3), exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17214);
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)59132808L ^ 0x3864B88;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-240135143 ^ (long)-240134938);
            int n2 = (int)((long)307641236 ^ (long)307641325) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1663682838 ^ (long)-1663696757) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

