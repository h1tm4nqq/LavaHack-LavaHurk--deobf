//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.logging.*;
import java.io.*;
import com.google.common.util.concurrent.*;
import io.netty.channel.*;
import com.viaversion.viaversion.*;
import com.viaversion.viaversion.api.platform.*;
import com.viaversion.viaversion.api.*;
import com.viaversion.viaversion.api.data.*;
import java.util.concurrent.*;

public class Class1979
{
    public static final int Field17108;
    private static final Class1979 Field17109;
    private final Logger Field17110;
    private final CompletableFuture Field17111;
    private ExecutorService Field17112;
    private EventLoop Field17113;
    private File Field17114;
    private int Field17115;
    private String Field17116;
    private String Field17117 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1979() {
        this.Field17110 = (Logger)new Class1389(Class1796.Field16243);
        this.Field17111 = new CompletableFuture();
    }
    
    public static Class1979 Method7320() {
        return Class1979.Field17109;
    }
    
    public void Method7321() {
        final ThreadFactory build = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("ViaForge-%d").build();
        this.Field17112 = Executors.newFixedThreadPool(8, build);
        (this.Field17113 = new DefaultEventLoopGroup(1, build).next()).submit((Callable)this.Field17111::join);
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
    
    public void Method7327(final File field17114) {
        this.Field17114 = field17114;
    }
    
    public String Method7328() {
        return this.Field17116;
    }
    
    public void Method7329(final String field17116) {
        this.Field17116 = field17116;
    }
    
    public int Method7330() {
        return this.Field17115;
    }
    
    public void Method7331(final int field17115) {
        this.Field17115 = field17115;
    }
    
    static {
        Field17108 = 340;
        Field17109 = new Class1979();
    }
    
    private static String Method7332(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5502 ^ 0xA0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
