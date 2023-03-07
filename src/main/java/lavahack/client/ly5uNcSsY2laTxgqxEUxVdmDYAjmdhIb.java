/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings$Setting
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/client/Baritone;", "Lcom/kisman/cc/features/module/Module;", "()V", "booleans", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "colors", "numbers", "settings", "", "Lcom/kisman/cc/features/module/client/baritone/BaritoneSetting;", "kisman.cc"})
public final class ly5uNcSsY2laTxgqxEUxVdmDYAjmdhIb
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8809 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Booleans", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8810 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Numbers", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field8811 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Colors", this)));
    private final List Field8812;
    private String Field8813 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public ly5uNcSsY2laTxgqxEUxVdmDYAjmdhIb() {
        super("Baritone", "Config of baritone integration", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
        List list;
        ly5uNcSsY2laTxgqxEUxVdmDYAjmdhIb ly5uNcSsY2laTxgqxEUxVdmDYAjmdhIb2 = this;
        int n = (int)((long)-711890388 ^ (long)-711890388);
        ly5uNcSsY2laTxgqxEUxVdmDYAjmdhIb2.Field8812 = list = (List)new ArrayList();
        Iterator iterator = BaritoneAPI.getSettings().allSettings.iterator();
        while (iterator.hasNext()) {
            int n2;
            Object object;
            Collection collection;
            Settings.Setting setting = (Settings.Setting)iterator.next();
            Object object2 = setting.value;
            if (object2 instanceof Boolean) {
                collection = this.Field8812;
                Settings.Setting setting2 = setting;
                Intrinsics.checkExpressionValueIsNotNull((Object)setting2, (String)"setting");
                Object object3 = setting.value;
                if (object3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Method23(this.Field8809.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(setting2.getName(), (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (Boolean)object3)));
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"register(booleans.add(Se\u2026tting.value as Boolean)))");
                object = new jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, setting);
                n2 = (int)650519831L ^ 0x26C62517;
                collection.add(object);
                continue;
            }
            if (object2 instanceof Float || object2 instanceof Double || object2 instanceof Integer) {
                double d;
                Settings.Setting setting3;
                object = setting.value;
                if (object instanceof Float) {
                    setting3 = setting;
                    if (setting3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type baritone.api.Settings.Setting<kotlin.Float>");
                    }
                } else if (object instanceof Integer) {
                    setting3 = setting;
                    if (setting3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type baritone.api.Settings.Setting<kotlin.Int>");
                    }
                } else {
                    setting3 = setting;
                    if (setting3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type baritone.api.Settings.Setting<kotlin.Double>");
                    }
                }
                collection = setting3;
                object = this.Field8812;
                String string = setting.getName();
                WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = this;
                Object object4 = setting.value;
                if (object4 instanceof Float) {
                    Object object5 = ((Settings.Setting)collection).value;
                    if (object5 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    }
                    d = ((Float)object5).floatValue();
                } else if (object4 instanceof Double) {
                    Object object6 = ((Settings.Setting)collection).value;
                    if (object6 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Double");
                    }
                    d = (Double)object6;
                } else {
                    Object object7 = ((Settings.Setting)collection).value;
                    if (object7 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                    d = ((Integer)object7).intValue();
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Method23(this.Field8810.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(string, wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, d, 0.0, Double.longBitsToDouble((long)1351188721 ^ 0x40240000508980F1L), ((int)2034725837L ^ 0x794773CC) != 0)));
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"register(numbers.add(Set\u2026    ), 0.0, 10.0, true)))");
                object4 = new jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (Settings.Setting)collection);
                int n3 = (int)2053061782L ^ 0x7A5F3C96;
                object.add(object4);
                continue;
            }
            if (!(object2 instanceof Color)) continue;
            collection = this.Field8812;
            Settings.Setting setting4 = setting;
            Intrinsics.checkExpressionValueIsNotNull((Object)setting4, (String)"setting");
            Object object8 = setting.value;
            if (object8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.awt.Color");
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Method23(this.Field8811.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(setting4.getName(), (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((Color)object8))));
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"register(colors.add(Sett\u2026etting.value as Color))))");
            object = new jen5HLCIHtQYi4Qq7NRvmaQqqMjcvmhV(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, setting);
            n2 = (int)((long)1428023594 ^ (long)1428023594);
            collection.add(object);
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1533018326 ^ (long)1533018326);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1723961624L ^ 0x66C191E7);
            int n2 = (int)-2084004551L ^ 0x83C89DF0;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1508954806 ^ (long)-1508950723) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

