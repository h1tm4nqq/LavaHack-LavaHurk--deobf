//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.*;
import net.minecraft.util.text.*;
import java.awt.*;
import java.util.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class539 extends Class1249
{
    public static Class539 Field10276;
    private final Class1996 Field10277;
    private final Class44 Field10278;
    private final Class44 Field10279;
    private final Class44 Field10280;
    private final Class44 Field10281;
    private final Class44 Field10282;
    private final Class44 Field10283;
    private final Class44 Field10284;
    private final Class44 Field10285;
    private final Class44 Field10286;
    private final Class44 Field10287;
    private final Class44 Field10288;
    private final Class44 Field10289;
    private final Class44 Field10290;
    private final Class1996 Field10291;
    private final Class44 Field10292;
    private final Class44 Field10293;
    private final Class44 Field10294;
    private final Class44 Field10295;
    private final Class44 Field10296;
    private final Class44 Field10297;
    private String Field10298 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class539() {
        super("ArrayList", "Displays your enables modules!");
        this.Field10277 = this.Method24(new Class1996(new Class44("Types", (Class42)this)));
        this.Field10278 = this.Method23(this.Field10277.Method7405(new Class44("Modules", (Class42)this, true)));
        this.Field10279 = this.Method23(this.Field10277.Method7405(new Class44("Hud Modules", (Class42)this, false)));
        this.Field10280 = this.Method23(this.Field10277.Method7405(new Class44("Check Boxes", (Class42)this, false)));
        this.Field10281 = this.Method23(new Class44("Show Display Info", (Class42)this, true));
        this.Field10282 = this.Method23(new Class44("Y Coord", (Class42)this, Double.longBitsToDouble(4613937818241073152L), 0.0, Double.longBitsToDouble((long)1682700765 ^ 0x407F4000644BF9DDL), true));
        this.Field10283 = this.Method23(new Class44("Orientation", (Class42)this, (Enum)Class676.Field10873));
        this.Field10284 = this.Method23(new Class44("Offsets", (Class42)this, Double.longBitsToDouble(4611686018427387904L), 0.0, Double.longBitsToDouble((long)1386539363 ^ 0x4024000052A4E963L), true));
        this.Field10285 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Field10286 = this.Method23(new Class44("Color", (Class42)this, "Color", new Class2027(-1)));
        this.Field10287 = this.Method23(new Class44("Gradient", (Class42)this, (Enum)Class2075.Field17489));
        this.Field10288 = this.Method23(new Class44("Gradient Diff", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
        this.Field10289 = this.Method23(new Class44("Background", (Class42)this, true));
        this.Field10290 = this.Method23(new Class44("Background Alpha", (Class42)this, Double.longBitsToDouble((long)1339258121 ^ 0x406FE0004FD37509L), 0.0, Double.longBitsToDouble((long)5049015 ^ 0x406FE000004D0AB7L), true));
        this.Field10291 = this.Method24(new Class1996(new Class44("Glow", (Class42)this)));
        this.Field10292 = this.Method23(this.Field10291.Method7405(new Class44("Glow", (Class42)this, false)));
        this.Field10293 = this.Method23(new Class44("Glow Alpha", (Class42)this, Double.longBitsToDouble(4643176031446892544L), 0.0, Double.longBitsToDouble((long)2072091064 ^ 0x406FE0007B8199B8L), true));
        this.Field10294 = this.Method23(this.Field10291.Method7405(new Class44("Second Glow", (Class42)this, false).Method313((Supplier)this.Field10292::Method365)));
        this.Field10295 = this.Method23(this.Field10291.Method7405(new Class44("Glow Offset", (Class42)this, Double.longBitsToDouble(4617315517961601024L), 1.0, Double.longBitsToDouble((long)1111883125 ^ 0x403400004245FD75L), true).Method313((Supplier)this.Field10292::Method365)));
        this.Field10296 = this.Method23(this.Field10291.Method7405(new Class44("Glow Radius", (Class42)this, 0.0, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble(4626322717216342016L), true).Method313((Supplier)this.Field10292::Method365)));
        this.Field10297 = this.Method23(this.Field10291.Method7405(new Class44("Glow Background", (Class42)this, false)));
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2438(final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        final ArrayList<Class83> list = new ArrayList<Class83>();
        final ScaledResolution scaledResolution = new ScaledResolution(Class539.leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (this.Field10278.Method365()) {
            for (final Class42 class42 : Class1796.Field16241.Field16254.Field8854) {
                if (class42 != null && class42.Method35() && class42.Field8064) {
                    list.add(new Class83(class42.Method40() + ((class42.Method42().isEmpty() || !this.Field10281.Method365()) ? "" : (" " + TextFormatting.GRAY + class42.Method42())), class42.Method40() + (class42.Method42().equalsIgnoreCase("") ? "" : (" " + class42.Method42())), Class698.Field10958));
                }
            }
        }
        if (this.Field10279.Method365()) {
            for (final Class1249 class43 : Class1796.Field16241.Field16257.Field9235) {
                if (class43 != null && class43.Method35() && class43.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro) {
                    list.add(new Class83(class43.Method40() + ((class43.Method42().isEmpty() || !this.Field10281.Method365()) ? "" : (" " + TextFormatting.GRAY + class43.Method42())), class43.Method40() + (class43.Method42().equalsIgnoreCase("") ? "" : (" " + class43.Method42())), Class698.Field10959));
                }
            }
        }
        if (this.Field10280.Method365()) {
            for (final Class44 class44 : Class1796.Field16241.Field16258.Method7570()) {
                if (class44.Method386() && class44.Method337() != 0 && class44.Method365()) {
                    list.add(new Class83(class44.Method399() + ((class44.Method306().isEmpty() || !this.Field10281.Method365()) ? "" : (" " + TextFormatting.GRAY + class44.Method306())), Class698.Field10960));
                }
            }
        }
        list.sort(Class539::Method2440);
        int n = 0;
        final int n2 = this.Field10285.Method365() ? Class1172.Method4709(100, 100) : this.Field10286.Method339().Method3626();
        final double n3 = Class1178.Method4748() + this.Field10284.Method367() + 1.0;
        Color.RGBtoHSB(Class1172.Method4721(n2), Class1172.Method4722(n2), Class1172.Method4723(n2), null);
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) != null) {
                final String method359 = this.Field10287.Method359();
                switch (method359.hashCode()) {
                    case 2433880: {
                        if (method359.equals("None")) {
                            break;
                        }
                        break;
                    }
                    case -1656737386: {
                        if (method359.equals("Rainbow")) {
                            break;
                        }
                        break;
                    }
                    case 961091784: {
                        if (method359.equals("Astolfo")) {
                            break;
                        }
                        break;
                    }
                    case 1438732012: {
                        if (method359.equals("Pulsive")) {
                            break;
                        }
                        break;
                    }
                }
                ++n;
            }
        }
    }
    
    private void Method2439(final double n, final double n2, final double n3, final double n4) {
        Class753.drawRect(n, n2, n3, n4, Class1172.Method4728(Color.BLACK, this.Field10290.Method335()).getRGB());
    }
    
    private static int Method2440(final Class83 class83, final Class83 class84) {
        final float n = (float)(Class1178.Method4741(class84.Method734()) - Class1178.Method4741(class83.Method734()));
        return (n != 0.0f) ? ((int)n) : class84.Method735().compareTo(class83.Method735());
    }
    
    static {
        Class539.Field10276 = new Class539();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2070 ^ 0xB7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
