//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.PacketBuffer
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class537;
import lavahack.client.Class716;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.PacketBuffer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketRiddenEntityPos;", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/C2SPacket;", "()V", "entityID", "", "x", "", "y", "z", "(IDDD)V", "execute", "", "manager", "Lnet/minecraft/network/NetworkManager;", "readInnerBuffer", "buffer", "Lnet/minecraft/network/PacketBuffer;", "writeInnerBuffer", "kisman.cc"})
public final class Class1226
extends Class716 {
    private int Field13566;
    private double Field13567;
    private double Field13568;
    private double Field13569;
    private String Field13570 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void readInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        this.Field13566 = packetBuffer.readVarInt();
        this.Field13567 = packetBuffer.readDouble();
        this.Field13568 = packetBuffer.readDouble();
        this.Field13569 = packetBuffer.readDouble();
    }

    @Override
    public void writeInnerBuffer(@NotNull @NotNull PacketBuffer packetBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)packetBuffer, (String)"buffer");
        packetBuffer.writeVarInt(this.Field13566);
        packetBuffer.writeDouble(this.Field13567);
        packetBuffer.writeDouble(this.Field13568);
        packetBuffer.writeDouble(this.Field13569);
    }

    @Override
    public void execute(@NotNull @NotNull NetworkManager networkManager) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        Class2142.Field17803.addScheduledTask((Runnable)new Class537(this));
    }

    public Class1226(int n, double d, double d2, double d3) {
        super(4);
        this.Field13566 = n;
        this.Field13567 = d;
        this.Field13568 = d2;
        this.Field13569 = d3;
    }

    public Class1226() {
        this(-1, 0.0, 0.0, 0.0);
    }

    public static final /* bridge */ /* synthetic */ int Method4931(Class1226 class1226) {
        return class1226.Field13566;
    }

    public static final /* bridge */ /* synthetic */ void Method4932(Class1226 class1226, int n) {
        class1226.Field13566 = n;
    }

    public static final /* bridge */ /* synthetic */ double Method4933(Class1226 class1226) {
        return class1226.Field13567;
    }

    public static final /* bridge */ /* synthetic */ void Method4934(Class1226 class1226, double d) {
        class1226.Field13567 = d;
    }

    public static final /* bridge */ /* synthetic */ double Method4935(Class1226 class1226) {
        return class1226.Field13568;
    }

    public static final /* bridge */ /* synthetic */ void Method4936(Class1226 class1226, double d) {
        class1226.Field13568 = d;
    }

    public static final /* bridge */ /* synthetic */ double Method4937(Class1226 class1226) {
        return class1226.Field13569;
    }

    public static final /* bridge */ /* synthetic */ void Method4938(Class1226 class1226, double d) {
        class1226.Field13569 = d;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 9;
            cArray2[n] = (char)(cArray[n] ^ (0x15C0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

