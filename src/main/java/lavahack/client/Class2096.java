//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import lavahack.client.Class218;
import lavahack.client.Class737;
import lavahack.client.Class86;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class2096
implements Runnable {
    final Class737 Field17553;
    final CPacketPlayer Field17554;
    private String Field17555 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        if (Class2142.Field17803.player == null) return;
        Class86 class86 = Class218.Field8954.Method1258();
        if (class86 != null && class86.Method742(this.Field17554)) {
            double d = this.Field17554.getX(Class2142.Field17803.player.posX);
            double d2 = this.Field17554.getX(Class2142.Field17803.player.posY);
            double d3 = this.Field17554.getX(Class2142.Field17803.player.posZ);
            float f = this.Field17554.getYaw(Class2142.Field17803.player.rotationYaw);
            float f2 = this.Field17554.getPitch(Class2142.Field17803.player.rotationPitch);
            boolean bl = this.Field17554.isOnGround();
            return;
        }
        this.Field17553.handle((Packet)this.Field17554);
    }

    Class2096(Class737 class737, CPacketPlayer cPacketPlayer) {
        this.Field17553 = class737;
        this.Field17554 = cPacketPlayer;
    }
}

