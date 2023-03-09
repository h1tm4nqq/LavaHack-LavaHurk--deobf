//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import lavahack.client.Class1036;
import lavahack.client.Class132;
import lavahack.client.Class1435;
import lavahack.client.Class1763;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public enum Class590 {
    Field10504(false, Class1435.Method5744().Method7663(class424 -> {
        Vec3d vec3d = (Vec3d)class424.Method2054(0);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        List list = Class132.Method905(blockPos);
        Class132.Method903(list);
        return null;
    })),
    Field10505(false, Class1435.Method5744().Method7663(class424 -> {
        Vec3d vec3d = (Vec3d)class424.Method2054(0);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        List list = Class132.Method904(blockPos);
        Class132.Method903(list);
        return null;
    })),
    Field10506(false, Class1435.Method5744().Method7663(class424 -> {
        Vec3d vec3d = (Vec3d)class424.Method2054(0);
        Entity entity = (Entity)class424.Method2054(1);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        EnumFacing enumFacing = EnumFacing.getFacingFromVector((float)((float)entity.motionX), (float)0.0f, (float)((float)entity.motionZ));
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                Class132.Method903(arrayList);
                return null;
            }
            EnumFacing enumFacing2 = enumFacingArray[n2];
            if (enumFacing2 != enumFacing) {
                arrayList.add(blockPos.offset(enumFacing2));
            }
            ++n2;
        }
    })),
    Field10507(true, Class1435.Method5744().Method7663(class424 -> {
        Vec3d vec3d = (Vec3d)class424.Method2054(0);
        Entity entity = (Entity)class424.Method2054(1);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        Class132.Method898(blockPos);
        double d = vec3d.x;
        double d2 = vec3d.y;
        double d3 = vec3d.z;
        int n = Class132.Method900(Class132.Field8485).Method335() * 20 + Class132.Method901(Class132.Field8485).Method335();
        int n2 = 0;
        while (n2 < n) {
            d += entity.motionX;
            if (!Class132.Method902(Class132.Field8485).Method365()) {
                d2 += entity.motionY;
            }
            BlockPos blockPos2 = new BlockPos(d, d2, d3 += entity.motionZ);
            Class132.Method898(blockPos2);
            ++n2;
        }
        return null;
    })),
    Field10508(true, Class1435.Method5744().Method7663(class424 -> {
        Vec3d vec3d = (Vec3d)class424.Method2054(0);
        Entity entity = (Entity)class424.Method2054(1);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        Class132.Method898(blockPos);
        double d = vec3d.x;
        double d2 = vec3d.y;
        double d3 = vec3d.z;
        int n = Class132.Method900(Class132.Field8485).Method335() * 20 + Class132.Method901(Class132.Field8485).Method335();
        int n2 = 0;
        while (n2 < n) {
            d += entity.motionX;
            if (!Class132.Method902(Class132.Field8485).Method365()) {
                d2 += entity.motionY;
            }
            BlockPos blockPos2 = new BlockPos(d + Double.longBitsToDouble(0x3FD3333333333333L), d2, (d3 += entity.motionZ) + Double.longBitsToDouble(0x3FD3333333333333L));
            BlockPos blockPos3 = new BlockPos(d + Double.longBitsToDouble((long)1147542287 ^ 0x3FD333337755283CL), d2, d3 - Double.longBitsToDouble(0x3FD3333333333333L));
            BlockPos blockPos4 = new BlockPos(d - Double.longBitsToDouble((long)225277774 ^ 0x3FD333333E5E447DL), d2, d3 + Double.longBitsToDouble((long)1157738399 ^ 0x3FD3333376329CACL));
            BlockPos blockPos5 = new BlockPos(d - Double.longBitsToDouble((long)1922183124 ^ 0x3FD3333341A11CE7L), d2, d3 - Double.longBitsToDouble(0x3FD3333333333333L));
            Class132.Method898(blockPos2);
            Class132.Method898(blockPos3);
            Class132.Method898(blockPos4);
            Class132.Method898(blockPos5);
            ++n2;
        }
        return null;
    })),
    Field10509(false, Class1435.Method5744().Method7663(class424 -> {
        Vec3d vec3d = (Vec3d)class424.Method2054(0);
        Entity entity = (Entity)class424.Method2054(1);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        BlockPos blockPos2 = Class132.Method897(entity, blockPos);
        if (Class1036.Method4213(blockPos).isEmpty() && blockPos2 != null) {
            Class132.Method898(blockPos2);
        }
        Class132.Method898(blockPos);
        return null;
    })),
    Field10510(false, Class1435.Method5744().Method7663(class424 -> {
        Vec3d vec3d = (Vec3d)class424.Method2054(0);
        Entity entity = (Entity)class424.Method2054(1);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        BlockPos blockPos2 = Class132.Method897(entity, blockPos);
        if (Class1036.Method4213(blockPos).isEmpty() && blockPos2 != null) {
            Class132.Method898(blockPos2);
        }
        Class132.Method898(blockPos);
        BlockPos blockPos3 = Class132.Method899(entity, blockPos);
        if (blockPos3 == null) return null;
        Class132.Method898(blockPos);
        return null;
    }));

    private final boolean Field10511;
    private final Class1763 Field10512;
    private int Field10514;

    /*
     * WARNING - void declaration
     */
    private Class590() {
        void var4_2;
        void var3_1;
        this.Field10511 = var3_1;
        this.Field10512 = var4_2;
    }

    public boolean Method2555() {
        return this.Field10511;
    }

    public Class1763 Method2556() {
        return this.Field10512;
    }

    private static String Method2564(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 189;
            cArray2[n] = (char)(cArray[n] ^ (0x5E6D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

