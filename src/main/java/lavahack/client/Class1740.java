//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.util.text.*;

public abstract class Class1740
{
    final Minecraft Field15981;
    Class Field15982;
    private String Field15983 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1740() {
        this.Field15981 = Minecraft.getMinecraft();
        this.Field15982 = null;
    }
    
    void Method1871(final Class field15982) {
        this.Field15982 = field15982;
    }
    
    final String Method1872() {
        final Class42 class42 = Class1393.Field14314.get(this.Field15982);
        if (class42 == null) {
            return "null";
        }
        return class42.Method40();
    }
    
    final String Method1873() {
        return this.Field15982.getSimpleName();
    }
    
    public final void Method1874(final ITextComponent textComponent) {
        if (this.Field15981.player == null) {
            return;
        }
        this.Field15981.ingameGUI.getChatGUI().printChatMessage(textComponent);
    }
    
    public final void Method1875(final String s) {
        this.Method1874((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    public void Method1876(final String format, final Object... args) {
        this.Method1882(String.format(format, args));
    }
    
    public void Method1877(final String format, final Object... args) {
        this.Method1886(String.format(format, args));
    }
    
    public void Method1878(final String format, final Object... args) {
        this.Method1888(String.format(format, args));
    }
    
    public void Method1879(final String format, final Object... args) {
        this.Method1890(String.format(format, args));
    }
    
    public void Method1880(final String format, final Object... args) {
        this.Method1892(String.format(format, args));
    }
    
    public abstract void Method1881(final ITextComponent p0);
    
    public abstract void Method1882(final String p0);
    
    public abstract void Method1883(final String p0, final Class42 p1);
    
    public abstract void Method1884(final ITextComponent p0, final Class42 p1);
    
    public abstract void Method1885(final ITextComponent p0);
    
    public abstract void Method1886(final String p0);
    
    public abstract void Method1887(final ITextComponent p0);
    
    public abstract void Method1888(final String p0);
    
    public abstract void Method1889(final ITextComponent p0);
    
    public abstract void Method1890(final String p0);
    
    public abstract void Method1891(final ITextComponent p0);
    
    public abstract void Method1892(final String p0);
    
    private static String Method1893(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x767E ^ 0x15));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
