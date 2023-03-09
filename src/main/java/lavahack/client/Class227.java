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
import lavahack.client.Class1003;
import lavahack.client.Class1456;
import lavahack.client.Class2155;
import lavahack.client.Class312;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class953;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lcom/kisman/cc/features/module/render/BlockESP;", "Lcom/kisman/cc/features/module/Module;", "()V", "implementations", "", "Lcom/kisman/cc/features/module/render/blockesp/BlockImplementation;", "list", "Ljava/util/ArrayList;", "Lnet/minecraft/util/math/BlockPos;", "Lkotlin/collections/ArrayList;", "range", "Lcom/kisman/cc/settings/Setting;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "kotlin.jvm.PlatformType", "doBlockESP", "", "ticks", "", "doBlockESPLogic", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class Class227
extends Class42 {
    private final Class44 Field8990;
    private final List Field8991;
    private final Class411 Field8992;
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
        this.Field8992.Method2005(new Class1003(this));
        this.Method1283(renderWorldLastEvent.getPartialTicks());
    }

    private final void Method1283(float f) {
        Iterator iterator = this.Field8993.iterator();
        block0: while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = this.Field8991.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                Class953 class953 = (Class953)iterator2.next();
                BlockPos blockPos2 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
                class953.Method3474(blockPos2);
            }
            break;
        }
        return;
    }

    private final void Method1284() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(this.Field8993.size());
        Iterator iterator = Class2155.Method7758(this.Field8990.Method368(), true, false).iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                Class227.Method1286().addScheduledTask((Runnable)new Class312(this, arrayList));
                return;
            }
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = this.Field8991.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                Class953 class953 = (Class953)iterator2.next();
                BlockPos blockPos2 = blockPos;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
                if (!class953.Method3473(blockPos2)) continue;
                arrayList.add(blockPos);
            }
            break;
        }
    }

    public Class227() {
        super("BlockESP", Class97.Field8342);
        Class44 class44 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)2109976226 ^ 0x403E00007DC3AEA2L), 0.0, Double.longBitsToDouble((long)713029976 ^ 0x404900002A7FF958L), true));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"register(Setting(\"Range\"\u2026, 30.0, 0.0, 50.0, true))");
        this.Field8990 = class44;
        this.Field8991 = CollectionsKt.listOf((Object[])new Class953[]{new Class953(Class1456.Field14811, this), new Class953(Class1456.Field14812, this), new Class953(Class1456.Field14813, this), new Class953(Class1456.Field14814, this)});
        this.Field8992 = this.Method54();
        this.Field8993 = new ArrayList();
    }

    public static final void Method1285(Class227 class227) {
        class227.Method1284();
    }

    public static final Minecraft Method1286() {
        return Class42.Field8052;
    }

    public static final void Method1287(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final ArrayList Method1288(Class227 class227) {
        return class227.Field8993;
    }

    public static final void Method1289(Class227 class227, ArrayList arrayList) {
        class227.Field8993 = arrayList;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 0;
            cArray2[n] = (char)(cArray[n] ^ (0x4F28 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

