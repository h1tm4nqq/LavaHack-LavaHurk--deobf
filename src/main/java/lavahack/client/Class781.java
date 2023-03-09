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
import lavahack.client.Class254;
import lavahack.client.Class805;
import lavahack.client.Class979;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"<anonymous>", "", "event", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "invoke"})
final class Class781
implements Class254 {
    final Class979 Field11294;
    private String Field11295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3268((Class805)object);
    }

    public final void Method3268(@NotNull @NotNull Class805 class805) {
        Intrinsics.checkParameterIsNotNull((Object)class805, (String)"event");
        if (!(class805.Method982() instanceof CPacketPlayerTryUseItemOnBlock)) return;
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"Minecraft.getMinecraft().player");
        if (!Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemMainhand().getItem(), (Object)Items.END_CRYSTAL)) {
            EntityPlayerSP entityPlayerSP2 = Minecraft.getMinecraft().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"Minecraft.getMinecraft().player");
            if (!Intrinsics.areEqual((Object)entityPlayerSP2.getHeldItemOffhand().getItem(), (Object)Items.END_CRYSTAL)) return;
        }
        Class979 class979 = this.Field11294;
        int n = class979.Method3985();
        class979.Method3986(n + 1);
    }

    Class781(Class979 class979) {
        this.Field11294 = class979;
    }

    private static String Method3269(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 221;
            cArray2[n] = (char)(cArray[n] ^ (0x321 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

