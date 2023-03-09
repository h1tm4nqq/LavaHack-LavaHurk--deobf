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
import lavahack.client.Class1179;
import lavahack.client.Class1389;
import lavahack.client.Class197;
import lavahack.client.Class1979;
import lavahack.client.Class2082;
import org.apache.logging.log4j.LogManager;

public class Class1328
implements ViaPlatform {
    private final Logger Field14085 = new Class1389(LogManager.getLogger((String)"ViaVersion"));
    private final Class197 Field14086;
    private final File Field14087;
    private final ViaAPI Field14088;
    private int Field14089;

    public Class1328(File file) {
        Path path = file.toPath().resolve("ViaVersion");
        this.Field14086 = new Class197(path.resolve("viaversion.yml").toFile());
        this.Field14087 = path.toFile();
        this.Field14088 = new Class2082();
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

    public Class1179 leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Runnable runnable) {
        return new Class1179((java.util.concurrent.Future)((Object)CompletableFuture.runAsync(runnable, Class1979.Method7320().Method7324()).exceptionally(Class1328::leqS0IyKEB621E1SrHdAcHHAUjScjmKi)));
    }

    public Class1179 YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(Runnable runnable) {
        return new Class1179((java.util.concurrent.Future)Class1979.Method7320().Method7325().submit(runnable).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
    }

    public PlatformTask runSync(Runnable runnable, long l) {
        return new Class1179((java.util.concurrent.Future)Class1979.Method7320().Method7325().schedule(() -> this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(runnable), l * 50L, TimeUnit.MILLISECONDS).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
    }

    public PlatformTask runRepeatingSync(Runnable runnable, long l) {
        return new Class1179((java.util.concurrent.Future)Class1979.Method7320().Method7325().scheduleAtFixedRate(() -> this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(runnable), 0L, l * 50L, TimeUnit.MILLISECONDS).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
    }

    private GenericFutureListener leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        return Class1328::leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    public ViaCommandSender[] getOnlinePlayers() {
        return new ViaCommandSender[1337];
    }

    private ViaCommandSender[] YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        return new ViaCommandSender[1337];
    }

    public void sendMessage(UUID uUID, String string) {
    }

    public boolean kickPlayer(UUID uUID, String string) {
        return false;
    }

    public boolean isPluginEnabled() {
        return true;
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
        return true;
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

    private Class1179 vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Runnable runnable) throws Exception {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 231;
            cArray2[n] = (char)(cArray[n] ^ (0x4BFE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

