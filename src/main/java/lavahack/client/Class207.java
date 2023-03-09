//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1285;
import lavahack.client.Class2032;
import lavahack.client.Class2051;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class207
implements Runnable {
    final Class1285 Field8898;
    private int Field8899;

    @Override
    public final void run() {
        Iterator iterator = Class2142.Field17803.world.playerEntities.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer;
            EntityPlayer entityPlayer2 = entityPlayer = (EntityPlayer)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayer2, (String)"player");
            Class2032 class2032 = this.Field8898.Method5225(entityPlayer2);
            if (entityPlayer.isDead && class2032 != null) {
                class2032.Field17351 = false;
                continue;
            }
            if (class2032 == null) {
                Integer n = (Integer)Class1285.Method5226(this.Field8898).get();
                if (n == null || n != 0) {
                    class2032 = new Class2032((World)Class2142.Field17803.world, entityPlayer);
                    ((Class2051)entityPlayer).Method2144(class2032);
                }
            }
            Class2032 class20322 = class2032;
            if (class20322 == null) {
                Intrinsics.throwNpe();
            }
            Object t = Class1285.Method5226(this.Field8898).get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"ticks.get()");
            Class1285.Method5227(this.Field8898, class20322, ((Number)t).intValue());
        }
    }

    Class207(Class1285 class1285) {
        this.Field8898 = class1285;
    }

    private static String Method1237(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 17;
            cArray2[n] = (char)(cArray[n] ^ (0x7D1F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

