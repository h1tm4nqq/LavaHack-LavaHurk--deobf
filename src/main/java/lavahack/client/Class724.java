//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/features/module/combat/autocrystalpvp/PlaceInfo;", "kotlin.jvm.PlatformType", "applyAsDouble" })
final class Class724 implements ToDoubleFunction
{
    public static final Class724 Field11083;
    private int Field11084;
    
    @Override
    public double applyAsDouble(final Object o) {
        return this.Method3038((Class387)o);
    }
    
    public final double Method3038(final Class387 class387) {
        return class387.Method1868();
    }
    
    static {
        Field11083 = new Class724();
    }
}
