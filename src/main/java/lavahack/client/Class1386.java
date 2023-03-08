//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.util.math.*;
import java.util.function.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraft.world.*;

@Class794
@Class99
public class Class1386 extends Class42
{
    private final Class44 Field14271;
    private final Class44 Field14272;
    private final Class44 Field14273;
    private final Class44 Field14274;
    private final Class44 Field14275;
    private final Class44 Field14276;
    private final Class44 Field14277;
    private final Class44 Field14278;
    private final Class44 Field14279;
    private final Class1996 Field14280;
    private final Class1515 Field14281;
    @Class873
    public static Class1386 Field14282;
    private final ArrayList Field14283;
    private final ArrayList Field14284;
    private final ArrayList Field14285;
    private int Field14286;
    private BlockPos Field14287;
    @Class1274
    public EntityPlayer Field14288;
    public Class69 Field14289;
    private String Field14290 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1386() {
        super("CrystalFiller", "HoleFiller but crystal", Class97.Field8338);
        this.Field14271 = this.Method23(new Class44("Range", this, Double.longBitsToDouble(4617090337980232499L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field14272 = this.Method23(new Class44("Ray Trace", this, true));
        this.Field14273 = this.Method23(new Class44("PlaceMode", this, Class1481.Field14905));
        this.Field14274 = this.Method23(new Class44("Delay", this, Double.longBitsToDouble(4611686018427387904L), 0.0, Double.longBitsToDouble((long)1708094260 ^ 0x4034000065CF7334L), true));
        this.Field14275 = this.Method23(new Class44("TargetHoleRange", this, Double.longBitsToDouble(4617090337980232499L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field14276 = this.Method23(new Class44("SwitchMode", this, Class8.Field7859));
        this.Field14277 = this.Method23(new Class44("CrystalDMGCheck", this, false));
        this.Field14278 = this.Method23(new Class44("MinDMG", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble((long)1238483041 ^ 0x4042000049D1C061L), true));
        this.Field14279 = this.Method23(new Class44("MaxSelfDMG", this, Double.longBitsToDouble((long)1434522615 ^ 0x402E0000558113F7L), 0.0, Double.longBitsToDouble(4630263366890291200L), true));
        this.Field14280 = this.Method24(new Class1996(new Class44("Renderer", this)));
        this.Field14281 = new Class1515(this).Method6046(this.Field14280).Method6042().Method6043();
        this.Field14283 = new ArrayList();
        this.Field14284 = new ArrayList();
        this.Field14285 = new ArrayList();
        this.Field14286 = 0;
        this.Field14287 = null;
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
        if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
    public void Method5487(final RenderWorldLastEvent renderWorldLastEvent) {
        this.Field14281.Method3805(this.Field14287);
    }
    
    private void Method20() {
        if (this.Field14288 == null && this.Field14273.Method359().equals(Class1481.Field14906.name())) {
            this.Field14288 = Class394.Method1924(this.Field14271.Method368());
        }
        else if (this.Field14286++ > this.Field14274.Method335()) {
            this.Method5490((EntityPlayer)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (float)this.Field14271.Method367());
            this.Method5488();
            if (this.Field14289 != null) {
                Class9.Method116(Items.END_CRYSTAL, 0, 9);
                final int currentItem = Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
                final String method359 = this.Field14276.Method359();
                switch (method359.hashCode()) {
                    case 2433880: {
                        if (method359.equals("None")) {
                            break;
                        }
                        break;
                    }
                    case -1955878649: {
                        if (method359.equals("Normal")) {
                            break;
                        }
                        break;
                    }
                    case -1818460043: {
                        if (method359.equals("Silent")) {
                            break;
                        }
                        break;
                    }
                }
                if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL) {
                    return;
                }
                RayTraceResult rayTraceBlocks = null;
                if (this.Field14272.Method365()) {
                    rayTraceBlocks = Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d(this.Field14289.Field8234.getX() + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4611817857425741989L)) ^ 0x7FE077E828AA18A5L), this.Field14289.Method656().getY() - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4625940684600273935L)) ^ 0x7FD2A48B19A06C0FL), this.Field14289.Field8234.getZ() + Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4614542759709438521L)) ^ 0x7FEA2630E954F239L)));
                }
                final EnumFacing enumFacing = (rayTraceBlocks == null || rayTraceBlocks.sideHit == null) ? EnumFacing.UP : rayTraceBlocks.sideHit;
                final boolean b = Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == Items.END_CRYSTAL;
                Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(this.Field14289.Method656(), enumFacing, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
                this.Field14287 = this.Field14289.Method656();
                if (this.Field14276.Method359().equals(Class8.Field7859.name()) && currentItem != -1) {
                    Class9.Method110(currentItem, true);
                }
                this.Field14286 = 0;
            }
        }
    }
    
    private void Method5488() {
        this.Field14289 = this.Method5489();
    }
    
    private Class69 Method5489() {
        return (Class69)this.Field14283.stream().filter(this::Method5491).min(Comparator.comparing((Function<? super T, ? extends Comparable>)Class1386::Method5493)).orElse(null);
    }
    
    private void Method5490(final EntityPlayer entityPlayer, final float n) {
        this.Field14283.clear();
        for (final BlockPos blockPos : Class2155.Method7756((Entity)entityPlayer, n, true, false)) {
            if (Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) && this.Method5492(blockPos)) {
                this.Field14283.add(new Class69(blockPos, (float)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos), (float)entityPlayer.getDistanceSq(blockPos)));
            }
        }
    }
    
    private boolean Method5491(final Class69 class69) {
        if (Class1106.Method4534((Entity)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, class69.Field8234) > this.Field14271.Method367()) {
            return false;
        }
        if (this.Field14273.Method359().equals(Class1481.Field14906.name()) && this.Field14288 != null) {
            if (Class1106.Method4534((Entity)this.Field14288, class69.Field8234) > this.Field14275.Method367()) {
                return false;
            }
            if (this.Field14277.Method365()) {
                final float method7772 = Class2155.Method7772((World)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, class69.Field8234, (Entity)this.Field14288);
                final float method7773 = Class2155.Method7772((World)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, class69.Field8234, (Entity)Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                if (method7772 < this.Field14278.Method367() || method7773 > this.Field14279.Method367()) {
                    return false;
                }
            }
        }
        return Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(class69.Field8234.up(1)).getBlock().equals(Blocks.AIR) && Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(class69.Field8234.up(2)).getBlock().equals(Blocks.AIR) && Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(class69.Field8234.up(3)).getBlock().equals(Blocks.AIR);
    }
    
    private boolean Method5492(final BlockPos blockPos) {
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
        return n >= 9;
    }
    
    private static Double Method5493(final Class69 class69) {
        return Class1386.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(class69.Field8234);
    }
    
    private String Method5494() {
        return "[" + ((this.Field14288 == null) ? "no target no fun" : this.Field14288.getName()) + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3830 ^ 0x5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
