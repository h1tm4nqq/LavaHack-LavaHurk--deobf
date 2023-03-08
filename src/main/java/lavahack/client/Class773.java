//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/features/module/render/Trails$TracePos;", "", "pos", "Lnet/minecraft/util/math/Vec3d;", "time", "", "(Lnet/minecraft/util/math/Vec3d;J)V", "getPos", "()Lnet/minecraft/util/math/Vec3d;", "setPos", "(Lnet/minecraft/util/math/Vec3d;)V", "getTime", "()J", "setTime", "(J)V", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "shouldBeRemove", "", "kisman.cc" })
public final class Class773
{
    @NotNull
    private final Class650 Field11271;
    @NotNull
    private Vec3d Field11272;
    private long Field11273;
    private String Field11274 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class650 Method3220() {
        return this.Field11271;
    }
    
    public final boolean Method3221() {
        return this.Field11271.Method2797(2000L);
    }
    
    @NotNull
    @NotNull
    public final Vec3d Method3222() {
        return this.Field11272;
    }
    
    public final void Method3223(@NotNull @NotNull final Vec3d field11272) {
        Intrinsics.checkParameterIsNotNull((Object)field11272, "<set-?>");
        this.Field11272 = field11272;
    }
    
    public final long Method3224() {
        return this.Field11273;
    }
    
    public final void Method3225(final long field11273) {
        this.Field11273 = field11273;
    }
    
    public Class773(@NotNull @NotNull final Vec3d field11272, final long field11273) {
        Intrinsics.checkParameterIsNotNull((Object)field11272, "pos");
        this.Field11272 = field11272;
        this.Field11273 = field11273;
        this.Field11271 = new Class650();
    }
    
    private static String Method3226(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x62D0 ^ 0x24));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
