//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import lavahack.client.Class495;
import lavahack.client.Class814;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

public class Class1811 {
    public Class814[] Field16336;
    private String Field16337 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1811(Class814 ... class814Array) {
        this.Field16336 = class814Array;
    }

    public Class1811 Method6833(Class495 class495, Class1811 class1811) {
        if (this.Field16336.length != class1811.Field16336.length) {
            throw new IllegalArgumentException("Length of vec1 != length of vec2");
        }
        Class814[] class814Array = new Class814[this.Field16336.length];
        int n = 0;
        while (true) {
            if (n >= this.Field16336.length) {
                this.Field16336 = class814Array;
                return this;
            }
            class814Array[n] = class495.Method2282(this.Field16336[n], class1811.Field16336[n]);
            ++n;
        }
    }

    public static Class1811 Method6834(AxisAlignedBB axisAlignedBB, Class2027 class2027) {
        return new Class1811(new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), class2027), new Class814(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), class2027));
    }

    private static String Method6835(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 108;
            cArray2[n] = (char)(cArray[n] ^ (0x4AC4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

