//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.client.gui.*;
import java.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;
import java.awt.*;

public class Class1419 extends Class1888
{
    public Class1487 Field14581;
    public static Class2028 Field14582;
    public static Class2027 Field14583;
    public static Class2027 Field14584;
    public static Class2027 Field14585;
    public static Class2027 Field14586;
    public static Class2027 Field14587;
    public static boolean Field14588;
    public static boolean Field14589;
    public static boolean Field14590;
    public static boolean Field14591;
    public static boolean Field14592;
    public static boolean Field14593;
    public static boolean Field14594;
    public static boolean Field14595;
    public static boolean Field14596;
    public static boolean Field14597;
    public static boolean Field14598;
    public static int Field14599;
    public static int Field14600;
    public static double Field14601;
    public static double Field14602;
    public static double Field14603;
    public static int Field14604;
    public static int Field14605;
    public static final int Field14606;
    public final ArrayList Field14607;
    public Class1882 Field14608;
    private GuiScreen Field14609;
    public static Class1520 Field14610;
    public static int Field14611;
    public static int Field14612;
    private String Field14613 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1419(final GuiScreen field14609) {
        this();
        this.Field14609 = field14609;
    }
    
    public Class1419 Method1218(final GuiScreen field14609) {
        this.Field14609 = field14609;
        return this;
    }
    
    public Class1419(final GuiScreen guiScreen, final boolean b) {
        this(b);
        this.Method1218(guiScreen);
    }
    
    public Class1419(final boolean b) {
        this.Field14581 = new Class1487();
        this.Field14607 = new ArrayList();
        this.Field14609 = null;
        this.Field14608 = new Class1882();
    }
    
