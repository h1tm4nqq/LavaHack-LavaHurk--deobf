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
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

final class AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm
extends Enum {
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field15244;
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field15245;
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field15246;
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field15247;
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field15248;
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field15249;
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field15250;
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field15251;
    private final Vec3d[] Field15252;
    private static final AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[] Field15253;
    private String Field15254 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[] values() {
        return (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[])Field15253.clone();
    }

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm valueOf(String string) {
        return Enum.valueOf(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field15252 = var3_1;
    }

    public List Method6126() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(((int)1541887842L ^ 0x5BE75763) << 6);
        if (this == Field15251) {
            return AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4101(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376);
        }
        if (this == Field15250) {
            return AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4102(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376);
        }
        if (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4103(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376).Method365()) {
            arrayList.addAll(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376.Method4079((Entity)AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4104().player, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4105().player.posY, (int)((long)-157156035 ^ (long)157156034)));
        }
        if (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4106(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376).Method365()) {
            arrayList.addAll(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376.Method4079((Entity)AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4107().player, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4108().player.posY, (int)1404835702L ^ 0xAC43E888));
        }
        Vec3d vec3d = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4109().player.getPositionVector();
        Vec3d[] vec3dArray = this.Field15252;
        int n = vec3dArray.length;
        int n2 = (int)((long)-768069211 ^ (long)-768069211);
        while (n2 < n) {
            Vec3d vec3d2 = vec3dArray[n2];
            BlockPos blockPos = new BlockPos(vec3d2.add(vec3d));
            if (!AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4110(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376).Method365() || !(vec3d2.y < 0.0) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
                arrayList.add(blockPos);
            }
            ++n2;
        }
        return arrayList;
    }

    static {
        Vec3d[] vec3dArray = new Vec3d[(int)((long)789140357 ^ (long)789140356) << 3];
        vec3dArray[(int)1168567509L ^ 0x45A6ECD5] = new Vec3d(1.0, Double.longBitsToDouble(0xDD316D31AC99E7ACL ^ 0x62C16D31AC99E7ACL), 0.0);
        vec3dArray[(int)((long)-1243338168 ^ (long)-1243338167)] = new Vec3d(Double.longBitsToDouble(0xFB0362D23C125B90L ^ 0x44F362D23C125B90L), Double.longBitsToDouble(0x66F5D81BE16B60DL ^ 0xB99F5D81BE16B60DL), 0.0);
        vec3dArray[((int)84350974L ^ 0x50717FF) << 1] = new Vec3d(0.0, Double.longBitsToDouble(0x9DB2FB0AAAE5B496L ^ 0x2242FB0AAAE5B496L), 1.0);
        vec3dArray[(int)((long)1590051308 ^ (long)1590051311)] = new Vec3d(0.0, Double.longBitsToDouble(0xE743F4E68B3FE9F8L ^ 0x58B3F4E68B3FE9F8L), Double.longBitsToDouble((long)1705606719 ^ 0xBFF0000065A97E3FL));
        vec3dArray[(int)((long)-1948422600 ^ (long)-1948422599) << 2] = new Vec3d(1.0, 0.0, 0.0);
        vec3dArray[(int)1240752890L ^ 0x49F462FF] = new Vec3d(Double.longBitsToDouble(0x67ACC96CEF9FDE1FL ^ 0xD85CC96CEF9FDE1FL), 0.0, 0.0);
        vec3dArray[((int)-293421115L ^ 0xEE82BFC6) << 1] = new Vec3d(0.0, 0.0, 1.0);
        vec3dArray[(int)((long)2133457389 ^ (long)2133457386)] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1809890154 ^ 0xBFF000006BE0BB6AL));
        Field15244 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("Normal", (int)-840947144L ^ 0xCDE02A38, vec3dArray);
        Vec3d[] vec3dArray2 = new Vec3d[((int)1045555151L ^ 0x3E51E7CE) << 2];
        vec3dArray2[(int)((long)-382877581 ^ (long)-382877581)] = new Vec3d(1.0, 0.0, 0.0);
        vec3dArray2[(int)((long)-3693917 ^ (long)-3693918)] = new Vec3d(Double.longBitsToDouble((long)234108593 ^ 0xBFF000000DF436B1L), 0.0, 0.0);
        vec3dArray2[((int)776090402L ^ 0x2E423323) << 1] = new Vec3d(0.0, 0.0, 1.0);
        vec3dArray2[(int)((long)1611640395 ^ (long)1611640392)] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)2021932576 ^ 0xBFF0000078843E20L));
        Field15245 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("Strict", (int)-1233731064L ^ 0xB676C209, vec3dArray2);
        Vec3d[] vec3dArray3 = new Vec3d[((int)-1380687545L ^ 0xADB46144) << 2];
        vec3dArray3[(int)-277513300L ^ 0xEF757BAC] = new Vec3d(1.0, Double.longBitsToDouble(0x4EC0B17DAEA74AF1L ^ 0xF130B17DAEA74AF1L), 0.0);
        vec3dArray3[(int)((long)1113405797 ^ (long)1113405796)] = new Vec3d(Double.longBitsToDouble(0xC3C24A703CDEFB72L ^ 0x7C324A703CDEFB72L), Double.longBitsToDouble(0xCC05E5AE46CF5F3DL ^ 0x73F5E5AE46CF5F3DL), 0.0);
        vec3dArray3[(int)((long)297763366 ^ (long)297763367) << 1] = new Vec3d(0.0, Double.longBitsToDouble((long)730512698 ^ 0xBFF000002B8ABD3AL), 1.0);
        vec3dArray3[(int)-511452917L ^ 0xE183D908] = new Vec3d(0.0, Double.longBitsToDouble(0xE299FC4183CEA8CEL ^ 0x5D69FC4183CEA8CEL), Double.longBitsToDouble((long)154661618 ^ 0xBFF000000937F2F2L));
        vec3dArray3[((int)796982680L ^ 0x2F80FD99) << 2] = new Vec3d(1.0, 0.0, 0.0);
        vec3dArray3[(int)1192831437L ^ 0x471929C8] = new Vec3d(Double.longBitsToDouble(0xC9AC64C0B69F7A05L ^ 0x765C64C0B69F7A05L), 0.0, 0.0);
        vec3dArray3[(int)((long)-1111815518 ^ (long)-1111815519) << 1] = new Vec3d(0.0, 0.0, 1.0);
        vec3dArray3[(int)((long)1446553842 ^ (long)1446553845)] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)898934337 ^ 0xBFF000003594A641L));
        vec3dArray3[((int)1756073378L ^ 0x68AB8DA3) << 3] = new Vec3d(Double.longBitsToDouble(0xDF7BB1A0FB233FBBL ^ 0x9F7BB1A0FB233FBBL), 0.0, 0.0);
        vec3dArray3[(int)((long)711643076 ^ (long)711643085)] = new Vec3d(Double.longBitsToDouble((long)278898703 ^ 0xC0000000109FA80FL), 0.0, 0.0);
        vec3dArray3[(int)((long)-442564058 ^ (long)-442564061) << 1] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)564879280 ^ 0x4000000021AB5FB0L));
        vec3dArray3[(int)227154269L ^ 0xD8A1956] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1632104099 ^ 0xC00000006147EEA3L));
        Field15246 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("SemiSafe", (int)((long)658684655 ^ (long)658684654) << 1, vec3dArray3);
        Vec3d[] vec3dArray4 = new Vec3d[((int)-1668920214L ^ 0x9C864C6F) << 2];
        vec3dArray4[(int)-1558484615L ^ 0xA31B6979] = new Vec3d(1.0, Double.longBitsToDouble(0xEDE4822335CDA745L ^ 0x5214822335CDA745L), 0.0);
        vec3dArray4[(int)((long)177150240 ^ (long)177150241)] = new Vec3d(Double.longBitsToDouble(0xDFE432A5D7B27422L ^ 0x601432A5D7B27422L), Double.longBitsToDouble((long)1597007085 ^ 0xBFF000005F3064EDL), 0.0);
        vec3dArray4[((int)793802592L ^ 0x2F507761) << 1] = new Vec3d(0.0, Double.longBitsToDouble((long)116534447 ^ 0xBFF0000006F22CAFL), 1.0);
        vec3dArray4[(int)((long)-617741682 ^ (long)-617741683)] = new Vec3d(0.0, Double.longBitsToDouble((long)144294137 ^ 0xBFF000000899C0F9L), Double.longBitsToDouble((long)1255409670 ^ 0xBFF000004AD40806L));
        vec3dArray4[(int)((long)-135823095 ^ (long)-135823096) << 2] = new Vec3d(1.0, Double.longBitsToDouble(0x87D6A9F5AC477625L ^ 0x3826A9F5AC477625L), 1.0);
        vec3dArray4[(int)((long)-1947388213 ^ (long)-1947388210)] = new Vec3d(1.0, Double.longBitsToDouble((long)227025164 ^ 0xBFF000000D88210CL), Double.longBitsToDouble(0x183969BA02F47109L ^ 0xA7C969BA02F47109L));
        vec3dArray4[(int)((long)1254121127 ^ (long)1254121124) << 1] = new Vec3d(Double.longBitsToDouble(0x4BA0752F7ED02072L ^ 0xF450752F7ED02072L), Double.longBitsToDouble(0xD08370553FA36C4DL ^ 0x6F7370553FA36C4DL), 1.0);
        vec3dArray4[(int)-653709488L ^ 0xD9092F57] = new Vec3d(Double.longBitsToDouble(0x9FBD2DC8F9005AE8L ^ 0x204D2DC8F9005AE8L), Double.longBitsToDouble((long)2036197427 ^ 0xBFF00000795DE833L), Double.longBitsToDouble(0x85E3D71D4127D5CEL ^ 0x3A13D71D4127D5CEL));
        vec3dArray4[((int)815820084L ^ 0x30A06D35) << 3] = new Vec3d(1.0, 0.0, 0.0);
        vec3dArray4[(int)((long)951892832 ^ (long)951892841)] = new Vec3d(Double.longBitsToDouble(0xE4C70BC65EBCA763L ^ 0x5B370BC65EBCA763L), 0.0, 0.0);
        vec3dArray4[(int)((long)452297534 ^ (long)452297531) << 1] = new Vec3d(0.0, 0.0, 1.0);
        vec3dArray4[(int)((long)562971191 ^ (long)562971196)] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1222917518 ^ 0xBFF0000048E43D8EL));
        vec3dArray4[(int)((long)607506603 ^ (long)607506600) << 2] = new Vec3d(1.0, 0.0, 1.0);
        vec3dArray4[(int)1144824546L ^ 0x443CA2EF] = new Vec3d(1.0, 0.0, Double.longBitsToDouble((long)2055001393 ^ 0xBFF000007A7CD531L));
        vec3dArray4[(int)((long)333718981 ^ (long)333718978) << 1] = new Vec3d(Double.longBitsToDouble((long)1222408579 ^ 0xBFF0000048DC7983L), 0.0, 1.0);
        vec3dArray4[(int)-355367331L ^ 0xEAD18652] = new Vec3d(Double.longBitsToDouble((long)177636178 ^ 0xBFF000000A968352L), 0.0, Double.longBitsToDouble(0x6EEEA33896050EABL ^ 0xD11EA33896050EABL));
        vec3dArray4[((int)-2064670328L ^ 0x84EFA189) << 4] = new Vec3d(Double.longBitsToDouble((long)1566753620 ^ 0x400000005D62C354L), 0.0, 0.0);
        vec3dArray4[(int)((long)320631345 ^ (long)320631328)] = new Vec3d(Double.longBitsToDouble(0xAD2A13B9B0AD8085L ^ 0x6D2A13B9B0AD8085L), 0.0, 0.0);
        vec3dArray4[(int)((long)1293759489 ^ (long)1293759496) << 1] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1813458585 ^ 0x400000006C172E99L));
        vec3dArray4[(int)-262243351L ^ 0xF05E7BFA] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1708866046 ^ 0xC000000065DB39FEL));
        Field15247 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("Safe", (int)1873976190L ^ 0x6FB29B7D, vec3dArray4);
        Vec3d[] vec3dArray5 = new Vec3d[(int)((long)1798246123 ^ (long)1798246122) << 4];
        vec3dArray5[(int)-861633554L ^ 0xCCA483EE] = new Vec3d(1.0, Double.longBitsToDouble(0xF7C994A35BC37E1BL ^ 0x483994A35BC37E1BL), 0.0);
        vec3dArray5[(int)-1433475811L ^ 0xAA8EE51C] = new Vec3d(Double.longBitsToDouble(0x3B0C53036A0FCEEBL ^ 0x84FC53036A0FCEEBL), Double.longBitsToDouble(0x27B37BA539EC308L ^ 0xBD8B37BA539EC308L), 0.0);
        vec3dArray5[((int)1914852590L ^ 0x722254EF) << 1] = new Vec3d(0.0, Double.longBitsToDouble((long)1298504739 ^ 0xBFF000004D659C23L), 1.0);
        vec3dArray5[(int)((long)-8853786 ^ (long)-8853787)] = new Vec3d(0.0, Double.longBitsToDouble((long)298860160 ^ 0xBFF0000011D03E80L), Double.longBitsToDouble(0x83DC32A0FFFBAD92L ^ 0x3C2C32A0FFFBAD92L));
        vec3dArray5[(int)((long)-9167465 ^ (long)-9167466) << 2] = new Vec3d(1.0, Double.longBitsToDouble((long)2092342505 ^ 0xBFF000007CB69CE9L), 1.0);
        vec3dArray5[(int)((long)-2049112638 ^ (long)-2049112633)] = new Vec3d(1.0, Double.longBitsToDouble(0xB431C3E3DBBAC5D0L ^ 0xBC1C3E3DBBAC5D0L), Double.longBitsToDouble((long)1355960458 ^ 0xBFF0000050D2508AL));
        vec3dArray5[(int)((long)-152579467 ^ (long)-152579466) << 1] = new Vec3d(Double.longBitsToDouble((long)1383325989 ^ 0xBFF000005273E125L), Double.longBitsToDouble((long)594148572 ^ 0xBFF000002369FCDCL), 1.0);
        vec3dArray5[(int)((long)1063151381 ^ (long)1063151378)] = new Vec3d(Double.longBitsToDouble((long)1595846278 ^ 0xBFF000005F1EAE86L), Double.longBitsToDouble((long)658930992 ^ 0xBFF0000027467D30L), Double.longBitsToDouble((long)1027790844 ^ 0xBFF000003D42D7FCL));
        vec3dArray5[(int)((long)-546656004 ^ (long)-546656003) << 3] = new Vec3d(1.0, 0.0, 0.0);
        vec3dArray5[(int)((long)-378298864 ^ (long)-378298855)] = new Vec3d(Double.longBitsToDouble(0x4DD56708D7BC1FCEL ^ 0xF2256708D7BC1FCEL), 0.0, 0.0);
        vec3dArray5[(int)((long)-503752722 ^ (long)-503752725) << 1] = new Vec3d(0.0, 0.0, 1.0);
        vec3dArray5[(int)-1422710844L ^ 0xAB3327CF] = new Vec3d(0.0, 0.0, Double.longBitsToDouble(0xEF39F7C6458D919DL ^ 0x50C9F7C6458D919DL));
        vec3dArray5[((int)325984543L ^ 0x136E211C) << 2] = new Vec3d(1.0, 0.0, 1.0);
        vec3dArray5[(int)2081472921L ^ 0x7C10C194] = new Vec3d(1.0, 0.0, Double.longBitsToDouble(0xB894A087421CE814L ^ 0x764A087421CE814L));
        vec3dArray5[((int)1384119144L ^ 0x527FFB6F) << 1] = new Vec3d(Double.longBitsToDouble((long)2121129797 ^ 0xBFF000007E6DDF45L), 0.0, 1.0);
        vec3dArray5[(int)-819056072L ^ 0xCF2E3237] = new Vec3d(Double.longBitsToDouble(0xE34AE1410C39ACC2L ^ 0x5CBAE1410C39ACC2L), 0.0, Double.longBitsToDouble(0xCE2B334C1FEB7E61L ^ 0x71DB334C1FEB7E61L));
        Field15248 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("Cubic", (int)((long)-1313537804 ^ (long)-1313537803) << 2, vec3dArray5);
        Vec3d[] vec3dArray6 = new Vec3d[((int)-764036774L ^ 0xD275B959) << 2];
        vec3dArray6[(int)((long)1724151033 ^ (long)1724151033)] = new Vec3d(1.0, Double.longBitsToDouble(0xD01EAD7463C995D0L ^ 0x6FEEAD7463C995D0L), 0.0);
        vec3dArray6[(int)113649953L ^ 0x6C62920] = new Vec3d(Double.longBitsToDouble((long)1953182926 ^ 0xBFF00000746B34CEL), Double.longBitsToDouble((long)854163069 ^ 0xBFF0000032E97E7DL), 0.0);
        vec3dArray6[((int)1070420220L ^ 0x3FCD50FD) << 1] = new Vec3d(0.0, Double.longBitsToDouble(0x56F2CB72D78F21A6L ^ 0xE902CB72D78F21A6L), 1.0);
        vec3dArray6[(int)((long)-996551137 ^ (long)-996551140)] = new Vec3d(0.0, Double.longBitsToDouble((long)1549593036 ^ 0xBFF000005C5CE9CCL), Double.longBitsToDouble((long)584121010 ^ 0xBFF0000022D0FAB2L));
        vec3dArray6[((int)1307002461L ^ 0x4DE7465C) << 2] = new Vec3d(1.0, 0.0, 0.0);
        vec3dArray6[(int)((long)-364228198 ^ (long)-364228193)] = new Vec3d(Double.longBitsToDouble((long)245835878 ^ 0xBFF000000EA72866L), 0.0, 0.0);
        vec3dArray6[(int)((long)-1744720650 ^ (long)-1744720651) << 1] = new Vec3d(0.0, 0.0, 1.0);
        vec3dArray6[(int)1840587430L ^ 0x6DB522A1] = new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)616238495 ^ 0xBFF0000024BB0D9FL));
        vec3dArray6[(int)((long)2065313646 ^ (long)2065313647) << 3] = new Vec3d(1.0, 1.0, 0.0);
        vec3dArray6[(int)((long)1190877240 ^ (long)1190877233)] = new Vec3d(Double.longBitsToDouble(0x88BFB5F0BEBD8CD8L ^ 0x374FB5F0BEBD8CD8L), 1.0, 0.0);
        vec3dArray6[((int)-1117929506L ^ 0xBD5DBFDB) << 1] = new Vec3d(0.0, 1.0, 1.0);
        vec3dArray6[(int)419542703L ^ 0x1901B6A4] = new Vec3d(0.0, 1.0, Double.longBitsToDouble((long)1229537579 ^ 0xBFF000004949412BL));
        Field15249 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("High", (int)((long)-2039725442 ^ (long)-2039725445), vec3dArray6);
        Field15250 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("AntiFacePlace", ((int)1739341786L ^ 0x67AC3FD9) << 1, null);
        Field15251 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("Dynamic", (int)((long)1597760739 ^ (long)1597760740), null);
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[] aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[(int)((long)83726832 ^ (long)83726833) << 3];
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)((long)-2056898575 ^ (long)-2056898575)] = Field15244;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)((long)58780706 ^ (long)58780707)] = Field15245;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)((long)2053370369 ^ (long)2053370368) << 1] = Field15246;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)229592760L ^ 0xDAF4EBB] = Field15247;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)((long)-957850842 ^ (long)-957850841) << 2] = Field15248;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)1968533699L ^ 0x755570C6] = Field15249;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[((int)-700873374L ^ 0xD6398561) << 1] = Field15250;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)-1580872078L ^ 0xA1C5CE75] = Field15251;
        Field15253 = aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray;
    }

    private static String Method6127(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2034175130L ^ 0x793F0C9A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-769703661L ^ 0xD21F41EC);
            int n2 = (int)-2099228232L ^ 0x82E051CB;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1616014546L ^ 0x9FAD9153) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

