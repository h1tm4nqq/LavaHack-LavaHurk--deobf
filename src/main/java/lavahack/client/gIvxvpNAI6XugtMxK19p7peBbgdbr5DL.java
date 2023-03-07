//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 */
package lavahack.client;

import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public abstract class gIvxvpNAI6XugtMxK19p7peBbgdbr5DL {
    final Minecraft Field15981 = Minecraft.getMinecraft();
    Class Field15982 = null;
    private String Field15983 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    void Method1871(Class clazz) {
        this.Field15982 = clazz;
    }

    final String Method1872() {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Field14314.get(this.Field15982);
        if (wjjBVRrUqJUKhloA7ANknrTEODhuGa0J != null) return wjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Method40();
        return "null";
    }

    final String Method1873() {
        return this.Field15982.getSimpleName();
    }

    public final void Method1874(ITextComponent iTextComponent) {
        if (this.Field15981.player == null) {
            return;
        }
        this.Field15981.ingameGUI.getChatGUI().printChatMessage(iTextComponent);
    }

    public final void Method1875(String string) {
        this.Method1874((ITextComponent)new TextComponentTranslation(string, new Object[(int)88370888L ^ 0x5446EC8]));
    }

    public void Method1876(String string, Object ... objectArray) {
        this.Method1882(String.format(string, objectArray));
    }

    public void Method1877(String string, Object ... objectArray) {
        this.Method1886(String.format(string, objectArray));
    }

    public void Method1878(String string, Object ... objectArray) {
        this.Method1888(String.format(string, objectArray));
    }

    public void Method1879(String string, Object ... objectArray) {
        this.Method1890(String.format(string, objectArray));
    }

    public void Method1880(String string, Object ... objectArray) {
        this.Method1892(String.format(string, objectArray));
    }

    public abstract void Method1881(ITextComponent var1);

    public abstract void Method1882(String var1);

    public abstract void Method1883(String var1, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J var2);

    public abstract void Method1884(ITextComponent var1, WjjBVRrUqJUKhloA7ANknrTEODhuGa0J var2);

    public abstract void Method1885(ITextComponent var1);

    public abstract void Method1886(String var1);

    public abstract void Method1887(ITextComponent var1);

    public abstract void Method1888(String var1);

    public abstract void Method1889(ITextComponent var1);

    public abstract void Method1890(String var1);

    public abstract void Method1891(ITextComponent var1);

    public abstract void Method1892(String var1);

    private static String Method1893(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1817269377 ^ (long)-1817269377);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1034285018L ^ 0x3DA5EF25);
            int n2 = (int)-230482366L ^ 0xF2431E57;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1148743131 ^ (long)-1148737254) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

