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
import lavahack.client.yS5Zj5sVemChi9yfpY2IJlJCdjVNCa9k;

@ChannelHandler.Sharable
public class zKUy8ckeoemeCxufJ57OvHP2HAqZz1NM
extends MessageToMessageEncoder {
    private final UserConnection Field11557;
    private boolean Field11558;
    private int Field11559;

    public zKUy8ckeoemeCxufJ57OvHP2HAqZz1NM(UserConnection userConnection) {
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
            yS5Zj5sVemChi9yfpY2IJlJCdjVNCa9k.Method3650(channelHandlerContext, byteBuf2);
        }
        list.add(byteBuf2.retain());
        byteBuf2.release();
    }

    private boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        if (this.Field11558) {
            return (int)((long)1791950273 ^ (long)1791950273) != 0;
        }
        int n = channelHandlerContext.pipeline().names().indexOf("compress");
        if (n == (int)((long)-732934899 ^ (long)732934898)) {
            return ((int)1401735884L ^ 0x538CCACC) != 0;
        }
        this.Field11558 = (int)((long)294055347 ^ (long)294055346);
        if (n <= channelHandlerContext.pipeline().names().indexOf("via-encoder")) return (int)((long)-85278795 ^ (long)-85278795) != 0;
        yS5Zj5sVemChi9yfpY2IJlJCdjVNCa9k.Method3649(channelHandlerContext, byteBuf);
        ChannelHandler channelHandler = channelHandlerContext.pipeline().get("via-encoder");
        ChannelHandler channelHandler2 = channelHandlerContext.pipeline().get("via-decoder");
        channelHandlerContext.pipeline().remove(channelHandler);
        channelHandlerContext.pipeline().remove(channelHandler2);
        channelHandlerContext.pipeline().addAfter("compress", "via-encoder", channelHandler);
        channelHandlerContext.pipeline().addAfter("decompress", "via-decoder", channelHandler2);
        return ((int)903218238L ^ 0x35D6043F) != 0;
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
        int n = (int)((long)-249903516 ^ (long)-249903516);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-28146681L ^ 0xFE5284F8);
            int n2 = ((int)1296704255L ^ 0x4D4A2294) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)305619994 ^ (long)305624457) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

