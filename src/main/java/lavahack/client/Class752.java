//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraftforge.fml.common.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/loadingscreen/progressbar/EventProgressBar;", "kotlin.jvm.PlatformType", "invoke" })
final class Class752 implements Class254
{
    final Class884 Field11201;
    private String Field11202 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method3136((Class279)o);
    }
    
    public final void Method3136(final Class279 class279) {
        if (Class884.Method3688(this.Field11201) != null) {
            final ProgressManager$ProgressBar method3688 = Class884.Method3688(this.Field11201);
            if (method3688 == null) {
                Intrinsics.throwNpe();
            }
            method3688.step(class279.Field9217);
        }
    }
    
    Class752(final Class884 field11201) {
        this.Field11201 = field11201;
    }
}
