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
import lavahack.client.C9MSz32V0EKndBPfEqNcwAnfZSHg376Q;
import lavahack.client.DFErp9T9eeNlJpVC6NLojB02MDiAMZoy;
import lavahack.client.DkMZhn6HTXSMui7v30mYhxPkVEtejJaC;
import lavahack.client.LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG;
import lavahack.client.QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx;
import lavahack.client.ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
import lavahack.client.b45Mx8d77l0xSiwkvE7eDz1SRLhprWcR;
import lavahack.client.eDpAYOVc17EDSyXrlqSLpwP1tMH8OsrG;
import lavahack.client.iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv;
import lavahack.client.mc3rqyZszJ3HCE233PVUn0AfzPxNrxBU;
import lavahack.client.rWOxkXahfy879ZWg1QDRw2hroxYTBucF;
import lavahack.client.slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ssaucigTBdftOlF4YyCJ0vIHypIvTC8o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX
extends LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG
implements Runnable {
    private static final int Field15580 = Runtime.getRuntime().availableProcessors();
    private final Logger Field15581 = LogManager.getLogger(slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX.class);
    private final Collection Field15582;
    private final InetSocketAddress Field15583;
    private ServerSocketChannel Field15584;
    private Selector Field15585;
    private List Field15586;
    private Thread Field15587;
    private final AtomicBoolean Field15588 = new AtomicBoolean(((int)-723313131L ^ 0xD4E31E15) != 0);
    protected List Field15589;
    private List Field15590;
    private BlockingQueue Field15591;
    private int Field15592 = (int)762378199L ^ 0x2D70F7D7;
    private final AtomicInteger Field15593 = new AtomicInteger((int)((long)-892827905 ^ (long)-892827905));
    private C9MSz32V0EKndBPfEqNcwAnfZSHg376Q Field15594 = new eDpAYOVc17EDSyXrlqSLpwP1tMH8OsrG();
    private int Field15595 = (int)((long)1255268218 ^ (long)-1255268219);
    private String Field15596 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX() {
        this(new InetSocketAddress((int)((long)-1965529299 ^ (long)-1965529304) << 4), Field15580, null);
    }

    public slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, Field15580, null);
    }

    public slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX(InetSocketAddress inetSocketAddress, int n) {
        this(inetSocketAddress, n, null);
    }

    public slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX(InetSocketAddress inetSocketAddress, List list) {
        this(inetSocketAddress, Field15580, list);
    }

    public slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX(InetSocketAddress inetSocketAddress, int n, List list) {
        this(inetSocketAddress, n, list, new HashSet());
    }

    public slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX(InetSocketAddress inetSocketAddress, int n, List list, Collection collection) {
        if (inetSocketAddress == null) throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        if (n < ((int)962168481L ^ 0x395986A0)) throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        if (collection == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        this.Field15586 = list == null ? Collections.emptyList() : list;
        this.Field15583 = inetSocketAddress;
        this.Field15582 = collection;
        this.Method530(((int)1469092975L ^ 0x5790946F) != 0);
        this.Method532((boolean)((long)-2133052043 ^ (long)-2133052043));
        this.Field15590 = new LinkedList();
        this.Field15589 = new ArrayList(n);
        this.Field15591 = new LinkedBlockingQueue();
        int n2 = (int)((long)1164341605 ^ (long)1164341605);
        while (n2 < n) {
            slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this);
            this.Field15589.add(slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
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
        if (!this.Field15588.compareAndSet((boolean)((long)203683818 ^ (long)203683818), ((int)1937837042L ^ 0x73810BF3) != 0)) {
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
            ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA = (ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA)object.next();
            zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA.Method537((int)((long)2146501206 ^ (long)2146501055), string);
        }
    }

    public void Method6311() throws InterruptedException {
        this.Method6309((int)-487459327L ^ 0xE2F1F601);
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
        int n = (int)((long)199911389 ^ (long)199911384);
        int n2 = (int)541681450L ^ 0x2049672A;
        while (true) {
            int n3;
            if (this.Field15587.isInterrupted()) {
                this.Method528();
                return;
            }
            SelectionKey selectionKey = null;
            if (this.Field15588.get()) {
                n2 = (int)1949514424L ^ 0x74333ABD;
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
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = (rWOxkXahfy879ZWg1QDRw2hroxYTBucF)this.Field15590.remove((int)((long)75353819 ^ (long)75353819));
            DFErp9T9eeNlJpVC6NLojB02MDiAMZoy dFErp9T9eeNlJpVC6NLojB02MDiAMZoy = (DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5295();
            ByteBuffer byteBuffer = this.Method6327();
            if (mc3rqyZszJ3HCE233PVUn0AfzPxNrxBU.Method2095(byteBuffer, rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, dFErp9T9eeNlJpVC6NLojB02MDiAMZoy)) {
                this.Field15590.add(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
            }
            if (byteBuffer.hasRemaining()) {
                rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Field13944.put(byteBuffer);
                this.Method6326(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
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
        socketChannel.configureBlocking(((int)-777301244L ^ 0xD1AB5304) != 0);
        Socket socket = socketChannel.socket();
        socket.setTcpNoDelay(this.Method529());
        socket.setKeepAlive((boolean)((long)1903192274 ^ (long)1903192275));
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = this.Field15594.Method1315(this, this.Field15586);
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5290(socketChannel.register(this.Field15585, (int)((long)1013906128 ^ (long)1013906129), rWOxkXahfy879ZWg1QDRw2hroxYTBucF2));
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5296(this.Field15594.Method1316(socketChannel, rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5291()));
        iterator.remove();
        this.Method6323(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
    }

    private boolean Method6319(SelectionKey selectionKey, Iterator iterator) throws InterruptedException, ssaucigTBdftOlF4YyCJ0vIHypIvTC8o {
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = (rWOxkXahfy879ZWg1QDRw2hroxYTBucF)selectionKey.attachment();
        ByteBuffer byteBuffer = this.Method6327();
        if (rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5295() == null) {
            selectionKey.cancel();
            this.Method6329(selectionKey, rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, new IOException());
            return ((int)-490105119L ^ 0xE2C996E1) != 0;
        }
        if (!mc3rqyZszJ3HCE233PVUn0AfzPxNrxBU.Method2094(byteBuffer, rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5295())) {
            this.Method6328(byteBuffer);
            return (int)((long)-715486512 ^ (long)-715486511) != 0;
        }
        if (byteBuffer.hasRemaining()) {
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Field13944.put(byteBuffer);
            this.Method6326(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
            iterator.remove();
            if (!(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5295() instanceof DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)) return (int)((long)-715486512 ^ (long)-715486511) != 0;
            if (!((DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5295()).Method2484()) return (int)((long)-715486512 ^ (long)-715486511) != 0;
            this.Field15590.add(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
            return (int)((long)-715486512 ^ (long)-715486511) != 0;
        }
        this.Method6328(byteBuffer);
        return (int)((long)-715486512 ^ (long)-715486511) != 0;
    }

    private void Method6320(SelectionKey selectionKey) throws ssaucigTBdftOlF4YyCJ0vIHypIvTC8o {
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = (rWOxkXahfy879ZWg1QDRw2hroxYTBucF)selectionKey.attachment();
        if (!mc3rqyZszJ3HCE233PVUn0AfzPxNrxBU.Method2096(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2, rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5295())) return;
        if (!selectionKey.isValid()) return;
        selectionKey.interestOps((int)((long)-206637960 ^ (long)-206637959));
    }

    private boolean Method6321() {
        this.Field15587.setName("WebSocketSelector-" + this.Field15587.getId());
        this.Field15584 = ServerSocketChannel.open();
        this.Field15584.configureBlocking((boolean)((long)-1010342953 ^ (long)-1010342953));
        ServerSocket serverSocket = this.Field15584.socket();
        serverSocket.setReceiveBufferSize((int)((long)475087767 ^ (long)475087766) << 14);
        serverSocket.setReuseAddress(this.Method531());
        serverSocket.bind(this.Field15583, this.Method6316());
        this.Field15585 = Selector.open();
        this.Field15584.register(this.Field15585, this.Field15584.validOps());
        this.Method524();
        Iterator iterator = this.Field15589.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method6343();
                return (int)((long)188022648 ^ (long)188022649) != 0;
            }
            slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
            slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.start();
        }
    }

    private boolean Method6322() {
        slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2 = this;
        if (this.Field15587 != null) {
            throw new IllegalStateException(this.getClass().getName() + " can only be started once.");
        }
        this.Field15587 = Thread.currentThread();
        if (!this.Field15588.get()) return (int)((long)-994364250 ^ (long)-994364249) != 0;
        return (int)((long)1112024794 ^ (long)1112024794) != 0;
    }

    private void Method528() {
        this.Method523();
        if (this.Field15589 != null) {
            for (slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi : this.Field15589) {
                slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.interrupt();
            }
        }
        if (this.Field15585 != null) {
            this.Field15585.close();
        }
        if (this.Field15584 == null) return;
        this.Field15584.close();
    }

    protected void Method6323(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) throws InterruptedException {
        if (this.Field15593.get() >= ((int)((long)-1727554874 ^ (long)-1727554873) << 1) * this.Field15589.size() + (int)((long)-101127560 ^ (long)-101127559)) {
            return;
        }
        this.Field15593.incrementAndGet();
        this.Field15591.put(this.Method6325());
    }

    protected void Method6324(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) throws InterruptedException {
    }

    public ByteBuffer Method6325() {
        return ByteBuffer.allocate(((int)1059494018L ^ 0x3F269883) << 14);
    }

    protected void Method6326(rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2) throws InterruptedException {
        if (rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5297() == null) {
            rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5298((slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field15589.get(this.Field15592 % this.Field15589.size()));
            this.Field15592 += (int)((long)-2014458153 ^ (long)-2014458154);
        }
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5297().Method4779(rWOxkXahfy879ZWg1QDRw2hroxYTBucF2);
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

    private void Method6329(SelectionKey selectionKey, ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, IOException iOException) {
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA != null) {
            zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA.Method540(((int)-1811828729L ^ 0x9401B1F0) << 1, iOException.getMessage());
            return;
        }
        if (selectionKey == null) return;
        SelectableChannel selectableChannel = selectionKey.channel();
        if (selectableChannel == null) return;
        if (!selectableChannel.isOpen()) return;
        selectableChannel.close();
        this.Field15581.trace("Connection closed because of exception", (Throwable)iOException);
    }

    private void Method6330(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, Exception exception) {
        this.Field15581.error("Shutdown due to fatal error", (Throwable)exception);
        this.Method6342(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, exception);
        String string = exception.getCause() != null ? " caused by " + exception.getCause().getClass().getName() : "";
        String string2 = "Got error on server side: " + exception.getClass().getName() + string;
        this.Method6310((int)959194701L ^ 0x392C264D, string2);
        if (this.Field15589 != null) {
            for (slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi : this.Field15589) {
                slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.interrupt();
            }
        }
        if (this.Field15587 == null) return;
        this.Field15587.interrupt();
    }

    @Override
    public final void Method508(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, String string) {
        this.Method6341(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, string);
    }

    @Override
    public final void Method509(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, ByteBuffer byteBuffer) {
        this.Method6344(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, byteBuffer);
    }

    @Override
    public final void Method510(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2) {
        if (!this.Method6332(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA)) return;
        this.Method6339(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, (QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx)iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2);
    }

    @Override
    public final void Method511(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, int n, String string, boolean bl) {
        this.Field15585.wakeup();
        if (this.Method6331(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA)) {
            this.Method6340(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, n, string, bl);
        }
        this.Method6324(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA);
    }

    protected boolean Method6331(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
        boolean bl;
        int bl2 = (int)938940214L ^ 0x37F71736;
        Collection collection = this.Field15582;
        if (this.Field15582.contains(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA)) {
            bl = this.Field15582.remove(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA);
        } else {
            this.Field15581.trace("Removing connection which is not in the connections collection! Possible no handshake received! {}", (Object)zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA);
        }
        if (!this.Field15588.get()) return bl;
        if (!this.Field15582.isEmpty()) return bl;
        this.Field15587.interrupt();
        return bl;
    }

    protected boolean Method6332(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
        if (!this.Field15588.get()) {
            Collection collection = this.Field15582;
            return this.Field15582.add(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA);
        }
        zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA.Method538((int)((long)1680264502 ^ (long)1680264927));
        return (int)((long)678345446 ^ (long)678345447) != 0;
    }

    @Override
    public final void Method514(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, Exception exception) {
        this.Method6342(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, exception);
    }

    @Override
    public final void Method518(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = (rWOxkXahfy879ZWg1QDRw2hroxYTBucF)zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5291().interestOps((int)1093378679L ^ 0x412BA272);
        this.Field15585.wakeup();
    }

    @Override
    public void Method513(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, int n, String string) {
        this.Method6333(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, n, string);
    }

    @Override
    public void Method512(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, int n, String string, boolean bl) {
        this.Method6334(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, n, string, bl);
    }

    public void Method6333(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, int n, String string) {
    }

    public void Method6334(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, int n, String string, boolean bl) {
    }

    public final void Method6335(C9MSz32V0EKndBPfEqNcwAnfZSHg376Q c9MSz32V0EKndBPfEqNcwAnfZSHg376Q) {
        if (this.Field15594 != null) {
            this.Field15594.Method1317();
        }
        this.Field15594 = c9MSz32V0EKndBPfEqNcwAnfZSHg376Q;
    }

    public final b45Mx8d77l0xSiwkvE7eDz1SRLhprWcR Method6336() {
        return this.Field15594;
    }

    protected boolean Method6337(SelectionKey selectionKey) {
        return ((int)-775000738L ^ 0xD1CE6D5F) != 0;
    }

    private Socket Method6338(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
        rWOxkXahfy879ZWg1QDRw2hroxYTBucF rWOxkXahfy879ZWg1QDRw2hroxYTBucF2 = (rWOxkXahfy879ZWg1QDRw2hroxYTBucF)zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
        return ((SocketChannel)rWOxkXahfy879ZWg1QDRw2hroxYTBucF2.Method5291().channel()).socket();
    }

    @Override
    public InetSocketAddress Method519(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
        return (InetSocketAddress)this.Method6338(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA).getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress Method520(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
        return (InetSocketAddress)this.Method6338(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA).getRemoteSocketAddress();
    }

    public abstract void Method6339(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA var1, QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx var2);

    public abstract void Method6340(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA var1, int var2, String var3, boolean var4);

    public abstract void Method6341(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA var1, String var2);

    public abstract void Method6342(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA var1, Exception var2);

    public abstract void Method6343();

    public void Method6344(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, ByteBuffer byteBuffer) {
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
            ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA = (ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA)object2.next();
            if (zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA == null) continue;
            DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC = zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA.Method555();
            this.Method6352(dkMZhn6HTXSMui7v30mYhxPkVEtejJaC, hashMap, string, byteBuffer);
            zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA.Method545((Collection)hashMap.get(dkMZhn6HTXSMui7v30mYhxPkVEtejJaC));
        }
    }

    private void Method6352(DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC, Map map, String string, ByteBuffer byteBuffer) {
        if (map.containsKey(dkMZhn6HTXSMui7v30mYhxPkVEtejJaC)) return;
        List list = null;
        if (string != null) {
            list = dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4402(string, (boolean)((long)-1736493096 ^ (long)-1736493096));
        }
        if (byteBuffer != null) {
            list = dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4401(byteBuffer, (boolean)((long)-385388900 ^ (long)-385388900));
        }
        if (list == null) return;
        map.put(dkMZhn6HTXSMui7v30mYhxPkVEtejJaC, list);
    }

    static Logger Method6353(slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2) {
        return slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2.Field15581;
    }

    static void Method6354(slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2, ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, Exception exception) {
        slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2.Method6330(zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, exception);
    }

    static void Method6355(slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2, ByteBuffer byteBuffer) throws InterruptedException {
        slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX2.Method6328(byteBuffer);
    }

    private static String Method536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)652843750L ^ 0x26E99AE6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-705525819L ^ 0xD5F2873A);
            int n2 = (int)((long)-1123727694 ^ (long)-1123727703) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)1537709537L ^ 0x5BA786BE) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

