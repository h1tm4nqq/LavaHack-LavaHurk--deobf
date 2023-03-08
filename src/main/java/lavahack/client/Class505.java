//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraft.network.play.server.*;

@Class2012
public class Class505 extends Class42
{
    private final Class44 Field10123;
    private final Class650 Field10124;
    private boolean Field10125;
    private boolean Field10126;
    @Class1801
    private final Class618 Field10127;
    private int Field10128;
    
    public Class505() {
        super("NoRotate", "NoRotate", Class97.Field8340);
        this.Field10123 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble(4657715973212602368L), 0.0, Double.longBitsToDouble(4666723172467343360L), Class467.Field9943));
        this.Field10124 = new Class650();
        this.Field10125 = true;
        this.Field10126 = false;
        this.Field10127 = new Class618(this::Method2339, new Predicate[0]);
    }
    
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field10127);
        Class1393.Method5507().Method1886("This module might desync you!");
    }
    
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field10127);
    }
    
    public void Method45() {
        if (this.Field10126 && !this.Field10125 && this.Field10124.Method2797((long)this.Field10123.Method335())) {
            this.Field10125 = true;
            this.Field10126 = false;
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2337(final FMLNetworkEvent$ClientConnectedToServerEvent fmlNetworkEvent$ClientConnectedToServerEvent) {
        this.Field10124.Method2801();
        this.Field10126 = true;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2338(final FMLNetworkEvent$ClientDisconnectionFromServerEvent fmlNetworkEvent$ClientDisconnectionFromServerEvent) {
        this.Field10125 = false;
    }
    
    private void Method2339(final Class544 class544) {
        if (this.Field10125 && class544.Method982() instanceof SPacketPlayerPosLook) {
            final SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)class544.Method982();
            sPacketPlayerPosLook.yaw = Class505.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
            sPacketPlayerPosLook.pitch = Class505.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6CEC ^ 0x4D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
