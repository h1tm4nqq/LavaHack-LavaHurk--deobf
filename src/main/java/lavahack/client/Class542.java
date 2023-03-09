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

public class Class542 {
    public static final String Field10306;
    public static final String Field10307;
    public static final String Field10308;
    public static final String Field10309;
    public static final String Field10310;
    public static final String Field10311;
    public static final String Field10312;
    public static final String Field10313;
    public static Logger Field10314;
    private String Field10315 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field10313 = "com.kisman.cc.features.schematica.schematica.client.gui.config.GuiFactory";
        Field10312 = "com.kisman.cc.features.schematica.schematica.proxy.ClientProxy";
        Field10311 = "com.kisman.cc.features.schematica.schematica.proxy.ServerProxy";
        Field10310 = "${version_minecraft}";
        Field10309 = "${forgeVersion}";
        Field10308 = "${version_schematica}";
        Field10307 = "Schematica";
        Field10306 = "schematica";
        Field10314 = LogManager.getLogger((String)"schematica");
    }

    private static String Method2441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 198;
            cArray2[n] = (char)(cArray[n] ^ (0x3943 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

