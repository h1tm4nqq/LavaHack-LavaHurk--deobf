//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import com.kisman.cc.util.*;

public class Class903 extends Class42
{
    @Class873
    public static Class903 Field11772;
    private final Class1996 Field11773;
    private final Class1996 Field11774;
    private final Class1996 Field11775;
    private final Class1996 Field11776;
    private final Class1996 Field11777;
    public Class44 Field11778;
    public Class44 Field11779;
    public Class44 Field11780;
    public Class44 Field11781;
    public Class44 Field11782;
    public Class44 Field11783;
    public Class44 Field11784;
    public Class44 Field11785;
    public Class44 Field11786;
    public Class44 Field11787;
    public Class44 Field11788;
    public Class44 Field11789;
    public Class44 Field11790;
    private final Class1996 Field11791;
    private final Class1996 Field11792;
    public Class44 Field11793;
    public Class44 Field11794;
    private final Class1996 Field11795;
    public Class44 Field11796;
    private final Class1996 Field11797;
    private final Class1996 Field11798;
    public Class44 Field11799;
    public Class44 Field11800;
    public Class44 Field11801;
    public Class44 Field11802;
    public Class44 Field11803;
    public Class44 Field11804;
    public Class44 Field11805;
    public Class44 Field11806;
    public Class44 Field11807;
    public Class44 Field11808;
    public Class44 Field11809;
    public Class44 Field11810;
    public Class44 Field11811;
    public Class44 Field11812;
    public Class44 Field11813;
    public Class44 Field11814;
    private final Class1996 Field11815;
    public Class44 Field11816;
    public Class44 Field11817;
    public Class44 Field11818;
    public Class44 Field11819;
    public Class44 Field11820;
    private final Class1996 Field11821;
    public Class44 Field11822;
    public Class44 Field11823;
    public Class44 Field11824;
    public Class44 Field11825;
    private int Field11826;
    
