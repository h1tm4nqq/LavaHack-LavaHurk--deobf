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
import lavahack.client.KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT;
import lavahack.client.RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6;
import lavahack.client.d8NUi994osLCmt6QS9gn2nL3bytx8gy3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiListExtended;

class KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends GuiListExtended {
    private final List Field13934 = new ArrayList();
    private int Field13935 = (int)((long)-92037379 ^ (long)92037378);
    private String Field13936 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT kcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT, Minecraft minecraft, int n, int n2, int n3, int n4, int n5) {
        super(minecraft, n, n2, n3, n4, n5);
        this.Field13934.clear();
        d8NUi994osLCmt6QS9gn2nL3bytx8gy3.Method7475().forEach(this::lambda$new$0);
    }

    public RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6 getListEntry(int n) {
        return (RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6)this.Field13934.get(n);
    }

    public int getListWidth() {
        return super.getListWidth() + ((int)((long)2027809110 ^ (long)2027809103) << 1);
    }

    protected void elementClicked(int n, boolean bl, int n2, int n3) {
        this.selectElement(n);
    }

    protected int getSize() {
        return this.Field13934.size();
    }

    protected int getScrollBarX() {
        return super.getScrollBarX() + ((int)((long)1977772592 ^ (long)1977772597) << 2);
    }

    protected boolean isSelected(int n) {
        boolean bl;
        if (this.Field13935 == n) {
            bl = (int)1995833778L ^ 0x76F601B3;
            return bl;
        }
        bl = (int)1052148195L ^ 0x3EB681E3;
        return bl;
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
        this.showSelectionBox = (int)-1580420085L ^ 0xA1CCB40A;
        this.selectedElement = n;
    }

    public GuiListExtended.IGuiListEntry getListEntry(int n) {
        return this.getListEntry(n);
    }

    private Boolean lambda$getVisibility$1() {
        int n;
        if (this.Field13935 > (int)((long)1757375187 ^ (long)-1757375188)) {
            n = (int)((long)-713969326 ^ (long)-713969325);
            return n != 0;
        }
        n = (int)-1753901849L ^ 0x977594E7;
        return n != 0;
    }

    private void lambda$new$0(RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6 rJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6) {
        this.Field13934.add(rJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6);
    }
}

