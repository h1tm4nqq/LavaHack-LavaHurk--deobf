//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;

public class Class1229 extends Class42
{
    private final Class44 Field13583;
    private int Field13584;
    
    public Class1229() {
        super("Triangulation", Class97.Field8345);
        this.Field13583 = this.Method23(new Class44("Distance", this, Double.longBitsToDouble((long)647687634 ^ 0x40100000269AEDD2L), 1.0, Double.longBitsToDouble((long)1225636607 ^ 0x40240000490DBAFFL), false));
    }
    
    @Override
    public void Method38() {
        if (Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1393.Method5506().Method1886("yaw: " + Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + " pitch: " + Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch);
        final Vec3d method4206 = Class1036.Method4206();
        final RayTraceResult rayTraceBlocks = Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(method4206, method4206.add(Class2029.Method7509(Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch, Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, this.Field13583.Method367())));
        if (rayTraceBlocks == null) {
            return;
        }
        final BlockPos getBlockPos = rayTraceBlocks.getBlockPos();
        Class1393.Method5506().Method1886("x: " + getBlockPos.getX() + " y: " + getBlockPos.getY() + " z: " + getBlockPos.getZ());
        this.Method22();
    }
    
    private RayTraceResult Method4947(final double n, final double n2, final double n3) {
        final double n4 = n2 / Double.longBitsToDouble(4640537203540230144L) * Double.longBitsToDouble(4614256656552045848L);
        final double a = n / Double.longBitsToDouble(4640537203540230144L) * Double.longBitsToDouble(4614256656552045848L);
        final double n5 = Math.cos(n4) * Math.sin(a) * n3;
        final double n6 = Math.cos(a) * n3;
        final double n7 = Math.sin(n4) * Math.sin(a) * n3;
        final Vec3d vec3d = new Vec3d(Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.eyeHeight, Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        return Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, vec3d.add(n5, n6, n7));
    }
    
    public void Method4948(final RenderWorldLastEvent renderWorldLastEvent) {
        if (Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        final Vec3d getPositionEyes = Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionEyes(renderWorldLastEvent.getPartialTicks());
        final RayTraceResult rayTraceBlocks = Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(getPositionEyes, getPositionEyes.add(Class2029.Method7509(Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch, Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, this.Field13583.Method367())));
        if (rayTraceBlocks == null) {
            return;
        }
        Class815.Method3446(Class815.Method3447(new AxisAlignedBB(rayTraceBlocks.getBlockPos())), 2.0f, new Class2027(255, 255, 255, 120), Class815.Field11486, Class2008.Field17214);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6F6F ^ 0x66));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
