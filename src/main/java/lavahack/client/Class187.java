//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class187 implements Class118
{
    @Class2057
    @Class694
    Field8814("Linear", 0, Class1367.Field14224.Method7663(class424 -> (Double)class424.Method2054(0))), 
    @Class2057
    Field8815("InSine", 1, Class1367.Field14224.Method7663(class424 -> 1.0 - Math.cos((double)class424.Method2054(0) * Double.longBitsToDouble(4614256656552045848L) / Double.longBitsToDouble(4611686018427387904L)))), 
    @Class694
    Field8816("OutSine", 2, Class1367.Field14224.Method7663(class424 -> Math.sin((double)class424.Method2054(0) * Double.longBitsToDouble((long)824206208 ^ 0x400921FB65644E98L) / Double.longBitsToDouble((long)1825109607 ^ 0x400000006CC8F667L)))), 
    @Class2057
    Field8817("InOutSine", 3, Class1367.Field14224.Method7663(class424 -> -(Math.cos(Double.longBitsToDouble(4614256656552045848L) * (double)class424.Method2054(0)) - 1.0) / Double.longBitsToDouble((long)1949692482 ^ 0x400000007435F242L))), 
    @Class2057
    Field8818("InQuad", 4, Class1367.Field14224.Method7663(class424 -> (double)class424.Method2054(0) * (double)class424.Method2054(0))), 
    @Class694
    Field8819("OutQuad", 5, Class1367.Field14224.Method7663(class424 -> 1.0 - (1.0 - (double)class424.Method2054(0)) * (1.0 - (double)class424.Method2054(0)))), 
    @Class2057
    Field8820("InOutQuad", 6, Class1367.Field14224.Method7663(class424 -> ((double)class424.Method2054(0) < Double.longBitsToDouble(4602678819172646912L)) ? (Double.longBitsToDouble(4611686018427387904L) * (double)class424.Method2054(0) * (double)class424.Method2054(0)) : (1.0 - Math.pow(Double.longBitsToDouble((long)430903399 ^ 0xC000000019AF1067L) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)2035925676 ^ 0x400000007959C2ACL), Double.longBitsToDouble((long)236268468 ^ 0x400000000E152BB4L)) / Double.longBitsToDouble(4611686018427387904L)))), 
    @Class2057
    Field8821("InCubic", 7, Class1367.Field14224.Method7663(class424 -> (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0))), 
    @Class694
    Field8822("OutCubic", 8, Class1367.Field14224.Method7663(class424 -> 1.0 - Math.pow(1.0 - (double)class424.Method2054(0), Double.longBitsToDouble(4613937818241073152L)))), 
    @Class2057
    Field8823("InOutCubic", 9, Class1367.Field14224.Method7663(class424 -> ((double)class424.Method2054(0) < Double.longBitsToDouble(4602678819172646912L)) ? (Double.longBitsToDouble((long)1595557558 ^ 0x401000005F1A46B6L) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0)) : (1.0 - Math.pow(Double.longBitsToDouble(-4611686018427387904L) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)1022711812 ^ 0x400000003CF55804L), Double.longBitsToDouble((long)186832022 ^ 0x400800000B22D496L)) / Double.longBitsToDouble(4611686018427387904L)))), 
    @Class2057
    Field8824("InQuart", 10, Class1367.Field14224.Method7663(class424 -> (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0))), 
    @Class694
    Field8825("OutQuart", 11, Class1367.Field14224.Method7663(class424 -> 1.0 - Math.pow(1.0 - (double)class424.Method2054(0), Double.longBitsToDouble((long)1077136781 ^ 0x401000004033CD8DL)))), 
    @Class2057
    Field8826("InOutQuart", 12, Class1367.Field14224.Method7663(class424 -> ((double)class424.Method2054(0) < Double.longBitsToDouble((long)662119998 ^ 0x3FE000002777263EL)) ? (Double.longBitsToDouble((long)1835741518 ^ 0x402000006D6B314EL) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0)) : (1.0 - Math.pow(Double.longBitsToDouble(-4611686018427387904L) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)1637230257 ^ 0x40000000619626B1L), Double.longBitsToDouble(4616189618054758400L)) / Double.longBitsToDouble((long)811057754 ^ 0x400000003057C25AL)))), 
    @Class2057
    Field8827("InQuint", 13, Class1367.Field14224.Method7663(class424 -> (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0))), 
    @Class694
    Field8828("OutQuin", 14, Class1367.Field14224.Method7663(class424 -> 1.0 - Math.pow(1.0 - (double)class424.Method2054(0), Double.longBitsToDouble(4617315517961601024L)))), 
    @Class2057
    Field8829("InOutQuint", 15, Class1367.Field14224.Method7663(class424 -> ((double)class424.Method2054(0) < Double.longBitsToDouble(4602678819172646912L)) ? (Double.longBitsToDouble((long)1570717915 ^ 0x403000005D9F40DBL) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0) * (double)class424.Method2054(0)) : (1.0 - Math.pow(Double.longBitsToDouble((long)1851870301 ^ 0xC00000006E614C5DL) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)801610417 ^ 0x400000002FC79AB1L), Double.longBitsToDouble((long)1493350850 ^ 0x401400005902B9C2L)) / Double.longBitsToDouble(4611686018427387904L)))), 
    @Class2057
    Field8830("InExpo", 16, Class1367.Field14224.Method7663(class424 -> ((double)class424.Method2054(0) == 0.0) ? 0.0 : Math.pow(Double.longBitsToDouble((long)112716629 ^ 0x4000000006B7EB55L), Double.longBitsToDouble(4621819117588971520L) * (double)class424.Method2054(0) - Double.longBitsToDouble(4621819117588971520L)))), 
    @Class694
    Field8831("OutExpo", 17, Class1367.Field14224.Method7663(class424 -> ((double)class424.Method2054(0) == 1.0) ? 1.0 : (1.0 - Math.pow(Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble((long)431176685 ^ 0xC024000019B33BEDL) * (double)class424.Method2054(0))))), 
    @Class2057
    Field8832("InOutExpo", 18, Class1367.Field14224.Method7663(class424 -> ((double)class424.Method2054(0) == 0.0) ? 0.0 : (((double)class424.Method2054(0) == 1.0) ? 1.0 : (((double)class424.Method2054(0) < Double.longBitsToDouble(4602678819172646912L)) ? (Math.pow(Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble(4626322717216342016L) * (double)class424.Method2054(0) - Double.longBitsToDouble(4621819117588971520L)) / Double.longBitsToDouble((long)40731654 ^ 0x40000000026D8406L)) : ((Double.longBitsToDouble((long)896513981 ^ 0x40000000356FB7BDL) - Math.pow(Double.longBitsToDouble((long)39431982 ^ 0x400000000259AF2EL), Double.longBitsToDouble(-4597049319638433792L) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)1886872567 ^ 0x40240000707763F7L))) / Double.longBitsToDouble((long)14638318 ^ 0x4000000000DF5CEEL)))))), 
    @Class2057
    Field8833("InCircle", 19, Class1367.Field14224.Method7663(class424 -> 1.0 - Math.sqrt(1.0 - Math.pow((double)class424.Method2054(0), Double.longBitsToDouble(4611686018427387904L))))), 
    @Class694
    Field8834("OutCircle", 20, Class1367.Field14224.Method7663(class424 -> Math.sqrt(1.0 - Math.pow((double)class424.Method2054(0) - 1.0, Double.longBitsToDouble((long)776723492 ^ 0x400000002E4BDC24L))))), 
    @Class2057
    Field8835("InOutCircle", 21, Class1367.Field14224.Method7663(class424 -> ((double)class424.Method2054(0) < Double.longBitsToDouble(4602678819172646912L)) ? ((1.0 - Math.sqrt(1.0 - Math.pow(Double.longBitsToDouble(4611686018427387904L) * (double)class424.Method2054(0), Double.longBitsToDouble((long)1670169852 ^ 0x40000000638CC4FCL)))) / Double.longBitsToDouble(4611686018427387904L)) : ((Math.sqrt(1.0 - Math.pow(Double.longBitsToDouble((long)1711824152 ^ 0xC000000066085D18L) * (double)class424.Method2054(0) + Double.longBitsToDouble((long)858991996 ^ 0x4000000033332D7CL), Double.longBitsToDouble(4611686018427387904L))) + 1.0) / Double.longBitsToDouble(4611686018427387904L))));
    
    private final Class1763 Field8836;
    private static final Class187[] Field8837;
    private String Field8838 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class187(final String name, final int ordinal, final Class1763 field8836) {
        this.Field8836 = field8836;
    }
    
    public Class1763 Method849() {
        return this.Field8836;
    }
    
    static {
        Field8837 = new Class187[] { Class187.Field8814, Class187.Field8815, Class187.Field8816, Class187.Field8817, Class187.Field8818, Class187.Field8819, Class187.Field8820, Class187.Field8821, Class187.Field8822, Class187.Field8823, Class187.Field8824, Class187.Field8825, Class187.Field8826, Class187.Field8827, Class187.Field8828, Class187.Field8829, Class187.Field8830, Class187.Field8831, Class187.Field8832, Class187.Field8833, Class187.Field8834, Class187.Field8835 };
    }
    
    private static String Method1143(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3B8A ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
