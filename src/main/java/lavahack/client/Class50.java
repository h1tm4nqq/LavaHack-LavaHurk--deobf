/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.tileentity.TileEntity
 */
package lavahack.client;

import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;

public class Class50
extends Exception {
    private int Field8145;

    public Class50(String string, Throwable throwable) {
        super(string, throwable);
    }

    public Class50(TileEntity tileEntity, Throwable throwable) {
        super(String.valueOf(tileEntity), throwable);
    }

    public Class50(Entity entity, Throwable throwable) {
        super(String.valueOf(entity), throwable);
    }
}

