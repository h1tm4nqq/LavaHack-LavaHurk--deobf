//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.List;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc;
import lavahack.client.lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$1;
import lavahack.client.lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private EntityPlayerSP Field11151;
    private Vec3d Field11152;
    private Vec3d Field11153;
    private float Field11154;
    private float Field11155;
    private AxisAlignedBB Field11156;
    private boolean Field11157;
    private RayTraceResult Field11158;
    private lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field11159;
    final lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc Field11160;
    private int Field11161;

    public lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc2, EntityPlayerSP entityPlayerSP, lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        this.Field11160 = lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc2;
        this.Field11151 = entityPlayerSP;
        this.Field11159 = lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Method3073(this.Field11151.posX, this.Field11151.posY + (double)this.Field11151.getEyeHeight(), this.Field11151.posZ, this.Field11151.rotationYaw, this.Field11151.rotationPitch);
        Vec3d vec3d = new Vec3d((double)(MathHelper.cos((float)(this.Field11154 / Float.intBitsToFloat((int)((long)168248461 ^ (long)1228096653)) * Float.intBitsToFloat(0x5F0AF82C ^ 0x1F43F7F7))) * Float.intBitsToFloat((int)((long)452053809 ^ (long)617749563))), Double.longBitsToDouble((long)1625294833 ^ 0x3FB99999F9799E6BL), (double)(MathHelper.sin((float)(this.Field11154 / Float.intBitsToFloat((int)((long)71058449 ^ (long)1191724049)) * Float.intBitsToFloat(0x402D8D9B ^ 0x648240))) * Float.intBitsToFloat(0x3B45E22C ^ 0x5663526)));
        this.Field11152 = this.Field11152.subtract(vec3d);
        this.Method3074(this.Field11152);
        this.Field11153 = new Vec3d((double)(-MathHelper.sin((float)(this.Field11154 / Float.intBitsToFloat((int)((long)892709921 ^ (long)1979821089)) * Float.intBitsToFloat((int)1248657098L ^ 0xA25F111))) * MathHelper.cos((float)(this.Field11155 / Float.intBitsToFloat((int)((long)1065383433 ^ (long)2092201481)) * Float.intBitsToFloat((int)((long)1335447283 ^ (long)265306408))))), (double)(-MathHelper.sin((float)(this.Field11155 / Float.intBitsToFloat((int)1726046547L ^ 0x25D56153) * Float.intBitsToFloat((int)((long)1210802392 ^ (long)140668675))))), (double)(MathHelper.cos((float)(this.Field11154 / Float.intBitsToFloat(0x78BF5BC6 ^ 0x3B8B5BC6) * Float.intBitsToFloat((int)1082932185L ^ 0xC53402))) * MathHelper.cos((float)(this.Field11155 / Float.intBitsToFloat((int)((long)1694657843 ^ (long)641101107)) * Float.intBitsToFloat(0x4954178F ^ 0x91D1854)))));
        this.Method3075(this.Field11153, this.Method3071());
    }

    public void Method3068() {
        Vec3d vec3d = this.Field11152.add(this.Field11153);
        RayTraceResult rayTraceResult = this.Field11151.getEntityWorld().rayTraceBlocks(this.Field11152, vec3d, (this.Field11159 == lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9886 ? (int)24730322L ^ 0x1795AD3 : (int)-871036797L ^ 0xCC150883) != 0, (!this.Method3069() ? (int)((long)153563949 ^ (long)153563948) : (int)2066628340L ^ 0x7B2E3EF4) != 0, (boolean)((long)1817885816 ^ (long)1817885816));
        if (rayTraceResult != null) {
            vec3d = rayTraceResult.hitVec;
        }
        this.Method3070(vec3d, rayTraceResult);
        if (this.Field11158 != null) {
            this.Field11157 = (int)((long)1729244047 ^ (long)1729244046);
            this.Method3074(this.Field11158.hitVec);
            return;
        }
        if (this.Field11152.y <= 0.0) {
            this.Field11157 = (int)((long)-1911651738 ^ (long)-1911651737);
            return;
        }
        this.Field11152 = this.Field11152.add(this.Field11153);
        float f = Float.intBitsToFloat(0x5FDB12A ^ 0x3A80C18E);
        if (this.Field11151.getEntityWorld().isMaterialInBB(this.Field11156, Material.WATER)) {
            float f2 = f = this.Field11159 == lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9883 ? Float.intBitsToFloat((int)((long)1613556956 ^ (long)1597338950)) : Float.intBitsToFloat((int)((long)1934290544 ^ (long)1275470525));
        }
        if (this.Field11159 == lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9886) {
            f = Float.intBitsToFloat((int)984128754L ^ 0x5C319ED);
        }
        this.Field11153 = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2107(this.Field11153, f);
        this.Field11153 = this.Field11153.subtract(0.0, (double)this.Method3072(), 0.0);
        this.Method3074(this.Field11152);
    }

    private boolean Method3069() {
        switch (lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$1.Field17441[this.Field11159.ordinal()]) {
            case 1: 
            case 2: {
                return (int)((long)1969099087 ^ (long)1969099086) != 0;
            }
        }
        return ((int)-653988018L ^ 0xD904EF4E) != 0;
    }

    private void Method3070(Vec3d vec3d, RayTraceResult rayTraceResult) {
        Entity entity = null;
        RayTraceResult rayTraceResult2 = null;
        double d = 0.0;
        List list = Minecraft.getMinecraft().world.getEntitiesWithinAABBExcludingEntity((Entity)this.Field11151, this.Field11156.expand(this.Field11153.x, this.Field11153.y, this.Field11153.z).grow(1.0, 1.0, 1.0));
        for (Entity entity2 : list) {
            if (!entity2.canBeCollidedWith()) continue;
            float f = entity2.getCollisionBorderSize();
            AxisAlignedBB axisAlignedBB = entity2.getEntityBoundingBox().expand((double)f, (double)f, (double)f);
            RayTraceResult rayTraceResult3 = axisAlignedBB.calculateIntercept(this.Field11152, vec3d);
            if (rayTraceResult3 == null) continue;
            double d2 = this.Field11152.distanceTo(rayTraceResult3.hitVec);
            if (!(d2 < d)) {
                Double.compare(d, 0.0);
            }
            entity = entity2;
            rayTraceResult2 = rayTraceResult3;
            d = d2;
        }
        if (entity != null) {
            this.Field11158 = new RayTraceResult(entity, rayTraceResult2.hitVec);
            return;
        }
        this.Field11158 = rayTraceResult;
    }

    private float Method3071() {
        switch (lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$1.Field17441[this.Field11159.ordinal()]) {
            case 3: {
                int n = this.Field11151.getHeldItem(EnumHand.MAIN_HAND).getItem().getMaxItemUseDuration(this.Field11151.getHeldItem(EnumHand.MAIN_HAND)) - this.Field11151.getItemInUseCount();
                float f = (float)n / Float.intBitsToFloat((int)((long)1816314995 ^ (long)769836147));
                f = (f * f + f * 2.0f) / Float.intBitsToFloat((int)((long)1406652319 ^ (long)328716191));
                if (!(f > 1.0f)) return f * 2.0f * this.Field11159.Method2152();
                f = 1.0f;
                return f * 2.0f * this.Field11159.Method2152();
            }
        }
        return this.Field11159.Method2152();
    }

    private float Method3072() {
        return this.Field11159.Method2153();
    }

    private void Method3073(double d, double d2, double d3, float f, float f2) {
        this.Field11152 = new Vec3d(d, d2, d3);
        this.Field11154 = f;
        this.Field11155 = f2;
    }

    private void Method3074(Vec3d vec3d) {
        this.Field11152 = new Vec3d(vec3d.x, vec3d.y, vec3d.z);
        double d = (this.Field11159 == lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9883 ? Double.longBitsToDouble((long)439731181 ^ 0x3FE000001A35C3EDL) : Double.longBitsToDouble(0xA08645311718ED19L ^ 0x9F5645311718ED19L)) / Double.longBitsToDouble((long)1635801741 ^ 0x4000000061805A8DL);
        this.Field11156 = new AxisAlignedBB(vec3d.x - d, vec3d.y - d, vec3d.z - d, vec3d.x + d, vec3d.y + d, vec3d.z + d);
    }

    private void Method3075(Vec3d vec3d, float f) {
        this.Field11153 = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2109(vec3d, (float)vec3d.length());
        this.Field11153 = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2107(this.Field11153, f);
    }

    public boolean Method3076() {
        return this.Field11157;
    }

    public RayTraceResult Method3077() {
        return this.Field11158;
    }

    static Vec3d Method3078(lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11152;
    }

    static boolean Method3079(lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11157;
    }

    static RayTraceResult Method3080(lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        return lVKQK6sGRjX2tZMjhOyTFtK2lNFdL4tc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11158;
    }
}

