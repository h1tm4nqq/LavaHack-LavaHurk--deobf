//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;

@Class2012
public class Class747 extends Class42
{
    private final Class44 Field11169;
    private final Class44 Field11170;
    private final Class44 Field11171;
    private final Class44 Field11172;
    private final Class44 Field11173;
    private final Class44 Field11174;
    private final Class44 Field11175;
    private final Class44 Field11176;
    private final Class650 Field11177;
    private int Field11178;
    
    public Class747() {
        super("Replenish", Class97.Field8341);
        this.Field11169 = this.Method23(new Class44("Mode", (Class42)this, "Amount", (List)Arrays.asList("Amount", "Percent")));
        this.Field11170 = this.Method23(new Class44("Amount", (Class42)this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble(4634063279075885056L), true).Method313((Supplier)this::Method3093));
        this.Field11171 = this.Method23(new Class44("Percent", (Class42)this, Double.longBitsToDouble(4621819117588971520L), 0.0, Double.longBitsToDouble((long)1526848694 ^ 0x4058C0005B01DCB6L), true).Method313((Supplier)this::Method3092));
        this.Field11172 = this.Method23(new Class44("Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4641240890982006784L), true));
        this.Field11173 = this.Method23(new Class44("StackThreshold", (Class42)this, "Amount", (List)Arrays.asList("Amount", "Percent")));
        this.Field11174 = this.Method23(new Class44("Amount", (Class42)this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble(4634063279075885056L), true).Method313((Supplier)this::Method3091));
        this.Field11175 = this.Method23(new Class44("Percent", (Class42)this, Double.longBitsToDouble((long)1657356746 ^ 0x4024000062C941CAL), 0.0, Double.longBitsToDouble(4636666922610458624L), true).Method313((Supplier)this::Method3090));
        this.Field11176 = this.Method23(new Class44("Strict", (Class42)this, true));
        this.Field11177 = new Class650();
    }
    
    public void Method38() {
        this.Field11177.Method2801();
    }
    
    public void Method45() {
        if (Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null) {
            return;
        }
        final int method335 = this.Field11172.Method335();
        if (method335 > 0 && !this.Field11177.Method2797((long)method335)) {
            return;
        }
        this.Field11177.Method2801();
        final Map method336 = this.Method3088(this.Field11169.Method359().equals("Amount") ? this.Field11170.Method335() : ((int)(this.Field11171.Method335() * Double.longBitsToDouble(4603939827068310651L))), this.Field11173.Method359().equals("Amount") ? this.Field11174.Method335() : ((int)(this.Field11175.Method335() * Double.longBitsToDouble((long)1986846199 ^ 0x3FE47AE131C2C98CL))));
        int n = 1;
        while (true) {
            if (method336.get(n) != null) {
                this.Method3089(n, method336.get(n));
            }
            ++n;
        }
    }
    
    private Map Method3088(final int n, final int n2) {
        final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int i = 0;
        while (true) {
            final ItemStack getStackInSlot = Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(i);
            if (!getStackInSlot.isEmpty()) {
                if (getStackInSlot.getItem() != Items.AIR) {
                    int n3 = n;
                    if (this.Field11176.Method365()) {
                        n3 = ((n >= getStackInSlot.getMaxStackSize()) ? (getStackInSlot.getMaxStackSize() - 1) : n);
                    }
                    int j = 9;
                    while (true) {
                        final Item getItem = ((ItemStack)Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.getInventory().get(j)).getItem();
                        final ItemStack getStackInSlot2 = Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(j);
                        if (getItem == getStackInSlot.getItem() && getStackInSlot.getCount() <= n3 && getStackInSlot2.getCount() >= n2) {
                            break;
                        }
                        ++j;
                    }
                    hashMap.put(i, j);
                }
            }
            ++i;
        }
    }
    
    private void Method3089(final int n, final int n2) {
        if (n2 == -1) {
            return;
        }
        Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n2, 0, ClickType.PICKUP, (EntityPlayer)Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, (n < 9) ? (n + 36) : n, 0, ClickType.PICKUP, (EntityPlayer)Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n2, 0, ClickType.PICKUP, (EntityPlayer)Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }
    
    private Boolean Method3090() {
        return this.Field11173.Method359().equals("Percent");
    }
    
    private Boolean Method3091() {
        return this.Field11173.Method359().equals("Amount");
    }
    
    private Boolean Method3092() {
        return this.Field11169.Method359().equals("Percent");
    }
    
    private Boolean Method3093() {
        return this.Field11169.Method359().equals("Amount");
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5884 ^ 0xBD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
