//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import net.minecraft.util.text.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0007j\b\u0012\u0004\u0012\u00020\u0001`\b\u001a\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0007j\b\u0012\u0004\u0012\u00020\u0001`\b\"\u0011\u0010\u0000\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003?\u0006\n" }, d2 = { "DEFAULT_COLOR_FORMATTER", "Lcom/kisman/cc/util/minecraft/Formatter;", "getDEFAULT_COLOR_FORMATTER", "()Lcom/kisman/cc/util/minecraft/Formatter;", "DEFAULT_STYLE_FORMATTER", "getDEFAULT_STYLE_FORMATTER", "getColorFormatters", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getStyleFormatters", "kisman.cc" })
public final class Class1813
{
    @NotNull
    private static final Class640 Field16339;
    @NotNull
    private static final Class640 Field16340;
    private String Field16341 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public static final Class640 Method6836() {
        return Class1813.Field16339;
    }
    
    @NotNull
    @NotNull
    public static final Class640 Method6837() {
        return Class1813.Field16340;
    }
    
    @NotNull
    @NotNull
    public static final ArrayList Method6838() {
        final ArrayList<Class640> list = new ArrayList<Class640>();
        for (final TextFormatting textFormatting : TextFormatting.values()) {
            if (!textFormatting.isFancyStyling() || textFormatting.getColorIndex() == -1) {
                final ArrayList<Class640> list2 = list;
                final TextFormatting textFormatting2 = textFormatting;
                final String getFriendlyName = textFormatting.getFriendlyName();
                Intrinsics.checkExpressionValueIsNotNull((Object)getFriendlyName, "formatting.friendlyName");
                list2.add(new Class640(textFormatting2, getFriendlyName, Class372.Field9559));
            }
        }
        return list;
    }
    
    @NotNull
    @NotNull
    public static final ArrayList Method6839() {
        final ArrayList<Class640> list = new ArrayList<Class640>();
        for (final TextFormatting textFormatting : TextFormatting.values()) {
            if (textFormatting.isFancyStyling() || textFormatting.getColorIndex() == -1) {
                final ArrayList<Class640> list2 = list;
                final TextFormatting textFormatting2 = textFormatting;
                final String getFriendlyName = textFormatting.getFriendlyName();
                Intrinsics.checkExpressionValueIsNotNull((Object)getFriendlyName, "formatting.friendlyName");
                list2.add(new Class640(textFormatting2, getFriendlyName, Class372.Field9560));
            }
        }
        return list;
    }
    
    static {
        final TextFormatting reset = TextFormatting.RESET;
        final String getFriendlyName = TextFormatting.RESET.getFriendlyName();
        Intrinsics.checkExpressionValueIsNotNull((Object)getFriendlyName, "TextFormatting.RESET.friendlyName");
        Field16339 = new Class640(reset, getFriendlyName, Class372.Field9559);
        final TextFormatting reset2 = TextFormatting.RESET;
        final String getFriendlyName2 = TextFormatting.RESET.getFriendlyName();
        Intrinsics.checkExpressionValueIsNotNull((Object)getFriendlyName2, "TextFormatting.RESET.friendlyName");
        Field16340 = new Class640(reset2, getFriendlyName2, Class372.Field9559);
    }
    
    private static String Method6840(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6966 ^ 0x73));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
