//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class Wbygr25WzYZbwYHegfEKu968iioKjj4l
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11169;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11170;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11171;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11172;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11173;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11174;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11175;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11176;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field11177;
    private int Field11178;

    public Wbygr25WzYZbwYHegfEKu968iioKjj4l() {
        super("Replenish", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        String[] stringArray = new String[((int)742952162L ^ 0x2C488CE3) << 1];
        stringArray[(int)((long)190552892 ^ (long)190552892)] = "Amount";
        stringArray[(int)-1381241605L ^ 0xADABECFA] = "Percent";
        this.Field11169 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Amount", Arrays.asList(stringArray)));
        this.Field11170 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Amount", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x47409A31B7302C42L ^ 0x7549A31B7302C42L), 0.0, Double.longBitsToDouble(0x44F452AE6D45F01BL ^ 0x4BBD2AE6D45F01BL), (boolean)((long)1006186949 ^ (long)1006186948)).Method313(this::Method3093));
        this.Field11171 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Percent", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC684550718270847L ^ 0x86A0550718270847L), 0.0, Double.longBitsToDouble((long)1526848694 ^ 0x4058C0005B01DCB6L), ((int)1936436609L ^ 0x736BAD80) != 0).Method313(this::Method3092));
        this.Field11172 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xC33BA8CA5F5AEB37L ^ 0x8352A8CA5F5AEB37L), ((int)-1152440855L ^ 0xBB4F25E8) != 0));
        String[] stringArray2 = new String[((int)51401398L ^ 0x31052B7) << 1];
        stringArray2[(int)2096784997L ^ 0x7CFA6665] = "Amount";
        stringArray2[(int)((long)-1253894063 ^ (long)-1253894064)] = "Percent";
        this.Field11173 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("StackThreshold", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Amount", Arrays.asList(stringArray2)));
        this.Field11174 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Amount", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x98AFCF8CB36140AAL ^ 0xD8BBCF8CB36140AAL), 0.0, Double.longBitsToDouble(0x5789F912BDDA3675L ^ 0x17C67912BDDA3675L), (boolean)((long)1446955965 ^ (long)1446955964)).Method313(this::Method3091));
        this.Field11175 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Percent", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1657356746 ^ 0x4024000062C941CAL), 0.0, Double.longBitsToDouble(0xA6BFA936C772FCF6L ^ 0xE6E76936C772FCF6L), (boolean)((long)-155618971 ^ (long)-155618972)).Method313(this::Method3090));
        this.Field11176 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1616563195 ^ (long)-1616563196)));
        this.Field11177 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    }

    @Override
    public void Method38() {
        this.Field11177.Method2801();
    }

    @Override
    public void Method45() {
        if (Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null) {
            return;
        }
        int n = this.Field11172.Method335();
        if (n > 0 && !this.Field11177.Method2797(n)) {
            return;
        }
        this.Field11177.Method2801();
        int n2 = this.Field11169.Method359().equals("Amount") ? this.Field11170.Method335() : (int)((double)this.Field11171.Method335() * Double.longBitsToDouble(0xE0AE6FF71FF52E84L ^ 0xDF4A1516585B3AFFL));
        int n3 = this.Field11173.Method359().equals("Amount") ? this.Field11174.Method335() : (int)((double)this.Field11175.Method335() * Double.longBitsToDouble((long)1986846199 ^ 0x3FE47AE131C2C98CL));
        Map map = this.Method3088(n2, n3);
        int n4 = (int)((long)-728963054 ^ (long)-728963053);
        while (true) {
            int cfr_ignored_0 = ((int)-217991032L ^ 0xF301B88D) << 1;
            if (map.get(n4) != null) {
                this.Method3089(n4, (Integer)map.get(n4));
            }
            ++n4;
        }
    }

    private Map Method3088(int n, int n2) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int n3 = (int)2045663574L ^ 0x79EE5956;
        while (true) {
            int cfr_ignored_0 = (int)((long)1434909453 ^ (long)1434909444);
            ItemStack itemStack = Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n3);
            if (!itemStack.isEmpty() && itemStack.getItem() != Items.AIR) {
                int n4 = n;
                if (this.Field11176.Method365()) {
                    n4 = n >= itemStack.getMaxStackSize() ? itemStack.getMaxStackSize() - ((int)95462123L ^ 0x5B0A2EA) : n;
                }
                int n5 = (int)-989341746L ^ 0xC507D7C7;
                while (true) {
                    int cfr_ignored_1 = ((int)546982092L ^ 0x209A48C5) << 2;
                    Item item = ((ItemStack)Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.getInventory().get(n5)).getItem();
                    ItemStack itemStack2 = Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n5);
                    if (item == itemStack.getItem() && itemStack.getCount() <= n4 && itemStack2.getCount() >= n2) {
                        hashMap.put(n3, n5);
                        break;
                    }
                    ++n5;
                }
            }
            ++n3;
        }
    }

    private void Method3089(int n, int n2) {
        if (n2 == ((int)-1038600726L ^ 0x3DE7CA15)) {
            return;
        }
        Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick((int)((long)-1920519263 ^ (long)-1920519263), n2, (int)-1433404016L ^ 0xAA8FFD90, ClickType.PICKUP, (EntityPlayer)Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick((int)780873739L ^ 0x2E8B300B, n < ((int)1588321943L ^ 0x5EABDE9E) ? n + ((int)((long)-1100233333 ^ (long)-1100233342) << 2) : n, (int)((long)-518953285 ^ (long)-518953285), ClickType.PICKUP, (EntityPlayer)Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick((int)831704339L ^ 0x3192CD13, n2, (int)((long)-1163419961 ^ (long)-1163419961), ClickType.PICKUP, (EntityPlayer)Wbygr25WzYZbwYHegfEKu968iioKjj4l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
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

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2061122483 ^ (long)2061122483);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-62641580L ^ 0xFC442AAB);
            int n2 = (int)((long)-465632333 ^ (long)-465632498);
            cArray2[n] = (char)(cArray[n] ^ (((int)369785508L ^ 0x160A6C85) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

