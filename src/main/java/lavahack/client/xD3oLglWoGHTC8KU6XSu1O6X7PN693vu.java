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
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.xD3oLglWoGHTC8KU6XSu1O6X7PN693vu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/features/module/Debug/ModuleInstancingKt;", "Lcom/kisman/cc/features/module/Module;", "()V", "update", "", "Companion", "kisman.cc"})
public final class xD3oLglWoGHTC8KU6XSu1O6X7PN693vu
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @Nullable
    private static xD3oLglWoGHTC8KU6XSu1O6X7PN693vu Field17850;
    public static final xD3oLglWoGHTC8KU6XSu1O6X7PN693vu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17851;
    private int Field17852;

    @Override
    public void Method45() {
        if (xD3oLglWoGHTC8KU6XSu1O6X7PN693vu.Method7747().player == null) return;
        if (xD3oLglWoGHTC8KU6XSu1O6X7PN693vu.Method7747().world == null) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("Instance of module " + this.Method40() + " is " + (Field17850 == null ? "NULL" : "NOT NULL"));
    }

    public xD3oLglWoGHTC8KU6XSu1O6X7PN693vu() {
        super("ModuleInstancingKt", "Tests @ModuleInstance annotation in kotlin.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    static {
        Field17851 = new xD3oLglWoGHTC8KU6XSu1O6X7PN693vu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    public static final Minecraft Method7747() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method7748(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final xD3oLglWoGHTC8KU6XSu1O6X7PN693vu Method7749() {
        return Field17850;
    }

    public static final void Method7750(xD3oLglWoGHTC8KU6XSu1O6X7PN693vu xD3oLglWoGHTC8KU6XSu1O6X7PN693vu2) {
        Field17850 = xD3oLglWoGHTC8KU6XSu1O6X7PN693vu2;
    }

    @Nullable
    @Nullable
    public static final xD3oLglWoGHTC8KU6XSu1O6X7PN693vu Method7751() {
        xD3oLglWoGHTC8KU6XSu1O6X7PN693vu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi xD3oLglWoGHTC8KU6XSu1O6X7PN693vu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = Field17851;
        return Field17850;
    }

    public static final void Method7752(@Nullable @Nullable xD3oLglWoGHTC8KU6XSu1O6X7PN693vu xD3oLglWoGHTC8KU6XSu1O6X7PN693vu2) {
        xD3oLglWoGHTC8KU6XSu1O6X7PN693vu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi xD3oLglWoGHTC8KU6XSu1O6X7PN693vu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = Field17851;
        Field17850 = xD3oLglWoGHTC8KU6XSu1O6X7PN693vu2;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)878835217L ^ 0x3461F611;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-265987781L ^ 0xF02559C4);
            int n2 = ((int)-742292479L ^ 0xD3C18474) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-275265137L ^ 0xEF97E2C6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

