//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1307 implements Supplier
{
    final Class1612 Field13971;
    private int Field13972;
    
    @Override
    public Object get() {
        return this.Method5307();
    }
    
    public final boolean Method5307() {
        final Class85 field8286 = Class85.Field8286;
        final Class84 class84 = new Class84(this);
        return this.Field13971.Method780().Field8061 && class84.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }
    
    Class1307(final Class1612 field13971) {
        this.Field13971 = field13971;
    }
}
