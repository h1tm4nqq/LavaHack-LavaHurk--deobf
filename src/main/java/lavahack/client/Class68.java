//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.client.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import java.util.*;

public class Class68 implements IModGuiFactory
{
    private int Field8233;
    
    public void initialize(final Minecraft minecraft) {
    }
    
    public boolean hasConfigGui() {
        return true;
    }
    
    public GuiScreen createConfigGui(final GuiScreen guiScreen) {
        return (GuiScreen)new Class1619(guiScreen);
    }
    
    public Set runtimeGuiCategories() {
        return null;
    }
}
