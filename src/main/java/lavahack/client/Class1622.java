//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.atomic.*;
import org.apache.logging.log4j.*;
import java.util.concurrent.*;
import java.nio.*;
import java.io.*;
import java.net.*;
import java.nio.channels.*;
import java.util.*;

public abstract class Class1622 extends Class641 implements Runnable
{
    private static final int Field15580;
    private final Logger Field15581;
    private final Collection Field15582;
    private final InetSocketAddress Field15583;
    private ServerSocketChannel Field15584;
    private Selector Field15585;
    private List Field15586;
    private Thread Field15587;
    private final AtomicBoolean Field15588;
    protected List Field15589;
    private List Field15590;
    private BlockingQueue Field15591;
    private int Field15592;
    private final AtomicInteger Field15593;
    private Class1588 Field15594;
    private int Field15595;
    private String Field15596 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1622() {
        this(new InetSocketAddress(80), Class1622.Field15580, null);
    }
    
    public Class1622(final InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, Class1622.Field15580, null);
    }
    
    public Class1622(final InetSocketAddress inetSocketAddress, final int n) {
        this(inetSocketAddress, n, null);
    }
    
    public Class1622(final InetSocketAddress inetSocketAddress, final List list) {
        this(inetSocketAddress, Class1622.Field15580, list);
    }
    
    public Class1622(final InetSocketAddress inetSocketAddress, final int n, final List list) {
        this(inetSocketAddress, n, list, new HashSet());
    }
    
    public Class1622(final InetSocketAddress field15583, final int initialCapacity, final List field15584, final Collection field15585) {
        this.Field15581 = LogManager.getLogger((Class)Class1622.class);
        this.Field15588 = new AtomicBoolean(false);
        this.Field15592 = 0;
        this.Field15593 = new AtomicInteger(0);
        this.Field15594 = (Class1588)new Class1298();
        this.Field15595 = -1;
        if (field15583 == null || initialCapacity < 1 || field15585 == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        if (field15584 == null) {
            this.Field15586 = Collections.emptyList();
        }
        else {
            this.Field15586 = field15584;
        }
        this.Field15583 = field15583;
        this.Field15582 = field15585;
        this.Method530(false);
        this.Method532(false);
        this.Field15590 = new LinkedList();
        this.Field15589 = new ArrayList(initialCapacity);
        this.Field15591 = new LinkedBlockingQueue();
        for (int i = 0; i < initialCapacity; ++i) {
            this.Field15589.add(new Class1187(this));
        }
    }
    
    public void Method525() {
        if (this.Field15587 != null) {
            throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
        }
        new Thread(this).start();
    }
    
    public void Method6309(final int n) throws InterruptedException {
        this.Method6310(n, "");
    }
    
    public void Method6310(final int n, final String s) throws InterruptedException {
        if (!this.Field15588.compareAndSet(false, true)) {
            return;
        }
        final Collection field15582 = this.Field15582;
        final Iterator<Class1728> iterator = new ArrayList<Class1728>(this.Field15582).iterator();
        while (iterator.hasNext()) {
            iterator.next().Method537(1001, s);
        }
        this.Field15594.Method1317();
        if (this.Field15587 != null && this.Field15585 != null) {
            this.Field15585.wakeup();
            this.Field15587.join(n);
        }
    }
    
    public void Method6311() throws InterruptedException {
        this.Method6309(0);
    }
    
    public Collection Method527() {
        final Collection field15582 = this.Field15582;
        return Collections.unmodifiableCollection((Collection<?>)new ArrayList<Object>(this.Field15582));
    }
    
    public InetSocketAddress Method6312() {
        return this.Field15583;
    }
    
    public int Method6313() {
        int n = this.Method6312().getPort();
        if (n == 0 && this.Field15584 != null) {
            n = this.Field15584.socket().getLocalPort();
        }
        return n;
    }
    
    public List Method6314() {
        return Collections.unmodifiableList((List<?>)this.Field15586);
    }
    
    public void Method6315(final int field15595) {
        this.Field15595 = field15595;
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
        while (!this.Field15587.isInterrupted()) {
            if (this.Field15588.get()) {
                n2 = 5;
            }
            if (this.Field15585.select(n2) == 0 && this.Field15588.get()) {
                --n;
            }
            final Iterator<SelectionKey> iterator = this.Field15585.selectedKeys().iterator();
            while (iterator.hasNext()) {
                final SelectionKey selectionKey = iterator.next();
                if (!selectionKey.isValid()) {
                    continue;
                }
                if (selectionKey.isAcceptable()) {
                    this.Method6318(selectionKey, iterator);
                }
                else {
                    if (selectionKey.isReadable() && !this.Method6319(selectionKey, iterator)) {
                        continue;
                    }
                    if (!selectionKey.isWritable()) {
                        continue;
                    }
                    this.Method6320(selectionKey);
                }
            }
            this.Method6317();
        }
        this.Method528();
    }
    
    private void Method6317() throws InterruptedException, IOException {
        while (!this.Field15590.isEmpty()) {
            final Class1302 class1302 = this.Field15590.remove(0);
            final Class1608 class1303 = (Class1608)class1302.Method5295();
            final ByteBuffer method6327 = this.Method6327();
            if (Class444.Method2095(method6327, class1302, class1303)) {
                this.Field15590.add(class1302);
            }
            if (method6327.hasRemaining()) {
                class1302.Field13944.put(method6327);
                this.Method6326(class1302);
            }
            else {
                this.Method6328(method6327);
            }
        }
    }
    
    private void Method6318(final SelectionKey selectionKey, final Iterator iterator) throws IOException, InterruptedException {
        if (!this.Method6337(selectionKey)) {
            selectionKey.cancel();
            return;
        }
        final SocketChannel accept = this.Field15584.accept();
        if (accept == null) {
            return;
        }
        accept.configureBlocking(false);
        final Socket socket = accept.socket();
        socket.setTcpNoDelay(this.Method529());
        socket.setKeepAlive(true);
        final Class1302 method1315 = this.Field15594.Method1315((Class630)this, this.Field15586);
        method1315.Method5290(accept.register(this.Field15585, 1, method1315));
        method1315.Method5296(this.Field15594.Method1316(accept, method1315.Method5291()));
        iterator.remove();
        this.Method6323((Class1728)method1315);
    }
    
    private boolean Method6319(final SelectionKey selectionKey, final Iterator iterator) throws InterruptedException, Class2010 {
        final Class1302 class1302 = (Class1302)selectionKey.attachment();
        final ByteBuffer method6327 = this.Method6327();
        if (class1302.Method5295() == null) {
            selectionKey.cancel();
            this.Method6329(selectionKey, (Class1728)class1302, new IOException());
            return false;
        }
        if (Class444.Method2094(method6327, class1302, class1302.Method5295())) {
            if (method6327.hasRemaining()) {
                class1302.Field13944.put(method6327);
                this.Method6326(class1302);
                iterator.remove();
                if (class1302.Method5295() instanceof Class1608 && ((Class1608)class1302.Method5295()).Method2484()) {
                    this.Field15590.add(class1302);
                }
            }
            else {
                this.Method6328(method6327);
            }
        }
        else {
            this.Method6328(method6327);
        }
        return true;
    }
    
    private void Method6320(final SelectionKey selectionKey) throws Class2010 {
        final Class1302 class1302 = (Class1302)selectionKey.attachment();
        if (Class444.Method2096(class1302, class1302.Method5295()) && selectionKey.isValid()) {
            selectionKey.interestOps(1);
        }
    }
    
    private boolean Method6321() {
        this.Field15587.setName("WebSocketSelector-" + this.Field15587.getId());
        (this.Field15584 = ServerSocketChannel.open()).configureBlocking(false);
        final ServerSocket socket = this.Field15584.socket();
        socket.setReceiveBufferSize(16384);
        socket.setReuseAddress(this.Method531());
        socket.bind(this.Field15583, this.Method6316());
        this.Field15585 = Selector.open();
        this.Field15584.register(this.Field15585, this.Field15584.validOps());
        this.Method524();
        final Iterator<Class1187> iterator = this.Field15589.iterator();
        while (iterator.hasNext()) {
            iterator.next().start();
        }
        this.Method6343();
        return true;
    }
    
    private boolean Method6322() {
        if (this.Field15587 != null) {
            throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
        }
        this.Field15587 = Thread.currentThread();
        return !this.Field15588.get();
    }
    
    private void Method528() {
        this.Method523();
        if (this.Field15589 != null) {
            final Iterator<Class1187> iterator = this.Field15589.iterator();
            while (iterator.hasNext()) {
                iterator.next().interrupt();
            }
        }
        if (this.Field15585 != null) {
            this.Field15585.close();
        }
        if (this.Field15584 != null) {
            this.Field15584.close();
        }
    }
    
    protected void Method6323(final Class1728 class1728) throws InterruptedException {
        if (this.Field15593.get() >= 2 * this.Field15589.size() + 1) {
            return;
        }
        this.Field15593.incrementAndGet();
        this.Field15591.put(this.Method6325());
    }
    
    protected void Method6324(final Class1728 class1728) throws InterruptedException {
    }
    
    public ByteBuffer Method6325() {
        return ByteBuffer.allocate(16384);
    }
    
    protected void Method6326(final Class1302 class1302) throws InterruptedException {
        if (class1302.Method5297() == null) {
            class1302.Method5298((Class1187)this.Field15589.get(this.Field15592 % this.Field15589.size()));
            ++this.Field15592;
        }
        class1302.Method5297().Method4779(class1302);
    }
    
    private ByteBuffer Method6327() throws InterruptedException {
        return this.Field15591.take();
    }
    
    private void Method6328(final ByteBuffer byteBuffer) throws InterruptedException {
        if (this.Field15591.size() > this.Field15593.intValue()) {
            return;
        }
        this.Field15591.put(byteBuffer);
    }
    
    private void Method6329(final SelectionKey selectionKey, final Class1728 class1728, final IOException ex) {
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (class1728 != null) {
            class1728.Method540(1006, ex.getMessage());
        }
        else if (selectionKey != null) {
            final SelectableChannel channel = selectionKey.channel();
            if (channel != null && channel.isOpen()) {
                channel.close();
                this.Field15581.trace("Connection closed because of exception", (Throwable)ex);
            }
        }
    }
    
    private void Method6330(final Class1728 class1728, final Exception ex) {
        this.Field15581.error("Shutdown due to fatal error", (Throwable)ex);
        this.Method6342(class1728, ex);
        this.Method6310(0, "Got error on server side: " + ex.getClass().getName() + ((ex.getCause() != null) ? (" caused by " + ex.getCause().getClass().getName()) : ""));
        if (this.Field15589 != null) {
            final Iterator<Class1187> iterator = this.Field15589.iterator();
            while (iterator.hasNext()) {
                iterator.next().interrupt();
            }
        }
        if (this.Field15587 != null) {
            this.Field15587.interrupt();
        }
    }
    
    @Override
    public final void Method508(final Class1728 class1728, final String s) {
        this.Method6341(class1728, s);
    }
    
    @Override
    public final void Method509(final Class1728 class1728, final ByteBuffer byteBuffer) {
        this.Method6344(class1728, byteBuffer);
    }
    
    @Override
    public final void Method510(final Class1728 class1728, final Class739 class1729) {
        if (this.Method6332(class1728)) {
            this.Method6339(class1728, (Class481)class1729);
        }
    }
    
    @Override
    public final void Method511(final Class1728 class1728, final int n, final String s, final boolean b) {
        this.Field15585.wakeup();
        if (this.Method6331(class1728)) {
            this.Method6340(class1728, n, s, b);
        }
        this.Method6324(class1728);
    }
    
    protected boolean Method6331(final Class1728 class1728) {
        boolean remove = false;
        final Collection field15582 = this.Field15582;
        if (this.Field15582.contains(class1728)) {
            remove = this.Field15582.remove(class1728);
        }
        else {
            this.Field15581.trace("Removing connection which is not in the connections collection! Possible no handshake received! {}", (Object)class1728);
        }
        if (this.Field15588.get() && this.Field15582.isEmpty()) {
            this.Field15587.interrupt();
        }
        return remove;
    }
    
    protected boolean Method6332(final Class1728 class1728) {
        if (!this.Field15588.get()) {
            final Collection field15582 = this.Field15582;
            return this.Field15582.add(class1728);
        }
        class1728.Method538(1001);
        return true;
    }
    
    @Override
    public final void Method514(final Class1728 class1728, final Exception ex) {
        this.Method6342(class1728, ex);
    }
    
    @Override
    public final void Method518(final Class1728 class1728) {
        ((Class1302)class1728).Method5291().interestOps(5);
        this.Field15585.wakeup();
    }
    
    @Override
    public void Method513(final Class1728 class1728, final int n, final String s) {
        this.Method6333(class1728, n, s);
    }
    
    @Override
    public void Method512(final Class1728 class1728, final int n, final String s, final boolean b) {
        this.Method6334(class1728, n, s, b);
    }
    
    public void Method6333(final Class1728 class1728, final int n, final String s) {
    }
    
    public void Method6334(final Class1728 class1728, final int n, final String s, final boolean b) {
    }
    
    public final void Method6335(final Class1588 field15594) {
        if (this.Field15594 != null) {
            this.Field15594.Method1317();
        }
        this.Field15594 = field15594;
    }
    
    public final Class1878 Method6336() {
        return (Class1878)this.Field15594;
    }
    
    protected boolean Method6337(final SelectionKey selectionKey) {
        return true;
    }
    
    private Socket Method6338(final Class1728 class1728) {
        return ((SocketChannel)((Class1302)class1728).Method5291().channel()).socket();
    }
    
    @Override
    public InetSocketAddress Method519(final Class1728 class1728) {
        return (InetSocketAddress)this.Method6338(class1728).getLocalSocketAddress();
    }
    
    @Override
    public InetSocketAddress Method520(final Class1728 class1728) {
        return (InetSocketAddress)this.Method6338(class1728).getRemoteSocketAddress();
    }
    
    public abstract void Method6339(final Class1728 p0, final Class481 p1);
    
    public abstract void Method6340(final Class1728 p0, final int p1, final String p2, final boolean p3);
    
    public abstract void Method6341(final Class1728 p0, final String p1);
    
    public abstract void Method6342(final Class1728 p0, final Exception p1);
    
    public abstract void Method6343();
    
    public void Method6344(final Class1728 class1728, final ByteBuffer byteBuffer) {
    }
    
    public void Method6345(final String s) {
        this.Method6350(s, this.Field15582);
    }
    
    public void Method6346(final byte[] array) {
        this.Method6348(array, this.Field15582);
    }
    
    public void Method6347(final ByteBuffer byteBuffer) {
        this.Method6349(byteBuffer, this.Field15582);
    }
    
    public void Method6348(final byte[] array, final Collection collection) {
        if (array == null || collection == null) {
            throw new IllegalArgumentException();
        }
        this.Method6349(ByteBuffer.wrap(array), collection);
    }
    
    public void Method6349(final ByteBuffer byteBuffer, final Collection collection) {
        if (byteBuffer == null || collection == null) {
            throw new IllegalArgumentException();
        }
        this.Method6351(byteBuffer, collection);
    }
    
    public void Method6350(final String s, final Collection collection) {
        if (s == null || collection == null) {
            throw new IllegalArgumentException();
        }
        this.Method6351(s, collection);
    }
    
    private void Method6351(final Object o, final Collection c) {
        String s = null;
        if (o instanceof String) {
            s = (String)o;
        }
        ByteBuffer byteBuffer = null;
        if (o instanceof ByteBuffer) {
            byteBuffer = (ByteBuffer)o;
        }
        if (s == null && byteBuffer == null) {
            return;
        }
        final HashMap<Object, Collection> hashMap = new HashMap<Object, Collection>();
        for (final Class1728 class1728 : new ArrayList<Class1728>(c)) {
            if (class1728 != null) {
                final Class2129 method555 = class1728.Method555();
                this.Method6352(method555, hashMap, s, byteBuffer);
                class1728.Method545(hashMap.get(method555));
            }
        }
    }
    
    private void Method6352(final Class2129 class2129, final Map map, final String s, final ByteBuffer byteBuffer) {
        if (!map.containsKey(class2129)) {
            List list = null;
            if (s != null) {
                list = class2129.Method4402(s, false);
            }
            if (byteBuffer != null) {
                list = class2129.Method4401(byteBuffer, false);
            }
            if (list != null) {
                map.put(class2129, list);
            }
        }
    }
    
    static Logger Method6353(final Class1622 class1622) {
        return class1622.Field15581;
    }
    
    static void Method6354(final Class1622 class1622, final Class1728 class1623, final Exception ex) {
        class1622.Method6330(class1623, ex);
    }
    
    static void Method6355(final Class1622 class1622, final ByteBuffer byteBuffer) throws InterruptedException {
        class1622.Method6328(byteBuffer);
    }
    
    static {
        Field15580 = Runtime.getRuntime().availableProcessors();
    }
    
    private static String Method536(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4D7C ^ 0xD8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
