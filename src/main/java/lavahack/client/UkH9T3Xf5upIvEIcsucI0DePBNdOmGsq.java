//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderPearl
 */
package lavahack.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import kotlin.Metadata;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderPearl;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/features/module/exploit/FakePearl;", "Lcom/kisman/cc/features/module/Module;", "()V", "hasThrown", "", "packets", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lnet/minecraft/network/play/client/CPacketPlayer;", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "thrownPearlId", "", "onDisable", "", "onEnable", "update", "kisman.cc"})
public final class UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final ConcurrentLinkedQueue Field14129 = new ConcurrentLinkedQueue();
    private boolean Field14130;
    private int Field14131 = (int)((long)-1652623655 ^ (long)1652623654);
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14132 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this), new Predicate[(int)-447367228L ^ 0xE555B7C4]);
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14133 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this), new Predicate[(int)((long)-2017852380 ^ (long)-2017852380)]);
    private int Field14134;

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field14132);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field14133);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field14132);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field14133);
    }

    @Override
    public void Method45() {
        if (UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Method5406().player == null) return;
        if (UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Method5406().world == null) {
            return;
        }
        if (this.Field14131 == (int)((long)-1637423633 ^ (long)1637423632)) {
            int n;
            Collection collection = this.Field14129;
            int n2 = (int)-1791152146L ^ 0x953D2FEE;
            if (!collection.isEmpty()) {
                n = (int)((long)-457293142 ^ (long)-457293141);
                return;
            }
            n = (int)((long)-1943628909 ^ (long)-1943628909);
            return;
        }
        Iterator iterator = UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Method5406().world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity.getEntityId() != this.Field14131 || !(entity instanceof EntityEnderPearl) || !entity.isDead) continue;
            this.Field14131 = (int)1913015396L ^ 0x8DF9B39B;
            this.Field14130 = (int)((long)49588694 ^ (long)49588694);
        }
    }

    public UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq() {
        super("FakePearl", "Just skidded ik", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    public static final Minecraft Method5406() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method5407(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final int Method5408(UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq) {
        return ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Field14131;
    }

    public static final void Method5409(UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq, int n) {
        ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Field14131 = n;
    }

    public static final ConcurrentLinkedQueue Method5410(UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq) {
        return ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Field14129;
    }

    public static final boolean Method5411(UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq) {
        return ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Field14130;
    }

    public static final void Method5412(UkH9T3Xf5upIvEIcsucI0DePBNdOmGsq ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq, boolean bl) {
        ukH9T3Xf5upIvEIcsucI0DePBNdOmGsq.Field14130 = bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)412486699 ^ (long)412486699);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)456550948L ^ 0x1B366ADB);
            int n2 = (int)((long)1504920463 ^ (long)1504920552);
            cArray2[n] = (char)(cArray[n] ^ ((int)340606273L ^ 0x144D53AA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

