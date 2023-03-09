//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import lavahack.client.Class2159;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.Display;

public class Class1973
extends Class42 {
    private final Class44 Field17082 = this.Method23(new Class44("Remove Entity AI Watch Closest", (Class42)this, false));
    private final Class44 Field17083 = this.Method23(new Class44("Remove Entity AI LookIdle", (Class42)this, false));
    private final Class44 Field17084 = this.Method23(new Class44("Replace Look Helper", (Class42)this, true));
    public final Class44 Field17085 = this.Method23(new Class44("TileEntity Render Range(Squared)", (Class42)this, Double.longBitsToDouble(0x40B0000000000000L), 0.0, Double.longBitsToDouble((long)1592253923 ^ 0x40B000005EE7DDE3L), true));
    public final Class44 Field17086 = this.Method23(new Class44("Custom Entity Render Range", (Class42)this, false));
    public final Class44 Field17087 = this.Method23(new Class44("Entity Render Range", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)2005098274 ^ 0x4049000077835F22L), true).Method313(this.Field17086::Method365));
    private final Class44 Field17088 = this.Method23(new Class44("Lost Focus", (Class42)this, false));
    public static Class1973 Field17089;
    private int Field17090;
    private int Field17091;

    public Class1973() {
        super("Optimizer", Class97.Field8343);
        Field17089 = this;
    }

    @Override
    public void Method38() {
        Class2159.Field17865 = true;
        this.Field17090 = Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate;
    }

    @Override
    public void Method39() {
        Class2159.Field17868 = false;
        Class2159.Field17867 = false;
        Class2159.Field17866 = false;
        Class2159.Field17865 = false;
    }

    @Override
    public void Method45() {
        Class2159.Field17866 = this.Field17082.Method365();
        Class2159.Field17867 = this.Field17083.Method365();
        Class2159.Field17868 = this.Field17084.Method365();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7305(TickEvent.ClientTickEvent clientTickEvent) {
        if (Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field17088.Method365()) return;
        if (clientTickEvent.phase == TickEvent.Phase.START) return;
        if (!Display.isActive()) {
            if (Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate == 1) return;
            Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate = 1;
            return;
        }
        if (Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate != 1) return;
        Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate = this.Field17090;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 88;
            cArray2[n] = (char)(cArray[n] ^ (0x4D01 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

