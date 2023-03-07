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

import com.kisman.cc.util.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import lavahack.client.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.PDe8wUioaRupOBTjFWgfiViCqtqJbEVR;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.lDgX8dul2aWNBQmCTcuuerubKmsg9XQq;
import lavahack.client.tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ;
import lavahack.client.wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV;
import lavahack.client.zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6;
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

public class leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private final Minecraft Field16351 = Minecraft.getMinecraft();
    public AtomicBoolean Field16352;
    public int Field16353 = (int)-1893507799L ^ 0x70DCA2D6;
    public int Field16354 = (int)((long)1451334231 ^ (long)-1451334232);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16355 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6853, new Predicate[(int)-1361211771L ^ 0xAEDD8E85]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16356 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6852, new Predicate[(int)((long)156282636 ^ (long)156282636)]);
    private String Field16357 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16356);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro.Field10562.Field10566);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16355);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16286.Field11713 += (int)86687459L ^ 0x52ABEE2;
        this.Field16352 = new AtomicBoolean((boolean)((long)1331497938 ^ (long)1331497938));
    }

    public void Method6842() {
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ("Event Processor"));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6843(EntityJoinWorldEvent entityJoinWorldEvent) {
        if (lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16279 == null) return;
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16279.Method7783(entityJoinWorldEvent);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6844(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14446.Method365()) {
            this.Method6845();
        }
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14560.Method1204(null);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16284.Method3997().Method7717();
    }

    private void Method6845() {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Method21((boolean)((long)-310510447 ^ (long)-310510447));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6846(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        if (!b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14446.Method365()) return;
        this.Method6845();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6847(TickEvent.ClientTickEvent clientTickEvent) {
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Method6535("tick");
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao());
        if (this.Field16353 != this.Field16351.displayWidth || this.Field16354 != this.Field16351.displayHeight) {
            this.Field16353 = this.Field16351.displayWidth;
            this.Field16354 = this.Field16351.displayHeight;
            new PDe8wUioaRupOBTjFWgfiViCqtqJbEVR(this.Field16353, this.Field16354).Method167();
        }
        if (null == null) return;
    }

    @SubscribeEvent(priority=EventPriority.HIGHEST)
    @SubscribeEvent(priority=EventPriority.HIGHEST)
    public void Method6848(ClientChatEvent clientChatEvent) {
        if (!clientChatEvent.getMessage().startsWith(lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16272.Field17386)) return;
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16272.Method7566(clientChatEvent.getMessage().substring((int)((long)6667057 ^ (long)6667057)));
        clientChatEvent.setCanceled(((int)282268374L ^ 0x10D312D7) != 0);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6849(RenderGameOverlayEvent.Text text) {
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Method6535("hud");
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6(text.getPartialTicks()));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6850(RenderWorldLastEvent renderWorldLastEvent) {
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV(renderWorldLastEvent.getPartialTicks()));
    }

    @SubscribeEvent(priority=EventPriority.HIGH)
    @SubscribeEvent(priority=EventPriority.HIGH)
    public void Method6851(ClientChatEvent clientChatEvent) {
        lDgX8dul2aWNBQmCTcuuerubKmsg9XQq lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2 = new lDgX8dul2aWNBQmCTcuuerubKmsg9XQq(clientChatEvent.getMessage());
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2);
        if (!lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.cancelled) return;
        clientChatEvent.setMessage(lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.Field17522);
    }

    private void Method6852(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketEntityStatus)) return;
        if (((SPacketEntityStatus)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getOpCode() != (int)((long)-1444893890 ^ (long)-1444893923)) return;
        BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh brWsHdiLAwYGSB35z3ypQAx8eRulUOBh = new BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh(((SPacketEntityStatus)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getEntity((World)this.Field16351.world));
        MinecraftForge.EVENT_BUS.post((Event)brWsHdiLAwYGSB35z3ypQAx8eRulUOBh);
        if (!brWsHdiLAwYGSB35z3ypQAx8eRulUOBh.isCanceled()) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
    }

    private void Method6853(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketRespawn && b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14446.Method365()) {
            this.Method6845();
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketChat)) return;
        if (!null.Field11810.Method365()) return;
        SPacketChat sPacketChat = (SPacketChat)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        String string = sPacketChat.chatComponent.getUnformattedText();
        if (!string.contains("+")) return;
        String string2 = string.substring(string.indexOf("+"));
        String[] stringArray = string2.split(" ");
        if (stringArray[(int)((long)310820348 ^ (long)310820348)] == null) return;
        if (stringArray[(int)((long)1667676351 ^ (long)1667676350)] == null) return;
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162(stringArray[(int)1077347099L ^ 0x4037031A]);
        if (wjjBVRrUqJUKhloA7ANknrTEODhuGa0J == null) {
            return;
        }
        if (stringArray[(int)((long)1743998494 ^ (long)1743998494)].equalsIgnoreCase("disable") || stringArray[(int)581988006L ^ 0x22B06EA6].equalsIgnoreCase("+disable")) {
            wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method21(((int)124634880L ^ 0x76DC700) != 0);
            return;
        }
        if (stringArray[(int)2144246289L ^ 0x7FCE9A11].equalsIgnoreCase("enable") || stringArray[(int)((long)-1614761510 ^ (long)-1614761510)].equalsIgnoreCase("+enable")) {
            wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method21((boolean)((long)1447407169 ^ (long)1447407168));
            return;
        }
        if (stringArray[(int)((long)-1185786756 ^ (long)-1185786756)].equalsIgnoreCase("block") || stringArray[(int)((long)-463798227 ^ (long)-463798227)].equalsIgnoreCase("+block")) {
            wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8066 = (int)1662349505L ^ 0x631570C0;
            return;
        }
        if (!stringArray[(int)((long)100436619 ^ (long)100436619)].equalsIgnoreCase("unblock")) {
            if (!stringArray[(int)((long)-375689520 ^ (long)-375689520)].equalsIgnoreCase("+unlock")) return;
        }
        wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8066 = (int)1791772443L ^ 0x6ACC471A;
    }

    private static String Method6854(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-233803108L ^ 0xF210729C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1977408229 ^ (long)-1977408028);
            int n2 = (int)((long)1352530548 ^ (long)1352530681);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-407989065 ^ (long)-407986580) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

