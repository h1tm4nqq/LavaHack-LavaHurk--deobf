//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class dP7GORRKtAgFLIUfANW5k4t5TFXXxre3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16080 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Colors", this)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16081 = this.Method23(this.Field16080.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Primary Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Primary", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-913720474L ^ 0xC989BB99, (int)((long)877145343 ^ (long)877145343), (int)((long)-531738841 ^ (long)-531738841)))));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16082 = this.Method23(this.Field16080.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Background", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1017257681 ^ (long)-1017257682)).Method355("Background")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16083 = this.Method23(this.Field16080.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Background Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Background", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1424482855 ^ (long)1424482856) << 1, (int)((long)2091926334 ^ (long)2091926321) << 1, ((int)1351920211L ^ 0x5094AA5C) << 1, (int)((long)1441105119 ^ (long)1441105062))).Method313(this.Field16082::Method365)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16084 = this.Method23(this.Field16080.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hover Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Hover", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)233522828L ^ 0xDEB4673, (int)((long)716916812 ^ (long)716916915), (int)-1531681507L ^ 0xA4B465E2, ((int)-1087446736L ^ 0xBF2EE13F) << 2))));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16085 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Component Height", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)741311451 ^ 0x402A00002C2F83DBL), 1.0, Double.longBitsToDouble(0x29EF615DD9B2620AL ^ 0x69D1615DD9B2620AL), (boolean)((long)-2061706345 ^ (long)-2061706346)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16086 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Header Offset", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1186425670 ^ 0x4014000046B76B46L), 0.0, Double.longBitsToDouble(0xCCE5AC1D7606EFCBL ^ 0x8CD1AC1D7606EFCBL), ((int)-1572586422L ^ 0xA2443C4B) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16087 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shadow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)285450017L ^ 0x11039F20) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16088 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hide Annotations", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1198501781L ^ 0xB890506B) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16089 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lines", this)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16090 = this.Method23(this.Field16089.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Horizontal Lines", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1141646606 ^ (long)-1141646605)).Method355("Horizontal")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16091 = this.Method23(this.Field16089.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Vertical Lines", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1200254834L ^ 0x478A6F73) != 0).Method355("Vertical")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16092 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shadow Rects", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1860715096L ^ 0x6EE84258) != 0);
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16093 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Offsets test uwu owo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)2125868908 ^ 0x401400007EB62F6CL), (boolean)((long)243475583 ^ (long)243475583)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16094 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ONG OFFSETS Y??", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)778277050 ^ 0x401400002E6390BAL), (boolean)((long)-179274858 ^ (long)-179274858)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16095 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("UwU Locate Mod", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17333));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16096 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-971825538L ^ 0xC6131E7F) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16097 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test 2 Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(((int)1238939384L ^ 0x49D8B6F7) << 1, ((int)265380741L ^ 0xFD1638A) << 1, ((int)766537754L ^ 0x2DB07015) << 1, (int)-144081972L ^ 0xF7697BB5)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16098 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Idk Just Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xA63C1165616A3D77L ^ 0xE6021165616A3D77L), Double.longBitsToDouble(0x183921F8413106CBL ^ 0x580721F8413106CBL), Double.longBitsToDouble(0xE3E79BD609DB55C5L ^ 0xA3887BD609DB55C5L), ((int)1950735853L ^ 0x7445DDEC) != 0));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16099 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Text X Offset", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x71AAF01E866EB471L ^ 0x31BEF01E866EB471L), 0.0, Double.longBitsToDouble((long)56973656 ^ 0x4024000003655958L), ((int)-1588419756L ^ 0xA152A355) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16100 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline", this)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16101 = this.Method23(this.Field16100.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-1570382057L ^ 0xA265DF17, (int)-727070402L ^ 0xD4A9C93E, (int)2059386157L ^ 0x7ABFBD2D, (int)-895743335L ^ 0xCA9C0A66)).Method355("Color")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16102 = this.Method23(this.Field16100.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Test", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)748932535 ^ (long)748932534)).Method355("Test")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16103 = this.Method23(this.Field16100.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Headers", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1203318589 ^ (long)-1203318589)).Method355("Headers")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16104 = this.Method23(this.Field16100.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Test 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)313682438 ^ (long)313682439)).Method355("Test 2")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16105 = this.Method23(this.Field16100.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Components Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1560299742 ^ (long)1560299742)).Method355("Components")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16106 = this.Method23(this.Field16100.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Line Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0x172BA2A527E7FC31L ^ 0x28923B3CBE7E65ABL), Double.longBitsToDouble(0x3BB1E7B5B058BEC2L ^ 0x7BB1E7B5B058BEC2L), ((int)-360738538L ^ 0xEA7F9116) != 0)));
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16107 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color Picker", this)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16108 = this.Method23(this.Field16107.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color Picker Extra", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1184897358 ^ (long)-1184897358)).Method355("Extra")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16109 = this.Method23(this.Field16107.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color Picker Clear Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-440883561 ^ (long)-440883561)).Method355("Clear Color")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16110 = this.Method23(this.Field16107.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color Picker Copy Paste", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1421904313 ^ (long)1421904313)).Method355("Copy Paste")));
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static dP7GORRKtAgFLIUfANW5k4t5TFXXxre3 Field16111;
    private String Field16112 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public dP7GORRKtAgFLIUfANW5k4t5TFXXxre3() {
        super("Gui", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
        U0aN48ek2FoZNiy3vGHkWmQ1E3Qn8U4n.Method17(this, ((int)-2033239395L ^ 0x86CF3A86) << 1);
        super.Method55();
    }

    @Override
    public void Method38() {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.displayGuiScreen((GuiScreen)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16262.Method1218(null));
        super.Method21((boolean)((long)1619383821 ^ (long)1619383821));
        if (!null.Field11807.Method365()) return;
        dP7GORRKtAgFLIUfANW5k4t5TFXXxre3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)4381898L ^ 0x42DCCA;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1783199170 ^ (long)-1783199039);
            int n2 = (int)((long)-1120383795 ^ (long)-1120383748) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1179480925L ^ 0xB9B2A9DC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

