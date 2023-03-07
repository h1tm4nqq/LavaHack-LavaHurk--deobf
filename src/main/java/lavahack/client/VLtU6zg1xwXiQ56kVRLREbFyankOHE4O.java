//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.VLtU6zg1xwXiQ56kVRLREbFyankOHE4O$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/features/module/misc/PortalsModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "allowGuis", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "godMode", "send", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "doAllowGuis", "", "onDisable", "onEnable", "update", "kisman.cc"})
public final class VLtU6zg1xwXiQ56kVRLREbFyankOHE4O
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8874 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Allow Guis", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1318264862 ^ (long)-1318264861)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8875 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("God Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1909218967 ^ (long)-1909218967)));
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8876 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new VLtU6zg1xwXiQ56kVRLREbFyankOHE4O$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)1894467966L ^ 0x70EB497E]);
    private String Field8877 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field8876);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field8876);
    }

    @Override
    public void Method45() {
        if (VLtU6zg1xwXiQ56kVRLREbFyankOHE4O.Method1181().player == null) return;
        if (VLtU6zg1xwXiQ56kVRLREbFyankOHE4O.Method1181().world == null) {
            return;
        }
        this.Method1180();
    }

    private final void Method1180() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field8874;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"allowGuis");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        VLtU6zg1xwXiQ56kVRLREbFyankOHE4O.Method1181().player.inPortal = (int)((long)1921423594 ^ (long)1921423594);
    }

    public VLtU6zg1xwXiQ56kVRLREbFyankOHE4O() {
        super("PortalsModifier", "Extra nether portals features.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    public static final Minecraft Method1181() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method1182(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method1183(VLtU6zg1xwXiQ56kVRLREbFyankOHE4O vLtU6zg1xwXiQ56kVRLREbFyankOHE4O) {
        return vLtU6zg1xwXiQ56kVRLREbFyankOHE4O.Field8875;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1735104791 ^ (long)1735104791);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-200376051 ^ (long)-200375822);
            int n2 = (int)((long)1089487321 ^ (long)1089487356) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)328453528L ^ 0x13939533 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

