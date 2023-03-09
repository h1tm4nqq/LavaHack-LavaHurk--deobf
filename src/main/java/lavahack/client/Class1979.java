/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.ViaManagerImpl
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.ViaManager
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.platform.ViaPlatform
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  io.netty.channel.DefaultEventLoopGroup
 *  io.netty.channel.EventLoop
 */
package lavahack.client;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaManager;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.platform.ViaPlatform;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoop;
import java.io.File;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;
import lavahack.client.Class1328;
import lavahack.client.Class1389;
import lavahack.client.Class1788;
import lavahack.client.Class1796;
import lavahack.client.Class245;
import lavahack.client.Class520;

public class Class1979 {
    public static final int Field17108 = 340;
    private static final Class1979 Field17109 = new Class1979();
    private final Logger Field17110 = new Class1389(Class1796.Field16243);
    private final CompletableFuture Field17111 = new CompletableFuture();
    private ExecutorService Field17112;
    private EventLoop Field17113;
    private File Field17114;
    private int Field17115;
    private String Field17116;
    private String Field17117 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class1979 Method7320() {
        return Field17109;
    }

    public void Method7321() {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("ViaForge-%d").build();
        this.Field17112 = Executors.newFixedThreadPool(8, threadFactory);
        this.Field17113 = new DefaultEventLoopGroup(1, threadFactory).next();
        this.Field17113.submit(this.Field17111::join);
        this.Method7331(340);
        this.Field17114 = new File("ViaForge");
        if (this.Field17114.mkdir()) {
            this.Method7322().info("Creating ViaForge Folder");
        }
        Via.init((ViaManager)ViaManagerImpl.builder().injector((ViaInjector)new Class520()).loader((ViaPlatformLoader)new Class1788()).platform((ViaPlatform)new Class1328(this.Field17114)).build());
        MappingDataLoader.enableMappingsCache();
        ((ViaManagerImpl)Via.getManager()).init();
        new Class245(this.Field17114);
        this.Field17111.complete(null);
    }

    public Logger Method7322() {
        return this.Field17110;
    }

    public CompletableFuture Method7323() {
        return this.Field17111;
    }

    public ExecutorService Method7324() {
        return this.Field17112;
    }

    public EventLoop Method7325() {
        return this.Field17113;
    }

    public File Method7326() {
        return this.Field17114;
    }

    public void Method7327(File file) {
        this.Field17114 = file;
    }

    public String Method7328() {
        return this.Field17116;
    }

    public void Method7329(String string) {
        this.Field17116 = string;
    }

    public int Method7330() {
        return this.Field17115;
    }

    public void Method7331(int n) {
        this.Field17115 = n;
    }

    private static String Method7332(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 160;
            cArray2[n] = (char)(cArray[n] ^ (0x5502 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

