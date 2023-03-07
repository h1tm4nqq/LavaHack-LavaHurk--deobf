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
import lavahack.client.DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL;
import lavahack.client.I2i6KiQmfwA2MHXXCn61DFc7pgeJtGmU;
import lavahack.client.Lrn8z8s8pRwc3ZQW91h3qeTbQrfdnuzp;
import lavahack.client.jTWDvfvyD5dbxkT9cYsl23heEKePCaGk;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.z2BH3YYF0e10nMT6He908XcWXlHdTtEq;

public class FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D {
    public static final int Field17108 = (int)((long)-1458647838 ^ (long)-1458647881) << 2;
    private static final FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D Field17109 = new FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D();
    private final Logger Field17110 = new Lrn8z8s8pRwc3ZQW91h3qeTbQrfdnuzp(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243);
    private final CompletableFuture Field17111 = new CompletableFuture();
    private ExecutorService Field17112;
    private EventLoop Field17113;
    private File Field17114;
    private int Field17115;
    private String Field17116;
    private String Field17117 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D Method7320() {
        return Field17109;
    }

    public void Method7321() {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setDaemon(((int)-103092737L ^ 0xF9DAEDFE) != 0).setNameFormat("ViaForge-%d").build();
        this.Field17112 = Executors.newFixedThreadPool(((int)-1786595863L ^ 0x9582B5E8) << 3, threadFactory);
        this.Field17113 = new DefaultEventLoopGroup((int)((long)-1675776921 ^ (long)-1675776922), threadFactory).next();
        this.Field17113.submit(this.Field17111::join);
        this.Method7331((int)((long)84069599 ^ (long)84069514) << 2);
        this.Field17114 = new File("ViaForge");
        if (this.Field17114.mkdir()) {
            this.Method7322().info("Creating ViaForge Folder");
        }
        Via.init((ViaManager)ViaManagerImpl.builder().injector((ViaInjector)new jTWDvfvyD5dbxkT9cYsl23heEKePCaGk()).loader((ViaPlatformLoader)new DTOZJ9S4nGrXU0zEiGPvaeQUYx0R73wL()).platform((ViaPlatform)new z2BH3YYF0e10nMT6He908XcWXlHdTtEq(this.Field17114)).build());
        MappingDataLoader.enableMappingsCache();
        ((ViaManagerImpl)Via.getManager()).init();
        new I2i6KiQmfwA2MHXXCn61DFc7pgeJtGmU(this.Field17114);
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
        int n = (int)-862808375L ^ 0xCC9296C9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-611297080 ^ (long)-611297225);
            int n2 = (int)((long)1819518893 ^ (long)1819518888) << 5;
            cArray2[n] = (char)(cArray[n] ^ (((int)979533055L ^ 0x3A62567E) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

