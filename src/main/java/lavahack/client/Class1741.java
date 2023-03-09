//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketEntityTeleport
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.ISPacketEntityTeleport;
import java.util.function.Predicate;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketEntityTeleport;

public class Class1741
extends Class42 {
    @Class1801
    private final Class618 Field15984 = new Class618(this::Method6620, new Predicate[0]);
    private int Field15985;

    public Class1741() {
        super("ChorusTP", Class97.Field8345, true);
    }

    private void Method6620(Class544 class544) {
        if (Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (!(class544.Method982() instanceof SPacketEntityTeleport)) {
            return;
        }
        SPacketEntityTeleport sPacketEntityTeleport = (SPacketEntityTeleport)class544.Method982();
        if (sPacketEntityTeleport.getEntityId() != Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityId()) {
            return;
        }
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method804((double)Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getX() + Double.longBitsToDouble((long)997876689 ^ 0x3FE000003B7A63D1L));
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method805((double)Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getY() + 1.0);
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method806((double)Class1741.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getZ() + Double.longBitsToDouble(4602678819172646912L));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 178;
            cArray2[n] = (char)(cArray[n] ^ (0x2EAD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

