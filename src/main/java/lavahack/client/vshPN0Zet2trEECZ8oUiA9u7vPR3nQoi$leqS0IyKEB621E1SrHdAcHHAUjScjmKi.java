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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH;
import lavahack.client.RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl;
import lavahack.client.vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi Field8898;
    private int Field8899;

    @Override
    public final void run() {
        Iterator iterator = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.playerEntities.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer;
            EntityPlayer entityPlayer2 = entityPlayer = (EntityPlayer)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayer2, (String)"player");
            RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl = this.Field8898.Method5225(entityPlayer2);
            if (entityPlayer.isDead && rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl != null) {
                rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl.Field17351 = (int)((long)1278008889 ^ (long)1278008889);
                continue;
            }
            if (rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl == null) {
                Integer n = (Integer)vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi.Method5226(this.Field8898).get();
                if (n == null || n != 0) {
                    rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl = new RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl((World)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world, entityPlayer);
                    ((DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH)entityPlayer).Method2144(rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl);
                }
            }
            RIhfMBGyAK9DkxAEjgwAXL20KiC6veIl rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl2 = rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl;
            if (rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl2 == null) {
                Intrinsics.throwNpe();
            }
            Object t = vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi.Method5226(this.Field8898).get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"ticks.get()");
            vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi.Method5227(this.Field8898, rIhfMBGyAK9DkxAEjgwAXL20KiC6veIl2, ((Number)t).intValue());
        }
    }

    vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi2) {
        this.Field8898 = vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi2;
    }

    private static String Method1237(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1268635188 ^ (long)-1268635188);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1485589130 ^ (long)1485589109);
            int n2 = (int)((long)2056275054 ^ (long)2056275071);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1891700439 ^ (long)1891726280) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

