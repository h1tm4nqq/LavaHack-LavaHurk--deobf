//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.play.client.*;
import com.kisman.cc.util.*;
import net.minecraft.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class2096 implements Runnable
{
    final Class737 Field17553;
    final CPacketPlayer Field17554;
    private String Field17555 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        if (Class2142.Field17803.player != null) {
            final Class86 method1258 = Class218.Field8954.Method1258();
            if (method1258 == null || !method1258.Method742(this.Field17554)) {
                this.Field17553.handle((Packet)this.Field17554);
                return;
            }
            this.Field17554.getX(Class2142.Field17803.player.posX);
            this.Field17554.getX(Class2142.Field17803.player.posY);
            this.Field17554.getX(Class2142.Field17803.player.posZ);
            this.Field17554.getYaw(Class2142.Field17803.player.rotationYaw);
            this.Field17554.getPitch(Class2142.Field17803.player.rotationPitch);
            this.Field17554.isOnGround();
        }
    }
    
    Class2096(final Class737 field17553, final CPacketPlayer field17554) {
        this.Field17553 = field17553;
        this.Field17554 = field17554;
    }
}
