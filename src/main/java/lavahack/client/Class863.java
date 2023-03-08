//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import io.netty.buffer.*;
import com.viaversion.viaversion.util.*;
import io.netty.channel.*;
import java.lang.reflect.*;
import io.netty.handler.codec.*;

public class Class863
{
    public static final String Field11639;
    public static final String Field11640;
    private int Field11641;
    
    public static void Method3649(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) throws InvocationTargetException {
        final ChannelHandler value = channelHandlerContext.pipeline().get("decompress");
        final ByteBuf byteBuf2 = (value instanceof MessageToMessageDecoder) ? PipelineUtil.callDecode((MessageToMessageDecoder)value, channelHandlerContext, (Object)byteBuf).get(0) : PipelineUtil.callDecode((ByteToMessageDecoder)value, channelHandlerContext, (Object)byteBuf).get(0);
        byteBuf.clear().writeBytes(byteBuf2);
        byteBuf2.release();
    }
    
    public static void Method3650(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) throws Exception {
        final ByteBuf buffer = channelHandlerContext.alloc().buffer();
        PipelineUtil.callEncode((MessageToByteEncoder)channelHandlerContext.pipeline().get("compress"), channelHandlerContext, (Object)byteBuf, buffer);
        byteBuf.clear().writeBytes(buffer);
        buffer.release();
    }
    
    static {
        Field11640 = "via-encoder";
        Field11639 = "via-decoder";
    }
    
    private static String Method3651(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1E39 ^ 0x9F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
