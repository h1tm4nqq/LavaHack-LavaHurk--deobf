//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class570 implements Supplier
{
    final Class411 Field10438;
    private int Field10439;
    
    @Override
    public Object get() {
        return this.Method2517();
    }
    
    public final boolean Method2517() {
        return this.Field10438.Method2001().Method365();
    }
    
    Class570(final Class411 field10438) {
        this.Field10438 = field10438;
    }
}