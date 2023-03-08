//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import java.util.*;
import java.awt.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/util/render/customfont/SizechangeableFontRenderer;", "Lcom/kisman/cc/util/render/customfont/ExtendedFontRenderer;", "font", "Ljava/awt/Font;", "(Ljava/awt/Font;)V", "fonts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "max", "Ljava/util/function/Supplier;", "", "min", "size", "getCurrentFont", "Lcom/kisman/cc/util/render/customfont/CustomFontRenderer;", "kisman.cc" })
public final class Class782 extends Class670
{
    private final ArrayList Field11296;
    private final Supplier Field11297;
    private final Supplier Field11298;
    private final Supplier Field11299;
    private int Field11300;
    
    @NotNull
    @NotNull
    public Class433 Method2852() {
        for (final Class670 class670 : this.Field11296) {
            final int size = class670.Method2854().getSize();
            final Integer n = this.Field11297.get();
            if (n == null) {
                continue;
            }
            if (size == n) {
                return class670.Method2852();
            }
        }
        final Font method2854 = this.Method2854();
        final Number value = this.Field11297.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "size.get()");
        final Font deriveFont = method2854.deriveFont(value.intValue());
        Intrinsics.checkExpressionValueIsNotNull((Object)deriveFont, "this.font.deriveFont(size.get())");
        final Class670 e = new Class670(deriveFont);
        this.Field11296.add(e);
        return e.Method2852();
    }
    
    public Class782(@NotNull @NotNull final Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, "font");
        super(font);
        this.Field11296 = new ArrayList();
        this.Field11297 = (Supplier)new Class758(font);
        this.Field11298 = (Supplier)Class2152.Field17847;
        this.Field11299 = (Supplier)Class568.Field10420;
        int intValue = this.Field11298.get().intValue();
        final Number value = this.Field11299.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "max.get()");
        final int intValue2 = value.intValue();
        if (intValue <= intValue2) {
            while (true) {
                final ArrayList field11296 = this.Field11296;
                final Font deriveFont = font.deriveFont(intValue);
                Intrinsics.checkExpressionValueIsNotNull((Object)deriveFont, "font.deriveFont(i)");
                field11296.add(new Class670(deriveFont));
                if (intValue == intValue2) {
                    break;
                }
                ++intValue;
            }
        }
    }
    
    private static String Method2855(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE34 ^ 0x69));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
