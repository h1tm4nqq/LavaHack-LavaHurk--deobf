//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1363 implements Supplier
{
    final Class44 Field14202;
    private int Field14203;
    
    @Override
    public Object get() {
        return this.Method5443();
    }
    
    public final boolean Method5443() {
        return this.Field14202.Method341() == Class1745.Field16012;
    }
    
    Class1363(final Class44 field14202) {
        this.Field14202 = field14202;
    }
}
