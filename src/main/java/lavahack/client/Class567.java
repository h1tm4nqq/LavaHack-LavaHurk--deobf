//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class567
{
    public static final float Field10418;
    private String Field10419 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static boolean Method2506(final float a, final float n) {
        return Math.abs(a) <= n;
    }
    
    public static boolean Method2507(final double a, final double n) {
        return Math.abs(a) <= n;
    }
    
    public static float Method2508(final float n, final float n2, final float n3, final float n4) {
        if (n4 <= 0.0f) {
            return n2;
        }
        final float n5 = n2 - n;
        if (Method2506(n5 * n5, Float.intBitsToFloat(953267991))) {
            return n2;
        }
        return n + n5 * Class447.Method2117(n3 * n4, 0.0f, 1.0f);
    }
    
    static {
        Field10418 = 0.0f;
    }
}
