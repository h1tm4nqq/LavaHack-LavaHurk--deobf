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
import lavahack.client.Class608;
import lavahack.client.Class695;
import lavahack.client.Class955;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0007J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/features/module/IBindable$Companion;", "", "()V", "bindButton", "", "bindable", "Lcom/kisman/cc/features/module/IBindable;", "button", "", "bindKey", "key", "getKey", "getName", "", "isPressed", "", "valid", "kisman.cc"})
public final class Class1916 {
    static final Class1916 Field16905;
    private int Field16906;

    public final int Method7139(@NotNull @NotNull Class695 class695) {
        Intrinsics.checkParameterIsNotNull((Object)class695, (String)"bindable");
        switch (Class608.Field10589[class695.Method12().ordinal()]) {
            case 1: {
                int n = class695.Method8();
                return n;
            }
            case 2: {
                int n = class695.Method10();
                return n;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    @NotNull
    public final String Method7140(@NotNull @NotNull Class695 class695) {
        Intrinsics.checkParameterIsNotNull((Object)class695, (String)"bindable");
        switch (Class608.Field10590[class695.Method12().ordinal()]) {
            case 1: {
                String string = class695.Method8() == -1 ? "NONE" : Keyboard.getKeyName((int)class695.Method8());
                String string2 = string;
                Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"if(bindable.getKeyboardK\u2026indable.getKeyboardKey())");
                return string2;
            }
            case 2: {
                String string2 = "Button_" + class695.Method10();
                return string2;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean Method7141(@NotNull @NotNull Class695 class695) {
        Intrinsics.checkParameterIsNotNull((Object)class695, (String)"bindable");
        switch (Class608.Field10591[class695.Method12().ordinal()]) {
            case 1: {
                if (class695.Method8() == 0) return false;
                if (class695.Method8() == 1) return false;
                return true;
            }
            case 2: {
                if (class695.Method10() <= 1) return false;
                return true;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean Method7142(@NotNull @NotNull Class695 class695) {
        Intrinsics.checkParameterIsNotNull((Object)class695, (String)"bindable");
        switch (Class608.Field10592[class695.Method12().ordinal()]) {
            case 1: {
                boolean bl = Keyboard.isKeyDown((int)class695.Method8());
                return bl;
            }
            case 2: {
                boolean bl = Mouse.isButtonDown((int)class695.Method10());
                return bl;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    @JvmStatic
    public final void Method7143(@NotNull @NotNull Class695 class695, int n) {
        Intrinsics.checkParameterIsNotNull((Object)class695, (String)"bindable");
        class695.Method9(n);
        class695.Method13(Class955.Field12068);
    }

    @JvmStatic
    @JvmStatic
    public final void Method7144(@NotNull @NotNull Class695 class695, int n) {
        Intrinsics.checkParameterIsNotNull((Object)class695, (String)"bindable");
        class695.Method9(n);
        class695.Method13(Class955.Field12069);
    }

    private Class1916() {
    }

    static {
        Class1916 class1916;
        Field16905 = class1916 = new Class1916();
    }

    private static String Method7145(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 170;
            cArray2[n] = (char)(cArray[n] ^ (0x6FFE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

