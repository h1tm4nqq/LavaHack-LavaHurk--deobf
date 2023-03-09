//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class845;
import java.awt.Color;
import java.util.function.Predicate;
import lavahack.client.Class1329;
import lavahack.client.Class1796;
import lavahack.client.Class1839;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class97;

public class Class831
extends Class42 {
    private final Class44 Field11535 = this.Method23(new Class44("NoGlint", (Class42)this, false));
    private final Class44 Field11536 = this.Method23(new Class44("Items", (Class42)this, true));
    private final Class44 Field11537 = this.Method23(new Class44("Armor", (Class42)this, true));
    private final Class1996 Field11538 = this.Method24(new Class1996(new Class44("Render", this)));
    private final Class44 Field11539 = this.Method23(this.Field11538.Method7405(new Class44("Rainbow", (Class42)this, false)));
    private final Class44 Field11540 = this.Method23(this.Field11538.Method7405(new Class44("Speed", (Class42)this, 1.0, Double.longBitsToDouble(4598175219545276416L), Double.longBitsToDouble((long)2129994276 ^ 0x401400007EF52224L), false).Method313(this.Field11539::Method365)));
    private final Class44 Field11541 = this.Method23(this.Field11538.Method7405(new Class44("Saturation", (Class42)this, Double.longBitsToDouble((long)1269176810 ^ 0x405900004BA619EAL), 0.0, Double.longBitsToDouble((long)787279505 ^ 0x405900002EECEE91L), true).Method313(this.Field11539::Method365)));
    private final Class44 Field11542 = this.Method23(this.Field11538.Method7405(new Class44("Brightness", (Class42)this, Double.longBitsToDouble((long)770622409 ^ 0x404900002DEEC3C9L), 0.0, Double.longBitsToDouble((long)1779399858 ^ 0x405900006A0F7CB2L), true).Method313(this.Field11539::Method365)));
    private final Class44 Field11543 = this.Method23(this.Field11538.Method7405(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 150))));
    private final Class618 Field11544 = new Class618(this::Method3553, new Predicate[0]);
    private String Field11545 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class831() {
        super("EnchantGlint", Class97.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class831.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class831.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            Class1796.Field16242.Method706(this.Field11544);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field11544);
    }

    private void Method3553(Class1329 class1329) {
        if (this.Field11536.Method365() && class1329.Method5369() != Class1839.Field16489) {
            return;
        }
        if (this.Field11537.Method365() && class1329.Method5369() != Class1839.Field16490) {
            return;
        }
        class1329.Method158();
        if (this.Field11535.Method365()) {
            class1329.Method5371(new Color(255, 255, 255, 0));
            return;
        }
        Color color = this.Field11543.Method339().Method3625();
        if (this.Field11539.Method365()) {
            color = Class845.Method3579(0, this.Field11541.Method335(), this.Field11542.Method335(), color.getAlpha(), this.Field11540.Method367()).Method3625();
        }
        class1329.Method5371(color);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 226;
            cArray2[n] = (char)(cArray[n] ^ (0x2567 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

