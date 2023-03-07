//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h$1;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/features/module/misc/HotbarScroller;", "Lcom/kisman/cc/features/module/Module;", "()V", "delay", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getNextValidSlot", "", "onEnable", "", "update", "kisman.cc"})
public final class ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12671 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1536874356 ^ 0x405900005B9AD774L), 1.0, Double.longBitsToDouble(0xD664E4B35EBB6417L ^ 0x96EBA4B35EBB6417L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12672 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private String Field12673 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        this.Field12672.Method2801();
    }

    @Override
    public void Method45() {
        int n = (int)-1544831489L ^ 0xA3EBBDFF;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field12671;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"delay");
        if (this.Field12672.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method369())) {
            this.Field12672.Method2801();
            n = (int)((long)-1651577707 ^ (long)-1651577708);
        }
        if (ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h.Method4306().player == null) return;
        if (ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h.Method4306().world != null) return;
    }

    private final int Method4305() {
        int n;
        if (ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h.Method4306().player.inventory.currentItem == ((int)133705116L ^ 0x7F82D95)) {
            n = (int)-2058344926L ^ 0x85502622;
            return n;
        }
        n = ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h.Method4306().player.inventory.currentItem + (int)((long)793393380 ^ (long)793393381);
        return n;
    }

    public ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h() {
        super("HotbarScroller", "uwu like future.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        this.Method44(new ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h$1(this));
    }

    public static final Minecraft Method4306() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4307(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4308(ZnogxmcZ86E14cY0AwP7sfhLMaUpFT6h znogxmcZ86E14cY0AwP7sfhLMaUpFT6h) {
        return znogxmcZ86E14cY0AwP7sfhLMaUpFT6h.Field12671;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-378518897L ^ 0xE970428F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)567423044L ^ 0x21D230BB);
            int n2 = (int)((long)1761918857 ^ (long)1761918970);
            cArray2[n] = (char)(cArray[n] ^ ((int)189299901L ^ 0xB48619E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

