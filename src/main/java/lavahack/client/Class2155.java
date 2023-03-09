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
import lavahack.client.Class2032;
import lavahack.client.Class394;
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

public class Class2155 {
    private static final Minecraft Field17853 = Minecraft.getMinecraft();
    public static List Field17854 = Arrays.asList(Blocks.OBSIDIAN, Blocks.BEDROCK, Blocks.ENDER_CHEST, Blocks.ANVIL);
    private String Field17855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method7753(BlockPos blockPos) {
        if (Class2155.Field17853.world.rayTraceBlocks(new Vec3d(Class2155.Field17853.player.posX, Class2155.Field17853.player.posY + (double)Class2155.Field17853.player.getEyeHeight(), Class2155.Field17853.player.posZ), new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ()), false, true, false) != null) return false;
        return true;
    }

    public static boolean Method7754(BlockPos blockPos) {
        Minecraft minecraft = Minecraft.getMinecraft();
        Block block = minecraft.world.getBlockState(blockPos).getBlock();
        if (block != Blocks.OBSIDIAN) {
            if (block != Blocks.BEDROCK) return false;
        }
        Block block2 = minecraft.world.getBlockState(blockPos.add(0, 1, 0)).getBlock();
        Block block3 = minecraft.world.getBlockState(blockPos.add(0, 2, 0)).getBlock();
        if (block2 != Blocks.AIR) return false;
        if (block3 != Blocks.AIR) return false;
        return minecraft.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos.add(0, 1, 0))).isEmpty();
    }

    public static boolean Method7755(BlockPos blockPos, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (!Class2155.Field17853.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK)) {
            if (!Class2155.Field17853.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN)) return false;
        }
        if (!Class2155.Field17853.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR)) {
            if (!bl4) return false;
            if (!Class2155.Field17853.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.FIRE)) {
                return false;
            }
        }
        if (!Class2155.Field17853.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) {
            return false;
        }
        BlockPos blockPos2 = blockPos.add(0, 1, 0);
        if (!bl2) return true;
        if (Class2155.Field17853.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB((double)blockPos2.getX(), (double)blockPos2.getY(), (double)blockPos2.getZ(), (double)(blockPos2.getX() + 1), (double)(blockPos2.getY() + (bl ? 2 : 1)), (double)(blockPos2.getZ() + 1)), arg_0 -> Class2155.Method7775(bl3, arg_0)).size() == 0) return true;
        return false;
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
                    double d = (entity.getPosition().getX() - n) * (entity.getPosition().getX() - n) + (entity.getPosition().getZ() - n2) * (entity.getPosition().getZ() - n2) + (!bl ? (entity.getPosition().getY() - n3) * (entity.getPosition().getY() - n3) : 0);
                    if (d < (double)(f * f) && (!bl2 || d >= ((double)f - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1141322930 ^ 0x4083F33FEDDDDECDL)) ^ 0x7F73F33FA9DAEA7FL)) * ((double)f - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1932697198 ^ 0x402A07BE980DF369L)) ^ 0x7FDA07BEEB3F6D07L)))) {
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
        BlockPos blockPos = new BlockPos(Class2155.Field17853.player.getPositionVector());
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
                        if (!bl || Class2155.Field17853.world.getBlockState(blockPos2).getBlock() != Blocks.AIR) {
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
        int n = Class2155.Field17853.player.getPosition().getX() - (int)f;
        block0: while ((float)n <= (float)Class2155.Field17853.player.getPosition().getX() + f) {
            int n2 = Class2155.Field17853.player.getPosition().getZ() - (int)f;
            while (true) {
                int n3;
                if ((float)n2 <= (float)Class2155.Field17853.player.getPosition().getZ() + f) {
                    n3 = bl ? Class2155.Field17853.player.getPosition().getY() - (int)f : Class2155.Field17853.player.getPosition().getY();
                    int n4 = n3;
                } else {
                    ++n;
                    continue block0;
                }
                while ((float)n3 < (float)Class2155.Field17853.player.getPosition().getY() + f) {
                    double d = (Class2155.Field17853.player.getPosition().getX() - n) * (Class2155.Field17853.player.getPosition().getX() - n) + (Class2155.Field17853.player.getPosition().getZ() - n2) * (Class2155.Field17853.player.getPosition().getZ() - n2) + (bl ? (Class2155.Field17853.player.getPosition().getY() - n3) * (Class2155.Field17853.player.getPosition().getY() - n3) : 0);
                    if (d < (double)(f * f) && (!bl2 || d >= ((double)f - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4648826695134669439L)) ^ 0x7F73F33FA9DAEA7FL)) * ((double)f - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4623516484021218567L)) ^ 0x7FDA07BEEB3F6D07L)))) {
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
        return Class2155.Method7764(world, d, d2, d3, entity, 0, bl);
    }

    public static float Method7760(World world, double d, double d2, double d3, Entity entity, int n) {
        return Class2155.Method7764(world, d, d2, d3, entity, n, false);
    }

    public static float Method7761(BlockPos blockPos, Entity entity, boolean bl) {
        return Class2155.Method7759((World)Class2155.Field17853.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), entity, bl);
    }

    public static float Method7762(World world, double d, double d2, double d3, Entity entity, Class2032 class2032, int n, boolean bl) {
        return Class2155.Method7763(world, d, d2, d3, entity, class2032.getEntityBoundingBox(), n, bl);
    }

    public static float Method7763(World world, double d, double d2, double d3, Entity entity, AxisAlignedBB axisAlignedBB, int n, boolean bl) {
        if (entity instanceof EntityPlayer && ((EntityPlayer)entity).isCreative()) {
            return 0.0f;
        }
        float f = Float.intBitsToFloat(0x41400000);
        double d4 = entity.getDistance(d, d2, d3);
        if (d4 > (double)f) {
            return 0.0f;
        }
        if (n > 0) {
            Vec3d vec3d = Class394.Method1942(entity, n);
            d4 = Class394.Method1954(vec3d.x, vec3d.y, vec3d.z, d, d2, d3);
        }
        double d5 = d4 / (double)f;
        Vec3d vec3d = new Vec3d(d, d2, d3);
        double d6 = 0.0;
        d6 = bl ? (double)Class2155.Method7765(vec3d, axisAlignedBB) : (double)entity.world.getBlockDensity(vec3d, axisAlignedBB);
        double d7 = (1.0 - d5) * d6;
        float f2 = (int)((d7 * d7 + d7) / Double.longBitsToDouble((long)1366755132 ^ 0x400000005177073CL) * Double.longBitsToDouble((long)816900097 ^ 0x401C000030B0E801L) * (double)f + 1.0);
        double d8 = 1.0;
        if (!(entity instanceof EntityLivingBase)) return (float)d8;
        d8 = Class2155.Method7767((EntityLivingBase)entity, Class2155.Method7768(world, f2), new Explosion(world, null, d, d2, d3, Float.intBitsToFloat(0x40C00000), false, true));
        return (float)d8;
    }

    public static float Method7764(World world, double d, double d2, double d3, Entity entity, int n, boolean bl) {
        return Class2155.Method7763(world, d, d2, d3, entity, entity.getEntityBoundingBox(), n, bl);
    }

    public static float Method7765(Vec3d vec3d, AxisAlignedBB axisAlignedBB) {
        double d = 1.0 / ((axisAlignedBB.maxX - axisAlignedBB.minX) * Double.longBitsToDouble(0x4000000000000000L) + 1.0);
        double d2 = 1.0 / ((axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(0x4000000000000000L) + 1.0);
        double d3 = 1.0 / ((axisAlignedBB.maxZ - axisAlignedBB.minZ) * Double.longBitsToDouble(0x4000000000000000L) + 1.0);
        double d4 = (1.0 - Math.floor(1.0 / d) * d) / Double.longBitsToDouble(0x4000000000000000L);
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
            if (Class2155.Method7766(new Vec3d(d6 + d4, d7, d8 + d5), vec3d, false, true, false) == null) {
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
        IBlockState iBlockState = Class2155.Field17853.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        if (!Field17854.contains(block)) {
            block = Blocks.AIR;
            iBlockState = Blocks.AIR.getBlockState().getBaseState();
        }
        if ((!bl2 || iBlockState.getCollisionBoundingBox((IBlockAccess)Class2155.Field17853.world, blockPos) != Block.NULL_AABB) && block.canCollideCheck(iBlockState, bl) && (rayTraceResult = iBlockState.collisionRayTrace((World)Class2155.Field17853.world, blockPos, vec3d, vec3d2)) != null) {
            return rayTraceResult;
        }
        rayTraceResult = null;
        int n7 = 200;
        while (true) {
            --n7;
            if (n6 == n3 && n2 == n4 && n == n5) {
                if (!bl3) return null;
                RayTraceResult rayTraceResult2 = rayTraceResult;
                return rayTraceResult2;
            }
            boolean bl4 = true;
            boolean bl5 = true;
            boolean bl6 = true;
            double d = Double.longBitsToDouble((long)382912688 ^ 0x408F380016D2C8B0L);
            double d2 = Double.longBitsToDouble(4651998512748167168L);
            double d3 = Double.longBitsToDouble(4651998512748167168L);
            if (n3 > n6) {
                d = (double)n6 + 1.0;
            } else if (n3 < n6) {
                d = (double)n6 + 0.0;
            } else {
                bl4 = false;
            }
            if (n4 > n2) {
                d2 = (double)n2 + 1.0;
            } else if (n4 < n2) {
                d2 = (double)n2 + 0.0;
            } else {
                bl5 = false;
            }
            if (n5 > n) {
                d3 = (double)n + 1.0;
            } else if (n5 < n) {
                d3 = (double)n + 0.0;
            } else {
                bl6 = false;
            }
            double d4 = Double.longBitsToDouble((long)281061123 ^ 0x408F380010C0A703L);
            double d5 = Double.longBitsToDouble(4651998512748167168L);
            double d6 = Double.longBitsToDouble(4651998512748167168L);
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
            n6 = MathHelper.floor((double)vec3d.x) - (enumFacing == EnumFacing.EAST ? 1 : 0);
            n2 = MathHelper.floor((double)vec3d.y) - (enumFacing == EnumFacing.UP ? 1 : 0);
            n = MathHelper.floor((double)vec3d.z) - (enumFacing == EnumFacing.SOUTH ? 1 : 0);
            blockPos = new BlockPos(n6, n2, n);
            IBlockState iBlockState2 = Class2155.Field17853.world.getBlockState(blockPos);
            Block block2 = iBlockState2.getBlock();
            if (!Field17854.contains(block2)) {
                block2 = Blocks.AIR;
                iBlockState2 = Blocks.AIR.getBlockState().getBaseState();
            }
            if (bl2 && iBlockState2.getMaterial() != Material.PORTAL && iBlockState2.getCollisionBoundingBox((IBlockAccess)Class2155.Field17853.world, blockPos) == Block.NULL_AABB) continue;
            if (block2.canCollideCheck(iBlockState2, bl)) {
                return iBlockState2.collisionRayTrace((World)Class2155.Field17853.world, blockPos, vec3d, vec3d2);
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
        float f2 = MathHelper.clamp((float)n, (float)0.0f, (float)Float.intBitsToFloat(1101004800));
        if (!entityLivingBase.isPotionActive(Potion.getPotionById((int)11))) return f *= 1.0f - f2 / Float.intBitsToFloat(1103626240);
        f -= f / Float.intBitsToFloat(0x40800000);
        return f *= 1.0f - f2 / Float.intBitsToFloat(1103626240);
    }

    public static float Method7768(World world, float f) {
        float f2;
        int n = world.getDifficulty().getId();
        if (n == 0) {
            f2 = 0.0f;
            return f * f2;
        }
        if (n == 2) {
            f2 = 1.0f;
            return f * f2;
        }
        if (n == 1) {
            f2 = Float.intBitsToFloat(0x3F000000);
            return f * f2;
        }
        f2 = Float.intBitsToFloat(1069547520);
        return f * f2;
    }

    public static float Method7769(World world, EntityEnderCrystal entityEnderCrystal, Entity entity) {
        return Class2155.Method7760(world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, entity, 0);
    }

    public static boolean Method7770(BlockPos blockPos, boolean bl) {
        return Class2155.Method7771(blockPos, bl, true);
    }

    public static boolean Method7771(BlockPos blockPos, boolean bl, boolean bl2) {
        if (Class2155.Field17853.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && Class2155.Field17853.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
            return false;
        }
        BlockPos blockPos2 = blockPos.add(0, 1, 0);
        if (Class2155.Field17853.world.getBlockState(blockPos2).getBlock() != Blocks.AIR) return false;
        if (Class2155.Field17853.world.getBlockState(blockPos.add(0, 2, 0)).getBlock() != Blocks.AIR) return false;
        if (!bl2) return true;
        if (Class2155.Field17853.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB((double)blockPos2.getX(), (double)blockPos2.getY(), (double)blockPos2.getZ(), (double)(blockPos2.getX() + 1), (double)(blockPos2.getY() + (bl ? 2 : 1)), (double)(blockPos2.getZ() + 1)), Class2155::Method7774).size() != 0) return false;
        return true;
    }

    public static float Method7772(World world, BlockPos blockPos, Entity entity) {
        return Class2155.Method7760(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), entity, 0);
    }

    public static float Method7773(@Nullable @Nullable WorldClient worldClient, float f, int n, double d, @NotNull @NotNull Entity entity, boolean bl, boolean bl2) {
        return Class2155.Method7759((World)worldClient, f, n, d, entity, bl);
    }

    private static boolean Method7774(Entity entity) {
        if (entity instanceof EntityEnderCrystal) return false;
        return true;
    }

    private static boolean Method7775(boolean bl, Entity entity) {
        if (!(entity instanceof EntityEnderCrystal)) return true;
        if (bl) return true;
        return false;
    }
}

