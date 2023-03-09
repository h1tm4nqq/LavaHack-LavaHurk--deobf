//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1416;
import lavahack.client.Class1472;
import lavahack.client.Class1757;
import lavahack.client.Class1921;
import lavahack.client.Class44;
import lavahack.client.Class900;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/AutoRerUtil;", "", "()V", "Companion", "kisman.cc"})
public final class Class1955 {
    private static final Minecraft Field17019;
    @NotNull
    private static Class1921 Field17020;
    public static final Class1757 Field17021;
    private String Field17022 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field17021 = new Class1757(null);
        Minecraft minecraft = Minecraft.getMinecraft();
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"Minecraft.getMinecraft()");
        Field17019 = minecraft;
        Supplier supplier = Class1416.Field14544.Field14453.Method5302();
        Class44 class44 = Class1416.Field14544.Field14447;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"AutoRer.instance.placeRange");
        Supplier supplier2 = class44.Method394();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier2, (String)"AutoRer.instance.placeRange.supplierFloat");
        Class1416 class1416 = Class1416.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class1416, (String)"AutoRer.instance");
        Class44 class442 = Class1416.Field14544.Field14451;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"AutoRer.instance.targetRange");
        Supplier supplier3 = class442.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier3, (String)"AutoRer.instance.targetRange.supplierDouble");
        Field17020 = new Class1921(supplier, supplier2, class1416, supplier3, Class900.Field11767, Class1472.Field14874);
    }

    public static final Class1921 Method7266() {
        return Field17020;
    }

    public static final void Method7267(Class1921 class1921) {
        Field17020 = class1921;
    }

    public static final Minecraft Method7268() {
        return Field17019;
    }

    private static String Method7269(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 189;
            cArray2[n] = (char)(cArray[n] ^ (0x1668 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

