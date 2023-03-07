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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.SPacketEntityTeleport;

public class z4ZQNDoqOseyXTiF20vTyAUCcK889rtP
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12951 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Only Players", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1138917222L ^ 0x43E27F67) != 0));
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12952 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4496, new Predicate[(int)1492909230L ^ 0x58FBFCAE]);
    private String Field12953 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public z4ZQNDoqOseyXTiF20vTyAUCcK889rtP() {
        super("TraceTeleport", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12952);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12952);
    }

    private void Method4496(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketEntityTeleport)) return;
        SPacketEntityTeleport sPacketEntityTeleport = (SPacketEntityTeleport)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        Entity entity = z4ZQNDoqOseyXTiF20vTyAUCcK889rtP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(sPacketEntityTeleport.getEntityId());
        if (this.Field12951.Method365()) {
            if (!(entity instanceof EntityPlayer)) return;
        }
        if (!(Math.abs(z4ZQNDoqOseyXTiF20vTyAUCcK889rtP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - sPacketEntityTeleport.getX()) > Double.longBitsToDouble(0x2F767A37873B5CCEL ^ 0x6F093A37873B5CCEL))) {
            if (!(Math.abs(z4ZQNDoqOseyXTiF20vTyAUCcK889rtP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - sPacketEntityTeleport.getZ()) > Double.longBitsToDouble((long)94471313 ^ 0x407F400005A18491L))) return;
        }
        Object[] objectArray = new Object[(int)((long)-1997109477 ^ (long)-1997109474)];
        objectArray[(int)-543527016L ^ 0xDF9A6F98] = entity != null ? entity.getClass().getSimpleName() : "Unknown";
        objectArray[(int)((long)2108179374 ^ (long)2108179375)] = sPacketEntityTeleport.getX();
        objectArray[((int)307661064L ^ 0x12568909) << 1] = sPacketEntityTeleport.getY();
        objectArray[(int)((long)1440971593 ^ (long)1440971594)] = sPacketEntityTeleport.getZ();
        objectArray[((int)383537869L ^ 0x16DC52CC) << 2] = Math.sqrt(Math.pow(z4ZQNDoqOseyXTiF20vTyAUCcK889rtP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - sPacketEntityTeleport.getX(), Double.longBitsToDouble((long)418521698 ^ 0x4000000018F22262L)) + Math.pow(z4ZQNDoqOseyXTiF20vTyAUCcK889rtP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - sPacketEntityTeleport.getZ(), Double.longBitsToDouble(0xFDF3EADCD7A77CEBL ^ 0xBDF3EADCD7A77CEBL)));
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886(String.format("Entity [%s] teleported to [%.2f, %.2f, %.2f], %.2f blocks away", objectArray));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2006978116 ^ (long)2006978116);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1487129531 ^ (long)1487129412);
            int n2 = (int)1093645314L ^ 0x412FB435;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1131351752 ^ (long)1131379739) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

