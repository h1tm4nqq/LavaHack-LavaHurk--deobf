//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/features/module/client/PauseBaritone;", "Lcom/kisman/cc/features/module/Module;", "()V", "onEnable", "", "kisman.cc" })
public final class Class997 extends Class42
{
    private String Field12289 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        if (Method4034().player != null && Method4034().world != null) {
            if (Class1495.Method5990()) {
                Class1495.Method5989();
                Class1393.Method5503().Method1886("Successfully stopped baritone!");
            }
            else {
                Class1393.Method5504().Method1886("Baritone have any active processes!");
            }
        }
        super.Method21(false);
    }
    
    public Class997() {
        super("PauseBaritone", "Pauses current baritone process.", Class97.Field8339);
    }
    
    public static final Minecraft Method4034() {
        return Class42.Field8052;
    }
    
    public static final void Method4035(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1FC4 ^ 0x17));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
