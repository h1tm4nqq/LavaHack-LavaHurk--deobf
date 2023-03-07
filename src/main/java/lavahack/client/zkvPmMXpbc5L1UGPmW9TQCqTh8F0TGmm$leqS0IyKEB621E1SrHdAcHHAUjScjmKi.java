//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import lavahack.client.zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm;
import net.minecraft.entity.Entity;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm Field10267;
    private String Field10268 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world == null) return;
        Entity entity = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getEntityByID(zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm.Method4931(this.Field10267));
        if (entity == null) return;
        entity.setPosition(zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm.Method4933(this.Field10267), zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm.Method4935(this.Field10267), zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm.Method4937(this.Field10267));
    }

    zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm2) {
        this.Field10267 = zkvPmMXpbc5L1UGPmW9TQCqTh8F0TGmm2;
    }
}

