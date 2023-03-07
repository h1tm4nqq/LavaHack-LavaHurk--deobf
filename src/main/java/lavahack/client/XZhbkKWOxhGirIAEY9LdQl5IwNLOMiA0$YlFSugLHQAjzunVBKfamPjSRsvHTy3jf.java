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
import lavahack.client.PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR;
import lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0;
import lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$1;
import lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW;
import lavahack.client.wfq6g7eP125PNHmXSJva2wZAtBH7JgUG;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Runnable {
    final XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0 Field10481;
    final Minecraft Field10482;
    private int Field10483;

    @Override
    public final void run() {
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        Iterator iterator = this.Field10482.world.loadedEntityList.iterator();
        while (true) {
            PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR;
            if (!iterator.hasNext()) {
                this.Field10482.addScheduledTask((Runnable)new XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$1(this, arrayList));
                return;
            }
            Entity entity = (Entity)iterator.next();
            if (Intrinsics.areEqual((Object)entity, (Object)this.Field10482.player)) continue;
            Entity entity2 = entity;
            Intrinsics.checkExpressionValueIsNotNull((Object)entity2, (String)"entity");
            PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR2 = pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR = XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0.Method3483(this.Field10481, XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17206, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW.Field13736.Method7776(entity2));
            if ((pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR2 != null ? pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR2.Method7723() : null) == null || pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR.Method7723().Method341() == wfq6g7eP125PNHmXSJva2wZAtBH7JgUG.Field16010) continue;
            arrayList.add(entity);
        }
    }

    XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0 xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0, Minecraft minecraft) {
        this.Field10481 = xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0;
        this.Field10482 = minecraft;
    }

    private static String Method2532(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1345361517 ^ (long)-1345361517);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)246425606 ^ (long)246425849);
            int n2 = (int)((long)-1106378382 ^ (long)-1106378483) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)398464632 ^ (long)398459757) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

