/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.fml.common.network.ByteBufUtils
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessage
 *  net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler
 *  net.minecraftforge.fml.common.network.simpleimpl.MessageContext
 */
package lavahack.client;

import io.netty.buffer.ByteBuf;
import lavahack.client.Class1885;
import lavahack.client.Class2151;
import lavahack.client.Class257;
import lavahack.client.Class686;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class Class1755
implements IMessage,
IMessageHandler {
    public ItemStack Field16043;
    public int Field16044;
    public int Field16045;
    public int Field16046;
    private String Field16047 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1755() {
    }

    public Class1755(Class686 class686) {
        this.Field16043 = class686.Method2889();
        this.Field16044 = class686.Method2891();
        this.Field16045 = class686.Method2893();
        this.Field16046 = class686.Method2892();
    }

    public void fromBytes(ByteBuf byteBuf) {
        this.Field16043 = ByteBufUtils.readItemStack((ByteBuf)byteBuf);
        this.Field16044 = byteBuf.readShort();
        this.Field16045 = byteBuf.readShort();
        this.Field16046 = byteBuf.readShort();
    }

    public void toBytes(ByteBuf byteBuf) {
        ByteBufUtils.writeItemStack((ByteBuf)byteBuf, (ItemStack)this.Field16043);
        byteBuf.writeShort(this.Field16044);
        byteBuf.writeShort(this.Field16045);
        byteBuf.writeShort(this.Field16046);
    }

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Class1755 class1755, MessageContext messageContext) {
        Class257.Field9154.Field9155 = new Class1885(class1755.Field16043, class1755.Field16044, class1755.Field16045, class1755.Field16046);
        return new Class2151();
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class1755)iMessage, messageContext);
    }
}

