//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.HxNufwqIKdASUlhzDMzyCRUIub26n5S3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.JeYx12lqUujCMKn4MrLDhXikgfUCcw2h;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

public class HxNufwqIKdASUlhzDMzyCRUIub26n5S3 {
    public JeYx12lqUujCMKn4MrLDhXikgfUCcw2h[] Field16336;
    private String Field16337 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public HxNufwqIKdASUlhzDMzyCRUIub26n5S3(JeYx12lqUujCMKn4MrLDhXikgfUCcw2h ... jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray) {
        this.Field16336 = jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray;
    }

    public HxNufwqIKdASUlhzDMzyCRUIub26n5S3 Method6833(HxNufwqIKdASUlhzDMzyCRUIub26n5S3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi hxNufwqIKdASUlhzDMzyCRUIub26n5S3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, HxNufwqIKdASUlhzDMzyCRUIub26n5S3 hxNufwqIKdASUlhzDMzyCRUIub26n5S3) {
        if (this.Field16336.length != hxNufwqIKdASUlhzDMzyCRUIub26n5S3.Field16336.length) {
            throw new IllegalArgumentException("Length of vec1 != length of vec2");
        }
        JeYx12lqUujCMKn4MrLDhXikgfUCcw2h[] jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h[this.Field16336.length];
        int n = (int)1197931451L ^ 0x4766FBBB;
        while (true) {
            if (n >= this.Field16336.length) {
                this.Field16336 = jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray;
                return this;
            }
            jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[n] = hxNufwqIKdASUlhzDMzyCRUIub26n5S3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2282(this.Field16336[n], hxNufwqIKdASUlhzDMzyCRUIub26n5S3.Field16336[n]);
            ++n;
        }
    }

    public static HxNufwqIKdASUlhzDMzyCRUIub26n5S3 Method6834(AxisAlignedBB axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        JeYx12lqUujCMKn4MrLDhXikgfUCcw2h[] jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h[((int)-81796651L ^ 0xFB1FE1D4) << 4];
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)((long)-1664631897 ^ (long)-1664631897)] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)1920563628L ^ 0x727979AD] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[((int)-1104927695L ^ 0xBE242430) << 1] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)1900978646L ^ 0x714EA1D5] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[((int)13136852L ^ 0xC873D5) << 2] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)353661496L ^ 0x1514723D] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)((long)-825603742 ^ (long)-825603743) << 1] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)1954592029L ^ 0x7480B51A] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[((int)-921829796L ^ 0xC90DFE5D) << 3] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)((long)902153219 ^ (long)902153226)] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)((long)-1351668400 ^ (long)-1351668395) << 1] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)-646771128L ^ 0xD9730E43] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[((int)-1784944324L ^ 0x959BE93F) << 2] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)-1626801361L ^ 0x9F08FB22] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)((long)1828909704 ^ (long)1828909711) << 1] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray[(int)((long)606287308 ^ (long)606287299)] = new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        return new HxNufwqIKdASUlhzDMzyCRUIub26n5S3(jeYx12lqUujCMKn4MrLDhXikgfUCcw2hArray);
    }

    private static String Method6835(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-283031996 ^ (long)-283031996);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)290579474 ^ (long)290579693);
            int n2 = (int)((long)530383533 ^ (long)530383542) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2135579990 ^ (long)-2135576549) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

