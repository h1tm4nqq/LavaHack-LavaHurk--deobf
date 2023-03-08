//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "get" })
final class Class1642 implements Supplier
{
    final Class1913 Field15637;
    private String Field15638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method6378();
    }
    
    @NotNull
    @NotNull
    public final String Method6378() {
        return new StringBuilder().append('[').append(this.Field15637.Method7103().Method341()).append(']').toString();
    }
    
    Class1642(final Class1913 field15637) {
        this.Field15637 = field15637;
    }
}
