//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import org.lwjgl.input.*;
import java.io.*;
import net.minecraft.client.gui.*;
import com.kisman.cc.util.*;

public class Class2004 extends Class1888
{
    private final HashMap Field17188;
    private final Class1803 Field17189;
    private Class1039 Field17190;
    private Class1494 Field17191;
    private Class1876 Field17192;
    private Class1882 Field17193;
    private List Field17194;
    private String Field17195 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2004() {
        this.Field17194 = new ArrayList();
        this.Field17193 = new Class1882();
        this.Field17188 = new HashMap();
        this.Field17192 = (Class1876)new Class548();
        this.Field17189 = new Class1803(this.Field17192, (Class1997)new Class1537(1));
        this.Field17190 = new Class1039(Class1796.Method6783(), 50, 50, 920, 420);
        this.Field17191 = new Class1494("Visual Preview", 940, 50, 200, 280);
        final Class2024 class2024 = new Class2024(this.Field17192, (Class1997)new Class1537(1));
        final Class1803 class2025 = new Class1803(this.Field17192, (Class1997)new Class13());
        final HashMap<Class97, Class1803> hashMap = new HashMap<Class97, Class1803>();
        final ArrayList<Class532> list = new ArrayList<Class532>();
        final ArrayList<Class1803> list2 = new ArrayList<Class1803>();
        for (final Class97 class2026 : Class97.values()) {
            if (class2026 != Class97.Field8347) {
                final ArrayList method1164 = Class1796.Field16241.Field16254.Method1164(class2026);
                final Class1803 class2027 = new Class1803(this.Field17192, (Class1997)new Class1537(1));
                final Class2006 class2028 = new Class2006(this.Field17192, class2026.Method807() + (null.Field11805.Method365() ? (" [" + method1164.size() + "]") : ""));
                class2025.Method6815((Class1514)class2028);
                class2028.Method690(this::Method7451);
                for (final Class42 class2029 : method1164) {
                    final Class1803 class2030 = new Class1803(this.Field17192, (Class1997)new Class1537(4));
                    int n = 0;
                    class2030.Method6815((Class1514)new Class315(this.Field17192, "Toggle"));
                    final Class1461 class2031 = new Class1461(this.Field17192, "Toggled");
                    class2030.Method6815((Class1514)class2031);
                    this.Field17194.add(() -> class2031.Method5891(class2029.Method35()));
                    class2031.Method5889(b -> {
                        class2029.Method21(b);
                        return true;
                    });
                    n += 2;
                    class2030.Method6815((Class1514)new Class315(this.Field17192, "Keybind"));
                    final Class79 class2032 = new Class79(this.Field17192, Keyboard::getKeyName);
                    class2030.Method6815((Class1514)class2032);
                    this.Field17194.add(() -> class2032.Method696(class2029.Method33()));
                    class2032.Method699(n -> {
                        class2029.Method34(n);
                        return true;
                    });
                    n += 2;
                    class2030.Method6815((Class1514)new Class315(this.Field17192, "Visible"));
                    final Class1461 class2033 = new Class1461(this.Field17192, "Visibled");
                    class2030.Method6815((Class1514)class2033);
                    this.Field17194.add(() -> class2033.Method5891(class2029.Field8064));
                    class2033.Method5889(b -> {
                        class2029.Field8064 = b;
                        return true;
                    });
                    n += 2;
                    class2030.Method6815((Class1514)new Class315(this.Field17192, "Bind Mode"));
                    final Class2133 class2034 = new Class2133(this.Field17192, new String[] { "Toggle", "Hold" }, class2029.Field8065 ? 1 : 0);
                    class2030.Method6815((Class1514)class2034);
                    class2034.Method7676(n -> {
                        class2029.Field8065 = (n != 0);
                        return true;
                    });
                    this.Field17194.add(() -> class2034.Method7675(class2029.Field8065 ? 1 : 0));
                    n += 2;
                    if (Class1796.Field16241.Field16258.Method7571(class2029) != null && !Class1796.Field16241.Field16258.Method7571(class2029).isEmpty()) {
                        for (final Class44 class2035 : Class1796.Field16241.Field16258.Method7571(class2029)) {
                            if (class2035.Method388()) {
                                final String method1165 = class2035.Method354();
                                if (n % 4 != 0) {
                                    for (int n2 = n % 4, j = 0; j < 4 - n2; ++j) {
                                        class2030.Method6815((Class1514)new Class1623(this.Field17192));
                                        ++n;
                                    }
                                }
                                class2030.Method6815((Class1514)new Class383(this.Field17192, method1165));
                                class2030.Method6815((Class1514)new Class1623(this.Field17192));
                                class2030.Method6815((Class1514)new Class1623(this.Field17192));
                                class2030.Method6815((Class1514)new Class1623(this.Field17192));
                                n += 4;
                            }
                            if (class2035.Method380()) {
                                class2030.Method6815((Class1514)new Class315(this.Field17192, class2035.Method356()));
                                final Class79 class2036 = new Class79(this.Field17192, Keyboard::getKeyName);
                                class2030.Method6815((Class1514)class2036);
                                this.Field17194.add(() -> class2036.Method696(class2035.Method337()));
                                class2036.Method699(n -> {
                                    class2035.Method338(n);
                                    return true;
                                });
                                n += 2;
                            }
                            if (class2035.Method389()) {
                                class2030.Method6815((Class1514)new Class315(this.Field17192, class2035.Method354()));
                                final Class789 class2037 = new Class789(this.Field17192, class2035.Method339());
                                class2030.Method6815((Class1514)class2037);
                                class2037.Method3292(class45 -> {
                                    class2035.Method340(class45);
                                    return true;
                                });
                                class2037.Method3293(b -> {
                                    class2035.Method377(b);
                                    return true;
                                });
                                this.Field17194.add(() -> class2037.Method3291(class2035.Method339()));
                                this.Field17194.add(() -> class2037.Method3290(class2035.Method376()));
                                n += 2;
                            }
                            if (class2035.Method383()) {
                                class2030.Method6815((Class1514)new Class315(this.Field17192, class2035.Method356()));
                                final Class1256 class2038 = new Class1256(this.Field17192, class2035.Method343());
                                class2030.Method6815((Class1514)class2038);
                                class2038.Method5075(s -> {
                                    class2035.Method360(s);
                                    return true;
                                });
                                this.Field17194.add(() -> class2038.Method5074(class2035.Method359()));
                                n += 2;
                            }
                            if (class2035.Method386()) {
                                class2030.Method6815((Class1514)new Class315(this.Field17192, class2035.Method356()));
                                final Class1461 class2039 = new Class1461(this.Field17192, "Enabled");
                                class2030.Method6815((Class1514)class2039);
                                class2039.Method5889(b -> {
                                    class2035.Method366(b);
                                    return true;
                                });
                                this.Field17194.add(() -> class2039.Method5891(class2035.Method365()));
                                n += 2;
                            }
                            if (class2035.Method387()) {
                                class2030.Method6815((Class1514)new Class315(this.Field17192, class2035.Method356()));
                                Class467 class2040 = Class467.Field9944;
                                switch (Class159.Field8625[class2035.Method320().ordinal()]) {
                                    case 1: {
                                        if (class2035.Method319()) {
                                            class2040 = Class467.Field9945;
                                            break;
                                        }
                                        break;
                                    }
                                    case 2: {
                                        if (class2035.Method371() == 0.0 && class2035.Method372() == Double.longBitsToDouble(4636737291354636288L)) {
                                            class2040 = Class467.Field9942;
                                            break;
                                        }
                                        break;
                                    }
                                    case 3: {
                                        class2040 = Class467.Field9943;
                                        break;
                                    }
                                }
                                final Class1645 class2041 = new Class1645(this.Field17192, class2035.Method367(), class2035.Method371(), class2035.Method372(), class2040);
                                class2030.Method6815((Class1514)class2041);
                                class2041.Method6387(n -> {
                                    class2035.Method370(n.doubleValue());
                                    return true;
                                });
                                this.Field17194.add(() -> class2041.Method6386(class2035.Method367()));
                                n += 2;
                            }
                            if (class2035.Method385()) {
                                class2030.Method6815((Class1514)new Class315(this.Field17192, class2035.Method356()));
                                final Class2133 class2042 = new Class2133(this.Field17192, class2035.Method315(), class2035.Method318());
                                class2030.Method6815((Class1514)class2042);
                                class2042.Method7676(n -> {
                                    class2035.Method360(class2035.Method317(n));
                                    class2035.Method353(n);
                                    return true;
                                });
                                this.Field17194.add(() -> class2042.Method7675(class2035.Method318()));
                                n += 2;
                            }
                        }
                    }
                    final Class532 class2043 = new Class532(this.Field17192, class2029.Method40(), this.width, class2030, class2029);
                    list2.add(class2030);
                    list.add(class2043);
                    class2027.Method6815((Class1514)class2043);
                    hashMap.put(class2026, class2027);
                }
                this.Field17188.put(class2026, class2027);
            }
        }
        class2024.Method6815((Class1514)class2025);
        int max = Integer.MIN_VALUE;
        final Iterator<Object> iterator3 = list2.iterator();
        while (iterator3.hasNext()) {
            max = Math.max(max, iterator3.next().Method675());
        }
        this.Field17190.Method4245(28 + max);
        for (final Class532 class2044 : list) {
            class2044.Method676(class2044.Field10244 = max);
        }
        this.Field17189.Method676(max);
        class2025.Method676(max);
        class2024.Method6815((Class1514)this.Field17189);
        class2024.Method6813();
        this.Field17190.Method4237((Class1803)class2024);
        if (this.Field17188.keySet().size() > 0) {
            this.Method7428(this.Field17188.keySet().iterator().next());
        }
    }
    
