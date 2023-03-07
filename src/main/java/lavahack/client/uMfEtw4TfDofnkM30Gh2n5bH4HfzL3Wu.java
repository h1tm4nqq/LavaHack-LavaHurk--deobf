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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.Display;

public class uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17082 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Remove Entity AI Watch Closest", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1212463697L ^ 0xB7BB45AF) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17083 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Remove Entity AI LookIdle", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2049528351 ^ (long)2049528351)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17084 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Replace Look Helper", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-801856450 ^ (long)-801856449)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17085 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TileEntity Render Range(Squared)", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8AE1E6E1D6368433L ^ 0xCA51E6E1D6368433L), 0.0, Double.longBitsToDouble((long)1592253923 ^ 0x40B000005EE7DDE3L), (boolean)((long)-569934926 ^ (long)-569934925)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17086 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Entity Render Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)571009529 ^ (long)571009529)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17087 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entity Render Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x279CB0E14537B54CL ^ 0x67D5B0E14537B54CL), 0.0, Double.longBitsToDouble((long)2005098274 ^ 0x4049000077835F22L), ((int)1399976036L ^ 0x5371F065) != 0).Method313(this.Field17086::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17088 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lost Focus", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)399222395 ^ (long)399222395)));
    public static uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu Field17089;
    private int Field17090;
    private int Field17091;

    public uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu() {
        super("Optimizer", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        Field17089 = this;
    }

    @Override
    public void Method38() {
        lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17865 = (int)-212858374L ^ 0xF35009FB;
        this.Field17090 = uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate;
    }

    @Override
    public void Method39() {
        lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17867 = lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17868 = (int)((long)1854472329 ^ (long)1854472329);
        lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17866 = lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17868;
        lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17865 = lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17868;
    }

    @Override
    public void Method45() {
        lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17866 = this.Field17082.Method365();
        lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17867 = this.Field17083.Method365();
        lxa1HaXIGXYI9kJNqMVNvUw1GVYkMlLw.Field17868 = this.Field17084.Method365();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7305(TickEvent.ClientTickEvent clientTickEvent) {
        if (uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field17088.Method365()) return;
        if (clientTickEvent.phase == TickEvent.Phase.START) return;
        if (!Display.isActive()) {
            if (uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate == (int)((long)699879047 ^ (long)699879046)) return;
            uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate = (int)-1952482448L ^ 0x8B9F7B71;
            return;
        }
        if (uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate != ((int)833500934L ^ 0x31AE3707)) return;
        uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate = this.Field17090;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)972670489 ^ (long)972670489);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)970049135L ^ 0x39D1C690);
            int n2 = ((int)1184951312L ^ 0x46A0EC1B) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-895236628L ^ 0xCAA388ED ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

