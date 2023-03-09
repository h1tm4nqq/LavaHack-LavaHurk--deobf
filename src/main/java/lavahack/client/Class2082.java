/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaAPIBase
 *  io.netty.buffer.ByteBuf
 */
package lavahack.client;

import com.viaversion.viaversion.ViaAPIBase;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class Class2082
extends ViaAPIBase {
    private String Field17512 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void sendRawPacket(Object object, ByteBuf byteBuf) {
        super.sendRawPacket((UUID)object, byteBuf);
    }

    public int getPlayerVersion(Object object) {
        return super.getPlayerVersion((UUID)object);
    }
}

