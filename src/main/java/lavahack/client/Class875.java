//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import io.netty.util.concurrent.*;
import net.minecraft.util.text.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0006" }, d2 = { "<anonymous>", "", "it", "Lio/netty/util/concurrent/Future;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "operationComplete" })
final class Class875 implements GenericFutureListener
{
    final Class1936 Field11681;
    final TextComponentString Field11682;
    private String Field11683 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Future future) {
        this.Field11681.Field16972.closeChannel((ITextComponent)this.Field11682);
    }
    
    Class875(final Class1936 field11681, final TextComponentString field11682) {
        this.Field11681 = field11681;
        this.Field11682 = field11682;
    }
}
