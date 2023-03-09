/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

public class Class963
implements Transferable {
    private final Image Field12110;
    private int Field12111;

    public Class963(Image image) {
        this.Field12110 = image;
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException {
        if (!this.isDataFlavorSupported(dataFlavor)) throw new UnsupportedFlavorException(dataFlavor);
        return this.Field12110;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        if (dataFlavor != DataFlavor.imageFlavor) return false;
        return true;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[]{DataFlavor.imageFlavor};
    }
}

