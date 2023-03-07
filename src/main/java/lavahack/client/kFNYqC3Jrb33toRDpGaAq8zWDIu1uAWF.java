//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ChatAllowedCharacters
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.NZlapI0lvoshixInpR8uRshg3YC4m0ZP;
import lavahack.client.PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL;
import lavahack.client.fBw059jSZh9EnsOSUkYoCNT8w9VXknU4;
import net.minecraft.util.ChatAllowedCharacters;
import org.lwjgl.input.Keyboard;

public class kFNYqC3Jrb33toRDpGaAq8zWDIu1uAWF
extends fBw059jSZh9EnsOSUkYoCNT8w9VXknU4 {
    private NZlapI0lvoshixInpR8uRshg3YC4m0ZP Field13694;
    private boolean Field13695;
    private String Field13696;
    private String Field13697;
    private int Field13698;

    public kFNYqC3Jrb33toRDpGaAq8zWDIu1uAWF(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, int n, int n2, String string) {
        super(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, "", n, n2);
        this.Field13697 = string;
        this.Method5070();
    }

    public kFNYqC3Jrb33toRDpGaAq8zWDIu1uAWF(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, String string) {
        super(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, "");
        this.Field13697 = string;
        this.Method5070();
    }

    private void Method5070() {
        this.Method690(this::Method5077);
        this.Method5072();
    }

    @Override
    public void Method690(PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL) {
        if (this.Method689() != null) {
            PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2 = this.Method689();
            super.Method690(() -> kFNYqC3Jrb33toRDpGaAq8zWDIu1uAWF.Method5076(pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL, pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2));
            return;
        }
        super.Method690(pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL);
    }

    @Override
    public boolean Method681(int n, char c) {
        if (!this.Field13695) return super.Method681(n, c);
        if (Keyboard.getEventKey() == (int)((long)-1666070726 ^ (long)-1666070725)) {
            return super.Method681(n, c);
        }
        if ((int)((long)-1733859719 ^ (long)-1733859714) << 2 == Keyboard.getEventKey()) {
            this.Method5071();
        } else if (Keyboard.getEventKey() == (int)((long)1854043815 ^ (long)1854043808) << 1) {
            if (!this.Field13696.isEmpty()) {
                this.Field13696 = this.Field13696.substring((int)-2014031218L ^ 0x87F4528E, this.Field13696.length() - (int)((long)1471321327 ^ (long)1471321326));
            }
        } else if (ChatAllowedCharacters.isAllowedCharacter((char)Keyboard.getEventCharacter())) {
            this.Field13696 = this.Field13696 + Keyboard.getEventCharacter();
        }
        this.Method5072();
        return super.Method681(n, c);
    }

    private void Method5071() {
        this.Field13695 = (int)-1056285837L ^ 0xC10A5B73;
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
            n = super.Method670() + (int)((long)-1818729210 ^ (long)-1818729209);
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

    public void Method5075(NZlapI0lvoshixInpR8uRshg3YC4m0ZP nZlapI0lvoshixInpR8uRshg3YC4m0ZP) {
        this.Field13694 = nZlapI0lvoshixInpR8uRshg3YC4m0ZP;
    }

    private static void Method5076(PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL, PBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2) {
        pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL.Method3300();
        pBtjwi0ZRCaTfQdYS0S0jZE8Q8rauwqL2.Method3300();
    }

    private void Method5077() {
        this.Field13695 = !this.Field13695 ? (int)((long)1479683648 ^ (long)1479683649) : (int)835442704L ^ 0x31CBD810;
        this.Method5072();
    }

    private static String Method5078(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1474844687 ^ (long)-1474844687);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-806731799 ^ (long)-806732010);
            int n2 = ((int)-654295754L ^ 0xD9003D4D) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1147359028L ^ 0xBB9CB74F) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

