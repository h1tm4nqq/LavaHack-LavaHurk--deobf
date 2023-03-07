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
import lavahack.client.BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
import lavahack.client.JpALxZhiRoxIowvsLoMpesw9I9a4m4rP;
import lavahack.client.Mw1rH0enxHoGt2yOomU73geB3GiYFx8A;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE
implements IMessage,
IMessageHandler {
    public ItemStack Field16043;
    public int Field16044;
    public int Field16045;
    public int Field16046;
    private String Field16047 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE() {
    }

    public g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2) {
        this.Field16043 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2889();
        this.Field16044 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891();
        this.Field16045 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893();
        this.Field16046 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892();
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

    public IMessage leqS0IyKEB621E1SrHdAcHHAUjScjmKi(g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE2, MessageContext messageContext) {
        Mw1rH0enxHoGt2yOomU73geB3GiYFx8A.Field9154.Field9155 = new BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ(g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE2.Field16043, g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE2.Field16044, g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE2.Field16045, g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE2.Field16046);
        return new JpALxZhiRoxIowvsLoMpesw9I9a4m4rP();
    }

    public IMessage onMessage(IMessage iMessage, MessageContext messageContext) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((g566FzyW5WmPBZ7TRhmIn8VXbKICOcHE)iMessage, messageContext);
    }
}

