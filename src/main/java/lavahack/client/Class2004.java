//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Point;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import lavahack.client.Class1039;
import lavahack.client.Class1233;
import lavahack.client.Class1256;
import lavahack.client.Class13;
import lavahack.client.Class1461;
import lavahack.client.Class1494;
import lavahack.client.Class1514;
import lavahack.client.Class1537;
import lavahack.client.Class159;
import lavahack.client.Class1623;
import lavahack.client.Class1645;
import lavahack.client.Class1796;
import lavahack.client.Class1803;
import lavahack.client.Class1876;
import lavahack.client.Class1882;
import lavahack.client.Class1888;
import lavahack.client.Class2006;
import lavahack.client.Class2024;
import lavahack.client.Class2133;
import lavahack.client.Class315;
import lavahack.client.Class383;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class467;
import lavahack.client.Class532;
import lavahack.client.Class548;
import lavahack.client.Class754;
import lavahack.client.Class789;
import lavahack.client.Class79;
import lavahack.client.Class790;
import lavahack.client.Class97;
import lavahack.client.Class994;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class Class2004
extends Class1888 {
    private final HashMap Field17188;
    private final Class1803 Field17189;
    private Class1039 Field17190;
    private Class1494 Field17191;
    private Class1876 Field17192;
    private Class1882 Field17193;
    private List Field17194 = new ArrayList<E>();
    private String Field17195 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Class2004() {
        super();
        this.Field17193 = new Class1882();
        this.Field17188 = new HashMap<K, V>();
        this.Field17192 = new Class548();
        this.Field17189 = new Class1803(this.Field17192, new Class1537(1));
        this.Field17190 = new Class1039(Class1796.Method6783(), 50, 50, 920, 420);
        this.Field17191 = new Class1494("Visual Preview", 940, 50, 200, 280);
        var1_1 = new Class2024(this.Field17192, new Class1537(1));
        var2_2 = new Class1803(this.Field17192, new Class13());
        var3_3 = new HashMap<Class97, Class1803>();
        var4_4 = new ArrayList<Object>();
        var5_5 = new ArrayList<Class1803>();
        var6_6 = Class97.values();
        var7_8 = var6_6.length;
        var8_10 = 0;
        block5: while (true) {
            block20: {
                block19: {
                    if (var8_10 >= var7_8) break block19;
                    var9_13 = var6_6[var8_10];
                    if (var9_13 == Class97.Field8347) ** GOTO lbl90
                    break block20;
                }
                var1_1.Method6815(var2_2);
                var6_7 = -2147483648;
                for (Class1803 var8_11 : var5_5) {
                    var6_7 = Math.max(var6_7, var8_11.Method675());
                }
                this.Field17190.Method4245(28 + var6_7);
                var7_9 = var4_4.iterator();
                while (true) {
                    if (!var7_9.hasNext()) {
                        this.Field17189.Method676(var6_7);
                        var2_2.Method676(var6_7);
                        var1_1.Method6815(this.Field17189);
                        var1_1.Method6813();
                        this.Field17190.Method4237(var1_1);
                        if (this.Field17188.keySet().size() <= 0) return;
                        this.Method7428((Class97)this.Field17188.keySet().iterator().next());
                        return;
                    }
                    var8_12 = (Class532)var7_9.next();
                    var8_12.Field10244 = var6_7;
                    var8_12.Method676(var6_7);
                }
            }
            var10_14 = Class1796.Field16241.Field16254.Method1164(var9_13);
            var11_15 = new Class1803(this.Field17192, new Class1537(1));
            var12_16 = new Class2006(this.Field17192, var9_13.Method807() + (null.Field11805.Method365() != false ? " [" + var10_14.size() + "]" : ""));
            var2_2.Method6815(var12_16);
            var12_16.Method690((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7451(lavahack.client.Class97 ), ()V)((Class2004)this, (Class97)var9_13));
            var13_17 = var10_14.iterator();
            while (true) {
                block22: {
                    block23: {
                        block21: {
                            if (!var13_17.hasNext()) break block21;
                            var14_18 = (Class42)var13_17.next();
                            var15_19 = new Class1803(this.Field17192, new Class1537(4));
                            var16_20 = 0;
                            var15_19.Method6815(new Class315(this.Field17192, "Toggle"));
                            var17_21 = new Class1461(this.Field17192, "Toggled");
                            var15_19.Method6815((Class1514)var17_21);
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7450(lavahack.client.Class1461 lavahack.client.Class42 ), ()V)((Class1461)var17_21, (Class42)var14_18));
                            var17_21.Method5889((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7449(lavahack.client.Class42 java.lang.Boolean ), (Ljava/lang/Boolean;)Z)((Class42)var14_18));
                            var16_20 += 2;
                            var15_19.Method6815(new Class315(this.Field17192, "Keybind"));
                            var17_21 = new Class79(this.Field17192, (Function<Integer, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getKeyName(int ), (Ljava/lang/Integer;)Ljava/lang/String;)());
                            var15_19.Method6815((Class1514)var17_21);
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7448(lavahack.client.Class79 lavahack.client.Class42 ), ()V)((Class79)var17_21, (Class42)var14_18));
                            var17_21.Method699((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7447(lavahack.client.Class42 java.lang.Integer ), (Ljava/lang/Integer;)Z)((Class42)var14_18));
                            var16_20 += 2;
                            var15_19.Method6815(new Class315(this.Field17192, "Visible"));
                            var17_21 = new Class1461(this.Field17192, "Visibled");
                            var15_19.Method6815((Class1514)var17_21);
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7446(lavahack.client.Class1461 lavahack.client.Class42 ), ()V)((Class1461)var17_21, (Class42)var14_18));
                            var17_21.Method5889((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7445(lavahack.client.Class42 java.lang.Boolean ), (Ljava/lang/Boolean;)Z)((Class42)var14_18));
                            var16_20 += 2;
                            var15_19.Method6815(new Class315(this.Field17192, "Bind Mode"));
                            var17_21 = new Class2133(this.Field17192, new String[]{"Toggle", "Hold"}, var14_18.Field8065 != false ? 1 : 0);
                            var15_19.Method6815((Class1514)var17_21);
                            var17_21.Method7676((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7444(lavahack.client.Class42 java.lang.Integer ), (Ljava/lang/Integer;)Z)((Class42)var14_18));
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7443(lavahack.client.Class2133 lavahack.client.Class42 ), ()V)((Class2133)var17_21, (Class42)var14_18));
                            var16_20 += 2;
                            if (Class1796.Field16241.Field16258.Method7571(var14_18) == null || Class1796.Field16241.Field16258.Method7571(var14_18).isEmpty()) break block22;
                            var17_21 = Class1796.Field16241.Field16258.Method7571(var14_18).iterator();
                            break block23;
                        }
                        this.Field17188.put(var9_13, var11_15);
