/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.ArraysKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.random.Random
 *  net.minecraftforge.client.event.ClientChatEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/module/misc/ChatModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "animation", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getAnimation", "()Lcom/kisman/cc/settings/Setting;", "antiSpamBypass", "autoGlobal", "customY", "getCustomY", "customYVal", "getCustomYVal", "greenText", "suffix", "ttf", "getTtf", "onChat", "", "event", "Lnet/minecraftforge/client/event/ClientChatEvent;", "kisman.cc"})
public final class om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12242 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Animation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)22343189L ^ 0x154EE15) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12243 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Suffix", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)969197735 ^ (long)969197735)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12244 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Anti Spam Bypass", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1216602217L ^ 0x4883E069) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12245 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Global", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1559712859L ^ 0xA308ABA5) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12246 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Green Text", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)87910237 ^ (long)87910237)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12247 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1634606792 ^ (long)1634606792)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12248 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Y Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)414189446 ^ 0x4049000018B00786L), 0.0, Double.longBitsToDouble(0xA413C564E84ACB06L ^ 0xE44AC564E84ACB06L), ((int)-2016359480L ^ 0x87D0CBC9) != 0).Method313(new om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12249 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TTF", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-404404884L ^ 0xE7E5456C) != 0));
    private int Field12250;

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4012() {
        return this.Field12242;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4013() {
        return this.Field12247;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4014() {
        return this.Field12248;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4015() {
        return this.Field12249;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4016(@NotNull @NotNull ClientChatEvent clientChatEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientChatEvent, (String)"event");
        Object[] objectArray = new Object[(int)((long)-362810907 ^ (long)-362810908) << 3];
        objectArray[(int)((long)427848454 ^ (long)427848454)] = Character.valueOf((char)((long)-372137350 ^ (long)-372137387));
        objectArray[(int)1543065687L ^ 0x5BF95056] = Character.valueOf((int)((long)1891348051 ^ (long)1891348036) << 1);
        objectArray[(int)((long)-1109955098 ^ (long)-1109955097) << 1] = Character.valueOf((int)((long)-1501495852 ^ (long)-1501495841) << 2);
        objectArray[(int)751880149L ^ 0x2CD0C7D6] = Character.valueOf((char)((long)469580465 ^ (long)469580426));
        objectArray[((int)-1019155921L ^ 0xC340EA2E) << 2] = Character.valueOf(((int)1908965316L ^ 0x71C87FD9) << 1);
        objectArray[(int)-480819332L ^ 0xE3574779] = Character.valueOf((char)((long)-1684144252 ^ (long)-1684144215));
        objectArray[((int)79011159L ^ 0x4B59D54) << 1] = Character.valueOf((char)((int)1471829006L ^ 0x57BA5425));
        objectArray[(int)((long)2016536594 ^ (long)2016536597)] = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16272.Field17386;
        Object[] objectArray2 = objectArray;
        if (ArraysKt.contains((Object[])objectArray2, (Object)Character.valueOf(clientChatEvent.getMessage().charAt((int)512931641L ^ 0x1E92B739)))) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12246;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"greenText");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            clientChatEvent.setMessage("> " + clientChatEvent.getMessage());
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field12245;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"autoGlobal");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            clientChatEvent.setMessage((char)((long)362636277 ^ (long)362636244) + clientChatEvent.getMessage());
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field12243;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"suffix");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) {
            clientChatEvent.setMessage(clientChatEvent.getMessage() + " | " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + " own you and all");
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field12244;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"antiSpamBypass");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) return;
        clientChatEvent.setMessage(clientChatEvent.getMessage() + " | " + Random.Default.nextInt());
    }

    public om8X6I7L5IyHrhCFxhI8GvxXAI3WkGGz() {
        super("ChatModifier", "Chat features", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1380386797L ^ 0xADB8F813;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1519676134L ^ 0x5A946A19);
            int n2 = ((int)-2084053520L ^ 0x83C7DDF3) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1933164236 ^ (long)1933151663) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

