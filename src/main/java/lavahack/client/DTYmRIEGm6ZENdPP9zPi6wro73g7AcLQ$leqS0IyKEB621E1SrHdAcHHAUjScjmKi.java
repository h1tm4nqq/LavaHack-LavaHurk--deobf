//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "kotlin.jvm.PlatformType", "invoke"})
final class DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ Field14757;
    private String Field14758 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method5755((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    public final void Method5755(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ.Method4177(this.Field14757);
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
        Intrinsics.checkExpressionValueIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"it");
        Packet packet = tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method982();
        if (!(packet instanceof CPacketPlayerTryUseItem)) {
            if (!(packet instanceof CPacketPlayerTryUseItemOnBlock)) return;
        }
        EntityPlayerSP entityPlayerSP = DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ.Method4178().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().item, (Object)Items.ENDER_PEARL)) return;
        DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ.Method4181(this.Field14757, System.currentTimeMillis());
    }

    DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ dTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ) {
        this.Field14757 = dTYmRIEGm6ZENdPP9zPi6wro73g7AcLQ;
    }

    private static String Method5756(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1220915331 ^ (long)1220915331);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1749687634 ^ (long)-1749687727);
            int n2 = (int)-429330616L ^ 0xE668EFCD;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1397583749 ^ (long)-1397583874) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

