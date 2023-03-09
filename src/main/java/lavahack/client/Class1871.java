//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.network.Packet
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class737;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.Packet;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1871
implements Runnable {
    final Class737 Field16589;
    final Packet Field16590;
    private String Field16591 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Minecraft minecraft = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft, (String)"mc");
        if (minecraft.getConnection() == null) return;
        Minecraft minecraft2 = Class2142.Field17803;
        Intrinsics.checkExpressionValueIsNotNull((Object)minecraft2, (String)"mc");
        NetHandlerPlayClient netHandlerPlayClient = minecraft2.getConnection();
        if (netHandlerPlayClient == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull((Object)netHandlerPlayClient, (String)"mc.connection!!");
        Class737.Method3063(this.Field16589, this.Field16590, netHandlerPlayClient);
    }

    Class1871(Class737 class737, Packet packet) {
        this.Field16589 = class737;
        this.Field16590 = packet;
    }

    private static String Method6968(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 160;
            cArray2[n] = (char)(cArray[n] ^ (0x335B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

