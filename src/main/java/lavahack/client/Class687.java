//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class2103;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketEntityAction;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class687
implements Runnable {
    final CPacketEntityAction Field10901;
    private String Field10902 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        if (Class2142.Field17803.player == null) return;
        CPacketEntityAction.Action action = this.Field10901.getAction();
        if (action == null) {
            return;
        }
        switch (Class2103.Field17581[action.ordinal()]) {
            case 1: {
                EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                entityPlayerSP.setSneaking(true);
                return;
            }
            case 2: {
                EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                entityPlayerSP.setSneaking(false);
                return;
            }
            case 3: {
                EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                entityPlayerSP.setSprinting(true);
                return;
            }
            case 4: {
                EntityPlayerSP entityPlayerSP = Class2142.Field17803.player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                entityPlayerSP.setSprinting(true);
                return;
            }
        }
    }

    Class687(CPacketEntityAction cPacketEntityAction) {
        this.Field10901 = cPacketEntityAction;
    }

    private static String Method2896(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 96;
            cArray2[n] = (char)(cArray[n] ^ (0x2F2E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

