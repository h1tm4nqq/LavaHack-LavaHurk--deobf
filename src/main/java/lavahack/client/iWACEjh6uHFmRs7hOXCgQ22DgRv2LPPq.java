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
import lavahack.client.yS5Zj5sVemChi9yfpY2IJlJCdjVNCa9k;

@ChannelHandler.Sharable
public class iWACEjh6uHFmRs7hOXCgQ22DgRv2LPPq
extends MessageToMessageDecoder {
    private final UserConnection Field16427;
    private boolean Field16428;
    private boolean Field16429;
    private String Field16430 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public iWACEjh6uHFmRs7hOXCgQ22DgRv2LPPq(UserConnection userConnection) {
        this.Field16427 = userConnection;
    }

    public UserConnection leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        return this.Field16427;
    }

    protected void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) throws Exception {
        if (this.Field16429) {
            this.Field16429 = (int)((long)1932841583 ^ (long)1932841583);
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
            yS5Zj5sVemChi9yfpY2IJlJCdjVNCa9k.Method3650(channelHandlerContext, byteBuf2);
            this.Field16429 = (int)((long)679898203 ^ (long)679898202);
        }
        list.add(byteBuf2.retain());
        byteBuf2.release();
    }

    private boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        if (this.Field16428) {
            return (int)((long)-1450539605 ^ (long)-1450539605) != 0;
        }
        int n = channelHandlerContext.pipeline().names().indexOf("decompress");
        if (n == (int)((long)-1941604720 ^ (long)1941604719)) {
            return (int)((long)1212531516 ^ (long)1212531516) != 0;
        }
        this.Field16428 = (int)((long)894236616 ^ (long)894236617);
        if (n <= channelHandlerContext.pipeline().names().indexOf("via-decoder")) return (int)((long)-1170511804 ^ (long)-1170511804) != 0;
        yS5Zj5sVemChi9yfpY2IJlJCdjVNCa9k.Method3649(channelHandlerContext, byteBuf);
        ChannelHandler channelHandler = channelHandlerContext.pipeline().get("via-encoder");
        ChannelHandler channelHandler2 = channelHandlerContext.pipeline().get("via-decoder");
        channelHandlerContext.pipeline().remove(channelHandler);
        channelHandlerContext.pipeline().remove(channelHandler2);
        channelHandlerContext.pipeline().addAfter("compress", "via-encoder", channelHandler);
        channelHandlerContext.pipeline().addAfter("decompress", "via-decoder", channelHandler2);
        return (int)((long)-1819528770 ^ (long)-1819528769) != 0;
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
        int n = (int)-2067797075L ^ 0x84BFEBAD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1471292471L ^ 0xA84DDB36);
            int n2 = (int)643453552L ^ 0x265A52E5;
            cArray2[n] = (char)(cArray[n] ^ ((int)187598107L ^ 0xB2ECBA4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

