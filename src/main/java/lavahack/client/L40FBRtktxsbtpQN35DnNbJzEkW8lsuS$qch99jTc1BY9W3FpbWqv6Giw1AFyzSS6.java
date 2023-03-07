//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/entity/Entity;", "kotlin.jvm.PlatformType", "test"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6
implements Predicate {
    public static final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 Field11635 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6();
    private String Field11636 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean test(Object object) {
        return this.Method3645((Entity)object);
    }

    public final boolean Method3645(Entity entity) {
        int n;
        if (entity instanceof EntityEnderCrystal) {
            EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (entity.getDistanceSq(entityPlayerSP.getPosition().up((int)((long)-2134814620 ^ (long)-2134814617))) < (double)(((int)1682288669L ^ 0x6445B018) << 1)) {
                n = (int)((long)1445902993 ^ (long)1445902992);
                return n != 0;
            }
        }
        n = (int)1583777482L ^ 0x5E6686CA;
        return n != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6() {
    }

    private static String Method3646(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1720513770L ^ 0x99730B16;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1976665139L ^ 0x75D184CC);
            int n2 = ((int)1802665411L ^ 0x6B727DE6) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1371762179L ^ 0x51C37AF8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

