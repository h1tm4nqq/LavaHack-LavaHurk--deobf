//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

interface Class118
{
    default double Method845(final float n) {
        if (n < 0.0f) {
            return 0.0;
        }
        if (n > 1.0f) {
            return 1.0;
        }
        return (double)this.Method849().Method1726(n);
    }
    
    default double Method846(final float n) {
        return 1.0 - this.Method845(n);
    }
    
    default double Method847(final float n, float n2, float n3) {
        if (n3 == n2) {
            return 0.0;
        }
        if (n3 < n2) {
            final float n4 = n3;
            n3 = n2;
            n2 = n4;
        }
        if (n <= 0.0f) {
            return n3;
        }
        if (n >= 1.0f) {
            return n2;
        }
        final double n5 = n2;
        final double n6 = n3;
        final double method846 = this.Method846(n);
        final double n7 = n6;
        final double n8 = n5;
        return n8 + (n7 - n8) * method846;
    }
    
    default double Method848(final float n) {
        if (n <= 0.0f) {
            return 1.0;
        }
        if (n >= 1.0f) {
            return 0.0;
        }
        return this.Method846(n);
    }
    
    Class1763 Method849();
}
