//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004?\u0006\b" }, d2 = { "Lcom/kisman/cc/event/events/EventUpdateLightmap$Post;", "Lcom/kisman/cc/event/events/EventUpdateLightmap;", "lightmapColors", "", "([I)V", "getLightmapColors", "()[I", "setLightmapColors", "kisman.cc" })
public final class Class180 extends Class890
{
    @NotNull
    private int[] Field8789;
    private int Field8790;
    
    @NotNull
    @NotNull
    public final int[] Method1107() {
        return this.Field8789;
    }
    
    public final void Method1108(@NotNull @NotNull final int[] field8789) {
        Intrinsics.checkParameterIsNotNull((Object)field8789, "<set-?>");
        this.Field8789 = field8789;
    }
    
    public Class180(@NotNull @NotNull final int[] field8789) {
        Intrinsics.checkParameterIsNotNull((Object)field8789, "lightmapColors");
        this.Field8789 = field8789;
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1F6B ^ 0xC4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
