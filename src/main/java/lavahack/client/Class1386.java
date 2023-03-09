//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import lavahack.client.Class1106;
import lavahack.client.Class1274;
import lavahack.client.Class1481;
import lavahack.client.Class1515;
import lavahack.client.Class1996;
import lavahack.client.Class2155;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class69;
import lavahack.client.Class794;
import lavahack.client.Class8;
import lavahack.client.Class873;
import lavahack.client.Class9;
import lavahack.client.Class97;
import lavahack.client.Class99;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Class794
@Class99
public class Class1386
extends Class42 {
    private final Class44 Field14271 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(4617090337980232499L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field14272 = this.Method23(new Class44("Ray Trace", (Class42)this, true));
    private final Class44 Field14273 = this.Method23(new Class44("PlaceMode", (Class42)this, Class1481.Field14905));
    private final Class44 Field14274 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 0.0, Double.longBitsToDouble((long)1708094260 ^ 0x4034000065CF7334L), true));
    private final Class44 Field14275 = this.Method23(new Class44("TargetHoleRange", (Class42)this, Double.longBitsToDouble(4617090337980232499L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field14276 = this.Method23(new Class44("SwitchMode", (Class42)this, Class8.Field7859));
    private final Class44 Field14277 = this.Method23(new Class44("CrystalDMGCheck", (Class42)this, false));
    private final Class44 Field14278 = this.Method23(new Class44("MinDMG", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble((long)1238483041 ^ 0x4042000049D1C061L), true));
    private final Class44 Field14279 = this.Method23(new Class44("MaxSelfDMG", (Class42)this, Double.longBitsToDouble((long)1434522615 ^ 0x402E0000558113F7L), 0.0, Double.longBitsToDouble(0x4042000000000000L), true));
    private final Class1996 Field14280 = this.Method24(new Class1996(new Class44("Renderer", this)));
    private final Class1515 Field14281 = new Class1515(this).Method6046(this.Field14280).Method6042().Method6043();
    @Class873
    public static Class1386 Field14282;
    private final ArrayList Field14283 = new ArrayList();
    private final ArrayList Field14284 = new ArrayList();
    private final ArrayList Field14285 = new ArrayList();
    private int Field14286 = 0;
    private BlockPos Field14287 = null;
    @Class1274
    public EntityPlayer Field14288;
    public Class69 Field14289;
    private String Field14290 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1386() {
        super("CrystalFiller", "HoleFiller but crystal", Class97.Field8338);
        super.Method44(this::Method5494);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field14288 = null;
        this.Field14289 = null;
        this.Field14286 = 0;
        this.Field14283.clear();
        this.Field14284.clear();
        this.Field14285.clear();
    }

    @Override
    public void Method45() {
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field14288 = Class394.Method1924(this.Field14271.Method368());
        if (this.Field14288 == null) {
            return;
        }
        this.Field14287 = null;
        this.Method20();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5487(RenderWorldLastEvent renderWorldLastEvent) {
        this.Field14281.Method3805(this.Field14287);
    }

    private void Method20() {
        if (this.Field14288 == null && this.Field14273.Method359().equals(Class1481.Field14906.name())) {
            this.Field14288 = Class394.Method1924(this.Field14271.Method368());
            return;
        }
        if (this.Field14286++ <= this.Field14274.Method335()) return;
        this.Method5490((EntityPlayer)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (float)this.Field14271.Method367());
        this.Method5488();
        if (this.Field14289 == null) return;
        int n = Class9.Method116(Items.END_CRYSTAL, 0, 9);
        int n2 = Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        String string = this.Field14276.Method359();
        int n3 = -1;
        switch (string.hashCode()) {
            case 2433880: {
                if (string.equals("None")) {
                    n3 = 0;
                }
                break;
            }
            case -1955878649: {
                if (string.equals("Normal")) {
                    n3 = 1;
                }
                break;
            }
            case -1818460043: {
                if (string.equals("Silent")) {
                    n3 = 2;
                }
                break;
            }
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL) {
            return;
        }
        string = null;
        if (this.Field14272.Method365()) {
            string = Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d((double)this.Field14289.Field8234.getX() + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4611817857425741989L)) ^ 0x7FE077E828AA18A5L), (double)this.Field14289.Method656().getY() - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4625940684600273935L)) ^ 0x7FD2A48B19A06C0FL), (double)this.Field14289.Field8234.getZ() + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4614542759709438521L)) ^ 0x7FEA2630E954F239L)));
        }
        EnumFacing enumFacing = string == null || ((RayTraceResult)string).sideHit == null ? EnumFacing.UP : ((RayTraceResult)string).sideHit;
        boolean bl = Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL;
        Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(this.Field14289.Method656(), enumFacing, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
        Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        this.Field14287 = this.Field14289.Method656();
        if (this.Field14276.Method359().equals(Class8.Field7859.name()) && n2 != -1) {
            Class9.Method110(n2, true);
        }
        this.Field14286 = 0;
    }

    private void Method5488() {
        this.Field14289 = this.Method5489();
    }

    private Class69 Method5489() {
        return this.Field14283.stream().filter(this::Method5491).min(Comparator.comparing(Class1386::Method5493)).orElse(null);
    }

    private void Method5490(EntityPlayer entityPlayer, float f) {
        this.Field14283.clear();
        Iterator iterator = Class2155.Method7756((Entity)entityPlayer, f, true, false).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (!Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || !this.Method5492(blockPos)) continue;
            this.Field14283.add(new Class69(blockPos, (float)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos), (float)entityPlayer.getDistanceSq(blockPos)));
        }
    }

    private boolean Method5491(Class69 class69) {
        if ((double)Class1106.Method4534((Entity)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, class69.Field8234) > this.Field14271.Method367()) {
            return false;
        }
        if (this.Field14273.Method359().equals(Class1481.Field14906.name()) && this.Field14288 != null) {
            if ((double)Class1106.Method4534((Entity)this.Field14288, class69.Field8234) > this.Field14275.Method367()) {
                return false;
            }
            if (this.Field14277.Method365()) {
                float f = Class2155.Method7772((World)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, class69.Field8234, (Entity)this.Field14288);
                float f2 = Class2155.Method7772((World)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, class69.Field8234, (Entity)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                if ((double)f < this.Field14278.Method367()) return false;
                if ((double)f2 > this.Field14279.Method367()) {
                    return false;
                }
            }
        }
        if (!Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(class69.Field8234.up(1)).getBlock().equals(Blocks.AIR)) return false;
        if (!Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(class69.Field8234.up(2)).getBlock().equals(Blocks.AIR)) return false;
        if (!Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(class69.Field8234.up(3)).getBlock().equals(Blocks.AIR)) return false;
        return true;
    }

    private boolean Method5492(BlockPos blockPos) {
        int n = 0;
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 3, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.OBSIDIAN || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.BEDROCK || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.OBSIDIAN || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.BEDROCK || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.OBSIDIAN || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.BEDROCK || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.OBSIDIAN || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.BEDROCK || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.OBSIDIAN || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.BEDROCK || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (n < 9) return false;
        return true;
    }

    private static Double Method5493(Class69 class69) {
        return Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(class69.Field8234);
    }

    private String Method5494() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("[");
        if (this.Field14288 == null) {
            string = "no target no fun";
            return stringBuilder.append(string).append("]").toString();
        }
        string = this.Field14288.getName();
        return stringBuilder.append(string).append("]").toString();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 5;
            cArray2[n] = (char)(cArray[n] ^ (0x3830 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

