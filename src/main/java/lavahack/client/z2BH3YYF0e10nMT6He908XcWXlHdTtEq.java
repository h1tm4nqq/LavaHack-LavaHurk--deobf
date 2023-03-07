/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.ViaAPI
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.configuration.ConfigurationProvider
 *  com.viaversion.viaversion.api.configuration.ViaVersionConfig
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.PlatformTask
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.libs.kyori.adventure.text.Component
 *  com.viaversion.viaversion.libs.kyori.adventure.text.serializer.gson.GsonComponentSerializer
 *  com.viaversion.viaversion.libs.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 */
package lavahack.client;

import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.configuration.ConfigurationProvider;
import com.viaversion.viaversion.api.configuration.ViaVersionConfig;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.PlatformTask;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.libs.kyori.adventure.text.Component;
import com.viaversion.viaversion.libs.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import com.viaversion.viaversion.libs.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.File;
import java.nio.file.Path;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import lavahack.client.DJg76zKvMAlx2uy4H02YwDA3CA5aAHX0;
import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;
import lavahack.client.Lrn8z8s8pRwc3ZQW91h3qeTbQrfdnuzp;
import lavahack.client.fwgw2oRo7ZFADuER9tgw4xA2sWoZLQHo;
import lavahack.client.xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS;
import org.apache.logging.log4j.LogManager;

public class z2BH3YYF0e10nMT6He908XcWXlHdTtEq
implements ViaPlatform {
    private final Logger Field14085 = new Lrn8z8s8pRwc3ZQW91h3qeTbQrfdnuzp(LogManager.getLogger((String)"ViaVersion"));
    private final fwgw2oRo7ZFADuER9tgw4xA2sWoZLQHo Field14086;
    private final File Field14087;
    private final ViaAPI Field14088;
    private int Field14089;

    public z2BH3YYF0e10nMT6He908XcWXlHdTtEq(File file) {
        Path path = file.toPath().resolve("ViaVersion");
        this.Field14086 = new fwgw2oRo7ZFADuER9tgw4xA2sWoZLQHo(path.resolve("viaversion.yml").toFile());
        this.Field14087 = path.toFile();
        this.Field14088 = new DJg76zKvMAlx2uy4H02YwDA3CA5aAHX0();
    }

    public static String leqS0IyKEB621E1SrHdAcHHAUjScjmKi(String string) {
        return (String)GsonComponentSerializer.gson().serialize((Component)LegacyComponentSerializer.legacySection().deserialize(string));
    }

    public Logger getLogger() {
        return this.Field14085;
    }

    public String getPlatformName() {
        return "ViaForge";
    }

    public String getPlatformVersion() {
        return "340";
    }

    public String getPluginVersion() {
        return "4.0.0";
    }

    public xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Runnable runnable) {
        return new xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS((java.util.concurrent.Future)((Object)CompletableFuture.runAsync(runnable, FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7324()).exceptionally(z2BH3YYF0e10nMT6He908XcWXlHdTtEq::leqS0IyKEB621E1SrHdAcHHAUjScjmKi)));
    }

    public xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(Runnable runnable) {
        return new xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS((java.util.concurrent.Future)FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7325().submit(runnable).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
    }

    public PlatformTask runSync(Runnable runnable, long l) {
        return new xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS((java.util.concurrent.Future)FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7325().schedule(() -> this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(runnable), l * (0x40010832L & 0x22108532L), TimeUnit.MILLISECONDS).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
    }

    public PlatformTask runRepeatingSync(Runnable runnable, long l) {
        return new xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS((java.util.concurrent.Future)FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7325().scheduleAtFixedRate(() -> this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(runnable), 0L, l * (0xA0BB32L & 0x18080073L), TimeUnit.MILLISECONDS).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
    }

    private GenericFutureListener leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        return z2BH3YYF0e10nMT6He908XcWXlHdTtEq::leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    public ViaCommandSender[] getOnlinePlayers() {
        return new ViaCommandSender[(int)((long)638235018 ^ (long)638235827)];
    }

    private ViaCommandSender[] YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        return new ViaCommandSender[(int)((long)-1587778943 ^ (long)-1587777608)];
    }

    public void sendMessage(UUID uUID, String string) {
    }

    public boolean kickPlayer(UUID uUID, String string) {
        return ((int)2087762728L ^ 0x7C70BB28) != 0;
    }

    public boolean isPluginEnabled() {
        return (int)((long)-1690326864 ^ (long)-1690326863) != 0;
    }

    public ViaAPI getApi() {
        return this.Field14088;
    }

    public ViaVersionConfig getConf() {
        return this.Field14086;
    }

    public ConfigurationProvider getConfigurationProvider() {
        return this.Field14086;
    }

    public File getDataFolder() {
        return this.Field14087;
    }

    public void onReload() {
    }

    public JsonObject getDump() {
        return new JsonObject();
    }

    public boolean isOldClientsAllowed() {
        return (int)((long)632614953 ^ (long)632614952) != 0;
    }

    public Collection getUnsupportedSoftwareClasses() {
        return super.getUnsupportedSoftwareClasses();
    }

    public boolean disconnect(UserConnection userConnection, String string) {
        return super.disconnect(userConnection, string);
    }

    public boolean isProxy() {
        return super.isProxy();
    }

    public PlatformTask runSync(Runnable runnable) {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(runnable);
    }

    public PlatformTask runAsync(Runnable runnable) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(runnable);
    }

    private static void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Future future) throws Exception {
        if (future.isCancelled()) return;
        if (future.cause() == null) return;
        future.cause().printStackTrace();
    }

    private void UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(Runnable runnable) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(runnable);
    }

    private xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Runnable runnable) throws Exception {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(runnable);
    }

    private static Void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Throwable throwable) {
        if (throwable instanceof CancellationException) return null;
        throwable.printStackTrace();
        return null;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1502394688L ^ 0x598CB940;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)413530299L ^ 0x18A5F844);
            int n2 = (int)((long)475095448 ^ (long)475095423);
            cArray2[n] = (char)(cArray[n] ^ (((int)-2090612429L ^ 0x8363ECCC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

