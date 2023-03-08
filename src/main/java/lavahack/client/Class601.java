//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.concurrent.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import net.minecraft.network.*;
import kotlin.jvm.internal.*;
import org.apache.logging.log4j.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005?\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006R$\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00060\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/pingbypass/server/protocol/ProtocolFactory;", "", "()V", "factories", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/PingBypassPacket;", "convert", "buf", "Lnet/minecraft/network/PacketBuffer;", "handle", "", "manager", "Lnet/minecraft/network/NetworkManager;", "register", "id", "packet", "Companion", "kisman.cc" })
public class Class601
{
    private final ConcurrentHashMap Field10558;
    private static final Logger Field10559;
    public static final Class852 Field10560;
    private String Field10561 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method2597(final int i, @NotNull @NotNull final Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "packet");
        this.Field10558.put(i, supplier);
    }
    
    public final void Method2598(@NotNull @NotNull final PacketBuffer packetBuffer, @NotNull @NotNull final NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buf");
        Intrinsics.checkParameterIsNotNull((Object)networkManager, "manager");
        this.Method2599(packetBuffer).execute(networkManager);
    }
    
    @NotNull
    @NotNull
    public final Class409 Method2599(@NotNull @NotNull final PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, "buf");
        final int readVarInt = packetBuffer.readVarInt();
        final Supplier<Object> supplier = this.Field10558.get(readVarInt);
        if (supplier == null) {
            Class601.Field10559.error("Could not find Packet Factory for id " + readVarInt);
            throw new Exception("Could not find Packet Factory for id " + readVarInt);
        }
        final Class409 value = supplier.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "factory.get()");
        final Class409 class409 = value;
        class409.readInnerBuffer(packetBuffer);
        return class409;
    }
    
    public Class601() {
        this.Field10558 = new ConcurrentHashMap();
    }
    
    static {
        Field10560 = new Class852(null);
        Field10559 = LogManager.getLogger();
    }
    
    private static String Method2600(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF8 ^ 0x76));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
