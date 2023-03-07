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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
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

public class EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn {
    private static final DamageSource Field9654;
    private static final Minecraft Field9655;
    private int Field9656;

    public static boolean Method1914(EntityPlayer entityPlayer) {
        int n;
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(entityPlayer.posX - Double.longBitsToDouble(0xFCCEFA6BCC424B55L ^ 0xC31DC958FF717866L), entityPlayer.posY + (double)entityPlayer.getEyeHeight(), entityPlayer.posZ + Double.longBitsToDouble((long)1055509640 ^ 0x3FD333330DDAFFBBL), entityPlayer.posX + Double.longBitsToDouble((long)442483653 ^ 0x3FD33333296CF0F6L), entityPlayer.posY + Double.longBitsToDouble((long)1308247832 ^ 0x400400004DFA4718L), entityPlayer.posZ - Double.longBitsToDouble((long)1102140996 ^ 0x3FD3333372826577L));
        if (!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getCollisionBoxes((Entity)entityPlayer, axisAlignedBB).isEmpty()) {
            n = (int)-1923650691L ^ 0x8D576B7C;
            return n != 0;
        }
        n = (int)((long)2057021910 ^ (long)2057021910);
        return n != 0;
    }

    public static float Method1915(EntityPlayer entityPlayer) {
        return entityPlayer.getHealth();
    }

    public static boolean Method1916(double d) {
        return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getBlockState(new BlockPos(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posX, EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posY + d, EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posZ)).getBlock().equals(Blocks.WATER);
    }

