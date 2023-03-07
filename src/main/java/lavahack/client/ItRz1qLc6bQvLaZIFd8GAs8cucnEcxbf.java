/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.eXIEwpfsveJ6FwbLoefTKstatmuKRSOh;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/features/hud/modules/BindList;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "checkBoxes", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "colorActive", "colorG", "Lcom/kisman/cc/settings/types/SettingGroup;", "colorInactive", "hudModules", "modules", "offsets", "types", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "Element", "kisman.cc"})
public final class ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8414 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offsets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xED5DA2A38CECAE8CL ^ 0xAD5DA2A38CECAE8CL), 0.0, Double.longBitsToDouble((long)74781878 ^ 0x40240000047514B6L), (boolean)((long)-1527668192 ^ (long)-1527668191)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8415 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Types", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8416 = this.Method23(this.Field8415.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Modules", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1319509975 ^ (long)-1319509976))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8417 = this.Method23(this.Field8415.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hud Modules", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1861856231 ^ (long)1861856231))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8418 = this.Method23(this.Field8415.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Check Boxes", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1718011540L ^ 0x9999396D) != 0)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8419 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Colors", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8420 = this.Method23(this.Field8419.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Active Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Active Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)2046493687L ^ 0x79FB03F7, (int)((long)30165463 ^ (long)30165288), (int)-852767180L ^ 0xCD2BCE34, (int)((long)-29841066 ^ (long)-29840983)))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8421 = this.Method23(this.Field8419.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inactive Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Inactive Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1992185285 ^ (long)1992185146), (int)314829877L ^ 0x12C3EC35, (int)((long)1654466317 ^ (long)1654466317), (int)-1391374914L ^ 0xAD114D41))));
    private String Field8422 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method850(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Iterator iterator;
        int n;
        Object object;
        Object object22;
        Object object32;
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        double d = this.Method267();
        double d2 = this.Method268();
        ArrayList arrayList = new ArrayList();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field8416;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"modules");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            for (Object object32 : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854) {
                WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = object32;
                Intrinsics.checkExpressionValueIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
                if (!U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7141(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)) continue;
                object22 = arrayList;
                object = new ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object32).Method40() + " [" + U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7140((U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n)object32) + (char)((int)-2092651427L ^ 0x8344AC00), ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object32).Method35());
                n = (int)-1934115052L ^ 0x8CB7BF14;
                object22.add(object);
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field8417;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"hudModules");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            iterator = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Field9235.iterator();
            while (iterator.hasNext()) {
                Object object4 = object32 = (qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2)iterator.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"module");
                if (!U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7141((U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n)object4)) continue;
                object22 = arrayList;
                object = new ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object32).Method40() + " [" + U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7140((U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n)object32) + (char)((long)1725057605 ^ (long)1725057560), ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)object32).Method35());
                n = (int)1277264467L ^ 0x4C218253;
                object22.add(object);
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field8418;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"checkBoxes");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) {
            eXIEwpfsveJ6FwbLoefTKstatmuKRSOh eXIEwpfsveJ6FwbLoefTKstatmuKRSOh2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258;
            Intrinsics.checkExpressionValueIsNotNull((Object)eXIEwpfsveJ6FwbLoefTKstatmuKRSOh2, (String)"Kisman.instance.settingsManager");
            iterator = eXIEwpfsveJ6FwbLoefTKstatmuKRSOh2.Method7570().iterator();
            while (iterator.hasNext()) {
                Object object5 = object32 = (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)iterator.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)object5, (String)"setting");
                if (!U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7141((U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n)object5) || !((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)object32).Method386()) continue;
                object22 = arrayList;
                StringBuilder stringBuilder = new StringBuilder();
                WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)object32).Method358();
                Intrinsics.checkExpressionValueIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"setting.parentMod");
                object = new ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(stringBuilder.append(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40()).append("->").append(((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)object32).Method356()).append(" [").append(U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Field10935.Method7140((U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n)object32)).append((char)((long)1902840260 ^ (long)1902840217)).toString(), ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD)object32).Method365());
                n = (int)((long)-1358281850 ^ (long)-1358281850);
                object22.add(object);
            }
        }
        object32 = ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field11033;
        CollectionsKt.sortWith((List)arrayList, (Comparator)object32);
        int n2 = (int)-1483358650L ^ 0xA795BE46;
        for (Object object22 : (Iterable)arrayList) {
            int n3;
            String string = ((ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object22).Method1910();
            int n4 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field8414;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"offsets");
            double d3 = d2 + (double)(n2 * (n4 + qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method335()));
            if (((ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object22).Method1911()) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field8420;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"colorActive");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"colorActive.colour");
                n3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3626();
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field8421;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"colorInactive");
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"colorInactive.colour");
                n3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3626();
            }
            fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, d, d3, n3);
            ++n2;
        }
        Collection collection = arrayList;
        ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf = this;
        int n5 = (int)-406829891L ^ 0xE7C044BD;
        int n6 = !collection.isEmpty() ? (int)596587183L ^ 0x238F32AE : (int)((long)1654640277 ^ (long)1654640277);
        itRz1qLc6bQvLaZIFd8GAs8cucnEcxbf.Method273(0.0);
        double d4 = arrayList.size();
        double d5 = fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field8414;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"offsets");
        this.Method274(d4 * (d5 + (double)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method335()));
    }

    public ItRz1qLc6bQvLaZIFd8GAs8cucnEcxbf() {
        super("BindList", "Bind list like Abyss", ((int)572326269L ^ 0x221D017C) != 0);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)600664348L ^ 0x23CD691C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-597702527L ^ 0xDC5FC87E);
            int n2 = (int)((long)-1759928943 ^ (long)-1759928938) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-443174811L ^ 0xE595AB12) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

