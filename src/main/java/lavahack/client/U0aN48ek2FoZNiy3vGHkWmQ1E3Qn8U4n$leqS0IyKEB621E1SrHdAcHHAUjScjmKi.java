/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.Intrinsics
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
import lavahack.client.q7cfUga9mM4W8bY6o4FPg5rMiajZZF0P;
import lavahack.client.ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0007J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/features/module/IBindable$Companion;", "", "()V", "bindButton", "", "bindable", "Lcom/kisman/cc/features/module/IBindable;", "button", "", "bindKey", "key", "getKey", "getName", "", "isPressed", "", "valid", "kisman.cc"})
public final class U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    static final U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16905;
    private int Field16906;

    public final int Method7139(@NotNull @NotNull U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) {
        Intrinsics.checkParameterIsNotNull((Object)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n, (String)"bindable");
        switch (q7cfUga9mM4W8bY6o4FPg5rMiajZZF0P.Field10589[u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method12().ordinal()]) {
            case 1: {
                int n = u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method8();
                return n;
            }
            case 2: {
                int n = u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method10();
                return n;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    @NotNull
    public final String Method7140(@NotNull @NotNull U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) {
        Intrinsics.checkParameterIsNotNull((Object)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n, (String)"bindable");
        switch (q7cfUga9mM4W8bY6o4FPg5rMiajZZF0P.Field10590[u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method12().ordinal()]) {
            case 1: {
                String string = u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method8() == (int)((long)1321786658 ^ (long)-1321786659) ? "NONE" : Keyboard.getKeyName((int)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method8());
                String string2 = string;
                Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"if(bindable.getKeyboardK\u2026indable.getKeyboardKey())");
                return string2;
            }
            case 2: {
                String string2 = "Button_" + u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method10();
                return string2;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean Method7141(@NotNull @NotNull U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) {
        Intrinsics.checkParameterIsNotNull((Object)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n, (String)"bindable");
        switch (q7cfUga9mM4W8bY6o4FPg5rMiajZZF0P.Field10591[u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method12().ordinal()]) {
            case 1: {
                int n;
                if (u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method8() != 0 && u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method8() != ((int)2118149809L ^ 0x7E4066B0)) {
                    n = (int)211686854L ^ 0xC9E15C7;
                    return n != 0;
                }
                n = (int)((long)-945719071 ^ (long)-945719071);
                return n != 0;
            }
            case 2: {
                int n;
                if (u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method10() > ((int)-931397334L ^ 0xC87C012B)) {
                    n = (int)1414972183L ^ 0x5456C316;
                    return n != 0;
                }
                n = (int)-1029132673L ^ 0xC2A8AE7F;
                return n != 0;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean Method7142(@NotNull @NotNull U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n) {
        Intrinsics.checkParameterIsNotNull((Object)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n, (String)"bindable");
        switch (q7cfUga9mM4W8bY6o4FPg5rMiajZZF0P.Field10592[u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method12().ordinal()]) {
            case 1: {
                boolean bl = Keyboard.isKeyDown((int)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method8());
                return bl;
            }
            case 2: {
                boolean bl = Mouse.isButtonDown((int)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method10());
                return bl;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    @JvmStatic
    public final void Method7143(@NotNull @NotNull U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n, int n) {
        Intrinsics.checkParameterIsNotNull((Object)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n, (String)"bindable");
        u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method9(n);
        u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method13(ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12068);
    }

    @JvmStatic
    @JvmStatic
    public final void Method7144(@NotNull @NotNull U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n, int n) {
        Intrinsics.checkParameterIsNotNull((Object)u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n, (String)"bindable");
        u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method9(n);
        u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method13(ucrr2PAxIgRz5eGlrtTOTP7pMQa9Df1K.Field12069);
    }

    private U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    static {
        U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n$leqS0IyKEB621E1SrHdAcHHAUjScjmKi u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        Field16905 = u0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    private static String Method7145(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-886035981 ^ (long)-886035981);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1204540302L ^ 0x47CBD371);
            int n2 = ((int)2031051862L ^ 0x790F6403) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)873683203L ^ 0x34136EFC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

