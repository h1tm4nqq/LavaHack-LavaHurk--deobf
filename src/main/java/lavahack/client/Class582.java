//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1269;
import lavahack.client.Class1432;
import lavahack.client.Class1745;
import lavahack.client.Class2007;
import lavahack.client.Class2145;
import lavahack.client.Class818;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class582
implements Runnable {
    final Class818 Field10481;
    final Minecraft Field10482;
    private int Field10483;

    @Override
    public final void run() {
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        Iterator iterator = this.Field10482.world.loadedEntityList.iterator();
        while (true) {
            Class2145 class2145;
            if (!iterator.hasNext()) {
                this.Field10482.addScheduledTask((Runnable)new Class1432(this, arrayList));
                return;
            }
            Entity entity = (Entity)iterator.next();
            if (Intrinsics.areEqual((Object)entity, (Object)this.Field10482.player)) continue;
            Entity entity2 = entity;
            Intrinsics.checkExpressionValueIsNotNull((Object)entity2, (String)"entity");
            Class2145 class21452 = class2145 = Class818.Method3483(this.Field10481, Class2007.Field17206, Class1269.Field13736.Method7776(entity2));
            if ((class21452 != null ? class21452.Method7723() : null) == null || class2145.Method7723().Method341() == Class1745.Field16010) continue;
            arrayList.add(entity);
        }
    }

    Class582(Class818 class818, Minecraft minecraft) {
        this.Field10481 = class818;
        this.Field10482 = minecraft;
    }

    private static String Method2532(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 254;
            cArray2[n] = (char)(cArray[n] ^ (0x2A2A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

