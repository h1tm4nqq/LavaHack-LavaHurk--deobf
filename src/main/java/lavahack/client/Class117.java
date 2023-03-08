//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/util/providers/DefaultSwapper;", "Lcom/kisman/cc/util/providers/ISwapper;", "()V", "swap", "", "kisman.cc" })
public final class Class117 implements Class421
{
    private String Field8413 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public boolean Method844() {
        if (Class256.Field9152.Method1395() > Class256.Field9152.Method1385() - 1 && Class256.Field9152.Method1385() != 0) {
            Class256.Field9152.Method1370(null);
            Class256.Field9152.Method1396(0);
            return false;
        }
        Class9.Method110(Class9.Method109(Class256.Field9152.Method1369()), false);
        if (Class256.Field9152.Method1373()) {
            final NetHandlerPlayClient connection = Class2142.Field17803.player.connection;
            final CPacketPlayerDigging$Action stop_DESTROY_BLOCK = CPacketPlayerDigging$Action.STOP_DESTROY_BLOCK;
            final BlockPos method1369 = Class256.Field9152.Method1369();
            if (method1369 == null) {
                Intrinsics.throwNpe();
            }
            connection.sendPacket((Packet)new CPacketPlayerDigging(stop_DESTROY_BLOCK, method1369, EnumFacing.DOWN));
            final Class256 field9152 = Class256.Field9152;
            field9152.Method1396(field9152.Method1395() + 1);
            if (!Class256.Field9152.Method1375()) {
                Class256.Field9152.Method1370(null);
            }
            Class9.Method110(Class256.Field9152.Method1401(), false);
        }
        else {
            Class256.Field9152.Method1390(true);
        }
        return true;
    }
}
