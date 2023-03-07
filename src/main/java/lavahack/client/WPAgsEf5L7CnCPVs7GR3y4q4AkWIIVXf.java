//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.SwOKjgBuZ4bcevFcd16aerJXflMi80gZ;
import lavahack.client.WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;

public class WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf Field12739;
    public static int Field12740;
    public static long Field12741;
    public static final int Field12742;
    public static final double Field12743;
    public static HashMap Field12744;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12745 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rubiks Crystal", this)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12746 = this.Method23(this.Field12745.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rubiks Crystal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)437845032L ^ 0x1A18FC28) != 0)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12747 = this.Method23(this.Field12745.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rubiks Crystal Rotation Direction", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field14890).Method312(this.Field12746).Method355("Rotation Dir")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12748 = this.Method24(this.Field12745.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cubes", this))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12749 = this.Method23(this.Field12748.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rubiks Crystal Inside", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1289057654 ^ (long)-1289057653)).Method355("In")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12750 = this.Method23(this.Field12748.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rubiks Crystal Outside", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)808685921L ^ 0x30339161) != 0).Method355("Out")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12751 = this.Method23(this.Field12748.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rubiks Crystal Outside 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-874019548L ^ 0xCBE78524) != 0).Method355("Out 2")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12752 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale", this)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12753 = this.Method23(this.Field12752.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)996002785 ^ (long)996002785))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12754 = this.Method23(this.Field12752.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0x917A6417879CA0D0L ^ 0xAEC3FD8E1E05394AL), Double.longBitsToDouble(0x9B100E9BFFA9DF0L ^ 0x49B100E9BFFA9DF0L), ((int)-1594849706L ^ 0xA0F08656) != 0).Method312(this.Field12753).Method355("X")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12755 = this.Method23(this.Field12752.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0x78F14550C564EBDL ^ 0x38368DCC95CFD727L), Double.longBitsToDouble((long)1474915204 ^ 0x4000000057E96B84L), (boolean)((long)-1990381957 ^ (long)-1990381957)).Method312(this.Field12753).Method355("Y")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12756 = this.Method23(this.Field12752.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale Z", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble(0xF80FA80712FC4A06L ^ 0xC7B6319E8B65D39CL), Double.longBitsToDouble(0xA8C848E916C81D5L ^ 0x4A8C848E916C81D5L), ((int)263107561L ^ 0xFAEB3E9) != 0).Method312(this.Field12753).Method355("Z")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12757 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate", this)));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12758 = this.Method23(this.Field12757.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1016177493 ^ (long)1016177493))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12759 = this.Method23(this.Field12757.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0x5CB3B554F89CFD39L ^ 0x9CB3B554F89CFD39L), Double.longBitsToDouble((long)1141473739 ^ 0x40000000440981CBL), ((int)697190368L ^ 0x298E47E0) != 0).Method312(this.Field12758).Method355("X")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12760 = this.Method23(this.Field12757.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xA4B1F2DF7C857A78L ^ 0x64B1F2DF7C857A78L), Double.longBitsToDouble(0xD1265381D042A650L ^ 0x91265381D042A650L), ((int)-852215253L ^ 0xCD343A2B) != 0).Method312(this.Field12758).Method355("Y")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12761 = this.Method23(this.Field12757.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Translate Z", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xE1337B995D4448FCL ^ 0x21337B995D4448FCL), Double.longBitsToDouble(0x7FA1A776B88F05D7L ^ 0x3FA1A776B88F05D7L), ((int)-1772699891L ^ 0x9656BF0D) != 0).Method312(this.Field12758).Method355("Z")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12762 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Elements", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12763 = this.Method24(this.Field12762.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Base", this))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12764 = this.Method23(this.Field12763.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Base", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-566603781 ^ (long)-566603782))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12765 = this.Method23(this.Field12763.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Base Fade Out Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x2205932365F1E273L ^ 0x62C61B2365F1E273L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Fade Out")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12766 = this.Method23(this.Field12763.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Always Base", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)492474192 ^ (long)492474192)).Method312(this.Field12764).Method355("Always")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12767 = this.Method24(this.Field12762.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cubes", this))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12768 = this.Method24(this.Field12767.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inside", this))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12769 = this.Method23(this.Field12768.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inside Tex", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17365).Method355("Tex")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12770 = this.Method23(this.Field12768.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inside Model", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10783).Method355("Model")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12771 = this.Method24(this.Field12768.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speeds", this))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12772 = this.Method23(this.Field12771.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inside Spin Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x32A6320CE0E0714EL ^ 0x72AE320CE0E0714EL), 0.0, Double.longBitsToDouble(0x2425D54B0DF53E08L ^ 0x646CD54B0DF53E08L), ((int)1298142143L ^ 0x4D6013BF) != 0).Method355("Spin")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12773 = this.Method23(this.Field12768.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inside Fade Out Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)463887468 ^ 0x40C388001BA65C6CL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Fade Out")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12774 = this.Method24(this.Field12767.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside", this))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12775 = this.Method23(this.Field12774.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside Tex", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17366).Method355("Tex")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12776 = this.Method23(this.Field12774.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside Model", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10784).Method355("Model")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12777 = this.Method24(this.Field12774.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speeds", this))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12778 = this.Method23(this.Field12777.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside Spin Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)190449492 ^ 0x400800000B5A0754L), 0.0, Double.longBitsToDouble(0x9B996A3BFA5E3BFBL ^ 0xDBD06A3BFA5E3BFBL), (boolean)((long)-880986902 ^ (long)-880986902)).Method355("Spin")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12779 = this.Method23(this.Field12774.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside Fade Out Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)106514264 ^ 0x40C3880006594758L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Fade Out")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12780 = this.Method24(this.Field12767.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside 2", this))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12781 = this.Method23(this.Field12780.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside 2 Tex", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17366).Method355("Tex")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12782 = this.Method23(this.Field12780.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside 2 Model", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10784).Method355("Model")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12783 = this.Method24(this.Field12780.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speeds", this))));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12784 = this.Method23(this.Field12783.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside 2 Spin Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x263AF9FAD9216336L ^ 0x6632F9FAD9216336L), 0.0, Double.longBitsToDouble((long)353470735 ^ 0x404900001511890FL), (boolean)((long)-761447687 ^ (long)-761447687)).Method355("Spin")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12785 = this.Method23(this.Field12780.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outside 2 Fade Out Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)600762923 ^ 0x40C3880023CEEA2BL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Fade Out")));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12786 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bounce Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1826031727 ^ 0x3FC99999CCD7086FL), 0.0, Double.longBitsToDouble(0xE622E08FEEF898D5L ^ 0xA606E08FEEF898D5L), ((int)764402330L ^ 0x2D8FDA9A) != 0));
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12787 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4350, new Predicate[(int)-1389256524L ^ 0xAD31A0B4]);
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12788 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf::Method4349, new Predicate[(int)((long)-2032131636 ^ (long)-2032131636)]);
    private String Field12789 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf() {
        super("CrystalModifier", "Modify crystal model renderer", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        Field12739 = this;
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12787);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12788);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12787);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12788);
    }

    private static void Method4349(v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132) {
        if (!Field12744.containsKey(v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method851())) return;
        Field12744.get(v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method851());
    }

    private void Method4350(qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62) {
        SwOKjgBuZ4bcevFcd16aerJXflMi80gZ[] swOKjgBuZ4bcevFcd16aerJXflMi80gZArray = new SwOKjgBuZ4bcevFcd16aerJXflMi80gZ[(int)((long)-2068783738 ^ (long)-2068783737) << 2];
        swOKjgBuZ4bcevFcd16aerJXflMi80gZArray[(int)((long)-1628491321 ^ (long)-1628491321)] = new SwOKjgBuZ4bcevFcd16aerJXflMi80gZ(this.Field12765.Method369(), Double.longBitsToDouble(0x82E37EC88CB21821L ^ 0xBD5AE751152B81BBL), 1.0);
        swOKjgBuZ4bcevFcd16aerJXflMi80gZArray[(int)644005715L ^ 0x2662BF52] = new SwOKjgBuZ4bcevFcd16aerJXflMi80gZ(this.Field12773.Method369(), Double.longBitsToDouble((long)1548270015 ^ 0x3FB99999C5D12025L), 1.0);
        swOKjgBuZ4bcevFcd16aerJXflMi80gZArray[((int)-1653516451L ^ 0x9D71575C) << 1] = new SwOKjgBuZ4bcevFcd16aerJXflMi80gZ(this.Field12779.Method369(), Double.longBitsToDouble((long)877832606 ^ 0x3FB99999ADCB3004L), 1.0);
        swOKjgBuZ4bcevFcd16aerJXflMi80gZArray[(int)-1212129834L ^ 0xB7C05DD5] = new SwOKjgBuZ4bcevFcd16aerJXflMi80gZ(this.Field12785.Method369(), Double.longBitsToDouble(0xAFDD3223A0AF9356L ^ 0x9064ABBA39360ACCL), 1.0);
        Field12744.put(qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62.Method855().entityId, Arrays.asList(swOKjgBuZ4bcevFcd16aerJXflMi80gZArray));
    }

    static {
        Field12743 = 0.0;
        Field12742 = (int)((long)543472763 ^ (long)543472738) << 4;
        Field12740 = (int)((long)1450186663 ^ (long)1450186663);
        Field12741 = 0L;
        Field12744 = new HashMap();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)66888054L ^ 0x3FCA176;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)518838833 ^ (long)518838990);
            int n2 = (int)((long)-998950497 ^ (long)-998950594);
            cArray2[n] = (char)(cArray[n] ^ (((int)1421553812L ^ 0x54BB339B) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

