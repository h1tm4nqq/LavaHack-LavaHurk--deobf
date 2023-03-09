//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class2028;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class695;
import lavahack.client.Class873;
import lavahack.client.Class97;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class Class1768
extends Class42 {
    private final Class1996 Field16080 = this.Method24(new Class1996(new Class44("Colors", this)));
    public final Class44 Field16081 = this.Method23(this.Field16080.Method7405(new Class44("Primary Color", (Class42)this, "Primary", new Class2027(255, 0, 0))));
    public final Class44 Field16082 = this.Method23(this.Field16080.Method7405(new Class44("Background", (Class42)this, true).Method355("Background")));
    public final Class44 Field16083 = this.Method23(this.Field16080.Method7405(new Class44("Background Color", (Class42)this, "Background", new Class2027(30, 30, 30, 121)).Method313(this.Field16082::Method365)));
    public final Class44 Field16084 = this.Method23(this.Field16080.Method7405(new Class44("Hover Color", (Class42)this, "Hover", new Class2027(255, 255, 255, 60))));
    public final Class44 Field16085 = this.Method23(new Class44("Component Height", (Class42)this, Double.longBitsToDouble((long)741311451 ^ 0x402A00002C2F83DBL), 1.0, Double.longBitsToDouble(4629137466983448576L), true));
    public final Class44 Field16086 = this.Method23(new Class44("Header Offset", (Class42)this, Double.longBitsToDouble((long)1186425670 ^ 0x4014000046B76B46L), 0.0, Double.longBitsToDouble(0x4034000000000000L), true));
    public final Class44 Field16087 = this.Method23(new Class44("Shadow", (Class42)this, true));
    public final Class44 Field16088 = this.Method23(new Class44("Hide Annotations", (Class42)this, false));
    private final Class1996 Field16089 = this.Method24(new Class1996(new Class44("Lines", this)));
    public final Class44 Field16090 = this.Method23(this.Field16089.Method7405(new Class44("Horizontal Lines", (Class42)this, true).Method355("Horizontal")));
    public final Class44 Field16091 = this.Method23(this.Field16089.Method7405(new Class44("Vertical Lines", (Class42)this, true).Method355("Vertical")));
    public final Class44 Field16092 = new Class44("Shadow Rects", (Class42)this, false);
    public final Class44 Field16093 = this.Method23(new Class44("Offsets test uwu owo", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)2125868908 ^ 0x401400007EB62F6CL), false));
    public final Class44 Field16094 = this.Method23(new Class44("ONG OFFSETS Y??", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)778277050 ^ 0x401400002E6390BAL), false));
    public final Class44 Field16095 = this.Method23(new Class44("UwU Locate Mod", (Class42)this, Class2028.Field17333));
    public final Class44 Field16096 = this.Method23(new Class44("Test 2", (Class42)this, true));
    public final Class44 Field16097 = this.Method23(new Class44("Test 2 Color", (Class42)this, new Class2027(30, 30, 30, 121)));
    public final Class44 Field16098 = this.Method23(new Class44("Idk Just Alpha", (Class42)this, Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4643176031446892544L), true));
    public final Class44 Field16099 = this.Method23(new Class44("Text X Offset", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble((long)56973656 ^ 0x4024000003655958L), true));
    private final Class1996 Field16100 = this.Method24(new Class1996(new Class44("Outline", this)));
    public final Class44 Field16101 = this.Method23(this.Field16100.Method7405(new Class44("Outline Color", (Class42)this, new Class2027(0, 0, 0, 255)).Method355("Color")));
    public final Class44 Field16102 = this.Method23(this.Field16100.Method7405(new Class44("Outline Test", (Class42)this, true).Method355("Test")));
    public final Class44 Field16103 = this.Method23(this.Field16100.Method7405(new Class44("Outline Headers", (Class42)this, false).Method355("Headers")));
    public final Class44 Field16104 = this.Method23(this.Field16100.Method7405(new Class44("Outline Test 2", (Class42)this, true).Method355("Test 2")));
    public final Class44 Field16105 = this.Method23(this.Field16100.Method7405(new Class44("Components Outline", (Class42)this, false).Method355("Components")));
    public final Class44 Field16106 = this.Method23(this.Field16100.Method7405(new Class44("Line Width", (Class42)this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(0x4000000000000000L), false)));
    public final Class1996 Field16107 = this.Method24(new Class1996(new Class44("Color Picker", this)));
    public final Class44 Field16108 = this.Method23(this.Field16107.Method7405(new Class44("Color Picker Extra", (Class42)this, false).Method355("Extra")));
    public final Class44 Field16109 = this.Method23(this.Field16107.Method7405(new Class44("Color Picker Clear Color", (Class42)this, false).Method355("Clear Color")));
    public final Class44 Field16110 = this.Method23(this.Field16107.Method7405(new Class44("Color Picker Copy Paste", (Class42)this, false).Method355("Copy Paste")));
    @Class873
    public static Class1768 Field16111;
    private String Field16112 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1768() {
        super("Gui", Class97.Field8339);
        Class695.Method17(this, 54);
        super.Method55();
    }

    @Override
    public void Method38() {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.displayGuiScreen((GuiScreen)Class1796.Field16241.Field16262.Method1218(null));
        super.Method21(false);
        if (!null.Field11807.Method365()) return;
        Class1768.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 196;
            cArray2[n] = (char)(cArray[n] ^ (0x4AFE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

