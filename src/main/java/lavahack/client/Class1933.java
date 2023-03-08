//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1933 implements Supplier
{
    final Class2072 Field16964;
    private String Field16965 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method7189();
    }
    
    public final boolean Method7189() {
        return this.Field16964.Method7603().Method341() == Class786.Field11316 || this.Field16964.Method7603().Method341() == Class786.Field11318 || this.Field16964.Method7603().Method341() == Class786.Field11319;
    }
    
    Class1933(final Class2072 field16964) {
        this.Field16964 = field16964;
    }
}
