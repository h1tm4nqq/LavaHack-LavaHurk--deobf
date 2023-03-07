//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.wfq6g7eP125PNHmXSJva2wZAtBH7JgUG;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J0\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u0012R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0006j\b\u0012\u0004\u0012\u00020\u000e`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2={"Lcom/kisman/cc/settings/util/EntityESPRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "entities", "Ljava/util/ArrayList;", "Lnet/minecraft/entity/Entity;", "Lkotlin/collections/ArrayList;", "groups", "Lcom/kisman/cc/settings/types/SettingGroup;", "getModule", "()Lcom/kisman/cc/features/module/Module;", "settings", "Lcom/kisman/cc/settings/EntityESPSetting;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "draw", "", "ticks", "", "drawEntity", "entity", "getSettingByType", "typeS", "Lcom/kisman/cc/settings/util/EntityESPRendererPattern$SettingTypes;", "typeE", "Lcom/kisman/cc/util/enums/EntityESPTypes;", "getSettingsByType", "group", "patternGroup", "init", "onEnable", "SettingTypes", "kisman.cc"})
public final class XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0 {
    private final ArrayList Field11490;
    private final ArrayList Field11491;
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field11492;
    private ArrayList Field11493;
    @NotNull
    private final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field11494;
    private String Field11495 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method3475() {
        for (Object object : this.Field11490) {
            this.Field11494.Method24((xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl)object);
        }
        Iterator iterator = this.Field11491.iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR)iterator.next();
            if (((PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR)object).Method7723() != null) {
                this.Field11494.Method23(((PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR)object).Method7723());
                continue;
            }
            if (((PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR)object).Method7724() == null) continue;
            ((PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR)object).Method7724().Method3789();
        }
    }

    private final ArrayList Method3476(oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2.name() + " Mode", this.Field11494, wfq6g7eP125PNHmXSJva2wZAtBH7JgUG.Field16010);
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this.Field11494).Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3)).Method771(new XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2))).Method773(oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2.name() + " Cubic")).Method3788();
        Object[] objectArray = new PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR[(int)((long)1292478920 ^ (long)1292478923)];
        objectArray[(int)((long)-1005705776 ^ (long)-1005705776)] = new PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2), null, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2, XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17206);
        int n = (int)((long)1165279303 ^ (long)1165279302);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2.name() + " Box1 Color", this.Field11494, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2.name() + " Box1 Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-2043030588L ^ 0x8639D33B, (int)((long)-642451645 ^ (long)-642451524), (int)((long)-186674664 ^ (long)-186674457), (int)((long)2111133774 ^ (long)2111133873))).Method313(new XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"${typeE.name} B\u2026 == EntityESPModes.Box1 }");
        objectArray[n] = new PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3), null, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2, XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17207);
        objectArray[((int)1292278317L ^ 0x4D069A2C) << 1] = new PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR(null, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2, XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17208);
        return new ArrayList(CollectionsKt.listOf((Object[])objectArray));
    }

    public final void Method3477() {
        this.Field11492.Method2004();
    }

    public final void Method3478(float f) {
        Minecraft minecraft = Minecraft.getMinecraft();
        this.Field11492.Method2005(new XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, minecraft));
        Iterator iterator = this.Field11493.iterator();
        while (iterator.hasNext()) {
            Entity entity;
            Entity entity2 = entity = (Entity)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)entity2, (String)"entity");
            this.Method3479(f, entity2);
        }
    }

    private final void Method3479(float f, Entity entity) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR = this.Method3481(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17206, entity);
        if (pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR.Method7723();
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 == null) {
            Intrinsics.throwNpe();
        }
        if ((qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3).Method341() == wfq6g7eP125PNHmXSJva2wZAtBH7JgUG.Field16010) return;
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == wfq6g7eP125PNHmXSJva2wZAtBH7JgUG.Field16010) {
            entity.glowing = (int)((long)87270541 ^ (long)87270541);
            return;
        }
        if (enum_ == wfq6g7eP125PNHmXSJva2wZAtBH7JgUG.Field16011) {
            entity.glowing = (int)((long)44831816 ^ (long)44831817);
            return;
        }
        if (enum_ == wfq6g7eP125PNHmXSJva2wZAtBH7JgUG.Field16012) {
            entity.glowing = (int)((long)2101237456 ^ (long)2101237456);
            PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR2 = this.Method3481(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17207, entity);
            if (pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR2 == null) {
                Intrinsics.throwNpe();
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR2.Method7723();
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 == null) {
                Intrinsics.throwNpe();
            }
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method339();
            exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3466(entity, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17325, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17326, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17327, 1.0f, f);
            return;
        }
        if (enum_ != wfq6g7eP125PNHmXSJva2wZAtBH7JgUG.Field16013) return;
        entity.glowing = (int)((long)36059745 ^ (long)36059745);
        PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR3 = this.Method3481(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17208, entity);
        if (pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR3 == null) {
            Intrinsics.throwNpe();
        }
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR3.Method7724();
        if (mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK == null) {
            Intrinsics.throwNpe();
        }
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"entity.entityBoundingBox");
        mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3804(axisAlignedBB);
    }

    private final PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR Method3480(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2) {
        PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR;
        Iterator iterator = this.Field11491.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR = (PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR)iterator.next()).Method7725() != oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2 || pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR.Method7726() != xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        return pxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR;
    }

    private final PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR Method3481(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, Entity entity) {
        return this.Method3480(xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW.Field13736.Method7776(entity));
    }

    @NotNull
    @NotNull
    public final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Method3482() {
        return this.Field11494;
    }

    public XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        this.Field11494 = wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        this.Field11490 = new ArrayList();
        this.Field11491 = new ArrayList();
        this.Field11492 = new Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ(this.Field11494);
        this.Field11493 = new ArrayList();
        oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW[] oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygWArray = oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW.values();
        int n = oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygWArray.length;
        int n2 = (int)((long)851930357 ^ (long)851930357);
        while (n2 < n) {
            oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2 = oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygWArray[n2];
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2.name(), this.Field11494));
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cubic Renderer", this.Field11494)));
            this.Field11490.add(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2);
            this.Field11490.add(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3);
            this.Field11491.addAll(this.Method3476(oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3));
            ++n2;
        }
    }

    public static final PxaE6W3QN6Mr4T8qBIyPQ94ltlbcOcPR Method3483(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0 xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0, XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2) {
        return xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0.Method3480(xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, oXqKIP8HyEI9gXwR1SYdAuWEZKB7oygW2);
    }

    public static final ArrayList Method3484(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0 xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0) {
        return xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0.Field11493;
    }

    public static final void Method3485(XZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0 xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0, ArrayList arrayList) {
        xZhbkKWOxhGirIAEY9LdQl5IwNLOMiA0.Field11493 = arrayList;
    }

    private static String Method3486(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2007892870 ^ (long)-2007892870);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)637059536L ^ 0x25F8C12F);
            int n2 = (int)-334890879L ^ 0xEC09F852;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1200923626 ^ (long)1200946109) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

