//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.hjEf4RewUHmrg3aViFltbuwtrChcFb7G$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;

@GMX4zGkGCEBL3RzM3pAccbEOC6fgYiKM
@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/features/module/combat/CrystalPvPHelper;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoBurrow", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "autoSurround", "distance", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "triggered", "", "onEnable", "", "update", "kisman.cc"})
public final class hjEf4RewUHmrg3aViFltbuwtrChcFb7G
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11368 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)206849917 ^ 0x400800000C54477DL), 1.0, Double.longBitsToDouble(0x905658A119C6F257L ^ 0xD07258A119C6F257L), ((int)1340242052L ^ 0x4FE27885) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11369 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Burrow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-510129730L ^ 0xE19809BE) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11370 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Surround", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)244089786 ^ (long)244089786)));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field11371 = this.Method54();
    private boolean Field11372;
    private String Field11373 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        this.Field11371.Method2004();
        this.Field11372 = (int)1183687111L ^ 0x468DA1C7;
    }

    @Override
    public void Method45() {
        if (hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().player == null) return;
        if (hjEf4RewUHmrg3aViFltbuwtrChcFb7G.Method3301().world == null) {
            return;
        }
        this.Field11371.Method2005(new hjEf4RewUHmrg3aViFltbuwtrChcFb7G$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
    }

    public hjEf4RewUHmrg3aViFltbuwtrChcFb7G() {
        super("CrystalPvPHelper", "Helps with crystal pvp.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    public static final Minecraft Method3301() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method3302(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final boolean Method3303(hjEf4RewUHmrg3aViFltbuwtrChcFb7G hjEf4RewUHmrg3aViFltbuwtrChcFb7G2) {
        return hjEf4RewUHmrg3aViFltbuwtrChcFb7G2.Field11372;
    }

    public static final void Method3304(hjEf4RewUHmrg3aViFltbuwtrChcFb7G hjEf4RewUHmrg3aViFltbuwtrChcFb7G2, boolean bl) {
        hjEf4RewUHmrg3aViFltbuwtrChcFb7G2.Field11372 = bl;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3305(hjEf4RewUHmrg3aViFltbuwtrChcFb7G hjEf4RewUHmrg3aViFltbuwtrChcFb7G2) {
        return hjEf4RewUHmrg3aViFltbuwtrChcFb7G2.Field11368;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3306(hjEf4RewUHmrg3aViFltbuwtrChcFb7G hjEf4RewUHmrg3aViFltbuwtrChcFb7G2) {
        return hjEf4RewUHmrg3aViFltbuwtrChcFb7G2.Field11369;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3307(hjEf4RewUHmrg3aViFltbuwtrChcFb7G hjEf4RewUHmrg3aViFltbuwtrChcFb7G2) {
        return hjEf4RewUHmrg3aViFltbuwtrChcFb7G2.Field11370;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)184950407L ^ 0xB061E87;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)724189330L ^ 0x2B2A406D);
            int n2 = (int)1384386736L ^ 0x5284107F;
            cArray2[n] = (char)(cArray[n] ^ (((int)-492420950L ^ 0xE2A6429D) << 5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

