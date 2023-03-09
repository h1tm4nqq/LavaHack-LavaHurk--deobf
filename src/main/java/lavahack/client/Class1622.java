/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lavahack.client.Class1187;
import lavahack.client.Class1298;
import lavahack.client.Class1302;
import lavahack.client.Class1588;
import lavahack.client.Class1608;
import lavahack.client.Class1728;
import lavahack.client.Class1878;
import lavahack.client.Class2010;
import lavahack.client.Class2129;
import lavahack.client.Class444;
import lavahack.client.Class481;
import lavahack.client.Class641;
import lavahack.client.Class739;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class1622
extends Class641
implements Runnable {
    private static final int Field15580 = Runtime.getRuntime().availableProcessors();
    private final Logger Field15581 = LogManager.getLogger(Class1622.class);
    private final Collection Field15582;
    private final InetSocketAddress Field15583;
    private ServerSocketChannel Field15584;
    private Selector Field15585;
    private List Field15586;
    private Thread Field15587;
    private final AtomicBoolean Field15588 = new AtomicBoolean(false);
    protected List Field15589;
    private List Field15590;
    private BlockingQueue Field15591;
    private int Field15592 = 0;
    private final AtomicInteger Field15593 = new AtomicInteger(0);
    private Class1588 Field15594 = new Class1298();
    private int Field15595 = -1;
    private String Field15596 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1622() {
        this(new InetSocketAddress(80), Field15580, null);
    }

    public Class1622(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, Field15580, null);
    }

    public Class1622(InetSocketAddress inetSocketAddress, int n) {
        this(inetSocketAddress, n, null);
    }

    public Class1622(InetSocketAddress inetSocketAddress, List list) {
        this(inetSocketAddress, Field15580, list);
    }

    public Class1622(InetSocketAddress inetSocketAddress, int n, List list) {
        this(inetSocketAddress, n, list, new HashSet());
    }

    public Class1622(InetSocketAddress inetSocketAddress, int n, List list, Collection collection) {
        if (inetSocketAddress == null) throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        if (n < 1) throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        if (collection == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        this.Field15586 = list == null ? Collections.emptyList() : list;
        this.Field15583 = inetSocketAddress;
        this.Field15582 = collection;
        this.Method530(false);
        this.Method532(false);
        this.Field15590 = new LinkedList();
        this.Field15589 = new ArrayList(n);
        this.Field15591 = new LinkedBlockingQueue();
        int n2 = 0;
        while (n2 < n) {
            Class1187 class1187 = new Class1187(this);
            this.Field15589.add(class1187);
            ++n2;
        }
    }

    public void Method525() {
        if (this.Field15587 != null) {
            throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
        }
        new Thread(this).start();
    }

    public void Method6309(int n) throws InterruptedException {
        this.Method6310(n, "");
    }

    public void Method6310(int n, String string) throws InterruptedException {
        if (!this.Field15588.compareAndSet(false, true)) {
            return;
        }
        Object object = this.Field15582;
        ArrayList arrayList = new ArrayList(this.Field15582);
        object = arrayList.iterator();
        while (true) {
            if (!object.hasNext()) {
                this.Field15594.Method1317();
                object = this;
                if (this.Field15587 == null) return;
                if (this.Field15585 == null) return;
                this.Field15585.wakeup();
                this.Field15587.join(n);
                return;
            }
            Class1728 class1728 = (Class1728)object.next();
            class1728.Method537(1001, string);
        }
    }

    public void Method6311() throws InterruptedException {
        this.Method6309(0);
    }

    @Override
    public Collection Method527() {
        Collection collection = this.Field15582;
        return Collections.unmodifiableCollection(new ArrayList(this.Field15582));
    }

    public InetSocketAddress Method6312() {
        return this.Field15583;
    }

    public int Method6313() {
        int n = this.Method6312().getPort();
        if (n != 0) return n;
        if (this.Field15584 == null) return n;
        return this.Field15584.socket().getLocalPort();
    }

    public List Method6314() {
        return Collections.unmodifiableList(this.Field15586);
    }

    public void Method6315(int n) {
        this.Field15595 = n;
    }

    public int Method6316() {
        return this.Field15595;
    }

    @Override
    public void run() {
        if (!this.Method6322()) {
            return;
        }
        if (!this.Method6321()) {
            return;
        }
        int n = 5;
        int n2 = 0;
        while (true) {
            int n3;
            if (this.Field15587.isInterrupted()) {
                this.Method528();
                return;
            }
            SelectionKey selectionKey = null;
            if (this.Field15588.get()) {
                n2 = 5;
            }
            if ((n3 = this.Field15585.select(n2)) == 0 && this.Field15588.get()) {
                --n;
            }
            Set<SelectionKey> set = this.Field15585.selectedKeys();
            Iterator<SelectionKey> iterator = set.iterator();
            while (iterator.hasNext()) {
                selectionKey = iterator.next();
                if (!selectionKey.isValid()) continue;
                if (selectionKey.isAcceptable()) {
                    this.Method6318(selectionKey, iterator);
                    continue;
                }
                if (selectionKey.isReadable() && !this.Method6319(selectionKey, iterator) || !selectionKey.isWritable()) continue;
                this.Method6320(selectionKey);
            }
            this.Method6317();
        }
    }

    private void Method6317() throws InterruptedException, IOException {
        while (!this.Field15590.isEmpty()) {
            Class1302 class1302 = (Class1302)this.Field15590.remove(0);
            Class1608 class1608 = (Class1608)class1302.Method5295();
            ByteBuffer byteBuffer = this.Method6327();
            if (Class444.Method2095(byteBuffer, class1302, class1608)) {
                this.Field15590.add(class1302);
            }
            if (byteBuffer.hasRemaining()) {
                class1302.Field13944.put(byteBuffer);
                this.Method6326(class1302);
                continue;
            }
            this.Method6328(byteBuffer);
        }
    }

    private void Method6318(SelectionKey selectionKey, Iterator iterator) throws IOException, InterruptedException {
        if (!this.Method6337(selectionKey)) {
            selectionKey.cancel();
            return;
        }
        SocketChannel socketChannel = this.Field15584.accept();
        if (socketChannel == null) {
            return;
        }
        socketChannel.configureBlocking(false);
        Socket socket = socketChannel.socket();
        socket.setTcpNoDelay(this.Method529());
        socket.setKeepAlive(true);
        Class1302 class1302 = this.Field15594.Method1315(this, this.Field15586);
        class1302.Method5290(socketChannel.register(this.Field15585, 1, class1302));
        class1302.Method5296(this.Field15594.Method1316(socketChannel, class1302.Method5291()));
        iterator.remove();
        this.Method6323(class1302);
    }

    private boolean Method6319(SelectionKey selectionKey, Iterator iterator) throws InterruptedException, Class2010 {
        Class1302 class1302 = (Class1302)selectionKey.attachment();
        ByteBuffer byteBuffer = this.Method6327();
        if (class1302.Method5295() == null) {
            selectionKey.cancel();
            this.Method6329(selectionKey, class1302, new IOException());
            return false;
        }
        if (!Class444.Method2094(byteBuffer, class1302, class1302.Method5295())) {
            this.Method6328(byteBuffer);
            return true;
        }
        if (byteBuffer.hasRemaining()) {
            class1302.Field13944.put(byteBuffer);
            this.Method6326(class1302);
            iterator.remove();
            if (!(class1302.Method5295() instanceof Class1608)) return true;
            if (!((Class1608)class1302.Method5295()).Method2484()) return true;
            this.Field15590.add(class1302);
            return true;
        }
        this.Method6328(byteBuffer);
        return true;
    }

    private void Method6320(SelectionKey selectionKey) throws Class2010 {
        Class1302 class1302 = (Class1302)selectionKey.attachment();
        if (!Class444.Method2096(class1302, class1302.Method5295())) return;
        if (!selectionKey.isValid()) return;
        selectionKey.interestOps(1);
    }

    private boolean Method6321() {
        this.Field15587.setName("WebSocketSelector-" + this.Field15587.getId());
        this.Field15584 = ServerSocketChannel.open();
        this.Field15584.configureBlocking(false);
        ServerSocket serverSocket = this.Field15584.socket();
        serverSocket.setReceiveBufferSize(16384);
        serverSocket.setReuseAddress(this.Method531());
        serverSocket.bind(this.Field15583, this.Method6316());
        this.Field15585 = Selector.open();
        this.Field15584.register(this.Field15585, this.Field15584.validOps());
        this.Method524();
        Iterator iterator = this.Field15589.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method6343();
                return true;
            }
            Class1187 class1187 = (Class1187)iterator.next();
            class1187.start();
        }
    }

    private boolean Method6322() {
        Class1622 class1622 = this;
        if (this.Field15587 != null) {
            throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
        }
        this.Field15587 = Thread.currentThread();
        if (!this.Field15588.get()) return true;
        return false;
    }

    private void Method528() {
        this.Method523();
        if (this.Field15589 != null) {
            for (Class1187 class1187 : this.Field15589) {
                class1187.interrupt();
            }
        }
        if (this.Field15585 != null) {
            this.Field15585.close();
        }
        if (this.Field15584 == null) return;
        this.Field15584.close();
    }

    protected void Method6323(Class1728 class1728) throws InterruptedException {
        if (this.Field15593.get() >= 2 * this.Field15589.size() + 1) {
            return;
        }
        this.Field15593.incrementAndGet();
        this.Field15591.put(this.Method6325());
    }

    protected void Method6324(Class1728 class1728) throws InterruptedException {
    }

    public ByteBuffer Method6325() {
        return ByteBuffer.allocate(16384);
    }

    protected void Method6326(Class1302 class1302) throws InterruptedException {
        if (class1302.Method5297() == null) {
            class1302.Method5298((Class1187)this.Field15589.get(this.Field15592 % this.Field15589.size()));
            ++this.Field15592;
        }
        class1302.Method5297().Method4779(class1302);
    }

    private ByteBuffer Method6327() throws InterruptedException {
        return (ByteBuffer)this.Field15591.take();
    }

    private void Method6328(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.Field15591.size() > this.Field15593.intValue()) {
            return;
        }
        this.Field15591.put(byteBuffer);
    }

    private void Method6329(SelectionKey selectionKey, Class1728 class1728, IOException iOException) {
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (class1728 != null) {
            class1728.Method540(1006, iOException.getMessage());
            return;
        }
        if (selectionKey == null) return;
        SelectableChannel selectableChannel = selectionKey.channel();
        if (selectableChannel == null) return;
        if (!selectableChannel.isOpen()) return;
        selectableChannel.close();
        this.Field15581.trace("Connection closed because of exception", (Throwable)iOException);
    }

    private void Method6330(Class1728 class1728, Exception exception) {
        this.Field15581.error("Shutdown due to fatal error", (Throwable)exception);
        this.Method6342(class1728, exception);
        String string = exception.getCause() != null ? " caused by " + exception.getCause().getClass().getName() : "";
        String string2 = "Got error on server side: " + exception.getClass().getName() + string;
        this.Method6310(0, string2);
        if (this.Field15589 != null) {
            for (Class1187 class1187 : this.Field15589) {
                class1187.interrupt();
            }
        }
        if (this.Field15587 == null) return;
        this.Field15587.interrupt();
    }

    @Override
    public final void Method508(Class1728 class1728, String string) {
        this.Method6341(class1728, string);
    }

    @Override
    public final void Method509(Class1728 class1728, ByteBuffer byteBuffer) {
        this.Method6344(class1728, byteBuffer);
    }

    @Override
    public final void Method510(Class1728 class1728, Class739 class739) {
        if (!this.Method6332(class1728)) return;
        this.Method6339(class1728, (Class481)class739);
    }

    @Override
    public final void Method511(Class1728 class1728, int n, String string, boolean bl) {
        this.Field15585.wakeup();
        if (this.Method6331(class1728)) {
            this.Method6340(class1728, n, string, bl);
        }
        this.Method6324(class1728);
    }

    protected boolean Method6331(Class1728 class1728) {
        boolean bl = false;
        Collection collection = this.Field15582;
        if (this.Field15582.contains(class1728)) {
            bl = this.Field15582.remove(class1728);
        } else {
            this.Field15581.trace("Removing connection which is not in the connections collection! Possible no handshake received! {}", (Object)class1728);
        }
        if (!this.Field15588.get()) return bl;
        if (!this.Field15582.isEmpty()) return bl;
        this.Field15587.interrupt();
        return bl;
    }

    protected boolean Method6332(Class1728 class1728) {
        if (!this.Field15588.get()) {
            Collection collection = this.Field15582;
            return this.Field15582.add(class1728);
        }
        class1728.Method538(1001);
        return true;
    }

    @Override
    public final void Method514(Class1728 class1728, Exception exception) {
        this.Method6342(class1728, exception);
    }

    @Override
    public final void Method518(Class1728 class1728) {
        Class1302 class1302 = (Class1302)class1728;
        class1302.Method5291().interestOps(5);
        this.Field15585.wakeup();
    }

    @Override
    public void Method513(Class1728 class1728, int n, String string) {
        this.Method6333(class1728, n, string);
    }

    @Override
    public void Method512(Class1728 class1728, int n, String string, boolean bl) {
        this.Method6334(class1728, n, string, bl);
    }

    public void Method6333(Class1728 class1728, int n, String string) {
    }

    public void Method6334(Class1728 class1728, int n, String string, boolean bl) {
    }

    public final void Method6335(Class1588 class1588) {
        if (this.Field15594 != null) {
            this.Field15594.Method1317();
        }
        this.Field15594 = class1588;
    }

    public final Class1878 Method6336() {
        return this.Field15594;
    }

    protected boolean Method6337(SelectionKey selectionKey) {
        return true;
    }

    private Socket Method6338(Class1728 class1728) {
        Class1302 class1302 = (Class1302)class1728;
        return ((SocketChannel)class1302.Method5291().channel()).socket();
    }

    @Override
    public InetSocketAddress Method519(Class1728 class1728) {
        return (InetSocketAddress)this.Method6338(class1728).getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress Method520(Class1728 class1728) {
        return (InetSocketAddress)this.Method6338(class1728).getRemoteSocketAddress();
    }

    public abstract void Method6339(Class1728 var1, Class481 var2);

    public abstract void Method6340(Class1728 var1, int var2, String var3, boolean var4);

    public abstract void Method6341(Class1728 var1, String var2);

    public abstract void Method6342(Class1728 var1, Exception var2);

    public abstract void Method6343();

    public void Method6344(Class1728 class1728, ByteBuffer byteBuffer) {
    }

    public void Method6345(String string) {
        this.Method6350(string, this.Field15582);
    }

    public void Method6346(byte[] byArray) {
        this.Method6348(byArray, this.Field15582);
    }

    public void Method6347(ByteBuffer byteBuffer) {
        this.Method6349(byteBuffer, this.Field15582);
    }

    public void Method6348(byte[] byArray, Collection collection) {
        if (byArray == null) throw new IllegalArgumentException();
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        this.Method6349(ByteBuffer.wrap(byArray), collection);
    }

    public void Method6349(ByteBuffer byteBuffer, Collection collection) {
        if (byteBuffer == null) throw new IllegalArgumentException();
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        this.Method6351(byteBuffer, collection);
    }

    public void Method6350(String string, Collection collection) {
        if (string == null) throw new IllegalArgumentException();
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        this.Method6351(string, collection);
    }

    private void Method6351(Object object, Collection collection) {
        String string = null;
        if (object instanceof String) {
            string = (String)object;
        }
        ByteBuffer byteBuffer = null;
        if (object instanceof ByteBuffer) {
            byteBuffer = (ByteBuffer)object;
        }
        if (string == null && byteBuffer == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Object object2 = collection;
        ArrayList arrayList = new ArrayList(collection);
        object2 = arrayList.iterator();
        while (object2.hasNext()) {
            Class1728 class1728 = (Class1728)object2.next();
            if (class1728 == null) continue;
            Class2129 class2129 = class1728.Method555();
            this.Method6352(class2129, hashMap, string, byteBuffer);
            class1728.Method545((Collection)hashMap.get(class2129));
        }
    }

    private void Method6352(Class2129 class2129, Map map, String string, ByteBuffer byteBuffer) {
        if (map.containsKey(class2129)) return;
        List list = null;
        if (string != null) {
            list = class2129.Method4402(string, false);
        }
        if (byteBuffer != null) {
            list = class2129.Method4401(byteBuffer, false);
        }
        if (list == null) return;
        map.put(class2129, list);
    }

    static Logger Method6353(Class1622 class1622) {
        return class1622.Field15581;
    }

    static void Method6354(Class1622 class1622, Class1728 class1728, Exception exception) {
        class1622.Method6330(class1728, exception);
    }

    static void Method6355(Class1622 class1622, ByteBuffer byteBuffer) throws InterruptedException {
        class1622.Method6328(byteBuffer);
    }

    private static String Method536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 216;
            cArray2[n] = (char)(cArray[n] ^ (0x4D7C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

