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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.play.server.SPacketEntityTeleport;

public class tTKMdjaKyiF6l2jcvmFnDpKvrYXqDawy
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field15984 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6620, new Predicate[(int)((long)-2141299700 ^ (long)-2141299700)]);
    private int Field15985;

    public tTKMdjaKyiF6l2jcvmFnDpKvrYXqDawy() {
        super("ChorusTP", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345, ((int)1321420537L ^ 0x4EC346F8) != 0);
    }

    private void Method6620(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (tTKMdjaKyiF6l2jcvmFnDpKvrYXqDawy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (tTKMdjaKyiF6l2jcvmFnDpKvrYXqDawy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketEntityTeleport)) {
            return;
        }
        SPacketEntityTeleport sPacketEntityTeleport = (SPacketEntityTeleport)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (sPacketEntityTeleport.getEntityId() != tTKMdjaKyiF6l2jcvmFnDpKvrYXqDawy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityId()) {
            return;
        }
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method804((double)tTKMdjaKyiF6l2jcvmFnDpKvrYXqDawy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getX() + Double.longBitsToDouble((long)997876689 ^ 0x3FE000003B7A63D1L));
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method805((double)tTKMdjaKyiF6l2jcvmFnDpKvrYXqDawy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getY() + 1.0);
        ((ISPacketEntityTeleport)sPacketEntityTeleport).Method806((double)tTKMdjaKyiF6l2jcvmFnDpKvrYXqDawy.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getZ() + Double.longBitsToDouble(0x20886D0BF58F973AL ^ 0x1F686D0BF58F973AL));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-720797287 ^ (long)-720797287);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1739598945L ^ 0x67B02C9E);
            int n2 = ((int)1534914172L ^ 0x5B7CEE25) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-337884228 ^ (long)-337877743) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