    public Class1419() {
        this(true);
        int n = 0;
        final Class97[] values = Class97.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            this.Field14607.add(new Class354(values[i], n, 17));
            n += Class1419.Field14605 * 2 + 120 - 1 - 1 - 1 - 1 - 1 - 1 - 1;
        }
    }
    
    public void Method1219() {
        Class1233.Field13591.Method4959().invoke();
        Class1796.Field16241.Field16267.Method1974(true);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.Field14608 = new Class1882();
    }
    
    protected Class1233 Method1220() {
        return Class1233.Field13591;
    }
    
    @Override
    public void drawScreen(final int field14611, final int field14612, final float n) {
        if (Class1796.Field16241.Field16267.Method1968() != this.Method1220()) {
            Class754.Field11206.Method2058(Class1796.Field16241.Field16267);
            return;
        }
        Class1419.Field14611 = field14611;
        Class1419.Field14612 = field14612;
        Class1419.Field14583 = null.Field16081.Method339();
        Class1419.Field14588 = null.Field16082.Method365();
        Class1419.Field14604 = null.Field16085.Method335();
        Class1419.Field14605 = null.Field16086.Method335();
        Class1419.Field14590 = null.Field16087.Method365();
        Class1419.Field14591 = null.Field16088.Method365();
        Class1419.Field14592 = null.Field16090.Method365();
        Class1419.Field14593 = null.Field16092.Method365();
        Class1419.Field14589 = null.Field16091.Method365();
        Class1419.Field14599 = null.Field11794.Method335();
        Class1419.Field14601 = null.Field16093.Method367();
        Class1419.Field14602 = null.Field16094.Method367();
        Class1419.Field14582 = (Class2028)null.Field16095.Method341();
        Class1419.Field14594 = null.Field16096.Method365();
        Class1419.Field14586 = null.Field16097.Method339();
        Class1419.Field14600 = null.Field16099.Method335();
        Class1419.Field14585 = null.Field16101.Method339();
        Class1419.Field14596 = null.Field16102.Method365();
        Class1419.Field14597 = null.Field16104.Method365();
        Class1419.Field14598 = null.Field16103.Method365();
        Class1419.Field14595 = null.Field16105.Method365();
        Class1419.Field14603 = null.Field16106.Method367();
        Class1419.Field14587 = null.Field16084.Method339();
        if (!Class1419.Field14588) {
            Class1419.Field14584 = new Class2027(0, 0, 0, 0);
        }
        else {
            Class1419.Field14584 = null.Field16083.Method339();
        }
        this.drawDefaultBackground();
        if (null.Field11790.Method365()) {
            this.Field14608.Method6979(10);
            this.Field14608.Method6984();
            this.Field14608.Method6985();
        }
        Class1796.Field16241.Field16268.Method5122(field14611, field14612);
        this.Method1229();
        for (final Class354 class354 : this.Field14607) {
            if (class354.Field9472) {
                continue;
            }
            class354.Method67(field14611, field14612);
            if (class354.Field9474) {
                for (final Class1520 class355 : class354.Field9465) {
                    if (class355.Method641()) {
                        class355.Method627(class354.Field9469, class354.Field9470);
                        class355.Method623(field14611, field14612);
                    }
                }
            }
            class354.Method69(field14611, field14612);
            class354.Method72();
        }
        for (final Class354 class356 : this.Field14607) {
            if (!class356.Field9472) {
                class356.Method70(field14611, field14612);
            }
        }
        this.drawSelectionBar(field14611, field14612);
    }
    
    public void keyTyped(final char c, final int n) {
        if (n == 1) {
            this.mc.displayGuiScreen((this.Field14609 == null) ? null : this.Field14609);
        }
        super.keyTyped(c, n);
        for (final Class354 class354 : this.Field14607) {
            if (class354.Field9474 && n != 1 && !class354.Field9465.isEmpty() && !class354.Field9472) {
                for (final Class1520 class355 : class354.Field9465) {
                    if (class355.Method641()) {
                        class355.Method628(c, n);
                    }
                }
            }
        }
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        super.mouseClicked(n, n2, n3);
        for (final Class354 class354 : this.Field14607) {
            if (class354.Field9472) {
                continue;
            }
            if (class354.Method73(n, n2)) {
                if (n3 == 0) {
                    class354.Field9473 = true;
                    class354.Field9475 = n - class354.Field9469;
                    class354.Field9476 = n2 - class354.Field9470;
                }
                else if (n3 == 1) {
                    class354.Field9474 = !class354.Field9474;
                }
            }
            if (!class354.Field9474 || class354.Field9465.isEmpty()) {
                continue;
            }
            for (final Class1520 class355 : class354.Field9465) {
                if (class355.Method641()) {
                    class355.Method625(n, n2, n3);
                }
            }
        }
    }
    
    public void Method1221(final int n, final int n2, final int n3) {
        for (final Class354 class354 : this.Field14607) {
            if (class354.Field9472) {
                continue;
            }
            class354.Field9473 = false;
            if (!class354.Field9474 || class354.Field9465.isEmpty()) {
                continue;
            }
            for (final Class1520 class355 : class354.Field9465) {
                if (class355.Method641()) {
                    class355.Method626(n, n2, n3);
                }
            }
        }
    }
    
    public void Method1222() {
        if (this.mc.player != null && this.mc.world != null) {
            this.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
        }
        super.onGuiClosed();
    }
    
    public boolean Method1223() {
        return true;
    }
    
    public static void Method1224(final String s, final int n, final int n2, final int n3, final int n4) {
        if (Class1419.Field14610 != null && Class1419.Field14611 > n && Class1419.Field14611 < n + n3 && Class1419.Field14612 > n2 && Class1419.Field14612 < n2 + n4) {
            Class753.drawRectWH(n + Class1419.Field14601, n2 + Class1419.Field14602, n3 - Class1419.Field14601 * Double.longBitsToDouble(4611686018427387904L), n4 - Class1419.Field14602 * Double.longBitsToDouble((long)779893790 ^ 0x400000002E7C3C1EL), Class1419.Field14587.Method3626());
        }
        switch (Class1780.Field16161[Class1419.Field14582.ordinal()]) {
            case 1: {
                Class1178.Method4746(s, n + n3 / Double.longBitsToDouble((long)56614627 ^ 0x40000000035FDEE3L), n2 + n4 / Double.longBitsToDouble((long)687288008 ^ 0x4000000028F72EC8L) - Class1178.Method4748() / Double.longBitsToDouble(4611686018427387904L), -1);
                break;
            }
            case 2: {
                Class1178.Method4745(s, (double)(n + Class1419.Field14600), n2 + n4 / Double.longBitsToDouble(4611686018427387904L) - Class1178.Method4748() / Double.longBitsToDouble(4611686018427387904L), -1);
                break;
            }
        }
    }
    
    public static void Method1225(final String s, final String s2, final double n, final double n2, final double n3, final double n4, final Class2027 class2027, final int n5) {
        GL11.glPushMatrix();
        GL11.glScaled(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L), 1.0);
        Label_0454: {
            switch (Class1780.Field16161[Class1419.Field14582.ordinal()]) {
                case 1: {
                    switch (n5) {
                        case 1: {
                            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(s, (float)(n + n3 / Double.longBitsToDouble((long)221836211 ^ 0x400000000D38F3B3L) + Class1178.Method4741(s2)), (float)n2 * 2.0f, class2027.Method3626());
                            break;
                        }
                        case 2: {
                            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(s, (float)(n + n3 / Double.longBitsToDouble(4611686018427387904L) + Class1178.Method4741(s2)), (float)(n2 + n4 / Double.longBitsToDouble(4611686018427387904L) - Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f / 2.0f) * 2.0f, class2027.Method3626());
                            break;
                        }
                        case 3: {
                            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(s, (float)(n + n3 / Double.longBitsToDouble((long)175910276 ^ 0x400000000A7C2D84L) + Class1178.Method4741(s2)), (float)(n2 + n4 - Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f) * 2.0f, class2027.Method3626());
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n5) {
                        case 1: {
                            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(s, (float)(n + Class1178.Method4741(s2) + Class1419.Field14600) * 2.0f, (float)n2 * 2.0f, class2027.Method3626());
                            break Label_0454;
                        }
                        case 2: {
                            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(s, (float)(n + Class1178.Method4741(s2) + Class1419.Field14600) * 2.0f, (float)(n2 + n4 / Double.longBitsToDouble((long)62608383 ^ 0x4000000003BB53FFL) - Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f / 2.0f) * 2.0f, class2027.Method3626());
                            break Label_0454;
                        }
                        case 3: {
                            Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(s, (float)(n + Class1178.Method4741(s2) + Class1419.Field14600) * 2.0f, (float)(n2 + n4 - Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f) * 2.0f, class2027.Method3626());
                            break Label_0454;
                        }
                    }
                    break;
                }
            }
        }
        GL11.glPopMatrix();
    }
    
    public static void Method1226(final String s, final String s2, final double n, final double n2, final double n3, final double n4, final int n5, final int n6) {
        Method1225(s, s2, n, n2, n3, n4, Method1228(n5), n6);
    }
    
    public static void Method1227(final String s, final int n, final int n2, final int n3, final int n4) {
        Class1178.Method4746(s, n + n3 / Double.longBitsToDouble(4611686018427387904L), n2 + n4 / Double.longBitsToDouble((long)1000017347 ^ 0x400000003B9B0DC3L) - Class1178.Method4748() / Double.longBitsToDouble(4611686018427387904L), -1);
    }
    
    public static Class2027 Method1228(final int n) {
        final String method359 = null.Field11793.Method359();
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
        return Class1419.Field14583;
    }
    
    private void Method1229() {
        final int dWheel = Mouse.getDWheel();
        if (dWheel < 0) {
            for (final Class354 class354 : this.Field14607) {
                if (class354.Field9472) {
                    continue;
                }
                if (null.Field11783.Method365() && Keyboard.getEventKeyState() && Keyboard.getEventKey() == null.Field11784.Method337()) {
                    class354.Field9469 -= (int)null.Field11782.Method367();
                }
                else {
                    class354.Field9470 -= (int)null.Field11782.Method367();
                }
            }
        }
        else if (dWheel > 0) {
            for (final Class354 class355 : this.Field14607) {
                if (class355.Field9472) {
                    continue;
                }
                if (null.Field11783.Method365() && Keyboard.getEventKeyState() && Keyboard.getEventKey() == null.Field11784.Method337()) {
                    class355.Field9469 += (int)null.Field11782.Method367();
                }
                else {
                    class355.Field9470 += (int)null.Field11782.Method367();
                }
            }
        }
    }
    
    public static void Method1230(final Class1520 class1520) {
        if (!class1520.Method641()) {
            return;
        }
        if (Class1419.Field14589) {
            Class753.drawRectWH(class1520.Method636(), class1520.Method638(), 1.0, class1520.Method632(), Method1228(class1520.Method633()).Method3626());
            Class753.drawRectWH(class1520.Method636() + Class981.Method3992(class1520.Method640(), 120) - 1, class1520.Method638(), 1.0, class1520.Method632(), Method1228(class1520.Method633()).Method3626());
        }
        if (class1520 instanceof Class337) {
            final Class337 class1521 = (Class337)class1520;
            if (Class1419.Field14592 && class1521.Method1668() && !class1521.Method1669().isEmpty()) {
                Class753.drawRectWH(class1520.Method636(), class1520.Method638() + class1520.Method632(), Class981.Method3992(class1520.Method640(), 120), 1.0, Method1228(((Class1520)class1521.Method1669().get(0)).Method633()).Method3626());
                Class753.drawRectWH(class1520.Method636(), class1520.Method638() + class1520.Method632() + Method1231(class1521.Method1669(), 0) - 1, Class981.Method3992(class1520.Method640(), 120), 1.0, Method1228(((Class1520)class1521.Method1669().get(class1521.Method1669().size() - 1)).Method633()).Method3626());
            }
        }
    }
    
    public static int Method1231(final ArrayList list, int method1231) {
        for (final Class1520 class1520 : list) {
            if (!class1520.Method641()) {
                continue;
            }
            method1231 += class1520.Method631();
            if (!(class1520 instanceof Class337)) {
                continue;
            }
            final Class337 class1521 = (Class337)class1520;
            if (!class1521.Method1668()) {
                continue;
            }
            method1231 = Method1231(class1521.Method1669(), method1231);
        }
        return method1231;
    }
    
    public static void Method1232(final Class1520 class1520, final boolean b, final boolean b2, final boolean b3) {
        if (Class1419.Field14595) {
            final int method3992 = Class981.Method3992(class1520.Method640(), 120);
            if (!b3 && (Class1419.Field14601 > 0.0 || Class1419.Field14602 > 0.0 || !b)) {
                final double n = method3992 - Class1419.Field14601 * Double.longBitsToDouble((long)923234345 ^ 0x4000000037077029L);
                Class753.drawRectWH(class1520.Method636() + Class1419.Field14601, class1520.Method638() + Class1419.Field14602, n, Class1419.Field14603, Class1419.Field14585.Method3626());
                Class753.drawRectWH(class1520.Method636() + Class1419.Field14601, class1520.Method638() + Class1419.Field14602 + class1520.Method632() - Class1419.Field14602 * Double.longBitsToDouble((long)1636578086 ^ 0x40000000618C3326L) - Class1419.Field14603, n, Class1419.Field14603, Class1419.Field14585.Method3626());
                Class753.drawRectWH(class1520.Method636() + Class1419.Field14601, class1520.Method638() + Class1419.Field14602, Class1419.Field14603, class1520.Method632() - Class1419.Field14602 * Double.longBitsToDouble(4611686018427387904L), Class1419.Field14585.Method3626());
                Class753.drawRectWH(class1520.Method636() + Class1419.Field14601 + n - Class1419.Field14603, class1520.Method638() + Class1419.Field14602, Class1419.Field14603, class1520.Method632() - Class1419.Field14602 * Double.longBitsToDouble((long)1742796252 ^ 0x4000000067E0F5DCL), Class1419.Field14585.Method3626());
            }
            if (b2) {
                if (b3) {
                    Class753.drawRectWH(class1520.Method636(), class1520.Method638(), method3992, Class1419.Field14603, Class1419.Field14585.Method3626());
                    Class753.drawRectWH(class1520.Method636(), class1520.Method638() + class1520.Method632() - Class1419.Field14603, method3992, Class1419.Field14603, Class1419.Field14585.Method3626());
                }
                Class753.drawRectWH(class1520.Method636(), class1520.Method638(), Class1419.Field14603, class1520.Method632(), Class1419.Field14585.Method3626());
                Class753.drawRectWH(class1520.Method636() + method3992 - Class1419.Field14603, class1520.Method638(), Class1419.Field14603, class1520.Method632(), Class1419.Field14585.Method3626());
            }
        }
    }
    
    public static boolean Method1233(final String s) {
        return Class1796.Field16241.Field16262.Field14581.Method5954().isEmpty() || s.toLowerCase().contains(Class1796.Field16241.Field16262.Field14581.Method5954().toLowerCase());
    }
    
    public static boolean Method1234(final Class337 class337) {
        if (Class1796.Field16241.Field16262.Field14581.Method5954().isEmpty()) {
            return true;
        }
        final Iterator<Class1520> iterator = class337.Method1669().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().Method641()) {
                return true;
            }
        }
        return false;
    }
    
    static {
        Field14606 = 120;
        Class1419.Field14582 = Class2028.Field17333;
        Class1419.Field14583 = new Class2027(Color.RED);
        Class1419.Field14584 = new Class2027(30, 30, 30, 121);
        Class1419.Field14585 = new Class2027(Color.BLACK);
        Class1419.Field14586 = new Class2027(30, 30, 30, 121);
        Class1419.Field14587 = new Class2027(255, 255, 255, 60);
        Class1419.Field14588 = true;
        Class1419.Field14589 = true;
        Class1419.Field14590 = true;
        Class1419.Field14591 = false;
        Class1419.Field14592 = true;
        Class1419.Field14593 = false;
        Class1419.Field14594 = true;
        Class1419.Field14595 = false;
        Class1419.Field14596 = true;
        Class1419.Field14597 = true;
        Class1419.Field14598 = false;
        Class1419.Field14599 = 0;
        Class1419.Field14600 = 5;
        Class1419.Field14601 = 0.0;
        Class1419.Field14602 = 0.0;
        Class1419.Field14603 = 1.0;
        Class1419.Field14604 = null.Field16085.Method335();
        Class1419.Field14605 = null.Field16086.Method335();
        Class1419.Field14610 = null;
        Class1419.Field14611 = -1;
        Class1419.Field14612 = -1;
    }
    
    private static String Method1235(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3E03 ^ 0xC3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
