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
import lavahack.client.Class1303;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class484;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/module/movement/Phase;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoDisable", "Lcom/kisman/cc/settings/Setting;", "getAutoDisable", "()Lcom/kisman/cc/settings/Setting;", "mode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/PhaseModes;", "update", "", "kisman.cc"})
public final class Class843
extends Class42 {
    private final Class1303 Field11573 = new Class1303("Mode", (Class42)this, Class484.Field10019).Method5303();
    @NotNull
    private final Class44 Field11574;
    private String Field11575 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class44 Method3573() {
        return this.Field11574;
    }

    @Override
    public void Method45() {
        if (Class843.Method3574().player == null) return;
        if (Class843.Method3574().world == null) {
            return;
        }
        ((Class484)this.Field11573.Method341()).Method2245(this);
    }

    public Class843() {
        super("Phase", "crystalpvp.cc go brr", Class97.Field8340);
        Class44 class44 = this.Method23(new Class44("Auto Disable", (Class42)this, false));
        if (class44 == null) {
            Intrinsics.throwNpe();
        }
        this.Field11574 = class44;
    }

    public static final Minecraft Method3574() {
        return Class42.Field8052;
    }

    public static final void Method3575(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 75;
            cArray2[n] = (char)(cArray[n] ^ (0x5DD2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

