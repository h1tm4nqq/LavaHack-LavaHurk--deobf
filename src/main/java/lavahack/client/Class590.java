//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import java.util.*;

public enum Class590
{
    Field10504("Sides", 0, false, Class1435.Method5744().Method7663(class424 -> {
        final Vec3d vec3d = (Vec3d)class424.Method2054(0);
        Class132.Method903(Class132.Method905(new BlockPos(vec3d.x, vec3d.y, vec3d.z)));
        return null;
    })), 
    Field10505("Square", 1, false, Class1435.Method5744().Method7663(class424 -> {
        final Vec3d vec3d = (Vec3d)class424.Method2054(0);
        Class132.Method903(Class132.Method904(new BlockPos(vec3d.x, vec3d.y, vec3d.z)));
        return null;
    })), 
    Field10506("SmartSquare", 2, false, Class1435.Method5744().Method7663(class424 -> {
        final Vec3d vec3d = (Vec3d)class424.Method2054(0);
        final Entity entity = (Entity)class424.Method2054(1);
        final BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final EnumFacing getFacingFromVector = EnumFacing.getFacingFromVector((float)entity.motionX, 0.0f, (float)entity.motionZ);
        for (final EnumFacing enumFacing : EnumFacing.HORIZONTALS) {
            if (enumFacing != getFacingFromVector) {
                list.add(blockPos.offset(enumFacing));
            }
        }
        Class132.Method903((List)list);
        return null;
    })), 
    Field10507("PlayerPosition", 3, true, Class1435.Method5744().Method7663(class424 -> {
        final Vec3d vec3d = (Vec3d)class424.Method2054(0);
        final Entity entity = (Entity)class424.Method2054(1);
        Class132.Method898(new BlockPos(vec3d.x, vec3d.y, vec3d.z));
        double x = vec3d.x;
        double y = vec3d.y;
        double z = vec3d.z;
        for (int n = Class132.Method900(Class132.Field8485).Method335() * 20 + Class132.Method901(Class132.Field8485).Method335(), i = 0; i < n; ++i) {
            x += entity.motionX;
            if (!Class132.Method902(Class132.Field8485).Method365()) {
                y += entity.motionY;
            }
            z += entity.motionZ;
            Class132.Method898(new BlockPos(x, y, z));
        }
        return null;
    })), 
    Field10508("Player", 4, true, Class1435.Method5744().Method7663(class424 -> {
        final Vec3d vec3d = (Vec3d)class424.Method2054(0);
        final Entity entity = (Entity)class424.Method2054(1);
        Class132.Method898(new BlockPos(vec3d.x, vec3d.y, vec3d.z));
        double x = vec3d.x;
        double y = vec3d.y;
        double z = vec3d.z;
        for (int n = Class132.Method900(Class132.Field8485).Method335() * 20 + Class132.Method901(Class132.Field8485).Method335(), i = 0; i < n; ++i) {
            x += entity.motionX;
            if (!Class132.Method902(Class132.Field8485).Method365()) {
                y += entity.motionY;
            }
            z += entity.motionZ;
            final BlockPos blockPos = new BlockPos(x + Double.longBitsToDouble(4599075939470750515L), y, z + Double.longBitsToDouble(4599075939470750515L));
            final BlockPos blockPos2 = new BlockPos(x + Double.longBitsToDouble((long)1147542287 ^ 0x3FD333337755283CL), y, z - Double.longBitsToDouble(4599075939470750515L));
            final BlockPos blockPos3 = new BlockPos(x - Double.longBitsToDouble((long)225277774 ^ 0x3FD333333E5E447DL), y, z + Double.longBitsToDouble((long)1157738399 ^ 0x3FD3333376329CACL));
            final BlockPos blockPos4 = new BlockPos(x - Double.longBitsToDouble((long)1922183124 ^ 0x3FD3333341A11CE7L), y, z - Double.longBitsToDouble(4599075939470750515L));
            Class132.Method898(blockPos);
            Class132.Method898(blockPos2);
            Class132.Method898(blockPos3);
            Class132.Method898(blockPos4);
        }
        return null;
    })), 
    Field10509("Scaffold", 5, false, Class1435.Method5744().Method7663(class424 -> {
        final Vec3d vec3d = (Vec3d)class424.Method2054(0);
        final Entity entity = (Entity)class424.Method2054(1);
        final BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        final BlockPos method897 = Class132.Method897(entity, blockPos);
        if (Class1036.Method4213(blockPos).isEmpty() && method897 != null) {
            Class132.Method898(method897);
        }
        Class132.Method898(blockPos);
        return null;
    })), 
    Field10510("ScaffoldDamage", 6, false, Class1435.Method5744().Method7663(class424 -> {
        final Vec3d vec3d = (Vec3d)class424.Method2054(0);
        final Entity entity = (Entity)class424.Method2054(1);
        final BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        final BlockPos method897 = Class132.Method897(entity, blockPos);
        if (Class1036.Method4213(blockPos).isEmpty() && method897 != null) {
            Class132.Method898(method897);
        }
        Class132.Method898(blockPos);
        if (Class132.Method899(entity, blockPos) != null) {
            Class132.Method898(blockPos);
        }
        return null;
    }));
    
    private final boolean Field10511;
    private final Class1763 Field10512;
    private static final Class590[] Field10513;
    private int Field10514;
    
    private Class590(final String name, final int ordinal, final boolean field10511, final Class1763 field10512) {
        this.Field10511 = field10511;
        this.Field10512 = field10512;
    }
    
    public boolean Method2555() {
        return this.Field10511;
    }
    
    public Class1763 Method2556() {
        return this.Field10512;
    }
    
    static {
        Field10513 = new Class590[] { Class590.Field10504, Class590.Field10505, Class590.Field10506, Class590.Field10507, Class590.Field10508, Class590.Field10509, Class590.Field10510 };
    }
    
    private static String Method2564(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5E6D ^ 0xBD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
