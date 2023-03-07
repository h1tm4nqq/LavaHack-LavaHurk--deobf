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
import lavahack.client.L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H;
import lavahack.client.Mw1rH0enxHoGt2yOomU73geB3GiYFx8A;
import lavahack.client.QLIpNqoDBC9c2InoQrmQyG4lJtqF4TsA;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import net.minecraftforge.common.MinecraftForge;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;

public class Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo {
    public static File Field17562 = new File("kisman.cc/schematica/");
    public static File Field17563 = new File("kisman.cc/schematica/schematica.kis");
    public static Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo Field17564 = new Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo();
    public static sYSQwf2xD3nukbcGapT2KmEMESaueLHM Field17565 = new sYSQwf2xD3nukbcGapT2KmEMESaueLHM();
    public static HashMap Field17566 = new HashMap();
    private String Field17567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method7636() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6793();
        if (!Field17563.exists()) {
            Field17563.createNewFile();
        }
        pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314 = LogManager.getLogger((String)"LavaHack Schematica");
        Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method252(Field17563);
        Field17565.Method426();
        L2xmcmr9Tre1qBd8su5PcdMk38D1GW4H.Method940();
        MinecraftForge.EVENT_BUS.register((Object)QLIpNqoDBC9c2InoQrmQyG4lJtqF4TsA.Field17312);
        MinecraftForge.EVENT_BUS.register((Object)Mw1rH0enxHoGt2yOomU73geB3GiYFx8A.Field9154);
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
        int n2 = (int)((long)210283680 ^ (long)210283680);
        while (n2 < n) {
            String string = stringArray[n2];
            if (!string.startsWith("#") && string.contains("=")) {
                String[] stringArray2 = string.split("=");
                Field17566.put(stringArray2[(int)-1849994751L ^ 0x91BB5201], stringArray2[(int)((long)-2018849488 ^ (long)-2018849487)]);
            }
            ++n2;
        }
    }

    private static String Method7637(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)210594169L ^ 0xC8D6979;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1291767263L ^ 0x4CFECD20);
            int n2 = (int)-1390920593L ^ 0xAD183CC8;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1320738572 ^ (long)1320735865) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

