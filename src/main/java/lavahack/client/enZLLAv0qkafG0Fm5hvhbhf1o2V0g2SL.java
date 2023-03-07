/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaTable
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 *  org.luaj.vm2.lib.jse.CoerceLuaToJava
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

public class enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL {
    private static LuaValue Field15639;
    private String Field15640 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static LuaValue Method6379() {
        if (Field15639 != null) return Field15639;
        Field15639 = new LuaTable();
        Field15639.set("rgb", (LuaValue)new enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$Ljc0gDTN8WkwPRHY480HpEkScGALG41A());
        Field15639.set("rgba", (LuaValue)new enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi());
        Field15639.set("hsv", (LuaValue)new enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV());
        Field15639.set("pulse", (LuaValue)new enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV());
        Field15639.set("fade", (LuaValue)new enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf());
        Field15639.set("rainbow", (LuaValue)new enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS());
        return Field15639;
    }

    public static LuaValue Method6380(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        Color color = (Color)CoerceLuaToJava.coerce((LuaValue)luaValue, Color.class);
        Color color2 = (Color)CoerceLuaToJava.coerce((LuaValue)luaValue2, Color.class);
        return CoerceJavaToLua.coerce((Object)new Color((int)((float)color.getRed() * luaValue3.tofloat() + (float)color2.getRed() * (1.0f - luaValue3.tofloat())), (int)((float)color.getGreen() * luaValue3.tofloat() + (float)color2.getGreen() * (1.0f - luaValue3.tofloat())), (int)((float)color.getBlue() * luaValue3.tofloat() + (float)color2.getBlue() * (1.0f - luaValue3.tofloat())), (int)((float)color.getAlpha() * luaValue3.tofloat() + (float)color2.getAlpha() * (1.0f - luaValue3.tofloat()))));
    }

    private static String Method6381(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-904431022L ^ 0xCA177A52;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1243304807L ^ 0x4A1B5398);
            int n2 = (int)((long)-1492776217 ^ (long)-1492776236) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1473548238L ^ 0xA82B0355 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

