//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.input.*;
import net.minecraft.util.*;

public class Class1256 extends Class2006
{
    private Class994 Field13694;
    private boolean Field13695;
    private String Field13696;
    private String Field13697;
    private int Field13698;
    
    public Class1256(final Class1876 class1876, final int n, final int n2, final String field13697) {
        super(class1876, "", n, n2);
        this.Field13697 = field13697;
        this.Method5070();
    }
    
    public Class1256(final Class1876 class1876, final String field13697) {
        super(class1876, "");
        this.Field13697 = field13697;
        this.Method5070();
    }
    
    private void Method5070() {
        this.Method690(this::Method5077);
        this.Method5072();
    }
    
    @Override
    public void Method690(final Class790 class790) {
        if (this.Method689() != null) {
            super.Method690(Class1256::Method5076);
        }
        else {
            super.Method690(class790);
        }
    }
    
    @Override
    public boolean Method681(final int n, final char c) {
        if (this.Field13695) {
            if (Keyboard.getEventKey() == 1) {
                return super.Method681(n, c);
            }
            if (28 == Keyboard.getEventKey()) {
                this.Method5071();
            }
            else if (Keyboard.getEventKey() == 14) {
                if (!this.Field13696.isEmpty()) {
                    this.Field13696 = this.Field13696.substring(0, this.Field13696.length() - 1);
                }
            }
            else if (ChatAllowedCharacters.isAllowedCharacter(Keyboard.getEventCharacter())) {
                this.Field13696 += Keyboard.getEventCharacter();
            }
            this.Method5072();
        }
        return super.Method681(n, c);
    }
    
    private void Method5071() {
        this.Field13695 = false;
        if (this.Field13696.isEmpty()) {
            this.Field13694.Method4024(this.Field13697);
            this.Method5074(this.Field13697);
        }
        else {
            this.Field13694.Method4024(this.Field13696);
            this.Method5074(this.Field13696);
        }
    }
    
    @Override
    public int Method670() {
        return this.Field13695 ? (super.Method670() + 1) : super.Method670();
    }
    
    private void Method5072() {
        this.Method688(this.Field13696 + (this.Field13695 ? "_" : ""));
    }
    
    public String Method5073() {
        return this.Field13696;
    }
    
    public void Method5074(final String field13696) {
        this.Field13696 = field13696;
        this.Method5072();
    }
    
    public void Method5075(final Class994 field13694) {
        this.Field13694 = field13694;
    }
    
    private static void Method5076(final Class790 class790, final Class790 class791) {
        class790.Method3300();
        class791.Method3300();
    }
    
    private void Method5077() {
        this.Field13695 = !this.Field13695;
        this.Method5072();
    }
    
    private static String Method5078(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7830 ^ 0xF6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
