//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.jodah.typetools.*;

public class Class618 implements Class254
{
    private final Class Field10639;
    private final Class254 Field10640;
    private final Predicate[] Field10641;
    private final int Field10642;
    private String Field10643 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @SafeVarargs
    @SafeVarargs
    public Class618(final Class254 class254, final Predicate... array) {
        this(class254, 0, array);
    }
    
    @SafeVarargs
    @SafeVarargs
    public Class618(final Class254 field10640, final int field10641, final Predicate... field10642) {
        this.Field10640 = field10640;
        this.Field10642 = field10641;
        this.Field10639 = TypeResolver.resolveRawArgument((Class)Class254.class, (Class)field10640.getClass());
        this.Field10641 = field10642;
    }
    
    public Class Method2651() {
        return this.Field10639;
    }
    
    public int Method2652() {
        return this.Field10642;
    }
    
    public void Method979(final Object o) {
        if (this.Field10641.length > 0) {
            final Predicate[] field10641 = this.Field10641;
            for (int length = field10641.length, i = 0; i < length; ++i) {
                if (!field10641[i].test(o)) {
                    return;
                }
            }
        }
        this.Field10640.Method979(o);
    }
}
