//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import org.lwjgl.input.*;

public class Class79 extends Class2006
{
    private Class994 Field8258;
    private boolean Field8259;
    private Function Field8260;
    private int Field8261;
    private int Field8262;
    
    public Class79(final Class1876 class1876, final int n, final int n2, final Function field8260) {
        super(class1876, "", n, n2);
        this.Field8260 = field8260;
        this.Method693();
    }
    
    public Class79(final Class1876 class1876, final Function field8260) {
        super(class1876, "");
        this.Field8260 = field8260;
        this.Method693();
    }
    
    private void Method693() {
        this.Method690(this::Method703);
        this.Method692(this::Method702);
        this.Method694();
    }
    
    public void Method668() {
        super.Method668();
    }
    
    public void Method690(final Class790 class790) {
        if (this.Method689() != null) {
            super.Method690(Class79::Method701);
        }
        else {
            super.Method690(class790);
        }
    }
    
    public void Method692(final Class790 class790) {
        if (this.Method691() != null) {
            super.Method692(Class79::Method700);
        }
        else {
            super.Method692(class790);
        }
    }
    
    public boolean Method681(final int n, final char c) {
        if (this.Field8259) {
            this.Field8259 = false;
            if (Keyboard.getEventKey() != 256 && Keyboard.getEventCharacter() != '\0') {
                final int n2 = (Keyboard.getEventKey() == 0) ? (Keyboard.getEventCharacter() + '\u0100') : Keyboard.getEventKey();
                if (this.Field8258 != null && this.Field8258.Method4024(n2)) {
                    this.Field8261 = n2;
                }
            }
            this.Method694();
        }
        return super.Method681(n, c);
    }
    
    public int Method670() {
        return this.Field8259 ? (super.Method670() + 1) : super.Method670();
    }
    
    private void Method694() {
        if (this.Field8259) {
            this.Method688("Press a button...");
        }
        else {
            this.Method688((String)this.Field8260.apply(this.Field8261));
        }
    }
    
    public int Method695() {
        return this.Field8261;
    }
    
    public void Method696(final int field8261) {
        this.Field8261 = field8261;
        this.Method694();
    }
    
    public Function Method697() {
        return this.Field8260;
    }
    
    public void Method698(final Function field8260) {
        this.Field8260 = field8260;
    }
    
    public void Method699(final Class994 field8258) {
        this.Field8258 = field8258;
    }
    
    private static void Method700(final Class790 class790, final Class790 class791) {
        class790.Method3300();
        class791.Method3300();
    }
    
    private static void Method701(final Class790 class790, final Class790 class791) {
        class790.Method3300();
        class791.Method3300();
    }
    
    private void Method702() {
        if (this.Field8258 != null) {
            this.Field8258.Method4024(0);
        }
        this.Method694();
    }
    
    private void Method703() {
        this.Field8259 = !this.Field8259;
        this.Method694();
    }
    
    private static String Method704(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1384 ^ 0xCC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
