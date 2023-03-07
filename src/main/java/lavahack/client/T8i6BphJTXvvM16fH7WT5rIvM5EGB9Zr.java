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

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.FJU7WrfQ7bSUF3WFz5GrfCi4CQDN4X0P;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/module/movement/Phase;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoDisable", "Lcom/kisman/cc/settings/Setting;", "getAutoDisable", "()Lcom/kisman/cc/settings/Setting;", "mode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/PhaseModes;", "update", "", "kisman.cc"})
public final class T8i6BphJTXvvM16fH7WT5rIvM5EGB9Zr
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field11573 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FJU7WrfQ7bSUF3WFz5GrfCi4CQDN4X0P.Field10019).Method5303();
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11574;
    private String Field11575 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3573() {
        return this.Field11574;
    }

    @Override
    public void Method45() {
        if (T8i6BphJTXvvM16fH7WT5rIvM5EGB9Zr.Method3574().player == null) return;
        if (T8i6BphJTXvvM16fH7WT5rIvM5EGB9Zr.Method3574().world == null) {
            return;
        }
        ((FJU7WrfQ7bSUF3WFz5GrfCi4CQDN4X0P)this.Field11573.Method341()).Method2245(this);
    }

    public T8i6BphJTXvvM16fH7WT5rIvM5EGB9Zr() {
        super("Phase", "crystalpvp.cc go brr", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Disable", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1836522878 ^ (long)1836522878)));
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
            Intrinsics.throwNpe();
        }
        this.Field11574 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
    }

    public static final Minecraft Method3574() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method3575(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)206918344 ^ (long)206918344);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1236757484 ^ (long)1236757267);
            int n2 = (int)((long)1556627603 ^ (long)1556627672);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1234326135L ^ 0xB66D8360) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

