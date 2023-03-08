//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.apache.logging.log4j.*;
import net.minecraftforge.common.*;
import java.nio.charset.*;
import org.apache.commons.io.*;
import java.io.*;

public class Class2101
{
    public static File Field17562;
    public static File Field17563;
    public static Class2101 Field17564;
    public static Class46 Field17565;
    public static HashMap Field17566;
    private String Field17567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method7636() {
        Class1796.Method6793();
        if (!Class2101.Field17563.exists()) {
            Class2101.Field17563.createNewFile();
        }
        Class542.Field10314 = LogManager.getLogger("LavaHack Schematica");
        Class32.Method252(Class2101.Field17563);
        Class2101.Field17565.Method426();
        Class137.Method940();
        MinecraftForge.EVENT_BUS.register((Object)Class2025.Field17312);
        MinecraftForge.EVENT_BUS.register((Object)Class257.Field9154);
        Class2101.Field17565.Method427();
        Class2101.Field17565.Method428();
        final StringWriter stringWriter = new StringWriter();
        final InputStream resourceAsStream = this.getClass().getResourceAsStream("assets/schematica/lang/eu_us.lang");
        if (resourceAsStream == null) {
            throw new Exception();
        }
        IOUtils.copy(resourceAsStream, (Writer)stringWriter, Charset.defaultCharset());
        for (final String s : stringWriter.toString().split("\n")) {
            if (!s.startsWith("#") && s.contains("=")) {
                final String[] split2 = s.split("=");
                Class2101.Field17566.put(split2[0], split2[1]);
            }
        }
    }
    
    static {
        Class2101.Field17562 = new File("kisman.cc/schematica/");
        Class2101.Field17563 = new File("kisman.cc/schematica/schematica.kis");
        Class2101.Field17564 = new Class2101();
        Class2101.Field17565 = new Class46();
        Class2101.Field17566 = new HashMap();
    }
    
    private static String Method7637(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2DD4 ^ 0xA7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
