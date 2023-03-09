/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.fml.client.IModGuiFactory
 */
package lavahack.client;

import java.util.Set;
import lavahack.client.Class1619;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class Class68
implements IModGuiFactory {
    private int Field8233;

    public void initialize(Minecraft minecraft) {
    }

    public boolean hasConfigGui() {
        return true;
    }

    public GuiScreen createConfigGui(GuiScreen guiScreen) {
        return new Class1619(guiScreen);
    }

    public Set runtimeGuiCategories() {
        return null;
    }
}

