//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class224 implements Supplier
{
    final Class2072 Field8966;
    private String Field8967 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method1274();
    }
    
    public final boolean Method1274() {
        return this.Field8966.Method7603().Method341() != Class786.Field11309 && this.Field8966.Method7603().Method341() != Class786.Field11316;
    }
    
    Class224(final Class2072 field8966) {
        this.Field8966 = field8966;
    }
}
