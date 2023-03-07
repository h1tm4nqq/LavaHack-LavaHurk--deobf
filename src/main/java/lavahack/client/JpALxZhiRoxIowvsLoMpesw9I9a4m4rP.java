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
import lavahack.client.ELM7I72rYwY5mTWSyFazBkuX9BwTPath$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.Mw1rH0enxHoGt2yOomU73geB3GiYFx8A;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class JpALxZhiRoxIowvsLoMpesw9I9a4m4rP
implements IMessage,
IMessageHandler {
    private int Field17846;

    public void fromBytes(ByteBuf byteBuf) {
    }

    public void toBytes(ByteBuf byteBuf) {
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(JpALxZhiRoxIowvsLoMpesw9I9a4m4rP jpALxZhiRoxIowvsLoMpesw9I9a4m4rP, MessageContext messageContext) {
        EntityPlayerMP entityPlayerMP = messageContext.getServerHandler().player;
        ELM7I72rYwY5mTWSyFazBkuX9BwTPath eLM7I72rYwY5mTWSyFazBkuX9BwTPath = (ELM7I72rYwY5mTWSyFazBkuX9BwTPath)Mw1rH0enxHoGt2yOomU73geB3GiYFx8A.Field9154.Field9156.get(entityPlayerMP);
        if (eLM7I72rYwY5mTWSyFazBkuX9BwTPath == null) return null;
        eLM7I72rYwY5mTWSyFazBkuX9BwTPath.Method3606(ELM7I72rYwY5mTWSyFazBkuX9BwTPath$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13468);
        return null;
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((JpALxZhiRoxIowvsLoMpesw9I9a4m4rP)iMessage, messageContext);
    }
}

