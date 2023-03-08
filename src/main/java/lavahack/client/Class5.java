//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005?\u0006\u0002\u0010\u0007?\u0006\b" }, d2 = { "Lcom/kisman/cc/pingbypass/server/gui/PingBypassFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "cat", "Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;", "x", "", "y", "(Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;II)V", "kisman.cc" })
public final class Class5 extends Class354
{
    private int Field7832;
    
    public Class5(@NotNull @NotNull final Class2130 class2130, final int n, final int n2) {
        Intrinsics.checkParameterIsNotNull((Object)class2130, "cat");
        super(class2130.Method7667(), n, n2, true);
        int field14604 = Class1419.Field14604;
        int n3 = 0;
        final Iterator iterator = Class1338.Field14116.Method5392(class2130).iterator();
        while (iterator.hasNext()) {
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new Class1429((Class42)iterator.next(), n, n2, field14604, n3));
            field14604 += Class1419.Field14604;
            ++n3;
        }
    }
    
    private static String Method74(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5198 ^ 0x45));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
