//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ChatAllowedCharacters
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.Class1876;
import lavahack.client.Class2006;
import lavahack.client.Class790;
import lavahack.client.Class994;
import net.minecraft.util.ChatAllowedCharacters;
import org.lwjgl.input.Keyboard;

public class Class1256
extends Class2006 {
    private Class994 Field13694;
    private boolean Field13695;
    private String Field13696;
    private String Field13697;
    private int Field13698;

    public Class1256(Class1876 class1876, int n, int n2, String string) {
        super(class1876, "", n, n2);
        this.Field13697 = string;
        this.Method5070();
    }

    public Class1256(Class1876 class1876, String string) {
        super(class1876, "");
        this.Field13697 = string;
        this.Method5070();
    }

    private void Method5070() {
        this.Method690(this::Method5077);
        this.Method5072();
    }

    @Override
    public void Method690(Class790 class790) {
        if (this.Method689() != null) {
            Class790 class7902 = this.Method689();
            super.Method690(() -> Class1256.Method5076(class790, class7902));
            return;
        }
        super.Method690(class790);
    }

    @Override
    public boolean Method681(int n, char c) {
        if (!this.Field13695) return super.Method681(n, c);
        if (Keyboard.getEventKey() == 1) {
            return super.Method681(n, c);
        }
        if (28 == Keyboard.getEventKey()) {
            this.Method5071();
        } else if (Keyboard.getEventKey() == 14) {
            if (!this.Field13696.isEmpty()) {
                this.Field13696 = this.Field13696.substring(0, this.Field13696.length() - 1);
            }
        } else if (ChatAllowedCharacters.isAllowedCharacter((char)Keyboard.getEventCharacter())) {
            this.Field13696 = this.Field13696 + Keyboard.getEventCharacter();
        }
        this.Method5072();
        return super.Method681(n, c);
    }

    private void Method5071() {
        this.Field13695 = false;
        if (this.Field13696.isEmpty()) {
            this.Field13694.Method4024(this.Field13697);
            this.Method5074(this.Field13697);
            return;
        }
        this.Field13694.Method4024(this.Field13696);
        this.Method5074(this.Field13696);
    }

    @Override
    public int Method670() {
        int n;
        if (this.Field13695) {
            n = super.Method670() + 1;
            return n;
        }
        n = super.Method670();
        return n;
    }

    private void Method5072() {
        this.Method688(this.Field13696 + (this.Field13695 ? "_" : ""));
    }

    public String Method5073() {
        return this.Field13696;
    }

    public void Method5074(String string) {
        this.Field13696 = string;
        this.Method5072();
    }

    public void Method5075(Class994 class994) {
        this.Field13694 = class994;
    }

    private static void Method5076(Class790 class790, Class790 class7902) {
        class790.Method3300();
        class7902.Method3300();
    }

    private void Method5077() {
        this.Field13695 = !this.Field13695;
        this.Method5072();
    }

    private static String Method5078(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 246;
            cArray2[n] = (char)(cArray[n] ^ (0x7830 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

