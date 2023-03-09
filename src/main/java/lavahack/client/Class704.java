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
import lavahack.client.Class1740;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

class Class704
extends Class1740 {
    private int Field10994;

    Class704() {
    }

    private static String Method2929() {
        return ChatFormatting.GRAY + "[" + ChatFormatting.RED + Class1796.Method6783() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET;
    }

    private TextComponentTranslation Method2930() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + this.Method1872() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }

    private TextComponentTranslation Method2931(Class42 class42) {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + class42.Method40() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }

    private TextComponentTranslation Method2932() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + this.Method1873() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }

    @Override
    public void Method1881(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(Class704.Method2929(), new Object[0]).appendSibling(iTextComponent));
    }

    @Override
    public void Method1882(String string) {
        this.Method1881((ITextComponent)new TextComponentTranslation(string, new Object[0]));
    }

    @Override
    public void Method1883(String string, Class42 class42) {
        this.Method1884((ITextComponent)new TextComponentTranslation(string, new Object[0]), class42);
    }

    @Override
    public void Method1884(ITextComponent iTextComponent, Class42 class42) {
        this.Method1874(new TextComponentTranslation(Class704.Method2929(), new Object[0]).appendSibling((ITextComponent)this.Method2931(class42)).appendSibling(iTextComponent));
    }

    @Override
    public void Method1885(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(Class704.Method2929(), new Object[0]).appendSibling((ITextComponent)this.Method2930()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1886(String string) {
        this.Method1885((ITextComponent)new TextComponentTranslation(string, new Object[0]));
    }

    @Override
    public void Method1887(ITextComponent iTextComponent) {
        this.Method1874(this.Method2930().appendSibling(iTextComponent));
    }

    @Override
    public void Method1888(String string) {
        this.Method1887((ITextComponent)new TextComponentTranslation(string, new Object[0]));
    }

    @Override
    public void Method1889(ITextComponent iTextComponent) {
        this.Method1874(this.Method2932().appendSibling(iTextComponent));
    }

    @Override
    public void Method1890(String string) {
        this.Method1889((ITextComponent)new TextComponentTranslation(string, new Object[0]));
    }

    @Override
    public void Method1891(ITextComponent iTextComponent) {
        this.Method1874(new TextComponentTranslation(Class704.Method2929(), new Object[0]).appendSibling((ITextComponent)this.Method2932()).appendSibling(iTextComponent));
    }

    @Override
    public void Method1892(String string) {
        this.Method1891((ITextComponent)new TextComponentTranslation(string, new Object[0]));
    }

    private static String Method1893(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 92;
            cArray2[n] = (char)(cArray[n] ^ (0x65C3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

