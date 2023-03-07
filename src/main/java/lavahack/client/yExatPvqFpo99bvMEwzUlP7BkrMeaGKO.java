//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.io.File;
import java.io.FileWriter;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import lavahack.client.yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class yExatPvqFpo99bvMEwzUlP7BkrMeaGKO
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private static final File Field11016 = new File(Minecraft.getMinecraft().gameDir + "kisman.cc/", "fmtcmd.txt");
    private String Field11017 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public yExatPvqFpo99bvMEwzUlP7BkrMeaGKO() {
        super("fmt");
        if (!Field11016.exists()) {
            yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2946(Field11016, (boolean)((long)146281833 ^ (long)146281833));
        }
        hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb[] hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray = new hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb[(int)((long)-50027364 ^ (long)-50027361)];
        hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray[(int)245873872L ^ 0xEA7BCD0] = new yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this);
        hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray[(int)-514207333L ^ 0xE159D19A] = new yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this);
        hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray[((int)807361234L ^ 0x301F5AD3) << 1] = new yExatPvqFpo99bvMEwzUlP7BkrMeaGKO$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this);
        this.Method445(hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray);
    }

    @Override
    public String Method447() {
        return "Format chat messages";
    }

    @Override
    public String Method448() {
        return "-fmt <fmt/config> <message to be formatted (only when used with fmt)>";
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        this.Method446(string, stringArray);
    }

    private static void Method2946(File file, boolean bl) {
        String string = System.lineSeparator();
        if (bl) {
            file.delete();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("CommandPrefix:%" + string + "QuotePrefix:Q" + string + "LookupPrefix:L" + string + "InsertPrefix:I" + string + "ContentBounders:{}");
    }

    static File Method2947() {
        return Field11016;
    }

    static void Method2948(File file, boolean bl) {
        yExatPvqFpo99bvMEwzUlP7BkrMeaGKO.Method2946(file, bl);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1858001450L ^ 0x6EBEDA2A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2116646362 ^ (long)2116646181);
            int n2 = (int)((long)432210636 ^ (long)432210593) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1237291933 ^ (long)1237304572) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

