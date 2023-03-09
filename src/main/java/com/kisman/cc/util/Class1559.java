//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.text.TextFormatting
 */
package com.kisman.cc.util;

import com.kisman.cc.util.Class2027;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/util/ColourUtilKt$Companion;", "", "()V", "fromConfig", "Lcom/kisman/cc/util/Colour;", "config", "", "color", "getDefaultColor", "healthColor", "Lnet/minecraft/util/text/TextFormatting;", "entity", "Lnet/minecraft/entity/EntityLivingBase;", "toConfig", "kisman.cc"})
public final class Class1559 {
    private int Field15274;

    @NotNull
    @NotNull
    public final Class2027 Method6138() {
        return new Class2027(255, 255, 255, 255);
    }

    @NotNull
    @NotNull
    public final String Method6139(@NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        return "" + class2027.Field17321 + ':' + class2027.Field17322 + ':' + class2027.Field17323 + ':' + class2027.Field17324;
    }

    @NotNull
    @NotNull
    public final Class2027 Method6140(@NotNull @NotNull String string, @NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"config");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        List list = StringsKt.split$default((CharSequence)string, (char[])new char[]{':'}, (boolean)false, (int)0, (int)6, null);
        return new Class2027(Integer.parseInt((String)list.get(0)), Integer.parseInt((String)list.get(1)), Integer.parseInt((String)list.get(2)), Integer.parseInt((String)list.get(3)));
    }

    @NotNull
    @NotNull
    public final TextFormatting Method6141(@NotNull @NotNull EntityLivingBase entityLivingBase) {
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"entity");
        if (entityLivingBase.getHealth() + entityLivingBase.getAbsorptionAmount() > Float.intBitsToFloat(1096810496)) {
            return TextFormatting.GREEN;
        }
        if (!(entityLivingBase.getHealth() + entityLivingBase.getAbsorptionAmount() > Float.intBitsToFloat(0x40C00000))) return TextFormatting.RED;
        return TextFormatting.YELLOW;
    }

    private Class1559() {
    }

    public Class1559(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method6142(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x353B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

