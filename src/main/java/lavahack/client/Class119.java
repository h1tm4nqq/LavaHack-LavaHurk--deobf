//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/features/hud/modules/BindList;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "checkBoxes", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "colorActive", "colorG", "Lcom/kisman/cc/settings/types/SettingGroup;", "colorInactive", "hudModules", "modules", "offsets", "types", "onRender", "", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "Element", "kisman.cc" })
public final class Class119 extends Class1249
{
    private final Class44 Field8414;
    private final Class1996 Field8415;
    private final Class44 Field8416;
    private final Class44 Field8417;
    private final Class44 Field8418;
    private final Class1996 Field8419;
    private final Class44 Field8420;
    private final Class44 Field8421;
    private String Field8422 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method850(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        final double method267 = this.Method267();
        final double method268 = this.Method268();
        final ArrayList<Object> list = new ArrayList<Object>();
        final Class44 field8416 = this.Field8416;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8416, "modules");
        if (field8416.Method365()) {
            for (final Class42 class42 : Class1796.Field16241.Field16254.Field8854) {
                final Class1916 field8417 = Class695.Field10935;
                final Class42 class43 = class42;
                Intrinsics.checkExpressionValueIsNotNull((Object)class43, "module");
                if (field8417.Method7141(class43)) {
                    list.add(new Class392(class42.Method40() + " [" + Class695.Field10935.Method7140(class42) + ']', class42.Method35()));
                }
            }
        }
        final Class44 field8418 = this.Field8417;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8418, "hudModules");
        if (field8418.Method365()) {
            for (final Class1249 class44 : Class1796.Field16241.Field16257.Field9235) {
                final Class1916 field8419 = Class695.Field10935;
                final Class1249 class45 = class44;
                Intrinsics.checkExpressionValueIsNotNull((Object)class45, "module");
                if (field8419.Method7141(class45)) {
                    list.add(new Class392(class44.Method40() + " [" + Class695.Field10935.Method7140(class44) + ']', class44.Method35()));
                }
            }
        }
        final Class44 field8420 = this.Field8418;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8420, "checkBoxes");
        if (field8420.Method365()) {
            final Class2047 field8421 = Class1796.Field16241.Field16258;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8421, "Kisman.instance.settingsManager");
            for (final Class44 class46 : field8421.Method7570()) {
                final Class1916 field8422 = Class695.Field10935;
                final Class44 class47 = class46;
                Intrinsics.checkExpressionValueIsNotNull((Object)class47, "setting");
                if (field8422.Method7141(class47) && class46.Method386()) {
                    final ArrayList<Object> list2 = list;
                    final StringBuilder sb = new StringBuilder();
                    final Class42 method269 = class46.Method358();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method269, "setting.parentMod");
                    list2.add(new Class392(sb.append(method269.Method40()).append("->").append(class46.Method356()).append(" [").append(Class695.Field10935.Method7140(class46)).append(']').toString(), class46.Method365()));
                }
            }
        }
        CollectionsKt.sortWith((List)list, (Comparator)Class712.Field11033);
        int n = 0;
        for (final Class392 class48 : list) {
            final String method270 = class48.Method1910();
            final double n2 = method267;
            final double n3 = method268;
            final int n4 = n;
            final int method271 = Class1178.Method4748();
            final Class44 field8423 = this.Field8414;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8423, "offsets");
            final double n5 = n3 + n4 * (method271 + field8423.Method335());
            int n6;
            if (class48.Method1911()) {
                final Class44 field8424 = this.Field8420;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8424, "colorActive");
                final Class2027 method272 = field8424.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method272, "colorActive.colour");
                n6 = method272.Method3626();
            }
            else {
                final Class44 field8425 = this.Field8421;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8425, "colorInactive");
                final Class2027 method273 = field8425.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)method273, "colorInactive.colour");
                n6 = method273.Method3626();
            }
            Class1178.Method4745(method270, n2, n5, n6);
            ++n;
        }
        final boolean b = !list.isEmpty();
        this.Method273(0.0);
        final double n7 = list.size();
        final double n8 = Class1178.Method4748();
        final Class44 field8426 = this.Field8414;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8426, "offsets");
        this.Method274(n7 * (n8 + field8426.Method335()));
    }
    
    public Class119() {
        super("BindList", "Bind list like Abyss", true);
        this.Field8414 = this.Method23(new Class44("Offsets", this, Double.longBitsToDouble(4611686018427387904L), 0.0, Double.longBitsToDouble((long)74781878 ^ 0x40240000047514B6L), true));
        this.Field8415 = this.Method24(new Class1996(new Class44("Types", this)));
        this.Field8416 = this.Method23(this.Field8415.Method7405(new Class44("Modules", this, true)));
        this.Field8417 = this.Method23(this.Field8415.Method7405(new Class44("Hud Modules", this, false)));
        this.Field8418 = this.Method23(this.Field8415.Method7405(new Class44("Check Boxes", this, true)));
        this.Field8419 = this.Method24(new Class1996(new Class44("Colors", this)));
        this.Field8420 = this.Method23(this.Field8419.Method7405(new Class44("Active Color", this, "Active Color", new Class2027(0, 255, 0, 255))));
        this.Field8421 = this.Method23(this.Field8419.Method7405(new Class44("Inactive Color", this, "Inactive Color", new Class2027(255, 0, 0, 255))));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6DDC ^ 0x1C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
