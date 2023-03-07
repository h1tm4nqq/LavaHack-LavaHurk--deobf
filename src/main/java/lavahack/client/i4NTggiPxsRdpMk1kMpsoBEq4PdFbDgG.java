//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import lavahack.client.i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.j22yWA1783NfsZKLUhZpmvyHOL7lU7gI;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPacketPlayer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketActualPos;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "x", "", "y", "z", "(DDD)V", "packetfly", "", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "valid", "packet", "Lnet/minecraft/network/play/client/CPacketPlayer;", "writeInnerBuffer", "kisman.cc"})
public final class i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG
extends j22yWA1783NfsZKLUhZpmvyHOL7lU7gI {
    private boolean Field8288;
    private double Field8289;
    private double Field8290;
    private double Field8291;
    private String Field8292 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void readInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        this.Field8289 = packetBuffer.readDouble();
        this.Field8290 = packetBuffer.readDouble();
        this.Field8291 = packetBuffer.readDouble();
        this.Field8288 = packetBuffer.readBoolean();
    }

    @Override
    public void writeInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        packetBuffer.writeDouble(this.Field8289);
        packetBuffer.writeDouble(this.Field8290);
        packetBuffer.writeDouble(this.Field8291);
        packetBuffer.writeBoolean(this.Field8288);
    }

    @Override
    public void execute(@NotNull @NotNull NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.addScheduledTask((Runnable)new i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this));
    }

    public final boolean Method742(@NotNull @NotNull CPacketPlayer cPacketPlayer) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)cPacketPlayer, (String)"packet");
        double d = cPacketPlayer.getX(this.Field8289) - this.Field8289;
        double d2 = cPacketPlayer.getX(this.Field8290) - this.Field8290;
        double d3 = cPacketPlayer.getX(this.Field8291) - this.Field8291;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5552();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"PingBypass.positionRange");
        if (d * d + d2 * d2 + d3 * d3 <= qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method367()) {
            n = (int)((long)-836768585 ^ (long)-836768586);
            return n != 0;
        }
        n = (int)-921067406L ^ 0xC919A072;
        return n != 0;
    }

    public i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG(double d, double d2, double d3) {
        super(((int)-1352464048L ^ 0xAF630951) << 1);
        this.Field8289 = d;
        this.Field8290 = d2;
        this.Field8291 = d3;
    }

    public i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG() {
        this(0.0, 0.0, 0.0);
    }

    public static final /* bridge */ /* synthetic */ boolean Method743(i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2) {
        return i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2.Field8288;
    }

    public static final /* bridge */ /* synthetic */ void Method744(i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2, boolean bl) {
        i4NTggiPxsRdpMk1kMpsoBEq4PdFbDgG2.Field8288 = bl;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1958730054 ^ (long)-1958730054);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-508178297 ^ (long)-508178312);
            int n2 = ((int)-1977495090L ^ 0x8A21D1E1) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-162889231 ^ (long)-162877214) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

