//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.client.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class880
{
    private final GuiScreen Field11707;
    private int Field11708;
    private int Field11709;
    
    private Class880(final GuiScreen field11707, final int field11708) {
        this.Field11707 = field11707;
        this.Field11708 = field11708;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3678(final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        --this.Field11708;
        if (this.Field11708 < 0) {
            Minecraft.getMinecraft().displayGuiScreen(this.Field11707);
            MinecraftForge.EVENT_BUS.unregister((Object)this);
        }
    }
    
    public static void Method3679(final GuiScreen guiScreen, final int n) {
        MinecraftForge.EVENT_BUS.register((Object)new Class880(guiScreen, n));
    }
}
