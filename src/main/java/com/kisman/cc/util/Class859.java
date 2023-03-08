//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import kotlin.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B1\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\u0002\u0010\u0007B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\u0002\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/util/LinkedColour;", "Lcom/kisman/cc/util/Colour;", "red", "Ljava/util/function/Supplier;", "", "green", "blue", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "alpha", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getAlpha", "()Ljava/util/function/Supplier;", "getBlue", "getGreen", "getRed", "toColour", "kisman.cc" })
public final class Class859 extends Class2027
{
    @NotNull
    private final Supplier Field11629;
    @NotNull
    private final Supplier Field11630;
    @NotNull
    private final Supplier Field11631;
    @NotNull
    private final Supplier Field11632;
    private String Field11633 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class2027 Method3637() {
        final Number value = this.Field11629.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "red.get()");
        final int intValue = value.intValue();
        final Number value2 = this.Field11630.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value2, "green.get()");
        final int intValue2 = value2.intValue();
        final Number value3 = this.Field11631.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value3, "blue.get()");
        final int intValue3 = value3.intValue();
        final Number value4 = this.Field11632.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value4, "alpha.get()");
        return new Class2027(intValue, intValue2, intValue3, value4.intValue());
    }
    
    @NotNull
    @NotNull
    public final Supplier Method3638() {
        return this.Field11629;
    }
    
    @NotNull
    @NotNull
    public final Supplier Method3639() {
        return this.Field11630;
    }
    
    @NotNull
    @NotNull
    public final Supplier Method3640() {
        return this.Field11631;
    }
    
    @NotNull
    @NotNull
    public final Supplier Method3641() {
        return this.Field11632;
    }
    
    public Class859(@NotNull @NotNull final Supplier field11629, @NotNull @NotNull final Supplier field11630, @NotNull @NotNull final Supplier field11631, @NotNull @NotNull final Supplier field11632) {
        Intrinsics.checkParameterIsNotNull((Object)field11629, "red");
        Intrinsics.checkParameterIsNotNull((Object)field11630, "green");
        Intrinsics.checkParameterIsNotNull((Object)field11631, "blue");
        Intrinsics.checkParameterIsNotNull((Object)field11632, "alpha");
        this.Field11629 = field11629;
        this.Field11630 = field11630;
        this.Field11631 = field11631;
        this.Field11632 = field11632;
    }
    
    public Class859(@NotNull @NotNull final Supplier supplier, @NotNull @NotNull final Supplier supplier2, @NotNull @NotNull final Supplier supplier3) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "red");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, "green");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, "blue");
        this(supplier, supplier2, supplier3, (Supplier)Class2122.Field17657);
    }
    
    private static String Method3642(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x327E ^ 0xD5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
