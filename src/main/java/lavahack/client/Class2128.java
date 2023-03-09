//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/features/module/exploit/DamageLeave;", "Lcom/kisman/cc/features/module/Module;", "()V", "motion", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "update", "", "kisman.cc"})
public final class Class2128
extends Class42 {
    private final Class44 Field17680 = this.Method23(new Class44("Motion", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), Double.longBitsToDouble((long)1011401076 ^ 0x401400003C48C174L), Double.longBitsToDouble(0x4034000000000000L), true));
    private String Field17681 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method45() {
        if (Class2128.Method7665().player == null) return;
        if (Class2128.Method7665().world == null) return;
        if (Class2128.Method7665().player.hurtTime < 7) return;
        EntityPlayerSP entityPlayerSP = Class2128.Method7665().player;
        Class44 class44 = this.Field17680;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"motion");
        entityPlayerSP.motionY = class44.Method367();
        Class1393.Method5503().Method1886("Done! Disabling!");
        this.Method21(false);
    }

    public Class2128() {
        super("DamageLeave", "Sets your Y motion when you get \"any\" damage", Class97.Field8344);
    }

    public static final Minecraft Method7665() {
        return Class42.Field8052;
    }

    public static final void Method7666(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 65;
            cArray2[n] = (char)(cArray[n] ^ (0x1D30 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

