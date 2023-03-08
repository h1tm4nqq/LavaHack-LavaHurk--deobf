//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1845 implements Class254
{
    final Class1685 Field16509;
    private int Field16510;
    
    @Override
    public void Method979(final Object o) {
        this.Method6940((Class1477)o);
    }
    
    public final void Method6940(final Class1477 e) {
        if (Class218.Field8954.Method1264()) {
            Class1685.Method6488(this.Field16509).add(e);
        }
    }
    
    Class1845(final Class1685 field16509) {
        this.Field16509 = field16509;
    }
}
