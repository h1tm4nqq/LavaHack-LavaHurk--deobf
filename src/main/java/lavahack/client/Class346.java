//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;

public class Class346
{
    public static final int Field9436;
    private String Field9437 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static int Method1718(final IInventory inventory, final Item item) {
        return Method1719(inventory, item, -1);
    }
    
    public static int Method1719(final IInventory inventory, final Item item, final int n) {
        final int getSizeInventory = inventory.getSizeInventory();
        int n2 = 0;
        for (int i = 0; i < getSizeInventory; ++i) {
            final ItemStack getStackInSlot = inventory.getStackInSlot(i);
            if (getStackInSlot.getItem() == item && (n == -1 || n == getStackInSlot.getItemDamage())) {
                n2 += getStackInSlot.getCount();
            }
        }
        return n2;
    }
    
    public static Class1835 Method1720(final Entity entity) {
        return new Class1835((float)entity.posX, (float)entity.posY, (float)entity.posZ);
    }
    
    public static Class1835 Method1721(final Entity entity, final Class1835 class1835) {
        return class1835.Method6910((float)entity.posX, (float)entity.posY, (float)entity.posZ);
    }
    
    public static Class155 Method1722(final Entity entity) {
        return new Class155((int)Math.floor(entity.posX), (int)Math.floor(entity.posY), (int)Math.floor(entity.posZ));
    }
    
    public static Class155 Method1723(final Entity entity, final Class155 class155) {
        return class155.Method1032((int)Math.floor(entity.posX), (int)Math.floor(entity.posY), (int)Math.floor(entity.posZ));
    }
    
    static {
        Field9436 = -1;
    }
}