    public void initGui() {
        super.initGui();
        this.Field17193 = new Class1882();
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        if (Class1796.Field16241.Field16267.Method1968() != Class1233.Field13593) {
            Class754.Field11206.Method2058(Class1796.Field16241.Field16267);
            return;
        }
        this.drawDefaultBackground();
        if (null.Field11790.Method365()) {
            this.Field17193.Method6979(10);
            this.Field17193.Method6984();
            this.Field17193.Method6985();
        }
        Class1796.Field16241.Field16268.Method5122(n, n2);
        final Iterator<Class790> iterator = this.Field17194.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method3300();
        }
        this.Field17190.Method4249(Class1796.Method6783() + " | " + Class1796.Method6785() + (null.Field11805.Method365() ? (" | " + Class1796.Field16241.Field16254.Field8854.size() + " modules") : ""));
        GL11.glPushMatrix();
        final Point method2102 = Class447.Method2102();
        this.Field17190.Method4235(method2102.x * 2, method2102.y * 2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5980(method2102.x * 2, method2102.y * 2);
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glLineWidth(1.0f);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        this.Field17190.Method4230(this.Field17192, n, n2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5974(this.Field17192, n, n2);
        }
        GL11.glDisable(3042);
        GL11.glEnable(3553);
        GL11.glPopMatrix();
        this.Field17190.Method4231(this.Field17192);
        super.drawScreen(n, n2, n3);
    }
    
