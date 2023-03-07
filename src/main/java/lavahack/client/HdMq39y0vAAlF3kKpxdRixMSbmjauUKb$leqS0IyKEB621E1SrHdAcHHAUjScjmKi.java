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
import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;
import lavahack.client.HdMq39y0vAAlF3kKpxdRixMSbmjauUKb;
import lavahack.client.HnCeArMwqlA5KPZf75D1d92lhv5QGxpA;
import lavahack.client.bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$ModeSetting;", "kotlin.jvm.PlatformType", "invoke"})
final class HdMq39y0vAAlF3kKpxdRixMSbmjauUKb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    final HdMq39y0vAAlF3kKpxdRixMSbmjauUKb Field13012;
    private String Field13013 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method4554((bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)object);
    }

    public final void Method4554(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS) {
        if (!Intrinsics.areEqual((Object)bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (Object)HdMq39y0vAAlF3kKpxdRixMSbmjauUKb.Method3246(this.Field13012))) return;
        if (HdMq39y0vAAlF3kKpxdRixMSbmjauUKb.Method3244().world != null) {
            HdMq39y0vAAlF3kKpxdRixMSbmjauUKb.Method3248(this.Field13012, (boolean)((long)-310339738 ^ (long)-310339737));
            return;
        }
        FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D fhLz4BFGdUZSlxEydtAGWmNr3cGJl86D = FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320();
        Intrinsics.checkExpressionValueIsNotNull((Object)fhLz4BFGdUZSlxEydtAGWmNr3cGJl86D, (String)"ViaForge.getInstance()");
        ProtocolVersion protocolVersion = ((HnCeArMwqlA5KPZf75D1d92lhv5QGxpA)HdMq39y0vAAlF3kKpxdRixMSbmjauUKb.Method3246(this.Field13012).Method341()).Method7469();
        Intrinsics.checkExpressionValueIsNotNull((Object)protocolVersion, (String)"version.valEnum.version");
        fhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7331(protocolVersion.getVersion());
    }

    HdMq39y0vAAlF3kKpxdRixMSbmjauUKb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(HdMq39y0vAAlF3kKpxdRixMSbmjauUKb hdMq39y0vAAlF3kKpxdRixMSbmjauUKb) {
        this.Field13012 = hdMq39y0vAAlF3kKpxdRixMSbmjauUKb;
    }

    private static String Method4555(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1244549149 ^ (long)1244549149);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1863119548L ^ 0x6F0CF243);
            int n2 = (int)1904180174L ^ 0x717F7B15;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)152804582 ^ (long)152800611) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

