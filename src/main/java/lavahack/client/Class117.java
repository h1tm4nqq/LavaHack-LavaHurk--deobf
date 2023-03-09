//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class256;
import lavahack.client.Class421;
import lavahack.client.Class9;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/providers/DefaultSwapper;", "Lcom/kisman/cc/util/providers/ISwapper;", "()V", "swap", "", "kisman.cc"})
public final class Class117
implements Class421 {
    private String Field8413 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method844() {
        if (Class256.Field9152.Method1395() > Class256.Field9152.Method1385() - 1 && Class256.Field9152.Method1385() != 0) {
            Class256.Field9152.Method1370(null);
            Class256.Field9152.Method1396(0);
            return false;
        }
        Class9.Method110(Class9.Method109(Class256.Field9152.Method1369()), false);
        if (!Class256.Field9152.Method1373()) {
            Class256.Field9152.Method1390(true);
            return true;
        }
        NetHandlerPlayClient netHandlerPlayClient = Class2142.Field17803.player.connection;
        BlockPos blockPos = Class256.Field9152.Method1369();
        if (blockPos == null) {
            Intrinsics.throwNpe();
        }
        netHandlerPlayClient.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
        Class256 class256 = Class256.Field9152;
        int n = class256.Method1395();
        class256.Method1396(n + 1);
        if (!Class256.Field9152.Method1375()) {
            Class256.Field9152.Method1370(null);
        }
        Class9.Method110(Class256.Field9152.Method1401(), false);
        return true;
    }
}

