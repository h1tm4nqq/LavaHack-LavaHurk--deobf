//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.viaversion.viaversion.api.protocol.version.*;

public enum Class2014
{
    Field17241("R1_19_2", 0, new ProtocolVersion(760, "1.19.1-1.19.2")), 
    Field17242("R1_19", 1, new ProtocolVersion(759, "1.19")), 
    Field17243("R1_18_2", 2, new ProtocolVersion(758, "1.18.2")), 
    Field17244("R1_18_1", 3, new ProtocolVersion(757, "1.18-1.18.1")), 
    Field17245("R1_17_1", 4, new ProtocolVersion(756, "1.17.1")), 
    Field17246("R1_17", 5, new ProtocolVersion(755, "1.17")), 
    Field17247("R1_16_5", 6, new ProtocolVersion(754, "1.16.4-1.16.5")), 
    Field17248("R1_16_3", 7, new ProtocolVersion(753, "1.16.3")), 
    Field17249("R1_16_2", 8, new ProtocolVersion(751, "1.16.2")), 
    Field17250("R1_16_1", 9, new ProtocolVersion(736, "1.16.1")), 
    Field17251("R1_16", 10, new ProtocolVersion(735, "1.16")), 
    Field17252("R1_15_2", 11, new ProtocolVersion(578, "1.15.2")), 
    Field17253("R1_15_1", 12, new ProtocolVersion(575, "1.15.1")), 
    Field17254("R1_15", 13, new ProtocolVersion(573, "1.15")), 
    Field17255("R1_14_4", 14, new ProtocolVersion(498, "1.14.4")), 
    Field17256("R1_14_3", 15, new ProtocolVersion(490, "1.14.3")), 
    Field17257("R1_14_2", 16, new ProtocolVersion(485, "1.14.2")), 
    Field17258("R1_14_1", 17, new ProtocolVersion(480, "1.14.1")), 
    Field17259("R1_14", 18, new ProtocolVersion(477, "1.14")), 
    Field17260("R1_13_2", 19, new ProtocolVersion(404, "1.13.2")), 
    Field17261("R1_13_1", 20, new ProtocolVersion(401, "1.13.1")), 
    Field17262("R1_13", 21, new ProtocolVersion(393, "1.13")), 
    Field17263("R1_12_2", 22, new ProtocolVersion(340, "1.12.2")), 
    Field17264("R1_12_1", 23, new ProtocolVersion(338, "1.12.1")), 
    Field17265("R1_12", 24, new ProtocolVersion(335, "1.12")), 
    Field17266("R1_11_1", 25, new ProtocolVersion(316, "1.11.1-1.11.2")), 
    Field17267("R1_11", 26, new ProtocolVersion(315, "1.11")), 
    Field17268("R1_10", 27, new ProtocolVersion(210, "1.10.x")), 
    Field17269("R1_9_4", 28, new ProtocolVersion(110, "1.9.3-1.9.4")), 
    Field17270("R1_9_2", 29, new ProtocolVersion(109, "1.9.2")), 
    Field17271("R1_9_1", 30, new ProtocolVersion(108, "1.9.1")), 
    Field17272("R1_9", 31, new ProtocolVersion(107, "1.9")), 
    Field17273("R1_8", 32, new ProtocolVersion(47, "1.8.x"));
    
    private final ProtocolVersion Field17274;
    private static final Class2014[] Field17275;
    private int Field17276;
    
    private Class2014(final String name, final int ordinal, final ProtocolVersion field17274) {
        this.Field17274 = field17274;
    }
    
    public ProtocolVersion Method7469() {
        return this.Field17274;
    }
    
    public static ProtocolVersion Method7470(final int n) {
        for (final Class2014 class2014 : values()) {
            if (class2014.Method7469().getVersion() == n) {
                return class2014.Method7469();
            }
        }
        return Class2014.Field17263.Method7469();
    }
    
    @Override
    public String toString() {
        return this.Field17274.getName();
    }
    
    static {
        Field17275 = new Class2014[] { Class2014.Field17241, Class2014.Field17242, Class2014.Field17243, Class2014.Field17244, Class2014.Field17245, Class2014.Field17246, Class2014.Field17247, Class2014.Field17248, Class2014.Field17249, Class2014.Field17250, Class2014.Field17251, Class2014.Field17252, Class2014.Field17253, Class2014.Field17254, Class2014.Field17255, Class2014.Field17256, Class2014.Field17257, Class2014.Field17258, Class2014.Field17259, Class2014.Field17260, Class2014.Field17261, Class2014.Field17262, Class2014.Field17263, Class2014.Field17264, Class2014.Field17265, Class2014.Field17266, Class2014.Field17267, Class2014.Field17268, Class2014.Field17269, Class2014.Field17270, Class2014.Field17271, Class2014.Field17272, Class2014.Field17273 };
    }
    
    private static String Method7471(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x64C4 ^ 0xC2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
