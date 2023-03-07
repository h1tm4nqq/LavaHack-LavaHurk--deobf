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

class AjBmyKpzQVGYEFjSFHe4ojZSKrgkuhpj
extends gIvxvpNAI6XugtMxK19p7peBbgdbr5DL {
    private String Field9625 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    AjBmyKpzQVGYEFjSFHe4ojZSKrgkuhpj() {
    }

    private static String Method1894() {
        return ChatFormatting.GRAY + "[" + ChatFormatting.WHITE + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET;
    }

    private TextComponentTranslation Method1895() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.WHITE + this.Method1872() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)((long)-938955330 ^ (long)-938955330)]);
    }

    private TextComponentTranslation Method1896(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)((long)1034003418 ^ (long)1034003418)]);
    }

    private TextComponentTranslation Method1897() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.WHITE + this.Method1873() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)-848807787L ^ 0xCD683895]);
    }

    @Override
    public void Method1881(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(AjBmyKpzQVGYEFjSFHe4ojZSKrgkuhpj.Method1894(), new Object[(int)((long)1155943015 ^ (long)1155943015)]).appendSibling(iTextComponent));
    }

    @Override
    public void Method1882(String string) {
        this.Method1881((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-1734355011 ^ (long)-1734355011)]));
    }

    @Override
    public void Method1883(String string, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1884((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)47759744 ^ (long)47759744)]), wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
    }

    @Override
    public void Method1884(ITextComponent iTextComponent, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1874(new TextComponentTranslation(AjBmyKpzQVGYEFjSFHe4ojZSKrgkuhpj.Method1894(), new Object[(int)((long)229899360 ^ (long)229899360)]).appendSibling((ITextComponent)this.Method1896(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)).appendSibling(iTextComponent));
    }

    @Override
    public void Method1885(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(AjBmyKpzQVGYEFjSFHe4ojZSKrgkuhpj.Method1894(), new Object[(int)((long)207872221 ^ (long)207872221)]).appendSibling((ITextComponent)this.Method1895()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1886(String string) {
        this.Method1885((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-1675952185 ^ (long)-1675952185)]));
    }

    @Override
    public void Method1887(ITextComponent iTextComponent) {
        this.Method1874(this.Method1895().appendSibling(iTextComponent));
    }

    @Override
    public void Method1888(String string) {
        this.Method1887((ITextComponent)new TextComponentTranslation(string, new Object[(int)1157284817L ^ 0x44FAC3D1]));
    }

    @Override
    public void Method1889(ITextComponent iTextComponent) {
        this.Method1874(this.Method1897().appendSibling(iTextComponent));
    }

    @Override
    public void Method1890(String string) {
        this.Method1889((ITextComponent)new TextComponentTranslation(string, new Object[(int)628171171L ^ 0x257121A3]));
    }

    @Override
    public void Method1891(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(AjBmyKpzQVGYEFjSFHe4ojZSKrgkuhpj.Method1894(), new Object[(int)-1683984728L ^ 0x9BA06EA8]).appendSibling((ITextComponent)this.Method1897()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1892(String string) {
        this.Method1891((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)960101376 ^ (long)960101376)]));
    }

    private static String Method1893(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1130716429 ^ (long)1130716429);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-292206941 ^ (long)-292207012);
            int n2 = (int)1988464290L ^ 0x76858E31;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-942032157 ^ (long)-942035218) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

