//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.util.math.*;

public class Class1811
{
    public Class814[] Field16336;
    private String Field16337 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1811(final Class814... field16336) {
        this.Field16336 = field16336;
    }
    
    public Class1811 Method6833(final Class495 class495, final Class1811 class496) {
        if (this.Field16336.length != class496.Field16336.length) {
            throw new IllegalArgumentException("Length of vec1 != length of vec2");
        }
        final Class814[] field16336 = new Class814[this.Field16336.length];
        for (int i = 0; i < this.Field16336.length; ++i) {
            field16336[i] = class495.Method2282(this.Field16336[i], class496.Field16336[i]);
        }
        this.Field16336 = field16336;
        return this;
    }
    
    public static Class1811 Method6834(final AxisAlignedBB axisAlignedBB, final Class2027 class2027) {
        return new Class1811(new Class814[] { new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), class2027) });
    }
    
    private static String Method6835(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4AC4 ^ 0x6C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
