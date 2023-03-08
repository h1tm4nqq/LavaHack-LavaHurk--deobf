//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/features/module/Debug/FastFallTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "coefficient", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "groundCheck", "lastPosY", "", "logic", "progression", "onEnable", "", "update", "Logic", "Progression", "kisman.cc" })
public final class Class962 extends Class42
{
    private final Class44 Field12104;
    private final Class44 Field12105;
    private final Class44 Field12106;
    private final Class44 Field12107;
    private double Field12108;
    private String Field12109 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method38() {
        super.Method38();
        this.Field12108 = 0.0;
    }
    
    public void Method45() {
        if (Method3951().player == null || Method3951().world == null) {
            this.Field12108 = 0.0;
            return;
        }
        final Class44 field12107 = this.Field12107;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12107, "groundCheck");
        if (field12107.Method365() && Method3951().player.onGround) {
            this.Field12108 = Method3951().player.posY;
            return;
        }
        final Class44 field12108 = this.Field12104;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12108, "logic");
        if (field12108.Method341() == Class959.Field12088) {
            if (Method3951().player.motionY >= 0) {
                return;
            }
        }
        else if (Method3951().player.posY >= this.Field12108) {
            return;
        }
        final Class44 field12109 = this.Field12105;
        Intrinsics.checkExpressionValueIsNotNull((Object)field12109, "progression");
        if (field12109.Method341() == Class1323.Field14062) {
            final EntityPlayerSP player = Method3951().player;
            final double motionY = player.motionY;
            final Class44 field12110 = this.Field12106;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12110, "coefficient");
            player.motionY = motionY + -field12110.Method367();
        }
        else {
            final EntityPlayerSP player2 = Method3951().player;
            final double motionY2 = Method3951().player.motionY;
            final EntityPlayerSP entityPlayerSP = player2;
            final double abs = Math.abs(motionY2);
            final EntityPlayerSP entityPlayerSP2 = entityPlayerSP;
            final double n = abs;
            final Class44 field12111 = this.Field12106;
            Intrinsics.checkExpressionValueIsNotNull((Object)field12111, "coefficient");
            entityPlayerSP2.motionY = n * -field12111.Method367();
        }
        this.Field12108 = Method3951().player.posY;
    }
    
    public Class962() {
        super("FastFall", "Test of fast fall module uwa?", Class97.Field8345);
        this.Field12104 = this.Method23(new Class44("Logic", (Class42)this, (Enum)Class959.Field12088));
        this.Field12105 = this.Method23(new Class44("Progression", (Class42)this, (Enum)Class1323.Field14062));
        this.Field12106 = this.Method23(new Class44("Coefficient", (Class42)this, 1.0, Double.longBitsToDouble((long)2093515923 ^ 0x3FB99999E5511D09L), Double.longBitsToDouble(4611686018427387904L), false));
        this.Field12107 = this.Method23(new Class44("Ground Check", (Class42)this, false));
    }
    
    public static final Minecraft Method3951() {
        return Class42.Field8052;
    }
    
    public static final void Method3952(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7211 ^ 0x26));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
