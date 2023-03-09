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
import lavahack.client.Class1738;
import lavahack.client.Class1796;
import lavahack.client.Class254;
import lavahack.client.Class376;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderPearl;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/features/module/exploit/FakePearl;", "Lcom/kisman/cc/features/module/Module;", "()V", "hasThrown", "", "packets", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lnet/minecraft/network/play/client/CPacketPlayer;", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "thrownPearlId", "", "onDisable", "", "onEnable", "update", "kisman.cc"})
public final class Class1347
extends Class42 {
    private final ConcurrentLinkedQueue Field14129 = new ConcurrentLinkedQueue();
    private boolean Field14130;
    private int Field14131 = -1;
    private final Class618 Field14132 = new Class618((Class254)new Class1738(this), new Predicate[0]);
    private final Class618 Field14133 = new Class618((Class254)new Class376(this), new Predicate[0]);
    private int Field14134;

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field14132);
        Class1796.Field16242.Method706(this.Field14133);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field14132);
        Class1796.Field16242.Method711(this.Field14133);
    }

    @Override
    public void Method45() {
        if (Class1347.Method5406().player == null) return;
        if (Class1347.Method5406().world == null) {
            return;
        }
        if (this.Field14131 == -1) {
            Collection collection = this.Field14129;
            boolean bl = false;
            if (collection.isEmpty()) return;
            return;
        }
        Iterator iterator = Class1347.Method5406().world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity.getEntityId() != this.Field14131 || !(entity instanceof EntityEnderPearl) || !entity.isDead) continue;
            this.Field14131 = -1;
            this.Field14130 = false;
        }
    }

    public Class1347() {
        super("FakePearl", "Just skidded ik", Class97.Field8344);
    }

    public static final Minecraft Method5406() {
        return Class42.Field8052;
    }

    public static final void Method5407(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final int Method5408(Class1347 class1347) {
        return class1347.Field14131;
    }

    public static final void Method5409(Class1347 class1347, int n) {
        class1347.Field14131 = n;
    }

    public static final ConcurrentLinkedQueue Method5410(Class1347 class1347) {
        return class1347.Field14129;
    }

    public static final boolean Method5411(Class1347 class1347) {
        return class1347.Field14130;
    }

    public static final void Method5412(Class1347 class1347, boolean bl) {
        class1347.Field14130 = bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 103;
            cArray2[n] = (char)(cArray[n] ^ (0x6EEB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

