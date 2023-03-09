//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package lavahack.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class880 {
    private final GuiScreen Field11707;
    private int Field11708;
    private int Field11709;

    private Class880(GuiScreen guiScreen, int n) {
        this.Field11707 = guiScreen;
        this.Field11708 = n;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3678(TickEvent.ClientTickEvent clientTickEvent) {
        --this.Field11708;
        if (this.Field11708 >= 0) return;
        Minecraft.getMinecraft().displayGuiScreen(this.Field11707);
        MinecraftForge.EVENT_BUS.unregister((Object)this);
    }

    public static void Method3679(GuiScreen guiScreen, int n) {
        MinecraftForge.EVENT_BUS.register((Object)new Class880(guiScreen, n));
    }
}

