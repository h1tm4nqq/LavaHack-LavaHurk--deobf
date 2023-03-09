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

import lavahack.client.Class1479;
import lavahack.client.Class2101;
import lavahack.client.Class32;
import lavahack.client.Class415;
import lavahack.client.Class46;
import lavahack.client.Class542;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class Class1200 {
    public static final Class1200 Field13444 = new Class1200();
    private final Minecraft Field13445 = Minecraft.getMinecraft();
    private int Field13446 = -1;
    private String Field13447 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1200() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4831(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4832(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        Class542.Field10314.info("Scheduling client settings reset.");
        Class46.Field8118 = true;
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
        Class1479 class1479 = Class46.Field8122;
        if (worldClient != null && entityPlayerSP != null && class1479 != null && class1479.Field14897) {
            this.Field13445.profiler.startSection("printer");
            Class415 class415 = Class415.Field9718;
            if (class415.Method2009() && class415.Method2012()) {
                this.Field13446 = Class32.Field7981;
                class415.Method2018(worldClient, entityPlayerSP);
            }
            this.Field13445.profiler.endSection();
        }
        if (Class46.Field8118) {
            Class2101.Field17565.Method413();
            Class46.Field8118 = false;
            Class542.Field10314.info("Client settings have been reset.");
        }
        this.Field13445.profiler.endSection();
    }

    private static String Method4834(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 8;
            cArray2[n] = (char)(cArray[n] ^ (0x57C0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

