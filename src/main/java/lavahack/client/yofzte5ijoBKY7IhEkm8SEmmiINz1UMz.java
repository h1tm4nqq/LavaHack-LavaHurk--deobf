//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 */
package lavahack.client;

import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class yofzte5ijoBKY7IhEkm8SEmmiINz1UMz {
    public static final yofzte5ijoBKY7IhEkm8SEmmiINz1UMz Field13444 = new yofzte5ijoBKY7IhEkm8SEmmiINz1UMz();
    private final Minecraft Field13445 = Minecraft.getMinecraft();
    private int Field13446 = (int)1608318266L ^ 0xA02302C5;
    private String Field13447 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private yofzte5ijoBKY7IhEkm8SEmmiINz1UMz() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4831(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4832(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.info("Scheduling client settings reset.");
        sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8118 = (int)((long)-902042370 ^ (long)-902042369);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4833(TickEvent.ClientTickEvent clientTickEvent) {
        if (this.Field13445.isGamePaused()) return;
        if (clientTickEvent.phase != TickEvent.Phase.END) {
            return;
        }
        this.Field13445.profiler.startSection("schematica");
        WorldClient worldClient = this.Field13445.world;
        EntityPlayerSP entityPlayerSP = this.Field13445.player;
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122;
        if (worldClient != null && entityPlayerSP != null && oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 != null && oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14897) {
            this.Field13445.profiler.startSection("printer");
            IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE = IdtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Field9718;
            if (idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Method2009() && idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Method2012()) {
                this.Field13446 = Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7981;
                idtBqs4LV2xhMIGJcIZr5eEg0xbRH3RE.Method2018(worldClient, entityPlayerSP);
            }
            this.Field13445.profiler.endSection();
        }
        if (sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8118) {
            Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17565.Method413();
            sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8118 = (int)((long)801151930 ^ (long)801151930);
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.info("Client settings have been reset.");
        }
        this.Field13445.profiler.endSection();
    }

    private static String Method4834(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)902016987 ^ (long)902016987);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1248201452L ^ 0x4A660A13);
            int n2 = ((int)1722690545L ^ 0x66AE2BF0) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1749813744 ^ (long)-1749813425) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

