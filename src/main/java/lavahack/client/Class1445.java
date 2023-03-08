//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/render/PearlTracer$VectorWithTimer;", "", "vector", "Lnet/minecraft/util/math/Vec3d;", "(Lnet/minecraft/util/math/Vec3d;)V", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "getVector", "()Lnet/minecraft/util/math/Vec3d;", "kisman.cc" })
public final class Class1445
{
    @NotNull
    private final Class650 Field14767;
    @NotNull
    private final Vec3d Field14768;
    private String Field14769 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class650 Method5767() {
        return this.Field14767;
    }
    
    @NotNull
    @NotNull
    public final Vec3d Method5768() {
        return this.Field14768;
    }
    
    public Class1445(@NotNull @NotNull final Vec3d field14768) {
        Intrinsics.checkParameterIsNotNull((Object)field14768, "vector");
        this.Field14768 = field14768;
        this.Field14767 = new Class650();
    }
    
    private static String Method5769(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F3E ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
