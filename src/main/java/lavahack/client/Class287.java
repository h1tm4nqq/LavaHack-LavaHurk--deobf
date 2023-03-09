//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import lavahack.client.Class1193;
import lavahack.client.Class1815;
import lavahack.client.Class254;
import lavahack.client.Class730;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$Any;", "kotlin.jvm.PlatformType", "invoke"})
final class Class287
implements Class254 {
    final Class730 Field9233;
    private String Field9234 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method1521((Class1193)object);
    }

    public final void Method1521(Class1193 class1193) {
        if (!Class730.Method3055(this.Field9233).contains(class1193.leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) return;
        Class2142.Field17803.addScheduledTask((Runnable)new Class1815(this, class1193));
    }

    Class287(Class730 class730) {
        this.Field9233 = class730;
    }
}

