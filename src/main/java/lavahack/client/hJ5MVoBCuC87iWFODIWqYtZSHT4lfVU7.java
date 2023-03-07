//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.DimensionType
 *  net.minecraft.world.WorldProvider
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0017H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2={"Lcom/kisman/cc/features/module/render/Trails;", "Lcom/kisman/cc/features/module/Module;", "()V", "color", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "delay", "fade", "fadeDelay", "lineWidth", "positions", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/render/Trails$Trace;", "Lkotlin/collections/ArrayList;", "timer", "Lcom/kisman/cc/util/TimerUtils;", "trace", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "render", "Lcom/kisman/cc/features/module/render/Trails$TracePos;", "Companion", "Trace", "TracePos", "kisman.cc"})
public final class hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9411 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1710858242 ^ (long)-1710858495), (int)((long)-999419257 ^ (long)-999419272), (int)-419888670L ^ 0xE6F9011D, (int)((long)-1733836153 ^ (long)-1733836168))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9412 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)728799967 ^ 0x402400002B709ADFL), 1.0, Double.longBitsToDouble((long)1521765716 ^ 0x408F40005AB44D54L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9413 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fade", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1336405753L ^ 0x4FA7EEF8) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9414 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fade Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xDA6AB499ACCA79E1L ^ 0x9A15F499ACCA79E1L), Double.longBitsToDouble(0x6C0660754B4654ADL ^ 0x2C2260754B4654ADL), Double.longBitsToDouble(0x5FFE97F8E022476AL ^ 0x1F3D1FF8E022476AL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method313(new hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9415 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Line Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)2142244066 ^ 0x3FB99999E6299578L), Double.longBitsToDouble((long)1666183002 ^ 0x40140000634FEF5AL), (boolean)((long)-703120430 ^ (long)-703120430)));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field9416 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final ArrayList Field9417 = new ArrayList();
    private hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9418;
    @NotNull
    private static final Vec3d Field9419;
    public static final hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9420;
    private String Field9421 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field9416.Method2801();
        this.Field9417.clear();
        this.Field9418 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method1680(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Object object;
        Object object2;
        Iterator<hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV> iterator;
        Object object32;
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field9412;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"delay");
        if (this.Field9416.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method369())) {
            EntityPlayerSP entityPlayerSP = hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7.Method1682().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            object32 = entityPlayerSP.getPositionVector();
            if (this.Field9418 == null) {
                int n = (int)((long)-436218430 ^ (long)-436218430);
                WorldProvider worldProvider = hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7.Method1682().world.provider;
                Intrinsics.checkExpressionValueIsNotNull((Object)worldProvider, (String)"mc.world.provider");
                DimensionType dimensionType = worldProvider.getDimensionType();
                Intrinsics.checkExpressionValueIsNotNull((Object)dimensionType, (String)"mc.world.provider.dimensionType");
                Object object4 = object32;
                Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"vec");
                this.Field9418 = new hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(n, null, dimensionType, (Vec3d)object4, new ArrayList());
            }
            hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = this.Field9418;
            if (hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == null) {
                Intrinsics.throwNpe();
            }
            object2 = ((ArrayList)((Object)(iterator = hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2257()))).isEmpty() ? object32 : ((hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)((ArrayList)((Object)iterator)).get(((ArrayList)((Object)iterator)).size() - (int)((long)-521929918 ^ (long)-521929917))).Method3222();
            object = (Collection)((Object)iterator);
            int n = (int)-407957922L ^ 0xE7AF0E5E;
            int n2 = !object.isEmpty() ? (int)((long)1920308003 ^ (long)1920308002) : (int)859786236L ^ 0x333F4BFC;
            if (((ArrayList)((Object)iterator)).isEmpty() || !object32.equals(object2)) {
                Object object5 = object32;
                Intrinsics.checkExpressionValueIsNotNull((Object)object5, (String)"vec");
                long l = System.currentTimeMillis();
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field9414;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"fadeDelay");
                ((ArrayList)((Object)iterator)).add(new hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV((Vec3d)object5, l + (long)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335()));
            }
            this.Field9416.Method2801();
        }
        if (this.Field9418 == null) return;
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field9415;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"lineWidth");
        GL11.glLineWidth((float)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method368());
        for (Object object32 : this.Field9417) {
            GL11.glBegin((int)((int)-801729971L ^ 0xD036924E));
            object = ((hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object32).Method2257().iterator();
            while (object.hasNext()) {
                Object object6 = object2 = (hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)object6, (String)"tr");
                this.Method1681((hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object6);
            }
            GL11.glEnd();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field9413;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"fade");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) continue;
            ((hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object32).Method2257().removeIf(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field13967);
        }
        GL11.glBegin((int)((int)((long)465243631 ^ (long)465243628)));
        hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = this.Field9418;
        ArrayList arrayList = hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf != null ? hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method2257() : null;
        if (arrayList == null) {
            Intrinsics.throwNpe();
        }
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object object7 = object32 = (hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)object7, (String)"tr");
            this.Method1681((hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object7);
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field9413;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"fade");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) {
            hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2 = this.Field9418;
            ArrayList arrayList2 = hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2 != null ? hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method2257() : null;
            if (arrayList2 == null) {
                Intrinsics.throwNpe();
            }
            arrayList2.removeIf(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10398);
        }
        GL11.glEnd();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    private final void Method1681(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        float f;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field9413;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fade");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"color");
            float f2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method339().Field17328;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field9414;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"fadeDelay");
            float f3 = f2 / (float)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method335() * (float)(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method3224() - System.currentTimeMillis());
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"color");
            float f4 = MathHelper.clamp((float)f3, (float)0.0f, (float)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method339().Field17327);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"color");
            f = f4 / qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method339().Field17327;
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field9411;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"color");
            f = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method339().Field17328;
        }
        float f5 = f;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"color");
        float f6 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method339().Field17325;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"color");
        float f7 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method339().Field17326;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = this.Field9411;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"color");
        GL11.glColor4f((float)f6, (float)f7, (float)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method339().Field17327, (float)f5);
        GL11.glVertex3d((double)(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method3222().x - hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7.Method1682().renderManager.renderPosX), (double)(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method3222().y - hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7.Method1682().renderManager.renderPosY), (double)(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method3222().z - hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7.Method1682().renderManager.renderPosZ));
    }

    public hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7() {
        super("Trails", "nice", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    static {
        Field9420 = new hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
        Field9419 = new Vec3d(Double.longBitsToDouble(0x1FA156D11E167C52L ^ 0x5F8156D11E167C52L), Double.longBitsToDouble((long)716096434 ^ 0x405000002AAEC3B2L), Double.longBitsToDouble(0xFAC83A219A0AE7BDL ^ 0xBAE83A219A0AE7BDL));
    }

    public static final Minecraft Method1682() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method1683(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method1684(hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU7 hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU72) {
        return hJ5MVoBCuC87iWFODIWqYtZSHT4lfVU72.Field9413;
    }

    public static final Vec3d Method1685() {
        return Field9419;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)663499722 ^ (long)663499722);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1139376474 ^ (long)-1139376551);
            int n2 = ((int)181538599L ^ 0xAD20F26) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)805192261L ^ 0x2FFE626C) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

