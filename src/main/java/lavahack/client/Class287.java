//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$Any;", "kotlin.jvm.PlatformType", "invoke" })
final class Class287 implements Class254
{
    final Class730 Field9233;
    private String Field9234 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method1521((Class1193)o);
    }
    
    public final void Method1521(final Class1193 class1193) {
        if (Class730.Method3055(this.Field9233).contains(class1193.leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) {
            Class2142.Field17803.addScheduledTask((Runnable)new Class1815(this, class1193));
        }
    }
    
    Class287(final Class730 field9233) {
        this.Field9233 = field9233;
    }
}
