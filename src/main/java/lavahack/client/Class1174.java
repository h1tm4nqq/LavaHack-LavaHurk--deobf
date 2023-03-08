//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.mojang.realmsclient.gui.*;
import net.minecraft.util.text.*;

class Class1174 extends Class1740
{
    private String Field13281 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private static String Method4731() {
        return ChatFormatting.GRAY + "[" + ChatFormatting.LIGHT_PURPLE + Class1796.Method6783() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET;
    }
    
    private TextComponentTranslation Method4732() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.LIGHT_PURPLE + this.Method1872() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }
    
    private TextComponentTranslation Method4733(final Class42 class42) {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.LIGHT_PURPLE + class42.Method40() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }
    
    private TextComponentTranslation Method4734() {
        return new TextComponentTranslation(ChatFormatting.GRAY + "[" + ChatFormatting.LIGHT_PURPLE + this.Method1873() + ChatFormatting.GRAY + "] " + ChatFormatting.RESET, new Object[0]);
    }
    
    @Override
    public void Method1881(final ITextComponent textComponent) {
        this.Method1874(new TextComponentTranslation(Method4731(), new Object[0]).appendSibling(textComponent));
    }
    
    @Override
    public void Method1882(final String s) {
        this.Method1881((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    @Override
    public void Method1883(final String s, final Class42 class42) {
        this.Method1884((ITextComponent)new TextComponentTranslation(s, new Object[0]), class42);
    }
    
    @Override
    public void Method1884(final ITextComponent textComponent, final Class42 class42) {
        this.Method1874(new TextComponentTranslation(Method4731(), new Object[0]).appendSibling((ITextComponent)this.Method4733(class42)).appendSibling(textComponent));
    }
    
    @Override
    public void Method1885(final ITextComponent textComponent) {
        this.Method1874(new TextComponentTranslation(Method4731(), new Object[0]).appendSibling((ITextComponent)this.Method4732()).appendSibling(textComponent));
    }
    
    @Override
    public void Method1886(final String s) {
        this.Method1885((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    @Override
    public void Method1887(final ITextComponent textComponent) {
        this.Method1874(this.Method4732().appendSibling(textComponent));
    }
    
    @Override
    public void Method1888(final String s) {
        this.Method1887((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    @Override
    public void Method1889(final ITextComponent textComponent) {
        this.Method1874(this.Method4734().appendSibling(textComponent));
    }
    
    @Override
    public void Method1890(final String s) {
        this.Method1889((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    @Override
    public void Method1891(final ITextComponent textComponent) {
        this.Method1874(new TextComponentTranslation(Method4731(), new Object[0]).appendSibling((ITextComponent)this.Method4734()).appendSibling(textComponent));
    }
    
    @Override
    public void Method1892(final String s) {
        this.Method1891((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    private static String Method1893(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7A83 ^ 0x60));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
