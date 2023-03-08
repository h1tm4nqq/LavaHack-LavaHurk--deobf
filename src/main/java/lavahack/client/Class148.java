//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n?\u0006\u0002\b\b" }, d2 = { "limitMotion", "", "currentMotion", "positiveLimit", "negativeLimit", "positiveFlag", "", "negativeFlag", "invoke" })
final class Class148 extends Lambda implements Function5
{
    public static final Class148 Field8575;
    private int Field8576;
    
    public Object invoke(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(((Number)o).doubleValue(), ((Number)o2).doubleValue(), ((Number)o3).doubleValue(), (boolean)o4, (boolean)o5);
    }
    
    public final double leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final double n, final double n2, final double n3, final boolean b, final boolean b2) {
        if (n > n2 && b) {
            return n2;
        }
        if (n < -n3 && b2) {
            return -n3;
        }
        return n;
    }
    
    Class148() {
        super(5);
    }
    
    static {
        Field8575 = new Class148();
    }
}
