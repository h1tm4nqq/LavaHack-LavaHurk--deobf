//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.entity.player.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n?\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "kotlin.jvm.PlatformType", "get" })
final class Class1423 implements Supplier
{
    public static final Class1423 Field14620;
    private String Field14621 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Object get() {
        return this.Method5686();
    }
    
    public final String Method5686() {
        String string;
        if (Class1497.Method6015(Class1497.Field15034).Method496() != null) {
            final StringBuilder append = new StringBuilder().append('[');
            final EntityPlayer method496 = Class1497.Method6015(Class1497.Field15034).Method496();
            string = append.append((method496 != null) ? method496.getName() : null).append(']').toString();
        }
        else {
            string = "";
        }
        return string;
    }
    
    static {
        Field14620 = new Class1423();
    }
    
    private static String Method5687(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3DAC ^ 0x8E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
