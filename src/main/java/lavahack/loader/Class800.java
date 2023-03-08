//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import kotlin.jvm.internal.*;
import java.nio.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.loader.*;
import org.apache.logging.log4j.*;
import java.net.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\"" }, d2 = { "Lcom/kisman/cc/loader/websockets/WebClient;", "Lcom/kisman/cc/loader/websockets/api/client/WebSocketClient;", "ip", "", "port", "", "messageProcessor", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "(Ljava/lang/String;ILcom/kisman/cc/loader/websockets/IMessageProcessor;)V", "callerThread", "Ljava/lang/Thread;", "connected", "", "getConnected", "()Z", "setConnected", "(Z)V", "reconnectionTriesCount", "connect", "", "onClose", "code", "reason", "remote", "onError", "ex", "Ljava/lang/Exception;", "onMessage", "bytes", "Ljava/nio/ByteBuffer;", "message", "onOpen", "handshakedata", "Lcom/kisman/cc/loader/websockets/api/handshake/ServerHandshake;", "kisman.cc" })
public final class Class800 extends Class1654
{
    private int Field11395;
    private boolean Field11396;
    private Thread Field11397;
    private final Class122 Field11398;
    private String Field11399 = "TheKisDevs & LavaHack Development owns you";
    
    public final boolean Method3378() {
        return this.Field11396;
    }
    
    public final void Method3379(final boolean field11396) {
        this.Field11396 = field11396;
    }
    
    public final void Method3380(@NotNull @NotNull final Thread field11397) {
        Intrinsics.checkParameterIsNotNull((Object)field11397, "callerThread");
        this.Field11397 = field11397;
        this.Method3352();
        field11397.suspend();
    }
    
    public void Method3364(@NotNull @NotNull final Class1236 class1236) {
        Intrinsics.checkParameterIsNotNull((Object)class1236, "handshakedata");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Successfully connected to remote sever!");
        this.Field11396 = true;
        final Thread field11397 = this.Field11397;
        if (field11397 != null) {
            field11397.resume();
        }
    }
    
    public void Method3365(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "message");
        this.Field11398.Method852(s);
    }
    
    public void Method3368(@NotNull @NotNull final ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, "bytes");
        this.Field11398.Method853(byteBuffer);
    }
    
    public void Method3366(final int i, @Nullable @Nullable final String s, final boolean b) {
        this.Field11396 = false;
        if (i == 1000) {
            LavaHackLoaderCoreMod.Companion.getLOGGER().info("Disconnected from remote server");
        }
        else if (this.Field11395 > 5) {
            LavaHackLoaderCoreMod.Companion.getLOGGER().error("Stopping reconnection to remote server, shutting down!");
            Class1214.Method4893("Stopping reconnection to remote server, shutting down!", true);
        }
        else {
            final Logger logger = LavaHackLoaderCoreMod.Companion.getLOGGER();
            final StringBuilder append = new StringBuilder().append("Lost connection to remote server with code: \"").append(i).append("\" and reason: \"");
            String str;
            if ((str = s) == null) {
                str = "no reason";
            }
            logger.error(append.append(str).append('\"').toString());
            LavaHackLoaderCoreMod.Companion.getLOGGER().error("Trying to reconnect!");
            Class1214.Method4893("Lost connection to remote server!", false);
            this.Method3352();
            this.Field11395++;
        }
    }
    
    public void Method3367(@NotNull @NotNull final Exception ex) {
        Intrinsics.checkParameterIsNotNull((Object)ex, "ex");
        if (Intrinsics.areEqual((Object)ex.getMessage(), (Object)"Connection refused: connect")) {
            LavaHackLoaderCoreMod.Companion.getLOGGER().error("Remove server is offline, shutting down!");
            Class1214.Method4893("Remove server is offline, shutting down!", true);
        }
        else {
            LavaHackLoaderCoreMod.Companion.getLOGGER().error("Received error from web client", (Throwable)ex);
        }
    }
    
    public Class800(@NotNull @NotNull final String str, final int i, @NotNull @NotNull final Class122 field11398) {
        Intrinsics.checkParameterIsNotNull((Object)str, "ip");
        Intrinsics.checkParameterIsNotNull((Object)field11398, "messageProcessor");
        super(new URI("ws://" + str + ':' + i));
        this.Field11398 = field11398;
    }
    
    private static String Method2690(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x629B ^ 0x93));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
