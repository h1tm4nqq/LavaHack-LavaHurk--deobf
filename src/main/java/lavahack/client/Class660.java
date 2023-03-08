//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.net.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class660 implements Runnable
{
    final Class1006 Field10812;
    private int Field10813;
    
    @Override
    public final void run() {
        Class1006.Method4049(this.Field10812, this.Field10812.Method4047(new URL("https://2bqueue.info/*"), "regular"));
        Class1006.Method4051(this.Field10812, this.Field10812.Method4047(new URL("https://2bqueue.info/*"), "prio"));
    }
    
    Class660(final Class1006 field10812) {
        this.Field10812 = field10812;
    }
    
    private static String Method2837(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5FC6 ^ 0xEE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
