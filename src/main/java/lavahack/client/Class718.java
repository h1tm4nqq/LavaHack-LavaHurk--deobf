/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.inventory.GuiEditSign
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class415;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class718 {
    public static final Class718 Field11072 = new Class718();
    private String Field11073 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SubscribeEvent
    @SubscribeEvent
    public void Method3008(GuiOpenEvent guiOpenEvent) {
        if (!Class415.Field9718.Method2012()) return;
        if (!(guiOpenEvent.getGui() instanceof GuiEditSign)) return;
        guiOpenEvent.setGui(null);
    }
}

