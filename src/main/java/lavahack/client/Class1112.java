//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.common.*;
import java.util.function.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.enchantment.*;
import net.minecraft.util.math.*;
import net.minecraft.potion.*;
import net.minecraft.init.*;

@Class1887
public class Class1112 extends Class42
{
    private final Class44 Field13006;
    private final Class44 Field13007;
    private final Class1612 Field13008;
    private EntityPlayer Field13009;
    private BlockPos Field13010;
    private int Field13011;
    
    public Class1112() {
        super("SmartCityESP(FpsKiller)", Class97.Field8342);
        this.Field13006 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)612271467 ^ 0x40200000247E856BL), 1.0, Double.longBitsToDouble((long)1162933726 ^ 0x402E00004550F5DEL), false));
        this.Field13007 = this.Method23(new Class44("IgnoreIfNotSurrounded", this, false));
        this.Field13008 = new Class1612(this).Method3788().Method3789();
        this.Field13009 = null;
        this.Field13010 = null;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4544(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
        final List method4547 = this.Method4547();
        if (this.Field13007.Method365() && method4547.stream().map((Function<? super Object, ?>)Class1112::Method4553).anyMatch(Material::isReplaceable)) {
            this.Field13009 = null;
            this.Field13010 = null;
            return;
        }
        final HashMap<Object, BlockPos> hashMap = new HashMap<Object, BlockPos>();
        for (final BlockPos blockPos : method4547) {
            hashMap.put(this.Method4545((Entity)this.Field13009, blockPos), blockPos);
        }
        this.Field13010 = (BlockPos)hashMap.get(hashMap.keySet().stream().max((Comparator<? super Double>)Double::compare).orElse(0.0));
    }
    
    private double Method4545(final Entity entity, final BlockPos blockPos) {
        final Class1567 class1567 = new Class1567(Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        class1567.override("getBlockState", Class1763.Method1727(IBlockState.class, BlockPos.class).Method7663(Class1112::Method4552));
        final BlockPos method4546 = this.Method4546((World)class1567, entity);
        if (method4546 == null) {
            return 0.0;
        }
        return Method4548((World)class1567, method4546.getX() + Double.longBitsToDouble((long)728108598 ^ 0x3FE000002B660E36L), method4546.getY() + 1.0, method4546.getZ() + Double.longBitsToDouble(4602678819172646912L), entity);
    }
    
    private BlockPos Method4546(final World world, final Entity entity) {
        final HashMap<Float, BlockPos> hashMap = new HashMap<Float, BlockPos>();
        for (final BlockPos blockPos : Class2155.Method7758(Float.intBitsToFloat(1084227584), true, false)) {
            hashMap.put(Method4548(world, blockPos.getX() + Double.longBitsToDouble((long)1372104680 ^ 0x3FE0000051C8A7E8L), blockPos.getY() + 1, blockPos.getZ() + Double.longBitsToDouble(4602678819172646912L), entity), blockPos);
        }
        final Float n = hashMap.keySet().stream().max(Float::compare).orElse(0.0f);
        if (hashMap.get(n) == null) {
            return null;
        }
        return hashMap.get(n);
    }
    
    private List Method4547() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final EnumFacing[] HORIZONTALS = EnumFacing.HORIZONTALS;
        for (int length = HORIZONTALS.length, i = 0; i < length; ++i) {
            list.add(new BlockPos(this.Field13009.posX, this.Field13009.posY, this.Field13009.posZ).offset(HORIZONTALS[i]));
        }
        return list;
    }
    
    public static float Method4548(final World world, final double n, final double n2, final double n3, final Entity entity) {
        return Method4549(world, n, n2, n3, entity, entity.getEntityBoundingBox(), 0);
    }
    
    public static float Method4549(final World world, final double n, final double n2, final double n3, final Entity entity, final AxisAlignedBB axisAlignedBB, final int n4) {
        final float intBitsToFloat = Float.intBitsToFloat(1094713344);
        double n5 = entity.getDistance(n, n2, n3);
        if (n5 > intBitsToFloat) {
            return 0.0f;
        }
        if (n4 > 0) {
            final Vec3d method1942 = Class394.Method1942(entity, n4);
            n5 = Class394.Method1954(method1942.x, method1942.y, method1942.z, n, n2, n3);
        }
        final double n6 = (1.0 - n5 / intBitsToFloat) * world.getBlockDensity(new Vec3d(n, n2, n3), axisAlignedBB);
        final float n7 = (float)(int)((n6 * n6 + n6) / Double.longBitsToDouble((long)1011513374 ^ 0x400000003C4A781EL) * Double.longBitsToDouble((long)1148638667 ^ 0x401C00004476D5CBL) * intBitsToFloat + 1.0);
        double n8 = 1.0;
        if (entity instanceof EntityLivingBase) {
            n8 = Method4550((EntityLivingBase)entity, Method4551(world, n7), new Explosion(world, (Entity)null, n, n2, n3, Float.intBitsToFloat(1086324736), false, true));
        }
        return (float)n8;
    }
    
    public static float Method4550(final EntityLivingBase entityLivingBase, float n, final Explosion explosion) {
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
    
    public static float Method4551(final World world, final float n) {
        final int getId = world.getDifficulty().getId();
        return n * ((getId == 0) ? 0.0f : ((getId == 2) ? 1.0f : ((getId == 1) ? Float.intBitsToFloat(1056964608) : Float.intBitsToFloat(1069547520))));
    }
    
    private static IBlockState Method4552(final BlockPos blockPos, final Class424 class424) {
        final BlockPos blockPos2 = (BlockPos)class424.Method2054(0);
        if (blockPos == blockPos2) {
            return (IBlockState)new Class174(Blocks.AIR, Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2));
        }
        return Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2);
    }
    
    private static Material Method4553(final BlockPos blockPos) {
        return Class1112.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getMaterial();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1EDA ^ 0xE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
