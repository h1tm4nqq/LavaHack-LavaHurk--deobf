//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiListExtended
 *  net.minecraft.client.gui.GuiListExtended$IGuiListEntry
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import lavahack.client.Class1774;
import lavahack.client.Class1977;
import lavahack.client.Class2018;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiListExtended;

class Class1300
extends GuiListExtended {
    private final List Field13934 = new ArrayList();
    private int Field13935 = -1;
    private String Field13936 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1300(Class1774 class1774, Minecraft minecraft, int n, int n2, int n3, int n4, int n5) {
        super(minecraft, n, n2, n3, n4, n5);
        this.Field13934.clear();
        Class2018.Method7475().forEach(this::lambda$new$0);
    }

    public Class1977 getListEntry(int n) {
        return (Class1977)this.Field13934.get(n);
    }

    public int getListWidth() {
        return super.getListWidth() + 50;
    }

    protected void elementClicked(int n, boolean bl, int n2, int n3) {
        this.selectElement(n);
    }

    protected int getSize() {
        return this.Field13934.size();
    }

    protected int getScrollBarX() {
        return super.getScrollBarX() + 20;
    }

    protected boolean isSelected(int n) {
        if (this.Field13935 != n) return false;
        return true;
    }

    protected Supplier getVisibility() {
        return this::lambda$getVisibility$1;
    }

    protected List getAlts() {
        return this.Field13934;
    }

    protected int getSelectedId() {
        return this.Field13935;
    }

    private void selectElement(int n) {
        this.Field13935 = n;
        this.showSelectionBox = true;
        this.selectedElement = n;
    }

    public GuiListExtended.IGuiListEntry getListEntry(int n) {
        return this.getListEntry(n);
    }

    private Boolean lambda$getVisibility$1() {
        boolean bl;
        if (this.Field13935 > -1) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private void lambda$new$0(Class1977 class1977) {
        this.Field13934.add(class1977);
    }
}

