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
import lavahack.client.XlIoyHWISSQSA2pEIWKhU8KEi0CVSpD8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class XlIoyHWISSQSA2pEIWKhU8KEi0CVSpD8
implements IModGuiFactory {
    private int Field8233;

    public void initialize(Minecraft minecraft) {
    }

    public boolean hasConfigGui() {
        return ((int)-2087064367L ^ 0x8399ECD0) != 0;
    }

    public GuiScreen createConfigGui(GuiScreen guiScreen) {
        return new XlIoyHWISSQSA2pEIWKhU8KEi0CVSpD8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(guiScreen);
    }

    public Set runtimeGuiCategories() {
        return null;
    }
}

