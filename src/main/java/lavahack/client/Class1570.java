//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.*;
import com.mojang.authlib.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class1570 implements Runnable
{
    public static final Class1570 Field15324;
    private String Field15325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        final Class62 method1450 = Class273.Method1450();
        final StringBuilder append = new StringBuilder().append("clientstatus ");
        final Session session = Class2142.Field17803.session;
        Intrinsics.checkExpressionValueIsNotNull((Object)session, "mc.session");
        final GameProfile getProfile = session.getProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)getProfile, "mc.session.profile");
        method1450.Method541(append.append(getProfile.getId()).append(" 2").toString());
        Class273.Method1450().Method541("removemanager " + Class1796.Field16231);
    }
    
    static {
        Field15324 = new Class1570();
    }
    
    private static String Method6195(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x324 ^ 0x6F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
