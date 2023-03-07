//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketInput
 */
package lavahack.client;

import com.kisman.cc.event.Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77;
import lavahack.client.RG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketInput;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventPlayerMotionUpdate$Riding;", "kotlin.jvm.PlatformType", "invoke"})
final class gC2c4gQ0AmKqru437TpqjOGBLVJ6ai2A$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final gC2c4gQ0AmKqru437TpqjOGBLVJ6ai2A$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11868 = new gC2c4gQ0AmKqru437TpqjOGBLVJ6ai2A$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field11869 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3822((RG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object);
    }

    public final void Method3822(RG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        RG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        Intrinsics.checkExpressionValueIsNotNull((Object)rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, (String)"it");
        if (rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method160() != Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13746) return;
        if (!XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method35()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method5551();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"PingBypass.protocol");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() != PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77.Field17038) return;
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.connection.sendPacket((Packet)new CPacketInput(rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1749(), rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1751(), rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1753(), rG0Ef4LzpvaRaWkCktLl94QMei9n80rd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1755()));
        EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        Entity entity = entityPlayerSP.getLowestRidingEntity();
        if ((Intrinsics.areEqual((Object)entity, (Object)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player) ^ ((int)-1509933283L ^ 0xA6003F1C)) == 0) return;
        if (!entity.canPassengerSteer()) return;
    }

    gC2c4gQ0AmKqru437TpqjOGBLVJ6ai2A$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method3823(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1589299932L ^ 0xA1453524;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1659639928 ^ (long)1659639943);
            int n2 = (int)((long)1018844621 ^ (long)1018844568) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-524110091 ^ (long)-524123124) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

