//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89;
import lavahack.client.tc7iwrZRQCCStOIislXaDGOLupHflkQv;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import lavahack.client.vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/features/module/render/BlockESP;", "Lcom/kisman/cc/features/module/Module;", "()V", "implementations", "", "Lcom/kisman/cc/features/module/render/blockesp/BlockImplementation;", "list", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "range", "Lcom/kisman/cc/settings/Setting;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "kotlin.jvm.PlatformType", "doBlockESP", "", "ticks", "", "doBlockESPLogic", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8990;
    private final List Field8991;
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field8992;
    private ArrayList Field8993;
    private int Field8994;

    @Override
    public void Method38() {
        super.Method38();
        this.Field8993.clear();
        this.Field8992.Method2004();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method1282(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        this.Field8992.Method2005(new vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this));
        this.Method1283(renderWorldLastEvent.getPartialTicks());
    }

    private final void Method1283(float f) {
        Iterator iterator = this.Field8993.iterator();
        block0: while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = this.Field8991.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                tc7iwrZRQCCStOIislXaDGOLupHflkQv tc7iwrZRQCCStOIislXaDGOLupHflkQv2 = (tc7iwrZRQCCStOIislXaDGOLupHflkQv)iterator2.next();
                BlockPos blockPos2 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
                tc7iwrZRQCCStOIislXaDGOLupHflkQv2.Method3474(blockPos2);
            }
            break;
        }
        return;
    }

    private final void Method1284() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(this.Field8993.size());
        Iterator iterator = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7758(this.Field8990.Method368(), (boolean)((long)-91382651 ^ (long)-91382652), ((int)-551633646L ^ 0xDF1EBD12) != 0).iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp.Method1286().addScheduledTask((Runnable)new vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, arrayList));
                return;
            }
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = this.Field8991.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                tc7iwrZRQCCStOIislXaDGOLupHflkQv tc7iwrZRQCCStOIislXaDGOLupHflkQv2 = (tc7iwrZRQCCStOIislXaDGOLupHflkQv)iterator2.next();
                BlockPos blockPos2 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
                if (!tc7iwrZRQCCStOIislXaDGOLupHflkQv2.Method3473(blockPos2)) continue;
                arrayList.add(blockPos);
            }
            break;
        }
    }

    public vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp() {
        super("BlockESP", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)2109976226 ^ 0x403E00007DC3AEA2L), 0.0, Double.longBitsToDouble((long)713029976 ^ 0x404900002A7FF958L), ((int)-1716444778L ^ 0x99B12197) != 0));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"register(Setting(\"Range\"\u2026, 30.0, 0.0, 50.0, true))");
        this.Field8990 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        Object[] objectArray = new tc7iwrZRQCCStOIislXaDGOLupHflkQv[(int)((long)-1629962804 ^ (long)-1629962803) << 2];
        objectArray[(int)958217698L ^ 0x391D3DE2] = new tc7iwrZRQCCStOIislXaDGOLupHflkQv(rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89.Field14811, this);
        objectArray[(int)1924508843L ^ 0x72B5ACAA] = new tc7iwrZRQCCStOIislXaDGOLupHflkQv(rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89.Field14812, this);
        objectArray[(int)((long)-1674739663 ^ (long)-1674739664) << 1] = new tc7iwrZRQCCStOIislXaDGOLupHflkQv(rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89.Field14813, this);
        objectArray[(int)-396548563L ^ 0xE85D262E] = new tc7iwrZRQCCStOIislXaDGOLupHflkQv(rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89.Field14814, this);
        this.Field8991 = CollectionsKt.listOf((Object[])objectArray);
        this.Field8992 = this.Method54();
        this.Field8993 = new ArrayList();
    }

    public static final void Method1285(vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp2) {
        vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp2.Method1284();
    }

    public static final Minecraft Method1286() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method1287(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final ArrayList Method1288(vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp2) {
        return vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp2.Field8993;
    }

    public static final void Method1289(vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp2, ArrayList arrayList) {
        vy2aPrn8L9XyjxQ83jqt4ZWfKcmQ5VSp2.Field8993 = arrayList;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1545469144L ^ 0xA3E20328;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-250235081L ^ 0xF115B7C8);
            int n2 = (int)((long)-110884743 ^ (long)-110884743);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1603918132 ^ (long)-1603915991) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

