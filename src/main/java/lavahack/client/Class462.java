//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class462 implements Supplier
{
    final Class1612 Field9922;
    private int Field9923;
    
    @Override
    public Object get() {
        return this.Method2175();
    }
    
    public final boolean Method2175() {
        return this.Field9922.Method3765().Method341() != Class786.Field11309 && this.Field9922.Method3765().Method341() != Class786.Field11316;
    }
    
    Class462(final Class1612 field9922) {
        this.Field9922 = field9922;
    }
}
