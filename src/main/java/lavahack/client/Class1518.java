//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

class Class1518 extends Class816
{
    private Class684[] Field15109;
    private String Field15110 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1518(final int... array) {
        super(array);
    }
    
    @Override
    public Class684[] Method3469() {
        this.Method6048();
        return Arrays.copyOf(this.Field15109, this.Field15109.length);
    }
    
    @Override
    public Class684 Method3470(final int n) {
        this.Method6048();
        return this.Field15109[n];
    }
    
    @Override
    public Class684 Method3471() {
        this.Method6048();
        final Class684[] field15109 = this.Field15109;
        for (int length = field15109.length, i = 0; i < length; ++i) {
            if (field15109[i] == Class684.Field10896) {
                return Class684.Field10896;
            }
        }
        return Class684.Field10897;
    }
    
    @Override
    public Class684 Method3472() {
        this.Method6048();
        final Class684[] field15109 = this.Field15109;
        for (int length = field15109.length, i = 0; i < length; ++i) {
            if (field15109[i] == Class684.Field10897) {
                return Class684.Field10897;
            }
        }
        return Class684.Field10896;
    }
    
    private void Method6048() {
        final Class684[] field15109 = new Class684[this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.length];
        for (int i = 0; i < this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.length; ++i) {
            field15109[i] = Class684.Method2878(Class655.Method2829(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[i]));
        }
        this.Field15109 = field15109;
    }
}
