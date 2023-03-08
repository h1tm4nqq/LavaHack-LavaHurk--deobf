//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.item.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.*;
import net.minecraft.enchantment.*;
import net.minecraft.init.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.block.material.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import net.minecraft.potion.*;

public class Class394
{
    private static final DamageSource Field9654;
    private static final Minecraft Field9655;
    private int Field9656;
    
    public static boolean Method1914(final EntityPlayer entityPlayer) {
        return !Class394.Field9655.world.getCollisionBoxes((Entity)entityPlayer, new AxisAlignedBB(entityPlayer.posX - Double.longBitsToDouble(4599075939470750515L), entityPlayer.posY + entityPlayer.getEyeHeight(), entityPlayer.posZ + Double.longBitsToDouble((long)1055509640 ^ 0x3FD333330DDAFFBBL), entityPlayer.posX + Double.longBitsToDouble((long)442483653 ^ 0x3FD33333296CF0F6L), entityPlayer.posY + Double.longBitsToDouble((long)1308247832 ^ 0x400400004DFA4718L), entityPlayer.posZ - Double.longBitsToDouble((long)1102140996 ^ 0x3FD3333372826577L))).isEmpty();
    }
    
    public static float Method1915(final EntityPlayer entityPlayer) {
        return entityPlayer.getHealth();
    }
    
    public static boolean Method1916(final double n) {
        return Class394.Field9655.world.getBlockState(new BlockPos(Class394.Field9655.player.posX, Class394.Field9655.player.posY + n, Class394.Field9655.player.posZ)).getBlock().equals(Blocks.WATER);
    }
    
