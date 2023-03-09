/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelEncoderException
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
package lavahack.client;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelEncoderException;
import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import lavahack.client.Class863;

@ChannelHandler.Sharable
public class Class837
extends MessageToMessageEncoder {
    private final UserConnection Field11557;
    private boolean Field11558;
    private int Field11559;

    public Class837(UserConnection userConnection) {
        this.Field11557 = userConnection;
    }

    protected void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) throws Exception {
        if (!this.Field11557.checkOutgoingPacket()) {
            throw CancelEncoderException.generate(null);
        }
        if (!this.Field11557.shouldTransformPacket()) {
            list.add(byteBuf.retain());
            return;
        }
        ByteBuf byteBuf2 = channelHandlerContext.alloc().buffer().writeBytes(byteBuf);
        boolean bl = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(channelHandlerContext, byteBuf2);
        this.Field11557.transformOutgoing(byteBuf2, CancelEncoderException::generate);
        if (bl) {
            Class863.Method3650(channelHandlerContext, byteBuf2);
        }
        list.add(byteBuf2.retain());
        byteBuf2.release();
    }

    private boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        if (this.Field11558) {
            return false;
        }
        int n = channelHandlerContext.pipeline().names().indexOf("compress");
        if (n == -1) {
            return false;
        }
        this.Field11558 = true;
        if (n <= channelHandlerContext.pipeline().names().indexOf("via-encoder")) return false;
        Class863.Method3649(channelHandlerContext, byteBuf);
        ChannelHandler channelHandler = channelHandlerContext.pipeline().get("via-encoder");
        ChannelHandler channelHandler2 = channelHandlerContext.pipeline().get("via-decoder");
        channelHandlerContext.pipeline().remove(channelHandler);
        channelHandlerContext.pipeline().remove(channelHandler2);
        channelHandlerContext.pipeline().addAfter("compress", "via-encoder", channelHandler);
        channelHandlerContext.pipeline().addAfter("decompress", "via-decoder", channelHandler2);
        return true;
    }

    public void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        if (PipelineUtil.containsCause((Throwable)throwable, CancelCodecException.class)) {
            return;
        }
        super.exceptionCaught(channelHandlerContext, throwable);
    }

    protected void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(channelHandlerContext, (ByteBuf)object, list);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 214;
            cArray2[n] = (char)(cArray[n] ^ (0x464C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

