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

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class2047;
import lavahack.client.Class392;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class695;
import lavahack.client.Class712;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/features/hud/modules/BindList;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "checkBoxes", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "colorActive", "colorG", "Lcom/kisman/cc/settings/types/SettingGroup;", "colorInactive", "hudModules", "modules", "offsets", "types", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "Element", "kisman.cc"})
public final class Class119
extends Class1249 {
    private final Class44 Field8414 = this.Method23(new Class44("Offsets", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 0.0, Double.longBitsToDouble((long)74781878 ^ 0x40240000047514B6L), true));
    private final Class1996 Field8415 = this.Method24(new Class1996(new Class44("Types", this)));
    private final Class44 Field8416 = this.Method23(this.Field8415.Method7405(new Class44("Modules", (Class42)this, true)));
    private final Class44 Field8417 = this.Method23(this.Field8415.Method7405(new Class44("Hud Modules", (Class42)this, false)));
    private final Class44 Field8418 = this.Method23(this.Field8415.Method7405(new Class44("Check Boxes", (Class42)this, true)));
    private final Class1996 Field8419 = this.Method24(new Class1996(new Class44("Colors", this)));
    private final Class44 Field8420 = this.Method23(this.Field8419.Method7405(new Class44("Active Color", (Class42)this, "Active Color", new Class2027(0, 255, 0, 255))));
    private final Class44 Field8421 = this.Method23(this.Field8419.Method7405(new Class44("Inactive Color", (Class42)this, "Inactive Color", new Class2027(255, 0, 0, 255))));
    private String Field8422 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public final void Method850(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        Iterator iterator;
        boolean bl;
        Object object;
        Object object22;
        Object object32;
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        double d = this.Method267();
        double d2 = this.Method268();
        ArrayList arrayList = new ArrayList();
        Class44 class44 = this.Field8416;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"modules");
        if (class44.Method365()) {
            for (Object object32 : Class1796.Field16241.Field16254.Field8854) {
                Class42 class42 = object32;
                Intrinsics.checkExpressionValueIsNotNull((Object)class42, (String)"module");
                if (!Class695.Field10935.Method7141(class42)) continue;
                object22 = arrayList;
                object = new Class392(((Class42)object32).Method40() + " [" + Class695.Field10935.Method7140((Class695)object32) + ']', ((Class42)object32).Method35());
                bl = false;
                object22.add(object);
            }
        }
        Class44 class442 = this.Field8417;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"hudModules");
        if (class442.Method365()) {
            iterator = Class1796.Field16241.Field16257.Field9235.iterator();
            while (iterator.hasNext()) {
                Object object4 = object32 = (Class1249)iterator.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"module");
                if (!Class695.Field10935.Method7141((Class695)object4)) continue;
                object22 = arrayList;
                object = new Class392(((Class42)object32).Method40() + " [" + Class695.Field10935.Method7140((Class695)object32) + ']', ((Class42)object32).Method35());
                bl = false;
                object22.add(object);
            }
        }
        Class44 class443 = this.Field8418;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"checkBoxes");
        if (class443.Method365()) {
            Class2047 class2047 = Class1796.Field16241.Field16258;
            Intrinsics.checkExpressionValueIsNotNull((Object)class2047, (String)"Kisman.instance.settingsManager");
            iterator = class2047.Method7570().iterator();
            while (iterator.hasNext()) {
                Object object5 = object32 = (Class44)iterator.next();
                Intrinsics.checkExpressionValueIsNotNull((Object)object5, (String)"setting");
                if (!Class695.Field10935.Method7141((Class695)object5) || !((Class44)object32).Method386()) continue;
                object22 = arrayList;
                StringBuilder stringBuilder = new StringBuilder();
                Class42 class42 = ((Class44)object32).Method358();
                Intrinsics.checkExpressionValueIsNotNull((Object)class42, (String)"setting.parentMod");
                object = new Class392(stringBuilder.append(class42.Method40()).append("->").append(((Class44)object32).Method356()).append(" [").append(Class695.Field10935.Method7140((Class695)object32)).append(']').toString(), ((Class44)object32).Method365());
                bl = false;
                object22.add(object);
            }
        }
        object32 = Class712.Field11033;
        CollectionsKt.sortWith((List)arrayList, (Comparator)object32);
        int n = 0;
        for (Object object22 : (Iterable)arrayList) {
            int n2;
            String string = ((Class392)object22).Method1910();
            int n3 = Class1178.Method4748();
            Class44 class444 = this.Field8414;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"offsets");
            double d3 = d2 + (double)(n * (n3 + class444.Method335()));
            if (((Class392)object22).Method1911()) {
                Class44 class445 = this.Field8420;
                Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"colorActive");
                Class2027 class2027 = class445.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"colorActive.colour");
                n2 = class2027.Method3626();
            } else {
                Class44 class446 = this.Field8421;
                Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"colorInactive");
                Class2027 class2027 = class446.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"colorInactive.colour");
                n2 = class2027.Method3626();
            }
            Class1178.Method4745(string, d, d3, n2);
            ++n;
        }
        Collection collection = arrayList;
        Class119 class119 = this;
        boolean bl2 = false;
        boolean bl3 = !collection.isEmpty();
        class119.Method273(0.0);
        double d4 = arrayList.size();
        double d5 = Class1178.Method4748();
        Class44 class447 = this.Field8414;
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"offsets");
        this.Method274(d4 * (d5 + (double)class447.Method335()));
    }

    public Class119() {
        super("BindList", "Bind list like Abyss", true);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 28;
            cArray2[n] = (char)(cArray[n] ^ (0x6DDC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

