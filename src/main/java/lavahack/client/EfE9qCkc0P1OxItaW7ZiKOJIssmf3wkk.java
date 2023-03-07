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
import lavahack.client.EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
import lavahack.client.WEiQLLFUQVuGOj7qvqACpofn3o9d8dxK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.wkwi2Aupxpyp8sqUHbaH7iYHxWosUPRY;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/features/module/Debug/PacketMineProviderTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "mode", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "onEnable", "", "Mode", "kisman.cc"})
public final class EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15044 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16346));
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
                    if (EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().player == null) return;
                    if (EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().world == null) return;
                    if (EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().objectMouseOver == null) return;
                    v0 = EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().objectMouseOver;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"mc.objectMouseOver");
                    if (v0.getBlockPos() == null) {
                        return;
                    }
                    v1 = this.Field15044;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"mode");
                    if (v1.Method341() != EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16346) break block4;
                    v2 = EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().objectMouseOver;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v2, (String)"mc.objectMouseOver");
                    v3 = v2.getBlockPos();
                    Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"mc.objectMouseOver.blockPos");
                    L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1405(v3, EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().objectMouseOver.sideHit);
                    break block5;
                }
                v4 = this.Field15044;
                Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"mode");
                if (v4.Method341() != EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16347) break block6;
                v5 = EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().playerController;
                v6 = EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().objectMouseOver;
                Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.objectMouseOver");
                v5.onPlayerDamageBlock(v6.getBlockPos(), EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().objectMouseOver.sideHit);
                break block5;
            }
            WEiQLLFUQVuGOj7qvqACpofn3o9d8dxK.Method2383();
            v7 = EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021();
            if (v7 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.mixin.accessors.IMinecraft");
            }
            v8 = (wkwi2Aupxpyp8sqUHbaH7iYHxWosUPRY)v7;
            if (EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().currentScreen != null) ** GOTO lbl-1000
            v9 = EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().gameSettings.keyBindAttack;
            Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"mc.gameSettings.keyBindAttack");
            if (v9.isKeyDown() && EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk.Method6021().inGameHasFocus) {
                v10 = (int)((long)1214158177 ^ (long)1214158176);
            } else lbl-1000:
            // 2 sources

            {
                v10 = (int)-816843241L ^ -816843241;
            }
            v8.Method6103((boolean)v10);
        }
        this.Method22();
    }

    public EfE9qCkc0P1OxItaW7ZiKOJIssmf3wkk() {
        super("PacketMineProviderTest", "Testing the packet mine provider", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    public static final Minecraft Method6021() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method6022(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1479160099L ^ 0xA7D5CEDD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-976939356 ^ (long)-976939429);
            int n2 = ((int)-1597576506L ^ 0xA0C6EAAB) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)642364891 ^ (long)642361434) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

