//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import java.util.*;

enum Class1553
{
    Field15244("Normal", 0, new Vec3d[] { new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)1705606719 ^ 0xBFF0000065A97E3FL)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1809890154 ^ 0xBFF000006BE0BB6AL)) }), 
    Field15245("Strict", 1, new Vec3d[] { new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)234108593 ^ 0xBFF000000DF436B1L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)2021932576 ^ 0xBFF0000078843E20L)) }), 
    Field15246("SemiSafe", 2, new Vec3d[] { new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble((long)730512698 ^ 0xBFF000002B8ABD3AL), 1.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)154661618 ^ 0xBFF000000937F2F2L)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)898934337 ^ 0xBFF000003594A641L)), new Vec3d(Double.longBitsToDouble(4611686018427387904L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)278898703 ^ 0xC0000000109FA80FL), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)564879280 ^ 0x4000000021AB5FB0L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1632104099 ^ 0xC00000006147EEA3L)) }), 
    Field15247("Safe", 3, new Vec3d[] { new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)1597007085 ^ 0xBFF000005F3064EDL), 0.0), new Vec3d(0.0, Double.longBitsToDouble((long)116534447 ^ 0xBFF0000006F22CAFL), 1.0), new Vec3d(0.0, Double.longBitsToDouble((long)144294137 ^ 0xBFF000000899C0F9L), Double.longBitsToDouble((long)1255409670 ^ 0xBFF000004AD40806L)), new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(1.0, Double.longBitsToDouble((long)227025164 ^ 0xBFF000000D88210CL), Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)2036197427 ^ 0xBFF00000795DE833L), Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1222917518 ^ 0xBFF0000048E43D8EL)), new Vec3d(1.0, 0.0, 1.0), new Vec3d(1.0, 0.0, Double.longBitsToDouble((long)2055001393 ^ 0xBFF000007A7CD531L)), new Vec3d(Double.longBitsToDouble((long)1222408579 ^ 0xBFF0000048DC7983L), 0.0, 1.0), new Vec3d(Double.longBitsToDouble((long)177636178 ^ 0xBFF000000A968352L), 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble((long)1566753620 ^ 0x400000005D62C354L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4611686018427387904L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1813458585 ^ 0x400000006C172E99L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1708866046 ^ 0xC000000065DB39FEL)) }), 
    Field15248("Cubic", 4, new Vec3d[] { new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble((long)1298504739 ^ 0xBFF000004D659C23L), 1.0), new Vec3d(0.0, Double.longBitsToDouble((long)298860160 ^ 0xBFF0000011D03E80L), Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, Double.longBitsToDouble((long)2092342505 ^ 0xBFF000007CB69CE9L), 1.0), new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)1355960458 ^ 0xBFF0000050D2508AL)), new Vec3d(Double.longBitsToDouble((long)1383325989 ^ 0xBFF000005273E125L), Double.longBitsToDouble((long)594148572 ^ 0xBFF000002369FCDCL), 1.0), new Vec3d(Double.longBitsToDouble((long)1595846278 ^ 0xBFF000005F1EAE86L), Double.longBitsToDouble((long)658930992 ^ 0xBFF0000027467D30L), Double.longBitsToDouble((long)1027790844 ^ 0xBFF000003D42D7FCL)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 0.0, 1.0), new Vec3d(1.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble((long)2121129797 ^ 0xBFF000007E6DDF45L), 0.0, 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, Double.longBitsToDouble(-4616189618054758400L)) }), 
    Field15249("High", 5, new Vec3d[] { new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(Double.longBitsToDouble((long)1953182926 ^ 0xBFF00000746B34CEL), Double.longBitsToDouble((long)854163069 ^ 0xBFF0000032E97E7DL), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(0.0, Double.longBitsToDouble((long)1549593036 ^ 0xBFF000005C5CE9CCL), Double.longBitsToDouble((long)584121010 ^ 0xBFF0000022D0FAB2L)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)245835878 ^ 0xBFF000000EA72866L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)616238495 ^ 0xBFF0000024BB0D9FL)), new Vec3d(1.0, 1.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 1.0, 0.0), new Vec3d(0.0, 1.0, 1.0), new Vec3d(0.0, 1.0, Double.longBitsToDouble((long)1229537579 ^ 0xBFF000004949412BL)) }), 
    Field15250("AntiFacePlace", 6, (Vec3d[])null), 
    Field15251("Dynamic", 7, (Vec3d[])null);
    
    private final Vec3d[] Field15252;
    private static final Class1553[] Field15253;
    private String Field15254 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1553(final String name, final int ordinal, final Vec3d[] field15252) {
        this.Field15252 = field15252;
    }
    
    public List Method6126() {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(64);
        if (this == Class1553.Field15251) {
            return Class1008.Method4101(Class1008.Field12376);
        }
        if (this == Class1553.Field15250) {
            return Class1008.Method4102(Class1008.Field12376);
        }
        if (Class1008.Method4103(Class1008.Field12376).Method365()) {
            list.addAll((Collection<?>)Class1008.Field12376.Method4079((Entity)Class1008.Method4104().player, Class1008.Method4105().player.posY, -1));
        }
        if (Class1008.Method4106(Class1008.Field12376).Method365()) {
            list.addAll((Collection<?>)Class1008.Field12376.Method4079((Entity)Class1008.Method4107().player, Class1008.Method4108().player.posY, -2));
        }
        final Vec3d getPositionVector = Class1008.Method4109().player.getPositionVector();
        for (final Vec3d vec3d : this.Field15252) {
            final BlockPos blockPos = new BlockPos(vec3d.add(getPositionVector));
            if (!Class1008.Method4110(Class1008.Field12376).Method365() || vec3d.y >= 0.0 || Class1036.Method4213(blockPos).isEmpty()) {
                list.add(blockPos);
            }
        }
        return list;
    }
    
    static {
        Field15253 = new Class1553[] { Class1553.Field15244, Class1553.Field15245, Class1553.Field15246, Class1553.Field15247, Class1553.Field15248, Class1553.Field15249, Class1553.Field15250, Class1553.Field15251 };
    }
    
    private static String Method6127(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x27D0 ^ 0x73));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
