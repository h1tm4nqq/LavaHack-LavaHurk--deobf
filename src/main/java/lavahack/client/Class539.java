/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class2075;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class676;
import lavahack.client.Class695;
import lavahack.client.Class698;
import lavahack.client.Class753;
import lavahack.client.Class83;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class539
extends Class1249 {
    public static Class539 Field10276 = new Class539();
    private final Class1996 Field10277 = this.Method24(new Class1996(new Class44("Types", this)));
    private final Class44 Field10278 = this.Method23(this.Field10277.Method7405(new Class44("Modules", (Class42)this, true)));
    private final Class44 Field10279 = this.Method23(this.Field10277.Method7405(new Class44("Hud Modules", (Class42)this, false)));
    private final Class44 Field10280 = this.Method23(this.Field10277.Method7405(new Class44("Check Boxes", (Class42)this, false)));
    private final Class44 Field10281 = this.Method23(new Class44("Show Display Info", (Class42)this, true));
    private final Class44 Field10282 = this.Method23(new Class44("Y Coord", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), 0.0, Double.longBitsToDouble((long)1682700765 ^ 0x407F4000644BF9DDL), true));
    private final Class44 Field10283 = this.Method23(new Class44("Orientation", (Class42)this, Class676.Field10873));
    private final Class44 Field10284 = this.Method23(new Class44("Offsets", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 0.0, Double.longBitsToDouble((long)1386539363 ^ 0x4024000052A4E963L), true));
    private final Class44 Field10285 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field10286 = this.Method23(new Class44("Color", (Class42)this, "Color", new Class2027(-1)));
    private final Class44 Field10287 = this.Method23(new Class44("Gradient", (Class42)this, Class2075.Field17489));
    private final Class44 Field10288 = this.Method23(new Class44("Gradient Diff", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
    private final Class44 Field10289 = this.Method23(new Class44("Background", (Class42)this, true));
    private final Class44 Field10290 = this.Method23(new Class44("Background Alpha", (Class42)this, Double.longBitsToDouble((long)1339258121 ^ 0x406FE0004FD37509L), 0.0, Double.longBitsToDouble((long)5049015 ^ 0x406FE000004D0AB7L), true));
    private final Class1996 Field10291 = this.Method24(new Class1996(new Class44("Glow", this)));
    private final Class44 Field10292 = this.Method23(this.Field10291.Method7405(new Class44("Glow", (Class42)this, false)));
    private final Class44 Field10293 = this.Method23(new Class44("Glow Alpha", (Class42)this, Double.longBitsToDouble(4643176031446892544L), 0.0, Double.longBitsToDouble((long)2072091064 ^ 0x406FE0007B8199B8L), true));
    private final Class44 Field10294 = this.Method23(this.Field10291.Method7405(new Class44("Second Glow", (Class42)this, false).Method313(this.Field10292::Method365)));
    private final Class44 Field10295 = this.Method23(this.Field10291.Method7405(new Class44("Glow Offset", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble((long)1111883125 ^ 0x403400004245FD75L), true).Method313(this.Field10292::Method365)));
    private final Class44 Field10296 = this.Method23(this.Field10291.Method7405(new Class44("Glow Radius", (Class42)this, 0.0, Double.longBitsToDouble(0x4014000000000000L), Double.longBitsToDouble(0x4034000000000000L), true).Method313(this.Field10292::Method365)));
    private final Class44 Field10297 = this.Method23(this.Field10291.Method7405(new Class44("Glow Background", (Class42)this, false)));
    private String Field10298 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class539() {
        super("ArrayList", "Displays your enables modules!");
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2438(RenderGameOverlayEvent.Text text) {
        ArrayList<Class83> arrayList = new ArrayList<Class83>();
        ScaledResolution scaledResolution = new ScaledResolution(leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (this.Field10278.Method365()) {
            for (Class695 class695 : Class1796.Field16241.Field16254.Field8854) {
                if (class695 == null || !((Class42)class695).Method35() || !((Class42)class695).Field8064) continue;
                arrayList.add(new Class83(((Class42)class695).Method40() + (((Class42)class695).Method42().isEmpty() || !this.Field10281.Method365() ? "" : " " + TextFormatting.GRAY + ((Class42)class695).Method42()), ((Class42)class695).Method40() + (((Class42)class695).Method42().equalsIgnoreCase("") ? "" : " " + ((Class42)class695).Method42()), Class698.Field10958));
            }
        }
        if (this.Field10279.Method365()) {
            for (Class695 class695 : Class1796.Field16241.Field16257.Field9235) {
                if (class695 == null || !((Class42)class695).Method35() || !((Class1249)class695).Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro) continue;
                arrayList.add(new Class83(((Class42)class695).Method40() + (((Class42)class695).Method42().isEmpty() || !this.Field10281.Method365() ? "" : " " + TextFormatting.GRAY + ((Class42)class695).Method42()), ((Class42)class695).Method40() + (((Class42)class695).Method42().equalsIgnoreCase("") ? "" : " " + ((Class42)class695).Method42()), Class698.Field10959));
            }
        }
        if (this.Field10280.Method365()) {
            for (Class695 class695 : Class1796.Field16241.Field16258.Method7570()) {
                if (!((Class44)class695).Method386() || ((Class44)class695).Method337() == 0 || !((Class44)class695).Method365()) continue;
                arrayList.add(new Class83(((Class44)class695).Method399() + (((Class44)class695).Method306().isEmpty() || !this.Field10281.Method365() ? "" : " " + TextFormatting.GRAY + ((Class44)class695).Method306()), Class698.Field10960));
            }
        }
        Iterator iterator = Class539::Method2440;
        arrayList.sort((Comparator<Class83>)((Object)iterator));
        int n = 0;
        int n2 = this.Field10285.Method365() ? Class1172.Method4709(100, 100) : this.Field10286.Method339().Method3626();
        double d = (double)Class1178.Method4748() + this.Field10284.Method367() + 1.0;
        float[] fArray = Color.RGBtoHSB(Class1172.Method4721(n2), Class1172.Method4722(n2), Class1172.Method4723(n2), null);
        int n3 = 0;
        while (n3 < arrayList.size()) {
            Class83 class83 = (Class83)arrayList.get(n3);
            if (class83 != null) {
                String string = this.Field10287.Method359();
                int n4 = -1;
                switch (string.hashCode()) {
                    case 2433880: {
                        if (string.equals("None")) {
                            n4 = 0;
                        }
                        break;
                    }
                    case -1656737386: {
                        if (string.equals("Rainbow")) {
                            n4 = 1;
                        }
                        break;
                    }
                    case 961091784: {
                        if (string.equals("Astolfo")) {
                            n4 = 2;
                        }
                        break;
                    }
                    case 1438732012: {
                        if (string.equals("Pulsive")) {
                            n4 = 3;
                        }
                        break;
                    }
                }
                ++n;
            }
            ++n3;
        }
    }

    private void Method2439(double d, double d2, double d3, double d4) {
        Class753.drawRect(d, d2, d3, d4, Class1172.Method4728(Color.BLACK, this.Field10290.Method335()).getRGB());
    }

    private static int Method2440(Class83 class83, Class83 class832) {
        int n;
        float f = Class1178.Method4741(class832.Method734()) - Class1178.Method4741(class83.Method734());
        if (f != 0.0f) {
            n = (int)f;
            return n;
        }
        n = class832.Method735().compareTo(class83.Method735());
        return n;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 183;
            cArray2[n] = (char)(cArray[n] ^ (0x2070 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

