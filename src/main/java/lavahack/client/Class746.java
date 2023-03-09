//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.function.Function;
import kotlin.Metadata;
import lavahack.client.Class1281;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lnet/minecraft/util/math/BlockPos;", "apply", "(Lnet/minecraft/util/math/BlockPos;)Ljava/lang/Double;"})
final class Class746
implements Function {
    final boolean Field11166;
    final EntityPlayer Field11167;
    private String Field11168 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object apply(Object object) {
        return this.Method3087((BlockPos)object);
    }

    public final Double Method3087(BlockPos blockPos) {
        Double d;
        if (this.Field11166) {
            d = Class1281.Method5173().player.getDistanceSq(blockPos);
            return d;
        }
        d = this.Field11167.getDistanceSq(blockPos);
        return d;
    }

    Class746(boolean bl, EntityPlayer entityPlayer) {
        this.Field11166 = bl;
        this.Field11167 = entityPlayer;
    }
}

