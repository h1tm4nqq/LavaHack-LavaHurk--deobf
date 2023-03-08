//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.*;

public class Class1075 extends Class42
{
    public static Class1075 Field12739;
    public static int Field12740;
    public static long Field12741;
    public static final int Field12742;
    public static final double Field12743;
    public static HashMap Field12744;
    private final Class1996 Field12745;
    public Class44 Field12746;
    public Class44 Field12747;
    private final Class1996 Field12748;
    public Class44 Field12749;
    public Class44 Field12750;
    public Class44 Field12751;
    private final Class1996 Field12752;
    public Class44 Field12753;
    public Class44 Field12754;
    public Class44 Field12755;
    public Class44 Field12756;
    private final Class1996 Field12757;
    public Class44 Field12758;
    public Class44 Field12759;
    public Class44 Field12760;
    public Class44 Field12761;
    private final Class1996 Field12762;
    private final Class1996 Field12763;
    public Class44 Field12764;
    public Class44 Field12765;
    public Class44 Field12766;
    private final Class1996 Field12767;
    private final Class1996 Field12768;
    public Class44 Field12769;
    public Class44 Field12770;
    private final Class1996 Field12771;
    public Class44 Field12772;
    public Class44 Field12773;
    private final Class1996 Field12774;
    public Class44 Field12775;
    public Class44 Field12776;
    private final Class1996 Field12777;
    public Class44 Field12778;
    public Class44 Field12779;
    private final Class1996 Field12780;
    public Class44 Field12781;
    public Class44 Field12782;
    private final Class1996 Field12783;
    public Class44 Field12784;
    public Class44 Field12785;
    public Class44 Field12786;
    private final Class618 Field12787;
    private final Class618 Field12788;
    private String Field12789 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1075() {
        super("CrystalModifier", "Modify crystal model renderer", Class97.Field8342);
        this.Field12745 = this.Method24(new Class1996(new Class44("Rubiks Crystal", this)));
        this.Field12746 = this.Method23(this.Field12745.Method7405(new Class44("Rubiks Crystal", this, false)));
        this.Field12747 = this.Method23(this.Field12745.Method7405(new Class44("Rubiks Crystal Rotation Direction", this, Class1478.Field14890).Method312(this.Field12746).Method355("Rotation Dir")));
        this.Field12748 = this.Method24(this.Field12745.Method7406(new Class1996(new Class44("Cubes", this))));
        this.Field12749 = this.Method23(this.Field12748.Method7405(new Class44("Rubiks Crystal Inside", this, true).Method355("In")));
        this.Field12750 = this.Method23(this.Field12748.Method7405(new Class44("Rubiks Crystal Outside", this, false).Method355("Out")));
        this.Field12751 = this.Method23(this.Field12748.Method7405(new Class44("Rubiks Crystal Outside 2", this, false).Method355("Out 2")));
        this.Field12752 = this.Method24(new Class1996(new Class44("Scale", this)));
        this.Field12753 = this.Method23(this.Field12752.Method7405(new Class44("Scale", this, false)));
        this.Field12754 = this.Method23(this.Field12752.Method7405(new Class44("Scale X", this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4611686018427387904L), false).Method312(this.Field12753).Method355("X")));
        this.Field12755 = this.Method23(this.Field12752.Method7405(new Class44("Scale Y", this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble((long)1474915204 ^ 0x4000000057E96B84L), false).Method312(this.Field12753).Method355("Y")));
        this.Field12756 = this.Method23(this.Field12752.Method7405(new Class44("Scale Z", this, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble(4611686018427387904L), false).Method312(this.Field12753).Method355("Z")));
        this.Field12757 = this.Method24(new Class1996(new Class44("Translate", this)));
        this.Field12758 = this.Method23(this.Field12757.Method7405(new Class44("Translate", this, false)));
        this.Field12759 = this.Method23(this.Field12757.Method7405(new Class44("Translate X", this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble((long)1141473739 ^ 0x40000000440981CBL), false).Method312(this.Field12758).Method355("X")));
        this.Field12760 = this.Method23(this.Field12757.Method7405(new Class44("Translate Y", this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(4611686018427387904L), false).Method312(this.Field12758).Method355("Y")));
        this.Field12761 = this.Method23(this.Field12757.Method7405(new Class44("Translate Z", this, 0.0, Double.longBitsToDouble(-4611686018427387904L), Double.longBitsToDouble(4611686018427387904L), false).Method312(this.Field12758).Method355("Z")));
        this.Field12762 = this.Method24(new Class1996(new Class44("Elements", this)));
        this.Field12763 = this.Method24(this.Field12762.Method7406(new Class1996(new Class44("Base", this))));
        this.Field12764 = this.Method23(this.Field12763.Method7405(new Class44("Base", this, true)));
        this.Field12765 = this.Method23(this.Field12763.Method7405(new Class44("Base Fade Out Delay", this, 0.0, 0.0, Double.longBitsToDouble(4666723172467343360L), Class467.Field9943).Method355("Fade Out")));
        this.Field12766 = this.Method23(this.Field12763.Method7405(new Class44("Always Base", this, false).Method312(this.Field12764).Method355("Always")));
        this.Field12767 = this.Method24(this.Field12762.Method7406(new Class1996(new Class44("Cubes", this))));
        this.Field12768 = this.Method24(this.Field12767.Method7406(new Class1996(new Class44("Inside", this))));
        this.Field12769 = this.Method23(this.Field12768.Method7405(new Class44("Inside Tex", this, Class2037.Field17365).Method355("Tex")));
        this.Field12770 = this.Method23(this.Field12768.Method7405(new Class44("Inside Model", this, Class645.Field10783).Method355("Model")));
        this.Field12771 = this.Method24(this.Field12768.Method7406(new Class1996(new Class44("Speeds", this))));
        this.Field12772 = this.Method23(this.Field12771.Method7405(new Class44("Inside Spin Speed", this, Double.longBitsToDouble(4613937818241073152L), 0.0, Double.longBitsToDouble(4632233691727265792L), false).Method355("Spin")));
        this.Field12773 = this.Method23(this.Field12768.Method7405(new Class44("Inside Fade Out Delay", this, 0.0, 0.0, Double.longBitsToDouble((long)463887468 ^ 0x40C388001BA65C6CL), Class467.Field9943).Method355("Fade Out")));
        this.Field12774 = this.Method24(this.Field12767.Method7406(new Class1996(new Class44("Outside", this))));
        this.Field12775 = this.Method23(this.Field12774.Method7405(new Class44("Outside Tex", this, Class2037.Field17366).Method355("Tex")));
        this.Field12776 = this.Method23(this.Field12774.Method7405(new Class44("Outside Model", this, Class645.Field10784).Method355("Model")));
        this.Field12777 = this.Method24(this.Field12774.Method7406(new Class1996(new Class44("Speeds", this))));
        this.Field12778 = this.Method23(this.Field12777.Method7405(new Class44("Outside Spin Speed", this, Double.longBitsToDouble((long)190449492 ^ 0x400800000B5A0754L), 0.0, Double.longBitsToDouble(4632233691727265792L), false).Method355("Spin")));
        this.Field12779 = this.Method23(this.Field12774.Method7405(new Class44("Outside Fade Out Delay", this, 0.0, 0.0, Double.longBitsToDouble((long)106514264 ^ 0x40C3880006594758L), Class467.Field9943).Method355("Fade Out")));
        this.Field12780 = this.Method24(this.Field12767.Method7406(new Class1996(new Class44("Outside 2", this))));
        this.Field12781 = this.Method23(this.Field12780.Method7405(new Class44("Outside 2 Tex", this, Class2037.Field17366).Method355("Tex")));
        this.Field12782 = this.Method23(this.Field12780.Method7405(new Class44("Outside 2 Model", this, Class645.Field10784).Method355("Model")));
        this.Field12783 = this.Method24(this.Field12780.Method7406(new Class1996(new Class44("Speeds", this))));
        this.Field12784 = this.Method23(this.Field12783.Method7405(new Class44("Outside 2 Spin Speed", this, Double.longBitsToDouble(4613937818241073152L), 0.0, Double.longBitsToDouble((long)353470735 ^ 0x404900001511890FL), false).Method355("Spin")));
        this.Field12785 = this.Method23(this.Field12780.Method7405(new Class44("Outside 2 Fade Out Delay", this, 0.0, 0.0, Double.longBitsToDouble((long)600762923 ^ 0x40C3880023CEEA2BL), Class467.Field9943).Method355("Fade Out")));
        this.Field12786 = this.Method23(new Class44("Bounce Speed", this, Double.longBitsToDouble((long)1826031727 ^ 0x3FC99999CCD7086FL), 0.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field12787 = new Class618(this::Method4350, new Predicate[0]);
        this.Field12788 = new Class618(Class1075::Method4349, new Predicate[0]);
        Class1075.Field12739 = this;
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
    
    private static void Method4349(final Class120 class120) {
        if (Class1075.Field12744.containsKey(class120.Method851())) {
            Class1075.Field12744.get(class120.Method851());
        }
    }
    
    private void Method4350(final Class125 class125) {
        Class1075.Field12744.put(class125.Method855().entityId, Arrays.asList(new Class357(this.Field12765.Method369(), Double.longBitsToDouble(4591870180066957722L), 1.0), new Class357(this.Field12773.Method369(), Double.longBitsToDouble((long)1548270015 ^ 0x3FB99999C5D12025L), 1.0), new Class357(this.Field12779.Method369(), Double.longBitsToDouble((long)877832606 ^ 0x3FB99999ADCB3004L), 1.0), new Class357(this.Field12785.Method369(), Double.longBitsToDouble(4591870180066957722L), 1.0)));
    }
    
    static {
        Field12743 = 0.0;
        Field12742 = 400;
        Class1075.Field12740 = 0;
        Class1075.Field12741 = 0L;
        Class1075.Field12744 = new HashMap();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xC3C ^ 0xA1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
