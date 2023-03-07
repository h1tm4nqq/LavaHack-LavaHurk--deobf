/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.MessageToByteEncoder
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package lavahack.client;

import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;

public class yS5Zj5sVemChi9yfpY2IJlJCdjVNCa9k {
    public static final String Field11639;
    public static final String Field11640;
    private int Field11641;

    public static void Method3649(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws InvocationTargetException {
        ChannelHandler channelHandler = channelHandlerContext.pipeline().get("decompress");
        ByteBuf byteBuf2 = channelHandler instanceof MessageToMessageDecoder ? (ByteBuf)PipelineUtil.callDecode((MessageToMessageDecoder)((MessageToMessageDecoder)channelHandler), (ChannelHandlerContext)channelHandlerContext, (Object)byteBuf).get((int)-545241845L ^ 0xDF80450B) : (ByteBuf)PipelineUtil.callDecode((ByteToMessageDecoder)((ByteToMessageDecoder)channelHandler), (ChannelHandlerContext)channelHandlerContext, (Object)byteBuf).get((int)1310375719L ^ 0x4E1ABF27);
        byteBuf.clear().writeBytes(byteBuf2);
        byteBuf2.release();
    }

    public static void Method3650(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        ByteBuf byteBuf2 = channelHandlerContext.alloc().buffer();
        PipelineUtil.callEncode((MessageToByteEncoder)((MessageToByteEncoder)channelHandlerContext.pipeline().get("compress")), (ChannelHandlerContext)channelHandlerContext, (Object)byteBuf, (ByteBuf)byteBuf2);
        byteBuf.clear().writeBytes(byteBuf2);
        byteBuf2.release();
    }

    static {
        Field11640 = "via-encoder";
        Field11639 = "via-decoder";
    }

    private static String Method3651(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1925761663L ^ 0x72C8CA7F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)809212014L ^ 0x303B9891);
            int n2 = (int)((long)-1022100952 ^ (long)-1022100809);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1405190265L ^ 0xAC3E61BE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

