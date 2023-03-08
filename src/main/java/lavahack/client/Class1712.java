//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.settings.*;
import net.minecraft.entity.*;
import net.minecraft.init.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r?\u0006\u0013" }, d2 = { "com/kisman/cc/features/module/movement/speed/SpeedModes$6", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "lastPos", "Lnet/minecraft/util/math/BlockPos;", "getLastPos", "()Lnet/minecraft/util/math/BlockPos;", "setLastPos", "(Lnet/minecraft/util/math/BlockPos;)V", "y", "", "getY", "()D", "setY", "(D)V", "getMotion", "Lcom/kisman/cc/features/module/movement/speed/util/Motion;", "onEnable", "", "update", "kisman.cc" })
public final class Class1712 implements Class1703
{
    @Nullable
    private BlockPos Field15904;
    private double Field15905;
    private String Field15906 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    public final BlockPos Method6552() {
        return this.Field15904;
    }
    
    public final void Method6553(@Nullable @Nullable final BlockPos field15904) {
        this.Field15904 = field15904;
    }
    
    public final double Method6554() {
        return this.Field15905;
    }
    
    public final void Method6555(final double field15905) {
        this.Field15905 = field15905;
    }
    
    public void Method6529() {
    }
    
    public void Method6530() {
        final Class562 method6556 = this.Method6556();
        final EntityPlayerSP player = Class2142.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        player.setSprinting(true);
        final KeyBinding keyBindForward = Class2142.Field17803.gameSettings.keyBindForward;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBindForward, "mc.gameSettings.keyBindForward");
        if (keyBindForward.isKeyDown()) {
            if (Class2142.Field17803.player.onGround) {
                final Class44 method6557 = Class1989.Field17152.Method7384();
                if (method6557 == null) {
                    Intrinsics.throwNpe();
                }
                if (method6557.Method365() && method6556 != null) {
                    switch (Class1861.Field16557[method6556.ordinal()]) {
                        case 1: {
                            final EntityPlayerSP player2 = Class2142.Field17803.player;
                            player2.motionX += Double.longBitsToDouble((long)32720456 ^ 0x3FB99999986ADFD2L);
                            break;
                        }
                        case 2: {
                            final EntityPlayerSP player3 = Class2142.Field17803.player;
                            player3.motionZ += Double.longBitsToDouble(4591870180066957722L);
                            break;
                        }
                        case 3: {
                            final EntityPlayerSP player4 = Class2142.Field17803.player;
                            player4.motionX -= Double.longBitsToDouble((long)1368875233 ^ 0x3FB99999C80EF97BL);
                            break;
                        }
                        case 4: {
                            final EntityPlayerSP player5 = Class2142.Field17803.player;
                            player5.motionZ -= Double.longBitsToDouble((long)1753293870 ^ 0x3FB99999F118BDB4L);
                            break;
                        }
                    }
                }
                this.Field15905 = 1.0;
                Class394.Method1953();
                final Class44 method6558 = Class1989.Field17152.Method7376();
                if (method6558 == null) {
                    Intrinsics.throwNpe();
                }
                if (method6558.Method365()) {
                    Class115.Field8400.Field8401.Method6523((Class42)Class1126.Field13077, 2, Float.intBitsToFloat(1067869798));
                }
                Class2142.Field17803.player.jump();
                final Class44 method6559 = Class1989.Field17152.Method7380();
                if (method6559 == null) {
                    Intrinsics.throwNpe();
                }
                final double method6560 = Class1917.Method7154(method6559.Method365(), Double.longBitsToDouble((long)1899740033 ^ 0x3FD2631FFB32B95FL));
                final Class44 method6561 = Class1989.Field17152.Method7388();
                if (method6561 == null) {
                    Intrinsics.throwNpe();
                }
                final double n = method6560 * method6561.Method367();
                final Class44 method6562 = Class1989.Field17152.Method7389();
                if (method6562 == null) {
                    Intrinsics.throwNpe();
                }
                final double[] method6563 = Class1917.Method7150(n + (method6562.Method365() ? Double.longBitsToDouble(4599075939470750515L) : 0.0));
                Class2142.Field17803.player.motionX = method6563[0];
                Class2142.Field17803.player.motionZ = method6563[1];
            }
            else {
                final Class44 method6564 = Class1989.Field17152.Method7387();
                if (method6564 == null) {
                    Intrinsics.throwNpe();
                }
                if (method6564.Method365()) {
                    final EntityPlayerSP player6 = Class2142.Field17803.player;
                    final Class44 method6565 = Class1989.Field17152.Method7386();
                    if (method6565 == null) {
                        Intrinsics.throwNpe();
                    }
                    player6.jumpMovementFactor = method6565.Method368();
                }
                if (this.Field15905 == 1.0) {
                    final EntityPlayerSP player7 = Class2142.Field17803.player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player7, "mc.player");
                    this.Field15905 = player7.getPositionVector().y;
                }
                else {
                    final EntityPlayerSP player8 = Class2142.Field17803.player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player8, "mc.player");
                    if (player8.getPositionVector().y < this.Field15905) {
                        final EntityPlayerSP player9 = Class2142.Field17803.player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player9, "mc.player");
                        this.Field15905 = player9.getPositionVector().y;
                        Class2142.Field17803.player.motionX = 0.0;
                        Class2142.Field17803.player.motionZ = 0.0;
                        final Class44 method6566 = Class1989.Field17152.Method7376();
                        if (method6566 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (method6566.Method365()) {
                            Class394.Method1953();
                        }
                        Class115.Field8400.Field8401.Method6523((Class42)Class1126.Field13077, 2, Float.intBitsToFloat(1098907648));
                    }
                    else {
                        final EntityPlayerSP player10 = Class2142.Field17803.player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player10, "mc.player");
                        this.Field15905 = player10.getPositionVector().y;
                        final Class44 method6567 = Class1989.Field17152.Method7385();
                        if (method6567 == null) {
                            Intrinsics.throwNpe();
                        }
                        if (method6567.Method365() && method6556 != null) {
                            switch (Class1861.Field16558[method6556.ordinal()]) {
                                case 1: {
                                    final EntityPlayerSP player11 = Class2142.Field17803.player;
                                    player11.motionX += Double.longBitsToDouble((long)987986868 ^ 0x3FC99999A37AE22EL);
                                    break;
                                }
                                case 2: {
                                    final EntityPlayerSP player12 = Class2142.Field17803.player;
                                    player12.motionY += Double.longBitsToDouble((long)1657025519 ^ 0x3FC99999FB5DAA75L);
                                    break;
                                }
                                case 3: {
                                    final EntityPlayerSP player13 = Class2142.Field17803.player;
                                    player13.motionX -= Double.longBitsToDouble(4596373779694328218L);
                                    break;
                                }
                                case 4: {
                                    final EntityPlayerSP player14 = Class2142.Field17803.player;
                                    player14.motionY -= Double.longBitsToDouble(4596373779694328218L);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private final Class562 Method6556() {
        final BlockPos method1921 = Class394.Method1921((Entity)Class2142.Field17803.player);
        if (Intrinsics.areEqual((Object)Class2142.Field17803.world.getBlockState(method1921), (Object)Blocks.AIR) && this.Field15904 != null) {
            if (Intrinsics.areEqual((Object)method1921, (Object)this.Field15904) ^ true) {
                final BlockPos field15904 = this.Field15904;
                if (Intrinsics.areEqual((Object)((field15904 != null) ? field15904.add(0, 0, -1) : null), (Object)method1921)) {
                    return Class562.Field10395;
                }
                final BlockPos field15905 = this.Field15904;
                if (Intrinsics.areEqual((Object)((field15905 != null) ? field15905.add(0, 0, 1) : null), (Object)method1921)) {
                    return Class562.Field10393;
                }
                final BlockPos field15906 = this.Field15904;
                if (Intrinsics.areEqual((Object)((field15906 != null) ? field15906.add(1, 0, 0) : null), (Object)method1921)) {
                    return Class562.Field10392;
                }
                final BlockPos field15907 = this.Field15904;
                if (Intrinsics.areEqual((Object)((field15907 != null) ? field15907.add(-1, 0, 0) : null), (Object)method1921)) {
                    return Class562.Field10394;
                }
            }
        }
        else {
            this.Field15904 = Class394.Method1921((Entity)Class2142.Field17803.player);
        }
        return null;
    }
    
    Class1712() {
        this.Field15905 = 1.0;
    }
    
    private static String Method6557(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7DAB ^ 0xD0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
