//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1262 implements Supplier
{
    final Class1087 Field13710;
    private String Field13711 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method5095();
    }
    
    public final boolean Method5095() {
        return this.Field13710.Method4380().Method341() == Class786.Field11316 || this.Field13710.Method4380().Method341() == Class786.Field11318 || this.Field13710.Method4380().Method341() == Class786.Field11319;
    }
    
    Class1262(final Class1087 field13710) {
        this.Field13710 = field13710;
    }
}
