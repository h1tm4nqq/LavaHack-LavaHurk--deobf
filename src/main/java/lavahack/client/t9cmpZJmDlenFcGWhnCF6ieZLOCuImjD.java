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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.N82MBXUneZSZavqWLI2PFR4ZibcXUwaI;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$1;
import lavahack.client.t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
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

public class t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8968 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Arrow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9542).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8969 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field8367).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8970 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13433).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8971 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DelayMS", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xB85AB25292896BDAL ^ 0xF8F93A5292896BDAL), 0.0, Double.longBitsToDouble(0x981FA9243F979BDL ^ 0x4942729243F979BDL), ((int)1421059586L ^ 0x54B3A603) != 0).Method313(this::Method1280));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8972 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DelayTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xE28961F268C272EEL ^ 0xA2C061F268C272EEL), 0.0, Double.longBitsToDouble((long)169193760 ^ 0x406900000A15B120L), (boolean)((long)-1589224031 ^ (long)-1589224032)).Method313(this::Method1279));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8973 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("UseTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1585704456 ^ 0x400800005E83EE08L), 1.0, Double.longBitsToDouble(0x72C606EE2CAEBACEL ^ 0x32E206EE2CAEBACEL), ((int)112850510L ^ 0x6B9F64F) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8974 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Automatic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1347400012L ^ 0x504FB14C) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8975 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Arrange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)174663166L ^ 0xA6925FF) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8976 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Health", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)2134934536 ^ 0x402800007F408408L), 0.0, Double.longBitsToDouble((long)1999825098 ^ 0x404200007732E8CAL), (boolean)((long)87095141 ^ (long)87095140)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8977 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ToggleOnComplete", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1496069708L ^ 0xA6D3C9B4) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8978 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AnimateRotation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)219688141L ^ 0xD182CCD) != 0));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field8979 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private boolean Field8980 = (int)((long)-445337315 ^ (long)-445337315);
    private int Field8981 = (int)-1040419659L ^ 0x3E038B4A;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8982 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method1278, new Predicate[(int)((long)1092777539 ^ (long)1092777539)]);
    private String Field8983 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD() {
        super("AutoQuiver", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field8982);
    }

    @Override
    public void Method39() {
        super.Method39();
        if (this.Field8981 != (int)((long)1974560052 ^ (long)-1974560053)) {
            this.Method1275(this.Field8981, (boolean)((long)-390284030 ^ (long)-390284029));
        }
        if (this.Field8980) {
            KeyBinding.setKeyBindState((int)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, (boolean)((long)-1791276055 ^ (long)-1791276055));
        }
        this.Field8980 = (int)-1423632902L ^ 0xAB2515FA;
        this.Field8981 = (int)((long)-1310031741 ^ (long)1310031740);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field8982);
    }

    @Override
    public void Method45() {
        int n;
        if (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            if (!this.Field8980) return;
            KeyBinding.setKeyBindState((int)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, ((int)1872553046L ^ 0x6F9CE456) != 0);
            return;
        }
        int n2 = this.Field8970.Method341() == t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13433 ? (int)((long)903187096 ^ (long)903187096) : (n = this.Field8970.Method341() == t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13434 ? this.Field8971.Method335() : this.Field8972.Method335() * ((int)((long)-1858740836 ^ (long)-1858740859) << 1));
        if (n != 0 && !this.Field8979.Method2797(n)) {
            return;
        }
        if (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() < (float)this.Field8976.Method335()) {
            return;
        }
        int n3 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method126((Item)Items.BOW);
        if (n3 == (int)((long)352790121 ^ (long)-352790122)) {
            if (this.Field8977.Method365()) {
                NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886("You have no bow! Disabling...");
                this.Method22();
            }
            if (!this.Field8980) return;
            KeyBinding.setKeyBindState((int)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, ((int)414090174L ^ 0x18AE83BE) != 0);
            return;
        }
        if (!this.Method1276()) {
            if (!this.Field8980) return;
            KeyBinding.setKeyBindState((int)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, (boolean)((long)-636778554 ^ (long)-636778554));
            return;
        }
        this.Field8981 = t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        int n4 = (int)((long)315586420 ^ (long)315586420);
        t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(0.0f, Float.intBitsToFloat((int)((long)1728537988 ^ (long)-1514969724)), t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        if (this.Field8978.Method365()) {
            t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = 0.0f;
            t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = Float.intBitsToFloat((int)((long)2012510537 ^ (long)-1254065847));
        }
        if (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= this.Field8973.Method335()) {
            this.Field8980 = (int)675166072L ^ 0x283E3778;
            KeyBinding.setKeyBindState((int)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, ((int)-327407971L ^ 0xEC7C269D) != 0);
            this.Field8979.Method2801();
            this.Method1275(this.Field8981, (boolean)((long)-1190595451 ^ (long)-1190595452));
            if (!this.Field8977.Method365()) return;
            n4 = (int)((long)-707832776 ^ (long)-707832775);
            return;
        }
        if (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() < 0) return;
        this.Method1275(n3, ((int)1546962485L ^ 0x5C34C635) != 0);
        if (!(t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem).getItem() instanceof ItemBow)) {
            if (!this.Field8977.Method365()) return;
            this.Method22();
            return;
        }
        KeyBinding.setKeyBindState((int)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.keyCode, ((int)-1755181994L ^ 0x97620C57) != 0);
        this.Field8980 = (int)((long)691459863 ^ (long)691459862);
    }

    private void Method1275(int n, boolean bl) {
        if (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        switch (t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$1.Field17496[((t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)this.Field8969.Method341()).ordinal()]) {
            case 1: {
                return;
            }
            case 2: {
                if (bl) {
                    return;
                }
                t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            }
            case 3: {
                t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
                return;
            }
        }
    }

    private boolean Method1276() {
        ItemStack itemStack;
        if (!this.Method27()) {
            return ((int)974397043L ^ 0x3A141E73) != 0;
        }
        if (this.Field8968.Method341() == t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9541) {
            return (int)((long)1173039901 ^ (long)1173039900) != 0;
        }
        String string = "Arrow of " + ((t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field8968.Method341()).name();
        int n = (int)1946316304L ^ 0x74026E10;
        while (true) {
            int cfr_ignored_0 = (int)((long)-662792023 ^ (long)-662792032) << 2;
            itemStack = t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n);
            if (itemStack.getItem() == Items.TIPPED_ARROW) break;
            ++n;
        }
        if (itemStack.getDisplayName().equalsIgnoreCase(string)) {
            return (int)((long)-61736423 ^ (long)-61736424) != 0;
        }
        if (!this.Field8975.Method365()) return ((int)83073127L ^ 0x4F39867) != 0;
        return this.Method1277(n, string);
    }

    private boolean Method1277(int n, String string) {
        int n2 = (int)772444430L ^ 0x2E0A910E;
        while (true) {
            int cfr_ignored_0 = ((int)-723007556L ^ 0xD4E7C7B5) << 2;
            ItemStack itemStack = t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n2);
            if (itemStack.getItem() == Items.TIPPED_ARROW && itemStack.getDisplayName().equalsIgnoreCase(string)) {
                t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick((int)((long)-937043336 ^ (long)-937043336), n, (int)((long)-714844890 ^ (long)-714844890), ClickType.PICKUP, (EntityPlayer)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick((int)((long)-1025799574 ^ (long)-1025799574), n2, (int)((long)356209296 ^ (long)356209296), ClickType.PICKUP, (EntityPlayer)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick((int)((long)-155154243 ^ (long)-155154243), n, (int)1754116723L ^ 0x688DB273, ClickType.PICKUP, (EntityPlayer)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                return (int)((long)-2130865343 ^ (long)-2130865344) != 0;
            }
            ++n2;
        }
    }

    private boolean Method27() {
        int n = (int)-1216810878L ^ 0xB778F082;
        while (true) {
            int cfr_ignored_0 = (int)((long)-1973280071 ^ (long)-1973280080) << 2;
            ItemStack itemStack = t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n);
            if (!itemStack.isEmpty() && itemStack.getItem() == Items.ARROW) {
                return ((int)1902739446L ^ 0x71697FF7) != 0;
            }
            ++n;
        }
    }

    private void Method1278(N82MBXUneZSZavqWLI2PFR4ZibcXUwaI n82MBXUneZSZavqWLI2PFR4ZibcXUwaI) {
        if (!n82MBXUneZSZavqWLI2PFR4ZibcXUwaI.Method7533().equals((Object)t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            return;
        }
        if (!this.Field8980) return;
        n82MBXUneZSZavqWLI2PFR4ZibcXUwaI.Method158();
    }

    private Boolean Method1279() {
        int n;
        if (this.Field8970.Method341() == t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13435) {
            n = (int)((long)-2029096039 ^ (long)-2029096040);
            return n != 0;
        }
        n = (int)1798544295L ^ 0x6B339BA7;
        return n != 0;
    }

    private Boolean Method1280() {
        int n;
        if (this.Field8970.Method341() == t9cmpZJmDlenFcGWhnCF6ieZLOCuImjD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field13434) {
            n = (int)-823555835L ^ 0xCEE98904;
            return n != 0;
        }
        n = (int)((long)1787318736 ^ (long)1787318736);
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-141471131 ^ (long)-141471131);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1269859621 ^ (long)-1269859804);
            int n2 = (int)((long)0x5C545444 ^ (long)1549030559);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1475026692 ^ (long)1475039687) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

