//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.apache.logging.log4j.*;

public class Class14
{
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
        Class14.Field7890 = LogManager.getLogger("lunatriuscore");
    }
    
    private static String Method157(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5437 ^ 0xB1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
