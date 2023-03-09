/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1170;
import lavahack.client.Class1312;
import lavahack.client.Class1996;
import lavahack.client.Class368;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class90;
import lavahack.client.Class949;
import lavahack.client.Class97;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/module/combat/AntiCrystal;", "Lcom/kisman/cc/features/module/Module;", "()V", "bRotation", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "bRotationMode", "bSmart", "bSwitch", "bVector", "bowGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "doNewCPvPMetaBtw", "", "kisman.cc"})
public final class Class425
extends Class42 {
    private final Class1996 Field9776 = this.Method24(new Class1996(new Class44("BowWithArrows", this)));
    private final Class44 Field9777 = this.Method23(this.Field9776.Method7405(new Class44("Smart", (Class42)this, true)));
    private final Class44 Field9778;
    private final Class44 Field9779;
    private final Class44 Field9780;
    private final Class44 Field9781;
    private String Field9782 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private final void Method20() {
    }

    public Class425() {
        super("AntiCrystal", "New crystal pvp meta btw))", Class97.Field8338);
        Class44 class44 = new Class44("Vector", (Class42)this, Class1170.Field13272).Method313(new Class90(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Vector\", this, \u2026ble { bSmart.valBoolean }");
        this.Field9778 = this.Method23(this.Field9776.Method7405(class44));
        this.Field9779 = this.Method23(this.Field9776.Method7405(new Class44("Switch", (Class42)this, Class1312.Field14039)));
        this.Field9780 = this.Method23(this.Field9776.Method7405(new Class44("Rotation Mode", (Class42)this, Class368.Field9550)));
        this.Field9781 = this.Method23(this.Field9776.Method7405(new Class44("Rotation", (Class42)this, Class949.Field12047)));
    }

    public static final Class44 Method2055(Class425 class425) {
        return class425.Field9777;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 207;
            cArray2[n] = (char)(cArray[n] ^ (0x1EA1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