    public static boolean Method1917(final BlockPos blockPos) {
        return Class394.Field9655.world.rayTraceBlocks(new Vec3d(Class394.Field9655.player.posX, Class394.Field9655.player.posY + Class394.Field9655.player.getEyeHeight(), Class394.Field9655.player.posZ), new Vec3d(blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos.getY() + Double.longBitsToDouble((long)311653876 ^ 0x3FF80000129375F4L), blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)), false, true, false) == null;
    }
    
    public static double Method1918(final Entity entity) {
        final double abs = Math.abs(entity.posX - entity.prevPosX);
        final double abs2 = Math.abs(entity.posZ - entity.prevPosZ);
        return Math.sqrt(abs * abs + abs2 * abs2) * Class394.Field9655.getRenderPartialTicks() * Double.longBitsToDouble(4626322717216342016L);
    }
    
    public static boolean Method1919() {
        final double n = Class394.Field9655.player.posY - Double.longBitsToDouble((long)783794158 ^ 0x3F9EB851C532A156L);
        for (int i = MathHelper.floor(Class394.Field9655.player.posX); i < MathHelper.ceil(Class394.Field9655.player.posX); ++i) {
            for (int j = MathHelper.floor(Class394.Field9655.player.posZ); j < MathHelper.ceil(Class394.Field9655.player.posZ); ++j) {
                if (Class394.Field9655.world.getBlockState(new BlockPos(i, MathHelper.floor(n), j)).getBlock() instanceof BlockLiquid) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean Method1920(final BlockPos blockPos) {
        for (final Entity entity : Class394.Field9655.world.loadedEntityList) {
            if (entity.equals((Object)Class394.Field9655.player)) {
                continue;
            }
            if (entity instanceof EntityItem) {
                continue;
            }
            if (new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox())) {
                return true;
            }
        }
        return false;
    }
    
    public static BlockPos Method1921(final Entity entity) {
        return new BlockPos(Class447.Method2123(entity.getPositionVector(), 0));
    }
    
    public static boolean Method1922(final boolean b) {
        if (b && Class394.Field9655.player != null) {
            Class394.Field9655.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class394.Field9655.player, CPacketEntityAction$Action.STOP_SNEAKING));
        }
        return false;
    }
    
    public static EntityPlayer Method1923(final float n, final float n2) {
        Object o = null;
        for (int size = Class394.Field9655.world.playerEntities.size(), i = 0; i < size; ++i) {
            final EntityPlayer entityPlayer = Class394.Field9655.world.playerEntities.get(i);
            if (Method1927((EntityLivingBase)entityPlayer) || !null.Method35() || !null.Field10954.Method309("Zamorozka")) {
                if (!Method1926((EntityLivingBase)entityPlayer, n, n2)) {
                    if (o == null) {
                        o = entityPlayer;
                    }
                    else if (Class394.Field9655.player.getDistanceSq((Entity)entityPlayer) < Class394.Field9655.player.getDistanceSq((Entity)o)) {
                        o = entityPlayer;
                    }
                }
            }
        }
        return (EntityPlayer)o;
    }
    
    public static EntityPlayer Method1924(final float n) {
        return Method1923(n, n);
    }
    
    public static Entity Method1925(final float n, final float n2, final boolean b, final boolean b2, final boolean b3) {
        Entity entity = null;
        for (final Entity entity2 : Class394.Field9655.world.loadedEntityList) {
            if (!(entity2 instanceof EntityLivingBase)) {
                continue;
            }
            final EntityLivingBase entityLivingBase = (EntityLivingBase)entity2;
            if (!Method1927(entityLivingBase) && null.Method35() && null.Field10954.Method309("Zamorozka")) {
                continue;
            }
            if (Method1926(entityLivingBase, n, n2) || Method1928(entityLivingBase, b, b2, b3)) {
                continue;
            }
            if (entity == null) {
                entity = (Entity)entityLivingBase;
            }
            else {
                if (Class394.Field9655.player.getDistanceSq((Entity)entityLivingBase) >= Class394.Field9655.player.getDistanceSq(entity)) {
                    continue;
                }
                entity = (Entity)entityLivingBase;
            }
        }
        return entity;
    }
    
    public static boolean Method1926(final EntityLivingBase entityLivingBase, final double n, final double n2) {
        return Class394.Field9655.player.getDistance((Entity)entityLivingBase) > (Class394.Field9655.player.canEntityBeSeen((Entity)entityLivingBase) ? n : n2) || entityLivingBase == Class394.Field9655.player || entityLivingBase.getHealth() <= 0.0f || entityLivingBase.isDead || Class726.Field11086.Method3043(entityLivingBase.getName());
    }
    
    public static boolean Method1927(final EntityLivingBase entityLivingBase) {
        return Class1796.Field16245 != null && Class1796.Field16245.equals((Object)entityLivingBase);
    }
    
    public static boolean Method1928(final EntityLivingBase entityLivingBase, final boolean b, final boolean b2, final boolean b3) {
        return (b && !(entityLivingBase instanceof EntityPlayer)) || (b2 && !Method1929((Entity)entityLivingBase)) || (b3 && !Method1930((Entity)entityLivingBase));
    }
    
    public static boolean Method1929(final Entity entity) {
        return (!(entity instanceof EntityWolf) || !((EntityWolf)entity).isAngry()) && (entity instanceof EntityAgeable || entity instanceof EntityAmbientCreature || entity instanceof EntitySquid || (entity instanceof EntityIronGolem && ((EntityIronGolem)entity).getRevengeTarget() == null));
    }
    
    public static boolean Method1930(final Entity entity) {
        if (entity instanceof EntityPigZombie) {
            if (((EntityPigZombie)entity).isArmsRaised() || ((EntityPigZombie)entity).isAngry()) {
                return true;
            }
        }
        else {
            if (entity instanceof EntityWolf) {
                return ((EntityWolf)entity).isAngry() && !Minecraft.getMinecraft().player.equals((Object)((EntityWolf)entity).getOwner());
            }
            if (entity instanceof EntityEnderman) {
                return ((EntityEnderman)entity).isScreaming();
            }
        }
        return Method1933(entity);
    }
    
    public static boolean Method1931(final Entity entity) {
        return entity instanceof EntityPigZombie || entity instanceof EntityWolf || entity instanceof EntityEnderman;
    }
    
    public static boolean Method1932(final Entity entity) {
        return (entity.isCreatureType(EnumCreatureType.CREATURE, false) && !Method1931(entity)) || entity.isCreatureType(EnumCreatureType.AMBIENT, false) || entity instanceof EntityVillager || entity instanceof EntityIronGolem || (Method1931(entity) && !Method1930(entity));
    }
    
    public static boolean Method1933(final Entity entity) {
        return entity.isCreatureType(EnumCreatureType.MONSTER, false) && !Method1931(entity);
    }
    
    public static Block Method1934(final double n, final double n2, final double n3) {
        Block getBlock = null;
        if (Class394.Field9655.player != null) {
            final AxisAlignedBB axisAlignedBB = (Class394.Field9655.player.getRidingEntity() != null) ? Class394.Field9655.player.getRidingEntity().getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(n, n2, n3) : Class394.Field9655.player.getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(n, n2, n3);
            final int n4 = (int)axisAlignedBB.minY;
            for (int i = MathHelper.floor(axisAlignedBB.minX); i < MathHelper.floor(axisAlignedBB.maxX) + 1; ++i) {
                for (int j = MathHelper.floor(axisAlignedBB.minZ); j < MathHelper.floor(axisAlignedBB.maxZ) + 1; ++j) {
                    getBlock = Class394.Field9655.world.getBlockState(new BlockPos(i, n4, j)).getBlock();
                }
            }
        }
        return getBlock;
    }
    
    public static boolean Method1935(final boolean b) {
        if (Class394.Field9655.player == null) {
            return false;
        }
        if (Class394.Field9655.player.fallDistance >= Float.intBitsToFloat(1077936128)) {
            return false;
        }
        boolean b2 = false;
        final AxisAlignedBB axisAlignedBB = (Class394.Field9655.player.getRidingEntity() != null) ? Class394.Field9655.player.getRidingEntity().getEntityBoundingBox() : Class394.Field9655.player.getEntityBoundingBox();
        final int floor = MathHelper.floor(axisAlignedBB.minY - (b ? Double.longBitsToDouble((long)1113129726 ^ 0x3F9EB851A9DC1C46L) : Double.longBitsToDouble(4596373779694328218L)));
        for (int i = MathHelper.floor(axisAlignedBB.minX); i < MathHelper.floor(axisAlignedBB.maxX) + 1; ++i) {
            for (int j = MathHelper.floor(axisAlignedBB.minZ); j < MathHelper.floor(axisAlignedBB.maxZ) + 1; ++j) {
                final Block getBlock = Class394.Field9655.world.getBlockState(new BlockPos(i, floor, j)).getBlock();
                if (!(getBlock instanceof BlockAir)) {
                    if (!(getBlock instanceof BlockLiquid)) {
                        return false;
                    }
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static boolean Method1936() {
        return Method1935(false);
    }
    
    public static float Method1937(final double n, final double n2, final double n3, final EntityLivingBase entityLivingBase) {
        final double n4 = (1.0 - entityLivingBase.getDistance(n, n2, n3) / Double.longBitsToDouble((long)1925444733 ^ 0x4028000072C3F47DL)) * Method1940(new Vec3d(n, n2, n3), entityLivingBase.getEntityBoundingBox());
        return Method1938(entityLivingBase, Method1939((float)((n4 * n4 + n4) / Double.longBitsToDouble((long)1911059329 ^ 0x4000000071E87381L) * Double.longBitsToDouble(4635681760191971328L) + 1.0)));
    }
    
    public static float Method1938(final EntityLivingBase entityLivingBase, final float n) {
        final float n2 = CombatRules.getDamageAfterAbsorb(n, (float)entityLivingBase.getTotalArmorValue(), (float)entityLivingBase.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()) * (1.0f - MathHelper.clamp((float)EnchantmentHelper.getEnchantmentModifierDamage(entityLivingBase.getArmorInventoryList(), Class394.Field9654), 0.0f, Float.intBitsToFloat(1101004800)) / Float.intBitsToFloat(1103626240));
        if (entityLivingBase.isPotionActive(MobEffects.RESISTANCE)) {
            return n2 - n2 / Float.intBitsToFloat(1082130432);
        }
        return n2;
    }
    
    public static float Method1939(final float n) {
        final int getId = Class394.Field9655.world.getDifficulty().getId();
        return n * ((getId == 0) ? 0.0f : ((getId == 2) ? 1.0f : ((getId == 1) ? Float.intBitsToFloat(1056964608) : Float.intBitsToFloat(1069547520))));
    }
    
    public static float Method1940(final Vec3d vec3d, final AxisAlignedBB axisAlignedBB) {
        final double n = 1.0 / ((axisAlignedBB.maxX - axisAlignedBB.minX) * Double.longBitsToDouble((long)1533768791 ^ 0x400000005B6B7457L) + 1.0);
        final double n2 = 1.0 / ((axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(4611686018427387904L) + 1.0);
        final double n3 = 1.0 / ((axisAlignedBB.maxZ - axisAlignedBB.minZ) * Double.longBitsToDouble(4611686018427387904L) + 1.0);
        final double n4 = (1.0 - Math.floor(1.0 / n) * n) / Double.longBitsToDouble((long)1330179088 ^ 0x400000004F48EC10L);
        final double n5 = (1.0 - Math.floor(1.0 / n3) * n3) / Double.longBitsToDouble((long)26418497 ^ 0x4000000001931D41L);
        float n6 = 0.0f;
        float n7 = 0.0f;
        final float f1 = 0.0f;
        Float.compare(f1, 1.0f);
        final float f2 = 0.0f;
        Float.compare(f2, 1.0f);
        float f3 = 0.0f;
        while (true) {
            Float.compare(f3, 1.0f);
            if (Method1941(new Vec3d(axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) * f1 + n4, axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) * f2, axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) * f3 + n5), vec3d, false, false, false) == null) {
                ++n6;
            }
            ++n7;
            f3 += (float)n3;
        }
    }
    
    public static RayTraceResult Method1941(Vec3d vec3d, final Vec3d vec3d2, final boolean b, final boolean b2, final boolean b3) {
        final int floor = MathHelper.floor(vec3d2.x);
        final int floor2 = MathHelper.floor(vec3d2.y);
        final int floor3 = MathHelper.floor(vec3d2.z);
        int floor4 = MathHelper.floor(vec3d.x);
        int floor5 = MathHelper.floor(vec3d.y);
        int floor6 = MathHelper.floor(vec3d.z);
        final BlockPos blockPos = new BlockPos(floor4, floor5, floor6);
        final IBlockState getBlockState = Class394.Field9655.world.getBlockState(blockPos);
        final Block getBlock = getBlockState.getBlock();
        if ((!b2 || getBlockState.getCollisionBoundingBox((IBlockAccess)Class394.Field9655.world, blockPos) != Block.NULL_AABB) && getBlock.canCollideCheck(getBlockState, b)) {
            return getBlockState.collisionRayTrace((World)Class394.Field9655.world, blockPos, vec3d, vec3d2);
        }
        RayTraceResult rayTraceResult = null;
        int n = 200;
        while (true) {
            --n;
            if (Double.isNaN(vec3d.x) || Double.isNaN(vec3d.y) || Double.isNaN(vec3d.z)) {
                return null;
            }
            if (floor4 == floor && floor5 == floor2 && floor6 == floor3) {
                return b3 ? rayTraceResult : null;
            }
            Double.longBitsToDouble((long)1510992254 ^ 0x408F38005A0FE97EL);
            Double.longBitsToDouble((long)1148284063 ^ 0x408F380044716C9FL);
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
            final double longBitsToDouble2 = Double.longBitsToDouble((long)661288272 ^ 0x408F3800276A7550L);
            final double longBitsToDouble3 = Double.longBitsToDouble(4651998512748167168L);
            final double longBitsToDouble4 = Double.longBitsToDouble((long)1487711216 ^ 0x408F380058ACABF0L);
            final double n6 = vec3d2.x - vec3d.x;
            final double n7 = vec3d2.y - vec3d.y;
            final double n8 = vec3d2.z - vec3d.z;
            Double.compare(longBitsToDouble2, Double.longBitsToDouble((long)823895270 ^ 0x80000000311BA4E6L));
            Double.compare(longBitsToDouble3, Double.longBitsToDouble(Long.MIN_VALUE));
            Double.compare(longBitsToDouble4, Double.longBitsToDouble(Long.MIN_VALUE));
            Double.compare(longBitsToDouble2, longBitsToDouble3);
            Double.compare(longBitsToDouble3, longBitsToDouble4);
            final EnumFacing enumFacing = (floor3 > floor6) ? EnumFacing.NORTH : EnumFacing.SOUTH;
            vec3d = new Vec3d(vec3d.x + n6 * longBitsToDouble4, vec3d.y + n7 * longBitsToDouble4, longBitsToDouble);
            floor4 = MathHelper.floor(vec3d.x) - ((enumFacing == EnumFacing.EAST) ? 1 : 0);
            floor5 = MathHelper.floor(vec3d.y) - ((enumFacing == EnumFacing.UP) ? 1 : 0);
            floor6 = MathHelper.floor(vec3d.z) - ((enumFacing == EnumFacing.SOUTH) ? 1 : 0);
            final BlockPos blockPos2 = new BlockPos(floor4, floor5, floor6);
            final IBlockState getBlockState2 = Class394.Field9655.world.getBlockState(blockPos2);
            final Block getBlock2 = getBlockState2.getBlock();
            if (b2 && getBlockState2.getMaterial() != Material.PORTAL && getBlockState2.getCollisionBoundingBox((IBlockAccess)Class394.Field9655.world, blockPos2) == Block.NULL_AABB) {
                continue;
            }
            if (getBlock2.canCollideCheck(getBlockState2, b) && !(getBlock2 instanceof BlockWeb)) {
                return getBlockState2.collisionRayTrace((World)Class394.Field9655.world, blockPos2, vec3d, vec3d2);
            }
            rayTraceResult = new RayTraceResult(RayTraceResult$Type.MISS, vec3d, enumFacing, blockPos2);
        }
    }
    
    public static Vec3d Method1942(final Entity entity, final double n) {
        return Method1944(entity, n, n, n);
    }
    
    public static Vec3d Method1943(final Entity entity, final float n) {
        return new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(Method1942(entity, n));
    }
    
    public static Vec3d Method1944(final Entity entity, final double n, final double n2, final double n3) {
        return new Vec3d((entity.posX - entity.lastTickPosX) * n, (entity.posY - entity.lastTickPosY) * n2, (entity.posZ - entity.lastTickPosZ) * n3);
    }
    
    public static float Method1945(float n, final float n2, final float n3) {
        if (n <= n2) {
            n = n2;
        }
        if (n >= n3) {
            n = n3;
        }
        return n;
    }
    
    public static List Method1946(final BlockPos blockPos, final float n, final int n2, final boolean b, final boolean b2, final int n3) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        for (int n4 = getX - (int)n; n4 <= getX + n; ++n4) {
            for (int n5 = getZ - (int)n; n5 <= getZ + n; ++n5) {
                for (int n6 = b2 ? (getY - (int)n) : getY; n6 < (b2 ? (getY + n) : ((float)(getY + n2))); ++n6) {
                    final double n7 = (getX - n4) * (getX - n4) + (getZ - n5) * (getZ - n5) + (b2 ? ((getY - n6) * (getY - n6)) : 0);
                    if (n7 < n * n && (!b || n7 >= (n - 1.0f) * (n - 1.0f))) {
                        list.add(new BlockPos(n4, n6 + n3, n5));
                    }
                }
            }
        }
        return list;
    }
    
    public static List Method1947(final BlockPos blockPos, final BlockPos blockPos2) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final int getX = blockPos.getX();
        final int getY = blockPos.getY();
        final int getZ = blockPos.getZ();
        final int getX2 = blockPos2.getX();
        final int getY2 = blockPos2.getY();
        final int getZ2 = blockPos2.getZ();
        for (int i = Math.min(getX, getX2); i <= Math.max(getX, getX2); ++i) {
            for (int j = Math.min(getZ, getZ2); j <= Math.max(getZ, getZ2); ++j) {
                for (int k = Math.min(getY, getY2); k <= Math.max(getY, getY2); ++k) {
                    list.add(new BlockPos(i, k, j));
                }
            }
        }
        return list;
    }
    
    public static double[] Method1948(final double n, final double n2, final double n3, final Entity entity) {
        final double n4 = entity.posX - n;
        final double n5 = entity.posY - n2;
        final double n6 = entity.posZ - n3;
        final double sqrt = Math.sqrt(n4 * n4 + n5 * n5 + n6 * n6);
        return new double[] { Math.atan2(n6 / sqrt, n4 / sqrt) * Double.longBitsToDouble((long)1085715909 ^ 0x4066800040B6B5C5L) / Double.longBitsToDouble(4614256656552045848L) + Double.longBitsToDouble(4636033603912859648L), Math.asin(n5 / sqrt) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L) };
    }
    
    public static boolean Method1949(final Entity entity) {
        return entity.getName().equals(Class394.Field9655.player.getName()) || entity.isDead;
    }
    
    public static BlockPos Method1950(final Entity entity) {
        return new BlockPos(Math.floor(entity.posX), Math.floor(entity.posY), Math.floor(entity.posZ));
    }
    
    public static List Method1951(final Entity entity) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final AxisAlignedBB getEntityBoundingBox = entity.getEntityBoundingBox();
        for (double floor = Math.floor(getEntityBoundingBox.minX); floor < Math.ceil(getEntityBoundingBox.maxX); ++floor) {
            for (double floor2 = Math.floor(getEntityBoundingBox.minY); floor2 < Math.ceil(getEntityBoundingBox.maxY); ++floor2) {
                for (double floor3 = Math.floor(getEntityBoundingBox.minZ); floor3 < Math.ceil(getEntityBoundingBox.maxZ); ++floor3) {
                    list.add(new BlockPos(floor, floor2, floor3));
                }
            }
        }
        return list;
    }
    
    public static void Method1952(final float n) {
        Class394.Field9655.timer.tickLength = Float.intBitsToFloat(1112014848) / n;
    }
    
    public static void Method1953() {
        Class394.Field9655.timer.tickLength = Float.intBitsToFloat(1112014848);
    }
    
    public static double Method1954(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return MathHelper.sqrt(Method1955(n, n2, n3, n4, n5, n6));
    }
    
    public static double Method1955(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final double n7 = n - n4;
        final double n8 = n2 - n5;
        final double n9 = n3 - n6;
        return n7 * n7 + n8 * n8 + n9 * n9;
    }
    
    public static List Method1956(final boolean b, final boolean b2) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        list.add(new BlockPos(Class394.Field9655.player.posX + Double.longBitsToDouble(4599075939470750515L), Class394.Field9655.player.posY, Class394.Field9655.player.posZ + Double.longBitsToDouble(4599075939470750515L)));
        list.add(new BlockPos(Class394.Field9655.player.posX + Double.longBitsToDouble((long)692177147 ^ 0x3FD333331A72FBC8L), Class394.Field9655.player.posY, Class394.Field9655.player.posZ - Double.longBitsToDouble(4599075939470750515L)));
        list.add(new BlockPos(Class394.Field9655.player.posX - Double.longBitsToDouble(4599075939470750515L), Class394.Field9655.player.posY, Class394.Field9655.player.posZ - Double.longBitsToDouble(4599075939470750515L)));
        list.add(new BlockPos(Class394.Field9655.player.posX - Double.longBitsToDouble((long)1376708142 ^ 0x3FD33333613DD51DL), Class394.Field9655.player.posY, Class394.Field9655.player.posZ + Double.longBitsToDouble(4599075939470750515L)));
        final ArrayList<BlockPos> list2 = new ArrayList<BlockPos>();
        for (final BlockPos blockPos : list) {
            if (!list2.contains(blockPos.north())) {
                list2.add(blockPos.north());
            }
            if (!list2.contains(blockPos.east())) {
                list2.add(blockPos.east());
            }
            if (!list2.contains(blockPos.south())) {
                list2.add(blockPos.south());
            }
            if (!list2.contains(blockPos.west())) {
                list2.add(blockPos.west());
            }
        }
        list2.removeAll(list);
        final int n = (int)(Class394.Field9655.player.boundingBox.maxX - Class394.Field9655.player.boundingBox.minY);
        final ArrayList<BlockPos> list3 = new ArrayList<BlockPos>();
        if (b) {
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                list3.add(iterator2.next().down());
            }
        }
        if (b2) {
            final Iterator<Object> iterator3 = list2.iterator();
            while (iterator3.hasNext()) {
                list3.add(iterator3.next().down());
            }
        }
        for (int i = 0; i < n; ++i) {
            final Iterator<Object> iterator4 = list2.iterator();
            while (iterator4.hasNext()) {
                list3.add(iterator4.next().up(i));
            }
        }
        list3.add(((BlockPos)list3.get(list3.size() - 1)).up());
        final Iterator<Object> iterator5 = list.iterator();
        while (iterator5.hasNext()) {
            list3.add(iterator5.next().up(n));
        }
        final ArrayList<BlockPos> list4 = new ArrayList<BlockPos>();
        for (final BlockPos blockPos2 : list3) {
            if (Class394.Field9655.world.getBlockState(blockPos2).getBlock().isReplaceable((IBlockAccess)Class394.Field9655.world, blockPos2)) {
                list4.add(blockPos2);
            }
        }
        return list4;
    }
    
    public static double[] Method1957(final double[] array) {
        return new double[] { array[0] * Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble(Double.doubleToRawLongBits(array[1] * Double.longBitsToDouble(4626322717132455937L)) + 1L), array[2] * Double.longBitsToDouble(4616189618054758400L) };
    }
    
    public static List Method1958(final Class clazz, final AxisAlignedBB axisAlignedBB) {
        return (List)Class394.Field9655.world.getEntitiesWithinAABB(clazz, axisAlignedBB.expand(Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble((long)1539178421 ^ 0x401400005BBDFFB5L))).stream().filter(Class394::Method1960).collect(Collectors.toList());
    }
    
    public static double Method1959(final EntityLivingBase entityLivingBase, final double n) {
        double n2 = n;
        final PotionEffect getActivePotionEffect;
        if ((getActivePotionEffect = entityLivingBase.getActivePotionEffect(MobEffects.SPEED)) != null) {
            n2 += n * (getActivePotionEffect.getAmplifier() + 1.0) * Double.longBitsToDouble(4596373779694328218L);
        }
        final PotionEffect getActivePotionEffect2;
        if ((getActivePotionEffect2 = entityLivingBase.getActivePotionEffect(MobEffects.SLOWNESS)) != null) {
            n2 -= n * (getActivePotionEffect2.getAmplifier() + 1.0) * Double.longBitsToDouble((long)448541447 ^ 0x3FC33333298F0034L);
        }
        return n2;
    }
    
    private static boolean Method1960(final AxisAlignedBB axisAlignedBB, final Entity entity) {
        return axisAlignedBB.intersects(entity.getEntityBoundingBox());
    }
    
    static {
        Field9655 = Minecraft.getMinecraft();
        Field9654 = new DamageSource("explosion").setDifficultyScaled().setExplosion();
    }
    
    private static String Method1961(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4266 ^ 0x17));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
