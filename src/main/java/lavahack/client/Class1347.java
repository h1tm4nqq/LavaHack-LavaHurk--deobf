//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.concurrent.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/features/module/exploit/FakePearl;", "Lcom/kisman/cc/features/module/Module;", "()V", "hasThrown", "", "packets", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lnet/minecraft/network/play/client/CPacketPlayer;", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "thrownPearlId", "", "onDisable", "", "onEnable", "update", "kisman.cc" })
public final class Class1347 extends Class42
{
    private final ConcurrentLinkedQueue Field14129;
    private boolean Field14130;
    private int Field14131;
    private final Class618 Field14132;
    private final Class618 Field14133;
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
        if (Method5406().player == null || Method5406().world == null) {
            return;
        }
        if (this.Field14131 != -1) {
            for (final Entity entity : Method5406().world.loadedEntityList) {
                if (entity.getEntityId() == this.Field14131 && entity instanceof EntityEnderPearl) {
                    if (!entity.isDead) {
                        continue;
                    }
                    this.Field14131 = -1;
                    this.Field14130 = false;
                }
            }
        }
        else if (!this.Field14129.isEmpty()) {}
    }
    
    public Class1347() {
        super("FakePearl", "Just skidded ik", Class97.Field8344);
        this.Field14129 = new ConcurrentLinkedQueue();
        this.Field14131 = -1;
        this.Field14132 = new Class618(new Class1738(this), new Predicate[0]);
        this.Field14133 = new Class618(new Class376(this), new Predicate[0]);
    }
    
    public static final Minecraft Method5406() {
        return Class42.Field8052;
    }
    
    public static final void Method5407(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final int Method5408(final Class1347 class1347) {
        return class1347.Field14131;
    }
    
    public static final void Method5409(final Class1347 class1347, final int field14131) {
        class1347.Field14131 = field14131;
    }
    
    public static final ConcurrentLinkedQueue Method5410(final Class1347 class1347) {
        return class1347.Field14129;
    }
    
    public static final boolean Method5411(final Class1347 class1347) {
        return class1347.Field14130;
    }
    
    public static final void Method5412(final Class1347 class1347, final boolean field14130) {
        class1347.Field14130 = field14130;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6EEB ^ 0x67));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
