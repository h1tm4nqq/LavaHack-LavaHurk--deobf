//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.client.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;

public class lJZzWgHm5nePRtTvP4qd3EHBsBJOoOVM
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11535 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NoGlint", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-344754253 ^ (long)-344754253)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11536 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1524830083L ^ 0xA51CF07C) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11537 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Armor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1328817872L ^ 0x4F3426D1) != 0));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field11538 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11539 = this.Method23(this.Field11538.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1936115833 ^ (long)-1936115833))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11540 = this.Method23(this.Field11538.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0xC5EB6252AA61B5C8L ^ 0xFA3B6252AA61B5C8L), Double.longBitsToDouble((long)2129994276 ^ 0x401400007EF52224L), ((int)-1000984929L ^ 0xC4562E9F) != 0).Method313(this.Field11539::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11541 = this.Method23(this.Field11538.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Saturation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1269176810 ^ 0x405900004BA619EAL), 0.0, Double.longBitsToDouble((long)787279505 ^ 0x405900002EECEE91L), (boolean)((long)-2132899315 ^ (long)-2132899316)).Method313(this.Field11539::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11542 = this.Method23(this.Field11538.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Brightness", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)770622409 ^ 0x404900002DEEC3C9L), 0.0, Double.longBitsToDouble((long)1779399858 ^ 0x405900006A0F7CB2L), ((int)986302307L ^ 0x3AC9C762) != 0).Method313(this.Field11539::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11543 = this.Method23(this.Field11538.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)705962779 ^ (long)705962980), (int)-320528266L ^ 0xECE52089, (int)-1012199898L ^ 0xC3AB0ED9, (int)((long)1012616361 ^ (long)1012616418) << 1))));
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field11544 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method3553, new Predicate[(int)((long)-1738223190 ^ (long)-1738223190)]);
    private String Field11545 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public lJZzWgHm5nePRtTvP4qd3EHBsBJOoOVM() {
        super("EnchantGlint", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (lJZzWgHm5nePRtTvP4qd3EHBsBJOoOVM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && lJZzWgHm5nePRtTvP4qd3EHBsBJOoOVM.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field11544);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field11544);
    }

    private void Method3553(IBONRcQCNUBg2NBpVpVQf61ykmVfU03E iBONRcQCNUBg2NBpVpVQf61ykmVfU03E) {
        if (this.Field11536.Method365() && iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5369() != IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16489) {
            return;
        }
        if (this.Field11537.Method365() && iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5369() != IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16490) {
            return;
        }
        iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method158();
        if (this.Field11535.Method365()) {
            iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5371(new Color((int)54898144L ^ 0x345AD1F, (int)((long)1095045147 ^ (long)1095045348), (int)1762861995L ^ 0x69132354, (int)((long)-36686117 ^ (long)-36686117)));
            return;
        }
        Color color = this.Field11543.Method339().Method3625();
        if (this.Field11539.Method365()) {
            color = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)529568573L ^ 0x1F90933D, this.Field11541.Method335(), this.Field11542.Method335(), color.getAlpha(), this.Field11540.Method367()).Method3625();
        }
        iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5371(color);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1092534427 ^ (long)1092534427);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2056414546 ^ (long)2056414637);
            int n2 = (int)((long)-1497724861 ^ (long)-1497724878) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)754603933L ^ 0x2CFA72FA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

