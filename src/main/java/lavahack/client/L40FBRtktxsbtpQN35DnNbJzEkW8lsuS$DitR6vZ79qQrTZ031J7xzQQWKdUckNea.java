//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/entity/Entity;", "kotlin.jvm.PlatformType", "test"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DitR6vZ79qQrTZ031J7xzQQWKdUckNea
implements Predicate {
    final BlockPos Field10129;
    private String Field10130 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean test(Object object) {
        return this.Method2340((Entity)object);
    }

    public final boolean Method2340(Entity entity) {
        int n;
        if (entity instanceof EntityEnderCrystal && entity.getDistanceSq(this.Field10129) < (double)((int)-727428355L ^ 0xD4A452FC)) {
            n = (int)902731370L ^ 0x35CE966B;
            return n != 0;
        }
        n = (int)-153864176L ^ 0xF6D43810;
        return n != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DitR6vZ79qQrTZ031J7xzQQWKdUckNea(BlockPos blockPos) {
        this.Field10129 = blockPos;
    }
}

