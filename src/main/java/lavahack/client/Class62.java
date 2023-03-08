//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.nio.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import org.apache.logging.log4j.*;
import java.net.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\"" }, d2 = { "Lcom/kisman/cc/websockets/WebClient;", "Lcom/kisman/cc/websockets/api/client/WebSocketClient;", "ip", "", "port", "", "messageProcessor", "Lcom/kisman/cc/websockets/IMessageProcessor;", "(Ljava/lang/String;ILcom/kisman/cc/websockets/IMessageProcessor;)V", "callerThread", "Ljava/lang/Thread;", "connected", "", "getConnected", "()Z", "setConnected", "(Z)V", "reconnectionTriesCount", "connect", "", "onClose", "code", "reason", "remote", "onError", "ex", "Ljava/lang/Exception;", "onMessage", "bytes", "Ljava/nio/ByteBuffer;", "message", "onOpen", "handshakedata", "Lcom/kisman/cc/websockets/api/handshake/ServerHandshake;", "kisman.cc" })
public final class Class62 extends Class168
{
    private int Field8205;
    private boolean Field8206;
    private Thread Field8207;
    private final Class649 Field8208;
    private int Field8209;
    
    public final boolean Method597() {
        return this.Field8206;
    }
    
    public final void Method598(final boolean field8206) {
        this.Field8206 = field8206;
    }
    
    public final void Method599(@NotNull @NotNull final Thread field8207) {
        Intrinsics.checkParameterIsNotNull((Object)field8207, "callerThread");
        this.Field8207 = field8207;
        this.Method571();
        field8207.suspend();
    }
    
    public void Method583(@NotNull @NotNull final Class482 class482) {
        Intrinsics.checkParameterIsNotNull((Object)class482, "handshakedata");
        Class1796.Field16243.info("Successfully connected to remote sever!");
        this.Field8206 = true;
        final Thread field8207 = this.Field8207;
        if (field8207 != null) {
            field8207.resume();
        }
    }
    
    public void Method584(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "message");
        this.Field8208.Method665(s);
    }
    
    public void Method587(@NotNull @NotNull final ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, "bytes");
    }
    
    public void Method585(final int i, @Nullable @Nullable final String s, final boolean b) {
        this.Field8206 = false;
        if (i == 1000) {
            Class1796.Field16243.info("Disconnected from remote server");
        }
        else if (this.Field8205 > 5) {
            Class1796.Field16243.error("Stopping reconnection to remote server, shutting down!");
            Class886.Method3717("Stopping reconnection to remote server, shutting down!", true);
        }
        else {
            final Logger field16243 = Class1796.Field16243;
            final StringBuilder append = new StringBuilder().append("Lost connection to remote server with code: \"").append(i).append("\" and reason: \"");
            String str;
            if ((str = s) == null) {
                str = "no reason";
            }
            field16243.error(append.append(str).append('\"').toString());
            Class1796.Field16243.error("Trying to reconnect!");
            Class886.Method3717("Lost connection to remote server!", false);
            this.Method571();
            this.Field8205++;
        }
    }
    
    public void Method586(@NotNull @NotNull final Exception ex) {
        Intrinsics.checkParameterIsNotNull((Object)ex, "ex");
        if (Intrinsics.areEqual((Object)ex.getMessage(), (Object)"Connection refused: connect")) {
            Class1796.Field16243.error("Remove server is offline, shutting down!");
            Class886.Method3717("Remove server is offline, shutting down!", true);
        }
        else {
            Class1796.Field16243.error("Received error from web client", (Throwable)ex);
        }
    }
    
    public Class62(@NotNull @NotNull final String str, final int i, @NotNull @NotNull final Class649 field8208) {
        Intrinsics.checkParameterIsNotNull((Object)str, "ip");
        Intrinsics.checkParameterIsNotNull((Object)field8208, "messageProcessor");
        super(new URI("ws://" + str + ':' + i));
        this.Field8208 = field8208;
    }
    
    private static String Method536(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6465 ^ 0xEC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
