//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketKeepAlive
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1409;
import lavahack.client.Class254;
import lavahack.client.Class544;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketKeepAlive;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke"})
final class Class2146
implements Class254 {
    public static final Class2146 Field17818 = new Class2146();
    private int Field17819;

    @Override
    public void Method979(Object object) {
        this.Method7728((Class544)object);
    }

    public final void Method7728(Class544 class544) {
        Class544 class5442 = class544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class5442, (String)"it");
        Packet packet = class5442.Method982();
        if (!(packet instanceof SPacketKeepAlive)) return;
        if (Class1409.Method5558(Class1409.Field14381)) return;
        if (((SPacketKeepAlive)packet).getId() <= 0L) return;
        if (((SPacketKeepAlive)packet).getId() >= (long)1000) return;
        Class1409.Field14381.Method5546(System.currentTimeMillis() - Class1409.Field14381.Method5545());
        Class1409.Field14381.Method5548((int)((SPacketKeepAlive)packet).getId());
        Class1409.Field14381.Method5550(Class1409.Field14381.Method5545());
        Class1409.Method5559(Class1409.Field14381, true);
        class544.Method158();
    }

    Class2146() {
    }

    private static String Method7729(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 202;
            cArray2[n] = (char)(cArray[n] ^ (0x7E93 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

