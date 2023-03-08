//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.network.*;
import java.util.concurrent.atomic.*;
import net.minecraft.client.resources.*;
import net.minecraft.client.gui.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.text.*;
import java.io.*;
import net.minecraft.client.*;
import net.minecraft.client.multiplayer.*;
import kotlin.jvm.internal.*;
import org.apache.logging.log4j.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e?\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004?\u0006\u0002\n\u0000?\u0006 " }, d2 = { "Lcom/kisman/cc/features/pingbypass/gui/GuiConnectingPingBypass;", "Lnet/minecraft/client/gui/GuiScreen;", "parent", "mcIn", "Lnet/minecraft/client/Minecraft;", "serverDataIn", "Lnet/minecraft/client/multiplayer/ServerData;", "(Lnet/minecraft/client/gui/GuiScreen;Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/multiplayer/ServerData;)V", "cancel", "", "networkManager", "Lnet/minecraft/network/NetworkManager;", "previousGuiScreen", "actionPerformed", "", "button", "Lnet/minecraft/client/gui/GuiButton;", "connect", "proxyIP", "", "proxyPort", "", "actualIP", "actualPort", "drawScreen", "mouseX", "mouseY", "partialTicks", "", "initGui", "updateScreen", "Companion", "kisman.cc" })
public final class Class1086 extends GuiScreen
{
    private NetworkManager Field12840;
    private boolean Field12841;
    private final GuiScreen Field12842;
    private static final AtomicInteger Field12843;
    private static final Logger Field12844;
    public static final Class1992 Field12845;
    private int Field12846;
    
    private final void connect(final String s, final int i, final String s2, final int n) {
        Class1086.Field12844.info("Connecting to PingBypass: {}, {}", (Object)s, (Object)i);
        new Class729(this, s, i, s2, n, "Server Connector #" + Class1086.Field12843.incrementAndGet()).start();
    }
    
    public void updateScreen() {
        if (this.Field12840 != null) {
            final NetworkManager field12840 = this.Field12840;
            final Boolean b = (field12840 != null) ? Boolean.valueOf(field12840.isChannelOpen()) : null;
            if (b == null) {
                Intrinsics.throwNpe();
            }
            if (b) {
                final NetworkManager field12841 = this.Field12840;
                if (field12841 != null) {
                    field12841.processReceivedPackets();
                }
            }
        }
    }
    
    public void initGui() {
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, this.height / 4 + 120 + 12, I18n.format("gui.cancel", new Object[0])));
    }
    
    protected void actionPerformed(@NotNull @NotNull final GuiButton guiButton) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)guiButton, "button");
        if (guiButton.id == 0) {
            this.Field12841 = true;
            if (this.Field12840 != null) {
                final NetworkManager field12840 = this.Field12840;
                if (field12840 != null) {
                    field12840.closeChannel((ITextComponent)new TextComponentString("Aborted"));
                }
            }
            this.mc.displayGuiScreen(this.Field12842);
        }
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        if (this.Field12840 == null) {
            this.drawCenteredString(this.fontRenderer, "Authentication" + Class2150.Method7739(), this.width / 2 + Class2150.Method7739().length(), this.height / 2 - 50, 16777215);
        }
        else {
            this.drawCenteredString(this.fontRenderer, "Loading PingBypass" + Class2150.Method7739(), this.width / 2 + Class2150.Method7739().length(), this.height / 2 - 50, 16777215);
        }
        super.drawScreen(n, n2, n3);
    }
    
    public Class1086(@NotNull @NotNull final GuiScreen field12842, @NotNull @NotNull final Minecraft mc, @NotNull @NotNull final ServerData serverData) {
        Intrinsics.checkParameterIsNotNull((Object)field12842, "parent");
        Intrinsics.checkParameterIsNotNull((Object)mc, "mcIn");
        Intrinsics.checkParameterIsNotNull((Object)serverData, "serverDataIn");
        this.mc = mc;
        this.Field12842 = field12842;
        mc.loadWorld((WorldClient)null);
        mc.setServerData(serverData);
        final ServerAddress fromString = ServerAddress.fromString(serverData.serverIP);
        final String method5538 = Class1409.Field14381.Method5538();
        final int method5539 = Class1409.Field14381.Method5542();
        final ServerAddress serverAddress = fromString;
        Intrinsics.checkExpressionValueIsNotNull((Object)serverAddress, "serveraddress");
        final String getIP = serverAddress.getIP();
        Intrinsics.checkExpressionValueIsNotNull((Object)getIP, "serveraddress.ip");
        this.connect(method5538, method5539, getIP, fromString.getPort());
    }
    
    static {
        Field12845 = new Class1992(null);
        Field12843 = new AtomicInteger(0);
        Field12844 = LogManager.getLogger();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xA3A ^ 0xA1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
