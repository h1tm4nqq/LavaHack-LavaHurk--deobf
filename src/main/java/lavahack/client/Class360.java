//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "<anonymous>", "", "get", "()Ljava/lang/Boolean;" })
final class Class360 implements Supplier
{
    final Class1444 Field9505;
    private String Field9506 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method1805();
    }
    
    @NotNull
    @NotNull
    public final Boolean Method1805() {
        return this.Field9505.Method5765().get();
    }
    
    Class360(final Class1444 field9505) {
        this.Field9505 = field9505;
    }
}
