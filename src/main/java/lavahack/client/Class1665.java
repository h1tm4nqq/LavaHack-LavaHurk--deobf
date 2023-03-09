//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import lavahack.client.Class2090;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1665
implements Runnable {
    final Class2090 Field15754;
    private String Field15755 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Class2142.Field17803.player.inventory.currentItem = this.Field15754.Field17540.getSlotId();
    }

    Class1665(Class2090 class2090) {
        this.Field15754 = class2090;
    }
}

