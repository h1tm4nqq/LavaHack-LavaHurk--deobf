//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.gIvxvpNAI6XugtMxK19p7peBbgdbr5DL;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/features/module/exploit/CowDupe;", "Lcom/kisman/cc/features/module/Module;", "()V", "factor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onEnable", "", "kisman.cc"})
public final class R4QFUEtx9e20M9PUdNDR7JlhCjGQc2OB
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16555 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x9953125FE0F4D089L ^ 0xD931D25FE0F4D089L), Double.longBitsToDouble((long)1510174789 ^ 0x402400005A037045L), Double.longBitsToDouble((long)1209091185 ^ 0x4072C00048114471L), (boolean)((long)-244421365 ^ (long)-244421366)));
    private int Field16556;

    @Override
    public void Method38() {
        if (R4QFUEtx9e20M9PUdNDR7JlhCjGQc2OB.Method6954().player == null || R4QFUEtx9e20M9PUdNDR7JlhCjGQc2OB.Method6954().world == null) {
            super.Method21(((int)-1627957617L ^ 0x9EF7568F) != 0);
            return;
        }
        if (Intrinsics.areEqual((Object)R4QFUEtx9e20M9PUdNDR7JlhCjGQc2OB.Method6954().player.inventory.getCurrentItem().getItem(), (Object)Items.SHEARS)) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16555;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"factor");
            int n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335();
            for (int i = (int)-1939414477L ^ 0x8C66E233; i < n; ++i) {
                if (R4QFUEtx9e20M9PUdNDR7JlhCjGQc2OB.Method6954().pointedEntity == null) {
                    NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Where your cow?!");
                    super.Method21((boolean)((long)1874747292 ^ (long)1874747292));
                }
                R4QFUEtx9e20M9PUdNDR7JlhCjGQc2OB.Method6954().player.connection.sendPacket((Packet)new CPacketUseEntity(R4QFUEtx9e20M9PUdNDR7JlhCjGQc2OB.Method6954().pointedEntity, EnumHand.MAIN_HAND));
            }
            gIvxvpNAI6XugtMxK19p7peBbgdbr5DL gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2 = NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503();
            StringBuilder stringBuilder = new StringBuilder().append("You duped ");
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16555;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"factor");
            gIvxvpNAI6XugtMxK19p7peBbgdbr5DL2.Method1886(stringBuilder.append(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method335()).append(" cows!").toString());
        } else {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("You need to hold shears to do the glitch.");
        }
        super.Method21((boolean)((long)243793924 ^ (long)243793924));
    }

    public R4QFUEtx9e20M9PUdNDR7JlhCjGQc2OB() {
        super("CowDupe", "Dupes your cows xD", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    public static final Minecraft Method6954() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method6955(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1004551403L ^ 0xC41FC315;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1917283055L ^ 0x8DB895EE);
            int n2 = ((int)-1712483940L ^ 0x99ED918F) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-154271451L ^ 0xF6CE0128 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

