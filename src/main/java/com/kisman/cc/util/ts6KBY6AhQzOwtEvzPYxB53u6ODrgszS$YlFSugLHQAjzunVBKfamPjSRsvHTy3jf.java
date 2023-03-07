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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/util/ColourUtilKt$Companion;", "", "()V", "fromConfig", "Lcom/kisman/cc/util/Colour;", "config", "", "color", "getDefaultColor", "healthColor", "Lnet/minecraft/util/text/TextFormatting;", "entity", "Lnet/minecraft/entity/EntityLivingBase;", "toConfig", "kisman.cc"})
public final class ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    private int Field15274;

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6138() {
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)1945702791L ^ 0x73F91178, (int)((long)1779065001 ^ (long)1779064918), (int)((long)-348598684 ^ (long)-348598629), (int)1959352824L ^ 0x74C95907);
    }

    @NotNull
    @NotNull
    public final String Method6139(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        return "" + vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17321 + ((int)((long)469616855 ^ (long)469616842) << 1) + vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17322 + (((int)792841932L ^ 0x2F41CED1) << 1) + vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17323 + (((int)18110276L ^ 0x1145759) << 1) + vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17324;
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method6140(@NotNull @NotNull String string, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"config");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        char[] cArray = new char[(int)146525029L ^ 0x8BBCB64];
        cArray[(int)-769182959L ^ 0xD2273311] = ((int)999059556L ^ 0x3B8C7079) << 1;
        List list = StringsKt.split$default((CharSequence)string, (char[])cArray, (boolean)((long)-1251620573 ^ (long)-1251620573), (int)((int)1944786413L ^ 0x73EB15ED), (int)(((int)1073352797L ^ 0x3FFA105E) << 1), null);
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Integer.parseInt((String)list.get((int)((long)811940397 ^ (long)811940397))), Integer.parseInt((String)list.get((int)-1307154114L ^ 0xB216693F)), Integer.parseInt((String)list.get(((int)2131244715L ^ 0x7F0836AA) << 1)), Integer.parseInt((String)list.get((int)-1887092659L ^ 0x8F85404E)));
    }

    @NotNull
    @NotNull
    public final TextFormatting Method6141(@NotNull @NotNull EntityLivingBase entityLivingBase) {
        Intrinsics.checkParameterIsNotNull((Object)entityLivingBase, (String)"entity");
        if (entityLivingBase.getHealth() + entityLivingBase.getAbsorptionAmount() > Float.intBitsToFloat((int)((long)1859436142 ^ (long)800374382))) {
            return TextFormatting.GREEN;
        }
        if (!(entityLivingBase.getHealth() + entityLivingBase.getAbsorptionAmount() > Float.intBitsToFloat(0x33CB9DD4 ^ 0x730B9DD4))) return TextFormatting.RED;
        return TextFormatting.YELLOW;
    }

    private ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
    }

    public ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method6142(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1261062078L ^ 0x4B2A47BE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1158634288L ^ 0xBAF0A42F);
            int n2 = (int)((long)582440480 ^ (long)582440495);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1168507496 ^ (long)1168521043) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

