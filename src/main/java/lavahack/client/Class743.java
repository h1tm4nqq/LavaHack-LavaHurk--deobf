//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.*;

public class Class743
{
    private EntityPlayerSP Field11151;
    private Vec3d Field11152;
    private Vec3d Field11153;
    private float Field11154;
    private float Field11155;
    private AxisAlignedBB Field11156;
    private boolean Field11157;
    private RayTraceResult Field11158;
    private Class452 Field11159;
    final Class74 Field11160;
    private int Field11161;
    
    public Class743(final Class74 field11160, final EntityPlayerSP field11161, final Class452 field11162) {
        this.Field11160 = field11160;
        this.Field11151 = field11161;
        this.Field11159 = field11162;
        this.Method3073(this.Field11151.posX, this.Field11151.posY + this.Field11151.getEyeHeight(), this.Field11151.posZ, this.Field11151.rotationYaw, this.Field11151.rotationPitch);
        this.Method3074(this.Field11152 = this.Field11152.subtract(new Vec3d((double)(MathHelper.cos(this.Field11154 / Float.intBitsToFloat(1127481344) * Float.intBitsToFloat(1078530011)) * Float.intBitsToFloat(1042536202)), Double.longBitsToDouble((long)1625294833 ^ 0x3FB99999F9799E6BL), (double)(MathHelper.sin(this.Field11154 / Float.intBitsToFloat(1127481344) * Float.intBitsToFloat(1078530011)) * Float.intBitsToFloat(1042536202)))));
        this.Method3075(this.Field11153 = new Vec3d((double)(-MathHelper.sin(this.Field11154 / Float.intBitsToFloat(1127481344) * Float.intBitsToFloat(1078530011)) * MathHelper.cos(this.Field11155 / Float.intBitsToFloat(1127481344) * Float.intBitsToFloat(1078530011))), (double)(-MathHelper.sin(this.Field11155 / Float.intBitsToFloat(1127481344) * Float.intBitsToFloat(1078530011))), (double)(MathHelper.cos(this.Field11154 / Float.intBitsToFloat(1127481344) * Float.intBitsToFloat(1078530011)) * MathHelper.cos(this.Field11155 / Float.intBitsToFloat(1127481344) * Float.intBitsToFloat(1078530011)))), this.Method3071());
    }
    
    public void Method3068() {
        Vec3d vec3d = this.Field11152.add(this.Field11153);
        final RayTraceResult rayTraceBlocks = this.Field11151.getEntityWorld().rayTraceBlocks(this.Field11152, vec3d, this.Field11159 == Class452.Field9886, !this.Method3069(), false);
        if (rayTraceBlocks != null) {
            vec3d = rayTraceBlocks.hitVec;
        }
        this.Method3070(vec3d, rayTraceBlocks);
        if (this.Field11158 != null) {
            this.Field11157 = true;
            this.Method3074(this.Field11158.hitVec);
            return;
        }
        if (this.Field11152.y <= 0.0) {
            this.Field11157 = true;
            return;
        }
        this.Field11152 = this.Field11152.add(this.Field11153);
        float n = Float.intBitsToFloat(1065185444);
        if (this.Field11151.getEntityWorld().isMaterialInBB(this.Field11156, Material.WATER)) {
            n = ((this.Field11159 == Class452.Field9883) ? Float.intBitsToFloat(1058642330) : Float.intBitsToFloat(1061997773));
        }
        if (this.Field11159 == Class452.Field9886) {
            n = Float.intBitsToFloat(1064011039);
        }
        this.Field11153 = Class447.Method2107(this.Field11153, n);
        this.Field11153 = this.Field11153.subtract(0.0, (double)this.Method3072(), 0.0);
        this.Method3074(this.Field11152);
    }
    
    private boolean Method3069() {
        switch (Class2068.Field17441[this.Field11159.ordinal()]) {
            case 1:
            case 2: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private void Method3070(final Vec3d vec3d, final RayTraceResult field11158) {
        Entity entity = null;
        RayTraceResult rayTraceResult = null;
        double d1 = 0.0;
        for (final Entity entity2 : Minecraft.getMinecraft().world.getEntitiesWithinAABBExcludingEntity((Entity)this.Field11151, this.Field11156.expand(this.Field11153.x, this.Field11153.y, this.Field11153.z).grow(1.0, 1.0, 1.0))) {
            if (!entity2.canBeCollidedWith()) {
                continue;
            }
            final float getCollisionBorderSize = entity2.getCollisionBorderSize();
            final RayTraceResult calculateIntercept = entity2.getEntityBoundingBox().expand((double)getCollisionBorderSize, (double)getCollisionBorderSize, (double)getCollisionBorderSize).calculateIntercept(this.Field11152, vec3d);
            if (calculateIntercept == null) {
                continue;
            }
            final double distanceTo = this.Field11152.distanceTo(calculateIntercept.hitVec);
            if (distanceTo >= d1) {
                Double.compare(d1, 0.0);
            }
            entity = entity2;
            rayTraceResult = calculateIntercept;
            d1 = distanceTo;
        }
        if (entity != null) {
            this.Field11158 = new RayTraceResult(entity, rayTraceResult.hitVec);
        }
        else {
            this.Field11158 = field11158;
        }
    }
    
    private float Method3071() {
        switch (Class2068.Field17441[this.Field11159.ordinal()]) {
            case 3: {
                final float n = (this.Field11151.getHeldItem(EnumHand.MAIN_HAND).getItem().getMaxItemUseDuration(this.Field11151.getHeldItem(EnumHand.MAIN_HAND)) - this.Field11151.getItemInUseCount()) / Float.intBitsToFloat(1101004800);
                float n2 = (n * n + n * 2.0f) / Float.intBitsToFloat(1077936128);
                if (n2 > 1.0f) {
                    n2 = 1.0f;
                }
                return n2 * 2.0f * this.Field11159.Method2152();
            }
            default: {
                return this.Field11159.Method2152();
            }
        }
    }
    
    private float Method3072() {
        return this.Field11159.Method2153();
    }
    
    private void Method3073(final double n, final double n2, final double n3, final float field11154, final float field11155) {
        this.Field11152 = new Vec3d(n, n2, n3);
        this.Field11154 = field11154;
        this.Field11155 = field11155;
    }
    
    private void Method3074(final Vec3d vec3d) {
        this.Field11152 = new Vec3d(vec3d.x, vec3d.y, vec3d.z);
        final double n = ((this.Field11159 == Class452.Field9883) ? Double.longBitsToDouble((long)439731181 ^ 0x3FE000001A35C3EDL) : Double.longBitsToDouble(4598175219545276416L)) / Double.longBitsToDouble((long)1635801741 ^ 0x4000000061805A8DL);
        this.Field11156 = new AxisAlignedBB(vec3d.x - n, vec3d.y - n, vec3d.z - n, vec3d.x + n, vec3d.y + n, vec3d.z + n);
    }
    
    private void Method3075(final Vec3d vec3d, final float n) {
        this.Field11153 = Class447.Method2109(vec3d, (float)vec3d.length());
        this.Field11153 = Class447.Method2107(this.Field11153, n);
    }
    
    public boolean Method3076() {
        return this.Field11157;
    }
    
    public RayTraceResult Method3077() {
        return this.Field11158;
    }
    
    static Vec3d Method3078(final Class743 class743) {
        return class743.Field11152;
    }
    
    static boolean Method3079(final Class743 class743) {
        return class743.Field11157;
    }
    
    static RayTraceResult Method3080(final Class743 class743) {
        return class743.Field11158;
    }
}
