//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1979;
import lavahack.client.Class2014;
import lavahack.client.Class254;
import lavahack.client.Class364;
import lavahack.client.Class778;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$ModeSetting;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1113
implements Class254 {
    final Class778 Field13012;
    private String Field13013 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4554((Class364)object);
    }

    public final void Method4554(Class364 class364) {
        if (!Intrinsics.areEqual((Object)class364.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (Object)Class778.Method3246(this.Field13012))) return;
        if (Class778.Method3244().world != null) {
            Class778.Method3248(this.Field13012, true);
            return;
        }
        Class1979 class1979 = Class1979.Method7320();
        Intrinsics.checkExpressionValueIsNotNull((Object)class1979, (String)"ViaForge.getInstance()");
        ProtocolVersion protocolVersion = ((Class2014)Class778.Method3246(this.Field13012).Method341()).Method7469();
        Intrinsics.checkExpressionValueIsNotNull((Object)protocolVersion, (String)"version.valEnum.version");
        class1979.Method7331(protocolVersion.getVersion());
    }

    Class1113(Class778 class778) {
        this.Field13012 = class778;
    }

    private static String Method4555(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 219;
            cArray2[n] = (char)(cArray[n] ^ (0x4614 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

