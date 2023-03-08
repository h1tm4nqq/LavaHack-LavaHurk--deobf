//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.text.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/util/minecraft/Formatter;", "", "original", "Lnet/minecraft/util/text/TextFormatting;", "display", "", "type", "Lcom/kisman/cc/util/minecraft/FormatterType;", "(Lnet/minecraft/util/text/TextFormatting;Ljava/lang/String;Lcom/kisman/cc/util/minecraft/FormatterType;)V", "getDisplay", "()Ljava/lang/String;", "getOriginal", "()Lnet/minecraft/util/text/TextFormatting;", "getType", "()Lcom/kisman/cc/util/minecraft/FormatterType;", "toString", "kisman.cc" })
public final class Class640
{
    @NotNull
    private final TextFormatting Field10761;
    @NotNull
    private final String Field10762;
    @NotNull
    private final Class372 Field10763;
    private int Field10764;
    
    @NotNull
    @NotNull
    @Override
    public String toString() {
        return this.Field10762;
    }
    
    @NotNull
    @NotNull
    public final TextFormatting Method2769() {
        return this.Field10761;
    }
    
    @NotNull
    @NotNull
    public final String Method2770() {
        return this.Field10762;
    }
    
    @NotNull
    @NotNull
    public final Class372 Method2771() {
        return this.Field10763;
    }
    
    public Class640(@NotNull @NotNull final TextFormatting field10761, @NotNull @NotNull final String field10762, @NotNull @NotNull final Class372 field10763) {
        Intrinsics.checkParameterIsNotNull((Object)field10761, "original");
        Intrinsics.checkParameterIsNotNull((Object)field10762, "display");
        Intrinsics.checkParameterIsNotNull((Object)field10763, "type");
        this.Field10761 = field10761;
        this.Field10762 = field10762;
        this.Field10763 = field10763;
    }
    
    private static String Method2772(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3048 ^ 0xEF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
