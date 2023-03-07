//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;
import lavahack.client.HdMq39y0vAAlF3kKpxdRixMSbmjauUKb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.HnCeArMwqlA5KPZf75D1d92lhv5QGxpA;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/features/module/client/ViaForgeModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "changed", "", "settingChange", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$ModeSetting;", "version", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/viaforge/protocol/ProtocolCollection;", "update", "", "kisman.cc"})
public final class HdMq39y0vAAlF3kKpxdRixMSbmjauUKb
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field11289 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Version", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, HnCeArMwqlA5KPZf75D1d92lhv5QGxpA.Field17263).Method5303();
    private boolean Field11290;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field11291 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new HdMq39y0vAAlF3kKpxdRixMSbmjauUKb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)-1294683318L ^ 0xB2D4B34A]);
    private String Field11292 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method45() {
        if (HdMq39y0vAAlF3kKpxdRixMSbmjauUKb.Method3244().world != null) return;
        if (!this.Field11290) return;
        FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D fhLz4BFGdUZSlxEydtAGWmNr3cGJl86D = FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320();
        Intrinsics.checkExpressionValueIsNotNull((Object)fhLz4BFGdUZSlxEydtAGWmNr3cGJl86D, (String)"ViaForge.getInstance()");
        ProtocolVersion protocolVersion = ((HnCeArMwqlA5KPZf75D1d92lhv5QGxpA)this.Field11289.Method341()).Method7469();
        Intrinsics.checkExpressionValueIsNotNull((Object)protocolVersion, (String)"version.valEnum.version");
        fhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7331(protocolVersion.getVersion());
        this.Field11290 = (int)1368543081L ^ 0x51924F69;
    }

    public HdMq39y0vAAlF3kKpxdRixMSbmjauUKb() {
        super("ViaForge", "Implementation of viaforge version selector", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
        super.Method21(((int)-1604784996L ^ 0xA058EC9D) != 0);
        this.Field8062 = (int)-474711718L ^ 0xE3B4795A;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field11291);
    }

    public static final Minecraft Method3244() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method3245(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Method3246(HdMq39y0vAAlF3kKpxdRixMSbmjauUKb hdMq39y0vAAlF3kKpxdRixMSbmjauUKb) {
        return hdMq39y0vAAlF3kKpxdRixMSbmjauUKb.Field11289;
    }

    public static final boolean Method3247(HdMq39y0vAAlF3kKpxdRixMSbmjauUKb hdMq39y0vAAlF3kKpxdRixMSbmjauUKb) {
        return hdMq39y0vAAlF3kKpxdRixMSbmjauUKb.Field11290;
    }

    public static final void Method3248(HdMq39y0vAAlF3kKpxdRixMSbmjauUKb hdMq39y0vAAlF3kKpxdRixMSbmjauUKb, boolean bl) {
        hdMq39y0vAAlF3kKpxdRixMSbmjauUKb.Field11290 = bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1389300504L ^ 0xAD30F4E8;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)646377483L ^ 0x2686F0F4);
            int n2 = (int)((long)1904316701 ^ (long)1904316722) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1382803412 ^ (long)1382802665) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

