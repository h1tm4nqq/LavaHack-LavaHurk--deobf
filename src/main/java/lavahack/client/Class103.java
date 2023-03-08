//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import java.util.*;

public enum Class103
{
    Field8358("BASE", 0, (List)new ArrayList(Arrays.asList(new Vec3d(0.0, Double.longBitsToDouble((long)1873192551 ^ 0xBFF000006FA6A667L), 0.0), new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble((long)1504896560 ^ 0xBFF0000059B2E630L), Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)59043781 ^ 0xBFF000000384EFC5L))))), 
    Field8359("STANDARD", 1, (List)new ArrayList(Arrays.asList(new Vec3d(0.0, Double.longBitsToDouble((long)877206106 ^ 0xBFF0000034491A5AL), 0.0), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)459304976 ^ 0xBFF000001B607010L))))), 
    Field8360("PROTECT", 2, (List)new ArrayList(Arrays.asList(new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1647444569 ^ 0xBFF0000062320259L)), new Vec3d(Double.longBitsToDouble(4611686018427387904L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4611686018427387904L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)951279350 ^ 0x4000000038B35EF6L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)741803036 ^ 0xC00000002C37041CL)), new Vec3d(Double.longBitsToDouble((long)1869221786 ^ 0x400800006F6A0F9AL), 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)1369872541 ^ 0xC008000051A6989DL), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1803446849 ^ 0x400800006B7E6A41L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)46732642 ^ 0xC008000002C91562L))))), 
    Field8361("PROTECTplus", 3, (List)new ArrayList(Arrays.asList(new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(1.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)436277421 ^ 0xBFF000001A0110ADL), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(1.0, 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(0.0, 0.0, 1.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(Double.longBitsToDouble((long)1029974521 ^ 0x400000003D6429F9L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble((long)1142266043 ^ 0xC0000000441598BBL), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(4611686018427387904L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4611686018427387904L)), new Vec3d(Double.longBitsToDouble(4613937818241073152L), 0.0, 0.0), new Vec3d(Double.longBitsToDouble(-4609434218613702656L), 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(4613937818241073152L)), new Vec3d(0.0, 0.0, Double.longBitsToDouble((long)1174004679 ^ 0xC008000045F9E3C7L)))));
    
    private final List Field8362;
    private static final Class103[] Field8363;
    private String Field8364 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class103(final String name, final int ordinal, final List field8362) {
        this.Field8362 = field8362;
    }
    
    public List Method815() {
        return this.Field8362;
    }
    
    static {
        Field8363 = new Class103[] { Class103.Field8358, Class103.Field8359, Class103.Field8360, Class103.Field8361 };
    }
    
    private static String Method817(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1690 ^ 0xBA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
