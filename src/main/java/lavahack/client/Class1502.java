//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import kotlin.*;
import net.minecraft.util.math.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.*;
import net.minecraft.client.settings.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\t" }, d2 = { "Lcom/kisman/cc/features/module/Debug/PacketMineProviderTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "mode", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onEnable", "", "Mode", "kisman.cc" })
public final class Class1502 extends Class42
{
    private final Class44 Field15044;
    private String Field15045 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method38() {
        super.Method38();
        if (Method6021().player != null && Method6021().world != null && Method6021().objectMouseOver != null) {
            final RayTraceResult objectMouseOver = Method6021().objectMouseOver;
            Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver, "mc.objectMouseOver");
            if (objectMouseOver.getBlockPos() != null) {
                final Class44 field15044 = this.Field15044;
                Intrinsics.checkExpressionValueIsNotNull((Object)field15044, "mode");
                if (field15044.Method341() == Class1816.Field16346) {
                    final Class256 field15045 = Class256.Field9152;
                    final RayTraceResult objectMouseOver2 = Method6021().objectMouseOver;
                    Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver2, "mc.objectMouseOver");
                    final BlockPos getBlockPos = objectMouseOver2.getBlockPos();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getBlockPos, "mc.objectMouseOver.blockPos");
                    field15045.Method1405(getBlockPos, Method6021().objectMouseOver.sideHit);
                }
                else {
                    final Class44 field15046 = this.Field15044;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field15046, "mode");
                    if (field15046.Method341() == Class1816.Field16347) {
                        final PlayerControllerMP playerController = Method6021().playerController;
                        final RayTraceResult objectMouseOver3 = Method6021().objectMouseOver;
                        Intrinsics.checkExpressionValueIsNotNull((Object)objectMouseOver3, "mc.objectMouseOver");
                        playerController.onPlayerDamageBlock(objectMouseOver3.getBlockPos(), Method6021().objectMouseOver.sideHit);
                    }
                    else {
                        Class519.Method2383();
                        final Minecraft method6021 = Method6021();
                        if (method6021 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.accessors.IMinecraft");
                        }
                        final Class1542 class1542 = (Class1542)method6021;
                        boolean b = false;
                        Label_0232: {
                            if (Method6021().currentScreen == null) {
                                final KeyBinding keyBindAttack = Method6021().gameSettings.keyBindAttack;
                                Intrinsics.checkExpressionValueIsNotNull((Object)keyBindAttack, "mc.gameSettings.keyBindAttack");
                                if (keyBindAttack.isKeyDown() && Method6021().inGameHasFocus) {
                                    b = true;
                                    break Label_0232;
                                }
                            }
                            b = false;
                        }
                        class1542.Method6103(b);
                    }
                }
                this.Method22();
            }
        }
    }
    
    public Class1502() {
        super("PacketMineProviderTest", "Testing the packet mine provider", Class97.Field8345);
        this.Field15044 = this.Method23(new Class44("Mode", this, Class1816.Field16346));
    }
    
    public static final Minecraft Method6021() {
        return Class42.Field8052;
    }
    
    public static final void Method6022(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7604 ^ 0xDA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
