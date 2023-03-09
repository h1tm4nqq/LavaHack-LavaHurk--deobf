//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Predicate;
import lavahack.client.Class120;
import lavahack.client.Class125;
import lavahack.client.Class1478;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class2037;
import lavahack.client.Class357;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class618;
import lavahack.client.Class645;
import lavahack.client.Class97;

public class Class1075
extends Class42 {
    public static Class1075 Field12739;
    public static int Field12740;
    public static long Field12741;
    public static final int Field12742;
    public static final double Field12743;
    public static HashMap Field12744;
    private final Class1996 Field12745 = this.Method24(new Class1996(new Class44("Rubiks Crystal", this)));
    public Class44 Field12746 = this.Method23(this.Field12745.Method7405(new Class44("Rubiks Crystal", (Class42)this, false)));
    public Class44 Field12747 = this.Method23(this.Field12745.Method7405(new Class44("Rubiks Crystal Rotation Direction", (Class42)this, Class1478.Field14890).Method312(this.Field12746).Method355("Rotation Dir")));
    private final Class1996 Field12748 = this.Method24(this.Field12745.Method7406(new Class1996(new Class44("Cubes", this))));
    public Class44 Field12749 = this.Method23(this.Field12748.Method7405(new Class44("Rubiks Crystal Inside", (Class42)this, true).Method355("In")));
    public Class44 Field12750 = this.Method23(this.Field12748.Method7405(new Class44("Rubiks Crystal Outside", (Class42)this, false).Method355("Out")));
    public Class44 Field12751 = this.Method23(this.Field12748.Method7405(new Class44("Rubiks Crystal Outside 2", (Class42)this, false).Method355("Out 2")));
    private final Class1996 Field12752 = this.Method24(new Class1996(new Class44("Scale", this)));
    public Class44 Field12753 = this.Method23(this.Field12752.Method7405(new Class44("Scale", (Class42)this, false)));
    public Class44 Field12754 = this.Method23(this.Field12752.Method7405(new Class44("Scale X", (Class42)this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(0x4000000000000000L), false).Method312(this.Field12753).Method355("X")));
    public Class44 Field12755 = this.Method23(this.Field12752.Method7405(new Class44("Scale Y", (Class42)this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble((long)1474915204 ^ 0x4000000057E96B84L), false).Method312(this.Field12753).Method355("Y")));
    public Class44 Field12756 = this.Method23(this.Field12752.Method7405(new Class44("Scale Z", (Class42)this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(0x4000000000000000L), false).Method312(this.Field12753).Method355("Z")));
    private final Class1996 Field12757 = this.Method24(new Class1996(new Class44("Translate", this)));
    public Class44 Field12758 = this.Method23(this.Field12757.Method7405(new Class44("Translate", (Class42)this, false)));
    public Class44 Field12759 = this.Method23(this.Field12757.Method7405(new Class44("Translate X", (Class42)this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble((long)1141473739 ^ 0x40000000440981CBL), false).Method312(this.Field12758).Method355("X")));
    public Class44 Field12760 = this.Method23(this.Field12757.Method7405(new Class44("Translate Y", (Class42)this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(0x4000000000000000L), false).Method312(this.Field12758).Method355("Y")));
    public Class44 Field12761 = this.Method23(this.Field12757.Method7405(new Class44("Translate Z", (Class42)this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(0x4000000000000000L), false).Method312(this.Field12758).Method355("Z")));
    private final Class1996 Field12762 = this.Method24(new Class1996(new Class44("Elements", this)));
    private final Class1996 Field12763 = this.Method24(this.Field12762.Method7406(new Class1996(new Class44("Base", this))));
    public Class44 Field12764 = this.Method23(this.Field12763.Method7405(new Class44("Base", (Class42)this, true)));
    public Class44 Field12765 = this.Method23(this.Field12763.Method7405(new Class44("Base Fade Out Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4666723172467343360L), Class467.Field9943).Method355("Fade Out")));
    public Class44 Field12766 = this.Method23(this.Field12763.Method7405(new Class44("Always Base", (Class42)this, false).Method312(this.Field12764).Method355("Always")));
    private final Class1996 Field12767 = this.Method24(this.Field12762.Method7406(new Class1996(new Class44("Cubes", this))));
    private final Class1996 Field12768 = this.Method24(this.Field12767.Method7406(new Class1996(new Class44("Inside", this))));
    public Class44 Field12769 = this.Method23(this.Field12768.Method7405(new Class44("Inside Tex", (Class42)this, Class2037.Field17365).Method355("Tex")));
    public Class44 Field12770 = this.Method23(this.Field12768.Method7405(new Class44("Inside Model", (Class42)this, Class645.Field10783).Method355("Model")));
    private final Class1996 Field12771 = this.Method24(this.Field12768.Method7406(new Class1996(new Class44("Speeds", this))));
    public Class44 Field12772 = this.Method23(this.Field12771.Method7405(new Class44("Inside Spin Speed", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), 0.0, Double.longBitsToDouble(0x4049000000000000L), false).Method355("Spin")));
    public Class44 Field12773 = this.Method23(this.Field12768.Method7405(new Class44("Inside Fade Out Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)463887468 ^ 0x40C388001BA65C6CL), Class467.Field9943).Method355("Fade Out")));
    private final Class1996 Field12774 = this.Method24(this.Field12767.Method7406(new Class1996(new Class44("Outside", this))));
    public Class44 Field12775 = this.Method23(this.Field12774.Method7405(new Class44("Outside Tex", (Class42)this, Class2037.Field17366).Method355("Tex")));
    public Class44 Field12776 = this.Method23(this.Field12774.Method7405(new Class44("Outside Model", (Class42)this, Class645.Field10784).Method355("Model")));
    private final Class1996 Field12777 = this.Method24(this.Field12774.Method7406(new Class1996(new Class44("Speeds", this))));
    public Class44 Field12778 = this.Method23(this.Field12777.Method7405(new Class44("Outside Spin Speed", (Class42)this, Double.longBitsToDouble((long)190449492 ^ 0x400800000B5A0754L), 0.0, Double.longBitsToDouble(0x4049000000000000L), false).Method355("Spin")));
    public Class44 Field12779 = this.Method23(this.Field12774.Method7405(new Class44("Outside Fade Out Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)106514264 ^ 0x40C3880006594758L), Class467.Field9943).Method355("Fade Out")));
    private final Class1996 Field12780 = this.Method24(this.Field12767.Method7406(new Class1996(new Class44("Outside 2", this))));
    public Class44 Field12781 = this.Method23(this.Field12780.Method7405(new Class44("Outside 2 Tex", (Class42)this, Class2037.Field17366).Method355("Tex")));
    public Class44 Field12782 = this.Method23(this.Field12780.Method7405(new Class44("Outside 2 Model", (Class42)this, Class645.Field10784).Method355("Model")));
    private final Class1996 Field12783 = this.Method24(this.Field12780.Method7406(new Class1996(new Class44("Speeds", this))));
    public Class44 Field12784 = this.Method23(this.Field12783.Method7405(new Class44("Outside 2 Spin Speed", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), 0.0, Double.longBitsToDouble((long)353470735 ^ 0x404900001511890FL), false).Method355("Spin")));
    public Class44 Field12785 = this.Method23(this.Field12780.Method7405(new Class44("Outside 2 Fade Out Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)600762923 ^ 0x40C3880023CEEA2BL), Class467.Field9943).Method355("Fade Out")));
    public Class44 Field12786 = this.Method23(new Class44("Bounce Speed", (Class42)this, Double.longBitsToDouble((long)1826031727 ^ 0x3FC99999CCD7086FL), 0.0, Double.longBitsToDouble(0x4024000000000000L), false));
    private final Class618 Field12787 = new Class618(this::Method4350, new Predicate[0]);
    private final Class618 Field12788 = new Class618(Class1075::Method4349, new Predicate[0]);
    private String Field12789 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1075() {
        super("CrystalModifier", "Modify crystal model renderer", Class97.Field8342);
        Field12739 = this;
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field12787);
        Class1796.Field16242.Method706(this.Field12788);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field12787);
        Class1796.Field16242.Method711(this.Field12788);
    }

    private static void Method4349(Class120 class120) {
        if (!Field12744.containsKey(class120.Method851())) return;
        Field12744.get(class120.Method851());
    }

    private void Method4350(Class125 class125) {
        Field12744.put(class125.Method855().entityId, Arrays.asList(new Class357(this.Field12765.Method369(), Double.longBitsToDouble(4591870180066957722L), 1.0), new Class357(this.Field12773.Method369(), Double.longBitsToDouble((long)1548270015 ^ 0x3FB99999C5D12025L), 1.0), new Class357(this.Field12779.Method369(), Double.longBitsToDouble((long)877832606 ^ 0x3FB99999ADCB3004L), 1.0), new Class357(this.Field12785.Method369(), Double.longBitsToDouble(4591870180066957722L), 1.0)));
    }

    static {
        Field12743 = 0.0;
        Field12742 = 400;
        Field12740 = 0;
        Field12741 = 0L;
        Field12744 = new HashMap();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 161;
            cArray2[n] = (char)(cArray[n] ^ (0xC3C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

