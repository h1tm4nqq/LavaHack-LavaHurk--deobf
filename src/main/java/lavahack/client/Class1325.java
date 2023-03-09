//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1048;
import lavahack.client.Class1498;
import lavahack.client.Class1763;
import lavahack.client.Class2124;
import lavahack.client.Class2160;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/dynamic/RotationEnum;", "", "()V", "Companion", "Rotation", "kisman.cc"})
public final class Class1325 {
    private static final Class2124 Field14070;
    private static final Class2124 Field14071;
    private static final Class2124 Field14072;
    private static final Class2124 Field14073;
    private static final Minecraft Field14074;
    public static final Class1498 Field14075;
    private int Field14076;

    static {
        Field14075 = new Class1498(null);
        Class2124 class2124 = Class1763.Method1727(Void.class, float[].class, Boolean.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)class2124, (String)"AbstractTask.types(\n    \u2026ss.java//Silent\n        )");
        Field14070 = class2124;
        Class2124 class21242 = Class1763.Method1727(Void.class, Class2160.class, Boolean.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)class21242, (String)"AbstractTask.types(\n    \u2026ss.java//Silent\n        )");
        Field14071 = class21242;
        Class2124 class21243 = Class1763.Method1727(float[].class, Integer.class, Class1048.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)class21243, (String)"AbstractTask.types(\n    \u2026/Rotation logic\n        )");
        Field14072 = class21243;
        Class2124 class21244 = Class1763.Method1727(float[].class, BlockPos.class);
        Intrinsics.checkExpressionValueIsNotNull((Object)class21244, (String)"AbstractTask.types(\n    \u2026ass.java//block\n        )");
        Field14073 = class21244;
        Field14074 = Minecraft.getMinecraft();
    }

    public static final Class2124 Method5363() {
        return Field14070;
    }

    public static final Class2124 Method5364() {
        return Field14071;
    }

    public static final Class2124 Method5365() {
        return Field14072;
    }

    public static final Class2124 Method5366() {
        return Field14073;
    }

    public static final Minecraft Method5367() {
        return Field14074;
    }

    private static String Method5368(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 201;
            cArray2[n] = (char)(cArray[n] ^ (0x6583 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

