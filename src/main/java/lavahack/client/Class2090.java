//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import lavahack.client.Class1665;
import lavahack.client.Class267;
import net.minecraft.network.play.client.CPacketHeldItemChange;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class2090
implements Runnable {
    final CPacketHeldItemChange Field17540;
    private String Field17541 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        if (Class2142.Field17803.player == null) return;
        Class267.Method1441(Class267.Field9188, new Class1665(this));
    }

    Class2090(CPacketHeldItemChange cPacketHeldItemChange) {
        this.Field17540 = cPacketHeldItemChange;
    }
}

