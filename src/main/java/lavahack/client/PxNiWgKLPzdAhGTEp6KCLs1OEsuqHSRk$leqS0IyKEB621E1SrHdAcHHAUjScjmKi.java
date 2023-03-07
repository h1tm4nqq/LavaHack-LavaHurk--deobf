//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.init.Items
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "event", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "invoke"})
final class PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk Field11294;
    private String Field11295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3268((TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object);
    }

    public final void Method3268(@NotNull @NotNull TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        Intrinsics.checkParameterIsNotNull((Object)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, (String)"event");
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayerTryUseItemOnBlock)) return;
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"Minecraft.getMinecraft().player");
        if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().getItem(), (Object)Items.END_CRYSTAL)) {
            EntityPlayerSP entityPlayerSP2 = Minecraft.getMinecraft().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"Minecraft.getMinecraft().player");
            if (!Intrinsics.areEqual((Object)entityPlayerSP2.getHeldItemOffhand().getItem(), (Object)Items.END_CRYSTAL)) return;
        }
        PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk pxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk = this.Field11294;
        int n = pxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk.Method3985();
        pxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk.Method3986(n + ((int)-1263921911L ^ 0xB4AA1508));
    }

    PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(PxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk pxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk) {
        this.Field11294 = pxNiWgKLPzdAhGTEp6KCLs1OEsuqHSRk;
    }

    private static String Method3269(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1038121150L ^ 0xC21F8742;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)59709160L ^ 0x38F1617);
            int n2 = (int)((long)981102158 ^ (long)981102227);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1612699036 ^ (long)1612699325) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

