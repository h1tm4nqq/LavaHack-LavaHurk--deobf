//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.passive.*;
import net.minecraft.world.*;
import net.minecraft.client.entity.*;
import java.util.*;
import net.minecraft.network.*;
import io.netty.buffer.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J2\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J#\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u0016?\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/features/command/commands/RollBackDupeCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "canceller", "", "state", "toCancel", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDescription", "", "getSyntax", "packetReceived", "Lnet/minecraft/network/Packet;", "direction", "Lnet/minecraft/network/EnumPacketDirection;", "id", "packet", "buff", "Lio/netty/buffer/ByteBuf;", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "kisman.cc" })
public final class Class51 extends Class158
{
    private final ArrayList Field8146;
    private boolean Field8147;
    private boolean Field8148;
    @Nullable
    private static Class51 Field8149;
    public static final Class1961 Field8150;
    private String Field8151 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Intrinsics.checkParameterIsNotNull((Object)s, "s");
        Intrinsics.checkParameterIsNotNull((Object)array, "args");
        if (array.length > 1 && Intrinsics.areEqual((Object)array[1], (Object)"reset")) {
            this.Field8147 = false;
            this.Field8148 = false;
        }
        else if (!this.Field8147) {
            final World world = Method454().player.world;
            final Class<AbstractHorse> clazz = AbstractHorse.class;
            final EntityPlayerSP player = Method454().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            final List getEntitiesWithinAABB = world.getEntitiesWithinAABB((Class)clazz, player.getEntityBoundingBox().grow(Double.longBitsToDouble((long)1840593070 ^ 0x401800006DB538AEL), Double.longBitsToDouble((long)535755811 ^ 0x400000001FEEFC23L), Double.longBitsToDouble((long)1533577617 ^ 0x401800005B688991L)));
            if (getEntitiesWithinAABB.size() == 0) {
                this.Method438("Where's your ride?");
                return;
            }
            final AbstractHorse abstractHorse = getEntitiesWithinAABB.get(0);
            final Class538 method1332 = Class538.Field10274.Method1332();
            if (method1332 != null) {
                method1332.Method443("rollback", new String[0]);
            }
            this.Field8146.remove((Object)16);
            this.Field8148 = true;
            final Class1250 method1333 = Class1250.Field13664.Method7184();
            if (method1333 != null) {
                method1333.Method443("use", new String[] { (String)abstractHorse.getEntityId() });
            }
            this.Field8147 = true;
        }
        else {
            final World world2 = Method454().player.world;
            final Class<AbstractChestHorse> clazz2 = AbstractChestHorse.class;
            final EntityPlayerSP player2 = Method454().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            final List getEntitiesWithinAABB2 = world2.getEntitiesWithinAABB((Class)clazz2, player2.getEntityBoundingBox().grow(Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble((long)18123652 ^ 0x4000000001148B84L), Double.longBitsToDouble((long)1847400251 ^ 0x401800006E1D173BL)));
            AbstractChestHorse abstractChestHorse = null;
            for (final AbstractChestHorse abstractChestHorse2 : getEntitiesWithinAABB2) {
                if (abstractChestHorse2 != Method454().player.getRidingEntity()) {
                    abstractChestHorse = abstractChestHorse2;
                    break;
                }
            }
            if (abstractChestHorse == null) {
                this.Method438("Where's donkey?");
                return;
            }
            final Class1250 method1334 = Class1250.Field13664.Method7184();
            if (method1334 != null) {
                method1334.Method443("use", new String[] { "sneak", (String)abstractChestHorse.getEntityId() });
            }
            this.Field8146.add(16);
            final Class538 method1335 = Class538.Field10274.Method1332();
            if (method1335 != null) {
                method1335.Method443("rollback", new String[] { "double" });
            }
            this.Field8147 = false;
        }
    }
    
    @Nullable
    @Nullable
    public final Packet Method453(@NotNull @NotNull final EnumPacketDirection enumPacketDirection, final int i, @NotNull @NotNull final Packet packet, @Nullable @Nullable final ByteBuf byteBuf) {
        Intrinsics.checkParameterIsNotNull((Object)enumPacketDirection, "direction");
        Intrinsics.checkParameterIsNotNull((Object)packet, "packet");
        if (this.Field8148 && this.Field8146.contains(i)) {
            return null;
        }
        return packet;
    }
    
    @NotNull
    @NotNull
    public String Method447() {
        return "Dupe from FFP";
    }
    
    @NotNull
    @NotNull
    public String Method448() {
        return "rdupe reset or nothing";
    }
    
    public Class51() {
        super("rdupe");
        this.Field8146 = CollectionsKt.arrayListOf((Object[])new Integer[] { 12, 13, 14, 15 });
        Class51.Field8149 = this;
    }
    
    static {
        Field8150 = new Class1961((DefaultConstructorMarker)null);
    }
    
    public static final Minecraft Method454() {
        return Class158.Field8619;
    }
    
    public static final void Method455(final Minecraft field8619) {
        Class158.Field8619 = field8619;
    }
    
    public static final Class51 Method456() {
        return Class51.Field8149;
    }
    
    public static final void Method457(final Class51 field8149) {
        Class51.Field8149 = field8149;
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4E92 ^ 0x89));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
