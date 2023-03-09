//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.function.Predicate;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class2012;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;

@Class2012
public class Class505
extends Class42 {
    private final Class44 Field10123 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble(4657715973212602368L), 0.0, Double.longBitsToDouble(4666723172467343360L), Class467.Field9943));
    private final Class650 Field10124 = new Class650();
    private boolean Field10125 = true;
    private boolean Field10126 = false;
    @Class1801
    private final Class618 Field10127 = new Class618(this::Method2339, new Predicate[0]);
    private int Field10128;

    public Class505() {
        super("NoRotate", "NoRotate", Class97.Field8340);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field10127);
        Class1393.Method5507().Method1886("This module might desync you!");
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field10127);
    }

    @Override
    public void Method45() {
        if (!this.Field10126) return;
        if (this.Field10125) return;
        if (!this.Field10124.Method2797(this.Field10123.Method335())) return;
        this.Field10125 = true;
        this.Field10126 = false;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2337(FMLNetworkEvent.ClientConnectedToServerEvent clientConnectedToServerEvent) {
        this.Field10124.Method2801();
        this.Field10126 = true;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2338(FMLNetworkEvent.ClientDisconnectionFromServerEvent clientDisconnectionFromServerEvent) {
        this.Field10125 = false;
    }

    private void Method2339(Class544 class544) {
        if (!this.Field10125) return;
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) return;
        SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)class544.Method982();
        sPacketPlayerPosLook.yaw = Class505.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        sPacketPlayerPosLook.pitch = Class505.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 77;
            cArray2[n] = (char)(cArray[n] ^ (0x6CEC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

