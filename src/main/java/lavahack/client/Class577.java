//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class577 implements Runnable
{
    public static final Class577 Field10465;
    private String Field10466 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        final Class44 method6013 = Class1497.Method6013(Class1497.Field15034);
        Intrinsics.checkExpressionValueIsNotNull((Object)method6013, "debug2");
        if (method6013.Method365()) {
            System.out.println((Object)"Update 3");
        }
        final Class1497 field15034 = Class1497.Field15034;
        final EntityPlayer method6014 = Class1497.Method6015(Class1497.Field15034).Method496();
        if (method6014 == null) {
            Intrinsics.throwNpe();
        }
        Class1497.Method6014(field15034, (Entity)method6014);
        Class1497.Method6016(Class1497.Field15034);
        Class1497.Method6017(Class1497.Field15034);
    }
    
    static {
        Field10465 = new Class577();
    }
    
    private static String Method2529(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x41D3 ^ 0x35));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
