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
import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class127;
import lavahack.client.Class1996;
import lavahack.client.Class2012;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

@Class2012
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/client/Baritone;", "Lcom/kisman/cc/features/module/Module;", "()V", "booleans", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "colors", "numbers", "settings", "", "Lcom/kisman/cc/features/module/client/baritone/BaritoneSetting;", "kisman.cc"})
public final class Class186
extends Class42 {
    private final Class1996 Field8809 = this.Method24(new Class1996(new Class44("Booleans", this)));
    private final Class1996 Field8810 = this.Method24(new Class1996(new Class44("Numbers", this)));
    private final Class1996 Field8811 = this.Method24(new Class1996(new Class44("Colors", this)));
    private final List Field8812;
    private String Field8813 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class186() {
        super("Baritone", "Config of baritone integration", Class97.Field8339);
        List list;
        Class186 class186 = this;
        boolean bl = false;
        class186.Field8812 = list = (List)new ArrayList();
        Iterator iterator = BaritoneAPI.getSettings().allSettings.iterator();
        while (iterator.hasNext()) {
            boolean bl2;
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
                Class44 class44 = this.Method23(this.Field8809.Method7405(new Class44(setting2.getName(), (Class42)this, (Boolean)object3)));
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"register(booleans.add(Se\u2026tting.value as Boolean)))");
                object = new Class127(class44, setting);
                bl2 = false;
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
                Class42 class42 = this;
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
                Class44 class44 = this.Method23(this.Field8810.Method7405(new Class44(string, class42, d, 0.0, Double.longBitsToDouble((long)1351188721 ^ 0x40240000508980F1L), true)));
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"register(numbers.add(Set\u2026    ), 0.0, 10.0, true)))");
                object4 = new Class127(class44, (Settings.Setting)collection);
                boolean bl3 = false;
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
            Class44 class44 = this.Method23(this.Field8811.Method7405(new Class44(setting4.getName(), (Class42)this, new Class2027((Color)object8))));
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"register(colors.add(Sett\u2026etting.value as Color))))");
            object = new Class127(class44, setting);
            bl2 = false;
            collection.add(object);
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 201;
            cArray2[n] = (char)(cArray[n] ^ (0x1077 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

