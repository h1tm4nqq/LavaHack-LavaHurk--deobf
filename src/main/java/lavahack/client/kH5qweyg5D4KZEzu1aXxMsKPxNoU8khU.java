/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

public class kH5qweyg5D4KZEzu1aXxMsKPxNoU8khU
implements Transferable {
    private final Image Field12110;
    private int Field12111;

    public kH5qweyg5D4KZEzu1aXxMsKPxNoU8khU(Image image) {
        this.Field12110 = image;
    }

    @Override
    public Object getTransferData(DataFlavor dataFlavor) throws UnsupportedFlavorException {
        if (!this.isDataFlavorSupported(dataFlavor)) throw new UnsupportedFlavorException(dataFlavor);
        return this.Field12110;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        int n;
        if (dataFlavor == DataFlavor.imageFlavor) {
            n = (int)((long)46935307 ^ (long)46935306);
            return n != 0;
        }
        n = (int)-242905723L ^ 0xF1858D85;
        return n != 0;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        DataFlavor[] dataFlavorArray = new DataFlavor[(int)1024933603L ^ 0x3D173EE2];
        dataFlavorArray[(int)-1741997671L ^ 0x982B3999] = DataFlavor.imageFlavor;
        return dataFlavorArray;
    }
}

