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
import lavahack.client.Class1796;
import lavahack.client.Class259;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/module/misc/ChatModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "animation", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getAnimation", "()Lcom/kisman/cc/settings/Setting;", "antiSpamBypass", "autoGlobal", "customY", "getCustomY", "customYVal", "getCustomYVal", "greenText", "suffix", "ttf", "getTtf", "onChat", "", "event", "Lnet/minecraftforge/client/event/ClientChatEvent;", "kisman.cc"})
public final class Class991
extends Class42 {
    private final Class44 Field12242 = this.Method23(new Class44("Animation", (Class42)this, false));
    private final Class44 Field12243 = this.Method23(new Class44("Suffix", (Class42)this, false));
    private final Class44 Field12244 = this.Method23(new Class44("Anti Spam Bypass", (Class42)this, false));
    private final Class44 Field12245 = this.Method23(new Class44("Auto Global", (Class42)this, false));
    private final Class44 Field12246 = this.Method23(new Class44("Green Text", (Class42)this, false));
    private final Class44 Field12247 = this.Method23(new Class44("Custom Y", (Class42)this, false));
    private final Class44 Field12248 = this.Method23(new Class44("Custom Y Value", (Class42)this, Double.longBitsToDouble((long)414189446 ^ 0x4049000018B00786L), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313(new Class259(this)));
    private final Class44 Field12249 = this.Method23(new Class44("TTF", (Class42)this, false));
    private int Field12250;

    public final Class44 Method4012() {
        return this.Field12242;
    }

    public final Class44 Method4013() {
        return this.Field12247;
    }

    public final Class44 Method4014() {
        return this.Field12248;
    }

    public final Class44 Method4015() {
        return this.Field12249;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method4016(@NotNull @NotNull ClientChatEvent clientChatEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientChatEvent, (String)"event");
        Object[] objectArray = new Object[]{Character.valueOf('/'), Character.valueOf('.'), Character.valueOf(','), Character.valueOf(';'), Character.valueOf(':'), Character.valueOf('-'), Character.valueOf('+'), Class1796.Field16241.Field16272.Field17386};
        if (ArraysKt.contains((Object[])objectArray, (Object)Character.valueOf(clientChatEvent.getMessage().charAt(0)))) return;
        Class44 class44 = this.Field12246;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"greenText");
        if (class44.Method365()) {
            clientChatEvent.setMessage("> " + clientChatEvent.getMessage());
        }
        Class44 class442 = this.Field12245;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"autoGlobal");
        if (class442.Method365()) {
            clientChatEvent.setMessage('!' + clientChatEvent.getMessage());
        }
        Class44 class443 = this.Field12243;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"suffix");
        if (class443.Method365()) {
            clientChatEvent.setMessage(clientChatEvent.getMessage() + " | " + Class1796.Method6783() + " own you and all");
        }
        Class44 class444 = this.Field12244;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"antiSpamBypass");
        if (!class444.Method365()) return;
        clientChatEvent.setMessage(clientChatEvent.getMessage() + " | " + Random.Default.nextInt());
    }

    public Class991() {
        super("ChatModifier", "Chat features", Class97.Field8343);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 96;
            cArray2[n] = (char)(cArray[n] ^ (0x3363 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

