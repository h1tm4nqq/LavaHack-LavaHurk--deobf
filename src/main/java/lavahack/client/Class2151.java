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
import lavahack.client.Class1205;
import lavahack.client.Class257;
import lavahack.client.Class857;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class Class2151
implements IMessage,
IMessageHandler {
    private int Field17846;

    public void fromBytes(ByteBuf byteBuf) {
    }

    public void toBytes(ByteBuf byteBuf) {
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class2151 class2151, MessageContext messageContext) {
        EntityPlayerMP entityPlayerMP = messageContext.getServerHandler().player;
        Class857 class857 = (Class857)Class257.Field9154.Field9156.get(entityPlayerMP);
        if (class857 == null) return null;
        class857.Method3606(Class1205.Field13468);
        return null;
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class2151)iMessage, messageContext);
    }
}

