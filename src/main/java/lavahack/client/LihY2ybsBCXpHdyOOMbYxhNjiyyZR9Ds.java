//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.renderer.InventoryEffectRenderer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketCloseWindow
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
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
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketCloseWindow;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class LihY2ybsBCXpHdyOOMbYxhNjiyyZR9Ds
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private GuiContainer Field9893;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9894 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2159, new Predicate[(int)((long)-2097857139 ^ (long)-2097857139)]);
    private int Field9895;

    public LihY2ybsBCXpHdyOOMbYxhNjiyyZR9Ds() {
        super("SilentClose", "SilentClose", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field9894);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field9894);
        if (this.Field9893 == null) return;
        LihY2ybsBCXpHdyOOMbYxhNjiyyZR9Ds.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketCloseWindow(this.Field9893.inventorySlots.windowId));
        this.Field9893 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2157(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        this.Field9893 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2158(GuiOpenEvent guiOpenEvent) {
        GuiScreen guiScreen = guiOpenEvent.getGui();
        if (guiScreen instanceof InventoryEffectRenderer) {
            if (this.Field9893 == null) return;
            guiOpenEvent.setGui((GuiScreen)this.Field9893);
            return;
        }
        if (!(guiScreen instanceof GuiContainer)) return;
        this.Field9893 = (GuiContainer)guiScreen;
    }

    private void Method2159(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1886("Container closed by server");
        this.Field9893 = null;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-873035311L ^ 0xCBF689D1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1742511706L ^ 0x67DC9EA5);
            int n2 = (int)1914180266L ^ 0x72181273;
            cArray2[n] = (char)(cArray[n] ^ (((int)-972302620L ^ 0xC60BC211) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