    public static boolean Method1917(BlockPos blockPos) {
        int n;
        if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.rayTraceBlocks(new Vec3d(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posX, EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posY + (double)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getEyeHeight(), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posZ), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(0xBA9A2761C7BD1CB8L ^ 0x857A2761C7BD1CB8L), (double)blockPos.getY() + Double.longBitsToDouble((long)311653876 ^ 0x3FF80000129375F4L), (double)blockPos.getZ() + Double.longBitsToDouble(0x79FFEAB4C555D26BL ^ 0x461FEAB4C555D26BL)), ((int)-600338775L ^ 0xDC378EA9) != 0, (boolean)((long)270035180 ^ (long)270035181), (boolean)((long)-912073397 ^ (long)-912073397)) == null) {
            n = (int)((long)888723805 ^ (long)888723804);
            return n != 0;
        }
        n = (int)366731719L ^ 0x15DBE1C7;
        return n != 0;
    }

    public static double Method1918(Entity entity) {
        double d = Math.abs(entity.posX - entity.prevPosX);
        double d2 = Math.abs(entity.posZ - entity.prevPosZ);
        double d3 = Math.sqrt(d * d + d2 * d2);
        return (d3 *= (double)Field9655.getRenderPartialTicks()) * Double.longBitsToDouble(0x2A89CE56D9B0E54DL ^ 0x6ABDCE56D9B0E54DL);
    }

    public static boolean Method1919() {
        double d = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posY - Double.longBitsToDouble((long)783794158 ^ 0x3F9EB851C532A156L);
        int n = MathHelper.floor((double)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posX);
        while (n < MathHelper.ceil((double)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posX)) {
            for (int i = MathHelper.floor((double)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posZ); i < MathHelper.ceil((double)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posZ); ++i) {
                BlockPos blockPos = new BlockPos(n, MathHelper.floor((double)d), i);
                if (!(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getBlockState(blockPos).getBlock() instanceof BlockLiquid)) continue;
                return ((int)879604863L ^ 0x346DB47E) != 0;
            }
            ++n;
        }
        return ((int)-411665683L ^ 0xE7767AED) != 0;
    }

    public static boolean Method1920(BlockPos blockPos) {
        Entity entity;
        Iterator iterator = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.loadedEntityList.iterator();
        do {
            if (!iterator.hasNext()) return (int)((long)-1992106854 ^ (long)-1992106854) != 0;
        } while ((entity = (Entity)iterator.next()).equals((Object)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player) || entity instanceof EntityItem || !new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox()));
        return (int)((long)2071203510 ^ (long)2071203511) != 0;
    }

    public static BlockPos Method1921(Entity entity) {
        return new BlockPos(dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2123(entity.getPositionVector(), (int)((long)997107565 ^ (long)997107565)));
    }

    public static boolean Method1922(boolean bl) {
        if (!bl) return (int)((long)622111104 ^ (long)622111104) != 0;
        if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player == null) return (int)((long)622111104 ^ (long)622111104) != 0;
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player, CPacketEntityAction.Action.STOP_SNEAKING));
        return (int)((long)622111104 ^ (long)622111104) != 0;
    }

    public static EntityPlayer Method1923(float f, float f2) {
        EntityPlayer entityPlayer = null;
        int n = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.playerEntities.size();
        int n2 = (int)((long)-1635188651 ^ (long)-1635188651);
        while (n2 < n) {
            EntityPlayer entityPlayer2 = (EntityPlayer)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.playerEntities.get(n2);
            if (!(!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1927((EntityLivingBase)entityPlayer2) && ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method35() && null.Field10954.Method309("Zamorozka") || EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1926((EntityLivingBase)entityPlayer2, f, f2))) {
                if (entityPlayer == null) {
                    entityPlayer = entityPlayer2;
                } else if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getDistanceSq((Entity)entityPlayer2) < EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getDistanceSq((Entity)entityPlayer)) {
                    entityPlayer = entityPlayer2;
                }
            }
            ++n2;
        }
        return entityPlayer;
    }

    public static EntityPlayer Method1924(float f) {
        return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1923(f, f);
    }

    public static Entity Method1925(float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        EntityLivingBase entityLivingBase = null;
        Iterator iterator = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            EntityLivingBase entityLivingBase2;
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityLivingBase) || !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1927(entityLivingBase2 = (EntityLivingBase)entity) && ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method35() && null.Field10954.Method309("Zamorozka") || EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1926(entityLivingBase2, f, f2) || EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1928(entityLivingBase2, bl, bl2, bl3)) continue;
            if (entityLivingBase == null) {
                entityLivingBase = entityLivingBase2;
                continue;
            }
            if (!(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getDistanceSq((Entity)entityLivingBase2) < EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getDistanceSq((Entity)entityLivingBase))) continue;
            entityLivingBase = entityLivingBase2;
        }
        return entityLivingBase;
    }

    public static boolean Method1926(EntityLivingBase entityLivingBase, double d, double d2) {
        int n;
        if (!((double)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getDistance((Entity)entityLivingBase) > (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.canEntityBeSeen((Entity)entityLivingBase) ? d : d2) || entityLivingBase == EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player || entityLivingBase.getHealth() <= 0.0f || entityLivingBase.isDead || n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(entityLivingBase.getName()))) {
            n = (int)((long)319631846 ^ (long)319631846);
            return n != 0;
        }
        n = (int)((long)-240286681 ^ (long)-240286682);
        return n != 0;
    }

    public static boolean Method1927(EntityLivingBase entityLivingBase) {
        int n;
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16245 != null && leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16245.equals((Object)entityLivingBase)) {
            n = (int)((long)2044401616 ^ (long)2044401617);
            return n != 0;
        }
        n = (int)((long)-594266509 ^ (long)-594266509);
        return n != 0;
    }

    public static boolean Method1928(EntityLivingBase entityLivingBase, boolean bl, boolean bl2, boolean bl3) {
        int n;
        if (bl && !(entityLivingBase instanceof EntityPlayer) || bl2 && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1929((Entity)entityLivingBase) || bl3 && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1930((Entity)entityLivingBase)) {
            n = (int)-1790433004L ^ 0x95482915;
            return n != 0;
        }
        n = (int)((long)881477078 ^ (long)881477078);
        return n != 0;
    }

    public static boolean Method1929(Entity entity) {
        int n;
        if (entity instanceof EntityWolf && ((EntityWolf)entity).isAngry()) {
            return ((int)1501283621L ^ 0x597BC525) != 0;
        }
        if (entity instanceof EntityAgeable) return ((int)1129951643L ^ 0x4359B19A) != 0;
        if (entity instanceof EntityAmbientCreature) return ((int)1129951643L ^ 0x4359B19A) != 0;
        if (entity instanceof EntitySquid) {
            return ((int)1129951643L ^ 0x4359B19A) != 0;
        }
        if (entity instanceof EntityIronGolem && ((EntityIronGolem)entity).getRevengeTarget() == null) {
            n = (int)831817483L ^ 0x3194870A;
            return n != 0;
        }
        n = (int)((long)-1594182587 ^ (long)-1594182587);
        return n != 0;
    }

    public static boolean Method1930(Entity entity) {
        int n;
        if (entity instanceof EntityPigZombie) {
            if (((EntityPigZombie)entity).isArmsRaised()) return ((int)-1586283399L ^ 0xA1733C78) != 0;
            if (!((EntityPigZombie)entity).isAngry()) return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1933(entity);
            return ((int)-1586283399L ^ 0xA1733C78) != 0;
        }
        if (!(entity instanceof EntityWolf)) {
            if (!(entity instanceof EntityEnderman)) return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1933(entity);
            return ((EntityEnderman)entity).isScreaming();
        }
        if (((EntityWolf)entity).isAngry() && !Minecraft.getMinecraft().player.equals((Object)((EntityWolf)entity).getOwner())) {
            n = (int)((long)-1065107462 ^ (long)-1065107461);
            return n != 0;
        }
        n = (int)((long)-243943804 ^ (long)-243943804);
        return n != 0;
    }

    public static boolean Method1931(Entity entity) {
        int n;
        if (!(entity instanceof EntityPigZombie || entity instanceof EntityWolf || entity instanceof EntityEnderman)) {
            n = (int)((long)-426624483 ^ (long)-426624483);
            return n != 0;
        }
        n = (int)-752177239L ^ 0xD32AAFA8;
        return n != 0;
    }

    public static boolean Method1932(Entity entity) {
        int n;
        if (entity.isCreatureType(EnumCreatureType.CREATURE, ((int)1802186811L ^ 0x6B6B303B) != 0) && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1931(entity) || entity.isCreatureType(EnumCreatureType.AMBIENT, (boolean)((long)2026740289 ^ (long)2026740289)) || entity instanceof EntityVillager || entity instanceof EntityIronGolem || EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1931(entity) && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1930(entity)) {
            n = (int)-751313659L ^ 0xD337DD04;
            return n != 0;
        }
        n = (int)((long)36193582 ^ (long)36193582);
        return n != 0;
    }

    public static boolean Method1933(Entity entity) {
        int n;
        if (entity.isCreatureType(EnumCreatureType.MONSTER, (boolean)((long)293719219 ^ (long)293719219)) && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1931(entity)) {
            n = (int)1882955779L ^ 0x703BA002;
            return n != 0;
        }
        n = (int)((long)-820413046 ^ (long)-820413046);
        return n != 0;
    }

    public static Block Method1934(double d, double d2, double d3) {
        Block block = null;
        if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player == null) return block;
        AxisAlignedBB axisAlignedBB = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getRidingEntity() != null ? EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getRidingEntity().getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(d, d2, d3) : EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(d, d2, d3);
        int n = (int)axisAlignedBB.minY;
        int n2 = MathHelper.floor((double)axisAlignedBB.minX);
        while (n2 < MathHelper.floor((double)axisAlignedBB.maxX) + ((int)1389722804L ^ 0x52D57CB5)) {
            for (int i = MathHelper.floor((double)axisAlignedBB.minZ); i < MathHelper.floor((double)axisAlignedBB.maxZ) + ((int)-2061231227L ^ 0x85241B84); ++i) {
                block = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getBlockState(new BlockPos(n2, n, i)).getBlock();
            }
            ++n2;
        }
        return block;
    }

    public static boolean Method1935(boolean bl) {
        if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player == null) return ((int)-999778446L ^ 0xC4689772) != 0;
        if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.fallDistance >= Float.intBitsToFloat((int)1813263916L ^ 0x2C54362C)) {
            return ((int)-714217120L ^ 0xD56DE960) != 0;
        }
        int n = (int)((long)-829199220 ^ (long)-829199220);
        AxisAlignedBB axisAlignedBB = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getRidingEntity() != null ? EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getRidingEntity().getEntityBoundingBox() : EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getEntityBoundingBox();
        int n2 = MathHelper.floor((double)(axisAlignedBB.minY - (bl ? Double.longBitsToDouble((long)1113129726 ^ 0x3F9EB851A9DC1C46L) : Double.longBitsToDouble(0x7D805B6E483F5F0L ^ 0x38119C2F7D1A6C6AL))));
        int n3 = MathHelper.floor((double)axisAlignedBB.minX);
        while (n3 < MathHelper.floor((double)axisAlignedBB.maxX) + ((int)-966245151L ^ 0xC66844E0)) {
            for (int i = MathHelper.floor((double)axisAlignedBB.minZ); i < MathHelper.floor((double)axisAlignedBB.maxZ) + ((int)1310037134L ^ 0x4E15948F); ++i) {
                Block block = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getBlockState(new BlockPos(n3, n2, i)).getBlock();
                if (block instanceof BlockAir) continue;
                if (!(block instanceof BlockLiquid)) {
                    return ((int)-271280305L ^ 0xEFD4974F) != 0;
                }
                n = (int)598629719L ^ 0x23AE5D56;
            }
            ++n3;
        }
        return n != 0;
    }

    public static boolean Method1936() {
        return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1935(((int)-2024868696L ^ 0x874EF4A8) != 0);
    }

    public static float Method1937(double d, double d2, double d3, EntityLivingBase entityLivingBase) {
        double d4 = (1.0 - entityLivingBase.getDistance(d, d2, d3) / Double.longBitsToDouble((long)1925444733 ^ 0x4028000072C3F47DL)) * (double)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1940(new Vec3d(d, d2, d3), entityLivingBase.getEntityBoundingBox());
        return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1938(entityLivingBase, EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1939((float)((d4 * d4 + d4) / Double.longBitsToDouble((long)1911059329 ^ 0x4000000071E87381L) * Double.longBitsToDouble(0x94FC99AB4C5BCCAAL ^ 0xD4A9D9AB4C5BCCAAL) + 1.0)));
    }

    public static float Method1938(EntityLivingBase entityLivingBase, float f) {
        float f2 = f;
        f2 = CombatRules.getDamageAfterAbsorb((float)f2, (float)entityLivingBase.getTotalArmorValue(), (float)((float)entityLivingBase.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()));
        if (!entityLivingBase.isPotionActive(MobEffects.RESISTANCE)) return f2;
        return (f2 *= 1.0f - MathHelper.clamp((float)EnchantmentHelper.getEnchantmentModifierDamage((Iterable)entityLivingBase.getArmorInventoryList(), (DamageSource)Field9654), (float)0.0f, (float)Float.intBitsToFloat((int)2055577449L ^ 0x3B259F69)) / Float.intBitsToFloat((int)((long)1923632051 ^ (long)861948851))) - f2 / Float.intBitsToFloat((int)((long)1191867438 ^ (long)126514222));
    }

    public static float Method1939(float f) {
        float f2;
        int n = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getDifficulty().getId();
        if (n == 0) {
            f2 = 0.0f;
            return f * f2;
        }
        if (n == (int)((long)-1021933016 ^ (long)-1021933015) << 1) {
            f2 = 1.0f;
            return f * f2;
        }
        if (n == (int)((long)-1612197259 ^ (long)-1612197260)) {
            f2 = Float.intBitsToFloat(0x7A6294FB ^ 0x456294FB);
            return f * f2;
        }
        f2 = Float.intBitsToFloat((int)858020688L ^ 0xCE45B50);
        return f * f2;
    }

    public static float Method1940(Vec3d vec3d, AxisAlignedBB axisAlignedBB) {
        double d = 1.0 / ((axisAlignedBB.maxX - axisAlignedBB.minX) * Double.longBitsToDouble((long)1533768791 ^ 0x400000005B6B7457L) + 1.0);
        double d2 = 1.0 / ((axisAlignedBB.maxY - axisAlignedBB.minY) * Double.longBitsToDouble(0xF747EDB6BE0DF816L ^ 0xB747EDB6BE0DF816L) + 1.0);
        double d3 = 1.0 / ((axisAlignedBB.maxZ - axisAlignedBB.minZ) * Double.longBitsToDouble(0xB959ED9750F015B8L ^ 0xF959ED9750F015B8L) + 1.0);
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
            if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1941(new Vec3d(d6 + d4, d7, d8 + d5), vec3d, (boolean)((long)1254620418 ^ (long)1254620418), ((int)1639540827L ^ 0x61B9685B) != 0, (boolean)((long)695893665 ^ (long)695893665)) == null) {
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
        IBlockState iBlockState = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        if ((!bl2 || iBlockState.getCollisionBoundingBox((IBlockAccess)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world, blockPos) != Block.NULL_AABB) && block.canCollideCheck(iBlockState, bl)) {
            return iBlockState.collisionRayTrace((World)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world, blockPos, vec3d, vec3d2);
        }
        RayTraceResult rayTraceResult = null;
        int n7 = ((int)1950729395L ^ 0x7445C4AA) << 3;
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
            int n8 = (int)((long)-1373227649 ^ (long)-1373227650);
            int n9 = (int)((long)-652193165 ^ (long)-652193166);
            int n10 = (int)758166140L ^ 0x2D30B27D;
            double d = Double.longBitsToDouble((long)1510992254 ^ 0x408F38005A0FE97EL);
            double d2 = Double.longBitsToDouble((long)1148284063 ^ 0x408F380044716C9FL);
            double d3 = Double.longBitsToDouble(0x7185F77675B2940DL ^ 0x310ACF7675B2940DL);
            if (n > n4) {
                d = (double)n4 + 1.0;
            } else if (n < n4) {
                d = (double)n4 + 0.0;
            } else {
                n8 = (int)799753973L ^ 0x2FAB46F5;
            }
            if (n2 > n5) {
                d2 = (double)n5 + 1.0;
            } else if (n2 < n5) {
                d2 = (double)n5 + 0.0;
            } else {
                n9 = (int)((long)-1971914673 ^ (long)-1971914673);
            }
            if (n3 > n6) {
                d3 = (double)n6 + 1.0;
            } else if (n3 < n6) {
                d3 = (double)n6 + 0.0;
            } else {
                n10 = (int)((long)-484781431 ^ (long)-484781431);
            }
            double d4 = Double.longBitsToDouble((long)661288272 ^ 0x408F3800276A7550L);
            double d5 = Double.longBitsToDouble(0x552E1030DF26B1B1L ^ 0x15A12830DF26B1B1L);
            double d6 = Double.longBitsToDouble((long)1487711216 ^ 0x408F380058ACABF0L);
            double d7 = vec3d2.x - vec3d.x;
            double d8 = vec3d2.y - vec3d.y;
            double d9 = vec3d2.z - vec3d.z;
            Double.compare(d4, Double.longBitsToDouble((long)823895270 ^ 0x80000000311BA4E6L));
            Double.compare(d5, Double.longBitsToDouble(0xF0097901B224237BL ^ 0x70097901B224237BL));
            Double.compare(d6, Double.longBitsToDouble(0x4F0910B62A5516E8L ^ 0xCF0910B62A5516E8L));
            Double.compare(d4, d5);
            Double.compare(d5, d6);
            EnumFacing enumFacing = n3 > n6 ? EnumFacing.NORTH : EnumFacing.SOUTH;
            vec3d = new Vec3d(vec3d.x + d7 * d6, vec3d.y + d8 * d6, d3);
            n4 = MathHelper.floor((double)vec3d.x) - (enumFacing == EnumFacing.EAST ? (int)1314770650L ^ 0x4E5DCEDB : (int)1077516603L ^ 0x4039993B);
            n5 = MathHelper.floor((double)vec3d.y) - (enumFacing == EnumFacing.UP ? (int)((long)-75913196 ^ (long)-75913195) : (int)((long)-408041125 ^ (long)-408041125));
            n6 = MathHelper.floor((double)vec3d.z) - (enumFacing == EnumFacing.SOUTH ? (int)((long)1854350354 ^ (long)1854350355) : (int)((long)-352859143 ^ (long)-352859143));
            blockPos = new BlockPos(n4, n5, n6);
            IBlockState iBlockState2 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getBlockState(blockPos);
            Block block2 = iBlockState2.getBlock();
            if (bl2 && iBlockState2.getMaterial() != Material.PORTAL && iBlockState2.getCollisionBoundingBox((IBlockAccess)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world, blockPos) == Block.NULL_AABB) continue;
            if (block2.canCollideCheck(iBlockState2, bl) && !(block2 instanceof BlockWeb)) {
                return iBlockState2.collisionRayTrace((World)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world, blockPos, vec3d, vec3d2);
            }
            rayTraceResult = new RayTraceResult(RayTraceResult.Type.MISS, vec3d, enumFacing, blockPos);
        }
    }

    public static Vec3d Method1942(Entity entity, double d) {
        return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1944(entity, d, d, d);
    }

    public static Vec3d Method1943(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1942(entity, f));
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
                    double d = (n3 - n6) * (n3 - n6) + (n5 - n7) * (n5 - n7) + (bl2 ? (n4 - n8) * (n4 - n8) : (int)((long)375286548 ^ (long)375286548));
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
        d8 = d8 * Double.longBitsToDouble(0x2CC803F907BDC121L ^ 0x6CAE83F907BDC121L) / Double.longBitsToDouble(0x1CD487B98083C9E4L ^ 0x5CDDA642D4C7E4FCL);
        d9 = d9 * Double.longBitsToDouble((long)1085715909 ^ 0x4066800040B6B5C5L) / Double.longBitsToDouble(0xC5A710C292603955L ^ 0x85AE3139C624144DL);
        double[] dArray = new double[(int)((long)-446536266 ^ (long)-446536265) << 1];
        dArray[(int)((long)1063209540 ^ (long)1063209540)] = d9 += Double.longBitsToDouble(0x6298F7288C0732L ^ 0x403418F7288C0732L);
        dArray[(int)((long)-658336075 ^ (long)-658336076)] = d8;
        return dArray;
    }

    public static boolean Method1949(Entity entity) {
        int n;
        if (!entity.getName().equals(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.getName()) && !entity.isDead) {
            n = (int)2145466796L ^ 0x7FE139AC;
            return n != 0;
        }
        n = (int)2085491522L ^ 0x7C4E1343;
        return n != 0;
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
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.timer.tickLength = Float.intBitsToFloat((int)((long)827604696 ^ (long)1931230936)) / f;
    }

    public static void Method1953() {
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.timer.tickLength = Float.intBitsToFloat((int)((long)33902052 ^ (long)1078808036));
    }

    public static double Method1954(double d, double d2, double d3, double d4, double d5, double d6) {
        return MathHelper.sqrt((double)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1955(d, d2, d3, d4, d5, d6));
    }

    public static double Method1955(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        return d7 * d7 + d8 * d8 + d9 * d9;
    }

    public static List Method1956(boolean bl, boolean bl2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.add(new BlockPos(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posX + Double.longBitsToDouble(0xBFAF5A30B84496F5L ^ 0x807C69038B77A5C6L), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posY, EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posZ + Double.longBitsToDouble(0x7742771B841E1D6CL ^ 0x48914428B72D2E5FL)));
        arrayList.add(new BlockPos(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posX + Double.longBitsToDouble((long)692177147 ^ 0x3FD333331A72FBC8L), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posY, EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posZ - Double.longBitsToDouble(0x2723CBCD5D9FD9A2L ^ 0x18F0F8FE6EACEA91L)));
        arrayList.add(new BlockPos(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posX - Double.longBitsToDouble(0x965E12311BB58595L ^ 0xA98D21022886B6A6L), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posY, EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posZ - Double.longBitsToDouble(0x26C069AA9C7CC048L ^ 0x19135A99AF4FF37BL)));
        arrayList.add(new BlockPos(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posX - Double.longBitsToDouble((long)1376708142 ^ 0x3FD33333613DD51DL), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posY, EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.posZ + Double.longBitsToDouble(0xC7BA6B8BDF8FEB73L ^ 0xF86958B8ECBCD840L)));
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
        double d = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.boundingBox.maxX - EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.player.boundingBox.minY;
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
        for (int i = (int)566596020L ^ 0x21C591B4; i < n; ++i) {
            for (BlockPos blockPos : arrayList2) {
                arrayList3.add(blockPos.up(i));
            }
        }
        arrayList3.add(((BlockPos)arrayList3.get(arrayList3.size() - (int)((long)731818369 ^ (long)731818368))).up());
        for (BlockPos blockPos : arrayList) {
            arrayList3.add(blockPos.up(n));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator iterator = arrayList3.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos;
            blockPos = (BlockPos)iterator.next();
            if (!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world, blockPos)) continue;
            arrayList4.add(blockPos);
        }
        return arrayList4;
    }

    public static double[] Method1957(double[] dArray) {
        double[] dArray2 = new double[(int)1831034802L ^ 0x6D235FB1];
        dArray2[(int)((long)-564223784 ^ (long)-564223784)] = dArray[(int)-1810436756L ^ 0x9416ED6C] * Double.longBitsToDouble(0x499FE34A0C8C3C25L ^ 0x98FE34A0C8C3C25L);
        dArray2[(int)428496705L ^ 0x198A5740] = Double.longBitsToDouble(Double.doubleToRawLongBits(dArray[(int)-1133153547L ^ 0xBC7572F4] * Double.longBitsToDouble(0x113C622FA88B398AL ^ 0x510F9DD0538B398BL)) + 1L);
        dArray2[(int)((long)-1897409132 ^ (long)-1897409131) << 1] = dArray[(int)((long)667890963 ^ (long)667890962) << 1] * Double.longBitsToDouble(0x5C08430F5D3D956L ^ 0x45D08430F5D3D956L);
        return dArray2;
    }

    public static List Method1958(Class clazz, AxisAlignedBB axisAlignedBB) {
        return EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Field9655.world.getEntitiesWithinAABB(clazz, axisAlignedBB.expand(Double.longBitsToDouble(0x63AD30BCBA42B95FL ^ 0x23B930BCBA42B95FL), Double.longBitsToDouble(0x8FCBA80AB26B717DL ^ 0xCFDFA80AB26B717DL), Double.longBitsToDouble((long)1539178421 ^ 0x401400005BBDFFB5L))).stream().filter(arg_0 -> EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1960(axisAlignedBB, arg_0)).collect(Collectors.toList());
    }

    public static double Method1959(EntityLivingBase entityLivingBase, double d) {
        double d2 = d;
        PotionEffect potionEffect = entityLivingBase.getActivePotionEffect(MobEffects.SPEED);
        if (potionEffect != null) {
            d2 += d * ((double)potionEffect.getAmplifier() + 1.0) * Double.longBitsToDouble(0xFC61277BD6245360L ^ 0xC3A8BEE24FBDCAFAL);
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
        int n = (int)-1670292068L ^ 0x9C715D9C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)15664253 ^ (long)15664258);
            int n2 = (int)-37003374L ^ 0xFDCB5F85;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-194808250 ^ (long)-194816139) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

