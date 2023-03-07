//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 */
package lavahack.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

class fo73Z5e8TpdyudhbHc7qwFR4O908RcBz
extends gIvxvpNAI6XugtMxK19p7peBbgdbr5DL {
    private String Field13281 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    fo73Z5e8TpdyudhbHc7qwFR4O908RcBz() {
    }

    private static String Method4731() {
        return ChatFormatting.GRAY + "[" + ChatFormatting.LIGHT_PURPLE + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET;
    }

    private TextComponentTranslation Method4732() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.LIGHT_PURPLE + this.Method1872() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)-1467717572L ^ 0xA884683C]);
    }

    private TextComponentTranslation Method4733(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.LIGHT_PURPLE + wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)((long)-1558383306 ^ (long)-1558383306)]);
    }

    private TextComponentTranslation Method4734() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.LIGHT_PURPLE + this.Method1873() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)-994441702L ^ 0xC4BA061A]);
    }

    @Override
    public void Method1881(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(fo73Z5e8TpdyudhbHc7qwFR4O908RcBz.Method4731(), new Object[(int)-398370694L ^ 0xE841587A]).appendSibling(iTextComponent));
    }

    @Override
    public void Method1882(String string) {
        this.Method1881((ITextComponent)new TextComponentTranslation(string, new Object[(int)-1163228269L ^ 0xBAAA8B93]));
    }

    @Override
    public void Method1883(String string, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1884((ITextComponent)new TextComponentTranslation(string, new Object[(int)-1446283679L ^ 0xA9CB7661]), wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
    }

    @Override
    public void Method1884(ITextComponent iTextComponent, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1874(new TextComponentTranslation(fo73Z5e8TpdyudhbHc7qwFR4O908RcBz.Method4731(), new Object[(int)((long)-435330894 ^ (long)-435330894)]).appendSibling((ITextComponent)this.Method4733(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)).appendSibling(iTextComponent));
    }

    @Override
    public void Method1885(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(fo73Z5e8TpdyudhbHc7qwFR4O908RcBz.Method4731(), new Object[(int)((long)-1303646754 ^ (long)-1303646754)]).appendSibling((ITextComponent)this.Method4732()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1886(String string) {
        this.Method1885((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-942621680 ^ (long)-942621680)]));
    }

    @Override
    public void Method1887(ITextComponent iTextComponent) {
        this.Method1874(this.Method4732().appendSibling(iTextComponent));
    }

    @Override
    public void Method1888(String string) {
        this.Method1887((ITextComponent)new TextComponentTranslation(string, new Object[(int)-819203052L ^ 0xCF2BF414]));
    }

    @Override
    public void Method1889(ITextComponent iTextComponent) {
        this.Method1874(this.Method4734().appendSibling(iTextComponent));
    }

    @Override
    public void Method1890(String string) {
        this.Method1889((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)351729849 ^ (long)351729849)]));
    }

    @Override
    public void Method1891(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(fo73Z5e8TpdyudhbHc7qwFR4O908RcBz.Method4731(), new Object[(int)((long)-1197292411 ^ (long)-1197292411)]).appendSibling((ITextComponent)this.Method4734()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1892(String string) {
        this.Method1891((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-268183440 ^ (long)-268183440)]));
    }

    private static String Method1893(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)713424310L ^ 0x2A85FDB6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-452979457L ^ 0xE5001400);
            int n2 = ((int)-1577456106L ^ 0xA1F9EE15) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)1591459133L ^ 0x5EDBC7BE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

