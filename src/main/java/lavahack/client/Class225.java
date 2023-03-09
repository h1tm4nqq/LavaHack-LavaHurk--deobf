//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.function.Predicate;
import lavahack.client.Class104;
import lavahack.client.Class1197;
import lavahack.client.Class1303;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class2038;
import lavahack.client.Class2076;
import lavahack.client.Class367;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;

public class Class225
extends Class42 {
    private final Class1303 Field8968 = new Class1303("Arrow", (Class42)this, Class367.Field9542).Method5303();
    private final Class1303 Field8969 = new Class1303("Switch", (Class42)this, Class104.Field8367).Method5303();
    private final Class1303 Field8970 = new Class1303("Delay", (Class42)this, Class1197.Field13433).Method5303();
    private final Class44 Field8971 = this.Method23(new Class44("DelayMS", (Class42)this, Double.longBitsToDouble(4657715973212602368L), 0.0, Double.longBitsToDouble(4666723172467343360L), true).Method313(this::Method1280));
    private final Class44 Field8972 = this.Method23(new Class44("DelayTicks", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)169193760 ^ 0x406900000A15B120L), true).Method313(this::Method1279));
    private final Class44 Field8973 = this.Method23(new Class44("UseTicks", (Class42)this, Double.longBitsToDouble((long)1585704456 ^ 0x400800005E83EE08L), 1.0, Double.longBitsToDouble(0x4024000000000000L), true));
    private final Class44 Field8974 = this.Method23(new Class44("Automatic", (Class42)this, false));
    private final Class44 Field8975 = this.Method23(new Class44("Arrange", (Class42)this, true));
    private final Class44 Field8976 = this.Method23(new Class44("Health", (Class42)this, Double.longBitsToDouble((long)2134934536 ^ 0x402800007F408408L), 0.0, Double.longBitsToDouble((long)1999825098 ^ 0x404200007732E8CAL), true));
    private final Class44 Field8977 = this.Method23(new Class44("ToggleOnComplete", (Class42)this, false));
    private final Class44 Field8978 = this.Method23(new Class44("AnimateRotation", (Class42)this, false));
    private final Class650 Field8979 = new Class650();
    private boolean Field8980 = false;
    private int Field8981 = -1;
    private final Class618 Field8982 = new Class618(this::Method1278, new Predicate[0]);
    private String Field8983 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class225() {
        super("AutoQuiver", Class97.Field8338);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field8982);
    }

    @Override
    public void Method39() {
        super.Method39();
        if (this.Field8981 != -1) {
            this.Method1275(this.Field8981, true);
        }
        if (this.Field8980) {
            KeyBinding.setKeyBindState((int)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, (boolean)false);
        }
        this.Field8980 = false;
        this.Field8981 = -1;
        Class1796.Field16242.Method711(this.Field8982);
    }

    @Override
    public void Method45() {
        int n;
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            if (!this.Field8980) return;
            KeyBinding.setKeyBindState((int)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, (boolean)false);
            return;
        }
        int n2 = this.Field8970.Method341() == Class1197.Field13433 ? 0 : (n = this.Field8970.Method341() == Class1197.Field13434 ? this.Field8971.Method335() : this.Field8972.Method335() * 50);
        if (n != 0 && !this.Field8979.Method2797(n)) {
            return;
        }
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() < (float)this.Field8976.Method335()) {
            return;
        }
        int n3 = Class9.Method126((Item)Items.BOW);
        if (n3 == -1) {
            if (this.Field8977.Method365()) {
                Class1393.Method5507().Method1886("You have no bow! Disabling...");
                this.Method22();
            }
            if (!this.Field8980) return;
            KeyBinding.setKeyBindState((int)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, (boolean)false);
            return;
        }
        if (!this.Method1276()) {
            if (!this.Field8980) return;
            KeyBinding.setKeyBindState((int)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, (boolean)false);
            return;
        }
        this.Field8981 = Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        boolean bl = false;
        Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(0.0f, Float.intBitsToFloat(-1028390912), Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        if (this.Field8978.Method365()) {
            Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = 0.0f;
            Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = Float.intBitsToFloat(-1028390912);
        }
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= this.Field8973.Method335()) {
            this.Field8980 = false;
            KeyBinding.setKeyBindState((int)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, (boolean)false);
            this.Field8979.Method2801();
            this.Method1275(this.Field8981, true);
            if (!this.Field8977.Method365()) return;
            return;
        }
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() < 0) return;
        this.Method1275(n3, false);
        if (!(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() instanceof ItemBow)) {
            if (!this.Field8977.Method365()) return;
            this.Method22();
            return;
        }
        KeyBinding.setKeyBindState((int)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, (boolean)true);
        this.Field8980 = true;
    }

    private void Method1275(int n, boolean bl) {
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        switch (Class2076.Field17496[((Class104)this.Field8969.Method341()).ordinal()]) {
            case 1: {
                return;
            }
            case 2: {
                if (bl) {
                    return;
                }
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            }
            case 3: {
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
                return;
            }
        }
    }

    private boolean Method1276() {
        ItemStack itemStack;
        if (!this.Method27()) {
            return false;
        }
        if (this.Field8968.Method341() == Class367.Field9541) {
            return true;
        }
        String string = "Arrow of " + ((Class367)this.Field8968.Method341()).name();
        int n = 0;
        while ((itemStack = Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n)).getItem() != Items.TIPPED_ARROW) {
            ++n;
        }
        if (itemStack.getDisplayName().equalsIgnoreCase(string)) {
            return true;
        }
        if (!this.Field8975.Method365()) return false;
        return this.Method1277(n, string);
    }

    private boolean Method1277(int n, String string) {
        int n2 = 0;
        while (true) {
            ItemStack itemStack;
            if ((itemStack = Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n2)).getItem() == Items.TIPPED_ARROW && itemStack.getDisplayName().equalsIgnoreCase(string)) {
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n, 0, ClickType.PICKUP, (EntityPlayer)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n2, 0, ClickType.PICKUP, (EntityPlayer)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n, 0, ClickType.PICKUP, (EntityPlayer)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                return true;
            }
            ++n2;
        }
    }

    private boolean Method27() {
        int n = 0;
        ItemStack itemStack;
        while ((itemStack = Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n)).isEmpty() || itemStack.getItem() != Items.ARROW) {
            ++n;
        }
        return true;
    }

    private void Method1278(Class2038 class2038) {
        if (!class2038.Method7533().equals((Object)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            return;
        }
        if (!this.Field8980) return;
        class2038.Method158();
    }

    private Boolean Method1279() {
        boolean bl;
        if (this.Field8970.Method341() == Class1197.Field13435) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method1280() {
        boolean bl;
        if (this.Field8970.Method341() == Class1197.Field13434) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 219;
            cArray2[n] = (char)(cArray[n] ^ (0x4EC3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

