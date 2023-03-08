//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.text.*;
import java.util.*;
import net.minecraft.entity.*;
import net.minecraft.util.text.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/util/ColourUtilKt$Companion;", "", "()V", "fromConfig", "Lcom/kisman/cc/util/Colour;", "config", "", "color", "getDefaultColor", "healthColor", "Lnet/minecraft/util/text/TextFormatting;", "entity", "Lnet/minecraft/entity/EntityLivingBase;", "toConfig", "kisman.cc" })
public final class Class1559
{
    private int Field15274;
    
    @NotNull
    @NotNull
    public final Class2027 Method6138() {
        return new Class2027(255, 255, 255, 255);
    }
    
    @NotNull
    @NotNull
    public final String Method6139(@NotNull @NotNull final Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color");
        return new StringBuilder().append(class2027.Field17321).append(':').append(class2027.Field17322).append(':').append(class2027.Field17323).append(':').append(class2027.Field17324).toString();
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method6140(@NotNull @NotNull final String s, @NotNull @NotNull final Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)s, "config");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color");
        final List split$default = StringsKt.split$default((CharSequence)s, new char[] { ':' }, false, 0, 6, (Object)null);
        return new Class2027(Integer.parseInt(split$default.get(0)), Integer.parseInt(split$default.get(1)), Integer.parseInt(split$default.get(2)), Integer.parseInt(split$default.get(3)));
    }
    
    @NotNull
    @NotNull
    public final TextFormatting Method6141(@NotNull @NotNull final EntityLivingBase entityLivingBase) {
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, "entity");
        if (entityLivingBase.getHealth() + entityLivingBase.getAbsorptionAmount() > Float.intBitsToFloat(1096810496)) {
            return TextFormatting.GREEN;
        }
        if (entityLivingBase.getHealth() + entityLivingBase.getAbsorptionAmount() > Float.intBitsToFloat(1086324736)) {
            return TextFormatting.YELLOW;
        }
        return TextFormatting.RED;
    }
    
    private Class1559() {
    }
    
    public Class1559(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method6142(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x353B ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
