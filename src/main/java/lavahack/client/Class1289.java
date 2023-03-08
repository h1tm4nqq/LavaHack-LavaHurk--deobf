//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import net.minecraft.client.entity.*;

public class Class1289 extends Class42
{
    private final Class44 Field13886;
    private int Field13887;
    
    public Class1289() {
        super("AirJump", "Allows to jump in air", Class97.Field8340);
        this.Field13886 = this.Method23(new Class44("Mode", this, "Vanilla", Arrays.asList("Vanilla", "NCP", "Matrix")));
        super.Method44(this::Method5238);
    }
    
    @Override
    public void Method45() {
        if (Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13886.Method359().equalsIgnoreCase("Vanilla") && Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isPressed()) {
            Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(4604480259023595110L);
        }
        else if (this.Field13886.Method359().equalsIgnoreCase("NCP")) {
            Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = true;
            Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isAirBorne = false;
        }
        else if (this.Field13886.Method359().equalsIgnoreCase("Matrix") && Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed) {
            Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            final EntityPlayerSP player = Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player.motionY -= Double.longBitsToDouble(4598175219545276416L);
            if (Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.pressed) {
                Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.elapsedTicks = 1;
                final EntityPlayerSP player2 = Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player2.motionX *= Double.longBitsToDouble(4607632778870128640L);
                final EntityPlayerSP player3 = Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player3.motionZ *= Double.longBitsToDouble((long)2060591498 ^ 0x3FF19999DAD2218AL);
                Class1289.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = false;
            }
        }
    }
    
    private String Method5238() {
        return "[" + this.Field13886.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x32DF ^ 0x7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