    public Class903() {
        super("Config", Class97.Field8339);
        this.Field11773 = this.Method24(new Class1996(new Class44("Main", (Class42)this)));
        this.Field11774 = this.Method24(new Class1996(new Class44("Gui", (Class42)this)));
        this.Field11775 = this.Method24(new Class1996(new Class44("Glow", (Class42)this)));
        this.Field11776 = this.Method24(new Class1996(new Class44("Particles", (Class42)this)));
        this.Field11777 = this.Method24(new Class1996(new Class44("Other", (Class42)this)));
        this.Field11778 = new Class44("Astolfo Color Mode", (Class42)this, (Enum)Class163.Field8676);
        this.Field11779 = this.Method23(this.Field11773.Method7405(new Class44("Friends", (Class42)this, true)));
        this.Field11780 = this.Method23(this.Field11773.Method7405(new Class44("Name Mode", (Class42)this, (Enum)Class154.Field8596)));
        this.Field11781 = this.Method23(this.Field11773.Method7405(new Class44("Custom Name", (Class42)this, "kisman.cc", "kisman.cc", true).Method313((Supplier)this::Method3749)));
        this.Field11782 = this.Method23(this.Field11773.Method7405(new Class44("Scroll Speed", (Class42)this, Double.longBitsToDouble(4624633867356078080L), 0.0, Double.longBitsToDouble((long)1858289100 ^ 0x405900006EC33DCCL), Class467.Field9942)));
        this.Field11783 = this.Method23(this.Field11773.Method7405(new Class44("Horizontal Scroll", (Class42)this, true)));
        this.Field11784 = this.Method23(this.Field11773.Method7405(new Class44("Key for Horizontal Scroll", (Class42)this, 42).Method313((Supplier)this::Method3748)));
        this.Field11785 = this.Method23(this.Field11773.Method7405(new Class44("Notification", (Class42)this, true)));
        this.Field11786 = this.Method23(this.Field11774.Method7405(new Class44("Gui Glow", (Class42)this, false).Method355("Glow")));
        this.Field11787 = this.Method23(this.Field11775.Method7405(new Class44("Glow Radius", (Class42)this, Double.longBitsToDouble(4624633867356078080L), 0.0, Double.longBitsToDouble((long)1124087125 ^ 0x4034000043003555L), true).Method355("Radius")));
        this.Field11788 = this.Method23(this.Field11775.Method7405(new Class44("Glow Box Size", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4626322717216342016L), true).Method355("Size")));
        this.Field11789 = this.Method23(this.Field11774.Method7405(new Class44("Gui Desc", (Class42)this, true)));
        this.Field11790 = this.Method23(this.Field11774.Method7405(new Class44("Gui Particles", (Class42)this, false)));
        this.Field11791 = this.Method24(this.Field11774.Method7406(new Class1996(new Class44("Gradient", (Class42)this))));
        this.Field11792 = this.Method24(this.Field11791.Method7406(new Class1996(new Class44("Color", (Class42)this))));
        this.Field11793 = this.Method23(this.Field11792.Method7405(new Class44("Gui Gradient", (Class42)this, (Enum)Class2075.Field17489).Method355("Mode")));
        this.Field11794 = this.Method23(this.Field11792.Method7405(new Class44("Gui Gradient Diff", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)568425242 ^ 0x408F400021E17B1AL), Class467.Field9943).Method355("Diff").Method313((Supplier)this::Method3747)));
        this.Field11795 = this.Method24(this.Field11791.Method7406(new Class1996(new Class44("Background", (Class42)this))));
        this.Field11796 = this.Method23(this.Field11795.Method7405(new Class44("Gui Gradient Background", (Class42)this, false).Method355("State")));
        this.Field11797 = this.Method24(this.Field11795.Method7406(new Class1996(new Class44("Start", (Class42)this))));
        this.Field11798 = this.Method24(this.Field11795.Method7406(new Class1996(new Class44("End", (Class42)this))));
        this.Field11799 = this.Method23(this.Field11797.Method7405(new Class44("GGB Start Color Mode", (Class42)this, (Enum)Class1512.Field15076).Method355("Mode").Method313((Supplier)this.Field11796::Method365)));
        this.Field11800 = this.Method23(this.Field11797.Method7405(new Class44("GGB Start Color", (Class42)this, new Class2027(0, 0, 0, 30)).Method355("Color").Method313((Supplier)this::Method3746)));
        this.Field11801 = this.Method23(this.Field11798.Method7405(new Class44("GGB End Color Mode", (Class42)this, (Enum)Class1512.Field15076).Method355("Mode").Method313((Supplier)this.Field11796::Method365)));
        this.Field11802 = this.Method23(this.Field11798.Method7405(new Class44("GGB End Color", (Class42)this, new Class2027(0, 0, 0, 30)).Method355("Color").Method313((Supplier)this::Method3745)));
        this.Field11803 = this.Method23(this.Field11774.Method7405(new Class44("Gui Outline", (Class42)this, true).Method355("Outline")));
        this.Field11804 = this.Method23(this.Field11774.Method7405(new Class44("Gui Astolfo", (Class42)this, false).Method355("Astolfo")));
        this.Field11805 = this.Method23(this.Field11774.Method7405(new Class44("Gui Render Size", (Class42)this, false).Method355("Render Size")));
        this.Field11806 = this.Method23(this.Field11774.Method7405(new Class44("Gui Better CheckBox", (Class42)this, false).Method355("Better CheckBox")));
        this.Field11807 = this.Method23(this.Field11774.Method7405(new Class44("Gui Blur", (Class42)this, true).Method355("Blur")));
        this.Field11808 = this.Method23(this.Field11774.Method7405(new Class44("Gui Visual Preview", (Class42)this, false).Method355("Visual Preview")));
        this.Field11809 = this.Method23(this.Field11774.Method7405(new Class44("Gui Show Binds", (Class42)this, false).Method355("Show Binds")));
        this.Field11810 = this.Method23(this.Field11777.Method7405(new Class44("Configurate", (Class42)this, true)));
        this.Field11811 = this.Method23(this.Field11776.Method7405(new Class44("Particles Render Points", (Class42)this, true).Method355("Render Points")));
        this.Field11812 = this.Method23(this.Field11776.Method7405(new Class44("Particles Color", (Class42)this, "Dots Color", new Class2027(0, 0, 255)).Method313((Supplier)this.Field11811::Method365)));
        this.Field11813 = this.Method23(this.Field11776.Method7405(new Class44("Particles Render Lines", (Class42)this, true)));
        this.Field11814 = this.Method23(this.Field11776.Method7405(new Class44("Particles Gradient Mode", (Class42)this, (Enum)Class1527.Field15137).Method313((Supplier)this::Method3744)));
        this.Field11815 = this.Method24(this.Field11776.Method7406(new Class1996(new Class44("Colors", (Class42)this))));
        this.Field11816 = this.Method23(this.Field11815.Method7405(new Class44("Particles Gradient StartColor", (Class42)this, "Start", new Class2027(0, 0, 255)).Method313((Supplier)this::Method3743)));
        this.Field11817 = this.Method23(this.Field11815.Method7405(new Class44("Particles Gradient MiddleColor", (Class42)this, "Middle", new Class2027(255, 0, 0, 200)).Method313((Supplier)this::Method3742)));
        this.Field11818 = this.Method23(this.Field11815.Method7405(new Class44("Particles Gradient EndColor", (Class42)this, "End", new Class2027(0, 0, 255)).Method313((Supplier)this::Method3741)));
        this.Field11819 = this.Method23(this.Field11776.Method7405(new Class44("Particles Width", (Class42)this, Double.longBitsToDouble((long)1426151848 ^ 0x3FE00000550159A8L), 0.0, Double.longBitsToDouble(4617315517961601024L), false).Method355("Width").Method313((Supplier)this::Method3740)));
        this.Field11820 = this.Method23(this.Field11776.Method7405(new Class44("Particle Test", (Class42)this, true).Method355("Test").Method313((Supplier)this::Method3739)));
        this.Field11821 = this.Method24(this.Field11776.Method7406(new Class1996(new Class44("Points", (Class42)this))));
        this.Field11822 = this.Method23(this.Field11821.Method7405(new Class44("Particle Points Random Alpha", (Class42)this, false).Method355("Alpha").Method313((Supplier)this.Field11811::Method365)));
        this.Field11823 = this.Method23(this.Field11821.Method7405(new Class44("Particle Point Size Modifier", (Class42)this, 1.0, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)720008333 ^ 0x400800002AEA748DL), false).Method355("Size Mod").Method313((Supplier)this.Field11811::Method365)));
        this.Field11824 = this.Method23(this.Field11821.Method7405(new Class44("Particles Start Points Count", (Class42)this, Double.longBitsToDouble(4643985272004935680L), Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble((long)560631644 ^ 0x407F4000216A8F5CL), true).Method355("Start Count")));
        this.Field11825 = this.Method23(this.Field11777.Method7405(new Class44("Anti OpenGL Crash", (Class42)this, false)));
    }
    
    private Boolean Method3739() {
        return this.Field11790.Method365() && this.Field11813.Method365();
    }
    
    private Boolean Method3740() {
        return this.Field11790.Method365() && this.Field11813.Method365();
    }
    
    private Boolean Method3741() {
        return this.Field11790.Method365() && !this.Field11814.Method359().equalsIgnoreCase(Class1527.Field15137.name()) && this.Field11813.Method365();
    }
    
    private Boolean Method3742() {
        return this.Field11790.Method365() && this.Field11814.Method359().equalsIgnoreCase(Class1527.Field15139.name()) && this.Field11813.Method365();
    }
    
    private Boolean Method3743() {
        return this.Field11790.Method365() && !this.Field11814.Method359().equalsIgnoreCase(Class1527.Field15137.name()) && this.Field11813.Method365();
    }
    
    private Boolean Method3744() {
        return this.Field11790.Method365() && this.Field11813.Method365();
    }
    
    private Boolean Method3745() {
        return this.Field11796.Method365() && this.Field11801.Method341() == Class1512.Field15076;
    }
    
    private Boolean Method3746() {
        return this.Field11796.Method365() && this.Field11799.Method341() == Class1512.Field15076;
    }
    
    private Boolean Method3747() {
        return this.Field11793.Method341() != Class2075.Field17489;
    }
    
    private Boolean Method3748() {
        return this.Field11783.Method365();
    }
    
    private Boolean Method3749() {
        return this.Field11780.Method365();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2BD7 ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
