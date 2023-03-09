//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.ServerAddress
 *  net.minecraft.client.multiplayer.ServerData
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1409;
import lavahack.client.Class1992;
import lavahack.client.Class2150;
import lavahack.client.Class729;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.ServerAddress;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.resources.I18n;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2={"Lcom/kisman/cc/features/pingbypass/gui/GuiConnectingPingBypass;", "Lnet/minecraft/client/gui/GuiScreen;", "parent", "mcIn", "Lnet/minecraft/client/Minecraft;", "serverDataIn", "Lnet/minecraft/client/multiplayer/ServerData;", "(Lnet/minecraft/client/gui/GuiScreen;Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/multiplayer/ServerData;)V", "cancel", "", "networkManager", "Lnet/minecraft/network/NetworkManager;", "previousGuiScreen", "actionPerformed", "", "button", "Lnet/minecraft/client/gui/GuiButton;", "connect", "proxyIP", "", "proxyPort", "", "actualIP", "actualPort", "drawScreen", "mouseX", "mouseY", "partialTicks", "", "initGui", "updateScreen", "Companion", "kisman.cc"})
public final class Class1086
extends GuiScreen {
    private NetworkManager Field12840;
    private boolean Field12841;
    private final GuiScreen Field12842;
    private static final AtomicInteger Field12843;
    private static final Logger Field12844;
    public static final Class1992 Field12845;
    private int Field12846;

    private final void connect(String string, int n, String string2, int n2) {
        Field12844.info("Connecting to PingBypass: {}, {}", (Object)string, (Object)n);
        new Class729(this, string, n, string2, n2, "Server Connector #" + Field12843.incrementAndGet()).start();
    }

    public void updateScreen() {
        if (this.Field12840 == null) return;
        NetworkManager networkManager = this.Field12840;
        Boolean bl = networkManager != null ? Boolean.valueOf(networkManager.isChannelOpen()) : null;
        if (bl == null) {
            Intrinsics.throwNpe();
        }
        if (bl == false) return;
        NetworkManager networkManager2 = this.Field12840;
        if (networkManager2 == null) return;
        networkManager2.processReceivedPackets();
    }

    public void initGui() {
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, this.height / 4 + 120 + 12, I18n.format((String)"gui.cancel", (Object[])new Object[0])));
    }

    protected void actionPerformed(@NotNull @NotNull GuiButton guiButton) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)guiButton, (String)"button");
        if (guiButton.id != 0) return;
        this.Field12841 = true;
        if (this.Field12840 != null) {
            NetworkManager networkManager = this.Field12840;
            if (networkManager != null) {
                networkManager.closeChannel((ITextComponent)new TextComponentString("Aborted"));
            }
        }
        this.mc.displayGuiScreen(this.Field12842);
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        if (this.Field12840 == null) {
            this.drawCenteredString(this.fontRenderer, "Authentication" + Class2150.Method7739(), this.width / 2 + Class2150.Method7739().length(), this.height / 2 - 50, 0xFFFFFF);
        } else {
            this.drawCenteredString(this.fontRenderer, "Loading PingBypass" + Class2150.Method7739(), this.width / 2 + Class2150.Method7739().length(), this.height / 2 - 50, 0xFFFFFF);
        }
        super.drawScreen(n, n2, f);
    }

    public Class1086(@NotNull @NotNull GuiScreen guiScreen, @NotNull @NotNull Minecraft minecraft, @NotNull @NotNull ServerData serverData) {
        Intrinsics.checkParameterIsNotNull((Object)guiScreen, (String)"parent");
        Intrinsics.checkParameterIsNotNull((Object)minecraft, (String)"mcIn");
        Intrinsics.checkParameterIsNotNull((Object)serverData, (String)"serverDataIn");
        this.mc = minecraft;
        this.Field12842 = guiScreen;
        minecraft.loadWorld(null);
        minecraft.setServerData(serverData);
        ServerAddress serverAddress = ServerAddress.fromString((String)serverData.serverIP);
        String string = Class1409.Field14381.Method5538();
        int n = Class1409.Field14381.Method5542();
        ServerAddress serverAddress2 = serverAddress;
        Intrinsics.checkExpressionValueIsNotNull((Object)serverAddress2, (String)"serveraddress");
        String string2 = serverAddress2.getIP();
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"serveraddress.ip");
        this.connect(string, n, string2, serverAddress.getPort());
    }

    static {
        Field12845 = new Class1992(null);
        Field12843 = new AtomicInteger(0);
        Field12844 = LogManager.getLogger();
    }

    public static final /* bridge */ /* synthetic */ boolean access$getCancel$p(Class1086 class1086) {
        return class1086.Field12841;
    }

    public static final /* bridge */ /* synthetic */ void access$setCancel$p(Class1086 class1086, boolean bl) {
        class1086.Field12841 = bl;
    }

    public static final /* bridge */ /* synthetic */ NetworkManager access$getNetworkManager$p(Class1086 class1086) {
        return class1086.Field12840;
    }

    public static final /* bridge */ /* synthetic */ void access$setNetworkManager$p(Class1086 class1086, NetworkManager networkManager) {
        class1086.Field12840 = networkManager;
    }

    public static final /* bridge */ /* synthetic */ GuiScreen access$getPreviousGuiScreen$p(Class1086 class1086) {
        return class1086.Field12842;
    }

    public static final /* bridge */ /* synthetic */ Logger access$getLOGGER$cp() {
        return Field12844;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 161;
            cArray2[n] = (char)(cArray[n] ^ (0xA3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

