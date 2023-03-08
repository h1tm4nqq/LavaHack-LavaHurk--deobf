//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import kotlin.*;
import net.minecraft.util.*;
import net.minecraft.client.network.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f?\u0006\r" }, d2 = { "Lcom/kisman/cc/event/events/EventCape;", "Lcom/kisman/cc/event/Event;", "info", "Lnet/minecraft/client/network/NetworkPlayerInfo;", "(Lnet/minecraft/client/network/NetworkPlayerInfo;)V", "getInfo", "()Lnet/minecraft/client/network/NetworkPlayerInfo;", "resLoc", "Lnet/minecraft/util/ResourceLocation;", "getResLoc", "()Lnet/minecraft/util/ResourceLocation;", "setResLoc", "(Lnet/minecraft/util/ResourceLocation;)V", "kisman.cc" })
public final class Class1508 extends Class2157
{
    @Nullable
    private ResourceLocation Field15063;
    @NotNull
    private final NetworkPlayerInfo Field15064;
    private int Field15065;
    
    @Nullable
    @Nullable
    public final ResourceLocation Method6028() {
        return this.Field15063;
    }
    
    public final void Method6029(@Nullable @Nullable final ResourceLocation field15063) {
        this.Field15063 = field15063;
    }
    
    @NotNull
    @NotNull
    public final NetworkPlayerInfo Method6030() {
        return this.Field15064;
    }
    
    public Class1508(@NotNull @NotNull final NetworkPlayerInfo field15064) {
        Intrinsics.checkParameterIsNotNull((Object)field15064, "info");
        super(new Object[0]);
        this.Field15064 = field15064;
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1184 ^ 0x77));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
