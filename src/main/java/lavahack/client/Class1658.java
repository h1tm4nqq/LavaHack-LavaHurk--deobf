//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketDisconnect
 *  net.minecraft.util.ITickable
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1190;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketDisconnect;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/pingbypass/server/nethandler/BaseNetHandler;", "Lnet/minecraft/util/ITickable;", "manager", "Lnet/minecraft/network/NetworkManager;", "timeOut", "", "(Lnet/minecraft/network/NetworkManager;J)V", "getManager", "()Lnet/minecraft/network/NetworkManager;", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "disconnect", "", "reason", "Lnet/minecraft/util/text/ITextComponent;", "getConnectionInfo", "", "update", "Companion", "kisman.cc"})
public class Class1658
implements ITickable {
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
        if (!this.Field15716.Method2797(this.Field15718)) return;
        this.Field15716.Method2801();
        this.disconnect((ITextComponent)new TextComponentString("Time Out"));
    }

    private final void disconnect(ITextComponent iTextComponent) {
        Field15719.error("Disconnecting " + this.getConnectionInfo() + ' ' + iTextComponent.getFormattedText());
        this.Field15717.sendPacket((Packet)new SPacketDisconnect(iTextComponent));
        this.Field15717.closeChannel(iTextComponent);
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

    public Class1658(@NotNull @NotNull NetworkManager networkManager, long l) {
        Intrinsics.checkParameterIsNotNull((Object)networkManager, (String)"manager");
        this.Field15717 = networkManager;
        this.Field15718 = l;
        this.Field15716 = new Class650();
    }

    static {
        Field15720 = new Class1190(null);
        Field15719 = LogManager.getLogger();
    }

    public static final /* bridge */ /* synthetic */ Logger access$getLOGGER$cp() {
        return Field15719;
    }

    public static final Logger getLOGGER() {
        Class1190 class1190 = Field15720;
        return Field15719;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 52;
            cArray2[n] = (char)(cArray[n] ^ (0x7B6E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

