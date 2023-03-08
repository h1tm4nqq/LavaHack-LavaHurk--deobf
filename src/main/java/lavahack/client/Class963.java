//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import java.awt.datatransfer.*;

public class Class963 implements Transferable
{
    private final Image Field12110;
    private int Field12111;
    
    public Class963(final Image field12110) {
        this.Field12110 = field12110;
    }
    
    @Override
    public Object getTransferData(final DataFlavor flavor) throws UnsupportedFlavorException {
        if (this.isDataFlavorSupported(flavor)) {
            return this.Field12110;
        }
        throw new UnsupportedFlavorException(flavor);
    }
    
    @Override
    public boolean isDataFlavorSupported(final DataFlavor dataFlavor) {
        return dataFlavor == DataFlavor.imageFlavor;
    }
    
    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[] { DataFlavor.imageFlavor };
    }
}
