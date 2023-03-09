/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class14 {
    public static final String Field7883;
    public static final String Field7884;
    public static final String Field7885;
    public static final String Field7886;
    public static final String Field7887;
    public static final String Field7888;
    public static final String Field7889;
    public static Logger Field7890;
    private int Field7891;

    static {
        Field7889 = "com.kisman.cc.features.schematica.core.proxy.ClientProxy";
        Field7888 = "com.kisman.cc.features.schematica.core.proxy.ServerProxy";
        Field7887 = "${version_minecraft}";
        Field7886 = "${forgeVersion}";
        Field7885 = "${version_lunatriuscore}";
        Field7884 = "LunatriusCore";
        Field7883 = "lunatriuscore";
        Field7890 = LogManager.getLogger((String)"lunatriuscore");
    }

    private static String Method157(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 177;
            cArray2[n] = (char)(cArray[n] ^ (0x5437 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

