//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.logging.*;
import java.io.*;
import com.viaversion.viaversion.api.*;
import org.apache.logging.log4j.*;
import java.nio.file.*;
import com.viaversion.viaversion.libs.kyori.adventure.text.serializer.gson.*;
import com.viaversion.viaversion.libs.kyori.adventure.text.serializer.legacy.*;
import com.viaversion.viaversion.libs.kyori.adventure.text.*;
import java.util.function.*;
import com.viaversion.viaversion.api.platform.*;
import io.netty.util.concurrent.*;
import com.viaversion.viaversion.api.command.*;
import com.viaversion.viaversion.api.configuration.*;
import com.viaversion.viaversion.libs.gson.*;
import java.util.*;
import com.viaversion.viaversion.api.connection.*;
import java.util.concurrent.*;

public class Class1328 implements ViaPlatform
{
    private final Logger Field14085;
    private final Class197 Field14086;
    private final File Field14087;
    private final ViaAPI Field14088;
    private int Field14089;
    
    public Class1328(final File file) {
        this.Field14085 = new Class1389(LogManager.getLogger("ViaVersion"));
        final Path resolve = file.toPath().resolve("ViaVersion");
        this.Field14086 = new Class197(resolve.resolve("viaversion.yml").toFile());
        this.Field14087 = resolve.toFile();
        this.Field14088 = (ViaAPI)new Class2082();
    }
    
    public static String leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final String s) {
        return (String)GsonComponentSerializer.gson().serialize((Component)LegacyComponentSerializer.legacySection().deserialize(s));
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
    
    public Class1179 leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Runnable runnable) {
        return new Class1179((Future)CompletableFuture.runAsync(runnable, Class1979.Method7320().Method7324()).exceptionally((Function<Throwable, ? extends Void>)Class1328::leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
    }
    
    public Class1179 YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(final Runnable runnable) {
        return new Class1179((Future)Class1979.Method7320().Method7325().submit(runnable).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
    }
    
    public PlatformTask runSync(final Runnable runnable, final long n) {
        return (PlatformTask)new Class1179((Future)Class1979.Method7320().Method7325().schedule((Callable)this::vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, n * 50L, TimeUnit.MILLISECONDS).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
    }
    
    public PlatformTask runRepeatingSync(final Runnable runnable, final long n) {
        return (PlatformTask)new Class1179((Future)Class1979.Method7320().Method7325().scheduleAtFixedRate(this::UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, 0L, n * 50L, TimeUnit.MILLISECONDS).addListener(this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi()));
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
    
    public void sendMessage(final UUID uuid, final String s) {
    }
    
    public boolean kickPlayer(final UUID uuid, final String s) {
        return false;
    }
    
    public boolean isPluginEnabled() {
        return true;
    }
    
    public ViaAPI getApi() {
        return this.Field14088;
    }
    
    public ViaVersionConfig getConf() {
        return (ViaVersionConfig)this.Field14086;
    }
    
    public ConfigurationProvider getConfigurationProvider() {
        return (ConfigurationProvider)this.Field14086;
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
    
    public boolean disconnect(final UserConnection userConnection, final String s) {
        return super.disconnect(userConnection, s);
    }
    
    public boolean isProxy() {
        return super.isProxy();
    }
    
    public PlatformTask runSync(final Runnable runnable) {
        return (PlatformTask)this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(runnable);
    }
    
    public PlatformTask runAsync(final Runnable runnable) {
        return (PlatformTask)this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(runnable);
    }
    
    private static void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final io.netty.util.concurrent.Future future) throws Exception {
        if (!future.isCancelled() && future.cause() != null) {
            future.cause().printStackTrace();
        }
    }
    
    private void UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(final Runnable runnable) {
        this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(runnable);
    }
    
    private Class1179 vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(final Runnable runnable) throws Exception {
        return this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(runnable);
    }
    
    private static Void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final Throwable t) {
        if (!(t instanceof CancellationException)) {
            t.printStackTrace();
        }
        return null;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4BFE ^ 0xE7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
