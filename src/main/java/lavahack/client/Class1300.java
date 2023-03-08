//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.client.gui.*;

class Class1300 extends GuiListExtended
{
    private final List Field13934;
    private int Field13935;
    private String Field13936 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1300(final Class1774 class1774, final Minecraft minecraft, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(minecraft, n, n2, n3, n4, n5);
        this.Field13934 = new ArrayList();
        this.Field13935 = -1;
        this.Field13934.clear();
        Class2018.Method7475().forEach(this::lambda$new$0);
    }
    
    public Class1977 getListEntry(final int n) {
        return this.Field13934.get(n);
    }
    
    public int getListWidth() {
        return super.getListWidth() + 50;
    }
    
    protected void elementClicked(final int n, final boolean b, final int n2, final int n3) {
        this.selectElement(n);
    }
    
    protected int getSize() {
        return this.Field13934.size();
    }
    
    protected int getScrollBarX() {
        return super.getScrollBarX() + 20;
    }
    
    protected boolean isSelected(final int n) {
        return this.Field13935 == n;
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
    
    private void selectElement(final int n) {
        this.Field13935 = n;
        this.showSelectionBox = true;
        this.selectedElement = n;
    }
    
    public GuiListExtended$IGuiListEntry getListEntry(final int n) {
        return (GuiListExtended$IGuiListEntry)this.getListEntry(n);
    }
    
    private Boolean lambda$getVisibility$1() {
        return this.Field13935 > -1;
    }
    
    private void lambda$new$0(final Class1977 class1977) {
        this.Field13934.add(class1977);
    }
}
