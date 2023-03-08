//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import baritone.api.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.awt.*;
import com.kisman.cc.util.*;
import java.util.*;

@Class2012
@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/client/Baritone;", "Lcom/kisman/cc/features/module/Module;", "()V", "booleans", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "colors", "numbers", "settings", "", "Lcom/kisman/cc/features/module/client/baritone/BaritoneSetting;", "kisman.cc" })
public final class Class186 extends Class42
{
    private final Class1996 Field8809;
    private final Class1996 Field8810;
    private final Class1996 Field8811;
    private final List Field8812;
    private String Field8813 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class186() {
        super("Baritone", "Config of baritone integration", Class97.Field8339);
        this.Field8809 = this.Method24(new Class1996(new Class44("Booleans", this)));
        this.Field8810 = this.Method24(new Class1996(new Class44("Numbers", this)));
        this.Field8811 = this.Method24(new Class1996(new Class44("Colors", this)));
        this.Field8812 = new ArrayList();
        for (final Settings$Setting settings$Setting : BaritoneAPI.getSettings().allSettings) {
            final Object value = settings$Setting.value;
            if (value instanceof Boolean) {
                final List list = this.Field8812;
                final Class1996 field8809 = this.Field8809;
                final Settings$Setting settings$Setting2 = settings$Setting;
                Intrinsics.checkExpressionValueIsNotNull((Object)settings$Setting2, "setting");
                final String name = settings$Setting2.getName();
                final Class186 class186 = this;
                final Object value2 = settings$Setting.value;
                if (value2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                }
                final Class44 method23 = this.Method23(field8809.Method7405(new Class44(name, class186, (boolean)value2)));
                Intrinsics.checkExpressionValueIsNotNull((Object)method23, "register(booleans.add(Se\u2026tting.value as Boolean)))");
                list.add(new Class127(method23, settings$Setting));
            }
            else {
                if (!(value instanceof Float)) {
                    if (!(value instanceof Double)) {
                        if (!(value instanceof Integer)) {
                            if (!(value instanceof Color)) {
                                continue;
                            }
                            final List list2 = this.Field8812;
                            final Class1996 field8810 = this.Field8811;
                            final Settings$Setting settings$Setting3 = settings$Setting;
                            Intrinsics.checkExpressionValueIsNotNull((Object)settings$Setting3, "setting");
                            final String name2 = settings$Setting3.getName();
                            final Class186 class187 = this;
                            final Object value3 = settings$Setting.value;
                            if (value3 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.awt.Color");
                            }
                            final Class44 method24 = this.Method23(field8810.Method7405(new Class44(name2, class187, new Class2027((Color)value3))));
                            Intrinsics.checkExpressionValueIsNotNull((Object)method24, "register(colors.add(Sett\u2026etting.value as Color))))");
                            list2.add(new Class127(method24, settings$Setting));
                            continue;
                        }
                    }
                }
                final Object value4 = settings$Setting.value;
                Settings$Setting settings$Setting4;
                if (value4 instanceof Float) {
                    if ((settings$Setting4 = settings$Setting) == null) {
                        throw new TypeCastException("null cannot be cast to non-null type baritone.api.Settings.Setting<kotlin.Float>");
                    }
                }
                else if (value4 instanceof Integer) {
                    if ((settings$Setting4 = settings$Setting) == null) {
                        throw new TypeCastException("null cannot be cast to non-null type baritone.api.Settings.Setting<kotlin.Int>");
                    }
                }
                else if ((settings$Setting4 = settings$Setting) == null) {
                    throw new TypeCastException("null cannot be cast to non-null type baritone.api.Settings.Setting<kotlin.Double>");
                }
                final Settings$Setting settings$Setting5 = settings$Setting4;
                final List list3 = this.Field8812;
                final Class1996 field8811 = this.Field8810;
                final String name3 = settings$Setting.getName();
                final Class186 class188 = this;
                final Object value5 = settings$Setting.value;
                double doubleValue;
                if (value5 instanceof Float) {
                    final Object value6 = settings$Setting5.value;
                    if (value6 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    }
                    doubleValue = (float)value6;
                }
                else if (value5 instanceof Double) {
                    final Object value7 = settings$Setting5.value;
                    if (value7 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Double");
                    }
                    doubleValue = (double)value7;
                }
                else {
                    final Object value8 = settings$Setting5.value;
                    if (value8 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                    doubleValue = (int)value8;
                }
                final Class44 method25 = this.Method23(field8811.Method7405(new Class44(name3, class188, doubleValue, 0.0, Double.longBitsToDouble((long)1351188721 ^ 0x40240000508980F1L), true)));
                Intrinsics.checkExpressionValueIsNotNull((Object)method25, "register(numbers.add(Set\u2026    ), 0.0, 10.0, true)))");
                list3.add(new Class127(method25, settings$Setting5));
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1077 ^ 0xC9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
