//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/features/hud/modules/arraylist/ArrayListElement;", "", "name", "", "type", "Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;", "(Ljava/lang/String;Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;)V", "raw", "(Ljava/lang/String;Ljava/lang/String;Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;)V", "getName", "()Ljava/lang/String;", "getRaw", "getType", "()Lcom/kisman/cc/features/hud/modules/arraylist/ElementTypes;", "kisman.cc" })
public final class Class83
{
    @NotNull
    private final String Field8280;
    @NotNull
    private final String Field8281;
    @NotNull
    private final Class698 Field8282;
    private int Field8283;
    
    @NotNull
    @NotNull
    public final String Method734() {
        return this.Field8280;
    }
    
    @NotNull
    @NotNull
    public final String Method735() {
        return this.Field8281;
    }
    
    @NotNull
    @NotNull
    public final Class698 Method736() {
        return this.Field8282;
    }
    
    public Class83(@NotNull @NotNull final String field8280, @NotNull @NotNull final String field8281, @NotNull @NotNull final Class698 field8282) {
        Intrinsics.checkParameterIsNotNull((Object)field8280, "name");
        Intrinsics.checkParameterIsNotNull((Object)field8281, "raw");
        Intrinsics.checkParameterIsNotNull((Object)field8282, "type");
        this.Field8280 = field8280;
        this.Field8281 = field8281;
        this.Field8282 = field8282;
    }
    
    public Class83(@NotNull @NotNull final String s, @NotNull @NotNull final Class698 class698) {
        Intrinsics.checkParameterIsNotNull((Object)s, "name");
        Intrinsics.checkParameterIsNotNull((Object)class698, "type");
        this(s, s, class698);
    }
    
    private static String Method737(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xFC9 ^ 0x61));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
