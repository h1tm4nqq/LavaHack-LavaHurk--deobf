//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import org.lwjgl.input.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0007J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/features/module/IBindable$Companion;", "", "()V", "bindButton", "", "bindable", "Lcom/kisman/cc/features/module/IBindable;", "button", "", "bindKey", "key", "getKey", "getName", "", "isPressed", "", "valid", "kisman.cc" })
public final class Class1916
{
    static final Class1916 Field16905;
    private int Field16906;
    
    public final int Method7139(@NotNull @NotNull final Class695 class695) {
        Intrinsics.checkParameterIsNotNull((Object)class695, "bindable");
        int n = 0;
        switch (Class608.Field10589[class695.Method12().ordinal()]) {
            case 1: {
                n = class695.Method8();
                break;
            }
            case 2: {
                n = class695.Method10();
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return n;
    }
    
    @NotNull
    @NotNull
    public final String Method7140(@NotNull @NotNull final Class695 class695) {
        Intrinsics.checkParameterIsNotNull((Object)class695, "bindable");
        String string = null;
        switch (Class608.Field10590[class695.Method12().ordinal()]) {
            case 1: {
                string = ((class695.Method8() == -1) ? "NONE" : Keyboard.getKeyName(class695.Method8()));
                Intrinsics.checkExpressionValueIsNotNull((Object)string, "if(bindable.getKeyboardK\u2026indable.getKeyboardKey())");
                break;
            }
            case 2: {
                string = "Button_" + class695.Method10();
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return string;
    }
    
    public final boolean Method7141(@NotNull @NotNull final Class695 class695) {
        Intrinsics.checkParameterIsNotNull((Object)class695, "bindable");
        boolean b = false;
        switch (Class608.Field10591[class695.Method12().ordinal()]) {
            case 1: {
                b = (class695.Method8() != 0 && class695.Method8() != 1);
                break;
            }
            case 2: {
                b = (class695.Method10() > 1);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b;
    }
    
    public final boolean Method7142(@NotNull @NotNull final Class695 class695) {
        Intrinsics.checkParameterIsNotNull((Object)class695, "bindable");
        boolean b = false;
        switch (Class608.Field10592[class695.Method12().ordinal()]) {
            case 1: {
                b = Keyboard.isKeyDown(class695.Method8());
                break;
            }
            case 2: {
                b = Mouse.isButtonDown(class695.Method10());
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b;
    }
    
    @JvmStatic
    @JvmStatic
    public final void Method7143(@NotNull @NotNull final Class695 class695, final int n) {
        Intrinsics.checkParameterIsNotNull((Object)class695, "bindable");
        class695.Method9(n);
        class695.Method13(Class955.Field12068);
    }
    
    @JvmStatic
    @JvmStatic
    public final void Method7144(@NotNull @NotNull final Class695 class695, final int n) {
        Intrinsics.checkParameterIsNotNull((Object)class695, "bindable");
        class695.Method9(n);
        class695.Method13(Class955.Field12069);
    }
    
    private Class1916() {
    }
    
    static {
        Field16905 = new Class1916();
    }
    
    private static String Method7145(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6FFE ^ 0xAA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
