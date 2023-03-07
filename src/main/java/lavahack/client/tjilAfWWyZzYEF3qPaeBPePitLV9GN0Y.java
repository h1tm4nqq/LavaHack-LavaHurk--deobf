/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.util.HashMap;
import java.util.function.Predicate;
import kotlin.Metadata;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/module/client/ChunkAnimator;", "Lcom/kisman/cc/features/module/Module;", "()V", "chunks", "Ljava/util/HashMap;", "Lnet/minecraft/client/renderer/chunk/RenderChunk;", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/collections/HashMap;", "easing", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$Easing;", "length", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "renderChunk", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventRenderChunk;", "renderChunkContainer", "Lcom/kisman/cc/event/events/EventRenderChunkContainer;", "onDisable", "", "onEnable", "kisman.cc"})
public final class tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13702 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Length", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8F874D1B52031131L ^ 0xCF080D1B52031131L), Double.longBitsToDouble((long)360104684 ^ 0x406F40001576C2ECL), Double.longBitsToDouble((long)1970040711 ^ 0x40B38800756C6F87L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13703 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Easing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8814).Method5303();
    private final HashMap Field13704 = new HashMap();
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13705 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this), new Predicate[(int)-869907887L ^ 0xCC264251]);
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13706 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)((long)1545498830 ^ (long)1545498830)]);
    private String Field13707 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13705);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13706);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13705);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13706);
    }

    public tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y() {
        super("ChunkAnimator", "Implementation of the chunk animator mod.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
    }

    public static final HashMap Method5088(tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2) {
        return tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2.Field13704;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method5089(tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2) {
        return tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2.Field13702;
    }

    public static final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Method5090(tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2) {
        return tjilAfWWyZzYEF3qPaeBPePitLV9GN0Y2.Field13703;
    }

    public static final Minecraft Method5091() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method5092(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1319555123L ^ 0xB1592FCD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2115520250L ^ 0x81E7B9F9);
            int n2 = (int)((long)664027053 ^ (long)664026952);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-321271140 ^ (long)-321280031) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

