/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 */
package lavahack.client;

import lavahack.client.Class9;
import net.minecraft.item.Item;

public class Class94 {
    public final int Field8325;
    public int Field8326 = -1;
    public Item Field8327;
    private int Field8328;

    public Class94(int n, Item item) {
        this.Field8325 = n;
        this.Field8327 = item;
    }

    public void Method801() {
        if (this.Field8327 == null) return;
        this.Field8326 = Class9.Method104(this.Field8327);
    }
}

