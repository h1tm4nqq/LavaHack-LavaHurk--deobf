//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.passive.AbstractChestHorse
 *  net.minecraft.entity.passive.AbstractHorse
 *  net.minecraft.network.EnumPacketDirection
 *  net.minecraft.network.Packet
 *  net.minecraft.world.World
 */
package lavahack.client;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1250;
import lavahack.client.Class158;
import lavahack.client.Class1961;
import lavahack.client.Class538;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.passive.AbstractChestHorse;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.Packet;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J2\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J#\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u0016\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/features/command/commands/RollBackDupeCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "canceller", "", "state", "toCancel", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDescription", "", "getSyntax", "packetReceived", "Lnet/minecraft/network/Packet;", "direction", "Lnet/minecraft/network/EnumPacketDirection;", "id", "packet", "buff", "Lio/netty/buffer/ByteBuf;", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "kisman.cc"})
public final class Class51
extends Class158 {
    private final ArrayList Field8146 = CollectionsKt.arrayListOf((Object[])new Integer[]{12, 13, 14, 15});
    private boolean Field8147;
    private boolean Field8148;
    @Nullable
    private static Class51 Field8149;
    public static final Class1961 Field8150;
    private String Field8151 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Object object2;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
        if (stringArray.length > 1 && Intrinsics.areEqual((Object)stringArray[1], (Object)"reset")) {
            this.Field8147 = false;
            this.Field8148 = false;
            return;
        }
        if (!this.Field8147) {
            World world = Class51.Method454().player.world;
            EntityPlayerSP entityPlayerSP = Class51.Method454().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            List list = world.getEntitiesWithinAABB(AbstractHorse.class, entityPlayerSP.getEntityBoundingBox().grow(Double.longBitsToDouble((long)1840593070 ^ 0x401800006DB538AEL), Double.longBitsToDouble((long)535755811 ^ 0x400000001FEEFC23L), Double.longBitsToDouble((long)1533577617 ^ 0x401800005B688991L)));
            if (list.size() == 0) {
                this.Method438("Where's your ride?");
                return;
            }
            AbstractHorse abstractHorse = (AbstractHorse)list.get(0);
            Class538 class538 = Class538.Field10274.Method1332();
            if (class538 != null) {
                String string2 = "rollback";
                Class538 class5382 = class538;
                boolean bl = false;
                String[] stringArray2 = new String[]{};
                class5382.Method443(string2, stringArray2);
            }
            this.Field8146.remove((Object)16);
            this.Field8148 = true;
            Class1250 class1250 = Class1250.Field13664.Method7184();
            if (class1250 != null) {
                class1250.Method443("use", new String[]{(String)((Object)Integer.valueOf(abstractHorse.getEntityId()))});
            }
            this.Field8147 = true;
            return;
        }
        World world = Class51.Method454().player.world;
        EntityPlayerSP entityPlayerSP = Class51.Method454().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        List list = world.getEntitiesWithinAABB(AbstractChestHorse.class, entityPlayerSP.getEntityBoundingBox().grow(Double.longBitsToDouble(4618441417868443648L), Double.longBitsToDouble((long)18123652 ^ 0x4000000001148B84L), Double.longBitsToDouble((long)1847400251 ^ 0x401800006E1D173BL)));
        AbstractChestHorse abstractChestHorse = null;
        for (Object object2 : list) {
            if (object2 == Class51.Method454().player.getRidingEntity()) continue;
            abstractChestHorse = object2;
            break;
        }
        if (abstractChestHorse == null) {
            this.Method438("Where's donkey?");
            return;
        }
        Class1250 class1250 = Class1250.Field13664.Method7184();
        if (class1250 != null) {
            class1250.Method443("use", new String[]{"sneak", (String)((Object)Integer.valueOf(abstractChestHorse.getEntityId()))});
        }
        object2 = this.Field8146;
        Integer n = 16;
        boolean bl = false;
        object2.add(n);
        Class538 class538 = Class538.Field10274.Method1332();
        if (class538 != null) {
            class538.Method443("rollback", new String[]{"double"});
        }
        this.Field8147 = false;
    }

    @Nullable
    @Nullable
    public final Packet Method453(@NotNull @NotNull EnumPacketDirection enumPacketDirection, int n, @NotNull @NotNull Packet packet, @Nullable @Nullable ByteBuf byteBuf) {
        Intrinsics.checkParameterIsNotNull((Object)enumPacketDirection, (String)"direction");
        Intrinsics.checkParameterIsNotNull((Object)packet, (String)"packet");
        if (!this.Field8148) return packet;
        if (!this.Field8146.contains(n)) return packet;
        return null;
    }

    @Override
    @NotNull
    @NotNull
    public String Method447() {
        return "Dupe from FFP";
    }

    @Override
    @NotNull
    @NotNull
    public String Method448() {
        return "rdupe reset or nothing";
    }

    public Class51() {
        super("rdupe");
        Field8149 = this;
    }

    static {
        Field8150 = new Class1961(null);
    }

    public static final Minecraft Method454() {
        return Class158.Field8619;
    }

    public static final void Method455(Minecraft minecraft) {
        Class158.Field8619 = minecraft;
    }

    public static final Class51 Method456() {
        return Field8149;
    }

    public static final void Method457(Class51 class51) {
        Field8149 = class51;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 137;
            cArray2[n] = (char)(cArray[n] ^ (0x4E92 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

