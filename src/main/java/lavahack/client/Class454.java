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
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketCloseWindow;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

public class Class454
extends Class42 {
    private GuiContainer Field9893;
    @Class1801
    private final Class618 Field9894 = new Class618(this::Method2159, new Predicate[0]);
    private int Field9895;

    public Class454() {
        super("SilentClose", "SilentClose", Class97.Field8344);
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field9894);
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field9894);
        if (this.Field9893 == null) return;
        Class454.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketCloseWindow(this.Field9893.inventorySlots.windowId));
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

    private void Method2159(Class544 class544) {
        Class1393.Method5503().Method1886("Container closed by server");
        this.Field9893 = null;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 217;
            cArray2[n] = (char)(cArray[n] ^ (0x53D4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

