//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.inventory.*;
import java.util.function.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.gui.*;

public class Class454 extends Class42
{
    private GuiContainer Field9893;
    @Class1801
    private final Class618 Field9894;
    private int Field9895;
    
    public Class454() {
        super("SilentClose", "SilentClose", Class97.Field8344);
        this.Field9894 = new Class618(this::Method2159, new Predicate[0]);
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field9894);
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field9894);
        if (this.Field9893 != null) {
            Class454.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketCloseWindow(this.Field9893.inventorySlots.windowId));
            this.Field9893 = null;
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2157(final FMLNetworkEvent$ClientDisconnectionFromServerEvent fmlNetworkEvent$ClientDisconnectionFromServerEvent) {
        this.Field9893 = null;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2158(final GuiOpenEvent guiOpenEvent) {
        final GuiScreen gui = guiOpenEvent.getGui();
        if (gui instanceof InventoryEffectRenderer) {
            if (this.Field9893 != null) {
                guiOpenEvent.setGui((GuiScreen)this.Field9893);
            }
        }
        else if (gui instanceof GuiContainer) {
            this.Field9893 = (GuiContainer)gui;
        }
    }
    
    private void Method2159(final Class544 class544) {
        Class1393.Method5503().Method1886("Container closed by server");
        this.Field9893 = null;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x53D4 ^ 0xD9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
