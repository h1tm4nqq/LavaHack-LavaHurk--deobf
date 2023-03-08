//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.apache.logging.log4j.*;

public class Class542
{
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
        Class542.Field10314 = LogManager.getLogger("schematica");
    }
    
    private static String Method2441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3943 ^ 0xC6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
