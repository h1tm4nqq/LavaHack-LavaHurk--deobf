//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.event;

import net.minecraft.client.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import net.minecraftforge.common.*;
import com.kisman.cc.util.*;
import net.minecraftforge.event.entity.*;
import net.minecraft.util.math.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraftforge.client.event.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.server.*;
import lavahack.client.*;

public class Class1817
{
    private final Minecraft Field16351;
    public AtomicBoolean Field16352;
    public int Field16353;
    public int Field16354;
    @Class1801
    private final Class618 Field16355;
    @Class1801
    private final Class618 Field16356;
    private String Field16357 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1817() {
        this.Field16351 = Minecraft.getMinecraft();
        this.Field16353 = -1;
        this.Field16354 = -1;
        this.Field16355 = new Class618(this::Method6853, new Predicate[0]);
        this.Field16356 = new Class618(this::Method6852, new Predicate[0]);
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method706(this.Field16356);
        Class1796.Field16242.Method706(Class602.Field10562.Field10566);
        Class1796.Field16242.Method706(this.Field16355);
        final Class884 field16286 = Class1796.Field16241.Field16286;
        ++field16286.Field11713;
        this.Field16352 = new AtomicBoolean(false);
    }
    
    public void Method6842() {
        Class1796.Field16242.Method715((Object)new Class279("Event Processor"));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6843(final EntityJoinWorldEvent entityJoinWorldEvent) {
        if (Class1796.Field16241.Field16279 != null) {
            Class1796.Field16241.Field16279.Method7783(entityJoinWorldEvent);
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6844(final FMLNetworkEvent$ClientDisconnectionFromServerEvent fmlNetworkEvent$ClientDisconnectionFromServerEvent) {
        if (Class1416.Field14544.Field14446.Method365()) {
            this.Method6845();
        }
        Class1416.Field14544.Field14560.Method1204((BlockPos)null);
        Class1796.Field16241.Field16284.Method3997().Method7717();
    }
    
    private void Method6845() {
        Class1416.Field14544.Method21(false);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6846(final FMLNetworkEvent$ClientConnectedToServerEvent fmlNetworkEvent$ClientConnectedToServerEvent) {
        if (Class1416.Field14544.Field14446.Method365()) {
            this.Method6845();
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6847(final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        Class1796.Field16241.Field16283.Method6535("tick");
        Class1796.Field16242.Method715((Object)new Class1100());
        if (this.Field16353 != this.Field16351.displayWidth || this.Field16354 != this.Field16351.displayHeight) {
            this.Field16353 = this.Field16351.displayWidth;
            this.Field16354 = this.Field16351.displayHeight;
            new Class212(this.Field16353, this.Field16354).Method167();
        }
    }
    
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void Method6848(final ClientChatEvent clientChatEvent) {
        if (clientChatEvent.getMessage().startsWith(Class1796.Field16241.Field16272.Field17386)) {
            Class1796.Field16241.Field16272.Method7566(clientChatEvent.getMessage().substring(0));
            clientChatEvent.setCanceled(true);
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6849(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Class1796.Field16241.Field16283.Method6535("hud");
        Class1796.Field16242.Method715((Object)new Class112(renderGameOverlayEvent$Text.getPartialTicks()));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6850(final RenderWorldLastEvent renderWorldLastEvent) {
        Class1796.Field16242.Method715((Object)new Class1345(renderWorldLastEvent.getPartialTicks()));
    }
    
    @SubscribeEvent(priority = EventPriority.HIGH)
    @SubscribeEvent(priority = EventPriority.HIGH)
    public void Method6851(final ClientChatEvent clientChatEvent) {
        final Class2085 class2085 = new Class2085(clientChatEvent.getMessage());
        Class1796.Field16242.Method715((Object)class2085);
        if (class2085.cancelled) {
            clientChatEvent.setMessage(class2085.Field17522);
        }
    }
    
    private void Method6852(final Class544 class544) {
        if (class544.Method982() instanceof SPacketEntityStatus && ((SPacketEntityStatus)class544.Method982()).getOpCode() == 35) {
            final Class1102 class545 = new Class1102(((SPacketEntityStatus)class544.Method982()).getEntity((World)this.Field16351.world));
            MinecraftForge.EVENT_BUS.post((Event)class545);
            if (class545.isCanceled()) {
                class544.Method158();
            }
        }
    }
    
    private void Method6853(final Class544 class544) {
        if (class544.Method982() instanceof SPacketRespawn && Class1416.Field14544.Field14446.Method365()) {
            this.Method6845();
        }
        if (class544.Method982() instanceof SPacketChat && null.Field11810.Method365()) {
            final String getUnformattedText = ((SPacketChat)class544.Method982()).chatComponent.getUnformattedText();
            if (getUnformattedText.contains("+")) {
                final String[] split = getUnformattedText.substring(getUnformattedText.indexOf("+")).split(" ");
                if (split[0] != null && split[1] != null) {
                    final Class42 method1162 = Class1796.Field16241.Field16254.Method1162(split[1]);
                    if (method1162 == null) {
                        return;
                    }
                    if (split[0].equalsIgnoreCase("disable") || split[0].equalsIgnoreCase("+disable")) {
                        method1162.Method21(false);
                    }
                    else if (split[0].equalsIgnoreCase("enable") || split[0].equalsIgnoreCase("+enable")) {
                        method1162.Method21(true);
                    }
                    else if (split[0].equalsIgnoreCase("block") || split[0].equalsIgnoreCase("+block")) {
                        method1162.Field8066 = true;
                    }
                    else if (split[0].equalsIgnoreCase("unblock") || split[0].equalsIgnoreCase("+unlock")) {
                        method1162.Field8066 = true;
                    }
                }
            }
        }
    }
    
    private static String Method6854(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x56D8 ^ 0x8D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
