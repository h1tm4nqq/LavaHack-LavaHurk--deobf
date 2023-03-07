/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.kWERp1cGJ6a4MYS0Qiy9PDz0HdmefSOH;
import lavahack.client.q6LSBHqSOmWFZdKPhYSa6ojtR1CL2deX;
import org.jetbrains.annotations.NotNull;

public class eeG2dn5Z33ilzk7NDgzDanhaDtW6sQmZ
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private int Field11451;

    public eeG2dn5Z33ilzk7NDgzDanhaDtW6sQmZ() {
        super("lang");
    }

    @Override
    public String Method447() {
        return "";
    }

    @Override
    public String Method448() {
        return "lang <language>";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Map map = kWERp1cGJ6a4MYS0Qiy9PDz0HdmefSOH.Method1471();
        System.out.println(map);
        String string2 = kWERp1cGJ6a4MYS0Qiy9PDz0HdmefSOH.Method1475(map, stringArray[(int)((long)-1232028946 ^ (long)-1232028945)]);
        if (string2 != null) {
            q6LSBHqSOmWFZdKPhYSa6ojtR1CL2deX.Field11262 = string2;
            this.Method437("Set target language to " + (String)map.get(string2));
            return;
        }
        this.Method438("Could not find language");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-220020516 ^ (long)-220020516);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1187912014L ^ 0x46CE19B1);
            int n2 = ((int)-1007291396L ^ 0xC3F5F3FF) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)626971893 ^ (long)626977390) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

