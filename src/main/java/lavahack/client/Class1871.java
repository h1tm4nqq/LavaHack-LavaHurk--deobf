//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class1871 implements Runnable
{
    final Class737 Field16589;
    final Packet Field16590;
    private String Field16591 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        final Minecraft field17803 = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17803, "mc");
        if (field17803.getConnection() != null) {
            final Class737 field17804 = this.Field16589;
            final Packet field17805 = this.Field16590;
            final Minecraft field17806 = Class2142.Field17803;
            Intrinsics.checkExpressionValueIsNotNull((Object)field17806, "mc");
            final NetHandlerPlayClient getConnection = field17806.getConnection();
            if (getConnection == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull((Object)getConnection, "mc.connection!!");
            Class737.Method3063(field17804, field17805, getConnection);
        }
    }
    
    Class1871(final Class737 field16589, final Packet field16590) {
        this.Field16589 = field16589;
        this.Field16590 = field16590;
    }
    
    private static String Method6968(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x335B ^ 0xA0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
