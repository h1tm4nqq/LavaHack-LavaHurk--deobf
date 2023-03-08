//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class718
{
    public static final Class718 Field11072;
    private String Field11073 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3008(final GuiOpenEvent guiOpenEvent) {
        if (Class415.Field9718.Method2012() && guiOpenEvent.getGui() instanceof GuiEditSign) {
            guiOpenEvent.setGui((GuiScreen)null);
        }
    }
    
    static {
        Field11072 = new Class718();
    }
}
