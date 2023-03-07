//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ADIF586Nr0L3HddvBETPsOnmnXQkvbXn;
import lavahack.client.QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0007j\b\u0012\u0004\u0012\u00020\u0001`\b\u001a\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0007j\b\u0012\u0004\u0012\u00020\u0001`\b\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u00a8\u0006\n"}, d2={"DEFAULT_COLOR_FORMATTER", "Lcom/kisman/cc/util/minecraft/Formatter;", "getDEFAULT_COLOR_FORMATTER", "()Lcom/kisman/cc/util/minecraft/Formatter;", "DEFAULT_STYLE_FORMATTER", "getDEFAULT_STYLE_FORMATTER", "getColorFormatters", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getStyleFormatters", "kisman.cc"})
public final class LwZUS91bj5naxmiTjtsJTJv2vNP9ZO4U {
    @NotNull
    private static final QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt Field16339;
    @NotNull
    private static final QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt Field16340;
    private String Field16341 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static final QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt Method6836() {
        return Field16339;
    }

    @NotNull
    @NotNull
    public static final QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt Method6837() {
        return Field16340;
    }

    @NotNull
    @NotNull
    public static final ArrayList Method6838() {
        ArrayList<QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt> arrayList = new ArrayList<QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt>();
        TextFormatting[] textFormattingArray = TextFormatting.values();
        int n = textFormattingArray.length;
        int n2 = (int)1188554367L ^ 0x46D7E67F;
        while (n2 < n) {
            TextFormatting textFormatting = textFormattingArray[n2];
            if (!textFormatting.isFancyStyling() || textFormatting.getColorIndex() == ((int)880372671L ^ 0xCB869440)) {
                String string = textFormatting.getFriendlyName();
                Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"formatting.friendlyName");
                arrayList.add(new QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt(textFormatting, string, ADIF586Nr0L3HddvBETPsOnmnXQkvbXn.Field9559));
            }
            ++n2;
        }
        return arrayList;
    }

    @NotNull
    @NotNull
    public static final ArrayList Method6839() {
        ArrayList<QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt> arrayList = new ArrayList<QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt>();
        TextFormatting[] textFormattingArray = TextFormatting.values();
        int n = textFormattingArray.length;
        int n2 = (int)1590298493L ^ 0x5ECA077D;
        while (n2 < n) {
            TextFormatting textFormatting = textFormattingArray[n2];
            if (textFormatting.isFancyStyling() || textFormatting.getColorIndex() == (int)((long)1901529675 ^ (long)-1901529676)) {
                String string = textFormatting.getFriendlyName();
                Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"formatting.friendlyName");
                arrayList.add(new QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt(textFormatting, string, ADIF586Nr0L3HddvBETPsOnmnXQkvbXn.Field9560));
            }
            ++n2;
        }
        return arrayList;
    }

    static {
        String string = TextFormatting.RESET.getFriendlyName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"TextFormatting.RESET.friendlyName");
        Field16339 = new QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt(TextFormatting.RESET, string, ADIF586Nr0L3HddvBETPsOnmnXQkvbXn.Field9559);
        String string2 = TextFormatting.RESET.getFriendlyName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"TextFormatting.RESET.friendlyName");
        Field16340 = new QpgBaCfOoQn5tSTArKxOEf86HiNmIZqt(TextFormatting.RESET, string2, ADIF586Nr0L3HddvBETPsOnmnXQkvbXn.Field9559);
    }

    private static String Method6840(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-882910565 ^ (long)-882910565);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)381405616 ^ (long)381405519);
            int n2 = (int)754504026L ^ 0x2CF8D129;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1616610275L ^ 0x9FA448AE) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

