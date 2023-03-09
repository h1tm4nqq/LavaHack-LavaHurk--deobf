/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import lavahack.client.Class1512;
import lavahack.client.Class1527;
import lavahack.client.Class154;
import lavahack.client.Class163;
import lavahack.client.Class1996;
import lavahack.client.Class2075;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class873;
import lavahack.client.Class97;

public class Class903
extends Class42 {
    @Class873
    public static Class903 Field11772;
    private final Class1996 Field11773 = this.Method24(new Class1996(new Class44("Main", this)));
    private final Class1996 Field11774 = this.Method24(new Class1996(new Class44("Gui", this)));
    private final Class1996 Field11775 = this.Method24(new Class1996(new Class44("Glow", this)));
    private final Class1996 Field11776 = this.Method24(new Class1996(new Class44("Particles", this)));
    private final Class1996 Field11777 = this.Method24(new Class1996(new Class44("Other", this)));
    public Class44 Field11778 = new Class44("Astolfo Color Mode", (Class42)this, Class163.Field8676);
    public Class44 Field11779 = this.Method23(this.Field11773.Method7405(new Class44("Friends", (Class42)this, true)));
    public Class44 Field11780 = this.Method23(this.Field11773.Method7405(new Class44("Name Mode", (Class42)this, Class154.Field8596)));
    public Class44 Field11781 = this.Method23(this.Field11773.Method7405(new Class44("Custom Name", this, "kisman.cc", "kisman.cc", true).Method313(this::Method3749)));
    public Class44 Field11782 = this.Method23(this.Field11773.Method7405(new Class44("Scroll Speed", (Class42)this, Double.longBitsToDouble(4624633867356078080L), 0.0, Double.longBitsToDouble((long)1858289100 ^ 0x405900006EC33DCCL), Class467.Field9942)));
    public Class44 Field11783 = this.Method23(this.Field11773.Method7405(new Class44("Horizontal Scroll", (Class42)this, true)));
    public Class44 Field11784 = this.Method23(this.Field11773.Method7405(new Class44("Key for Horizontal Scroll", (Class42)this, 42).Method313(this::Method3748)));
    public Class44 Field11785 = this.Method23(this.Field11773.Method7405(new Class44("Notification", (Class42)this, true)));
    public Class44 Field11786 = this.Method23(this.Field11774.Method7405(new Class44("Gui Glow", (Class42)this, false).Method355("Glow")));
    public Class44 Field11787 = this.Method23(this.Field11775.Method7405(new Class44("Glow Radius", (Class42)this, Double.longBitsToDouble(4624633867356078080L), 0.0, Double.longBitsToDouble((long)1124087125 ^ 0x4034000043003555L), true).Method355("Radius")));
    public Class44 Field11788 = this.Method23(this.Field11775.Method7405(new Class44("Glow Box Size", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4034000000000000L), true).Method355("Size")));
    public Class44 Field11789 = this.Method23(this.Field11774.Method7405(new Class44("Gui Desc", (Class42)this, true)));
    public Class44 Field11790 = this.Method23(this.Field11774.Method7405(new Class44("Gui Particles", (Class42)this, false)));
    private final Class1996 Field11791 = this.Method24(this.Field11774.Method7406(new Class1996(new Class44("Gradient", this))));
    private final Class1996 Field11792 = this.Method24(this.Field11791.Method7406(new Class1996(new Class44("Color", this))));
    public Class44 Field11793 = this.Method23(this.Field11792.Method7405(new Class44("Gui Gradient", (Class42)this, Class2075.Field17489).Method355("Mode")));
    public Class44 Field11794 = this.Method23(this.Field11792.Method7405(new Class44("Gui Gradient Diff", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)568425242 ^ 0x408F400021E17B1AL), Class467.Field9943).Method355("Diff").Method313(this::Method3747)));
    private final Class1996 Field11795 = this.Method24(this.Field11791.Method7406(new Class1996(new Class44("Background", this))));
    public Class44 Field11796 = this.Method23(this.Field11795.Method7405(new Class44("Gui Gradient Background", (Class42)this, false).Method355("State")));
    private final Class1996 Field11797 = this.Method24(this.Field11795.Method7406(new Class1996(new Class44("Start", this))));
    private final Class1996 Field11798 = this.Method24(this.Field11795.Method7406(new Class1996(new Class44("End", this))));
    public Class44 Field11799 = this.Method23(this.Field11797.Method7405(new Class44("GGB Start Color Mode", (Class42)this, Class1512.Field15076).Method355("Mode").Method313(this.Field11796::Method365)));
    public Class44 Field11800 = this.Method23(this.Field11797.Method7405(new Class44("GGB Start Color", (Class42)this, new Class2027(0, 0, 0, 30)).Method355("Color").Method313(this::Method3746)));
    public Class44 Field11801 = this.Method23(this.Field11798.Method7405(new Class44("GGB End Color Mode", (Class42)this, Class1512.Field15076).Method355("Mode").Method313(this.Field11796::Method365)));
    public Class44 Field11802 = this.Method23(this.Field11798.Method7405(new Class44("GGB End Color", (Class42)this, new Class2027(0, 0, 0, 30)).Method355("Color").Method313(this::Method3745)));
    public Class44 Field11803 = this.Method23(this.Field11774.Method7405(new Class44("Gui Outline", (Class42)this, true).Method355("Outline")));
    public Class44 Field11804 = this.Method23(this.Field11774.Method7405(new Class44("Gui Astolfo", (Class42)this, false).Method355("Astolfo")));
    public Class44 Field11805 = this.Method23(this.Field11774.Method7405(new Class44("Gui Render Size", (Class42)this, false).Method355("Render Size")));
    public Class44 Field11806 = this.Method23(this.Field11774.Method7405(new Class44("Gui Better CheckBox", (Class42)this, false).Method355("Better CheckBox")));
    public Class44 Field11807 = this.Method23(this.Field11774.Method7405(new Class44("Gui Blur", (Class42)this, true).Method355("Blur")));
    public Class44 Field11808 = this.Method23(this.Field11774.Method7405(new Class44("Gui Visual Preview", (Class42)this, false).Method355("Visual Preview")));
    public Class44 Field11809 = this.Method23(this.Field11774.Method7405(new Class44("Gui Show Binds", (Class42)this, false).Method355("Show Binds")));
    public Class44 Field11810 = this.Method23(this.Field11777.Method7405(new Class44("Configurate", (Class42)this, true)));
    public Class44 Field11811 = this.Method23(this.Field11776.Method7405(new Class44("Particles Render Points", (Class42)this, true).Method355("Render Points")));
    public Class44 Field11812 = this.Method23(this.Field11776.Method7405(new Class44("Particles Color", (Class42)this, "Dots Color", new Class2027(0, 0, 255)).Method313(this.Field11811::Method365)));
    public Class44 Field11813 = this.Method23(this.Field11776.Method7405(new Class44("Particles Render Lines", (Class42)this, true)));
    public Class44 Field11814 = this.Method23(this.Field11776.Method7405(new Class44("Particles Gradient Mode", (Class42)this, Class1527.Field15137).Method313(this::Method3744)));
    private final Class1996 Field11815 = this.Method24(this.Field11776.Method7406(new Class1996(new Class44("Colors", this))));
    public Class44 Field11816 = this.Method23(this.Field11815.Method7405(new Class44("Particles Gradient StartColor", (Class42)this, "Start", new Class2027(0, 0, 255)).Method313(this::Method3743)));
    public Class44 Field11817 = this.Method23(this.Field11815.Method7405(new Class44("Particles Gradient MiddleColor", (Class42)this, "Middle", new Class2027(255, 0, 0, 200)).Method313(this::Method3742)));
    public Class44 Field11818 = this.Method23(this.Field11815.Method7405(new Class44("Particles Gradient EndColor", (Class42)this, "End", new Class2027(0, 0, 255)).Method313(this::Method3741)));
    public Class44 Field11819 = this.Method23(this.Field11776.Method7405(new Class44("Particles Width", (Class42)this, Double.longBitsToDouble((long)1426151848 ^ 0x3FE00000550159A8L), 0.0, Double.longBitsToDouble(0x4014000000000000L), false).Method355("Width").Method313(this::Method3740)));
    public Class44 Field11820 = this.Method23(this.Field11776.Method7405(new Class44("Particle Test", (Class42)this, true).Method355("Test").Method313(this::Method3739)));
    private final Class1996 Field11821 = this.Method24(this.Field11776.Method7406(new Class1996(new Class44("Points", this))));
    public Class44 Field11822 = this.Method23(this.Field11821.Method7405(new Class44("Particle Points Random Alpha", (Class42)this, false).Method355("Alpha").Method313(this.Field11811::Method365)));
    public Class44 Field11823 = this.Method23(this.Field11821.Method7405(new Class44("Particle Point Size Modifier", (Class42)this, 1.0, Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)720008333 ^ 0x400800002AEA748DL), false).Method355("Size Mod").Method313(this.Field11811::Method365)));
    public Class44 Field11824 = this.Method23(this.Field11821.Method7405(new Class44("Particles Start Points Count", (Class42)this, Double.longBitsToDouble(4643985272004935680L), Double.longBitsToDouble(4636737291354636288L), Double.longBitsToDouble((long)560631644 ^ 0x407F4000216A8F5CL), true).Method355("Start Count")));
    public Class44 Field11825 = this.Method23(this.Field11777.Method7405(new Class44("Anti OpenGL Crash", (Class42)this, false)));
    private int Field11826;

    public Class903() {
        super("Config", Class97.Field8339);
    }

    private Boolean Method3739() {
        boolean bl;
        if (this.Field11790.Method365() && this.Field11813.Method365()) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3740() {
        boolean bl;
        if (this.Field11790.Method365() && this.Field11813.Method365()) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3741() {
        boolean bl;
        if (this.Field11790.Method365() && !this.Field11814.Method359().equalsIgnoreCase(Class1527.Field15137.name()) && this.Field11813.Method365()) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3742() {
        boolean bl;
        if (this.Field11790.Method365() && this.Field11814.Method359().equalsIgnoreCase(Class1527.Field15139.name()) && this.Field11813.Method365()) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3743() {
        boolean bl;
        if (this.Field11790.Method365() && !this.Field11814.Method359().equalsIgnoreCase(Class1527.Field15137.name()) && this.Field11813.Method365()) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3744() {
        boolean bl;
        if (this.Field11790.Method365() && this.Field11813.Method365()) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3745() {
        boolean bl;
        if (this.Field11796.Method365() && this.Field11801.Method341() == Class1512.Field15076) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3746() {
        boolean bl;
        if (this.Field11796.Method365() && this.Field11799.Method341() == Class1512.Field15076) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3747() {
        boolean bl;
        if (this.Field11793.Method341() != Class2075.Field17489) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private Boolean Method3748() {
        return this.Field11783.Method365();
    }

    private Boolean Method3749() {
        return this.Field11780.Method365();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 72;
            cArray2[n] = (char)(cArray[n] ^ (0x2BD7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

