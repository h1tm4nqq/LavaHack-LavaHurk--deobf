//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import net.minecraft.entity.player.*;
import kotlin.jvm.internal.*;
import net.minecraft.world.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class207 implements Runnable
{
    final Class1285 Field8898;
    private int Field8899;
    
    @Override
    public final void run() {
        for (final EntityPlayer entityPlayer : Class2142.Field17803.world.playerEntities) {
            final Class1285 field8898 = this.Field8898;
            final EntityPlayer entityPlayer2 = entityPlayer;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayer2, "player");
            Class2032 method5225 = field8898.Method5225(entityPlayer2);
            if (entityPlayer.isDead && method5225 != null) {
                method5225.Field17351 = false;
            }
            else {
                Label_0129: {
                    if (method5225 == null) {
                        final Integer n = Class1285.Method5226(this.Field8898).get();
                        if (n != null) {
                            if (n == 0) {
                                break Label_0129;
                            }
                        }
                        method5225 = new Class2032((World)Class2142.Field17803.world, entityPlayer);
                        ((Class2051)entityPlayer).Method2144(method5225);
                    }
                }
                final Class1285 field8899 = this.Field8898;
                final Class2032 class2032 = method5225;
                if (class2032 == null) {
                    Intrinsics.throwNpe();
                }
                final Number value = Class1285.Method5226(this.Field8898).get();
                Intrinsics.checkExpressionValueIsNotNull((Object)value, "ticks.get()");
                Class1285.Method5227(field8899, class2032, value.intValue());
            }
        }
    }
    
    Class207(final Class1285 field8898) {
        this.Field8898 = field8898;
    }
    
    private static String Method1237(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7D1F ^ 0x11));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
