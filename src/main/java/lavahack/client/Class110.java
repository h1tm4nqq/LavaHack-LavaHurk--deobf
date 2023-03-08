//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class110 implements Supplier
{
    final Class2072 Field8387;
    private int Field8388;
    
    @Override
    public Object get() {
        return this.Method827();
    }
    
    public final boolean Method827() {
        return this.Field8387.Method7605().Method365();
    }
    
    Class110(final Class2072 field8387) {
        this.Field8387 = field8387;
    }
}
