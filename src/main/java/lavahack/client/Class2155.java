//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.block.material.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.enchantment.*;
import net.minecraft.potion.*;
import net.minecraft.entity.item.*;
import net.minecraft.client.multiplayer.*;
import org.jetbrains.annotations.*;
import java.util.*;

public class Class2155
{
    private static final Minecraft Field17853;
    public static List Field17854;
    private String Field17855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static boolean Method7753(final BlockPos blockPos) {
        return Class2155.Field17853.world.rayTraceBlocks(new Vec3d(Class2155.Field17853.player.posX, Class2155.Field17853.player.posY + Class2155.Field17853.player.getEyeHeight(), Class2155.Field17853.player.posZ), new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ()), false, true, false) == null;
    }
    
    public static boolean Method7754(final BlockPos blockPos) {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        final Block getBlock = getMinecraft.world.getBlockState(blockPos).getBlock();
        if (getBlock == Blocks.OBSIDIAN || getBlock == Blocks.BEDROCK) {
            final Block getBlock2 = getMinecraft.world.getBlockState(blockPos.add(0, 1, 0)).getBlock();
            final Block getBlock3 = getMinecraft.world.getBlockState(blockPos.add(0, 2, 0)).getBlock();
            if (getBlock2 == Blocks.AIR && getBlock3 == Blocks.AIR) {
                return getMinecraft.world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(blockPos.add(0, 1, 0))).isEmpty();
            }
        }
        return false;
    }
    
    public static boolean Method7755(final BlockPos blockPos, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        if (!Class2155.Field17853.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK) && !Class2155.Field17853.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN)) {
            return false;
        }
        if (!Class2155.Field17853.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR) && (!b4 || !Class2155.Field17853.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.FIRE))) {
            return false;
        }
        if (!Class2155.Field17853.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) {
            return false;
        }
        final BlockPos add = blockPos.add(0, 1, 0);
        return !b2 || Class2155.Field17853.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB((double)add.getX(), (double)add.getY(), (double)add.getZ(), (double)(add.getX() + 1), (double)(add.getY() + (b ? 2 : 1)), (double)(add.getZ() + 1)), Class2155::Method7775).size() == 0;
    }
    
    public static List Method7756(final Entity entity, final float n, final boolean b, final boolean b2) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        for (int n2 = entity.getPosition().getX() - (int)n; n2 <= entity.getPosition().getX() + n; ++n2) {
            for (int n3 = entity.getPosition().getZ() - (int)n; n3 <= entity.getPosition().getZ() + n; ++n3) {
                int getY = 0;
                if (!b) {
                    final int n4 = entity.getPosition().getY() - (int)n;
                }
                else {
                    getY = entity.getPosition().getY();
                }
                for (int n5 = getY; n5 < entity.getPosition().getY() + n; ++n5) {
                    final double n6 = (entity.getPosition().getX() - n2) * (entity.getPosition().getX() - n2) + (entity.getPosition().getZ() - n3) * (entity.getPosition().getZ() - n3) + (b ? 0 : ((entity.getPosition().getY() - n5) * (entity.getPosition().getY() - n5)));
                    if (n6 < n * n && (!b2 || n6 >= (n - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1141322930 ^ 0x4083F33FEDDDDECDL)) ^ 0x7F73F33FA9DAEA7FL)) * (n - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble((long)1932697198 ^ 0x402A07BE980DF369L)) ^ 0x7FDA07BEEB3F6D07L)))) {
                        list.add(new BlockPos(n2, n5, n3));
                    }
                }
            }
        }
        return list;
    }
    
    public static List Method7757(final float n, final boolean b) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final BlockPos blockPos = new BlockPos(Class2155.Field17853.player.getPositionVector());
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        final int n2 = (int)n;
        for (int n3 = getX - n2; n3 <= getX + n; ++n3) {
            for (int n4 = getZ - n2; n4 <= getZ + n; ++n4) {
                for (int n5 = getY - n2; n5 < getY + n; ++n5) {
                    if ((getX - n3) * (getX - n3) + (getZ - n4) * (getZ - n4) + (getY - n5) * (getY - n5) < n * n) {
                        final BlockPos e = new BlockPos(n3, n5, n4);
                        if (!b || Class2155.Field17853.world.getBlockState(e).getBlock() != Blocks.AIR) {
                            list.add(e);
                        }
                    }
                }
            }
        }
        return list;
    }
    
    public static List Method7758(final float n, final boolean b, final boolean b2) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        for (int n2 = Class2155.Field17853.player.getPosition().getX() - (int)n; n2 <= Class2155.Field17853.player.getPosition().getX() + n; ++n2) {
            for (int n3 = Class2155.Field17853.player.getPosition().getZ() - (int)n; n3 <= Class2155.Field17853.player.getPosition().getZ() + n; ++n3) {
                int getY = 0;
                if (b) {
                    final int n4 = Class2155.Field17853.player.getPosition().getY() - (int)n;
                }
                else {
                    getY = Class2155.Field17853.player.getPosition().getY();
                }
                for (int n5 = getY; n5 < Class2155.Field17853.player.getPosition().getY() + n; ++n5) {
                    final double n6 = (Class2155.Field17853.player.getPosition().getX() - n2) * (Class2155.Field17853.player.getPosition().getX() - n2) + (Class2155.Field17853.player.getPosition().getZ() - n3) * (Class2155.Field17853.player.getPosition().getZ() - n3) + (b ? ((Class2155.Field17853.player.getPosition().getY() - n5) * (Class2155.Field17853.player.getPosition().getY() - n5)) : 0);
                    if (n6 < n * n && (!b2 || n6 >= (n - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4648826695134669439L)) ^ 0x7F73F33FA9DAEA7FL)) * (n - Double.longBitsToDouble(Double.doubleToLongBits(Double.longBitsToDouble(4623516484021218567L)) ^ 0x7FDA07BEEB3F6D07L)))) {
                        list.add(new BlockPos(n2, n5, n3));
                    }
                }
            }
        }
        return list;
    }
    
    public static float Method7759(final World world, final double n, final double n2, final double n3, final Entity entity, final boolean b) {
        return Method7764(world, n, n2, n3, entity, 0, b);
    }
    
    public static float Method7760(final World world, final double n, final double n2, final double n3, final Entity entity, final int n4) {
        return Method7764(world, n, n2, n3, entity, n4, false);
    }
    
    public static float Method7761(final BlockPos blockPos, final Entity entity, final boolean b) {
        return Method7759((World)Class2155.Field17853.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), entity, b);
    }
    
    public static float Method7762(final World world, final double n, final double n2, final double n3, final Entity entity, final Class2032 class2032, final int n4, final boolean b) {
        return Method7763(world, n, n2, n3, entity, class2032.getEntityBoundingBox(), n4, b);
    }
    
    public static float Method7763(final World world, final double n, final double n2, final double n3, final Entity entity, final AxisAlignedBB axisAlignedBB, final int n4, final boolean b) {
        if (entity instanceof EntityPlayer && ((EntityPlayer)entity).isCreative()) {
            return 0.0f;
        }
        final float intBitsToFloat = Float.intBitsToFloat(1094713344);
        double n5 = entity.getDistance(n, n2, n3);
        if (n5 > intBitsToFloat) {
            return 0.0f;
        }
        if (n4 > 0) {
            final Vec3d method1942 = Class394.Method1942(entity, n4);
            n5 = Class394.Method1954(method1942.x, method1942.y, method1942.z, n, n2, n3);
        }
        final double n6 = n5 / intBitsToFloat;
        final Vec3d vec3d = new Vec3d(n, n2, n3);
        double n7;
        if (b) {
            n7 = Method7765(vec3d, axisAlignedBB);
        }
        else {
            n7 = entity.world.getBlockDensity(vec3d, axisAlignedBB);
        }
        final double n8 = (1.0 - n6) * n7;
        final float n9 = (float)(int)((n8 * n8 + n8) / Double.longBitsToDouble((long)1366755132 ^ 0x400000005177073CL) * Double.longBitsToDouble((long)816900097 ^ 0x401C000030B0E801L) * intBitsToFloat + 1.0);
        double n10 = 1.0;
        if (entity instanceof EntityLivingBase) {
            n10 = Method7767((EntityLivingBase)entity, Method7768(world, n9), new Explosion(world, (Entity)null, n, n2, n3, Float.intBitsToFloat(1086324736), false, true));
        }
        return (float)n10;
    }
    
    public static float Method7764(final World world, final double n, final double n2, final double n3, final Entity entity, final int n4, final boolean b) {
        return Method7763(world, n, n2, n3, entity, entity.getEntityBoundingBox(), n4, b);
    }
    
    public static float Method7765(final Vec3d vec3d, final AxisAlignedBB axisAlignedBB) {
        final double n = 1.0 / ((axisAlignedBB.maxX - axisAlignedBB.minX) * Double.longBitsToDouble(4611686018427387904L) + 1.0);
        final double n2 = 1.0 / ((axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(4611686018427387904L) + 1.0);
        final double n3 = 1.0 / ((axisAlignedBB.maxZ - axisAlignedBB.minZ) * Double.longBitsToDouble(4611686018427387904L) + 1.0);
        final double n4 = (1.0 - Math.floor(1.0 / n) * n) / Double.longBitsToDouble(4611686018427387904L);
        final double n5 = (1.0 - Math.floor(1.0 / n3) * n3) / Double.longBitsToDouble((long)502079178 ^ 0x400000001DED1ECAL);
        float n6 = 0.0f;
        float n7 = 0.0f;
        final float f1 = 0.0f;
        Float.compare(f1, 1.0f);
        final float f2 = 0.0f;
        Float.compare(f2, 1.0f);
        float f3 = 0.0f;
        while (true) {
            Float.compare(f3, 1.0f);
            if (Method7766(new Vec3d(axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) * f1 + n4, axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) * f2, axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) * f3 + n5), vec3d, false, true, false) == null) {
                ++n6;
            }
            ++n7;
            f3 += (float)n3;
        }
    }
    
    public static RayTraceResult Method7766(Vec3d vec3d, final Vec3d vec3d2, final boolean b, final boolean b2, final boolean b3) {
        final int floor = MathHelper.floor(vec3d2.x);
        final int floor2 = MathHelper.floor(vec3d2.y);
        final int floor3 = MathHelper.floor(vec3d2.z);
        int floor4 = MathHelper.floor(vec3d.x);
        int floor5 = MathHelper.floor(vec3d.y);
        int floor6 = MathHelper.floor(vec3d.z);
        final BlockPos blockPos = new BlockPos(floor4, floor5, floor6);
        IBlockState blockState = Class2155.Field17853.world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        if (!Class2155.Field17854.contains(block)) {
            block = Blocks.AIR;
            blockState = Blocks.AIR.getBlockState().getBaseState();
        }
        if ((!b2 || blockState.getCollisionBoundingBox((IBlockAccess)Class2155.Field17853.world, blockPos) != Block.NULL_AABB) && block.canCollideCheck(blockState, b)) {
            final RayTraceResult collisionRayTrace = blockState.collisionRayTrace((World)Class2155.Field17853.world, blockPos, vec3d, vec3d2);
            if (collisionRayTrace != null) {
                return collisionRayTrace;
            }
        }
        RayTraceResult rayTraceResult = null;
        int n = 200;
        while (true) {
            --n;
            if (floor4 == floor && floor5 == floor2 && floor6 == floor3) {
                return b3 ? rayTraceResult : null;
            }
            Double.longBitsToDouble((long)382912688 ^ 0x408F380016D2C8B0L);
            Double.longBitsToDouble(4651998512748167168L);
            double longBitsToDouble = Double.longBitsToDouble(4651998512748167168L);
            if (floor > floor4) {
                final double n2 = floor4 + 1.0;
            }
            else if (floor < floor4) {
                final double n3 = floor4 + 0.0;
            }
            if (floor2 > floor5) {
                final double n4 = floor5 + 1.0;
            }
            else if (floor2 < floor5) {
                final double n5 = floor5 + 0.0;
            }
            if (floor3 > floor6) {
                longBitsToDouble = floor6 + 1.0;
            }
            else if (floor3 < floor6) {
                longBitsToDouble = floor6 + 0.0;
            }
            final double longBitsToDouble2 = Double.longBitsToDouble((long)281061123 ^ 0x408F380010C0A703L);
            final double longBitsToDouble3 = Double.longBitsToDouble(4651998512748167168L);
            final double longBitsToDouble4 = Double.longBitsToDouble(4651998512748167168L);
            final double n6 = vec3d2.x - vec3d.x;
            final double n7 = vec3d2.y - vec3d.y;
            final double n8 = vec3d2.z - vec3d.z;
            Double.compare(longBitsToDouble2, 0.0);
            Double.compare(longBitsToDouble3, 0.0);
            Double.compare(longBitsToDouble4, 0.0);
            Double.compare(longBitsToDouble2, longBitsToDouble3);
            Double.compare(longBitsToDouble3, longBitsToDouble4);
            final EnumFacing enumFacing = (floor3 > floor6) ? EnumFacing.NORTH : EnumFacing.SOUTH;
            vec3d = new Vec3d(vec3d.x + n6 * longBitsToDouble4, vec3d.y + n7 * longBitsToDouble4, longBitsToDouble);
            floor4 = MathHelper.floor(vec3d.x) - ((enumFacing == EnumFacing.EAST) ? 1 : 0);
            floor5 = MathHelper.floor(vec3d.y) - ((enumFacing == EnumFacing.UP) ? 1 : 0);
            floor6 = MathHelper.floor(vec3d.z) - ((enumFacing == EnumFacing.SOUTH) ? 1 : 0);
            final BlockPos blockPos2 = new BlockPos(floor4, floor5, floor6);
            IBlockState blockState2 = Class2155.Field17853.world.getBlockState(blockPos2);
            Block block2 = blockState2.getBlock();
            if (!Class2155.Field17854.contains(block2)) {
                block2 = Blocks.AIR;
                blockState2 = Blocks.AIR.getBlockState().getBaseState();
            }
            if (b2 && blockState2.getMaterial() != Material.PORTAL && blockState2.getCollisionBoundingBox((IBlockAccess)Class2155.Field17853.world, blockPos2) == Block.NULL_AABB) {
                continue;
            }
            if (block2.canCollideCheck(blockState2, b)) {
                return blockState2.collisionRayTrace((World)Class2155.Field17853.world, blockPos2, vec3d, vec3d2);
            }
            rayTraceResult = new RayTraceResult(RayTraceResult$Type.MISS, vec3d, enumFacing, blockPos2);
        }
    }
    
    public static float Method7767(final EntityLivingBase entityLivingBase, float n, final Explosion explosion) {
        if (entityLivingBase instanceof EntityPlayer) {
            final EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
            final DamageSource causeExplosionDamage = DamageSource.causeExplosionDamage(explosion);
            n = CombatRules.getDamageAfterAbsorb(n, (float)entityPlayer.getTotalArmorValue(), (float)entityPlayer.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue());
            EnchantmentHelper.getEnchantmentModifierDamage(entityPlayer.getArmorInventoryList(), causeExplosionDamage);
            n *= 1.0f - MathHelper.clamp((float)EnchantmentHelper.getEnchantmentModifierDamage(entityPlayer.getArmorInventoryList(), causeExplosionDamage), 0.0f, Float.intBitsToFloat(1101004800)) / Float.intBitsToFloat(1103626240);
            if (entityLivingBase.isPotionActive(Potion.getPotionById(11))) {
                n -= n / Float.intBitsToFloat(1082130432);
            }
            return n;
        }
        n = CombatRules.getDamageAfterAbsorb(n, (float)entityLivingBase.getTotalArmorValue(), (float)entityLivingBase.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue());
        return n;
    }
    
    public static float Method7768(final World world, final float n) {
        final int getId = world.getDifficulty().getId();
        return n * ((getId == 0) ? 0.0f : ((getId == 2) ? 1.0f : ((getId == 1) ? Float.intBitsToFloat(1056964608) : Float.intBitsToFloat(1069547520))));
    }
    
    public static float Method7769(final World world, final EntityEnderCrystal entityEnderCrystal, final Entity entity) {
        return Method7760(world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, entity, 0);
    }
    
    public static boolean Method7770(final BlockPos blockPos, final boolean b) {
        return Method7771(blockPos, b, true);
    }
    
    public static boolean Method7771(final BlockPos blockPos, final boolean b, final boolean b2) {
        if (Class2155.Field17853.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && Class2155.Field17853.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
            return false;
        }
        final BlockPos add = blockPos.add(0, 1, 0);
        return Class2155.Field17853.world.getBlockState(add).getBlock() == Blocks.AIR && Class2155.Field17853.world.getBlockState(blockPos.add(0, 2, 0)).getBlock() == Blocks.AIR && (!b2 || Class2155.Field17853.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB((double)add.getX(), (double)add.getY(), (double)add.getZ(), (double)(add.getX() + 1), (double)(add.getY() + (b ? 2 : 1)), (double)(add.getZ() + 1)), Class2155::Method7774).size() == 0);
    }
    
    public static float Method7772(final World world, final BlockPos blockPos, final Entity entity) {
        return Method7760(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), entity, 0);
    }
    
    public static float Method7773(@Nullable @Nullable final WorldClient worldClient, final float n, final int n2, final double n3, @NotNull @NotNull final Entity entity, final boolean b, final boolean b2) {
        return Method7759((World)worldClient, n, n2, n3, entity, b);
    }
    
    private static boolean Method7774(final Entity entity) {
        return !(entity instanceof EntityEnderCrystal);
    }
    
    private static boolean Method7775(final boolean b, final Entity entity) {
        return !(entity instanceof EntityEnderCrystal) || b;
    }
    
    static {
        Field17853 = Minecraft.getMinecraft();
        Class2155.Field17854 = Arrays.asList(Blocks.OBSIDIAN, Blocks.BEDROCK, Blocks.ENDER_CHEST, Blocks.ANVIL);
    }
}
