//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1155
{
    private static final int Field13210;
    private static final int Field13211;
    private static final int Field13212;
    private static final int Field13213;
    private static final int Field13214;
    private static final float Field13215;
    private static final float[] Field13216;
    private String Field13217 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method4678() {
        for (int i = 0; i < Class1155.Field13214; ++i) {
            for (int j = 0; j < Class1155.Field13214; ++j) {
                Class1155.Field13216[j * Class1155.Field13214 + i] = (float)Math.atan2(j / (float)Class1155.Field13214, i / (float)Class1155.Field13214);
            }
        }
    }
    
    public static float Method4679(double b, double a) {
        float n;
        float intBitsToFloat;
        if (a < 0.0) {
            if (b < 0.0) {
                a = -a;
                b = -b;
                n = 1.0f;
            }
            else {
                a = -a;
                n = Float.intBitsToFloat(-1082130432);
            }
            intBitsToFloat = Float.intBitsToFloat(-1068953637);
        }
        else {
            if (b < 0.0) {
                b = -b;
                n = Float.intBitsToFloat(-1082130432);
            }
            else {
                n = 1.0f;
            }
            intBitsToFloat = 0.0f;
        }
        final double n2 = 1.0 / (Math.max(a, b) * Class1155.Field13215);
        return (Class1155.Field13216[(int)(b * n2) * Class1155.Field13214 + (int)(a * n2)] + intBitsToFloat) * n;
    }
    
    static {
        Field13213 = 65536;
        Field13212 = 65535;
        Field13211 = 16;
        Field13210 = 8;
        Field13214 = (int)Math.sqrt(Double.longBitsToDouble((long)1054530205 ^ 0x40F000003EDADA9DL));
        Field13215 = 1.0f / (Class1155.Field13214 - 1);
        Field13216 = new float[65536];
    }
}
