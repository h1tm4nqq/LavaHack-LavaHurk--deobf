//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.CombatRules
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1567;
import lavahack.client.Class1612;
import lavahack.client.Class174;
import lavahack.client.Class1763;
import lavahack.client.Class1887;
import lavahack.client.Class2155;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class424;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.util.CombatRules;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Class1887
public class Class1112
extends Class42 {
    private final Class44 Field13006 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)612271467 ^ 0x40200000247E856BL), 1.0, Double.longBitsToDouble((long)1162933726 ^ 0x402E00004550F5DEL), false));
    private final Class44 Field13007 = this.Method23(new Class44("IgnoreIfNotSurrounded", (Class42)this, false));
    private final Class1612 Field13008 = new Class1612(this).Method3788().Method3789();
    private EntityPlayer Field13009 = null;
    private BlockPos Field13010 = null;
    private int Field13011;

    public Class1112() {
        super("SmartCityESP(FpsKiller)", Class97.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4544(RenderWorldLastEvent renderWorldLastEvent) {
        if (Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13010 == null) {
            return;
        }
        this.Field13008.Method3805(this.Field13010);
    }

    @Override
    public void Method38() {
        super.Method38();
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    @Override
    public void Method39() {
        super.Method39();
        MinecraftForge.EVENT_BUS.unregister((Object)this);
        this.Field13009 = null;
        this.Field13010 = null;
    }

    @Override
    public void Method45() {
        if (Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Field13009 = null;
            this.Field13010 = null;
            return;
        }
        this.Field13009 = Class394.Method1924(this.Field13006.Method368());
        if (this.Field13009 == null) {
            this.Field13010 = null;
            return;
        }
        List list = this.Method4547();
        if (this.Field13007.Method365() && list.stream().map(Class1112::Method4553).anyMatch(Material::isReplaceable)) {
            this.Field13009 = null;
            this.Field13010 = null;
            return;
        }
        HashMap<Double, BlockPos> hashMap = new HashMap<Double, BlockPos>();
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                double d = hashMap.keySet().stream().max(Double::compare).orElse(0.0);
                this.Field13010 = (BlockPos)hashMap.get(d);
                return;
            }
            BlockPos blockPos = (BlockPos)iterator.next();
            hashMap.put(this.Method4545((Entity)this.Field13009, blockPos), blockPos);
        }
    }

    private double Method4545(Entity entity, BlockPos blockPos) {
        Class1567 class1567 = new Class1567(Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        class1567.override("getBlockState", Class1763.Method1727(IBlockState.class, BlockPos.class).Method7663(arg_0 -> Class1112.Method4552(blockPos, arg_0)));
        BlockPos blockPos2 = this.Method4546((World)class1567, entity);
        if (blockPos2 != null) return Class1112.Method4548((World)class1567, (double)blockPos2.getX() + Double.longBitsToDouble((long)728108598 ^ 0x3FE000002B660E36L), (double)blockPos2.getY() + 1.0, (double)blockPos2.getZ() + Double.longBitsToDouble(4602678819172646912L), entity);
        return 0.0;
    }

    private BlockPos Method4546(World world, Entity entity) {
        HashMap<Float, BlockPos> hashMap = new HashMap<Float, BlockPos>();
        Object object = Class2155.Method7758(Float.intBitsToFloat(0x40A00000), true, false).iterator();
        while (true) {
            BlockPos blockPos;
            if (!object.hasNext()) {
                object = hashMap.keySet().stream().max(Float::compare).orElse(Float.valueOf(0.0f));
                blockPos = (BlockPos)hashMap.get(object);
                if (blockPos != null) return (BlockPos)hashMap.get(object);
                return null;
            }
            blockPos = (BlockPos)object.next();
            hashMap.put(Float.valueOf(Class1112.Method4548(world, (double)blockPos.getX() + Double.longBitsToDouble((long)1372104680 ^ 0x3FE0000051C8A7E8L), blockPos.getY() + 1, (double)blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L), entity)), blockPos);
        }
    }

    private List Method4547() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            arrayList.add(new BlockPos(this.Field13009.posX, this.Field13009.posY, this.Field13009.posZ).offset(enumFacing));
            ++n2;
        }
        return arrayList;
    }

    public static float Method4548(World world, double d, double d2, double d3, Entity entity) {
        return Class1112.Method4549(world, d, d2, d3, entity, entity.getEntityBoundingBox(), 0);
    }

    public static float Method4549(World world, double d, double d2, double d3, Entity entity, AxisAlignedBB axisAlignedBB, int n) {
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
        d6 = world.getBlockDensity(vec3d, axisAlignedBB);
        double d7 = (1.0 - d5) * d6;
        float f2 = (int)((d7 * d7 + d7) / Double.longBitsToDouble((long)1011513374 ^ 0x400000003C4A781EL) * Double.longBitsToDouble((long)1148638667 ^ 0x401C00004476D5CBL) * (double)f + 1.0);
        double d8 = 1.0;
        if (!(entity instanceof EntityLivingBase)) return (float)d8;
        d8 = Class1112.Method4550((EntityLivingBase)entity, Class1112.Method4551(world, f2), new Explosion(world, null, d, d2, d3, Float.intBitsToFloat(0x40C00000), false, true));
        return (float)d8;
    }

    public static float Method4550(EntityLivingBase entityLivingBase, float f, Explosion explosion) {
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

    public static float Method4551(World world, float f) {
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

    private static IBlockState Method4552(BlockPos blockPos, Class424 class424) {
        BlockPos blockPos2 = (BlockPos)class424.Method2054(0);
        if (blockPos != blockPos2) return Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2);
        return new Class174(Blocks.AIR, Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2));
    }

    private static Material Method4553(BlockPos blockPos) {
        return Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 14;
            cArray2[n] = (char)(cArray[n] ^ (0x1EDA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

