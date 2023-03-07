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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.oBHM2VCoS2VhGC2gcPGp5YmkJF9HZPjM;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/providers/DefaultSwapper;", "Lcom/kisman/cc/util/providers/ISwapper;", "()V", "swap", "", "kisman.cc"})
public final class G4rlvdq3ffaWKhUJ9QOqsMSrc8mptBF8
implements oBHM2VCoS2VhGC2gcPGp5YmkJF9HZPjM {
    private String Field8413 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method844() {
        if (L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1395() > L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1385() - (int)((long)1407952344 ^ (long)1407952345) && L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1385() != 0) {
            L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1370(null);
            L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1396((int)1762298642L ^ 0x690A8B12);
            return ((int)149565782L ^ 0x8EA3156) != 0;
        }
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method109(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369()), ((int)1644604467L ^ 0x6206AC33) != 0);
        if (!L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1373()) {
            L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1390(((int)1473030257L ^ 0x57CCA870) != 0);
            return (int)((long)1517979666 ^ (long)1517979667) != 0;
        }
        NetHandlerPlayClient netHandlerPlayClient = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection;
        BlockPos blockPos = L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1369();
        if (blockPos == null) {
            Intrinsics.throwNpe();
        }
        netHandlerPlayClient.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
        L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN = L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152;
        int n = l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Method1395();
        l2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Method1396(n + ((int)-128094241L ^ 0xF85D6FDE));
        if (!L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1375()) {
            L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1370(null);
        }
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1401(), (boolean)((long)1396944367 ^ (long)1396944367));
        return (int)((long)1517979666 ^ (long)1517979667) != 0;
    }
}

