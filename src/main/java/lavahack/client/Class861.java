//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/entity/Entity;", "kotlin.jvm.PlatformType", "test" })
final class Class861 implements Predicate
{
    public static final Class861 Field11635;
    private String Field11636 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public boolean test(final Object o) {
        return this.Method3645((Entity)o);
    }
    
    public final boolean Method3645(final Entity entity) {
        if (entity instanceof EntityEnderCrystal) {
            final EntityPlayerSP player = Class1281.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (entity.getDistanceSq(player.getPosition().up(3)) < 10) {
                return true;
            }
        }
        return false;
    }
    
    static {
        Field11635 = new Class861();
    }
    
    private static String Method3646(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x14FB ^ 0x4A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
