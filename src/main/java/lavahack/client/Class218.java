//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e?\u0006\u001e" }, d2 = { "Lcom/kisman/cc/pingbypass/server/PingBypassServer;", "", "()V", "actualPos", "Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketActualPos;", "getActualPos", "()Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketActualPos;", "setActualPos", "(Lcom/kisman/cc/pingbypass/server/protocol/packet/packets/c2s/C2SPacketActualPos;)V", "connected", "", "getConnected", "()Z", "setConnected", "(Z)V", "manager", "Lnet/minecraft/network/NetworkManager;", "getManager", "()Lnet/minecraft/network/NetworkManager;", "setManager", "(Lnet/minecraft/network/NetworkManager;)V", "packetflying", "getPacketflying", "setPacketflying", "server", "getServer", "setServer", "stay", "getStay", "setStay", "kisman.cc" })
public final class Class218
{
    private static boolean Field8948;
    private static boolean Field8949;
    @Nullable
    private static NetworkManager Field8950;
    @Nullable
    private static Class86 Field8951;
    private static boolean Field8952;
    private static boolean Field8953;
    public static final Class218 Field8954;
    private int Field8955;
    
    public final boolean Method1252() {
        return Class218.Field8948;
    }
    
    public final void Method1253(final boolean field8948) {
        Class218.Field8948 = field8948;
    }
    
    public final boolean Method1254() {
        return Class218.Field8949;
    }
    
    public final void Method1255(final boolean field8949) {
        Class218.Field8949 = field8949;
    }
    
    @Nullable
    @Nullable
    public final NetworkManager Method1256() {
        return Class218.Field8950;
    }
    
    public final void Method1257(@Nullable @Nullable final NetworkManager field8950) {
        Class218.Field8950 = field8950;
    }
    
    @Nullable
    @Nullable
    public final Class86 Method1258() {
        return Class218.Field8951;
    }
    
    public final void Method1259(@Nullable @Nullable final Class86 field8951) {
        Class218.Field8951 = field8951;
    }
    
    public final boolean Method1260() {
        return Class218.Field8952;
    }
    
    public final void Method1261(final boolean field8952) {
        Class218.Field8952 = field8952;
    }
    
    public final boolean Method1262() {
        return Class218.Field8953;
    }
    
    public final void Method1263(final boolean field8953) {
        Class218.Field8953 = field8953;
    }
    
    public final boolean Method1264() {
        return Class218.Field8953 && Class218.Field8949;
    }
    
    private Class218() {
    }
    
    static {
        Field8954 = new Class218();
    }
}
