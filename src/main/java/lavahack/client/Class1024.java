//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1024 implements Class118
{
    @Class2057
    @Class694
    Field12478("Linear", 0, Class1367.Field14224.Method7663(class424 -> 1.0 - (double)class424.Method2054(0))), 
    @Class2057
    Field12479("InSine", 1, Class1367.Field14224.Method7663(class424 -> Math.cos((double)class424.Method2054(0) * Double.longBitsToDouble(4614256656552045848L) / Double.longBitsToDouble((long)863676037 ^ 0x40000000337AA685L)))), 
    @Class694
    Field12480("OutSine", 2, Class1367.Field14224.Method7663(class424 -> 1.0 - Math.sin((double)class424.Method2054(0) * Double.longBitsToDouble(4614256656552045848L) / Double.longBitsToDouble((long)1194703966 ^ 0x400000004735BC5EL)))), 
    @Class2057
    Field12481("InOutSine", 3, Class1367.Field14224.Method7663(class424 -> 1.0 - -(Math.cos(Double.longBitsToDouble(4614256656552045848L) * (double)class424.Method2054(0)) - 1.0) / Double.longBitsToDouble((long)247023545 ^ 0x400000000EB947B9L))), 
    @Class2057
    Field12482("InQuad", 4, Class1367.Field14224.Method7663(class424 -> 1.0 - (double)class424.Method2054(0) * (double)class424.Method2054(0))), 
    @Class694
    Field12483("OutQuad", 5, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0)) * (1.0 - (double)class424.Method2054(0)))), 
    @Class2057
    Field12484("InOutQuad", 6, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0) < Double.longBitsToDouble((long)1966942752 ^ 0x3FE00000753D2A20L)) ? (Double.longBitsToDouble(4611686018427387904L) * (double)class424.Method2054(0) * (double)class424.Method2054(0)) : (1.0 - Math.pow(Double.longBitsToDouble((long)553638876 ^ 0xC000000020FFDBDCL) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)520891889 ^ 0x400000001F0C2DF1L), Double.longBitsToDouble((long)1218960636 ^ 0x4000000048A7DCFCL)) / Double.longBitsToDouble(4611686018427387904L)))), 
    @Class2057
    Field12485("InCubic", 7, Class1367.Field14224.Method7663(class424 -> 1.0 - (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0))), 
    @Class694
    Field12486("OutCubic", 8, Class1367.Field14224.Method7663(class424 -> Math.pow(1.0 - (double)class424.Method2054(0), Double.longBitsToDouble((long)1095522717 ^ 0x40080000414C599DL)))), 
    @Class2057
    Field12487("InOutCubic", 9, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0) < Double.longBitsToDouble(4602678819172646912L)) ? (Double.longBitsToDouble((long)271410012 ^ 0x40100000102D635CL) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0)) : (1.0 - Math.pow(Double.longBitsToDouble((long)812332428 ^ 0xC0000000306B358CL) * (double)class424.Method2054(0) + Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble((long)886170308 ^ 0x4008000034D1E2C4L)) / Double.longBitsToDouble(4611686018427387904L)))), 
    @Class2057
    Field12488("InQuart", 10, Class1367.Field14224.Method7663(class424 -> 1.0 - (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0))), 
    @Class694
    Field12489("OutQuart", 11, Class1367.Field14224.Method7663(class424 -> Math.pow(1.0 - (double)class424.Method2054(0), Double.longBitsToDouble(4616189618054758400L)))), 
    @Class2057
    Field12490("InOutQuart", 12, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0) < Double.longBitsToDouble((long)1647693818 ^ 0x3FE000006235CFFAL)) ? (Double.longBitsToDouble((long)1053829773 ^ 0x402000003ED02A8DL) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0)) : (1.0 - Math.pow(Double.longBitsToDouble((long)1759659847 ^ 0xC000000068E24747L) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)1352471128 ^ 0x40000000509D1258L), Double.longBitsToDouble(4616189618054758400L)) / Double.longBitsToDouble((long)150551918 ^ 0x4000000008F93D6EL)))), 
    @Class2057
    Field12491("InQuint", 13, Class1367.Field14224.Method7663(class424 -> 1.0 - (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0))), 
    @Class694
    Field12492("OutQuin", 14, Class1367.Field14224.Method7663(class424 -> Math.pow(1.0 - (double)class424.Method2054(0), Double.longBitsToDouble(4617315517961601024L)))), 
    @Class2057
    Field12493("InOutQuint", 15, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0) < Double.longBitsToDouble((long)1880707564 ^ 0x3FE00000701951ECL)) ? (Double.longBitsToDouble((long)1473531947 ^ 0x4030000057D4502BL) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0)) : (1.0 - Math.pow(Double.longBitsToDouble(-4611686018427387904L) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)719083728 ^ 0x400000002ADC58D0L), Double.longBitsToDouble((long)2063949832 ^ 0x401400007B056008L)) / Double.longBitsToDouble(4611686018427387904L)))), 
    @Class2057
    Field12494("InExpo", 16, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0) == 0.0) ? 0.0 : Math.pow(Double.longBitsToDouble((long)70130650 ^ 0x40000000042E1BDAL), Double.longBitsToDouble((long)1028151096 ^ 0x402400003D485738L) * (double)class424.Method2054(0) - Double.longBitsToDouble(4621819117588971520L)))), 
    @Class694
    Field12495("OutExpo", 17, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0) == 1.0) ? 1.0 : (1.0 - Math.pow(Double.longBitsToDouble((long)1312768368 ^ 0x400000004E3F4170L), Double.longBitsToDouble(-4601552919265804288L) * (double)class424.Method2054(0))))), 
    @Class2057
    Field12496("InOutExpo", 18, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0) == 0.0) ? 0.0 : (((double)class424.Method2054(0) == 1.0) ? 1.0 : (((double)class424.Method2054(0) < Double.longBitsToDouble(4602678819172646912L)) ? (Math.pow(Double.longBitsToDouble((long)1396878753 ^ 0x400000005342ADA1L), Double.longBitsToDouble((long)50734857 ^ 0x4034000003062709L) * (double)class424.Method2054(0) - Double.longBitsToDouble(4621819117588971520L)) / Double.longBitsToDouble(4611686018427387904L)) : ((Double.longBitsToDouble((long)1822395378 ^ 0x400000006C9F8BF2L) - Math.pow(Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(-4597049319638433792L) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)1527792519 ^ 0x402400005B104387L))) / Double.longBitsToDouble(4611686018427387904L)))))), 
    @Class2057
    Field12497("InCircle", 19, Class1367.Field14224.Method7663(class424 -> Math.sqrt(1.0 - Math.pow((double)class424.Method2054(0), Double.longBitsToDouble(4611686018427387904L))))), 
    @Class694
    Field12498("OutCircle", 20, Class1367.Field14224.Method7663(class424 -> 1.0 - Math.sqrt(1.0 - Math.pow((double)class424.Method2054(0) - 1.0, Double.longBitsToDouble(4611686018427387904L))))), 
    @Class2057
    Field12499("InOutCircle", 21, Class1367.Field14224.Method7663(class424 -> (1.0 - (double)class424.Method2054(0) < Double.longBitsToDouble(4602678819172646912L)) ? ((1.0 - Math.sqrt(1.0 - Math.pow(Double.longBitsToDouble((long)485615964 ^ 0x400000001CF1E95CL) * (double)class424.Method2054(0), Double.longBitsToDouble(4611686018427387904L)))) / Double.longBitsToDouble(4611686018427387904L)) : ((Math.sqrt(1.0 - Math.pow(Double.longBitsToDouble((long)1764174803 ^ 0xC000000069272BD3L) * (double)class424.Method2054(0) + Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4611686018427387904L))) + 1.0) / Double.longBitsToDouble(4611686018427387904L))));
    
    private final Class1763 Field12500;
    private static final Class1024[] Field12501;
    private int Field12502;
    
    private Class1024(final String name, final int ordinal, final Class1763 field12500) {
        this.Field12500 = field12500;
    }
    
    @Override
    public Class1763 Method849() {
        return this.Field12500;
    }
    
    static {
        Field12501 = new Class1024[] { Class1024.Field12478, Class1024.Field12479, Class1024.Field12480, Class1024.Field12481, Class1024.Field12482, Class1024.Field12483, Class1024.Field12484, Class1024.Field12485, Class1024.Field12486, Class1024.Field12487, Class1024.Field12488, Class1024.Field12489, Class1024.Field12490, Class1024.Field12491, Class1024.Field12492, Class1024.Field12493, Class1024.Field12494, Class1024.Field12495, Class1024.Field12496, Class1024.Field12497, Class1024.Field12498, Class1024.Field12499 };
    }
    
    private static String Method4165(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3DF ^ 0xC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
