//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import lavahack.client.mfMV2c4rVa7u4GL8lHnT3me6PuDQR04X;
import lavahack.client.xDcocRY9ZnZXaPQ8zU20qL5jXWb6vgwF;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class x4nUIRAJlZw1QLw3fZFmPOQ7t5iN2Gwb {
    public static final int Field9436 = (int)((long)-974289593 ^ (long)974289592);
    private String Field9437 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static int Method1718(IInventory iInventory, Item item) {
        return x4nUIRAJlZw1QLw3fZFmPOQ7t5iN2Gwb.Method1719(iInventory, item, (int)-970749842L ^ 0x39DC7791);
    }

    public static int Method1719(IInventory iInventory, Item item, int n) {
        int n2 = iInventory.getSizeInventory();
        int n3 = (int)516266788L ^ 0x1EC59B24;
        int n4 = (int)1869617961L ^ 0x6F701B29;
        while (n4 < n2) {
            ItemStack itemStack = iInventory.getStackInSlot(n4);
            if (itemStack.getItem() == item && (n == (int)((long)916567775 ^ (long)-916567776) || n == itemStack.getItemDamage())) {
                n3 += itemStack.getCount();
            }
            ++n4;
        }
        return n3;
    }

    public static mfMV2c4rVa7u4GL8lHnT3me6PuDQR04X Method1720(Entity entity) {
        return new mfMV2c4rVa7u4GL8lHnT3me6PuDQR04X((float)entity.posX, (float)entity.posY, (float)entity.posZ);
    }

    public static mfMV2c4rVa7u4GL8lHnT3me6PuDQR04X Method1721(Entity entity, mfMV2c4rVa7u4GL8lHnT3me6PuDQR04X mfMV2c4rVa7u4GL8lHnT3me6PuDQR04X2) {
        return mfMV2c4rVa7u4GL8lHnT3me6PuDQR04X2.Method6910((float)entity.posX, (float)entity.posY, (float)entity.posZ);
    }

    public static xDcocRY9ZnZXaPQ8zU20qL5jXWb6vgwF Method1722(Entity entity) {
        return new xDcocRY9ZnZXaPQ8zU20qL5jXWb6vgwF((int)Math.floor(entity.posX), (int)Math.floor(entity.posY), (int)Math.floor(entity.posZ));
    }

    public static xDcocRY9ZnZXaPQ8zU20qL5jXWb6vgwF Method1723(Entity entity, xDcocRY9ZnZXaPQ8zU20qL5jXWb6vgwF xDcocRY9ZnZXaPQ8zU20qL5jXWb6vgwF2) {
        return xDcocRY9ZnZXaPQ8zU20qL5jXWb6vgwF2.Method1032((int)Math.floor(entity.posX), (int)Math.floor(entity.posY), (int)Math.floor(entity.posZ));
    }
}

