/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package lavahack.client;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public enum Class2014 {
    Field17241(new ProtocolVersion(760, "1.19.1-1.19.2")),
    Field17242(new ProtocolVersion(759, "1.19")),
    Field17243(new ProtocolVersion(758, "1.18.2")),
    Field17244(new ProtocolVersion(757, "1.18-1.18.1")),
    Field17245(new ProtocolVersion(756, "1.17.1")),
    Field17246(new ProtocolVersion(755, "1.17")),
    Field17247(new ProtocolVersion(754, "1.16.4-1.16.5")),
    Field17248(new ProtocolVersion(753, "1.16.3")),
    Field17249(new ProtocolVersion(751, "1.16.2")),
    Field17250(new ProtocolVersion(736, "1.16.1")),
    Field17251(new ProtocolVersion(735, "1.16")),
    Field17252(new ProtocolVersion(578, "1.15.2")),
    Field17253(new ProtocolVersion(575, "1.15.1")),
    Field17254(new ProtocolVersion(573, "1.15")),
    Field17255(new ProtocolVersion(498, "1.14.4")),
    Field17256(new ProtocolVersion(490, "1.14.3")),
    Field17257(new ProtocolVersion(485, "1.14.2")),
    Field17258(new ProtocolVersion(480, "1.14.1")),
    Field17259(new ProtocolVersion(477, "1.14")),
    Field17260(new ProtocolVersion(404, "1.13.2")),
    Field17261(new ProtocolVersion(401, "1.13.1")),
    Field17262(new ProtocolVersion(393, "1.13")),
    Field17263(new ProtocolVersion(340, "1.12.2")),
    Field17264(new ProtocolVersion(338, "1.12.1")),
    Field17265(new ProtocolVersion(335, "1.12")),
    Field17266(new ProtocolVersion(316, "1.11.1-1.11.2")),
    Field17267(new ProtocolVersion(315, "1.11")),
    Field17268(new ProtocolVersion(210, "1.10.x")),
    Field17269(new ProtocolVersion(110, "1.9.3-1.9.4")),
    Field17270(new ProtocolVersion(109, "1.9.2")),
    Field17271(new ProtocolVersion(108, "1.9.1")),
    Field17272(new ProtocolVersion(107, "1.9")),
    Field17273(new ProtocolVersion(47, "1.8.x"));

    private final ProtocolVersion Field17274;
    private int Field17276;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class2014() {
        void var3_1;
        this.Field17274 = var3_1;
    }

    public ProtocolVersion Method7469() {
        return this.Field17274;
    }

    public static ProtocolVersion Method7470(int n) {
        Class2014[] class2014Array = Class2014.values();
        int n2 = class2014Array.length;
        int n3 = 0;
        while (n3 < n2) {
            Class2014 class2014 = class2014Array[n3];
            if (class2014.Method7469().getVersion() == n) {
                return class2014.Method7469();
            }
            ++n3;
        }
        return Field17263.Method7469();
    }

    public String toString() {
        return this.Field17274.getName();
    }

    private static String Method7471(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x64C4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

