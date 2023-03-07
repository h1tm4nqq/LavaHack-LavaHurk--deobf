/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.function.Function;
import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.NZlapI0lvoshixInpR8uRshg3YC4m0ZP;
import lavahack.client.PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL;
import lavahack.client.fBw059jSZh9EnsOSUkYoCNT8w9VXknU4;
import org.lwjgl.input.Keyboard;

public class l3yOHzFFFAq8QiVKt2VTqTFqYCNDIHMO
extends fBw059jSZh9EnsOSUkYoCNT8w9VXknU4 {
    private NZlapI0lvoshixInpR8uRshg3YC4m0ZP Field8258;
    private boolean Field8259;
    private Function Field8260;
    private int Field8261;
    private int Field8262;

    public l3yOHzFFFAq8QiVKt2VTqTFqYCNDIHMO(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, int n, int n2, Function function) {
        super(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, "", n, n2);
        this.Field8260 = function;
        this.Method693();
    }

    public l3yOHzFFFAq8QiVKt2VTqTFqYCNDIHMO(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, Function function) {
        super(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, "");
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
    public void Method690(PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL) {
        if (this.Method689() != null) {
            PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2 = this.Method689();
            super.Method690(() -> l3yOHzFFFAq8QiVKt2VTqTFqYCNDIHMO.Method701(pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL, pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2));
            return;
        }
        super.Method690(pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL);
    }

    @Override
    public void Method692(PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL) {
        if (this.Method691() != null) {
            PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2 = this.Method691();
            super.Method692(() -> l3yOHzFFFAq8QiVKt2VTqTFqYCNDIHMO.Method700(pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL, pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2));
            return;
        }
        super.Method692(pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL);
    }

    @Override
    public boolean Method681(int n, char c) {
        if (!this.Field8259) return super.Method681(n, c);
        this.Field8259 = (int)((long)2146364003 ^ (long)2146364003);
        if (Keyboard.getEventKey() != ((int)-631829799L ^ 0xDA570AD8) << 8 && Keyboard.getEventCharacter() != '\u0000') {
            int n2;
            int n3 = n2 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + (((int)578093130L ^ 0x2275004B) << 8) : Keyboard.getEventKey();
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
            n = super.Method670() + (int)((long)-1869879757 ^ (long)-1869879758);
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

    public void Method699(NZlapI0lvoshixInpR8uRshg3YC4m0ZP nZlapI0lvoshixInpR8uRshg3YC4m0ZP) {
        this.Field8258 = nZlapI0lvoshixInpR8uRshg3YC4m0ZP;
    }

    private static void Method700(PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL, PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2) {
        pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL.Method3300();
        pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2.Method3300();
    }

    private static void Method701(PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL, PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2) {
        pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL.Method3300();
        pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2.Method3300();
    }

    private void Method702() {
        if (this.Field8258 != null) {
            this.Field8258.Method4024((int)((long)-1023480290 ^ (long)-1023480290));
        }
        this.Method694();
    }

    private void Method703() {
        this.Field8259 = !this.Field8259 ? (int)1485852180L ^ 0x58904E15 : (int)((long)1784436546 ^ (long)1784436546);
        this.Method694();
    }

    private static String Method704(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1798918705 ^ (long)1798918705);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1810379633 ^ (long)-1810379664);
            int n2 = (int)((long)942791985 ^ (long)942791938) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)2031935832L ^ 0x791CE5B9) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

