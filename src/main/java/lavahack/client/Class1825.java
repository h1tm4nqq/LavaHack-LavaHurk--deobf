/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelDecoderException
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package lavahack.client;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelDecoderException;
import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import lavahack.client.Class863;

@ChannelHandler.Sharable
public class Class1825
extends MessageToMessageDecoder {
    private final UserConnection Field16427;
    private boolean Field16428;
    private boolean Field16429;
    private String Field16430 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1825(UserConnection userConnection) {
        this.Field16427 = userConnection;
    }

    public UserConnection leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        return this.Field16427;
    }

    protected void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) throws Exception {
        if (this.Field16429) {
            this.Field16429 = false;
            list.add(byteBuf.retain());
            return;
        }
        if (!this.Field16427.checkIncomingPacket()) {
            throw CancelDecoderException.generate(null);
        }
        if (!this.Field16427.shouldTransformPacket()) {
            list.add(byteBuf.retain());
            return;
        }
        ByteBuf byteBuf2 = channelHandlerContext.alloc().buffer().writeBytes(byteBuf);
        boolean bl = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(channelHandlerContext, byteBuf2);
        this.Field16427.transformIncoming(byteBuf2, CancelDecoderException::generate);
        if (bl) {
            Class863.Method3650(channelHandlerContext, byteBuf2);
            this.Field16429 = true;
        }
        list.add(byteBuf2.retain());
        byteBuf2.release();
    }

    private boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        if (this.Field16428) {
            return false;
        }
        int n = channelHandlerContext.pipeline().names().indexOf("decompress");
        if (n == -1) {
            return false;
        }
        this.Field16428 = true;
        if (n <= channelHandlerContext.pipeline().names().indexOf("via-decoder")) return false;
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
            int n2 = 149;
            cArray2[n] = (char)(cArray[n] ^ (0x4EBF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

