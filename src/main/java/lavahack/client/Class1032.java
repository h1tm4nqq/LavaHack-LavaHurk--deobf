//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.entity.*;
import org.jetbrains.annotations.*;
import net.minecraft.entity.player.*;
import kotlin.jvm.internal.*;
import net.minecraft.world.*;
import com.mojang.authlib.*;
import net.minecraft.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f?\u0006\r" }, d2 = { "Lcom/kisman/cc/features/module/render/PopCharmsRewrite$Pop;", "", "entity", "Lnet/minecraft/entity/player/EntityPlayer;", "(Lnet/minecraft/entity/player/EntityPlayer;)V", "model", "Lnet/minecraft/client/entity/EntityOtherPlayerMP;", "getModel", "()Lnet/minecraft/client/entity/EntityOtherPlayerMP;", "timestamp", "", "getTimestamp", "()J", "kisman.cc" })
final class Class1032
{
    @NotNull
    private final EntityOtherPlayerMP Field12528;
    private final long Field12529;
    private String Field12530 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final EntityOtherPlayerMP Method4182() {
        return this.Field12528;
    }
    
    public final long Method4183() {
        return this.Field12529;
    }
    
    public Class1032(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "entity");
        this.Field12529 = System.currentTimeMillis();
        (this.Field12528 = new EntityOtherPlayerMP((World)Class1836.Method6929().world, new GameProfile(entityPlayer.getUniqueID(), ""))).copyLocationAndAnglesFrom((Entity)entityPlayer);
        this.Field12528.rotationYaw = entityPlayer.rotationYaw;
        this.Field12528.rotationYawHead = entityPlayer.rotationYawHead;
        this.Field12528.rotationPitch = entityPlayer.rotationPitch;
        this.Field12528.prevRotationYaw = entityPlayer.prevRotationYaw;
        this.Field12528.prevRotationPitch = entityPlayer.prevRotationPitch;
        this.Field12528.renderYawOffset = entityPlayer.renderYawOffset;
        this.Field12528.moveForward = entityPlayer.moveForward;
        this.Field12528.moveStrafing = entityPlayer.moveStrafing;
        this.Field12528.swingingHand = entityPlayer.swingingHand;
    }
    
    private static String Method4184(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x265F ^ 0x1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
