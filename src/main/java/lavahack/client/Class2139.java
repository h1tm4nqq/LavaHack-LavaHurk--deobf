//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class2139 implements Supplier
{
    final Class1087 Field17789;
    private int Field17790;
    
    @Override
    public Object get() {
        return this.Method7710();
    }
    
    public final boolean Method7710() {
        return this.Field17789.Method4380().Method341() != Class786.Field11309 && this.Field17789.Method4380().Method341() != Class786.Field11316;
    }
    
    Class2139(final Class1087 field17789) {
        this.Field17789 = field17789;
    }
}
