//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import lavahack.client.Class1178;
import lavahack.client.Class1233;
import lavahack.client.Class1487;
import lavahack.client.Class1520;
import lavahack.client.Class1780;
import lavahack.client.Class1796;
import lavahack.client.Class1882;
import lavahack.client.Class1888;
import lavahack.client.Class2028;
import lavahack.client.Class337;
import lavahack.client.Class354;
import lavahack.client.Class753;
import lavahack.client.Class754;
import lavahack.client.Class97;
import lavahack.client.Class981;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class Class1419
extends Class1888 {
    public Class1487 Field14581 = new Class1487();
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
    public final ArrayList Field14607 = new ArrayList();
    public Class1882 Field14608 = new Class1882();
    private GuiScreen Field14609 = null;
    public static Class1520 Field14610;
    public static int Field14611;
    public static int Field14612;
    private String Field14613 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1419(GuiScreen guiScreen) {
        this();
        this.Field14609 = guiScreen;
    }

    public Class1419 Method1218(GuiScreen guiScreen) {
        this.Field14609 = guiScreen;
        return this;
    }

    public Class1419(GuiScreen guiScreen, boolean bl) {
        this(bl);
        this.Method1218(guiScreen);
    }

    public Class1419(boolean bl) {
    }

    public Class1419() {
        this(true);
        int n = 0;
        Class97[] class97Array = Class97.values();
        int n2 = class97Array.length;
        int n3 = 0;
        while (n3 < n2) {
            Class97 class97 = class97Array[n3];
            this.Field14607.add(new Class354(class97, n, 17));
            n += Field14605 * 2 + 120 - 1 - 1 - 1 - 1 - 1 - 1 - 1;
            ++n3;
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
    public void drawScreen(int n, int n2, float f) {
        if (Class1796.Field16241.Field16267.Method1968() != this.Method1220()) {
            Class754.Field11206.Method2058(Class1796.Field16241.Field16267);
            return;
        }
        Field14611 = n;
        Field14612 = n2;
        Field14583 = null.Field16081.Method339();
        Field14588 = null.Field16082.Method365();
        Field14604 = null.Field16085.Method335();
        Field14605 = null.Field16086.Method335();
        Field14590 = null.Field16087.Method365();
        Field14591 = null.Field16088.Method365();
        Field14592 = null.Field16090.Method365();
        Field14593 = null.Field16092.Method365();
        Field14589 = null.Field16091.Method365();
        Field14599 = null.Field11794.Method335();
        Field14601 = null.Field16093.Method367();
        Field14602 = null.Field16094.Method367();
        Field14582 = (Class2028)null.Field16095.Method341();
        Field14594 = null.Field16096.Method365();
        Field14586 = null.Field16097.Method339();
        Field14600 = null.Field16099.Method335();
        Field14585 = null.Field16101.Method339();
        Field14596 = null.Field16102.Method365();
        Field14597 = null.Field16104.Method365();
        Field14598 = null.Field16103.Method365();
        Field14595 = null.Field16105.Method365();
        Field14603 = null.Field16106.Method367();
        Field14587 = null.Field16084.Method339();
        Field14584 = !Field14588 ? new Class2027(0, 0, 0, 0) : null.Field16083.Method339();
        this.drawDefaultBackground();
        if (null.Field11790.Method365()) {
            this.Field14608.Method6979(10);
            this.Field14608.Method6984();
            this.Field14608.Method6985();
        }
        Class1796.Field16241.Field16268.Method5122(n, n2);
        this.Method1229();
        for (Class354 class354 : this.Field14607) {
            if (class354.Field9472) continue;
            class354.Method67(n, n2);
            if (class354.Field9474) {
                for (Class1520 class1520 : class354.Field9465) {
                    if (!class1520.Method641()) continue;
                    class1520.Method627(class354.Field9469, class354.Field9470);
                    class1520.Method623(n, n2);
                }
            }
            class354.Method69(n, n2);
            class354.Method72();
        }
        Iterator iterator = this.Field14607.iterator();
        while (true) {
            Class354 class354;
            if (!iterator.hasNext()) {
                this.drawSelectionBar(n, n2);
                return;
            }
            class354 = (Class354)iterator.next();
            if (class354.Field9472) continue;
            class354.Method70(n, n2);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void keyTyped(char var1_1, int var2_2) {
        if (var2_2 == 1) {
            this.mc.displayGuiScreen(this.Field14609 == null ? null : this.Field14609);
        }
        super.keyTyped(var1_1, var2_2);
        var3_3 = this.Field14607.iterator();
        block0: while (true) {
            if (var3_3.hasNext() == false) return;
            var4_4 = (Class354)var3_3.next();
            if (!var4_4.Field9474 || var2_2 == 1 || var4_4.Field9465.isEmpty() || var4_4.Field9472) continue;
            var5_5 = var4_4.Field9465.iterator();
            while (true) {
                if (var5_5.hasNext()) ** break;
                continue block0;
                var6_6 = (Class1520)var5_5.next();
                if (!var6_6.Method641()) continue;
                var6_6.Method628(var1_1, var2_2);
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mouseClicked(int var1_1, int var2_2, int var3_3) {
        super.mouseClicked(var1_1, var2_2, var3_3);
        var4_4 = this.Field14607.iterator();
        block0: while (true) {
            if (var4_4.hasNext() == false) return;
            var5_5 = (Class354)var4_4.next();
            if (var5_5.Field9472) continue;
            if (var5_5.Method73(var1_1, var2_2)) {
                if (var3_3 == 0) {
                    var5_5.Field9473 = true;
                    var5_5.Field9475 = var1_1 - var5_5.Field9469;
                    var5_5.Field9476 = var2_2 - var5_5.Field9470;
                } else if (var3_3 == 1) {
                    v0 = var5_5.Field9474 = var5_5.Field9474 == false;
                }
            }
            if (!var5_5.Field9474 || var5_5.Field9465.isEmpty()) continue;
            var6_6 = var5_5.Field9465.iterator();
            while (true) {
                if (var6_6.hasNext()) ** break;
                continue block0;
                var7_7 = (Class1520)var6_6.next();
                if (!var7_7.Method641()) continue;
                var7_7.Method625(var1_1, var2_2, var3_3);
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void Method1221(int var1_1, int var2_2, int var3_3) {
        var4_4 = this.Field14607.iterator();
        block0: while (true) {
            if (var4_4.hasNext() == false) return;
            var5_5 = (Class354)var4_4.next();
            if (var5_5.Field9472) continue;
            var5_5.Field9473 = false;
            if (!var5_5.Field9474 || var5_5.Field9465.isEmpty()) continue;
            var6_6 = var5_5.Field9465.iterator();
            while (true) {
                if (var6_6.hasNext()) ** break;
                continue block0;
                var7_7 = (Class1520)var6_6.next();
                if (!var7_7.Method641()) continue;
                var7_7.Method626(var1_1, var2_2, var3_3);
            }
            break;
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

    public static void Method1224(String string, int n, int n2, int n3, int n4) {
        if (Field14610 != null && Field14611 > n && Field14611 < n + n3 && Field14612 > n2 && Field14612 < n2 + n4) {
            Class753.drawRectWH((double)n + Field14601, (double)n2 + Field14602, (double)n3 - Field14601 * Double.longBitsToDouble(0x4000000000000000L), (double)n4 - Field14602 * Double.longBitsToDouble((long)779893790 ^ 0x400000002E7C3C1EL), Field14587.Method3626());
        }
        switch (Class1780.Field16161[Field14582.ordinal()]) {
            case 1: {
                Class1178.Method4746(string, (double)n + (double)n3 / Double.longBitsToDouble((long)56614627 ^ 0x40000000035FDEE3L), (double)n2 + (double)n4 / Double.longBitsToDouble((long)687288008 ^ 0x4000000028F72EC8L) - (double)Class1178.Method4748() / Double.longBitsToDouble(0x4000000000000000L), -1);
                return;
            }
            case 2: {
                Class1178.Method4745(string, n + Field14600, (double)n2 + (double)n4 / Double.longBitsToDouble(0x4000000000000000L) - (double)Class1178.Method4748() / Double.longBitsToDouble(0x4000000000000000L), -1);
                return;
            }
        }
    }

    public static void Method1225(String string, String string2, double d, double d2, double d3, double d4, Class2027 class2027, int n) {
        GL11.glPushMatrix();
        GL11.glScaled((double)Double.longBitsToDouble(4602678819172646912L), (double)Double.longBitsToDouble(4602678819172646912L), (double)1.0);
        switch (Class1780.Field16161[Field14582.ordinal()]) {
            case 1: {
                switch (n) {
                    case 1: {
                        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, (float)(d + d3 / Double.longBitsToDouble((long)221836211 ^ 0x400000000D38F3B3L) + (double)Class1178.Method4741(string2)), (float)d2 * 2.0f, class2027.Method3626());
                        break;
                    }
                    case 2: {
                        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, (float)(d + d3 / Double.longBitsToDouble(0x4000000000000000L) + (double)Class1178.Method4741(string2)), (float)(d2 + d4 / Double.longBitsToDouble(0x4000000000000000L) - (double)((float)Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f / 2.0f)) * 2.0f, class2027.Method3626());
                        break;
                    }
                    case 3: {
                        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, (float)(d + d3 / Double.longBitsToDouble((long)175910276 ^ 0x400000000A7C2D84L) + (double)Class1178.Method4741(string2)), (float)(d2 + d4 - (double)((float)Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f)) * 2.0f, class2027.Method3626());
                        break;
                    }
                }
                break;
            }
            case 2: {
                switch (n) {
                    case 1: {
                        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, (float)(d + (double)Class1178.Method4741(string2) + (double)Field14600) * 2.0f, (float)d2 * 2.0f, class2027.Method3626());
                        break;
                    }
                    case 2: {
                        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, (float)(d + (double)Class1178.Method4741(string2) + (double)Field14600) * 2.0f, (float)(d2 + d4 / Double.longBitsToDouble((long)62608383 ^ 0x4000000003BB53FFL) - (double)((float)Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f / 2.0f)) * 2.0f, class2027.Method3626());
                        break;
                    }
                    case 3: {
                        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(string, (float)(d + (double)Class1178.Method4741(string2) + (double)Field14600) * 2.0f, (float)(d2 + d4 - (double)((float)Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT / 2.0f)) * 2.0f, class2027.Method3626());
                    }
                }
                break;
            }
        }
        GL11.glPopMatrix();
    }

    public static void Method1226(String string, String string2, double d, double d2, double d3, double d4, int n, int n2) {
        Class1419.Method1225(string, string2, d, d2, d3, d4, Class1419.Method1228(n), n2);
    }

    public static void Method1227(String string, int n, int n2, int n3, int n4) {
        Class1178.Method4746(string, (double)n + (double)n3 / Double.longBitsToDouble(0x4000000000000000L), (double)n2 + (double)n4 / Double.longBitsToDouble((long)1000017347 ^ 0x400000003B9B0DC3L) - (double)Class1178.Method4748() / Double.longBitsToDouble(0x4000000000000000L), -1);
    }

    public static Class2027 Method1228(int n) {
        String string = null.Field11793.Method359();
        int n2 = -1;
        switch (string.hashCode()) {
            case 2433880: {
                if (!string.equals("None")) return Field14583;
                n2 = 0;
                return Field14583;
            }
            case -1656737386: {
                if (!string.equals("Rainbow")) return Field14583;
                n2 = 1;
                return Field14583;
            }
            case 961091784: {
                if (!string.equals("Astolfo")) return Field14583;
                n2 = 2;
                return Field14583;
            }
            case 1438732012: {
                if (!string.equals("Pulsive")) return Field14583;
                n2 = 3;
                return Field14583;
            }
        }
        return Field14583;
    }

    private void Method1229() {
        int n = Mouse.getDWheel();
        if (n < 0) {
            Iterator iterator = this.Field14607.iterator();
            while (iterator.hasNext()) {
                Class354 class354 = (Class354)iterator.next();
                if (class354.Field9472) continue;
                if (null.Field11783.Method365() && Keyboard.getEventKeyState() && Keyboard.getEventKey() == null.Field11784.Method337()) {
                    class354.Field9469 -= (int)null.Field11782.Method367();
                    continue;
                }
                class354.Field9470 -= (int)null.Field11782.Method367();
            }
            return;
        }
        if (n <= 0) return;
        Iterator iterator = this.Field14607.iterator();
        while (iterator.hasNext()) {
            Class354 class354 = (Class354)iterator.next();
            if (class354.Field9472) continue;
            if (null.Field11783.Method365() && Keyboard.getEventKeyState() && Keyboard.getEventKey() == null.Field11784.Method337()) {
                class354.Field9469 += (int)null.Field11782.Method367();
                continue;
            }
            class354.Field9470 += (int)null.Field11782.Method367();
        }
    }

    public static void Method1230(Class1520 class1520) {
        if (!class1520.Method641()) {
            return;
        }
        if (Field14589) {
            Class753.drawRectWH(class1520.Method636(), class1520.Method638(), 1.0, class1520.Method632(), Class1419.Method1228(class1520.Method633()).Method3626());
            Class753.drawRectWH(class1520.Method636() + Class981.Method3992(class1520.Method640(), 120) - 1, class1520.Method638(), 1.0, class1520.Method632(), Class1419.Method1228(class1520.Method633()).Method3626());
        }
        if (!(class1520 instanceof Class337)) return;
        Class337 class337 = (Class337)class1520;
        if (!Field14592) return;
        if (!class337.Method1668()) return;
        if (class337.Method1669().isEmpty()) return;
        Class753.drawRectWH(class1520.Method636(), class1520.Method638() + class1520.Method632(), Class981.Method3992(class1520.Method640(), 120), 1.0, Class1419.Method1228(((Class1520)class337.Method1669().get(0)).Method633()).Method3626());
        int n = Class1419.Method1231(class337.Method1669(), 0);
        Class753.drawRectWH(class1520.Method636(), class1520.Method638() + class1520.Method632() + n - 1, Class981.Method3992(class1520.Method640(), 120), 1.0, Class1419.Method1228(((Class1520)class337.Method1669().get(class337.Method1669().size() - 1)).Method633()).Method3626());
    }

    public static int Method1231(ArrayList arrayList, int n) {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Class337 class337;
            Class1520 class1520 = (Class1520)iterator.next();
            if (!class1520.Method641()) continue;
            n += class1520.Method631();
            if (!(class1520 instanceof Class337) || !(class337 = (Class337)class1520).Method1668()) continue;
            n = Class1419.Method1231(class337.Method1669(), n);
        }
        return n;
    }

    public static void Method1232(Class1520 class1520, boolean bl, boolean bl2, boolean bl3) {
        if (!Field14595) return;
        int n = Class981.Method3992(class1520.Method640(), 120);
        if (!bl3 && (Field14601 > 0.0 || Field14602 > 0.0 || !bl)) {
            double d = (double)n - Field14601 * Double.longBitsToDouble((long)923234345 ^ 0x4000000037077029L);
            Class753.drawRectWH((double)class1520.Method636() + Field14601, (double)class1520.Method638() + Field14602, d, Field14603, Field14585.Method3626());
            Class753.drawRectWH((double)class1520.Method636() + Field14601, (double)class1520.Method638() + Field14602 + (double)class1520.Method632() - Field14602 * Double.longBitsToDouble((long)1636578086 ^ 0x40000000618C3326L) - Field14603, d, Field14603, Field14585.Method3626());
            Class753.drawRectWH((double)class1520.Method636() + Field14601, (double)class1520.Method638() + Field14602, Field14603, (double)class1520.Method632() - Field14602 * Double.longBitsToDouble(0x4000000000000000L), Field14585.Method3626());
            Class753.drawRectWH((double)class1520.Method636() + Field14601 + d - Field14603, (double)class1520.Method638() + Field14602, Field14603, (double)class1520.Method632() - Field14602 * Double.longBitsToDouble((long)1742796252 ^ 0x4000000067E0F5DCL), Field14585.Method3626());
        }
        if (!bl2) return;
        if (bl3) {
            Class753.drawRectWH(class1520.Method636(), class1520.Method638(), n, Field14603, Field14585.Method3626());
            Class753.drawRectWH(class1520.Method636(), (double)(class1520.Method638() + class1520.Method632()) - Field14603, n, Field14603, Field14585.Method3626());
        }
        Class753.drawRectWH(class1520.Method636(), class1520.Method638(), Field14603, class1520.Method632(), Field14585.Method3626());
        Class753.drawRectWH((double)(class1520.Method636() + n) - Field14603, class1520.Method638(), Field14603, class1520.Method632(), Field14585.Method3626());
    }

    public static boolean Method1233(String string) {
        if (Class1796.Field16241.Field16262.Field14581.Method5954().isEmpty()) return true;
        if (string.toLowerCase().contains(Class1796.Field16241.Field16262.Field14581.Method5954().toLowerCase())) return true;
        return false;
    }

    public static boolean Method1234(Class337 class337) {
        Class1520 class1520;
        if (Class1796.Field16241.Field16262.Field14581.Method5954().isEmpty()) {
            return true;
        }
        Iterator iterator = class337.Method1669().iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!(class1520 = (Class1520)iterator.next()).Method641());
        return true;
    }

    static {
        Field14606 = 120;
        Field14582 = Class2028.Field17333;
        Field14583 = new Class2027(Color.RED);
        Field14584 = new Class2027(30, 30, 30, 121);
        Field14585 = new Class2027(Color.BLACK);
        Field14586 = new Class2027(30, 30, 30, 121);
        Field14587 = new Class2027(255, 255, 255, 60);
        Field14588 = true;
        Field14589 = true;
        Field14590 = true;
        Field14591 = false;
        Field14592 = true;
        Field14593 = false;
        Field14594 = true;
        Field14595 = false;
        Field14596 = true;
        Field14597 = true;
        Field14598 = false;
        Field14599 = 0;
        Field14600 = 5;
        Field14601 = 0.0;
        Field14602 = 0.0;
        Field14603 = 1.0;
        Field14604 = null.Field16085.Method335();
        Field14605 = null.Field16086.Method335();
        Field14610 = null;
        Field14611 = -1;
        Field14612 = -1;
    }

    private static String Method1235(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 195;
            cArray2[n] = (char)(cArray[n] ^ (0x3E03 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

