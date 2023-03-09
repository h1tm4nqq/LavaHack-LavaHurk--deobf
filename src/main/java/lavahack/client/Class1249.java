//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class451;
import lavahack.client.Class732;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

public class Class1249
extends Class42
implements Class732 {
    protected static Minecraft Field13656 = Minecraft.getMinecraft();
    public boolean Field13657 = false;
    private double Field13658 = 0.0;
    private double Field13659 = 0.0;
    private double Field13660 = 0.0;
    private double Field13661 = 0.0;
    private String Field13662 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1249(String string, String string2) {
        super(string, string2, Class97.Field8342);
    }

    public Class1249(String string, String string2, boolean bl) {
        this(string, string2);
        this.Field13657 = bl;
    }

    public Class1249(String string) {
        this(string, "");
    }

    public Class1249(String string, boolean bl) {
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

    protected Class451 Method275() {
        return new Class451(this).Method2149().Method2150();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 175;
            cArray2[n] = (char)(cArray[n] ^ (0x16C8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

