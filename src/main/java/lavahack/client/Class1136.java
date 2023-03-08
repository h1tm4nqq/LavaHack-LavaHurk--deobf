//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class1136 implements Runnable
{
    final Class61 Field13148;
    private String Field13149 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        this.Field13148.Method495().addScheduledTask((Runnable)new Class1948(this));
    }
    
    Class1136(final Class61 field13148) {
        this.Field13148 = field13148;
    }
}
