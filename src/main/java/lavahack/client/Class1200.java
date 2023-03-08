//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.entity.*;

public class Class1200
{
    public static final Class1200 Field13444;
    private final Minecraft Field13445;
    private int Field13446;
    private String Field13447 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1200() {
        this.Field13445 = Minecraft.getMinecraft();
        this.Field13446 = -1;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4831(final FMLNetworkEvent$ClientConnectedToServerEvent fmlNetworkEvent$ClientConnectedToServerEvent) {
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4832(final FMLNetworkEvent$ClientDisconnectionFromServerEvent fmlNetworkEvent$ClientDisconnectionFromServerEvent) {
        Class542.Field10314.info("Scheduling client settings reset.");
        Class46.Field8118 = true;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4833(final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        if (this.Field13445.isGamePaused() || tickEvent$ClientTickEvent.phase != TickEvent$Phase.END) {
            return;
        }
        this.Field13445.profiler.startSection("schematica");
        final WorldClient world = this.Field13445.world;
        final EntityPlayerSP player = this.Field13445.player;
        final Class1479 field8122 = Class46.Field8122;
        if (world != null && player != null && field8122 != null && field8122.Field14897) {
            this.Field13445.profiler.startSection("printer");
            final Class415 field8123 = Class415.Field9718;
            if (field8123.Method2009() && field8123.Method2012()) {
                this.Field13446 = Class32.Field7981;
                field8123.Method2018(world, player);
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
    
    static {
        Field13444 = new Class1200();
    }
    
    private static String Method4834(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x57C0 ^ 0x8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
