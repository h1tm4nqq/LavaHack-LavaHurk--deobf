//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.bswyLzHpeAZv7X9IKxiqd0ExgIBOww74;
import lavahack.client.im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;

public class qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J
implements im1xE6GdaECDr1Bz5yXpFIa9aY3EJSGz {
    protected static Minecraft Field13656 = Minecraft.getMinecraft();
    public boolean Field13657 = (int)55972714L ^ 0x356136A;
    private double Field13658 = 0.0;
    private double Field13659 = 0.0;
    private double Field13660 = 0.0;
    private double Field13661 = 0.0;
    private String Field13662 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2(String string, String string2) {
        super(string, string2, qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    public qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2(String string, String string2, boolean bl) {
        this(string, string2);
        this.Field13657 = bl;
    }

    public qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2(String string) {
        this(string, "");
    }

    public qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2(String string, boolean bl) {
        this(string);
        this.Field13657 = bl;
    }

    @Override
    public double Method267() {
        return this.Field13658;
    }

    @Override
    public void Method271(double d) {
        this.Field13658 = d;
    }

    @Override
    public double Method268() {
        return this.Field13659;
    }

    @Override
    public void Method272(double d) {
        this.Field13659 = d;
    }

    @Override
    public double Method269() {
        return this.Field13660;
    }

    @Override
    public void Method273(double d) {
        this.Field13660 = d;
    }

    @Override
    public double Method270() {
        return this.Field13661;
    }

    @Override
    public void Method274(double d) {
        this.Field13661 = d;
    }

    protected bswyLzHpeAZv7X9IKxiqd0ExgIBOww74 Method275() {
        return new bswyLzHpeAZv7X9IKxiqd0ExgIBOww74(this).Method2149().Method2150();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1210051285L ^ 0x481FEAD5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1350685205L ^ 0xAF7E2D14);
            int n2 = (int)-260782231L ^ 0xF074C7C6;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1287733791 ^ (long)-1287733448) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

