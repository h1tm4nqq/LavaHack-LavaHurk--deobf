//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.server.*;
import net.minecraft.network.*;
import net.minecraft.util.math.*;
import java.util.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "kotlin.jvm.PlatformType", "invoke" })
final class Class657 implements Class254
{
    final Class504 Field10807;
    private String Field10808 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method979(final Object o) {
        this.Method2831((Class544)o);
    }
    
    public final void Method2831(final Class544 class544) {
        if (Class504.Method2331(this.Field10807) == null) {
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull((Object)class544, "it");
        final Packet method982 = class544.Method982();
        if (method982 instanceof SPacketBlockChange) {
            String str = "unknown";
            if (Intrinsics.areEqual((Object)((SPacketBlockChange)method982).getBlockPosition(), (Object)Class504.Method2333(this.Field10807))) {
                str = "heartbeat";
                final Class1101 method983 = Class504.Method2331(this.Field10807);
                if (method983 == null) {
                    Intrinsics.throwNpe();
                }
                method983.Method4504();
            }
            else {
                final BlockPos getBlockPosition = ((SPacketBlockChange)method982).getBlockPosition();
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlockPosition, "packet.blockPosition");
                if (getBlockPosition.getY() != 0) {
                    return;
                }
                final Class1101 method984 = Class504.Method2331(this.Field10807);
                if (method984 == null) {
                    Intrinsics.throwNpe();
                }
                for (final ChunkPos chunkPos : method984.Method4498()) {
                    if (Intrinsics.areEqual((Object)chunkPos.getBlock(0, 0, 0), (Object)((SPacketBlockChange)method982).getBlockPosition())) {
                        final Class1101 method985 = Class504.Method2331(this.Field10807);
                        if (method985 == null) {
                            Intrinsics.throwNpe();
                        }
                        final ChunkPos chunkPos2 = chunkPos;
                        Intrinsics.checkExpressionValueIsNotNull((Object)chunkPos2, "chunk");
                        method985.Method4507(chunkPos2);
                        str = "primary chunk";
                        break;
                    }
                }
            }
            final Class44 method986 = this.Field10807.Method2320();
            Intrinsics.checkExpressionValueIsNotNull((Object)method986, "this.debug");
            if (method986.Method365()) {
                final Class1740 method987 = Class1393.Method5506();
                final StringBuilder append = new StringBuilder().append(str).append(' ').append(((SPacketBlockChange)method982).getBlockPosition().toString()).append(" -> ");
                final IBlockState blockState = ((SPacketBlockChange)method982).blockState;
                Intrinsics.checkExpressionValueIsNotNull((Object)blockState, "packet.blockState");
                final Block getBlock = blockState.getBlock();
                Intrinsics.checkExpressionValueIsNotNull((Object)getBlock, "packet.blockState.block");
                method987.Method1886(append.append(getBlock.getLocalizedName()).toString());
            }
        }
        else if (method982 instanceof SPacketRespawn) {
            final Class1101 method988 = Class504.Method2331(this.Field10807);
            if (method988 == null) {
                Intrinsics.throwNpe();
            }
            if (method988.Method4500() != ((SPacketRespawn)method982).getDimensionID()) {
                final Class1101 method989 = Class504.Method2331(this.Field10807);
                if (method989 == null) {
                    Intrinsics.throwNpe();
                }
                method989.Method4505(((SPacketRespawn)method982).getDimensionID());
            }
        }
    }
    
    Class657(final Class504 field10807) {
        this.Field10807 = field10807;
    }
    
    private static String Method2832(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD56 ^ 0xC2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
