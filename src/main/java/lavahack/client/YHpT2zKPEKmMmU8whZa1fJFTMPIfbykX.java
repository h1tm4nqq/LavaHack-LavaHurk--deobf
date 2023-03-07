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

class YHpT2zKPEKmMmU8whZa1fJFTMPIfbykX
extends gIvxvpNAI6XugtMxK19p7peBbgdbr5DL {
    private String Field11507 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    YHpT2zKPEKmMmU8whZa1fJFTMPIfbykX() {
    }

    private static String Method3517() {
        return ChatFormatting.GRAY + "[" + ChatFormatting.GREEN + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET;
    }

    private TextComponentTranslation Method3518() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.GREEN + this.Method1872() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)((long)-2100862219 ^ (long)-2100862219)]);
    }

    private TextComponentTranslation Method3519(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)((long)781841321 ^ (long)781841321)]);
    }

    private TextComponentTranslation Method3520() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.GREEN + this.Method1873() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)-1816499327L ^ 0x93BA6B81]);
    }

    @Override
    public void Method1881(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(YHpT2zKPEKmMmU8whZa1fJFTMPIfbykX.Method3517(), new Object[(int)((long)-2098014061 ^ (long)-2098014061)]).appendSibling(iTextComponent));
    }

    @Override
    public void Method1882(String string) {
        this.Method1881((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)2109898291 ^ (long)2109898291)]));
    }

    @Override
    public void Method1883(String string, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1884((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-425027960 ^ (long)-425027960)]), wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
    }

    @Override
    public void Method1884(ITextComponent iTextComponent, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1874(new TextComponentTranslation(YHpT2zKPEKmMmU8whZa1fJFTMPIfbykX.Method3517(), new Object[(int)1879177939L ^ 0x7001FAD3]).appendSibling((ITextComponent)this.Method3519(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)).appendSibling(iTextComponent));
    }

    @Override
    public void Method1885(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(YHpT2zKPEKmMmU8whZa1fJFTMPIfbykX.Method3517(), new Object[(int)-1077494032L ^ 0xBFC6BEF0]).appendSibling((ITextComponent)this.Method3518()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1886(String string) {
        this.Method1885((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)1570308682 ^ (long)1570308682)]));
    }

    @Override
    public void Method1887(ITextComponent iTextComponent) {
        this.Method1874(this.Method3518().appendSibling(iTextComponent));
    }

    @Override
    public void Method1888(String string) {
        this.Method1887((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-1162758496 ^ (long)-1162758496)]));
    }

    @Override
    public void Method1889(ITextComponent iTextComponent) {
        this.Method1874(this.Method3520().appendSibling(iTextComponent));
    }

    @Override
    public void Method1890(String string) {
        this.Method1889((ITextComponent)new TextComponentTranslation(string, new Object[(int)1511634178L ^ 0x5A19B502]));
    }

    @Override
    public void Method1891(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(YHpT2zKPEKmMmU8whZa1fJFTMPIfbykX.Method3517(), new Object[(int)-1671254475L ^ 0x9C62AE35]).appendSibling((ITextComponent)this.Method3520()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1892(String string) {
        this.Method1891((ITextComponent)new TextComponentTranslation(string, new Object[(int)-2143799510L ^ 0x8038372A]));
    }

    private static String Method1893(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1040580432 ^ (long)1040580432);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2048166089L ^ 0x7A148836);
            int n2 = ((int)-1076742677L ^ 0xBFD235C8) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1952772177L ^ 0x8B9B1AA2) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

