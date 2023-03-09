//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1542;
import lavahack.client.Class1816;
import lavahack.client.Class256;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class519;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/features/module/Debug/PacketMineProviderTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "mode", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onEnable", "", "Mode", "kisman.cc"})
public final class Class1502
extends Class42 {
    private final Class44 Field15044 = this.Method23(new Class44("Mode", (Class42)this, Class1816.Field16346));
    private String Field15045 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * Unable to fully structure code
     */
    @Override
    public void Method38() {
        block5: {
            block6: {
                block4: {
                    super.Method38();
                    if (Class1502.Method6021().player == null) return;
                    if (Class1502.Method6021().world == null) return;
                    if (Class1502.Method6021().objectMouseOver == null) return;
                    v0 = Class1502.Method6021().objectMouseOver;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"mc.objectMouseOver");
                    if (v0.getBlockPos() == null) {
                        return;
                    }
                    v1 = this.Field15044;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"mode");
                    if (v1.Method341() != Class1816.Field16346) break block4;
                    v2 = Class1502.Method6021().objectMouseOver;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"mc.objectMouseOver");
                    v3 = v2.getBlockPos();
                    Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"mc.objectMouseOver.blockPos");
                    Class256.Field9152.Method1405(v3, Class1502.Method6021().objectMouseOver.sideHit);
                    break block5;
                }
                v4 = this.Field15044;
                Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"mode");
                if (v4.Method341() != Class1816.Field16347) break block6;
                v5 = Class1502.Method6021().playerController;
                v6 = Class1502.Method6021().objectMouseOver;
                Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.objectMouseOver");
                v5.onPlayerDamageBlock(v6.getBlockPos(), Class1502.Method6021().objectMouseOver.sideHit);
                break block5;
            }
            Class519.Method2383();
            v7 = Class1502.Method6021();
            if (v7 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.accessors.IMinecraft");
            }
            v8 = (Class1542)v7;
            if (Class1502.Method6021().currentScreen != null) ** GOTO lbl-1000
            v9 = Class1502.Method6021().gameSettings.keyBindAttack;
            Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"mc.gameSettings.keyBindAttack");
            if (v9.isKeyDown() && Class1502.Method6021().inGameHasFocus) {
                v10 = true;
            } else lbl-1000:
            // 2 sources

            {
                v10 = false;
            }
            v8.Method6103(v10);
        }
        this.Method22();
    }

    public Class1502() {
        super("PacketMineProviderTest", "Testing the packet mine provider", Class97.Field8345);
    }

    public static final Minecraft Method6021() {
        return Class42.Field8052;
    }

    public static final void Method6022(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 218;
            cArray2[n] = (char)(cArray[n] ^ (0x7604 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