lbl90:
                        // 2 sources

                        ++var8_10;
                        continue block5;
                    }
                    while (var17_21.hasNext()) {
                        var18_22 = (Class44)var17_21.next();
                        if (var18_22.Method388()) {
                            var19_23 /* !! */  = var18_22.Method354();
                            if (var16_20 % 4 != 0) {
                                var20_24 = var16_20 % 4;
                                for (var21_26 = 0; var21_26 < 4 - var20_24; ++var16_20, ++var21_26) {
                                    var15_19.Method6815(new Class1623(this.Field17192));
                                }
                            }
                            var15_19.Method6815(new Class383(this.Field17192, (String)var19_23 /* !! */ ));
                            var15_19.Method6815(new Class1623(this.Field17192));
                            var15_19.Method6815(new Class1623(this.Field17192));
                            var15_19.Method6815(new Class1623(this.Field17192));
                            var16_20 += 4;
                        }
                        if (var18_22.Method380()) {
                            var15_19.Method6815(new Class315(this.Field17192, var18_22.Method356()));
                            var19_23 /* !! */  = new Class79(this.Field17192, (Function<Integer, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getKeyName(int ), (Ljava/lang/Integer;)Ljava/lang/String;)());
                            var15_19.Method6815((Class1514)var19_23 /* !! */ );
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7442(lavahack.client.Class79 lavahack.client.Class44 ), ()V)((Class79)var19_23 /* !! */ , (Class44)var18_22));
                            var19_23 /* !! */ .Method699((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7441(lavahack.client.Class44 java.lang.Integer ), (Ljava/lang/Integer;)Z)((Class44)var18_22));
                            var16_20 += 2;
                        }
                        if (var18_22.Method389()) {
                            var15_19.Method6815(new Class315(this.Field17192, var18_22.Method354()));
                            var19_23 /* !! */  = new Class789(this.Field17192, var18_22.Method339());
                            var15_19.Method6815((Class1514)var19_23 /* !! */ );
                            var19_23 /* !! */ .Method3292((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7440(lavahack.client.Class44 com.kisman.cc.util.Class2027 ), (Lcom/kisman/cc/util/vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;)Z)((Class44)var18_22));
                            var19_23 /* !! */ .Method3293((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7439(lavahack.client.Class44 java.lang.Boolean ), (Ljava/lang/Boolean;)Z)((Class44)var18_22));
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7438(lavahack.client.Class789 lavahack.client.Class44 ), ()V)((Class789)var19_23 /* !! */ , (Class44)var18_22));
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7437(lavahack.client.Class789 lavahack.client.Class44 ), ()V)((Class789)var19_23 /* !! */ , (Class44)var18_22));
                            var16_20 += 2;
                        }
                        if (var18_22.Method383()) {
                            var15_19.Method6815(new Class315(this.Field17192, var18_22.Method356()));
                            var19_23 /* !! */  = new Class1256(this.Field17192, var18_22.Method343());
                            var15_19.Method6815((Class1514)var19_23 /* !! */ );
                            var19_23 /* !! */ .Method5075((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7436(lavahack.client.Class44 java.lang.String ), (Ljava/lang/String;)Z)((Class44)var18_22));
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7435(lavahack.client.Class1256 lavahack.client.Class44 ), ()V)((Class1256)var19_23 /* !! */ , (Class44)var18_22));
                            var16_20 += 2;
                        }
                        if (var18_22.Method386()) {
                            var15_19.Method6815(new Class315(this.Field17192, var18_22.Method356()));
                            var19_23 /* !! */  = new Class1461(this.Field17192, "Enabled");
                            var15_19.Method6815((Class1514)var19_23 /* !! */ );
                            var19_23 /* !! */ .Method5889((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7434(lavahack.client.Class44 java.lang.Boolean ), (Ljava/lang/Boolean;)Z)((Class44)var18_22));
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7433(lavahack.client.Class1461 lavahack.client.Class44 ), ()V)((Class1461)var19_23 /* !! */ , (Class44)var18_22));
                            var16_20 += 2;
                        }
                        if (var18_22.Method387()) {
                            var15_19.Method6815(new Class315(this.Field17192, var18_22.Method356()));
                            var19_23 /* !! */  = Class467.Field9944;
                            switch (Class159.Field8625[var18_22.Method320().ordinal()]) {
                                case 1: {
                                    if (!var18_22.Method319()) break;
                                    var19_23 /* !! */  = Class467.Field9945;
                                    break;
                                }
                                case 2: {
                                    if (var18_22.Method371() != 0.0 || var18_22.Method372() != Double.longBitsToDouble(4636737291354636288L)) break;
                                    var19_23 /* !! */  = Class467.Field9942;
                                    break;
                                }
                                case 3: {
                                    var19_23 /* !! */  = Class467.Field9943;
                                    break;
                                }
                            }
                            var20_25 = new Class1645(this.Field17192, var18_22.Method367(), var18_22.Method371(), var18_22.Method372(), (Class467)var19_23 /* !! */ );
                            var15_19.Method6815(var20_25);
                            var20_25.Method6387((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7432(lavahack.client.Class44 java.lang.Number ), (Ljava/lang/Number;)Z)((Class44)var18_22));
                            this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7431(lavahack.client.Class1645 lavahack.client.Class44 ), ()V)((Class1645)var20_25, (Class44)var18_22));
                            var16_20 += 2;
                        }
                        if (!var18_22.Method385()) continue;
                        var15_19.Method6815(new Class315(this.Field17192, var18_22.Method356()));
                        var19_23 /* !! */  = new Class2133(this.Field17192, var18_22.Method315(), var18_22.Method318());
                        var15_19.Method6815((Class1514)var19_23 /* !! */ );
                        var19_23 /* !! */ .Method7676((Class994)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, Method7430(lavahack.client.Class44 java.lang.Integer ), (Ljava/lang/Integer;)Z)((Class44)var18_22));
                        this.Field17194.add((Class790)LambdaMetafactory.metafactory(null, null, null, ()V, Method7429(lavahack.client.Class2133 lavahack.client.Class44 ), ()V)((Class2133)var19_23 /* !! */ , (Class44)var18_22));
                        var16_20 += 2;
                    }
                }
                var17_21 = new Class532(this.Field17192, var14_18.Method40(), this.width, var15_19, var14_18);
                var5_5.add(var15_19);
                var4_4.add(var17_21);
                var11_15.Method6815((Class1514)var17_21);
                var3_3.put(var9_13, var11_15);
            }
            break;
        }
    }

    @Override
    public void initGui() {
        super.initGui();
        this.Field17193 = new Class1882();
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
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
        for (Class790 class790 : this.Field17194) {
            class790.Method3300();
        }
        this.Field17190.Method4249(Class1796.Method6783() + " | " + Class1796.Method6785() + (null.Field11805.Method365() ? " | " + Class1796.Field16241.Field16254.Field8854.size() + " modules" : ""));
        GL11.glPushMatrix();
        Point point = Class447.Method2102();
        this.Field17190.Method4235(point.x * 2, point.y * 2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5980(point.x * 2, point.y * 2);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glLineWidth((float)1.0f);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        this.Field17190.Method4230(this.Field17192, n, n2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5974(this.Field17192, n, n2);
        }
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glPopMatrix();
        this.Field17190.Method4231(this.Field17192);
        super.drawScreen(n, n2, f);
    }

    public void Method7424() {
        this.mc.entityRenderer.getShaderGroup().deleteShaderGroup();
        super.onGuiClosed();
    }

    @Override
    public void mouseClicked(int n, int n2, int n3) {
        this.Field17190.Method4235(n * 2, n2 * 2);
        this.Field17190.Method4232(n3, n * 2, n2 * 2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5980(n * 2, n2 * 2);
            this.Field17191.Method5977(n3, n * 2, n2 * 2);
        }
        super.mouseClicked(n, n2, n3);
    }

    public void Method7425(int n, int n2, int n3) {
        this.Field17190.Method4235(n * 2, n2 * 2);
        this.Field17190.Method4234(n3, n * 2, n2 * 2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5980(n * 2, n2 * 2);
            this.Field17191.Method5979(n3, n * 2, n2 * 2);
        }
        super.mouseReleased(n, n2, n3);
    }

    public void Method7426(int n, int n2, int n3, long l) {
        this.Field17190.Method4235(n * 2, n2 * 2);
        if (null.Field11808.Method365()) {
            this.Field17191.Method5980(n * 2, n2 * 2);
        }
        super.mouseClickMove(n, n2, n3, l);
    }

    public void Method7427() throws IOException {
        super.handleMouseInput();
        int n = Mouse.getEventDWheel();
        this.Field17190.Method4239(n);
    }

    @Override
    public void keyTyped(char c, int n) {
        if (n != -1) {
            this.Field17190.Method4238(n, c);
        } else {
            this.mc.displayGuiScreen(null);
        }
        super.keyTyped(c, n);
    }

    private void Method7428(Class97 class97) {
        this.Field17189.Method6817();
        this.Field17189.Method6815((Class1514)this.Field17188.get((Object)class97));
    }

    private static /* bridge */ /* synthetic */ void Method7429(Class2133 class2133, Class44 class44) {
        class2133.Method7675(class44.Method318());
    }

    private static /* bridge */ /* synthetic */ boolean Method7430(Class44 class44, Integer n) {
        class44.Method360(class44.Method317(n));
        class44.Method353(n);
        return true;
    }

    private static /* bridge */ /* synthetic */ void Method7431(Class1645 class1645, Class44 class44) {
        class1645.Method6386(class44.Method367());
    }

    private static /* bridge */ /* synthetic */ boolean Method7432(Class44 class44, Number number) {
        class44.Method370(number.doubleValue());
        return true;
    }

    private static /* bridge */ /* synthetic */ void Method7433(Class1461 class1461, Class44 class44) {
        class1461.Method5891(class44.Method365());
    }

    private static /* bridge */ /* synthetic */ boolean Method7434(Class44 class44, Boolean bl) {
        class44.Method366(bl);
        return true;
    }

    private static /* bridge */ /* synthetic */ void Method7435(Class1256 class1256, Class44 class44) {
        class1256.Method5074(class44.Method359());
    }

    private static /* bridge */ /* synthetic */ boolean Method7436(Class44 class44, String string) {
        class44.Method360(string);
        return true;
    }

    private static /* bridge */ /* synthetic */ void Method7437(Class789 class789, Class44 class44) {
        class789.Method3290(class44.Method376());
    }

    private static /* bridge */ /* synthetic */ void Method7438(Class789 class789, Class44 class44) {
        class789.Method3291(class44.Method339());
    }

    private static /* bridge */ /* synthetic */ boolean Method7439(Class44 class44, Boolean bl) {
        class44.Method377(bl);
        return true;
    }

    private static /* bridge */ /* synthetic */ boolean Method7440(Class44 class44, Class2027 class2027) {
        class44.Method340(class2027);
        return true;
    }

    private static /* bridge */ /* synthetic */ boolean Method7441(Class44 class44, Integer n) {
        class44.Method338(n);
        return true;
    }

    private static /* bridge */ /* synthetic */ void Method7442(Class79 class79, Class44 class44) {
        class79.Method696(class44.Method337());
    }

    private static /* bridge */ /* synthetic */ void Method7443(Class2133 class2133, Class42 class42) {
        class2133.Method7675(class42.Field8065 ? 1 : 0);
    }

    private static /* bridge */ /* synthetic */ boolean Method7444(Class42 class42, Integer n) {
        class42.Field8065 = n != 0;
        return true;
    }

    private static /* bridge */ /* synthetic */ boolean Method7445(Class42 class42, Boolean bl) {
        class42.Field8064 = bl;
        return true;
    }

    private static /* bridge */ /* synthetic */ void Method7446(Class1461 class1461, Class42 class42) {
        class1461.Method5891(class42.Field8064);
    }

    private static /* bridge */ /* synthetic */ boolean Method7447(Class42 class42, Integer n) {
        class42.Method34(n);
        return true;
    }

    private static /* bridge */ /* synthetic */ void Method7448(Class79 class79, Class42 class42) {
        class79.Method696(class42.Method33());
    }

    private static /* bridge */ /* synthetic */ boolean Method7449(Class42 class42, Boolean bl) {
        class42.Method21(bl);
        return true;
    }

    private static /* bridge */ /* synthetic */ void Method7450(Class1461 class1461, Class42 class42) {
        class1461.Method5891(class42.Method35());
    }

    private void Method7451(Class97 class97) {
        this.Method7428(class97);
    }

    private static String Method7452(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 25;
            cArray2[n] = (char)(cArray[n] ^ (0x4656 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

