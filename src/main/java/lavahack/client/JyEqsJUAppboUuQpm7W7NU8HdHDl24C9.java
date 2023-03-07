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

class JyEqsJUAppboUuQpm7W7NU8HdHDl24C9
extends gIvxvpNAI6XugtMxK19p7peBbgdbr5DL {
    private String Field16586 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    JyEqsJUAppboUuQpm7W7NU8HdHDl24C9() {
    }

    private static String Method6963() {
        return ChatFormatting.GRAY + "[" + ChatFormatting.GOLD + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET;
    }

    private TextComponentTranslation Method6964() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.GOLD + this.Method1872() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)((long)-1083753169 ^ (long)-1083753169)]);
    }

    private TextComponentTranslation Method6965(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)((long)-1068457614 ^ (long)-1068457614)]);
    }

    private TextComponentTranslation Method6966() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.GOLD + this.Method1873() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)-1689335661L ^ 0x9B4EC893]);
    }

    @Override
    public void Method1881(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(JyEqsJUAppboUuQpm7W7NU8HdHDl24C9.Method6963(), new Object[(int)((long)-89947629 ^ (long)-89947629)]).appendSibling(iTextComponent));
    }

    @Override
    public void Method1882(String string) {
        this.Method1881((ITextComponent)new TextComponentTranslation(string, new Object[(int)182292932L ^ 0xADD91C4]));
    }

    @Override
    public void Method1883(String string, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1884((ITextComponent)new TextComponentTranslation(string, new Object[(int)441191609L ^ 0x1A4C0CB9]), wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
    }

    @Override
    public void Method1884(ITextComponent iTextComponent, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1874(new TextComponentTranslation(JyEqsJUAppboUuQpm7W7NU8HdHDl24C9.Method6963(), new Object[(int)441005069L ^ 0x1A49340D]).appendSibling((ITextComponent)this.Method6965(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)).appendSibling(iTextComponent));
    }

    @Override
    public void Method1885(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(JyEqsJUAppboUuQpm7W7NU8HdHDl24C9.Method6963(), new Object[(int)((long)-1527904318 ^ (long)-1527904318)]).appendSibling((ITextComponent)this.Method6964()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1886(String string) {
        this.Method1885((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-253151263 ^ (long)-253151263)]));
    }

    @Override
    public void Method1887(ITextComponent iTextComponent) {
        this.Method1874(this.Method6964().appendSibling(iTextComponent));
    }

    @Override
    public void Method1888(String string) {
        this.Method1887((ITextComponent)new TextComponentTranslation(string, new Object[(int)1061658519L ^ 0x3F479F97]));
    }

    @Override
    public void Method1889(ITextComponent iTextComponent) {
        this.Method1874(this.Method6966().appendSibling(iTextComponent));
    }

    @Override
    public void Method1890(String string) {
        this.Method1889((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-602695666 ^ (long)-602695666)]));
    }

    @Override
    public void Method1891(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(JyEqsJUAppboUuQpm7W7NU8HdHDl24C9.Method6963(), new Object[(int)629691391L ^ 0x258853FF]).appendSibling((ITextComponent)this.Method6966()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1892(String string) {
        this.Method1891((ITextComponent)new TextComponentTranslation(string, new Object[(int)1034016170L ^ 0x3DA1D5AA]));
    }

    private static String Method1893(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1364320277 ^ (long)-1364320277);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-305244628L ^ 0xEDCE56D3);
            int n2 = (int)((long)2032439967 ^ (long)2032439967);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1741113308 ^ (long)-1741116107) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

