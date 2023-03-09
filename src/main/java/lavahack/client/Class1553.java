//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import lavahack.client.Class1008;
import lavahack.client.Class1036;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

enum Class1553 {
    Field15244(new Vec3d[]{new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)1705606719 ^ 0xBFF0000065A97E3FL)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1809890154 ^ 0xBFF000006BE0BB6AL))}),
    Field15245(new Vec3d[]{new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)234108593 ^ 0xBFF000000DF436B1L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)2021932576 ^ 0xBFF0000078843E20L))}),
    Field15246(new Vec3d[]{new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble((long)730512698 ^ 0xBFF000002B8ABD3AL), 1.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)154661618 ^ 0xBFF000000937F2F2L)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)898934337 ^ 0xBFF000003594A641L)), new Vec3d(Double.longBitsToDouble(0x4000000000000000L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)278898703 ^ 0xC0000000109FA80FL), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)564879280 ^ 0x4000000021AB5FB0L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1632104099 ^ 0xC00000006147EEA3L))}),
    Field15247(new Vec3d[]{new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)1597007085 ^ 0xBFF000005F3064EDL), 0.0), new Vec3d(0.0, Double.longBitsToDouble((long)116534447 ^ 0xBFF0000006F22CAFL), 1.0), new Vec3d(0.0, Double.longBitsToDouble((long)144294137 ^ 0xBFF000000899C0F9L), Double.longBitsToDouble((long)1255409670 ^ 0xBFF000004AD40806L)), new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(1.0, Double.longBitsToDouble((long)227025164 ^ 0xBFF000000D88210CL), Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)2036197427 ^ 0xBFF00000795DE833L), Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1222917518 ^ 0xBFF0000048E43D8EL)), new Vec3d(1.0, 0.0, 1.0), new Vec3d(1.0, 0.0, Double.longBitsToDouble((long)2055001393 ^ 0xBFF000007A7CD531L)), new Vec3d(Double.longBitsToDouble((long)1222408579 ^ 0xBFF0000048DC7983L), 0.0, 1.0), new Vec3d(Double.longBitsToDouble((long)177636178 ^ 0xBFF000000A968352L), 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble((long)1566753620 ^ 0x400000005D62C354L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4611686018427387904L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1813458585 ^ 0x400000006C172E99L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1708866046 ^ 0xC000000065DB39FEL))}),
    Field15248(new Vec3d[]{new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble((long)1298504739 ^ 0xBFF000004D659C23L), 1.0), new Vec3d(0.0, Double.longBitsToDouble((long)298860160 ^ 0xBFF0000011D03E80L), Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, Double.longBitsToDouble((long)2092342505 ^ 0xBFF000007CB69CE9L), 1.0), new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)1355960458 ^ 0xBFF0000050D2508AL)), new Vec3d(Double.longBitsToDouble((long)1383325989 ^ 0xBFF000005273E125L), Double.longBitsToDouble((long)594148572 ^ 0xBFF000002369FCDCL), 1.0), new Vec3d(Double.longBitsToDouble((long)1595846278 ^ 0xBFF000005F1EAE86L), Double.longBitsToDouble((long)658930992 ^ 0xBFF0000027467D30L), Double.longBitsToDouble((long)1027790844 ^ 0xBFF000003D42D7FCL)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 0.0, 1.0), new Vec3d(1.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble((long)2121129797 ^ 0xBFF000007E6DDF45L), 0.0, 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, Double.longBitsToDouble(-4616189618054758400L))}),
    Field15249(new Vec3d[]{new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble((long)1953182926 ^ 0xBFF00000746B34CEL), Double.longBitsToDouble((long)854163069 ^ 0xBFF0000032E97E7DL), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(0.0, Double.longBitsToDouble((long)1549593036 ^ 0xBFF000005C5CE9CCL), Double.longBitsToDouble((long)584121010 ^ 0xBFF0000022D0FAB2L)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)245835878 ^ 0xBFF000000EA72866L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)616238495 ^ 0xBFF0000024BB0D9FL)), new Vec3d(1.0, 1.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 1.0, 0.0), new Vec3d(0.0, 1.0, 1.0), new Vec3d(0.0, 1.0, Double.longBitsToDouble((long)1229537579 ^ 0xBFF000004949412BL))}),
    Field15250(null),
    Field15251(null);

    private final Vec3d[] Field15252;
    private String Field15254 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1553() {
        void var3_1;
        this.Field15252 = var3_1;
    }

    public List Method6126() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(64);
        if (this == Field15251) {
            return Class1008.Method4101(Class1008.Field12376);
        }
        if (this == Field15250) {
            return Class1008.Method4102(Class1008.Field12376);
        }
        if (Class1008.Method4103(Class1008.Field12376).Method365()) {
            arrayList.addAll(Class1008.Field12376.Method4079((Entity)Class1008.Method4104().player, Class1008.Method4105().player.posY, -1));
        }
        if (Class1008.Method4106(Class1008.Field12376).Method365()) {
            arrayList.addAll(Class1008.Field12376.Method4079((Entity)Class1008.Method4107().player, Class1008.Method4108().player.posY, -2));
        }
        Vec3d vec3d = Class1008.Method4109().player.getPositionVector();
        Vec3d[] vec3dArray = this.Field15252;
        int n = vec3dArray.length;
        int n2 = 0;
        while (n2 < n) {
            Vec3d vec3d2 = vec3dArray[n2];
            BlockPos blockPos = new BlockPos(vec3d2.add(vec3d));
            if (!Class1008.Method4110(Class1008.Field12376).Method365() || !(vec3d2.y < 0.0) || Class1036.Method4213(blockPos).isEmpty()) {
                arrayList.add(blockPos);
            }
            ++n2;
        }
        return arrayList;
    }

    private static String Method6127(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 115;
            cArray2[n] = (char)(cArray[n] ^ (0x27D0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

