//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package lavahack.client;

import io.netty.buffer.ByteBuf;
import lavahack.client.ELM7I72rYwY5mTWSyFazBkuX9BwTPath;
import lavahack.client.Mw1rH0enxHoGt2yOomU73geB3GiYFx8A;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class o6WjagicEjcekwDevQdMA2QlvL5uoWpx
implements IMessage,
IMessageHandler {
    private int Field9011;
    private int Field9012;
    private int Field9013;
    private String Field9014 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public o6WjagicEjcekwDevQdMA2QlvL5uoWpx() {
    }

    public o6WjagicEjcekwDevQdMA2QlvL5uoWpx(int n, int n2, int n3) {
        this.Field9011 = n;
        this.Field9012 = n2;
        this.Field9013 = n3;
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.Field9011 = byteBuf.readShort();
        this.Field9012 = byteBuf.readShort();
        this.Field9013 = byteBuf.readShort();
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeShort(this.Field9011);
        byteBuf.writeShort(this.Field9012);
        byteBuf.writeShort(this.Field9013);
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(o6WjagicEjcekwDevQdMA2QlvL5uoWpx o6WjagicEjcekwDevQdMA2QlvL5uoWpx2, MessageContext messageContext) {
        EntityPlayerMP entityPlayerMP = messageContext.getServerHandler().player;
        ELM7I72rYwY5mTWSyFazBkuX9BwTPath eLM7I72rYwY5mTWSyFazBkuX9BwTPath = (ELM7I72rYwY5mTWSyFazBkuX9BwTPath)Mw1rH0enxHoGt2yOomU73geB3GiYFx8A.Field9154.Field9156.get(entityPlayerMP);
        if (eLM7I72rYwY5mTWSyFazBkuX9BwTPath == null) return null;
        eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Method3605(o6WjagicEjcekwDevQdMA2QlvL5uoWpx2.Field9011, o6WjagicEjcekwDevQdMA2QlvL5uoWpx2.Field9012, o6WjagicEjcekwDevQdMA2QlvL5uoWpx2.Field9013);
        return null;
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((o6WjagicEjcekwDevQdMA2QlvL5uoWpx)iMessage, messageContext);
    }
}

