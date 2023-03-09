/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.util.HashMap;
import java.util.function.Predicate;
import kotlin.Metadata;
import lavahack.client.Class1231;
import lavahack.client.Class1303;
import lavahack.client.Class1796;
import lavahack.client.Class187;
import lavahack.client.Class1887;
import lavahack.client.Class2079;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Class1887
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/module/client/ChunkAnimator;", "Lcom/kisman/cc/features/module/Module;", "()V", "chunks", "Ljava/util/HashMap;", "Lnet/minecraft/client/renderer/chunk/RenderChunk;", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/collections/HashMap;", "easing", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$Easing;", "length", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "renderChunk", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventRenderChunk;", "renderChunkContainer", "Lcom/kisman/cc/event/events/EventRenderChunkContainer;", "onDisable", "", "onEnable", "kisman.cc"})
public final class Class1259
extends Class42 {
    private final Class44 Field13702 = this.Method23(new Class44("Length", (Class42)this, Double.longBitsToDouble(4652007308841189376L), Double.longBitsToDouble((long)360104684 ^ 0x406F40001576C2ECL), Double.longBitsToDouble((long)1970040711 ^ 0x40B38800756C6F87L), Class467.Field9943));
    private final Class1303 Field13703 = new Class1303("Easing", (Class42)this, Class187.Field8814).Method5303();
    private final HashMap Field13704 = new HashMap();
    private final Class618 Field13705 = new Class618((Class254)new Class2079(this), new Predicate[0]);
    private final Class618 Field13706 = new Class618((Class254)new Class1231(this), new Predicate[0]);
    private String Field13707 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field13705);
        Class1796.Field16242.Method706(this.Field13706);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field13705);
        Class1796.Field16242.Method711(this.Field13706);
    }

    public Class1259() {
        super("ChunkAnimator", "Implementation of the chunk animator mod.", Class97.Field8339);
    }

    public static final HashMap Method5088(Class1259 class1259) {
        return class1259.Field13704;
    }

    public static final Class44 Method5089(Class1259 class1259) {
        return class1259.Field13702;
    }

    public static final Class1303 Method5090(Class1259 class1259) {
        return class1259.Field13703;
    }

    public static final Minecraft Method5091() {
        return Class42.Field8052;
    }

    public static final void Method5092(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 229;
            cArray2[n] = (char)(cArray[n] ^ (0x6D7D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

