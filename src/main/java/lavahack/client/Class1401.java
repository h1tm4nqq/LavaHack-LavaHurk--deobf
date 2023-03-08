//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.renderer.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.init.*;

public class Class1401 extends Class42
{
    private final Class44 Field14343;
    private final Class44 Field14344;
    public static Class1401 Field14345;
    private final Class650 Field14346;
    private String Field14347 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1401() {
        super("AutoArmor", "ebate srate lox!", Class97.Field8338);
        this.Field14343 = this.Method23(new Class44("Delay", this, 0.0, 0.0, Double.longBitsToDouble((long)625582293 ^ 0x405900002549A0D5L), Class467.Field9943));
        this.Field14344 = this.Method23(new Class44("No Thorns", this, true));
        this.Field14346 = new Class650();
        Class1401.Field14345 = this;
    }
    
    @Override
    public void Method38() {
        this.Field14346.Method2801();
    }
    
    @Override
    public void Method45() {
        if (Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        super.Method43("[" + this.Field14343.Method335() + "]");
        if (!this.Field14346.Method2797(this.Field14343.Method369())) {
            return;
        }
        this.Field14346.Method2801();
        if (Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 == 0) {
            return;
        }
        if (Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiContainer && !(Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof InventoryEffectRenderer)) {
            return;
        }
        final NonNullList armorInventory = Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorInventory;
        final NonNullList mainInventory = Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.mainInventory;
        final int[] array = { -1, -1, -1, -1 };
        final int[] array2 = { -1, -1, -1, -1 };
        int n = 0;
        while (true) {
            final ItemStack itemStack = ((List<ItemStack>)armorInventory).get(n);
            if (itemStack.getItem() instanceof ItemArmor) {
                array2[n] = ((ItemArmor)itemStack.getItem()).damageReduceAmount;
            }
            ++n;
        }
    }
    
    private static void Method5532(final List list, final int[] array, final int[] array2, final Integer n, final ItemStack itemStack) {
        final ItemArmor itemArmor = (ItemArmor)itemStack.getItem();
        final int n2 = itemArmor.armorType.ordinal() - 2;
        if (list.get(n2) != ItemStack.EMPTY || array[n2] != -1) {
            return;
        }
        if (n2 == 2 && Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorItemInSlot(n2).getItem().equals(Items.ELYTRA)) {
            return;
        }
        final int damageReduceAmount = itemArmor.damageReduceAmount;
        if (damageReduceAmount > array2[n2]) {
            array[n2] = n;
            array2[n2] = damageReduceAmount;
        }
    }
    
    private static void Method5533(final int[] array, final int[] array2, final Integer n, final ItemStack itemStack) {
        final ItemArmor itemArmor = (ItemArmor)itemStack.getItem();
        final int n2 = itemArmor.armorType.ordinal() - 2;
        if (n2 == 2 && Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorItemInSlot(n2).getItem().equals(Items.ELYTRA)) {
            return;
        }
        final int damageReduceAmount = itemArmor.damageReduceAmount;
        if (damageReduceAmount > array[n2]) {
            array2[n2] = n;
            array[n2] = damageReduceAmount;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3233 ^ 0x14));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
