//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.network.play.client.*;
import net.minecraft.entity.*;
import net.minecraft.client.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.client.network.*;
import net.minecraft.client.multiplayer.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016?\u0006\u0002\u0010\u000b?\u0006\u000e" }, d2 = { "Lcom/kisman/cc/features/command/commands/UseCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "getDescription", "", "getSyntax", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "Mode", "kisman.cc" })
public final class Class1250 extends Class158
{
    @Nullable
    private static Class1250 Field13663;
    public static final Class1930 Field13664;
    private String Field13665 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Intrinsics.checkParameterIsNotNull((Object)s, "s");
        Intrinsics.checkParameterIsNotNull((Object)array, "args");
        int i = 0;
        int j = 0;
        int n = 1;
        while (true) {
            final int n2 = n;
            final Integer n3 = (array != null) ? Integer.valueOf(array.length) : null;
            if (n3 == null) {
                Intrinsics.throwNpe();
            }
            if (n2 >= n3) {
                break;
            }
            if (Intrinsics.areEqual((Object)array[n], (Object)"sneak")) {
                ++n;
            }
            else {
                if (!Intrinsics.areEqual((Object)array[n], (Object)"attack")) {
                    break;
                }
                ++n;
            }
        }
        int n4;
        Class581 class581;
        if (array.length - n >= 3) {
            n4 = Integer.parseInt(array[n++]);
            i = Integer.parseInt(array[n++]);
            j = Integer.parseInt(array[n]);
            class581 = Class581.Field10477;
        }
        else if (array.length - n >= 1) {
            n4 = Integer.parseInt(array[n]);
            class581 = Class581.Field10478;
        }
        else {
            final RayTraceResult objectMouseOver = Method5013().objectMouseOver;
            if (objectMouseOver == null) {
                this.Method438("No Target");
                return;
            }
            if (objectMouseOver.typeOfHit == RayTraceResult$Type.BLOCK) {
                final BlockPos getBlockPos;
                final BlockPos blockPos = getBlockPos = objectMouseOver.getBlockPos();
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockPos, "pos");
                n4 = getBlockPos.getX();
                i = blockPos.getY();
                j = blockPos.getZ();
                class581 = Class581.Field10477;
            }
            else {
                if (objectMouseOver.typeOfHit != RayTraceResult$Type.ENTITY) {
                    this.Method438("No Target");
                    return;
                }
                n4 = objectMouseOver.entityHit.getEntityId();
                class581 = Class581.Field10478;
            }
        }
        String s2 = null;
        final Class581 class582 = class581;
        if (class582 != null) {
            switch (Class1078.Field12797[class582.ordinal()]) {
                case 1: {
                    final EntityPlayerSP player = Method5013().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                    final Vec3d getLookVec = player.getLookVec();
                    Intrinsics.checkExpressionValueIsNotNull((Object)getLookVec, "mc.player.lookVec");
                    final Vec3d vec3d = getLookVec;
                    Method5013().player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(new BlockPos(n4, i, j), EnumFacing.UP, EnumHand.MAIN_HAND, (float)(Object)Double.valueOf(vec3d.x), (float)(Object)Double.valueOf(vec3d.y), (float)(Object)Double.valueOf(vec3d.z)));
                    final StringCompanionObject instance = StringCompanionObject.INSTANCE;
                    final String s3 = "Using block (%d, %d, %d)";
                    final Object[] array2 = { n4, i, j };
                    final String format = s3;
                    final Object[] original = array2;
                    final String format2 = String.format(format, Arrays.copyOf(original, original.length));
                    Intrinsics.checkExpressionValueIsNotNull((Object)format2, "java.lang.String.format(format, *args)");
                    s2 = format2;
                    break;
                }
                case 2: {
                    final NetHandlerPlayClient connection = Method5013().player.connection;
                    final WorldClient world = Method5013().world;
                    Intrinsics.checkExpressionValueIsNotNull((Object)world, "mc.world");
                    connection.sendPacket((Packet)new CPacketUseEntity((Entity)new Class719((World)world, n4), EnumHand.MAIN_HAND));
                    final StringCompanionObject instance2 = StringCompanionObject.INSTANCE;
                    final String s4 = "Using entity [%d]";
                    final Object[] array3 = { n4 };
                    final String format3 = s4;
                    final Object[] original2 = array3;
                    final String format4 = String.format(format3, Arrays.copyOf(original2, original2.length));
                    Intrinsics.checkExpressionValueIsNotNull((Object)format4, "java.lang.String.format(format, *args)");
                    s2 = format4;
                    break;
                }
            }
        }
        this.Method437(s2);
    }
    
    @NotNull
    @NotNull
    @Override
    public String Method447() {
        return "idk";
    }
    
    @NotNull
    @NotNull
    @Override
    public String Method448() {
        return "use sneak/attack <entity_id> | <block_x> <block_y> <block_z>";
    }
    
    public Class1250() {
        super("use");
        Class1250.Field13663 = this;
    }
    
    static {
        Field13664 = new Class1930(null);
    }
    
    public static final Minecraft Method5013() {
        return Class158.Field8619;
    }
    
    public static final void Method5014(final Minecraft field8619) {
        Class158.Field8619 = field8619;
    }
    
    public static final Class1250 Method5015() {
        return Class1250.Field13663;
    }
    
    public static final void Method5016(final Class1250 field13663) {
        Class1250.Field13663 = field13663;
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6E1 ^ 0x9A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
