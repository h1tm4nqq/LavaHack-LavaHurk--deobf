//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.play.server.SPacketEntityTeleport
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.SPacketEntityTeleport;

public class Class1098
extends Class42 {
    private final Class44 Field12951 = this.Method23(new Class44("Only Players", (Class42)this, true));
    @Class1801
    private final Class618 Field12952 = new Class618(this::Method4496, new Predicate[0]);
    private String Field12953 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1098() {
        super("TraceTeleport", "", Class97.Field8344);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field12952);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field12952);
    }

    private void Method4496(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketEntityTeleport)) return;
        SPacketEntityTeleport sPacketEntityTeleport = (SPacketEntityTeleport)class544.Method982();
        Entity entity = Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(sPacketEntityTeleport.getEntityId());
        if (this.Field12951.Method365()) {
            if (!(entity instanceof EntityPlayer)) return;
        }
        if (!(Math.abs(Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - sPacketEntityTeleport.getX()) > Double.longBitsToDouble(4647503709213818880L))) {
            if (!(Math.abs(Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - sPacketEntityTeleport.getZ()) > Double.longBitsToDouble((long)94471313 ^ 0x407F400005A18491L))) return;
        }
        Class1393.Method5507().Method1886(String.format("Entity [%s] teleported to [%.2f, %.2f, %.2f], %.2f blocks away", entity != null ? entity.getClass().getSimpleName() : "Unknown", sPacketEntityTeleport.getX(), sPacketEntityTeleport.getY(), sPacketEntityTeleport.getZ(), Math.sqrt(Math.pow(Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - sPacketEntityTeleport.getX(), Double.longBitsToDouble((long)418521698 ^ 0x4000000018F22262L)) + Math.pow(Class1098.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - sPacketEntityTeleport.getZ(), Double.longBitsToDouble(0x4000000000000000L)))));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 55;
            cArray2[n] = (char)(cArray[n] ^ (0x72D3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

