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
import lavahack.client.Class1323;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class959;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/Debug/FastFallTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "coefficient", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "groundCheck", "lastPosY", "", "logic", "progression", "onEnable", "", "update", "Logic", "Progression", "kisman.cc"})
public final class Class962
extends Class42 {
    private final Class44 Field12104 = this.Method23(new Class44("Logic", (Class42)this, Class959.Field12088));
    private final Class44 Field12105 = this.Method23(new Class44("Progression", (Class42)this, Class1323.Field14062));
    private final Class44 Field12106 = this.Method23(new Class44("Coefficient", (Class42)this, 1.0, Double.longBitsToDouble((long)2093515923 ^ 0x3FB99999E5511D09L), Double.longBitsToDouble(0x4000000000000000L), false));
    private final Class44 Field12107 = this.Method23(new Class44("Ground Check", (Class42)this, false));
    private double Field12108;
    private String Field12109 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field12108 = 0.0;
    }

    @Override
    public void Method45() {
        if (Class962.Method3951().player == null || Class962.Method3951().world == null) {
            this.Field12108 = 0.0;
            return;
        }
        Class44 class44 = this.Field12107;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"groundCheck");
        if (class44.Method365() && Class962.Method3951().player.onGround) {
            this.Field12108 = Class962.Method3951().player.posY;
            return;
        }
        Class44 class442 = this.Field12104;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"logic");
        if (class442.Method341() == Class959.Field12088 ? Class962.Method3951().player.motionY >= 0.0 : Class962.Method3951().player.posY >= this.Field12108) {
            return;
        }
        Class44 class443 = this.Field12105;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"progression");
        if (class443.Method341() == Class1323.Field14062) {
            double d = Class962.Method3951().player.motionY;
            Class44 class444 = this.Field12106;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"coefficient");
            Class962.Method3951().player.motionY = d + -class444.Method367();
        } else {
            double d = Class962.Method3951().player.motionY;
            EntityPlayerSP entityPlayerSP = Class962.Method3951().player;
            boolean bl = false;
            double d2 = Math.abs(d);
            Class44 class445 = this.Field12106;
            Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"coefficient");
            entityPlayerSP.motionY = d2 * -class445.Method367();
        }
        this.Field12108 = Class962.Method3951().player.posY;
    }

    public Class962() {
        super("FastFall", "Test of fast fall module uwa?", Class97.Field8345);
    }

    public static final Minecraft Method3951() {
        return Class42.Field8052;
    }

    public static final void Method3952(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 38;
            cArray2[n] = (char)(cArray[n] ^ (0x7211 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

