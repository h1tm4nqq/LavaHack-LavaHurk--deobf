//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.lslPsdoabrsi1K2CJNP77JXrAha7Hnr3;
import lavahack.client.oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.Block;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class euqf1JFTGTMHHa42QPC0LPkhINLctBkD
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13045 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13496));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13046 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reconfig Corner Clip", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1969210633 ^ (long)1969210633)).Method313(this::Method4584));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13047 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Clips Count", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0x392F0B2AE175AD8DL ^ 0x793B0B2AE175AD8DL), ((int)-1066367580L ^ 0xC07085A5) != 0).Method313(this::Method4583));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13048 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Direction", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR.Field15448).Method5301(this::Method4582).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13049 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place Helping Blocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1042772101 ^ (long)1042772101)).Method313(this::Method4581));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13050 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)402127733 ^ 0x4059000017F7FB75L), 0.0, Double.longBitsToDouble((long)857959220 ^ 0x408F400033236B34L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13051 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offset", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x9A76DE2011A46805L ^ 0xDA6ADE2011A46805L), Double.longBitsToDouble(0x1774CEBEF55DB98CL ^ 0xD740CEBEF55DB98CL), Double.longBitsToDouble(0x3F5AC6BD48A78382L ^ 0x7F6EC6BD48A78382L), (boolean)((long)-460772362 ^ (long)-460772362)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13052 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SmartOffset", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1035374713 ^ (long)1035374713)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13053 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10609));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13054 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13055 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-501741845 ^ (long)-501741845)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13056 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)800407306L ^ 0x2FB53F0A) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13057 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Center", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)933423304 ^ (long)933423304)).Method313(this::Method4580));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13058 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FloorY", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2037051706 ^ (long)2037051706)).Method313(this.Field13057::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13059 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NoPushOutBlock", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1278134924L ^ 0xB3D13574) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13060 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Smart", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-71201950L ^ 0xFBC18B62) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13061 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SmartRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)216187651 ^ 0x400800000CE2C303L), 1.0, Double.longBitsToDouble(0xE598D54CE8FF1A3DL ^ 0xA5B8D54CE8FF1A3DL), ((int)197752770L ^ 0xBC977C2) != 0).Method313(this.Field13060::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13062 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SmartOnGround", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)280944365 ^ (long)280944365)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13063 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("KeepOn", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)172098898 ^ (long)172098898)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13064 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Dynamic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)726515145L ^ 0x2B4DBDC9) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13065 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Down", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-616337241 ^ (long)-616337241)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13066 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SetBack", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-636443956 ^ (long)-636443956)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13067 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place Upper Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2048572963 ^ (long)-2048572963)));
    public static euqf1JFTGTMHHa42QPC0LPkhINLctBkD Field13068;
    private BlockPos Field13069 = null;
    private IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5 Field13070 = IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14299;
    private int Field13071 = (int)-241742847L ^ 0xF1974C01;
    private final ArrayList Field13072 = new ArrayList();
    private final ArrayList Field13073 = new ArrayList();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field13074 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private String Field13075 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public euqf1JFTGTMHHa42QPC0LPkhINLctBkD() {
        super("Burrow", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        Field13068 = this;
    }

    private void Method20() {
        null.Field17808.Method370(1.0);
        null.Field17809.Method366((boolean)((long)506722692 ^ (long)506722693));
        this.Field13046.Method366(((int)283603478L ^ 0x10E77216) != 0);
    }

    private int Method4569() {
        return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127((Block)((fFfXu8YGPrHUAatXChm2smsH41rtoLA8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field13053.Method341()).Method2630().Method1726(new Object[(int)-2145668449L ^ 0x801BB29F]));
    }

    private void Method4570(int n, boolean bl) {
        Object[] objectArray = new Object[(int)((long)-797338292 ^ (long)-797338291) << 1];
        objectArray[(int)-1872077688L ^ 0x906A5C88] = n;
        objectArray[(int)((long)409965677 ^ (long)409965676)] = bl;
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field13054.Method341()).Method2972().Method1726(objectArray);
    }

    private boolean Method4571(BlockPos blockPos) {
        if (!euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable()) {
            return ((int)-1478548601L ^ 0xA7DF2387) != 0;
        }
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity.equals((Object)euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) || entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return (int)((long)-1796453543 ^ (long)-1796453543) != 0;
        }
        return (int)((long)1972789690 ^ (long)1972789691) != 0;
    }

    private void Method4572() {
        double d = Math.floor(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble(0x93D27044FA9DBC7DL ^ 0xAC327044FA9DBC7DL);
        double d2 = this.Field13058.Method365() ? Math.floor(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Math.floor(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble((long)1051112749 ^ 0x3FE000003EA6B52DL);
        int n = (double)((long)d2) != d2 || euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d, d2, d3).down()).getMaterial().isReplaceable() ? (int)-1269587669L ^ 0xB453A12A : (int)((long)323129126 ^ (long)323129126);
        euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        NetHandlerPlayClient netHandlerPlayClient = euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
        if (this.Field13062.Method365()) {
        }
        netHandlerPlayClient.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, (boolean)((long)602912710 ^ (long)602912711)));
    }

    private void Method4573() {
        euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0x427782E1FD790251L ^ 0x7DAD63A65D790270L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)-2036512103 ^ (long)-2036512104)));
        euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0x4230FB0EC1F599BL ^ 0x3BCB1586346AAF73L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)-1561857665 ^ (long)-1561857666)));
        euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0xB164E06612826367L ^ 0x8E94E51EF2ABE75FL), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)1593915236L ^ 0x5F013765) != 0));
        euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0x3359018F511ED9ADL ^ 0xCABA9ED7E2A74C2L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)2110800743L ^ 0x7DD04366) != 0));
        euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)989785871 ^ 0x3FF2A86215CA4260L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private void Method4574(BlockPos blockPos, int n) {
        if (euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock() != Blocks.AIR) return;
        int n2 = euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Method4570(n, ((int)1418131293L ^ 0x5486F75D) != 0);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
        this.Method4570(n2, (boolean)((long)-731325701 ^ (long)-731325702));
    }

    private double Method4575() {
        if (!this.Field13052.Method365()) return this.Field13051.Method367();
        if (this.Field13051.Method367() < Double.longBitsToDouble(0x128F28B2896DCF7DL ^ 0x528F28B2896DCF7DL)) {
            return this.Field13051.Method367();
        }
        int n = (int)((long)265590959 ^ (long)265590959);
        while ((double)n <= Math.ceil(this.Field13051.Method367())) {
            BlockPos blockPos = new BlockPos(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)95891559 ^ 0x3FD3333336840354L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble((long)696715266 ^ 0x4000000029870802L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0x60EDDA3A4EAF6DD0L ^ 0x5F3EE9097D9C5EE3L));
            BlockPos blockPos2 = new BlockPos(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)1671314356 ^ 0x3FD3333350AD0887L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble((long)1193356339 ^ 0x4000000047212C33L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)1562435804 ^ 0x3FD333336E13D3EFL));
            BlockPos blockPos3 = new BlockPos(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)777983741 ^ 0x3FD333331D6C25CEL), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble((long)849627922 ^ 0x4000000032A44B12L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)2119160385 ^ 0x3FD333334D7CE172L));
            BlockPos blockPos4 = new BlockPos(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble((long)1540313886 ^ 0x3FD3333368FC602DL), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n + Double.longBitsToDouble(0xB9220D454610A233L ^ 0xF9220D454610A233L), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)2103472144 ^ 0x3FD333334E534323L));
            int n2 = !euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial().isReplaceable() ? (int)((long)-825823568 ^ (long)-825823567) : (int)-510018037L ^ 0xE199BE0B;
            int n3 = !euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable() ? (int)((long)-1554093505 ^ (long)-1554093506) : (int)237020993L ^ 0xE20A741;
            int n4 = !euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getMaterial().isReplaceable() ? (int)((long)1638929218 ^ (long)1638929219) : (int)501589135L ^ 0x1DE5A48F;
            int n5 = !euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos4).getMaterial().isReplaceable() ? (int)-1455307906L ^ 0xA941C37F : (int)967252366L ^ 0x39A7198E;
            ++n;
        }
        return this.Field13051.Method367();
    }

    @Override
    public void Method38() {
        super.Method38();
        if (euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method21((boolean)((long)147806045 ^ (long)147806045));
            return;
        }
        this.Field13069 = new BlockPos(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (this.Field13057.Method365() && this.Field13045.Method341() == lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13495) {
            this.Method4572();
        }
        if (this.Field13045.Method341() != lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13495) {
            this.Method20();
        }
        this.Field13070 = IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14299;
        this.Field13071 = (int)((long)2147177586 ^ (long)2147177586);
    }

    private void Method4576() {
        int n = this.Method4569();
        if (n == ((int)1472351627L ^ 0xA83DB274)) {
            if (this.Field13063.Method365()) return;
            this.Method22();
            return;
        }
        if (!this.Method4571(this.Field13069)) {
            if (this.Field13063.Method365()) return;
            this.Method22();
            return;
        }
        if (this.Field13060.Method365() && euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.stream().noneMatch(this::Method4579)) {
            return;
        }
        this.Method4573();
        if (this.Field13064.Method365()) {
            int n2 = euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            this.Method4570(n, (boolean)((long)-933948897 ^ (long)-933948897));
            for (BlockPos blockPos : AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376.Method4079((Entity)euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field13069.getY(), (int)((long)-1623091416 ^ (long)-1623091416))) {
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
                if (!this.Field13067.Method365()) continue;
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos.up(), EnumHand.MAIN_HAND, this.Field13055.Method365(), this.Field13056.Method365());
            }
            this.Method4570(n2, ((int)1683997936L ^ 0x645FC4F1) != 0);
        } else {
            this.Method4574(this.Field13069, n);
            if (this.Field13067.Method365()) {
                this.Method4574(this.Field13069.up(), n);
            }
        }
        if (this.Field13065.Method365() && this.Field13066.Method365()) {
            euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Math.floor(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - 1.0), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        }
        if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer()) {
            euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble((long)278152274 ^ 0x3FF2A8623FA0E93DL), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            double d = this.Method4575();
            if (this.Field13065.Method365()) {
                euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - (this.Field13066.Method365() ? d : d + 1.0), euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)-1940187127 ^ (long)-1940187127)));
            } else {
                euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d, euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, (boolean)((long)547760277 ^ (long)547760277)));
            }
        }
        if (this.Field13063.Method365()) {
            return;
        }
        this.Method22();
    }

    private void Method4577() {
        if (this.Field13070 == IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14299) {
            double d = Math.floor(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
            double d2 = this.Field13058.Method365() ? Math.floor(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) : euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
            double d3 = Math.floor(euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            if (this.Field13048.Method341() == QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR.Field15448) {
                d += 1.0 - oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3019();
                d3 += 1.0 - oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3019();
            } else if (this.Field13048.Method341() == QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR.Field15449) {
                d += oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3019();
                d3 += oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3019();
            } else if (this.Field13048.Method341() == QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR.Field15450) {
                d += 1.0 - oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3019();
                d3 += oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3019();
            } else if (this.Field13048.Method341() == QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR.Field15451) {
                d += oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3019();
                d3 += 1.0 - oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3019();
            }
            int n = (double)((long)d2) != d2 || euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d, d2, d3).down()).getMaterial().isReplaceable() ? (int)1467564945L ^ 0x57794390 : (int)((long)-262751954 ^ (long)-262751954);
            euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            NetHandlerPlayClient netHandlerPlayClient = euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection;
            if (this.Field13062.Method365()) {
            }
            netHandlerPlayClient.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, ((int)1493017016L ^ 0x58FDA1B9) != 0));
            this.Field13070 = this.Field13049.Method365() ? IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14300 : IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14302;
            return;
        }
        if (this.Field13070 == IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14300) {
            BlockPos blockPos = this.Field13069.offset(((QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR)this.Field13048.Method341()).Method6249());
            BlockPos blockPos2 = this.Field13069.offset(((QsUYJN53MLWx702rV5eR08Z5ZKiZbBkR)this.Field13048.Method341()).Method6250());
            BlockPos blockPos3 = blockPos.up();
            BlockPos blockPos4 = blockPos2.up();
            this.Field13072.clear();
            this.Field13072.add(blockPos);
            this.Field13072.add(blockPos2);
            this.Field13072.add(blockPos3);
            this.Field13072.add(blockPos4);
            this.Field13073.clear();
            this.Field13074.Method2801();
            this.Field13070 = IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14301;
            return;
        }
        if (this.Field13070 == IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14301) {
            BlockPos blockPos;
            int n = this.Method4569();
            if (!this.Field13074.Method2797(this.Field13050.Method335())) {
                return;
            }
            this.Field13074.Method2801();
            Iterator iterator = this.Field13072.iterator();
            do {
                if (iterator.hasNext()) continue;
                this.Field13070 = IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14302;
                return;
            } while (this.Field13073.contains(blockPos = (BlockPos)iterator.next()));
            this.Method4574(blockPos, n);
            this.Field13073.add(blockPos);
            return;
        }
        if (this.Field13070 == IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14302) {
            if (((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method35()) return;
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method36();
            this.Field13071 += (int)((long)-1462249243 ^ (long)-1462249244);
            if (this.Field13071 != this.Field13047.Method335()) return;
            this.Field13070 = IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14303;
            return;
        }
        if (this.Field13070 != IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14303) return;
        this.Method4576();
        this.Field13070 = IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.Field14299;
    }

    @Override
    public void Method45() {
        if (euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13045.Method341() == lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13495) {
            this.Method4576();
            return;
        }
        this.Method4577();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4578(PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        if (!this.Field13059.Method365()) return;
        playerSPPushOutOfBlocksEvent.setCanceled((boolean)((long)-684912514 ^ (long)-684912513));
    }

    private boolean Method4579(EntityPlayer entityPlayer) {
        boolean bl;
        if ((double)euqf1JFTGTMHHa42QPC0LPkhINLctBkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) <= this.Field13061.Method367()) {
            bl = (int)148401116L ^ 0x8D86BDD;
            return bl;
        }
        bl = (int)-534459680L ^ 0xE024CAE0;
        return bl;
    }

    private Boolean Method4580() {
        int n;
        if (this.Field13045.Method341() == lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13495) {
            n = (int)((long)-950274271 ^ (long)-950274272);
            return n != 0;
        }
        n = (int)-471171069L ^ 0xE3EA8003;
        return n != 0;
    }

    private Boolean Method4581() {
        int n;
        if (this.Field13045.Method341() != lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13495) {
            n = (int)2006315970L ^ 0x7795F3C3;
            return n != 0;
        }
        n = (int)((long)-2047089039 ^ (long)-2047089039);
        return n != 0;
    }

    private Boolean Method4582() {
        int n;
        if (this.Field13045.Method341() != lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13495) {
            n = (int)((long)130836792 ^ (long)130836793);
            return n != 0;
        }
        n = (int)((long)-834747897 ^ (long)-834747897);
        return n != 0;
    }

    private Boolean Method4583() {
        int n;
        if (this.Field13045.Method341() != lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13495) {
            n = (int)((long)-982615393 ^ (long)-982615394);
            return n != 0;
        }
        n = (int)-1007600664L ^ 0xC3F13BE8;
        return n != 0;
    }

    private Boolean Method4584() {
        boolean bl;
        if (this.Field13045.Method341() != lslPsdoabrsi1K2CJNP77JXrAha7Hnr3.Field13495) {
            bl = (int)1631915852L ^ 0x61450F4D;
            return bl;
        }
        bl = (int)-1055201491L ^ 0xC11AE72D;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)142225924 ^ (long)142225924);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-367941215 ^ (long)-367941282);
            int n2 = (int)-357788124L ^ 0xEAAC9665;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1028858680L ^ 0xC2ACCC7B) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

