//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.play.server.SPacketChat
 *  net.minecraft.network.play.server.SPacketEntityStatus
 *  net.minecraft.network.play.server.SPacketRespawn
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.ClientChatEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 */
package com.kisman.cc.event;

import com.kisman.cc.util.Class602;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import lavahack.client.Class1100;
import lavahack.client.Class1102;
import lavahack.client.Class112;
import lavahack.client.Class1345;
import lavahack.client.Class1416;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class2085;
import lavahack.client.Class212;
import lavahack.client.Class279;
import lavahack.client.Class42;
import lavahack.client.Class544;
import lavahack.client.Class618;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketRespawn;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class Class1817 {
    private final Minecraft Field16351 = Minecraft.getMinecraft();
    public AtomicBoolean Field16352;
    public int Field16353 = -1;
    public int Field16354 = -1;
    @Class1801
    private final Class618 Field16355 = new Class618(this::Method6853, new Predicate[0]);
    @Class1801
    private final Class618 Field16356 = new Class618(this::Method6852, new Predicate[0]);
    private String Field16357 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1817() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method706(this.Field16356);
        Class1796.Field16242.Method706(Class602.Field10562.Field10566);
        Class1796.Field16242.Method706(this.Field16355);
        ++Class1796.Field16241.Field16286.Field11713;
        this.Field16352 = new AtomicBoolean(false);
    }

    public void Method6842() {
        Class1796.Field16242.Method715(new Class279("Event Processor"));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6843(EntityJoinWorldEvent entityJoinWorldEvent) {
        if (Class1796.Field16241.Field16279 == null) return;
        Class1796.Field16241.Field16279.Method7783(entityJoinWorldEvent);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6844(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        if (Class1416.Field14544.Field14446.Method365()) {
            this.Method6845();
        }
        Class1416.Field14544.Field14560.Method1204(null);
        Class1796.Field16241.Field16284.Method3997().Method7717();
    }

    private void Method6845() {
        Class1416.Field14544.Method21(false);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6846(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        if (!Class1416.Field14544.Field14446.Method365()) return;
        this.Method6845();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6847(TickEvent.ClientTickEvent clientTickEvent) {
        Class1796.Field16241.Field16283.Method6535("tick");
        Class1796.Field16242.Method715(new Class1100());
        if (this.Field16353 == this.Field16351.displayWidth) {
            if (this.Field16354 == this.Field16351.displayHeight) return;
        }
        this.Field16353 = this.Field16351.displayWidth;
        this.Field16354 = this.Field16351.displayHeight;
        new Class212(this.Field16353, this.Field16354).Method167();
    }

    @SubscribeEvent(priority=EventPriority.HIGHEST)
    @SubscribeEvent(priority=EventPriority.HIGHEST)
    public void Method6848(ClientChatEvent clientChatEvent) {
        if (!clientChatEvent.getMessage().startsWith(Class1796.Field16241.Field16272.Field17386)) return;
        Class1796.Field16241.Field16272.Method7566(clientChatEvent.getMessage().substring(0));
        clientChatEvent.setCanceled(true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6849(RenderGameOverlayEvent.Text text) {
        Class1796.Field16241.Field16283.Method6535("hud");
        Class1796.Field16242.Method715(new Class112(text.getPartialTicks()));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6850(RenderWorldLastEvent renderWorldLastEvent) {
        Class1796.Field16242.Method715(new Class1345(renderWorldLastEvent.getPartialTicks()));
    }

    @SubscribeEvent(priority=EventPriority.HIGH)
    @SubscribeEvent(priority=EventPriority.HIGH)
    public void Method6851(ClientChatEvent clientChatEvent) {
        Class2085 class2085 = new Class2085(clientChatEvent.getMessage());
        Class1796.Field16242.Method715(class2085);
        if (!class2085.cancelled) return;
        clientChatEvent.setMessage(class2085.Field17522);
    }

    private void Method6852(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketEntityStatus)) return;
        if (((SPacketEntityStatus)class544.Method982()).getOpCode() != 35) return;
        Class1102 class1102 = new Class1102(((SPacketEntityStatus)class544.Method982()).getEntity((World)this.Field16351.world));
        MinecraftForge.EVENT_BUS.post((Event)class1102);
        if (!class1102.isCanceled()) return;
        class544.Method158();
    }

    private void Method6853(Class544 class544) {
        if (class544.Method982() instanceof SPacketRespawn && Class1416.Field14544.Field14446.Method365()) {
            this.Method6845();
        }
        if (!(class544.Method982() instanceof SPacketChat)) return;
        if (!null.Field11810.Method365()) return;
        SPacketChat sPacketChat = (SPacketChat)class544.Method982();
        String string = sPacketChat.chatComponent.getUnformattedText();
        if (!string.contains("+")) return;
        String string2 = string.substring(string.indexOf("+"));
        String[] stringArray = string2.split(" ");
        if (stringArray[0] == null) return;
        if (stringArray[1] == null) return;
        Class42 class42 = Class1796.Field16241.Field16254.Method1162(stringArray[1]);
        if (class42 == null) {
            return;
        }
        if (stringArray[0].equalsIgnoreCase("disable") || stringArray[0].equalsIgnoreCase("+disable")) {
            class42.Method21(false);
            return;
        }
        if (stringArray[0].equalsIgnoreCase("enable") || stringArray[0].equalsIgnoreCase("+enable")) {
            class42.Method21(true);
            return;
        }
        if (stringArray[0].equalsIgnoreCase("block") || stringArray[0].equalsIgnoreCase("+block")) {
            class42.Field8066 = true;
            return;
        }
        if (!stringArray[0].equalsIgnoreCase("unblock")) {
            if (!stringArray[0].equalsIgnoreCase("+unlock")) return;
        }
        class42.Field8066 = true;
    }

    private static String Method6854(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 141;
            cArray2[n] = (char)(cArray[n] ^ (0x56D8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

