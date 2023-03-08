//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import kotlin.*;
import net.minecraft.network.*;
import net.minecraft.entity.player.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.play.server.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lnet/minecraft/entity/player/EntityPlayer;", "accept" })
final class Class30 implements Consumer
{
    final Class376 Field7940;
    final Packet Field7941;
    private String Field7942 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void accept(final Object o) {
        this.Method247((EntityPlayer)o);
    }
    
    public final void Method247(@NotNull @NotNull final EntityPlayer entityPlayer) {
        Intrinsics.checkParameterIsNotNull((Object)entityPlayer, "it");
        Class1347.Method5406().player.motionX = 0.0;
        Class1347.Method5406().player.motionY = 0.0;
        Class1347.Method5406().player.motionZ = 0.0;
        Class1347.Method5406().player.movementInput.moveForward = 0.0f;
        Class1347.Method5406().player.movementInput.moveStrafe = 0.0f;
        Class1347.Method5406().player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1347.Method5406().player.posX, Class1347.Method5406().player.posY + 1.0, Class1347.Method5406().player.posZ, false));
        Class1347.Method5412(this.Field7940.Field9582, true);
        Class1347.Method5409(this.Field7940.Field9582, ((SPacketSpawnObject)this.Field7941).getEntityID());
    }
    
    Class30(final Class376 field7940, final Packet field7941) {
        this.Field7940 = field7940;
        this.Field7941 = field7941;
    }
    
    private static String Method248(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4458 ^ 0x6B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
