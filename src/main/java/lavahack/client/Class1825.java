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
public class Class1825 extends MessageToMessageDecoder
{
    private final UserConnection Field16427;
    private boolean Field16428;
    private boolean Field16429;
    private String Field16430 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1825(final UserConnection field16427) {
        this.Field16427 = field16427;
    }
    
    public UserConnection leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        return this.Field16427;
    }
    
    protected void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf, final List list) throws Exception {
        if (this.Field16429) {
            this.Field16429 = false;
            list.add(byteBuf.retain());
            return;
        }
        if (!this.Field16427.checkIncomingPacket()) {
            throw CancelDecoderException.generate((Throwable)null);
        }
        if (!this.Field16427.shouldTransformPacket()) {
            list.add(byteBuf.retain());
            return;
        }
        final ByteBuf writeBytes = channelHandlerContext.alloc().buffer().writeBytes(byteBuf);
        final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(channelHandlerContext, writeBytes);
        this.Field16427.transformIncoming(writeBytes, (Function)CancelDecoderException::generate);
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
            Class863.Method3650(channelHandlerContext, writeBytes);
            this.Field16429 = true;
        }
        list.add(writeBytes.retain());
        writeBytes.release();
    }
    
    private boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final ChannelHandlerContext channelHandlerContext, final ByteBuf byteBuf) throws InvocationTargetException {
        if (this.Field16428) {
            return false;
        }
        final int index = channelHandlerContext.pipeline().names().indexOf("decompress");
        if (index == -1) {
            return false;
        }
        this.Field16428 = true;
        if (index > channelHandlerContext.pipeline().names().indexOf("via-decoder")) {
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
                value[i] = (char)(charArray[i] ^ (0x4EBF ^ 0x95));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
