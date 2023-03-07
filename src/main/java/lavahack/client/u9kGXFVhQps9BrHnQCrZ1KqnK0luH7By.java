//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.network.play.client.CPacketCustomPayload
 */
package lavahack.client;

import io.netty.buffer.Unpooled;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CPacketCustomPayload;

public class u9kGXFVhQps9BrHnQCrZ1KqnK0luH7By
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static u9kGXFVhQps9BrHnQCrZ1KqnK0luH7By Field13139;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13140 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(u9kGXFVhQps9BrHnQCrZ1KqnK0luH7By::Method4628, new Predicate[(int)((long)2060565 ^ (long)2060565)]);
    private int Field13141;

    public u9kGXFVhQps9BrHnQCrZ1KqnK0luH7By() {
        super("ForgeBypass", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        Field13139 = this;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13140);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13140);
    }

    private static void Method4628(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isIntegratedServerRunning()) return;
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982().getClass().getName().equals("net.minecraftforge.fml.common.network.internal.FMLProxyPacket")) {
            tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketCustomPayload)) return;
        if (!((CPacketCustomPayload)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982()).getChannelName().equalsIgnoreCase("MC|Brand")) return;
        ((CPacketCustomPayload)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982()).data = new PacketBuffer(Unpooled.buffer()).writeString("vanilla");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-944854793 ^ (long)-944854793);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1410761630L ^ 0xABE97C9D);
            int n2 = (int)-970428453L ^ 0xC6286FDB;
            cArray2[n] = (char)(cArray[n] ^ (((int)-2020774011L ^ 0x878D4F1E) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

