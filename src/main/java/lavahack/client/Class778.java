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
import lavahack.client.Class1113;
import lavahack.client.Class1303;
import lavahack.client.Class1796;
import lavahack.client.Class1979;
import lavahack.client.Class2014;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/features/module/client/ViaForgeModule;", "Lcom/kisman/cc/features/module/Module;", "()V", "changed", "", "settingChange", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/client/settings/EventSettingChange$ModeSetting;", "version", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/features/viaforge/protocol/ProtocolCollection;", "update", "", "kisman.cc"})
public final class Class778
extends Class42 {
    private final Class1303 Field11289 = new Class1303("Version", (Class42)this, Class2014.Field17263).Method5303();
    private boolean Field11290;
    private final Class618 Field11291 = new Class618((Class254)new Class1113(this), new Predicate[0]);
    private String Field11292 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method45() {
        if (Class778.Method3244().world != null) return;
        if (!this.Field11290) return;
        Class1979 class1979 = Class1979.Method7320();
        Intrinsics.checkExpressionValueIsNotNull((Object)class1979, (String)"ViaForge.getInstance()");
        ProtocolVersion protocolVersion = ((Class2014)this.Field11289.Method341()).Method7469();
        Intrinsics.checkExpressionValueIsNotNull((Object)protocolVersion, (String)"version.valEnum.version");
        class1979.Method7331(protocolVersion.getVersion());
        this.Field11290 = false;
    }

    public Class778() {
        super("ViaForge", "Implementation of viaforge version selector", Class97.Field8339);
        super.Method21(true);
        this.Field8062 = false;
        Class1796.Field16242.Method706(this.Field11291);
    }

    public static final Minecraft Method3244() {
        return Class42.Field8052;
    }

    public static final void Method3245(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class1303 Method3246(Class778 class778) {
        return class778.Field11289;
    }

    public static final boolean Method3247(Class778 class778) {
        return class778.Field11290;
    }

    public static final void Method3248(Class778 class778, boolean bl) {
        class778.Field11290 = bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 188;
            cArray2[n] = (char)(cArray[n] ^ (0x19E8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

