/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.function.Function;
import lavahack.client.Class1876;
import lavahack.client.Class2006;
import lavahack.client.Class790;
import lavahack.client.Class994;
import org.lwjgl.input.Keyboard;

public class Class79
extends Class2006 {
    private Class994 Field8258;
    private boolean Field8259;
    private Function Field8260;
    private int Field8261;
    private int Field8262;

    public Class79(Class1876 class1876, int n, int n2, Function function) {
        super(class1876, "", n, n2);
        this.Field8260 = function;
        this.Method693();
    }

    public Class79(Class1876 class1876, Function function) {
        super(class1876, "");
        this.Field8260 = function;
        this.Method693();
    }

    private void Method693() {
        this.Method690(this::Method703);
        this.Method692(this::Method702);
        this.Method694();
    }

    @Override
    public void Method668() {
        super.Method668();
    }

    @Override
    public void Method690(Class790 class790) {
        if (this.Method689() != null) {
            Class790 class7902 = this.Method689();
            super.Method690(() -> Class79.Method701(class790, class7902));
            return;
        }
        super.Method690(class790);
    }

    @Override
    public void Method692(Class790 class790) {
        if (this.Method691() != null) {
            Class790 class7902 = this.Method691();
            super.Method692(() -> Class79.Method700(class790, class7902));
            return;
        }
        super.Method692(class790);
    }

    @Override
    public boolean Method681(int n, char c) {
        if (!this.Field8259) return super.Method681(n, c);
        this.Field8259 = false;
        if (Keyboard.getEventKey() != 256 && Keyboard.getEventCharacter() != '\u0000') {
            int n2;
            int n3 = n2 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 256 : Keyboard.getEventKey();
            if (this.Field8258 != null && this.Field8258.Method4024(n2)) {
                this.Field8261 = n2;
            }
        }
        this.Method694();
        return super.Method681(n, c);
    }

    @Override
    public int Method670() {
        int n;
        if (this.Field8259) {
            n = super.Method670() + 1;
            return n;
        }
        n = super.Method670();
        return n;
    }

    private void Method694() {
        if (this.Field8259) {
            this.Method688("Press a button...");
            return;
        }
        this.Method688((String)this.Field8260.apply(this.Field8261));
    }

    public int Method695() {
        return this.Field8261;
    }

    public void Method696(int n) {
        this.Field8261 = n;
        this.Method694();
    }

    public Function Method697() {
        return this.Field8260;
    }

    public void Method698(Function function) {
        this.Field8260 = function;
    }

    public void Method699(Class994 class994) {
        this.Field8258 = class994;
    }

    private static void Method700(Class790 class790, Class790 class7902) {
        class790.Method3300();
        class7902.Method3300();
    }

    private static void Method701(Class790 class790, Class790 class7902) {
        class790.Method3300();
        class7902.Method3300();
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

    private static String Method704(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 204;
            cArray2[n] = (char)(cArray[n] ^ (0x1384 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

