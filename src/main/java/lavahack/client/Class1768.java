//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraft.client.gui.*;
import net.minecraft.util.*;

public class Class1768 extends Class42
{
    private final Class1996 Field16080;
    public final Class44 Field16081;
    public final Class44 Field16082;
    public final Class44 Field16083;
    public final Class44 Field16084;
    public final Class44 Field16085;
    public final Class44 Field16086;
    public final Class44 Field16087;
    public final Class44 Field16088;
    private final Class1996 Field16089;
    public final Class44 Field16090;
    public final Class44 Field16091;
    public final Class44 Field16092;
    public final Class44 Field16093;
    public final Class44 Field16094;
    public final Class44 Field16095;
    public final Class44 Field16096;
    public final Class44 Field16097;
    public final Class44 Field16098;
    public final Class44 Field16099;
    private final Class1996 Field16100;
    public final Class44 Field16101;
    public final Class44 Field16102;
    public final Class44 Field16103;
    public final Class44 Field16104;
    public final Class44 Field16105;
    public final Class44 Field16106;
    public final Class1996 Field16107;
    public final Class44 Field16108;
    public final Class44 Field16109;
    public final Class44 Field16110;
    @Class873
    public static Class1768 Field16111;
    private String Field16112 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1768() {
        super("Gui", Class97.Field8339);
        this.Field16080 = this.Method24(new Class1996(new Class44("Colors", this)));
        this.Field16081 = this.Method23(this.Field16080.Method7405(new Class44("Primary Color", this, "Primary", new Class2027(255, 0, 0))));
        this.Field16082 = this.Method23(this.Field16080.Method7405(new Class44("Background", this, true).Method355("Background")));
        this.Field16083 = this.Method23(this.Field16080.Method7405(new Class44("Background Color", this, "Background", new Class2027(30, 30, 30, 121)).Method313(this.Field16082::Method365)));
        this.Field16084 = this.Method23(this.Field16080.Method7405(new Class44("Hover Color", this, "Hover", new Class2027(255, 255, 255, 60))));
        this.Field16085 = this.Method23(new Class44("Component Height", this, Double.longBitsToDouble((long)741311451 ^ 0x402A00002C2F83DBL), 1.0, Double.longBitsToDouble(4629137466983448576L), true));
        this.Field16086 = this.Method23(new Class44("Header Offset", this, Double.longBitsToDouble((long)1186425670 ^ 0x4014000046B76B46L), 0.0, Double.longBitsToDouble(4626322717216342016L), true));
        this.Field16087 = this.Method23(new Class44("Shadow", this, true));
        this.Field16088 = this.Method23(new Class44("Hide Annotations", this, false));
        this.Field16089 = this.Method24(new Class1996(new Class44("Lines", this)));
        this.Field16090 = this.Method23(this.Field16089.Method7405(new Class44("Horizontal Lines", this, true).Method355("Horizontal")));
        this.Field16091 = this.Method23(this.Field16089.Method7405(new Class44("Vertical Lines", this, true).Method355("Vertical")));
        this.Field16092 = new Class44("Shadow Rects", this, false);
        this.Field16093 = this.Method23(new Class44("Offsets test uwu owo", this, 1.0, 0.0, Double.longBitsToDouble((long)2125868908 ^ 0x401400007EB62F6CL), false));
        this.Field16094 = this.Method23(new Class44("ONG OFFSETS Y??", this, 1.0, 0.0, Double.longBitsToDouble((long)778277050 ^ 0x401400002E6390BAL), false));
        this.Field16095 = this.Method23(new Class44("UwU Locate Mod", this, Class2028.Field17333));
        this.Field16096 = this.Method23(new Class44("Test 2", this, true));
        this.Field16097 = this.Method23(new Class44("Test 2 Color", this, new Class2027(30, 30, 30, 121)));
        this.Field16098 = this.Method23(new Class44("Idk Just Alpha", this, Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4643176031446892544L), true));
        this.Field16099 = this.Method23(new Class44("Text X Offset", this, Double.longBitsToDouble(4617315517961601024L), 0.0, Double.longBitsToDouble((long)56973656 ^ 0x4024000003655958L), true));
        this.Field16100 = this.Method24(new Class1996(new Class44("Outline", this)));
        this.Field16101 = this.Method23(this.Field16100.Method7405(new Class44("Outline Color", this, new Class2027(0, 0, 0, 255)).Method355("Color")));
        this.Field16102 = this.Method23(this.Field16100.Method7405(new Class44("Outline Test", this, true).Method355("Test")));
        this.Field16103 = this.Method23(this.Field16100.Method7405(new Class44("Outline Headers", this, false).Method355("Headers")));
        this.Field16104 = this.Method23(this.Field16100.Method7405(new Class44("Outline Test 2", this, true).Method355("Test 2")));
        this.Field16105 = this.Method23(this.Field16100.Method7405(new Class44("Components Outline", this, false).Method355("Components")));
        this.Field16106 = this.Method23(this.Field16100.Method7405(new Class44("Line Width", this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4611686018427387904L), false)));
        this.Field16107 = this.Method24(new Class1996(new Class44("Color Picker", this)));
        this.Field16108 = this.Method23(this.Field16107.Method7405(new Class44("Color Picker Extra", this, false).Method355("Extra")));
        this.Field16109 = this.Method23(this.Field16107.Method7405(new Class44("Color Picker Clear Color", this, false).Method355("Clear Color")));
        this.Field16110 = this.Method23(this.Field16107.Method7405(new Class44("Color Picker Copy Paste", this, false).Method355("Copy Paste")));
        Class695.Method17(this, 54);
        super.Method55();
    }
    
    @Override
    public void Method38() {
        Class1768.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.displayGuiScreen((GuiScreen)Class1796.Field16241.Field16262.Method1218((GuiScreen)null));
        super.Method21(false);
        if (null.Field11807.Method365()) {
            Class1768.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.entityRenderer.loadShader(new ResourceLocation("shaders/post/blur.json"));
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4AFE ^ 0xC4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
