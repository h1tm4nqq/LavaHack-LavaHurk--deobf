//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.PacketBuffer
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m;
import lavahack.client.XIAI0jQrxlokNtoE4oqax19MddpScmEY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006R$\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/ProtocolFactory;", "", "()V", "factories", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/PingBypassPacket;", "convert", "buf", "Lnet/minecraft/network/PacketBuffer;", "handle", "", "manager", "Lnet/minecraft/network/NetworkManager;", "register", "id", "packet", "Companion", "kisman.cc"})
public class XIAI0jQrxlokNtoE4oqax19MddpScmEY {
    private final ConcurrentHashMap Field10558 = new ConcurrentHashMap();
    private static final Logger Field10559;
    public static final XIAI0jQrxlokNtoE4oqax19MddpScmEY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10560;
    private String Field10561 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method2597(int n, @NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"packet");
        Map map = this.Field10558;
        Integer n2 = n;
        Supplier supplier2 = supplier;
        int n3 = (int)((long)1269928196 ^ (long)1269928196);
        map.put(n2, supplier2);
    }

    public final void Method2598(@NotNull @NotNull PacketBuffer packetBuffer, @NotNull @NotNull NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buf");
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        this.Method2599(packetBuffer).execute(networkManager);
    }

    @NotNull
    @NotNull
    public final DRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m Method2599(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buf");
        int n = packetBuffer.readVarInt();
        Supplier supplier = (Supplier)this.Field10558.get(n);
        if (supplier == null) {
            Field10559.error("Could not find Packet Factory for id " + n);
            throw (Throwable)new Exception("Could not find Packet Factory for id " + n);
        }
        Object t = supplier.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"factory.get()");
        DRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m dRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m = (DRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m)t;
        dRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m.readInnerBuffer(packetBuffer);
        return dRzZ1IRiUMvXZHm0hO4Bh2jyzaosEI5m;
    }

    static {
        Field10560 = new XIAI0jQrxlokNtoE4oqax19MddpScmEY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
        Field10559 = LogManager.getLogger();
    }

    private static String Method2600(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-551776384 ^ (long)-551776384);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1729090241 ^ (long)1729090110);
            int n2 = (int)((long)378043873 ^ (long)378043866) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1629286068 ^ (long)1629286059) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

