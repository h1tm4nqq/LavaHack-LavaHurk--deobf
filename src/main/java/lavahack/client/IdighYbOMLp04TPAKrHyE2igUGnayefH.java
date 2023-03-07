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
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.HqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.NpLD4Y9BQz09xupQ5Y4k0cWtQD2oQqfE;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
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

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class IdighYbOMLp04TPAKrHyE2igUGnayefH
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13006 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)612271467 ^ 0x40200000247E856BL), 1.0, Double.longBitsToDouble((long)1162933726 ^ 0x402E00004550F5DEL), (boolean)((long)1492232881 ^ (long)1492232881)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13007 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("IgnoreIfNotSurrounded", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1172726 ^ (long)1172726)));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field13008 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this).Method3788().Method3789();
    private EntityPlayer Field13009 = null;
    private BlockPos Field13010 = null;
    private int Field13011;

    public IdighYbOMLp04TPAKrHyE2igUGnayefH() {
        super("SmartCityESP(FpsKiller)", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4544(RenderWorldLastEvent renderWorldLastEvent) {
        if (IdighYbOMLp04TPAKrHyE2igUGnayefH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (IdighYbOMLp04TPAKrHyE2igUGnayefH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
        if (IdighYbOMLp04TPAKrHyE2igUGnayefH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || IdighYbOMLp04TPAKrHyE2igUGnayefH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Field13009 = null;
            this.Field13010 = null;
            return;
        }
        this.Field13009 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field13006.Method368());
        if (this.Field13009 == null) {
            this.Field13010 = null;
            return;
        }
        List list = this.Method4547();
        if (this.Field13007.Method365() && list.stream().map(IdighYbOMLp04TPAKrHyE2igUGnayefH::Method4553).anyMatch(Material::isReplaceable)) {
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
        HqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg hqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg = new HqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg(IdighYbOMLp04TPAKrHyE2igUGnayefH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        Class[] classArray = new Class[(int)((long)1796925224 ^ (long)1796925225)];
        classArray[(int)624249451L ^ 0x25354A6B] = BlockPos.class;
        hqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg.override("getBlockState", hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs.Method1727(IBlockState.class, classArray).Method7663(arg_0 -> IdighYbOMLp04TPAKrHyE2igUGnayefH.Method4552(blockPos, arg_0)));
        BlockPos blockPos2 = this.Method4546((World)hqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg, entity);
        if (blockPos2 != null) return IdighYbOMLp04TPAKrHyE2igUGnayefH.Method4548((World)hqWwdjUPEx3jgiXgw8GSblRx7afa9Rhg, (double)blockPos2.getX() + Double.longBitsToDouble((long)728108598 ^ 0x3FE000002B660E36L), (double)blockPos2.getY() + 1.0, (double)blockPos2.getZ() + Double.longBitsToDouble(0xC31CC15B5A4A8F0DL ^ 0xFCFCC15B5A4A8F0DL), entity);
        return 0.0;
    }

    private BlockPos Method4546(World world, Entity entity) {
        HashMap<Float, BlockPos> hashMap = new HashMap<Float, BlockPos>();
        Object object = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7758(Float.intBitsToFloat(0x4F8CAC2C ^ 0xF2CAC2C), (boolean)((long)1898935515 ^ (long)1898935514), ((int)-2062508554L ^ 0x85109DF6) != 0).iterator();
        while (true) {
            BlockPos blockPos;
            if (!object.hasNext()) {
                object = hashMap.keySet().stream().max(Float::compare).orElse(Float.valueOf(0.0f));
                blockPos = (BlockPos)hashMap.get(object);
                if (blockPos != null) return (BlockPos)hashMap.get(object);
                return null;
            }
            blockPos = (BlockPos)object.next();
            hashMap.put(Float.valueOf(IdighYbOMLp04TPAKrHyE2igUGnayefH.Method4548(world, (double)blockPos.getX() + Double.longBitsToDouble((long)1372104680 ^ 0x3FE0000051C8A7E8L), blockPos.getY() + (int)((long)-762360569 ^ (long)-762360570), (double)blockPos.getZ() + Double.longBitsToDouble(0xD03DBB6A2CDA8E70L ^ 0xEFDDBB6A2CDA8E70L), entity)), blockPos);
        }
    }

    private List Method4547() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = (int)((long)-603019821 ^ (long)-603019821);
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            arrayList.add(new BlockPos(this.Field13009.posX, this.Field13009.posY, this.Field13009.posZ).offset(enumFacing));
            ++n2;
        }
        return arrayList;
    }

    public static float Method4548(World world, double d, double d2, double d3, Entity entity) {
        return IdighYbOMLp04TPAKrHyE2igUGnayefH.Method4549(world, d, d2, d3, entity, entity.getEntityBoundingBox(), (int)1504096553L ^ 0x59A6B129);
    }

    public static float Method4549(World world, double d, double d2, double d3, Entity entity, AxisAlignedBB axisAlignedBB, int n) {
        float f = Float.intBitsToFloat(0x138FA9A ^ 0x4078FA9A);
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
        d6 = world.getBlockDensity(vec3d, axisAlignedBB);
        double d7 = (1.0 - d5) * d6;
        float f2 = (int)((d7 * d7 + d7) / Double.longBitsToDouble((long)1011513374 ^ 0x400000003C4A781EL) * Double.longBitsToDouble((long)1148638667 ^ 0x401C00004476D5CBL) * (double)f + 1.0);
        double d8 = 1.0;
        if (!(entity instanceof EntityLivingBase)) return (float)d8;
        d8 = IdighYbOMLp04TPAKrHyE2igUGnayefH.Method4550((EntityLivingBase)entity, IdighYbOMLp04TPAKrHyE2igUGnayefH.Method4551(world, f2), new Explosion(world, null, d, d2, d3, Float.intBitsToFloat((int)1904750516L ^ 0x31482FB4), (boolean)((long)-2120097233 ^ (long)-2120097233), ((int)1283207232L ^ 0x4C7C3041) != 0));
        return (float)d8;
    }

    public static float Method4550(EntityLivingBase entityLivingBase, float f, Explosion explosion) {
        if (!(entityLivingBase instanceof EntityPlayer)) return CombatRules.getDamageAfterAbsorb((float)f, (float)entityLivingBase.getTotalArmorValue(), (float)((float)entityLivingBase.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()));
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        DamageSource damageSource = DamageSource.causeExplosionDamage((Explosion)explosion);
        f = CombatRules.getDamageAfterAbsorb((float)f, (float)entityPlayer.getTotalArmorValue(), (float)((float)entityPlayer.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()));
        int n = EnchantmentHelper.getEnchantmentModifierDamage((Iterable)entityPlayer.getArmorInventoryList(), (DamageSource)damageSource);
        n = EnchantmentHelper.getEnchantmentModifierDamage((Iterable)entityPlayer.getArmorInventoryList(), (DamageSource)damageSource);
        float f2 = MathHelper.clamp((float)n, (float)0.0f, (float)Float.intBitsToFloat((int)((long)2037953740 ^ (long)953726156)));
        if (!entityLivingBase.isPotionActive(Potion.getPotionById((int)((int)-911129396L ^ 0xC9B144C7)))) return f *= 1.0f - f2 / Float.intBitsToFloat(0x3499A7FE ^ 0x7551A7FE);
        f -= f / Float.intBitsToFloat((int)((long)798361052 ^ (long)1863714268));
        return f *= 1.0f - f2 / Float.intBitsToFloat(0x3499A7FE ^ 0x7551A7FE);
    }

    public static float Method4551(World world, float f) {
        float f2;
        int n = world.getDifficulty().getId();
        if (n == 0) {
            f2 = 0.0f;
            return f * f2;
        }
        if (n == (int)((long)1583920254 ^ (long)1583920255) << 1) {
            f2 = 1.0f;
            return f * f2;
        }
        if (n == (int)((long)-1286016337 ^ (long)-1286016338)) {
            f2 = Float.intBitsToFloat(0xEB0F658 ^ 0x31B0F658);
            return f * f2;
        }
        f2 = Float.intBitsToFloat((int)((long)884298794 ^ (long)192238634));
        return f * f2;
    }

    private static IBlockState Method4552(BlockPos blockPos, Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        BlockPos blockPos2 = (BlockPos)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-1588739434L ^ 0xA14DC296);
        if (blockPos != blockPos2) return IdighYbOMLp04TPAKrHyE2igUGnayefH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2);
        return new NpLD4Y9BQz09xupQ5Y4k0cWtQD2oQqfE(Blocks.AIR, IdighYbOMLp04TPAKrHyE2igUGnayefH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2));
    }

    private static Material Method4553(BlockPos blockPos) {
        return IdighYbOMLp04TPAKrHyE2igUGnayefH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-847295397 ^ (long)-847295397);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1998531753 ^ (long)1998531670);
            int n2 = (int)((long)2013895510 ^ (long)2013895505) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1697845899L ^ 0x9ACCE218) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

