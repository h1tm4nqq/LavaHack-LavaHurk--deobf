//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.mojang.realmsclient.gui.*;
import net.minecraft.util.text.*;

class Class704 extends Class1740
{
    private int Field10994;
    
    private static String Method2929() {
        return ChatFormatting.GRAY + "[" + ChatFormatting.RED + Class1796.Method6783() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET;
    }
    
    private TextComponentTranslation Method2930() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + this.Method1872() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }
    
    private TextComponentTranslation Method2931(final Class42 class42) {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + class42.Method40() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }
    
    private TextComponentTranslation Method2932() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.RED + this.Method1873() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }
    
    public void Method1881(final ITextComponent textComponent) {
        this.Method1874(new TextComponentTranslation(Method2929(), new Object[0]).appendSibling(textComponent));
    }
    
    public void Method1882(final String s) {
        this.Method1881((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    public void Method1883(final String s, final Class42 class42) {
        this.Method1884((ITextComponent)new TextComponentTranslation(s, new Object[0]), class42);
    }
    
    public void Method1884(final ITextComponent textComponent, final Class42 class42) {
        this.Method1874(new TextComponentTranslation(Method2929(), new Object[0]).appendSibling((ITextComponent)this.Method2931(class42)).appendSibling(textComponent));
    }
    
    public void Method1885(final ITextComponent textComponent) {
        this.Method1874(new TextComponentTranslation(Method2929(), new Object[0]).appendSibling((ITextComponent)this.Method2930()).appendSibling(textComponent));
    }
    
    public void Method1886(final String s) {
        this.Method1885((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    public void Method1887(final ITextComponent textComponent) {
        this.Method1874(this.Method2930().appendSibling(textComponent));
    }
    
    public void Method1888(final String s) {
        this.Method1887((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    public void Method1889(final ITextComponent textComponent) {
        this.Method1874(this.Method2932().appendSibling(textComponent));
    }
    
    public void Method1890(final String s) {
        this.Method1889((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    public void Method1891(final ITextComponent textComponent) {
        this.Method1874(new TextComponentTranslation(Method2929(), new Object[0]).appendSibling((ITextComponent)this.Method2932()).appendSibling(textComponent));
    }
    
    public void Method1892(final String s) {
        this.Method1891((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    private static String Method1893(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x65C3 ^ 0x5C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
