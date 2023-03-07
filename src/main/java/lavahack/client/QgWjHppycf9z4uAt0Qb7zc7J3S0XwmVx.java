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
import lavahack.client.DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6;
import lavahack.client.QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
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
public final class QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private final ArrayList Field8146;
    private boolean Field8147;
    private boolean Field8148;
    @Nullable
    private static QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx Field8149;
    public static final QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8150;
    private String Field8151 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Object object2;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
        if (stringArray.length > (int)((long)-928388202 ^ (long)-928388201) && Intrinsics.areEqual((Object)stringArray[(int)-275984248L ^ 0xEF8CD089], (Object)"reset")) {
            this.Field8147 = (int)-402795438L ^ 0xE7FDD452;
            this.Field8148 = (int)1057924987L ^ 0x3F0EA77B;
            return;
        }
        if (!this.Field8147) {
            World world = QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx.Method454().player.world;
            EntityPlayerSP entityPlayerSP = QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx.Method454().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            List list = world.getEntitiesWithinAABB(AbstractHorse.class, entityPlayerSP.getEntityBoundingBox().grow(Double.longBitsToDouble((long)1840593070 ^ 0x401800006DB538AEL), Double.longBitsToDouble((long)535755811 ^ 0x400000001FEEFC23L), Double.longBitsToDouble((long)1533577617 ^ 0x401800005B688991L)));
            if (list.size() == 0) {
                this.Method438("Where's your ride?");
                return;
            }
            AbstractHorse abstractHorse = (AbstractHorse)list.get((int)-1558442558L ^ 0xA31C0DC2);
            O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Field10274.Method1332();
            if (o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 != null) {
                String string2 = "rollback";
                O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc62 = o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6;
                int n = (int)-957255012L ^ 0xC6F1729C;
                String[] stringArray2 = new String[(int)1379614381L ^ 0x523B3EAD];
                o1wfrBba1z1C4gxnTtwfHkAxEr02HOc62.Method443(string2, stringArray2);
            }
            this.Field8146.remove((Object)((int)((long)-321338459 ^ (long)-321338460) << 4));
            this.Field8148 = (int)((long)1595839310 ^ (long)1595839311);
            DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Field13664.Method7184();
            if (dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD != null) {
                String[] stringArray3 = new String[(int)((long)1003293710 ^ (long)1003293711)];
                stringArray3[(int)((long)-74997513 ^ (long)-74997513)] = (String)((Object)Integer.valueOf(abstractHorse.getEntityId()));
                dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Method443("use", stringArray3);
            }
            this.Field8147 = (int)1143532478L ^ 0x4428EBBF;
            return;
        }
        World world = QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx.Method454().player.world;
        EntityPlayerSP entityPlayerSP = QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx.Method454().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        List list = world.getEntitiesWithinAABB(AbstractChestHorse.class, entityPlayerSP.getEntityBoundingBox().grow(Double.longBitsToDouble(0x6283637B71C96EADL ^ 0x229B637B71C96EADL), Double.longBitsToDouble((long)18123652 ^ 0x4000000001148B84L), Double.longBitsToDouble((long)1847400251 ^ 0x401800006E1D173BL)));
        AbstractChestHorse abstractChestHorse = null;
        for (Object object2 : list) {
            if (object2 == QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx.Method454().player.getRidingEntity()) continue;
            abstractChestHorse = object2;
            break;
        }
        if (abstractChestHorse == null) {
            this.Method438("Where's donkey?");
            return;
        }
        DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD = DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Field13664.Method7184();
        if (dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD != null) {
            String[] stringArray4 = new String[(int)((long)1943474203 ^ (long)1943474202) << 1];
            stringArray4[(int)-227828222L ^ 0xF26B9E02] = "sneak";
            stringArray4[(int)55911776L ^ 0x3552561] = (String)((Object)Integer.valueOf(abstractChestHorse.getEntityId()));
            dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD.Method443("use", stringArray4);
        }
        object2 = this.Field8146;
        Integer n = (int)((long)774227640 ^ (long)774227641) << 4;
        int n2 = (int)((long)-328420953 ^ (long)-328420953);
        object2.add(n);
        O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 = O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Field10274.Method1332();
        if (o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6 != null) {
            String[] stringArray5 = new String[(int)1891533598L ^ 0x70BE831F];
            stringArray5[(int)((long)-915639605 ^ (long)-915639605)] = "double";
            o1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.Method443("rollback", stringArray5);
        }
        this.Field8147 = (int)-854055899L ^ 0xCD182425;
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

    public QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx() {
        super("rdupe");
        Object[] objectArray = new Integer[((int)-1415339541L ^ 0xABA3A1EA) << 2];
        objectArray[(int)((long)-617050548 ^ (long)-617050548)] = ((int)896810102L ^ 0x35743C75) << 2;
        objectArray[(int)1185137954L ^ 0x46A3C523] = (int)((long)636015895 ^ (long)636015898);
        objectArray[((int)-195951201L ^ 0xF452059E) << 1] = (int)((long)573686718 ^ (long)573686713) << 1;
        objectArray[(int)((long)-997715620 ^ (long)-997715617)] = (int)-1609933320L ^ 0xA00A5DF7;
        this.Field8146 = CollectionsKt.arrayListOf((Object[])objectArray);
        Field8149 = this;
    }

    static {
        Field8150 = new QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    public static final Minecraft Method454() {
        return FrvoqED59Mj96pmO7hxn2tEew1fZAOzj.Field8619;
    }

    public static final void Method455(Minecraft minecraft) {
        FrvoqED59Mj96pmO7hxn2tEew1fZAOzj.Field8619 = minecraft;
    }

    public static final QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx Method456() {
        return Field8149;
    }

    public static final void Method457(QgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx qgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx) {
        Field8149 = qgWjHppycf9z4uAt0Qb7zc7J3S0XwmVx;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)752650568L ^ 0x2CDC8948;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1091101578 ^ (long)-1091101559);
            int n2 = (int)((long)-1036860516 ^ (long)-1036860651);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1052447006 ^ (long)1052456535) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

