//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class C37t9PvjSdsZiQqQQfiU5DcoYMXhK2hh
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10123 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xDE20D818B1CFD169L ^ 0x9E835018B1CFD169L), 0.0, Double.longBitsToDouble(0xBDD00E273D76FA2CL ^ 0xFD1386273D76FA2CL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field10124 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private boolean Field10125 = (int)((long)-1709561657 ^ (long)-1709561658);
    private boolean Field10126 = (int)((long)-494537885 ^ (long)-494537885);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10127 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2339, new Predicate[(int)((long)523690325 ^ (long)523690325)]);
    private int Field10128;

    public C37t9PvjSdsZiQqQQfiU5DcoYMXhK2hh() {
        super("NoRotate", "NoRotate", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10127);
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886("This module might desync you!");
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10127);
    }

    @Override
    public void Method45() {
        if (!this.Field10126) return;
        if (this.Field10125) return;
        if (!this.Field10124.Method2797(this.Field10123.Method335())) return;
        this.Field10125 = (int)((long)1001506172 ^ (long)1001506173);
        this.Field10126 = (int)490979370L ^ 0x1D43C02A;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2337(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        this.Field10124.Method2801();
        this.Field10126 = (int)((long)-1277558229 ^ (long)-1277558230);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2338(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        this.Field10125 = (int)((long)-1153269002 ^ (long)-1153269002);
    }

    private void Method2339(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!this.Field10125) return;
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerPosLook)) return;
        SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        sPacketPlayerPosLook.yaw = C37t9PvjSdsZiQqQQfiU5DcoYMXhK2hh.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        sPacketPlayerPosLook.pitch = C37t9PvjSdsZiQqQQfiU5DcoYMXhK2hh.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)736814350L ^ 0x2BEAE50E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1421770462L ^ 0xAB4181DD);
            int n2 = (int)((long)-1951194892 ^ (long)-1951194951);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-23901505 ^ (long)-23899772) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

