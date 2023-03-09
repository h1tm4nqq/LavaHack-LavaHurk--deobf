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

import lavahack.client.Class155;
import lavahack.client.Class1835;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Class346 {
    public static final int Field9436 = -1;
    private String Field9437 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static int Method1718(IInventory iInventory, Item item) {
        return Class346.Method1719(iInventory, item, -1);
    }

    public static int Method1719(IInventory iInventory, Item item, int n) {
        int n2 = iInventory.getSizeInventory();
        int n3 = 0;
        int n4 = 0;
        while (n4 < n2) {
            ItemStack itemStack = iInventory.getStackInSlot(n4);
            if (itemStack.getItem() == item && (n == -1 || n == itemStack.getItemDamage())) {
                n3 += itemStack.getCount();
            }
            ++n4;
        }
        return n3;
    }

    public static Class1835 Method1720(Entity entity) {
        return new Class1835((float)entity.posX, (float)entity.posY, (float)entity.posZ);
    }

    public static Class1835 Method1721(Entity entity, Class1835 class1835) {
        return class1835.Method6910((float)entity.posX, (float)entity.posY, (float)entity.posZ);
    }

    public static Class155 Method1722(Entity entity) {
        return new Class155((int)Math.floor(entity.posX), (int)Math.floor(entity.posY), (int)Math.floor(entity.posZ));
    }

    public static Class155 Method1723(Entity entity, Class155 class155) {
        return class155.Method1032((int)Math.floor(entity.posX), (int)Math.floor(entity.posY), (int)Math.floor(entity.posZ));
    }
}

