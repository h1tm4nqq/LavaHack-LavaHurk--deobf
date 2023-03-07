/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.network.NetworkManager
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG;
import net.minecraft.network.NetworkManager;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e\u00a8\u0006\u001e"}, d2={"Lcom/kisman/cc/pingbypass/server/PingBypassServer;", "", "()V", "actualPos", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketActualPos;", "getActualPos", "()Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketActualPos;", "setActualPos", "(Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketActualPos;)V", "connected", "", "getConnected", "()Z", "setConnected", "(Z)V", "manager", "Lnet/minecraft/network/NetworkManager;", "getManager", "()Lnet/minecraft/network/NetworkManager;", "setManager", "(Lnet/minecraft/network/NetworkManager;)V", "packetflying", "getPacketflying", "setPacketflying", "server", "getServer", "setServer", "stay", "getStay", "setStay", "kisman.cc"})
public final class xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG {
    private static boolean Field8948;
    private static boolean Field8949;
    @Nullable
    private static NetworkManager Field8950;
    @Nullable
    private static i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG Field8951;
    private static boolean Field8952;
    private static boolean Field8953;
    public static final xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG Field8954;
    private int Field8955;

    public final boolean Method1252() {
        return Field8948;
    }

    public final void Method1253(boolean bl) {
        Field8948 = bl;
    }

    public final boolean Method1254() {
        return Field8949;
    }

    public final void Method1255(boolean bl) {
        Field8949 = bl;
    }

    @Nullable
    @Nullable
    public final NetworkManager Method1256() {
        return Field8950;
    }

    public final void Method1257(@Nullable @Nullable NetworkManager networkManager) {
        Field8950 = networkManager;
    }

    @Nullable
    @Nullable
    public final i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG Method1258() {
        return Field8951;
    }

    public final void Method1259(@Nullable @Nullable i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2) {
        Field8951 = i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2;
    }

    public final boolean Method1260() {
        return Field8952;
    }

    public final void Method1261(boolean bl) {
        Field8952 = bl;
    }

    public final boolean Method1262() {
        return Field8953;
    }

    public final void Method1263(boolean bl) {
        Field8953 = bl;
    }

    public final boolean Method1264() {
        int n;
        if (Field8953 && Field8949) {
            n = (int)-400586966L ^ 0xE81F872B;
            return n != 0;
        }
        n = (int)968004684L ^ 0x39B2944C;
        return n != 0;
    }

    private xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG() {
    }

    static {
        xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG2;
        Field8954 = xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG2 = new xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG();
    }
}

