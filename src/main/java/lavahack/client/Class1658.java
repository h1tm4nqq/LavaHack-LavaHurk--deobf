//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import kotlin.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.text.*;
import net.minecraft.network.*;
import net.minecraft.network.play.server.*;
import kotlin.jvm.internal.*;
import org.apache.logging.log4j.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f?\u0006\u0015" }, d2 = { "Lcom/kisman/cc/pingbypass/server/nethandler/BaseNetHandler;", "Lnet/minecraft/util/ITickable;", "manager", "Lnet/minecraft/network/NetworkManager;", "timeOut", "", "(Lnet/minecraft/network/NetworkManager;J)V", "getManager", "()Lnet/minecraft/network/NetworkManager;", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "disconnect", "", "reason", "Lnet/minecraft/util/text/ITextComponent;", "getConnectionInfo", "", "update", "Companion", "kisman.cc" })
public class Class1658 implements ITickable
{
    @NotNull
    private final Class650 Field15716;
    @NotNull
    private final NetworkManager Field15717;
    private final long Field15718;
    private static final Logger Field15719;
    public static final Class1190 Field15720;
    private int Field15721;
    
    @NotNull
    @NotNull
    protected final Class650 getTimer() {
        return this.Field15716;
    }
    
    public void update() {
        if (this.Field15716.Method2797(this.Field15718)) {
            this.Field15716.Method2801();
            this.disconnect((ITextComponent)new TextComponentString("Time Out"));
        }
    }
    
    private final void disconnect(final ITextComponent textComponent) {
        Class1658.Field15719.error("Disconnecting " + this.getConnectionInfo() + ' ' + textComponent.getFormattedText());
        this.Field15717.sendPacket((Packet)new SPacketDisconnect(textComponent));
        this.Field15717.closeChannel(textComponent);
    }
    
    @NotNull
    @NotNull
    public final String getConnectionInfo() {
        return "";
    }
    
    @NotNull
    @NotNull
    protected final NetworkManager getManager() {
        return this.Field15717;
    }
    
    public Class1658(@NotNull @NotNull final NetworkManager field15717, final long field15718) {
        Intrinsics.checkParameterIsNotNull((Object)field15717, "manager");
        this.Field15717 = field15717;
        this.Field15718 = field15718;
        this.Field15716 = new Class650();
    }
    
    static {
        Field15720 = new Class1190((DefaultConstructorMarker)null);
        Field15719 = LogManager.getLogger();
    }
    
    public static final Logger getLOGGER() {
        Class1658.Field15720;
        return Class1658.Field15719;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7B6E ^ 0x34));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