    public void Method7424() {
        this.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
        super.onGuiClosed();
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        this.Field17190.Method4235(n * 2, n2 * 2);
        this.Field17190.Method4232(n3, n * 2, n2 * 2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5980(n * 2, n2 * 2);
            this.Field17191.Method5977(n3, n * 2, n2 * 2);
        }
        super.mouseClicked(n, n2, n3);
    }
    
    public void Method7425(final int n, final int n2, final int n3) {
        this.Field17190.Method4235(n * 2, n2 * 2);
        this.Field17190.Method4234(n3, n * 2, n2 * 2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5980(n * 2, n2 * 2);
            this.Field17191.Method5979(n3, n * 2, n2 * 2);
        }
        super.mouseReleased(n, n2, n3);
    }
    
    public void Method7426(final int n, final int n2, final int n3, final long n4) {
        this.Field17190.Method4235(n * 2, n2 * 2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5980(n * 2, n2 * 2);
        }
        super.mouseClickMove(n, n2, n3, n4);
    }
    
    public void Method7427() throws IOException {
        super.handleMouseInput();
        this.Field17190.Method4239(Mouse.getEventDWheel());
    }
    
    public void keyTyped(final char c, final int n) {
        if (n != -1) {
            this.Field17190.Method4238(n, c);
        }
        else {
            this.mc.displayGuiScreen((GuiScreen)null);
        }
        super.keyTyped(c, n);
    }
    
    private void Method7428(final Class97 key) {
        this.Field17189.Method6817();
        this.Field17189.Method6815((Class1514)this.Field17188.get(key));
    }
    
    private void Method7451(final Class97 class97) {
        this.Method7428(class97);
    }
    
    private static String Method7452(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4656 ^ 0x19));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
