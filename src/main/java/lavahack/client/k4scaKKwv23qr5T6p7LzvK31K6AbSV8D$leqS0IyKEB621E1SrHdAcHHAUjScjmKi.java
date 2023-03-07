//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.mojang.authlib.GameProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.k4scaKKwv23qr5T6p7LzvK31K6AbSV8D;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/features/module/render/PopCharmsRewrite$Pop;", "", "entity", "Lnet/minecraft/entity/player/EntityPlayer;", "(Lnet/minecraft/entity/player/EntityPlayer;)V", "model", "Lnet/minecraft/client/entity/EntityOtherPlayerMP;", "getModel", "()Lnet/minecraft/client/entity/EntityOtherPlayerMP;", "timestamp", "", "getTimestamp", "()J", "kisman.cc"})
final class k4scaKKwv23qr5T6p7LzvK31K6AbSV8D$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
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

    public k4scaKKwv23qr5T6p7LzvK31K6AbSV8D$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, (String)"entity");
        this.Field12529 = System.currentTimeMillis();
        GameProfile gameProfile = new GameProfile(entityPlayer.getUniqueID(), "");
        this.Field12528 = new EntityOtherPlayerMP((World)k4scaKKwv23qr5T6p7LzvK31K6AbSV8D.Method6929().world, gameProfile);
        this.Field12528.copyLocationAndAnglesFrom((Entity)entityPlayer);
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

    private static String Method4184(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1503755016 ^ (long)-1503755016);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1001911728L ^ 0x3BB7F54F);
            int n2 = (int)((long)-1007605095 ^ (long)-1007605096);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)280079091 ^ (long)280071340) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

