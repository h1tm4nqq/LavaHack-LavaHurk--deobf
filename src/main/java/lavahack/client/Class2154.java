//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class524;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/Debug/ModuleInstancingKt;", "Lcom/kisman/cc/features/module/Module;", "()V", "update", "", "Companion", "kisman.cc"})
public final class Class2154
extends Class42 {
    @Nullable
    private static Class2154 Field17850;
    public static final Class524 Field17851;
    private int Field17852;

    @Override
    public void Method45() {
        if (Class2154.Method7747().player == null) return;
        if (Class2154.Method7747().world == null) {
            return;
        }
        Class1393.Method5506().Method1886("Instance of module " + this.Method40() + " is " + (Field17850 == null ? "NULL" : "NOT NULL"));
    }

    public Class2154() {
        super("ModuleInstancingKt", "Tests @ModuleInstance annotation in kotlin.", Class97.Field8345);
    }

    static {
        Field17851 = new Class524(null);
    }

    public static final Minecraft Method7747() {
        return Class42.Field8052;
    }

    public static final void Method7748(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class2154 Method7749() {
        return Field17850;
    }

    public static final void Method7750(Class2154 class2154) {
        Field17850 = class2154;
    }

    @Nullable
    @Nullable
    public static final Class2154 Method7751() {
        Class524 class524 = Field17851;
        return Field17850;
    }

    public static final void Method7752(@Nullable @Nullable Class2154 class2154) {
        Class524 class524 = Field17851;
        Field17850 = class2154;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 234;
            cArray2[n] = (char)(cArray[n] ^ (0x2B49 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

