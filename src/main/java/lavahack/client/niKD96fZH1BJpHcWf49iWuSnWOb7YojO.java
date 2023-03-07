/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
public abstract class niKD96fZH1BJpHcWf49iWuSnWOb7YojO
extends GuiButton {
    private String Field16314 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public niKD96fZH1BJpHcWf49iWuSnWOb7YojO(int n, int n2, int n3, int n4, int n5, String string) {
        super(n, n2, n3, n4, n5, string);
    }

    public abstract void onClick(GuiScreen var1);
}

