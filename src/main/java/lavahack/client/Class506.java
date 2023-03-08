//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/entity/Entity;", "kotlin.jvm.PlatformType", "test" })
final class Class506 implements Predicate
{
    final BlockPos Field10129;
    private String Field10130 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public boolean test(final Object o) {
        return this.Method2340((Entity)o);
    }
    
    public final boolean Method2340(final Entity entity) {
        return entity instanceof EntityEnderCrystal && entity.getDistanceSq(this.Field10129) < 1;
    }
    
    Class506(final BlockPos field10129) {
        this.Field10129 = field10129;
    }
}
