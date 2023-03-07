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

class mzU9GQNMqhLmTfolJ1ZjR9TCXEwNAe1x
extends gIvxvpNAI6XugtMxK19p7peBbgdbr5DL {
    private int Field10994;

    mzU9GQNMqhLmTfolJ1ZjR9TCXEwNAe1x() {
    }

    private static String Method2929() {
        return ChatFormatting.GRAY + "[" + ChatFormatting.RED + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET;
    }

    private TextComponentTranslation Method2930() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + this.Method1872() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)-91917190L ^ 0xFA85747A]);
    }

    private TextComponentTranslation Method2931(WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)533308370L ^ 0x1FC9A3D2]);
    }

    private TextComponentTranslation Method2932() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + this.Method1873() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[(int)((long)983720931 ^ (long)983720931)]);
    }

    @Override
    public void Method1881(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(mzU9GQNMqhLmTfolJ1ZjR9TCXEwNAe1x.Method2929(), new Object[(int)((long)2091311474 ^ (long)2091311474)]).appendSibling(iTextComponent));
    }

    @Override
    public void Method1882(String string) {
        this.Method1881((ITextComponent)new TextComponentTranslation(string, new Object[(int)1470625506L ^ 0x57A7F6E2]));
    }

    @Override
    public void Method1883(String string, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1884((ITextComponent)new TextComponentTranslation(string, new Object[(int)311019043L ^ 0x1289C623]), wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
    }

    @Override
    public void Method1884(ITextComponent iTextComponent, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        this.Method1874(new TextComponentTranslation(mzU9GQNMqhLmTfolJ1ZjR9TCXEwNAe1x.Method2929(), new Object[(int)((long)-965965526 ^ (long)-965965526)]).appendSibling((ITextComponent)this.Method2931(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)).appendSibling(iTextComponent));
    }

    @Override
    public void Method1885(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(mzU9GQNMqhLmTfolJ1ZjR9TCXEwNAe1x.Method2929(), new Object[(int)1275121546L ^ 0x4C00CF8A]).appendSibling((ITextComponent)this.Method2930()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1886(String string) {
        this.Method1885((ITextComponent)new TextComponentTranslation(string, new Object[(int)409053799L ^ 0x1861AA67]));
    }

    @Override
    public void Method1887(ITextComponent iTextComponent) {
        this.Method1874(this.Method2930().appendSibling(iTextComponent));
    }

    @Override
    public void Method1888(String string) {
        this.Method1887((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-221521602 ^ (long)-221521602)]));
    }

    @Override
    public void Method1889(ITextComponent iTextComponent) {
        this.Method1874(this.Method2932().appendSibling(iTextComponent));
    }

    @Override
    public void Method1890(String string) {
        this.Method1889((ITextComponent)new TextComponentTranslation(string, new Object[(int)550175399L ^ 0x20CB02A7]));
    }

    @Override
    public void Method1891(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(mzU9GQNMqhLmTfolJ1ZjR9TCXEwNAe1x.Method2929(), new Object[(int)1507930043L ^ 0x59E12FBB]).appendSibling((ITextComponent)this.Method2932()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1892(String string) {
        this.Method1891((ITextComponent)new TextComponentTranslation(string, new Object[(int)((long)-1225570847 ^ (long)-1225570847)]));
    }

    private static String Method1893(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-117753122L ^ 0xF8FB3ADE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)772401647L ^ 0x2E09E910);
            int n2 = ((int)1406238890L ^ 0x53D180BD) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)814920011L ^ 0x3092D488 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

