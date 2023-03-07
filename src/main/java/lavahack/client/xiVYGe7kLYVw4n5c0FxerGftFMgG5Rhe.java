//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.common.MinecraftForge
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;

public class xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field14625 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14626 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Tower", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1873427550 ^ (long)-1873427550)));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field14627 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("TowerMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11735).Method5301(this.Field14626::Method365).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14628 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble((long)406778497 ^ 0x40340000183EF281L), ((int)-1392660358L ^ 0xACFDB07B) != 0).Method313(this.Field14626::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14629 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerStrict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-929462811L ^ 0xC89985E5) != 0).Method313(this::Method5706));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14630 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerSetBack", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1898639337 ^ (long)-1898639337)).Method313(this::Method5705));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14631 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerUpSpoof", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)475177208L ^ 0x1C52A0F8) != 0).Method313(this::Method5704));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14632 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerUpSpoofBalance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xEF2E36120759EF59L ^ 0xAF0A36120759EF59L), (boolean)((long)676334355 ^ (long)676334354)).Method313(this::Method5703));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14633 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerUpSpoofStrict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1767210148L ^ 0x96AA835C) != 0).Method313(this::Method5702));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14634 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerUpSpoofBack", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1862413322L ^ 0x90FDD3F7) != 0).Method313(this::Method5701));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14635 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerMotion", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x7135962B58AA3152L ^ 0x4EEF776CF6BE4BB3L), 0.0, 1.0, (boolean)((long)-1534003632 ^ (long)-1534003632)).Method313(this::Method5700));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14636 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerGroundSpoof", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1380391759 ^ (long)1380391759)).Method313(this::Method5699));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14637 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Restrict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1903468421L ^ 0x8E8B607A) != 0).Method313(this.Field14626::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14638 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RestrictTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xF392E7A9959EC580L ^ 0xB3BCE7A9959EC580L), 1.0, Double.longBitsToDouble(0x50E37874296E46F4L ^ 0x10A77874296E46F4L), ((int)1628930572L ^ 0x6117820D) != 0).Method313(this.Field14626::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14639 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TowerBind", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)((long)-87054702 ^ (long)-87054677)).Method355("Bind").Method313(this.Field14626::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14640 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Down", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)1961616558L ^ 0x74EBE4AE));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14641 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("KeeY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)77455699L ^ 0x49DE153) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14642 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ResetY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)-788036162L ^ 0xD10785BE).Method313(this.Field14641::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14643 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1279086584 ^ (long)1279086584)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14644 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-52784842 ^ (long)-52784842)));
    private int Field14645;
    private int Field14646 = (int)256111079L ^ 0xF43F1E7;
    private BlockPos Field14647 = null;
    private String Field14648 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe() {
        super("ScaffoldTest3", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        if (xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field14645 = (int)Math.floor(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
            super.Method38();
            MinecraftForge.EVENT_BUS.register((Object)this);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        MinecraftForge.EVENT_BUS.unregister((Object)this);
        this.Field14645 = (int)((long)685855656 ^ (long)685855656);
        this.Field14646 = (int)((long)899242504 ^ (long)899242504);
        this.Field14647 = null;
    }

    @Override
    public void Method45() {
        int n;
        if (xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (n2 == (int)((long)-911259993 ^ (long)911259992)) {
            return;
        }
        BlockPos blockPos = new BlockPos(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)this.Field14645, xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down();
        int n3 = (int)Math.abs(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        int n4 = n = this.Field14647 != null && (this.Field14647.getX() != blockPos.getX() || this.Field14647.getZ() != blockPos.getZ()) ? (int)1038718001L ^ 0x3DE99430 : (int)1197692158L ^ 0x476354FE;
        if (Keyboard.isKeyDown((int)this.Field14640.Method337())) {
        }
        if (this.Method5691(blockPos, n3, n2, (boolean)((long)919308018 ^ (long)919308018))) {
            return;
        }
        this.Method5692(n3);
        if (Keyboard.isKeyDown((int)this.Field14640.Method337())) {
        }
        this.Field14645 = n3;
        this.Field14646 += (int)((long)1028031701 ^ (long)1028031700);
    }

    private boolean Method5691(BlockPos blockPos, int n, int n2, boolean bl) {
        if (bl) {
            this.Method5693(this.Field14647.down(), n2);
        }
        BlockPos blockPos2 = this.Method5695(blockPos);
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(bl ? blockPos.down() : blockPos).isEmpty() && blockPos2 != null) {
            this.Method5693(bl ? blockPos2.down() : blockPos2, n2);
        }
        this.Method5693(bl ? blockPos.down() : blockPos, n2);
        if (!this.Field14641.Method365() && !bl && n > this.Field14645) {
            this.Method5693(blockPos.up(), n2);
        }
        if (!this.Field14641.Method365()) return (int)((long)1047824838 ^ (long)1047824838) != 0;
        if (!Keyboard.isKeyDown((int)this.Field14642.Method337())) return (int)((long)-1163179291 ^ (long)-1163179292) != 0;
        this.Field14645 = n;
        return (int)((long)-1163179291 ^ (long)-1163179292) != 0;
    }

    private void Method5692(int n) {
        if (!this.Field14626.Method365()) return;
        if (!Keyboard.isKeyDown((int)this.Field14639.Method337())) return;
        if (xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field14628.Method335() != 0) return;
        if (this.Field14637.Method365()) {
            if (this.Field14646 < this.Field14638.Method335()) return;
        }
        if (this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11736) {
            if (this.Field14636.Method365()) {
                xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer(((int)291358968L ^ 0x115DC8F9) != 0));
            } else {
                xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
            }
            xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = this.Field14635.Method367();
            xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
            return;
        }
        if (xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY - xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY / Double.longBitsToDouble((long)951674900 ^ 0x4024000038B96814L) * this.Field14632.Method367()) > Math.ceil(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) && this.Field14631.Method365()) {
            if (this.Field14633.Method365()) {
                double d = xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY - xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY / Double.longBitsToDouble(0x6B1957AA93B45934L ^ 0x2B3D57AA93B45934L) * this.Field14632.Method367());
                xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d, xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)-1558503879 ^ (long)-1558503879)));
                xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(d), xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)1660778320L ^ 0x62FD7751) != 0));
                xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(d), xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                if (!this.Field14634.Method365()) return;
                xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d, xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)981561164 ^ (long)981561164)));
                return;
            }
            xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)-1576427363L ^ 0xA209A09C) != 0));
            xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY), xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.ceil(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) + Double.longBitsToDouble(0x4A1CF087B06E05B2L ^ 0x754C92CA629FAC4EL), xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)1876133740L ^ 0x6FD3876C) != 0));
            return;
        }
        if (n <= this.Field14645) return;
        double d = xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d2 = xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        boolean bl = xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround;
        xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)n, xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)-1391744377 ^ (long)-1391744378)));
        xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)n, xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
        if (!this.Field14629.Method365()) {
            xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, bl));
        }
        if (!this.Field14630.Method365()) return;
        xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(d, d2, d3);
    }

    private void Method5693(BlockPos blockPos, int n) {
        if (!xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) return;
        if (this.Method5694(blockPos)) {
            return;
        }
        int n2 = xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Object[] objectArray = new Object[(int)((long)263267520 ^ (long)263267521) << 1];
        objectArray[(int)((long)-1600082484 ^ (long)-1600082484)] = n;
        objectArray[(int)-948886748L ^ 0xC7712325] = ((int)-572304885L ^ 0xDDE3520B) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field14625.Method341()).Method2972().Method1726(objectArray);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field14643.Method365(), this.Field14644.Method365());
        Object[] objectArray2 = new Object[(int)((long)51206425 ^ (long)51206424) << 1];
        objectArray2[(int)((long)-341312382 ^ (long)-341312382)] = n2;
        objectArray2[(int)-104637678L ^ 0xF9C35B13] = ((int)-1896591830L ^ 0x8EF44E2B) != 0;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field14625.Method341()).Method2972().Method1726(objectArray2);
    }

    private boolean Method5694(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return ((int)-1845913262L ^ 0x91F99953) != 0;
        }
        return ((int)1727813495L ^ 0x66FC5777) != 0;
    }

    private BlockPos Method5695(BlockPos blockPos) {
        return Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe::Method5698).filter(this::Method5697).min(Comparator.comparingDouble(xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe::Method5696)).orElse(null);
    }

    private static double Method5696(BlockPos blockPos) {
        return xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(0x33A085059DA4C0B3L ^ 0xC4085059DA4C0B3L), (double)(blockPos.getY() + (int)((long)-645784166 ^ (long)-645784165)), (double)blockPos.getZ() + Double.longBitsToDouble(0xC18F141D8C38AEBL ^ 0x33F8F141D8C38AEBL));
    }

    private boolean Method5697(BlockPos blockPos) {
        int n;
        if (!this.Method5694(blockPos)) {
            n = (int)((long)1447578354 ^ (long)1447578355);
            return n != 0;
        }
        n = (int)437026647L ^ 0x1A0C7F57;
        return n != 0;
    }

    private static boolean Method5698(BlockPos blockPos) {
        int n;
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
            n = (int)((long)1315341547 ^ (long)1315341546);
            return n != 0;
        }
        n = (int)1124546684L ^ 0x4307387C;
        return n != 0;
    }

    private Boolean Method5699() {
        int n;
        if (this.Field14626.Method365() && this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11736) {
            n = (int)242649618L ^ 0xE768A13;
            return n != 0;
        }
        n = (int)((long)-2143455238 ^ (long)-2143455238);
        return n != 0;
    }

    private Boolean Method5700() {
        int n;
        if (this.Field14626.Method365() && this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11736) {
            n = (int)496956651L ^ 0x1D9EF4EA;
            return n != 0;
        }
        n = (int)-1884998951L ^ 0x8FA532D9;
        return n != 0;
    }

    private Boolean Method5701() {
        int n;
        if (this.Field14626.Method365() && this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11735) {
            n = (int)-756125295L ^ 0xD2EE7190;
            return n != 0;
        }
        n = (int)((long)-181298384 ^ (long)-181298384);
        return n != 0;
    }

    private Boolean Method5702() {
        int n;
        if (this.Field14626.Method365() && this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11735) {
            n = (int)449099078L ^ 0x1AC4B547;
            return n != 0;
        }
        n = (int)((long)870953190 ^ (long)870953190);
        return n != 0;
    }

    private Boolean Method5703() {
        int n;
        if (this.Field14626.Method365() && this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11735) {
            n = (int)((long)984822971 ^ (long)984822970);
            return n != 0;
        }
        n = (int)((long)2069216540 ^ (long)2069216540);
        return n != 0;
    }

    private Boolean Method5704() {
        int n;
        if (this.Field14626.Method365() && this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11735) {
            n = (int)1016971575L ^ 0x3C9DC136;
            return n != 0;
        }
        n = (int)-1586092196L ^ 0xA176275C;
        return n != 0;
    }

    private Boolean Method5705() {
        int n;
        if (this.Field14626.Method365() && this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11735) {
            n = (int)((long)-2098856648 ^ (long)-2098856647);
            return n != 0;
        }
        n = (int)((long)1246994871 ^ (long)1246994871);
        return n != 0;
    }

    private Boolean Method5706() {
        int n;
        if (this.Field14626.Method365() && this.Field14627.Method341() == xiVYGe7kLYVw4n5c0FxerGftFMgG5Rhe$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11735) {
            n = (int)749940924L ^ 0x2CB330BD;
            return n != 0;
        }
        n = (int)((long)-1918105715 ^ (long)-1918105715);
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-408717850L ^ 0xE7A375E6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1894482244L ^ 0x8F147E43);
            int n2 = (int)86833176L ^ 0x52CF8A3;
            cArray2[n] = (char)(cArray[n] ^ ((int)186414403L ^ 0xB1C566E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

