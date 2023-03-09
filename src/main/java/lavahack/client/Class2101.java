/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.MinecraftForge
 *  org.apache.logging.log4j.LogManager
 */
package lavahack.client;

import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.HashMap;
import lavahack.client.Class137;
import lavahack.client.Class1796;
import lavahack.client.Class2025;
import lavahack.client.Class257;
import lavahack.client.Class32;
import lavahack.client.Class46;
import lavahack.client.Class542;
import net.minecraftforge.common.MinecraftForge;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;

public class Class2101 {
    public static File Field17562 = new File("kisman.cc/schematica/");
    public static File Field17563 = new File("kisman.cc/schematica/schematica.kis");
    public static Class2101 Field17564 = new Class2101();
    public static Class46 Field17565 = new Class46();
    public static HashMap Field17566 = new HashMap();
    private String Field17567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method7636() {
        Class1796.Method6793();
        if (!Field17563.exists()) {
            Field17563.createNewFile();
        }
        Class542.Field10314 = LogManager.getLogger((String)"LavaHack Schematica");
        Class32.Method252(Field17563);
        Field17565.Method426();
        Class137.Method940();
        MinecraftForge.EVENT_BUS.register((Object)Class2025.Field17312);
        MinecraftForge.EVENT_BUS.register((Object)Class257.Field9154);
        Field17565.Method427();
        Field17565.Method428();
        StringWriter stringWriter = new StringWriter();
        String[] stringArray = this.getClass().getResourceAsStream("assets/schematica/lang/eu_us.lang");
        if (stringArray == null) {
            throw new Exception();
        }
        IOUtils.copy((InputStream)stringArray, (Writer)stringWriter, Charset.defaultCharset());
        stringArray = stringWriter.toString().split("\n");
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            String string = stringArray[n2];
            if (!string.startsWith("#") && string.contains("=")) {
                String[] stringArray2 = string.split("=");
                Field17566.put(stringArray2[0], stringArray2[1]);
            }
            ++n2;
        }
    }

    private static String Method7637(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 167;
            cArray2[n] = (char)(cArray[n] ^ (0x2DD4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

