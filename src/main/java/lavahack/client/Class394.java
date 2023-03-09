//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.BlockWeb
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityAgeable
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureType
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntityIronGolem
 *  net.minecraft.entity.monster.EntityPigZombie
 *  net.minecraft.entity.passive.EntityAmbientCreature
 *  net.minecraft.entity.passive.EntitySquid
 *  net.minecraft.entity.passive.EntityVillager
 *  net.minecraft.entity.passive.EntityWolf
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.CombatRules
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class447;
import lavahack.client.Class726;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.CombatRules;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Class394 {
    private static final DamageSource Field9654;
    private static final Minecraft Field9655;
    private int Field9656;

    public static boolean Method1914(EntityPlayer entityPlayer) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(entityPlayer.posX - Double.longBitsToDouble(0x3FD3333333333333L), entityPlayer.posY + (double)entityPlayer.getEyeHeight(), entityPlayer.posZ + Double.longBitsToDouble((long)1055509640 ^ 0x3FD333330DDAFFBBL), entityPlayer.posX + Double.longBitsToDouble((long)442483653 ^ 0x3FD33333296CF0F6L), entityPlayer.posY + Double.longBitsToDouble((long)1308247832 ^ 0x400400004DFA4718L), entityPlayer.posZ - Double.longBitsToDouble((long)1102140996 ^ 0x3FD3333372826577L));
        if (Class394.Field9655.world.getCollisionBoxes((Entity)entityPlayer, axisAlignedBB).isEmpty()) return false;
        return true;
    }

    public static float Method1915(EntityPlayer entityPlayer) {
        return entityPlayer.getHealth();
    }

    public static boolean Method1916(double d) {
        return Class394.Field9655.world.getBlockState(new BlockPos(Class394.Field9655.player.posX, Class394.Field9655.player.posY + d, Class394.Field9655.player.posZ)).getBlock().equals(Blocks.WATER);
    }

    public static boolean Method1917(BlockPos blockPos) {
        if (Class394.Field9655.world.rayTraceBlocks(new Vec3d(Class394.Field9655.player.posX, Class394.Field9655.player.posY + (double)Class394.Field9655.player.getEyeHeight(), Class394.Field9655.player.posZ), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY() + Double.longBitsToDouble((long)311653876 ^ 0x3FF80000129375F4L), (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L)), false, true, false) != null) return false;
        return true;
    }

    public static double Method1918(Entity entity) {
        double d = Math.abs(entity.posX - entity.prevPosX);
        double d2 = Math.abs(entity.posZ - entity.prevPosZ);
        double d3 = Math.sqrt(d * d + d2 * d2);
        return (d3 *= (double)Field9655.getRenderPartialTicks()) * Double.longBitsToDouble(0x4034000000000000L);
    }

    public static boolean Method1919() {
        double d = Class394.Field9655.player.posY - Double.longBitsToDouble((long)783794158 ^ 0x3F9EB851C532A156L);
        int n = MathHelper.floor((double)Class394.Field9655.player.posX);
        while (n < MathHelper.ceil((double)Class394.Field9655.player.posX)) {
            for (int i = MathHelper.floor((double)Class394.Field9655.player.posZ); i < MathHelper.ceil((double)Class394.Field9655.player.posZ); ++i) {
                BlockPos blockPos = new BlockPos(n, MathHelper.floor((double)d), i);
                if (!(Class394.Field9655.world.getBlockState(blockPos).getBlock() instanceof BlockLiquid)) continue;
                return true;
            }
            ++n;
        }
        return false;
    }

    public static boolean Method1920(BlockPos blockPos) {
        Entity entity;
        Iterator iterator = Class394.Field9655.world.loadedEntityList.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while ((entity = (Entity)iterator.next()).equals((Object)Class394.Field9655.player) || entity instanceof EntityItem || !new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox()));
        return true;
    }

    public static BlockPos Method1921(Entity entity) {
        return new BlockPos(Class447.Method2123(entity.getPositionVector(), 0));
    }

    public static boolean Method1922(boolean bl) {
        if (!bl) return false;
        if (Class394.Field9655.player == null) return false;
        Class394.Field9655.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class394.Field9655.player, CPacketEntityAction.Action.STOP_SNEAKING));
        return false;
    }

    public static EntityPlayer Method1923(float f, float f2) {
        EntityPlayer entityPlayer = null;
        int n = Class394.Field9655.world.playerEntities.size();
        int n2 = 0;
        while (n2 < n) {
            EntityPlayer entityPlayer2 = (EntityPlayer)Class394.Field9655.world.playerEntities.get(n2);
            if (!(!Class394.Method1927((EntityLivingBase)entityPlayer2) && ((Class42)null).Method35() && null.Field10954.Method309("Zamorozka") || Class394.Method1926((EntityLivingBase)entityPlayer2, f, f2))) {
                if (entityPlayer == null) {
                    entityPlayer = entityPlayer2;
                } else if (Class394.Field9655.player.getDistanceSq((Entity)entityPlayer2) < Class394.Field9655.player.getDistanceSq((Entity)entityPlayer)) {
                    entityPlayer = entityPlayer2;
                }
            }
            ++n2;
        }
        return entityPlayer;
    }

    public static EntityPlayer Method1924(float f) {
        return Class394.Method1923(f, f);
    }

    public static Entity Method1925(float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        EntityLivingBase entityLivingBase = null;
        Iterator iterator = Class394.Field9655.world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            EntityLivingBase entityLivingBase2;
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityLivingBase) || !Class394.Method1927(entityLivingBase2 = (EntityLivingBase)entity) && ((Class42)null).Method35() && null.Field10954.Method309("Zamorozka") || Class394.Method1926(entityLivingBase2, f, f2) || Class394.Method1928(entityLivingBase2, bl, bl2, bl3)) continue;
            if (entityLivingBase == null) {
                entityLivingBase = entityLivingBase2;
                continue;
            }
            if (!(Class394.Field9655.player.getDistanceSq((Entity)entityLivingBase2) < Class394.Field9655.player.getDistanceSq((Entity)entityLivingBase))) continue;
            entityLivingBase = entityLivingBase2;
        }
        return entityLivingBase;
    }

    public static boolean Method1926(EntityLivingBase entityLivingBase, double d, double d2) {
        if ((double)Class394.Field9655.player.getDistance((Entity)entityLivingBase) > (Class394.Field9655.player.canEntityBeSeen((Entity)entityLivingBase) ? d : d2)) return true;
        if (entityLivingBase == Class394.Field9655.player) return true;
        if (entityLivingBase.getHealth() <= 0.0f) return true;
        if (entityLivingBase.isDead) return true;
        if (Class726.Field11086.Method3043(entityLivingBase.getName())) return true;
        return false;
    }

    public static boolean Method1927(EntityLivingBase entityLivingBase) {
        if (Class1796.Field16245 == null) return false;
        if (!Class1796.Field16245.equals((Object)entityLivingBase)) return false;
        return true;
    }

    public static boolean Method1928(EntityLivingBase entityLivingBase, boolean bl, boolean bl2, boolean bl3) {
        if (bl) {
            if (!(entityLivingBase instanceof EntityPlayer)) return true;
        }
        if (bl2) {
            if (!Class394.Method1929((Entity)entityLivingBase)) return true;
        }
        if (!bl3) return false;
        if (Class394.Method1930((Entity)entityLivingBase)) return false;
        return true;
    }

    public static boolean Method1929(Entity entity) {
        if (entity instanceof EntityWolf && ((EntityWolf)entity).isAngry()) {
            return false;
        }
        if (entity instanceof EntityAgeable) return true;
        if (entity instanceof EntityAmbientCreature) return true;
        if (entity instanceof EntitySquid) {
            return true;
        }
        if (!(entity instanceof EntityIronGolem)) return false;
        if (((EntityIronGolem)entity).getRevengeTarget() != null) return false;
        return true;
    }

    public static boolean Method1930(Entity entity) {
        if (entity instanceof EntityPigZombie) {
            if (((EntityPigZombie)entity).isArmsRaised()) return true;
            if (!((EntityPigZombie)entity).isAngry()) return Class394.Method1933(entity);
            return true;
        }
        if (!(entity instanceof EntityWolf)) {
            if (!(entity instanceof EntityEnderman)) return Class394.Method1933(entity);
            return ((EntityEnderman)entity).isScreaming();
        }
        if (!((EntityWolf)entity).isAngry()) return false;
        if (Minecraft.getMinecraft().player.equals((Object)((EntityWolf)entity).getOwner())) return false;
        return true;
    }

    public static boolean Method1931(Entity entity) {
        if (entity instanceof EntityPigZombie) return true;
        if (entity instanceof EntityWolf) return true;
        if (entity instanceof EntityEnderman) return true;
        return false;
    }

    public static boolean Method1932(Entity entity) {
        if (entity.isCreatureType(EnumCreatureType.CREATURE, false)) {
            if (!Class394.Method1931(entity)) return true;
        }
        if (entity.isCreatureType(EnumCreatureType.AMBIENT, false)) return true;
        if (entity instanceof EntityVillager) return true;
        if (entity instanceof EntityIronGolem) return true;
        if (!Class394.Method1931(entity)) return false;
        if (Class394.Method1930(entity)) return false;
        return true;
    }

    public static boolean Method1933(Entity entity) {
        if (!entity.isCreatureType(EnumCreatureType.MONSTER, false)) return false;
        if (Class394.Method1931(entity)) return false;
        return true;
    }

    public static Block Method1934(double d, double d2, double d3) {
        Block block = null;
        if (Class394.Field9655.player == null) return block;
        AxisAlignedBB axisAlignedBB = Class394.Field9655.player.getRidingEntity() != null ? Class394.Field9655.player.getRidingEntity().getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(d, d2, d3) : Class394.Field9655.player.getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(d, d2, d3);
        int n = (int)axisAlignedBB.minY;
        int n2 = MathHelper.floor((double)axisAlignedBB.minX);
        while (n2 < MathHelper.floor((double)axisAlignedBB.maxX) + 1) {
            for (int i = MathHelper.floor((double)axisAlignedBB.minZ); i < MathHelper.floor((double)axisAlignedBB.maxZ) + 1; ++i) {
                block = Class394.Field9655.world.getBlockState(new BlockPos(n2, n, i)).getBlock();
            }
            ++n2;
        }
        return block;
    }

    public static boolean Method1935(boolean bl) {
        if (Class394.Field9655.player == null) return false;
        if (Class394.Field9655.player.fallDistance >= Float.intBitsToFloat(0x40400000)) {
            return false;
        }
        boolean bl2 = false;
        AxisAlignedBB axisAlignedBB = Class394.Field9655.player.getRidingEntity() != null ? Class394.Field9655.player.getRidingEntity().getEntityBoundingBox() : Class394.Field9655.player.getEntityBoundingBox();
        int n = MathHelper.floor((double)(axisAlignedBB.minY - (bl ? Double.longBitsToDouble((long)1113129726 ^ 0x3F9EB851A9DC1C46L) : Double.longBitsToDouble(4596373779694328218L))));
        int n2 = MathHelper.floor((double)axisAlignedBB.minX);
        while (n2 < MathHelper.floor((double)axisAlignedBB.maxX) + 1) {
            for (int i = MathHelper.floor((double)axisAlignedBB.minZ); i < MathHelper.floor((double)axisAlignedBB.maxZ) + 1; ++i) {
                Block block = Class394.Field9655.world.getBlockState(new BlockPos(n2, n, i)).getBlock();
                if (block instanceof BlockAir) continue;
                if (!(block instanceof BlockLiquid)) {
                    return false;
                }
                bl2 = true;
            }
            ++n2;
        }
        return bl2;
    }

    public static boolean Method1936() {
        return Class394.Method1935(false);
    }

    public static float Method1937(double d, double d2, double d3, EntityLivingBase entityLivingBase) {
        double d4 = (1.0 - entityLivingBase.getDistance(d, d2, d3) / Double.longBitsToDouble((long)1925444733 ^ 0x4028000072C3F47DL)) * (double)Class394.Method1940(new Vec3d(d, d2, d3), entityLivingBase.getEntityBoundingBox());
        return Class394.Method1938(entityLivingBase, Class394.Method1939((float)((d4 * d4 + d4) / Double.longBitsToDouble((long)1911059329 ^ 0x4000000071E87381L) * Double.longBitsToDouble(0x4055400000000000L) + 1.0)));
    }

    public static float Method1938(EntityLivingBase entityLivingBase, float f) {
        float f2 = f;
        f2 = CombatRules.getDamageAfterAbsorb((float)f2, (float)entityLivingBase.getTotalArmorValue(), (float)((float)entityLivingBase.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()));
        if (!entityLivingBase.isPotionActive(MobEffects.RESISTANCE)) return f2;
        return (f2 *= 1.0f - MathHelper.clamp((float)EnchantmentHelper.getEnchantmentModifierDamage((Iterable)entityLivingBase.getArmorInventoryList(), (DamageSource)Field9654), (float)0.0f, (float)Float.intBitsToFloat(1101004800)) / Float.intBitsToFloat(1103626240)) - f2 / Float.intBitsToFloat(0x40800000);
    }

    public static float Method1939(float f) {
        float f2;
        int n = Class394.Field9655.world.getDifficulty().getId();
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

    public static float Method1940(Vec3d vec3d, AxisAlignedBB axisAlignedBB) {
        double d = 1.0 / ((axisAlignedBB.maxX - axisAlignedBB.minX) * Double.longBitsToDouble((long)1533768791 ^ 0x400000005B6B7457L) + 1.0);
        double d2 = 1.0 / ((axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(0x4000000000000000L) + 1.0);
        double d3 = 1.0 / ((axisAlignedBB.maxZ - axisAlignedBB.minZ) * Double.longBitsToDouble(0x4000000000000000L) + 1.0);
        double d4 = (1.0 - Math.floor(1.0 / d) * d) / Double.longBitsToDouble((long)1330179088 ^ 0x400000004F48EC10L);
        double d5 = (1.0 - Math.floor(1.0 / d3) * d3) / Double.longBitsToDouble((long)26418497 ^ 0x4000000001931D41L);
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
            if (Class394.Method1941(new Vec3d(d6 + d4, d7, d8 + d5), vec3d, false, false, false) == null) {
                f += 1.0f;
            }
            f2 += 1.0f;
            f5 += (float)d3;
        }
    }

    public static RayTraceResult Method1941(Vec3d vec3d, Vec3d vec3d2, boolean bl, boolean bl2, boolean bl3) {
        int n = MathHelper.floor((double)vec3d2.x);
        int n2 = MathHelper.floor((double)vec3d2.y);
        int n3 = MathHelper.floor((double)vec3d2.z);
        int n4 = MathHelper.floor((double)vec3d.x);
        int n5 = MathHelper.floor((double)vec3d.y);
        int n6 = MathHelper.floor((double)vec3d.z);
        BlockPos blockPos = new BlockPos(n4, n5, n6);
        IBlockState iBlockState = Class394.Field9655.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        if ((!bl2 || iBlockState.getCollisionBoundingBox((IBlockAccess)Class394.Field9655.world, blockPos) != Block.NULL_AABB) && block.canCollideCheck(iBlockState, bl)) {
            return iBlockState.collisionRayTrace((World)Class394.Field9655.world, blockPos, vec3d, vec3d2);
        }
        RayTraceResult rayTraceResult = null;
        int n7 = 200;
        while (true) {
            --n7;
            if (Double.isNaN(vec3d.x)) return null;
            if (Double.isNaN(vec3d.y)) return null;
            if (Double.isNaN(vec3d.z)) {
                return null;
            }
            if (n4 == n && n5 == n2 && n6 == n3) {
                if (!bl3) return null;
                RayTraceResult rayTraceResult2 = rayTraceResult;
                return rayTraceResult2;
            }
            boolean bl4 = true;
            boolean bl5 = true;
            boolean bl6 = true;
            double d = Double.longBitsToDouble((long)1510992254 ^ 0x408F38005A0FE97EL);
            double d2 = Double.longBitsToDouble((long)1148284063 ^ 0x408F380044716C9FL);
            double d3 = Double.longBitsToDouble(4651998512748167168L);
            if (n > n4) {
                d = (double)n4 + 1.0;
            } else if (n < n4) {
                d = (double)n4 + 0.0;
            } else {
                bl4 = false;
            }
            if (n2 > n5) {
                d2 = (double)n5 + 1.0;
            } else if (n2 < n5) {
                d2 = (double)n5 + 0.0;
            } else {
                bl5 = false;
            }
            if (n3 > n6) {
                d3 = (double)n6 + 1.0;
            } else if (n3 < n6) {
                d3 = (double)n6 + 0.0;
            } else {
                bl6 = false;
            }
            double d4 = Double.longBitsToDouble((long)661288272 ^ 0x408F3800276A7550L);
            double d5 = Double.longBitsToDouble(4651998512748167168L);
            double d6 = Double.longBitsToDouble((long)1487711216 ^ 0x408F380058ACABF0L);
            double d7 = vec3d2.x - vec3d.x;
            double d8 = vec3d2.y - vec3d.y;
            double d9 = vec3d2.z - vec3d.z;
            Double.compare(d4, Double.longBitsToDouble((long)823895270 ^ 0x80000000311BA4E6L));
            Double.compare(d5, Double.longBitsToDouble(Long.MIN_VALUE));
            Double.compare(d6, Double.longBitsToDouble(Long.MIN_VALUE));
            Double.compare(d4, d5);
            Double.compare(d5, d6);
            EnumFacing enumFacing = n3 > n6 ? EnumFacing.NORTH : EnumFacing.SOUTH;
            vec3d = new Vec3d(vec3d.x + d7 * d6, vec3d.y + d8 * d6, d3);
            n4 = MathHelper.floor((double)vec3d.x) - (enumFacing == EnumFacing.EAST ? 1 : 0);
            n5 = MathHelper.floor((double)vec3d.y) - (enumFacing == EnumFacing.UP ? 1 : 0);
            n6 = MathHelper.floor((double)vec3d.z) - (enumFacing == EnumFacing.SOUTH ? 1 : 0);
            blockPos = new BlockPos(n4, n5, n6);
            IBlockState iBlockState2 = Class394.Field9655.world.getBlockState(blockPos);
            Block block2 = iBlockState2.getBlock();
            if (bl2 && iBlockState2.getMaterial() != Material.PORTAL && iBlockState2.getCollisionBoundingBox((IBlockAccess)Class394.Field9655.world, blockPos) == Block.NULL_AABB) continue;
            if (block2.canCollideCheck(iBlockState2, bl) && !(block2 instanceof BlockWeb)) {
                return iBlockState2.collisionRayTrace((World)Class394.Field9655.world, blockPos, vec3d, vec3d2);
            }
            rayTraceResult = new RayTraceResult(RayTraceResult.Type.MISS, vec3d, enumFacing, blockPos);
        }
    }

    public static Vec3d Method1942(Entity entity, double d) {
        return Class394.Method1944(entity, d, d, d);
    }

    public static Vec3d Method1943(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(Class394.Method1942(entity, f));
    }

    public static Vec3d Method1944(Entity entity, double d, double d2, double d3) {
        return new Vec3d((entity.posX - entity.lastTickPosX) * d, (entity.posY - entity.lastTickPosY) * d2, (entity.posZ - entity.lastTickPosZ) * d3);
    }

    public static float Method1945(float f, float f2, float f3) {
        if (f <= f2) {
            f = f2;
        }
        if (!(f >= f3)) return f;
        return f3;
    }

    public static List Method1946(BlockPos blockPos, float f, int n, boolean bl, boolean bl2, int n2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n3 = blockPos.getX();
        int n4 = blockPos.getY();
        int n5 = blockPos.getZ();
        int n6 = n3 - (int)f;
        block0: while ((float)n6 <= (float)n3 + f) {
            int n7 = n5 - (int)f;
            while (true) {
                if (!((float)n7 <= (float)n5 + f)) {
                    ++n6;
                    continue block0;
                }
                int n8 = bl2 ? n4 - (int)f : n4;
                while (true) {
                    float f2 = n8;
                    float f3 = bl2 ? (float)n4 + f : (float)(n4 + n);
                    if (!(f2 < f3)) break;
                    double d = (n3 - n6) * (n3 - n6) + (n5 - n7) * (n5 - n7) + (bl2 ? (n4 - n8) * (n4 - n8) : 0);
                    if (!(!(d < (double)(f * f)) || bl && d < (double)((f - 1.0f) * (f - 1.0f)))) {
                        BlockPos blockPos2 = new BlockPos(n6, n8 + n2, n7);
                        arrayList.add(blockPos2);
                    }
                    ++n8;
                }
                ++n7;
            }
            break;
        }
        return arrayList;
    }

    public static List Method1947(BlockPos blockPos, BlockPos blockPos2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n = blockPos.getX();
        int n2 = blockPos.getY();
        int n3 = blockPos.getZ();
        int n4 = blockPos2.getX();
        int n5 = blockPos2.getY();
        int n6 = blockPos2.getZ();
        int n7 = Math.min(n, n4);
        while (n7 <= Math.max(n, n4)) {
            for (int i = Math.min(n3, n6); i <= Math.max(n3, n6); ++i) {
                for (int j = Math.min(n2, n5); j <= Math.max(n2, n5); ++j) {
                    arrayList.add(new BlockPos(n7, j, i));
                }
            }
            ++n7;
        }
        return arrayList;
    }

    public static double[] Method1948(double d, double d2, double d3, Entity entity) {
        double d4 = entity.posX - d;
        double d5 = entity.posY - d2;
        double d6 = entity.posZ - d3;
        double d7 = Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6);
        double d8 = Math.asin(d5 /= d7);
        double d9 = Math.atan2(d6 /= d7, d4 /= d7);
        d8 = d8 * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L);
        d9 = d9 * Double.longBitsToDouble((long)1085715909 ^ 0x4066800040B6B5C5L) / Double.longBitsToDouble(4614256656552045848L);
        return new double[]{d9 += Double.longBitsToDouble(4636033603912859648L), d8};
    }

    public static boolean Method1949(Entity entity) {
        if (entity.getName().equals(Class394.Field9655.player.getName())) return true;
        if (entity.isDead) return true;
        return false;
    }

    public static BlockPos Method1950(Entity entity) {
        return new BlockPos(Math.floor(entity.posX), Math.floor(entity.posY), Math.floor(entity.posZ));
    }

    public static List Method1951(Entity entity) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        double d = Math.floor(axisAlignedBB.minX);
        while (d < Math.ceil(axisAlignedBB.maxX)) {
            for (double d2 = Math.floor(axisAlignedBB.minY); d2 < Math.ceil(axisAlignedBB.maxY); d2 += 1.0) {
                for (double d3 = Math.floor(axisAlignedBB.minZ); d3 < Math.ceil(axisAlignedBB.maxZ); d3 += 1.0) {
                    arrayList.add(new BlockPos(d, d2, d3));
                }
            }
            d += 1.0;
        }
        return arrayList;
    }

    public static void Method1952(float f) {
        Class394.Field9655.timer.tickLength = Float.intBitsToFloat(1112014848) / f;
    }

    public static void Method1953() {
        Class394.Field9655.timer.tickLength = Float.intBitsToFloat(1112014848);
    }

    public static double Method1954(double d, double d2, double d3, double d4, double d5, double d6) {
        return MathHelper.sqrt((double)Class394.Method1955(d, d2, d3, d4, d5, d6));
    }

    public static double Method1955(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        return d7 * d7 + d8 * d8 + d9 * d9;
    }

    public static List Method1956(boolean bl, boolean bl2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.add(new BlockPos(Class394.Field9655.player.posX + Double.longBitsToDouble(0x3FD3333333333333L), Class394.Field9655.player.posY, Class394.Field9655.player.posZ + Double.longBitsToDouble(0x3FD3333333333333L)));
        arrayList.add(new BlockPos(Class394.Field9655.player.posX + Double.longBitsToDouble((long)692177147 ^ 0x3FD333331A72FBC8L), Class394.Field9655.player.posY, Class394.Field9655.player.posZ - Double.longBitsToDouble(0x3FD3333333333333L)));
        arrayList.add(new BlockPos(Class394.Field9655.player.posX - Double.longBitsToDouble(0x3FD3333333333333L), Class394.Field9655.player.posY, Class394.Field9655.player.posZ - Double.longBitsToDouble(0x3FD3333333333333L)));
        arrayList.add(new BlockPos(Class394.Field9655.player.posX - Double.longBitsToDouble((long)1376708142 ^ 0x3FD33333613DD51DL), Class394.Field9655.player.posY, Class394.Field9655.player.posZ + Double.longBitsToDouble(0x3FD3333333333333L)));
        ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>();
        for (BlockPos blockPos : arrayList) {
            if (!arrayList2.contains(blockPos.north())) {
                arrayList2.add(blockPos.north());
            }
            if (!arrayList2.contains(blockPos.east())) {
                arrayList2.add(blockPos.east());
            }
            if (!arrayList2.contains(blockPos.south())) {
                arrayList2.add(blockPos.south());
            }
            if (arrayList2.contains(blockPos.west())) continue;
            arrayList2.add(blockPos.west());
        }
        arrayList2.removeAll(arrayList);
        double d = Class394.Field9655.player.boundingBox.maxX - Class394.Field9655.player.boundingBox.minY;
        int n = (int)d;
        ArrayList<BlockPos> arrayList3 = new ArrayList<BlockPos>();
        if (bl) {
            for (BlockPos object2 : arrayList) {
                arrayList3.add(object2.down());
            }
        }
        if (bl2) {
            for (BlockPos blockPos : arrayList2) {
                arrayList3.add(blockPos.down());
            }
        }
        for (int i = 0; i < n; ++i) {
            for (BlockPos blockPos : arrayList2) {
                arrayList3.add(blockPos.up(i));
            }
        }
        arrayList3.add(((BlockPos)arrayList3.get(arrayList3.size() - 1)).up());
        for (BlockPos blockPos : arrayList) {
            arrayList3.add(blockPos.up(n));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator iterator = arrayList3.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            blockPos = (BlockPos)iterator.next();
            if (!Class394.Field9655.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class394.Field9655.world, blockPos)) continue;
            arrayList4.add(blockPos);
        }
        return arrayList4;
    }

    public static double[] Method1957(double[] dArray) {
        return new double[]{dArray[0] * Double.longBitsToDouble(0x4010000000000000L), Double.longBitsToDouble(Double.doubleToRawLongBits(dArray[1] * Double.longBitsToDouble(4626322717132455937L)) + 1L), dArray[2] * Double.longBitsToDouble(0x4010000000000000L)};
    }

    public static List Method1958(Class clazz, AxisAlignedBB axisAlignedBB) {
        return Class394.Field9655.world.getEntitiesWithinAABB(clazz, axisAlignedBB.expand(Double.longBitsToDouble(0x4014000000000000L), Double.longBitsToDouble(0x4014000000000000L), Double.longBitsToDouble((long)1539178421 ^ 0x401400005BBDFFB5L))).stream().filter(arg_0 -> Class394.Method1960(axisAlignedBB, arg_0)).collect(Collectors.toList());
    }

    public static double Method1959(EntityLivingBase entityLivingBase, double d) {
        double d2 = d;
        PotionEffect potionEffect = entityLivingBase.getActivePotionEffect(MobEffects.SPEED);
        if (potionEffect != null) {
            d2 += d * ((double)potionEffect.getAmplifier() + 1.0) * Double.longBitsToDouble(4596373779694328218L);
        }
        if ((potionEffect = entityLivingBase.getActivePotionEffect(MobEffects.SLOWNESS)) == null) return d2;
        d2 -= d * ((double)potionEffect.getAmplifier() + 1.0) * Double.longBitsToDouble((long)448541447 ^ 0x3FC33333298F0034L);
        return d2;
    }

    private static boolean Method1960(AxisAlignedBB axisAlignedBB, Entity entity) {
        return axisAlignedBB.intersects(entity.getEntityBoundingBox());
    }

    static {
        Field9655 = Minecraft.getMinecraft();
        Field9654 = new DamageSource("explosion").setDifficultyScaled().setExplosion();
    }

    private static String Method1961(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 23;
            cArray2[n] = (char)(cArray[n] ^ (0x4266 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

