/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class2012;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class794;
import lavahack.client.Class97;

@Class794
@Class2012
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/module/client/NoSpoof;", "Lcom/kisman/cc/features/module/Module;", "()V", "ground", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "position", "rotation", "noGround", "", "noPosition", "noRotation", "kisman.cc"})
public final class Class1534
extends Class42 {
    private static final Class44 Field15166;
    private static final Class44 Field15167;
    private static final Class44 Field15168;
    public static final Class1534 Field15169;
    private String Field15170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @JvmStatic
    @JvmStatic
    public static final boolean Method6081() {
        Class44 class44 = Field15166;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"position");
        return class44.Method365();
    }

    @JvmStatic
    @JvmStatic
    public static final boolean Method27() {
        Class44 class44 = Field15167;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"rotation");
        return class44.Method365();
    }

    @JvmStatic
    @JvmStatic
    public static final boolean Method28() {
        Class44 class44 = Field15168;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"ground");
        return class44.Method365();
    }

    private Class1534() {
        super("NoSpoof", "PingBypass stuff", Class97.Field8339);
    }

    static {
        Class1534 class1534;
        Field15169 = class1534 = new Class1534();
        Field15166 = class1534.Method23(new Class44("Position", (Class42)class1534, false));
        Field15167 = class1534.Method23(new Class44("Rotation", (Class42)class1534, false));
        Field15168 = class1534.Method23(new Class44("Ground", (Class42)class1534, false));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 98;
            cArray2[n] = (char)(cArray[n] ^ (0x3A1D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

