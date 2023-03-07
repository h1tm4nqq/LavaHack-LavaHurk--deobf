//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.CombatRules
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.util.CombatRules;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy {
    private static final Minecraft Field17853 = Minecraft.getMinecraft();
    public static List Field17854;
    private String Field17855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method7753(BlockPos blockPos) {
        boolean bl;
        if (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.rayTraceBlocks(new Vec3d(vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.posX, vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.posY + (double)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getEyeHeight(), vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.posZ), new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ()), ((int)-120290598L ^ 0xF8D482DA) != 0, ((int)-1745356730L ^ 0x97F7F847) != 0, ((int)1500414060L ^ 0x596E806C) != 0) == null) {
            bl = (int)1134249950L ^ 0x439B47DF;
            return bl;
        }
        bl = (int)1190283588L ^ 0x46F24944;
        return bl;
    }

    public static boolean Method7754(BlockPos blockPos) {
        Minecraft minecraft = Minecraft.getMinecraft();
        Block block = minecraft.world.getBlockState(blockPos).getBlock();
        if (block != Blocks.OBSIDIAN) {
            if (block != Blocks.BEDROCK) return (int)((long)1593637322 ^ (long)1593637322) != 0;
        }
        Block block2 = minecraft.world.getBlockState(blockPos.add((int)((long)-754105376 ^ (long)-754105376), (int)((long)-414094554 ^ (long)-414094553), (int)((long)773977271 ^ (long)773977271))).getBlock();
        Block block3 = minecraft.world.getBlockState(blockPos.add((int)((long)-1469885179 ^ (long)-1469885179), ((int)-101556337L ^ 0xF9F25F8E) << 1, (int)((long)-310991100 ^ (long)-310991100))).getBlock();
        if (block2 != Blocks.AIR) return (int)((long)1593637322 ^ (long)1593637322) != 0;
        if (block3 != Blocks.AIR) return (int)((long)1593637322 ^ (long)1593637322) != 0;
        return minecraft.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos.add((int)((long)1263289853 ^ (long)1263289853), (int)((long)487921301 ^ (long)487921300), (int)((long)427704945 ^ (long)427704945)))).isEmpty();
    }

    public static boolean Method7755(BlockPos blockPos, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n;
        if (!vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK)) {
            if (!vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN)) return ((int)-1837745407L ^ 0x92763B01) != 0;
        }
        if (!vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos.add((int)((long)1730570013 ^ (long)1730570013), (int)((long)2041730213 ^ (long)2041730212), (int)-373661776L ^ 0xE9BA5FB0)).getBlock().equals(Blocks.AIR)) {
            if (!bl4) return (int)((long)480022529 ^ (long)480022529) != 0;
            if (!vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos.add((int)584409876L ^ 0x22D56314, (int)-1800249702L ^ 0x94B25E9B, (int)((long)1196858089 ^ (long)1196858089))).getBlock().equals(Blocks.FIRE)) {
                return (int)((long)480022529 ^ (long)480022529) != 0;
            }
        }
        if (!vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos.add((int)((long)-925172135 ^ (long)-925172135), ((int)1601353971L ^ 0x5F72B8F2) << 1, (int)-157363512L ^ 0xF69ED2C8)).getBlock().equals(Blocks.AIR)) {
            return ((int)-1956832546L ^ 0x8B5D1ADE) != 0;
        }
        BlockPos blockPos2 = blockPos.add((int)493931667L ^ 0x1D70CC93, (int)1314001683L ^ 0x4E521312, (int)((long)1418071195 ^ (long)1418071195));
        if (bl2 && vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB((double)blockPos2.getX(), (double)blockPos2.getY(), (double)blockPos2.getZ(), (double)(blockPos2.getX() + ((int)-818353037L ^ 0xCF38EC72)), (double)(blockPos2.getY() + (bl ? ((int)1526131599L ^ 0x5AF6EB8E) << 1 : (int)-873034875L ^ 0xCBF68B84)), (double)(blockPos2.getZ() + (int)((long)-170416767 ^ (long)-170416768))), arg_0 -> vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7775(bl3, arg_0)).size() != 0) {
            n = (int)((long)246902909 ^ (long)246902909);
            return n != 0;
        }
        n = (int)((long)381660299 ^ (long)381660298);
        return n != 0;
    }

    public static List Method7756(Entity entity, float f, boolean bl, boolean bl2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n = entity.getPosition().getX() - (int)f;
        block0: while ((float)n <= (float)entity.getPosition().getX() + f) {
            int n2 = entity.getPosition().getZ() - (int)f;
            while (true) {
                int n3;
                if ((float)n2 <= (float)entity.getPosition().getZ() + f) {
                    n3 = !bl ? entity.getPosition().getY() - (int)f : entity.getPosition().getY();
                    int n4 = n3;
                } else {
                    ++n;
                    continue block0;
                }
                while ((float)n3 < (float)entity.getPosition().getY() + f) {
                    double d = (entity.getPosition().getX() - n) * (entity.getPosition().getX() - n) + (entity.getPosition().getZ() - n2) * (entity.getPosition().getZ() - n2) + (!bl ? (entity.getPosition().getY() - n3) * (entity.getPosition().getY() - n3) : (int)((long)689124884 ^ (long)689124884));
                    if (d < (double)(f * f) && (!bl2 || d >= ((double)f - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1141322930 ^ 0x4083F33FEDDDDECDL)) ^ 0x7F73F33FA9DBEA7FL & 0x7F73F33FA9FAEA7FL)) * ((double)f - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1932697198 ^ 0x402A07BE980DF369L)) ^ 0x7FDA07BEEF3F6DE7L & 0x7FDA07BEFBFFFF0FL)))) {
                        arrayList.add(new BlockPos(n, n3, n2));
                    }
                    ++n3;
                }
                ++n2;
            }
            break;
        }
        return arrayList;
    }

    public static List Method7757(float f, boolean bl) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        BlockPos blockPos = new BlockPos(vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPositionVector());
        int n = blockPos.getX();
        int n2 = blockPos.getY();
        int n3 = blockPos.getZ();
        int n4 = (int)f;
        int n5 = n - n4;
        while ((float)n5 <= (float)n + f) {
            int n6 = n3 - n4;
            while ((float)n6 <= (float)n3 + f) {
                int n7 = n2 - n4;
                while ((float)n7 < (float)n2 + f) {
                    if ((float)((n - n5) * (n - n5) + (n3 - n6) * (n3 - n6) + (n2 - n7) * (n2 - n7)) < f * f) {
                        BlockPos blockPos2 = new BlockPos(n5, n7, n6);
                        if (!bl || vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos2).getBlock() != Blocks.AIR) {
                            arrayList.add(blockPos2);
                        }
                    }
                    ++n7;
                }
                ++n6;
            }
            ++n5;
        }
        return arrayList;
    }

    public static List Method7758(float f, boolean bl, boolean bl2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getX() - (int)f;
        block0: while ((float)n <= (float)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getX() + f) {
            int n2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getZ() - (int)f;
            while (true) {
                int n3;
                if ((float)n2 <= (float)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getZ() + f) {
                    n3 = bl ? vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getY() - (int)f : vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getY();
                    int n4 = n3;
                } else {
                    ++n;
                    continue block0;
                }
                while ((float)n3 < (float)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getY() + f) {
                    double d = (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getX() - n) * (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getX() - n) + (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getZ() - n2) * (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getZ() - n2) + (bl ? (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getY() - n3) * (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.player.getPosition().getY() - n3) : (int)((long)-1668839249 ^ (long)-1668839249));
                    if (d < (double)(f * f) && (!bl2 || d >= ((double)f - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0xDC9DF9CFCCC99979L ^ 0x9C1E0AF065137306L)) ^ 0x7F73F33FA9DAEE7FL & 0x7F73F33FEBFBEA7FL)) * ((double)f - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(0x5B4D60E93C2C458CL ^ 0x1B676757D713288BL)) ^ 0x7FDA07BEEB3F7DB7L & 0x7FDA07BEEF3F6F47L)))) {
                        arrayList.add(new BlockPos(n, n3, n2));
                    }
                    ++n3;
                }
                ++n2;
            }
            break;
        }
        return arrayList;
    }

    public static float Method7759(World world, double d, double d2, double d3, Entity entity, boolean bl) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7764(world, d, d2, d3, entity, (int)((long)879499604 ^ (long)879499604), bl);
    }

    public static float Method7760(World world, double d, double d2, double d3, Entity entity, int n) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7764(world, d, d2, d3, entity, n, ((int)447422183L ^ 0x1AAB1EE7) != 0);
    }

    public static float Method7761(BlockPos blockPos, Entity entity, boolean bl) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), entity, bl);
    }

    public static float Method7762(World world, double d, double d2, double d3, Entity entity, RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl, int n, boolean bl) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7763(world, d, d2, d3, entity, rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.getEntityBoundingBox(), n, bl);
    }

    public static float Method7763(World world, double d, double d2, double d3, Entity entity, AxisAlignedBB axisAlignedBB, int n, boolean bl) {
        if (entity instanceof EntityPlayer && ((EntityPlayer)entity).isCreative()) {
            return 0.0f;
        }
        float f = Float.intBitsToFloat((int)((long)458175410 ^ (long)1510945714));
        double d4 = entity.getDistance(d, d2, d3);
        if (d4 > (double)f) {
            return 0.0f;
        }
        if (n > 0) {
            Vec3d vec3d = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1942(entity, n);
            d4 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1954(vec3d.x, vec3d.y, vec3d.z, d, d2, d3);
        }
        double d5 = d4 / (double)f;
        Vec3d vec3d = new Vec3d(d, d2, d3);
        double d6 = 0.0;
        d6 = bl ? (double)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7765(vec3d, axisAlignedBB) : (double)entity.world.getBlockDensity(vec3d, axisAlignedBB);
        double d7 = (1.0 - d5) * d6;
        float f2 = (int)((d7 * d7 + d7) / Double.longBitsToDouble((long)1366755132 ^ 0x400000005177073CL) * Double.longBitsToDouble((long)816900097 ^ 0x401C000030B0E801L) * (double)f + 1.0);
        double d8 = 1.0;
        if (!(entity instanceof EntityLivingBase)) return (float)d8;
        d8 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7767((EntityLivingBase)entity, vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7768(world, f2), new Explosion(world, null, d, d2, d3, Float.intBitsToFloat(0x4BBF2690 ^ 0xB7F2690), ((int)-1382065549L ^ 0xAD9F5A73) != 0, ((int)1288190514L ^ 0x4CC83A33) != 0));
        return (float)d8;
    }

    public static float Method7764(World world, double d, double d2, double d3, Entity entity, int n, boolean bl) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7763(world, d, d2, d3, entity, entity.getEntityBoundingBox(), n, bl);
    }

    public static float Method7765(Vec3d vec3d, AxisAlignedBB axisAlignedBB) {
        double d = 1.0 / ((axisAlignedBB.maxX - axisAlignedBB.minX) * Double.longBitsToDouble(0x809CCC7496A81247L ^ 0xC09CCC7496A81247L) + 1.0);
        double d2 = 1.0 / ((axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(0xBEBFA33564709832L ^ 0xFEBFA33564709832L) + 1.0);
        double d3 = 1.0 / ((axisAlignedBB.maxZ - axisAlignedBB.minZ) * Double.longBitsToDouble(0x84A792DAC3AA483L ^ 0x484A792DAC3AA483L) + 1.0);
        double d4 = (1.0 - Math.floor(1.0 / d) * d) / Double.longBitsToDouble(0xAE4967CCDEC02306L ^ 0xEE4967CCDEC02306L);
        double d5 = (1.0 - Math.floor(1.0 / d3) * d3) / Double.longBitsToDouble((long)502079178 ^ 0x400000001DED1ECAL);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        Float.compare(f3, 1.0f);
        float f4 = 0.0f;
        Float.compare(f4, 1.0f);
        float f5 = 0.0f;
        while (true) {
            Float.compare(f5, 1.0f);
            double d6 = axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) * (double)f3;
            double d7 = axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) * (double)f4;
            double d8 = axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) * (double)f5;
            if (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7766(new Vec3d(d6 + d4, d7, d8 + d5), vec3d, ((int)-1116203291L ^ 0xBD7816E5) != 0, ((int)-188054277L ^ 0xF4CA84FA) != 0, (boolean)((long)1948361644 ^ (long)1948361644)) == null) {
                f += 1.0f;
            }
            f2 += 1.0f;
            f5 += (float)d3;
        }
    }

    public static RayTraceResult Method7766(Vec3d vec3d, Vec3d vec3d2, boolean bl, boolean bl2, boolean bl3) {
        RayTraceResult rayTraceResult;
        int n;
        int n2;
        int n3 = MathHelper.floor((double)vec3d2.x);
        int n4 = MathHelper.floor((double)vec3d2.y);
        int n5 = MathHelper.floor((double)vec3d2.z);
        int n6 = MathHelper.floor((double)vec3d.x);
        BlockPos blockPos = new BlockPos(n6, n2 = MathHelper.floor((double)vec3d.y), n = MathHelper.floor((double)vec3d.z));
        IBlockState iBlockState = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        if (!Field17854.contains(block)) {
            block = Blocks.AIR;
            iBlockState = Blocks.AIR.getBlockState().getBaseState();
        }
        if ((!bl2 || iBlockState.getCollisionBoundingBox((IBlockAccess)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world, blockPos) != Block.NULL_AABB) && block.canCollideCheck(iBlockState, bl) && (rayTraceResult = iBlockState.collisionRayTrace((World)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world, blockPos, vec3d, vec3d2)) != null) {
            return rayTraceResult;
        }
        rayTraceResult = null;
        int n7 = (int)((long)1254870115 ^ (long)1254870138) << 3;
        while (true) {
            --n7;
            if (n6 == n3 && n2 == n4 && n == n5) {
                if (!bl3) return null;
                RayTraceResult rayTraceResult2 = rayTraceResult;
                return rayTraceResult2;
            }
            int n8 = (int)-1829964398L ^ 0x92ECF593;
            int n9 = (int)((long)1643288056 ^ (long)1643288057);
            int n10 = (int)-34986208L ^ 0xFDEA2721;
            double d = Double.longBitsToDouble((long)382912688 ^ 0x408F380016D2C8B0L);
            double d2 = Double.longBitsToDouble(0x7B8AE1040619D90EL ^ 0x3B05D9040619D90EL);
            double d3 = Double.longBitsToDouble(0xF40084E0CA5F2127L ^ 0xB48FBCE0CA5F2127L);
            if (n3 > n6) {
                d = (double)n6 + 1.0;
            } else if (n3 < n6) {
                d = (double)n6 + 0.0;
            } else {
                n8 = (int)-462579221L ^ 0xE46D99EB;
            }
            if (n4 > n2) {
                d2 = (double)n2 + 1.0;
            } else if (n4 < n2) {
                d2 = (double)n2 + 0.0;
            } else {
                n9 = (int)((long)1369327823 ^ (long)1369327823);
            }
            if (n5 > n) {
                d3 = (double)n + 1.0;
            } else if (n5 < n) {
                d3 = (double)n + 0.0;
            } else {
                n10 = (int)-840589847L ^ 0xCDE59DE9;
            }
            double d4 = Double.longBitsToDouble((long)281061123 ^ 0x408F380010C0A703L);
            double d5 = Double.longBitsToDouble(0xC8F49448E0410D7EL ^ 0x887BAC48E0410D7EL);
            double d6 = Double.longBitsToDouble(0x7F6DC1F2630F2FFFL ^ 0x3FE2F9F2630F2FFFL);
            double d7 = vec3d2.x - vec3d.x;
            double d8 = vec3d2.y - vec3d.y;
            double d9 = vec3d2.z - vec3d.z;
            Double.compare(d4, 0.0);
            Double.compare(d5, 0.0);
            Double.compare(d6, 0.0);
            Double.compare(d4, d5);
            Double.compare(d5, d6);
            EnumFacing enumFacing = n5 > n ? EnumFacing.NORTH : EnumFacing.SOUTH;
            vec3d = new Vec3d(vec3d.x + d7 * d6, vec3d.y + d8 * d6, d3);
            n6 = MathHelper.floor((double)vec3d.x) - (enumFacing == EnumFacing.EAST ? (int)1469387819L ^ 0x5795142A : (int)1694863703L ^ 0x65059157);
            n2 = MathHelper.floor((double)vec3d.y) - (enumFacing == EnumFacing.UP ? (int)((long)-2092159357 ^ (long)-2092159358) : (int)2124130694L ^ 0x7E9BA986);
            n = MathHelper.floor((double)vec3d.z) - (enumFacing == EnumFacing.SOUTH ? (int)((long)1432879201 ^ (long)1432879200) : (int)((long)121462129 ^ (long)121462129));
            blockPos = new BlockPos(n6, n2, n);
            IBlockState iBlockState2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos);
            Block block2 = iBlockState2.getBlock();
            if (!Field17854.contains(block2)) {
                block2 = Blocks.AIR;
                iBlockState2 = Blocks.AIR.getBlockState().getBaseState();
            }
            if (bl2 && iBlockState2.getMaterial() != Material.PORTAL && iBlockState2.getCollisionBoundingBox((IBlockAccess)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world, blockPos) == Block.NULL_AABB) continue;
            if (block2.canCollideCheck(iBlockState2, bl)) {
                return iBlockState2.collisionRayTrace((World)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world, blockPos, vec3d, vec3d2);
            }
            rayTraceResult = new RayTraceResult(RayTraceResult.Type.MISS, vec3d, enumFacing, blockPos);
        }
    }

    public static float Method7767(EntityLivingBase entityLivingBase, float f, Explosion explosion) {
        if (!(entityLivingBase instanceof EntityPlayer)) return CombatRules.getDamageAfterAbsorb((float)f, (float)entityLivingBase.getTotalArmorValue(), (float)((float)entityLivingBase.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()));
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        DamageSource damageSource = DamageSource.causeExplosionDamage((Explosion)explosion);
        f = CombatRules.getDamageAfterAbsorb((float)f, (float)entityPlayer.getTotalArmorValue(), (float)((float)entityPlayer.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()));
        int n = EnchantmentHelper.getEnchantmentModifierDamage((Iterable)entityPlayer.getArmorInventoryList(), (DamageSource)damageSource);
        n = EnchantmentHelper.getEnchantmentModifierDamage((Iterable)entityPlayer.getArmorInventoryList(), (DamageSource)damageSource);
        float f2 = MathHelper.clamp((float)n, (float)0.0f, (float)Float.intBitsToFloat(0x78BAABB3 ^ 0x391AABB3));
        if (!entityLivingBase.isPotionActive(Potion.getPotionById((int)((int)((long)-788496637 ^ (long)-788496632))))) return f *= 1.0f - f2 / Float.intBitsToFloat((int)((long)2072921438 ^ (long)977683806));
        f -= f / Float.intBitsToFloat((int)1111191746L ^ 0x2BB70C2);
        return f *= 1.0f - f2 / Float.intBitsToFloat((int)((long)2072921438 ^ (long)977683806));
    }

    public static float Method7768(World world, float f) {
        float f2;
        int n = world.getDifficulty().getId();
        if (n == 0) {
            f2 = 0.0f;
            return f * f2;
        }
        if (n == ((int)350902866L ^ 0x14EA5A53) << 1) {
            f2 = 1.0f;
            return f * f2;
        }
        if (n == ((int)745251419L ^ 0x2C6BA25A)) {
            f2 = Float.intBitsToFloat(0xCD9BBF8 ^ 0x33D9BBF8);
            return f * f2;
        }
        f2 = Float.intBitsToFloat((int)1786912905L ^ 0x55422089);
        return f * f2;
    }

    public static float Method7769(World world, EntityEnderCrystal entityEnderCrystal, Entity entity) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7760(world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, entity, (int)286185908L ^ 0x110ED9B4);
    }

    public static boolean Method7770(BlockPos blockPos, boolean bl) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7771(blockPos, bl, ((int)1993673380L ^ 0x76D50AA5) != 0);
    }

    public static boolean Method7771(BlockPos blockPos, boolean bl, boolean bl2) {
        int n;
        if (vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
            return ((int)-1846228525L ^ 0x91F4C9D3) != 0;
        }
        BlockPos blockPos2 = blockPos.add((int)((long)-116977354 ^ (long)-116977354), (int)-920761922L ^ 0xC91E49BF, (int)491108475L ^ 0x1D45B87B);
        if (!(vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos2).getBlock() != Blocks.AIR || vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getBlockState(blockPos.add((int)((long)-2093695903 ^ (long)-2093695903), (int)((long)1985184315 ^ (long)1985184314) << 1, (int)-1379743793L ^ 0xADC2C7CF)).getBlock() != Blocks.AIR || bl2 && vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Field17853.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB((double)blockPos2.getX(), (double)blockPos2.getY(), (double)blockPos2.getZ(), (double)(blockPos2.getX() + (int)((long)-916551052 ^ (long)-916551051)), (double)(blockPos2.getY() + (bl ? ((int)-655908687L ^ 0xD8E7A0B0) << 1 : (int)874343002L ^ 0x341D6A5B)), (double)(blockPos2.getZ() + (int)((long)1523077977 ^ (long)1523077976))), vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy::Method7774).size() != 0)) {
            n = (int)((long)-1693732620 ^ (long)-1693732619);
            return n != 0;
        }
        n = (int)((long)229189576 ^ (long)229189576);
        return n != 0;
    }

    public static float Method7772(World world, BlockPos blockPos, Entity entity) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7760(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), entity, (int)1157822171L ^ 0x4502F6DB);
    }

    public static float Method7773(@Nullable @Nullable WorldClient worldClient, float f, int n, double d, @NotNull @NotNull Entity entity, boolean bl, boolean bl2) {
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)worldClient, f, n, d, entity, bl);
    }

    private static boolean Method7774(Entity entity) {
        int n;
        if (!(entity instanceof EntityEnderCrystal)) {
            n = (int)-1756573687L ^ 0x974CD008;
            return n != 0;
        }
        n = (int)((long)1026744765 ^ (long)1026744765);
        return n != 0;
    }

    private static boolean Method7775(boolean bl, Entity entity) {
        int n;
        if (entity instanceof EntityEnderCrystal && !bl) {
            n = (int)-1339806650L ^ 0xB0242C46;
            return n != 0;
        }
        n = (int)((long)385651110 ^ (long)385651111);
        return n != 0;
    }

    static {
        Block[] blockArray = new Block[(int)((long)-2000566436 ^ (long)-2000566435) << 2];
        blockArray[(int)274154880L ^ 0x10574580] = Blocks.OBSIDIAN;
        blockArray[(int)-526218837L ^ 0xE0A289AA] = Blocks.BEDROCK;
        blockArray[(int)((long)982403041 ^ (long)982403040) << 1] = Blocks.ENDER_CHEST;
        blockArray[(int)((long)-909026117 ^ (long)-909026120)] = Blocks.ANVIL;
        Field17854 = Arrays.asList(blockArray);
    }
}

