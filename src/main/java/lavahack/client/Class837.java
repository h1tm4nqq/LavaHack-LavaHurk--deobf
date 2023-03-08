//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import io.netty.handler.codec.*;
import com.viaversion.viaversion.api.connection.*;
import io.netty.buffer.*;
import java.util.*;
import java.util.function.*;
import io.netty.channel.*;
import java.lang.reflect.*;
import com.viaversion.viaversion.exception.*;
import com.viaversion.viaversion.util.*;

@ChannelHandler$Sharable
public class Class837 extends MessageToMessageEncoder
{
    private final UserConnection Field11557;
    private boolean Field11558;
    private int Field11559;
    
    public Class837(final UserConnection field11557) {
        this.Field11557 = field11557;
    }
    
    protected void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List list) throws Exception {
        if (!this.Field11557.checkOutgoingPacket()) {
            throw CancelEncoderException.generate((Throwable)null);
        }
        if (!this.Field11557.shouldTransformPacket()) {
            list.add(byteBuf.retain());
            return;
        }
        final ByteBuf writeBytes = channelHandlerContext.alloc().buffer().writeBytes(byteBuf);
        final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(channelHandlerContext, writeBytes);
        this.Field11557.transformOutgoing(writeBytes, (Function)CancelEncoderException::generate);
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
            Class863.Method3650(channelHandlerContext, writeBytes);
        }
        list.add(writeBytes.retain());
        writeBytes.release();
    }
    
    private boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) throws InvocationTargetException {
        if (this.Field11558) {
            return false;
        }
        final int index = channelHandlerContext.pipeline().names().indexOf("compress");
        if (index == -1) {
            return false;
        }
        this.Field11558 = true;
        if (index > channelHandlerContext.pipeline().names().indexOf("via-encoder")) {
            Class863.Method3649(channelHandlerContext, byteBuf);
            final ChannelHandler value = channelHandlerContext.pipeline().get("via-encoder");
            final ChannelHandler value2 = channelHandlerContext.pipeline().get("via-decoder");
            channelHandlerContext.pipeline().remove(value);
            channelHandlerContext.pipeline().remove(value2);
            channelHandlerContext.pipeline().addAfter("compress", "via-encoder", value);
            channelHandlerContext.pipeline().addAfter("decompress", "via-decoder", value2);
            return true;
        }
        return false;
    }
    
    public void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final ChannelHandlerContext channelHandlerContext, final Throwable t) throws Exception {
        if (PipelineUtil.containsCause(t, (Class)CancelCodecException.class)) {
            return;
        }
        super.exceptionCaught(channelHandlerContext, t);
    }
    
    protected void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final ChannelHandlerContext channelHandlerContext, final Object o, final List list) throws Exception {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(channelHandlerContext, (ByteBuf)o, list);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x464C ^ 0xD6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
