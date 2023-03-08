//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraft.client.settings.*;
import net.minecraft.init.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.item.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;

public class Class225 extends Class42
{
    private final Class1303 Field8968;
    private final Class1303 Field8969;
    private final Class1303 Field8970;
    private final Class44 Field8971;
    private final Class44 Field8972;
    private final Class44 Field8973;
    private final Class44 Field8974;
    private final Class44 Field8975;
    private final Class44 Field8976;
    private final Class44 Field8977;
    private final Class44 Field8978;
    private final Class650 Field8979;
    private boolean Field8980;
    private int Field8981;
    private final Class618 Field8982;
    private String Field8983 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class225() {
        super("AutoQuiver", Class97.Field8338);
        this.Field8968 = new Class1303("Arrow", (Class42)this, (Enum)Class367.Field9542).Method5303();
        this.Field8969 = new Class1303("Switch", (Class42)this, (Enum)Class104.Field8367).Method5303();
        this.Field8970 = new Class1303("Delay", (Class42)this, (Enum)Class1197.Field13433).Method5303();
        this.Field8971 = this.Method23(new Class44("DelayMS", this, Double.longBitsToDouble(4657715973212602368L), 0.0, Double.longBitsToDouble(4666723172467343360L), true).Method313(this::Method1280));
        this.Field8972 = this.Method23(new Class44("DelayTicks", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)169193760 ^ 0x406900000A15B120L), true).Method313(this::Method1279));
        this.Field8973 = this.Method23(new Class44("UseTicks", this, Double.longBitsToDouble((long)1585704456 ^ 0x400800005E83EE08L), 1.0, Double.longBitsToDouble(4621819117588971520L), true));
        this.Field8974 = this.Method23(new Class44("Automatic", this, false));
        this.Field8975 = this.Method23(new Class44("Arrange", this, true));
        this.Field8976 = this.Method23(new Class44("Health", this, Double.longBitsToDouble((long)2134934536 ^ 0x402800007F408408L), 0.0, Double.longBitsToDouble((long)1999825098 ^ 0x404200007732E8CAL), true));
        this.Field8977 = this.Method23(new Class44("ToggleOnComplete", this, false));
        this.Field8978 = this.Method23(new Class44("AnimateRotation", this, false));
        this.Field8979 = new Class650();
        this.Field8980 = false;
        this.Field8981 = -1;
        this.Field8982 = new Class618(this::Method1278, new Predicate[0]);
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
            KeyBinding.setKeyBindState(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, false);
        }
        this.Field8980 = false;
        this.Field8981 = -1;
        Class1796.Field16242.Method711(this.Field8982);
    }
    
    @Override
    public void Method45() {
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            if (this.Field8980) {
                KeyBinding.setKeyBindState(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, false);
            }
            return;
        }
        final int n = (this.Field8970.Method341() == Class1197.Field13433) ? 0 : ((this.Field8970.Method341() == Class1197.Field13434) ? this.Field8971.Method335() : (this.Field8972.Method335() * 50));
        if (n != 0 && !this.Field8979.Method2797((long)n)) {
            return;
        }
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() < this.Field8976.Method335()) {
            return;
        }
        final int method126 = Class9.Method126((Item)Items.BOW);
        if (method126 == -1) {
            if (this.Field8977.Method365()) {
                Class1393.Method5507().Method1886("You have no bow! Disabling...");
                this.Method22();
            }
            if (this.Field8980) {
                KeyBinding.setKeyBindState(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, false);
            }
            return;
        }
        if (!this.Method1276()) {
            if (this.Field8980) {
                KeyBinding.setKeyBindState(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, false);
            }
            return;
        }
        this.Field8981 = Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(0.0f, Float.intBitsToFloat(-1028390912), Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        if (this.Field8978.Method365()) {
            Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = 0.0f;
            Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = Float.intBitsToFloat(-1028390912);
        }
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= this.Field8973.Method335()) {
            this.Field8980 = false;
            KeyBinding.setKeyBindState(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, false);
            this.Field8979.Method2801();
            this.Method1275(this.Field8981, true);
            if (this.Field8977.Method365()) {}
        }
        else if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= 0) {
            this.Method1275(method126, false);
            if (!(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() instanceof ItemBow)) {
                if (this.Field8977.Method365()) {
                    this.Method22();
                }
                return;
            }
            KeyBinding.setKeyBindState(Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, true);
            this.Field8980 = true;
        }
    }
    
    private void Method1275(final int n, final boolean b) {
        if (Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        switch (Class2076.Field17496[((Class104)this.Field8969.Method341()).ordinal()]) {
            case 2: {
                if (b) {
                    return;
                }
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            }
            case 3: {
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
                break;
            }
        }
    }
    
    private boolean Method1276() {
        if (!this.Method27()) {
            return false;
        }
        if (this.Field8968.Method341() == Class367.Field9541) {
            return true;
        }
        final String string = "Arrow of " + ((Class367)this.Field8968.Method341()).name();
        int n = 0;
        ItemStack getStackInSlot;
        while (true) {
            getStackInSlot = Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n);
            if (getStackInSlot.getItem() == Items.TIPPED_ARROW) {
                break;
            }
            ++n;
        }
        return getStackInSlot.getDisplayName().equalsIgnoreCase(string) || (this.Field8975.Method365() && this.Method1277(n, string));
    }
    
    private boolean Method1277(final int n, final String anotherString) {
        int n2 = 0;
        while (true) {
            final ItemStack getStackInSlot = Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n2);
            if (getStackInSlot.getItem() == Items.TIPPED_ARROW) {
                if (getStackInSlot.getDisplayName().equalsIgnoreCase(anotherString)) {
                    break;
                }
            }
            ++n2;
        }
        Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n, 0, ClickType.PICKUP, (EntityPlayer)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n2, 0, ClickType.PICKUP, (EntityPlayer)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n, 0, ClickType.PICKUP, (EntityPlayer)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        return true;
    }
    
    private boolean Method27() {
        int n = 0;
        while (true) {
            final ItemStack getStackInSlot = Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n);
            if (!getStackInSlot.isEmpty()) {
                if (getStackInSlot.getItem() == Items.ARROW) {
                    break;
                }
            }
            ++n;
        }
        return true;
    }
    
    private void Method1278(final Class2038 class2038) {
        if (!class2038.Method7533().equals((Object)Class225.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            return;
        }
        if (this.Field8980) {
            class2038.Method158();
        }
    }
    
    private Boolean Method1279() {
        return this.Field8970.Method341() == Class1197.Field13435;
    }
    
    private Boolean Method1280() {
        return this.Field8970.Method341() == Class1197.Field13434;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4EC3 ^ 0xDB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
