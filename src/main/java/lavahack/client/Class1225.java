//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;
import java.io.*;
import java.nio.channels.*;

@Deprecated
public class Class1225 implements Class1608
{
    private final ByteChannel Field13564;
    private String Field13565 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Deprecated
    @Deprecated
    public Class1225(final ByteChannel field13564) {
        this.Field13564 = field13564;
    }
    
    @Deprecated
    @Deprecated
    public Class1225(final Class1608 field13564) {
        this.Field13564 = field13564;
    }
    
    @Override
    public int read(final ByteBuffer byteBuffer) throws IOException {
        return this.Field13564.read(byteBuffer);
    }
    
    @Override
    public boolean isOpen() {
        return this.Field13564.isOpen();
    }
    
    @Override
    public void close() throws IOException {
        this.Field13564.close();
    }
    
    @Override
    public int write(final ByteBuffer byteBuffer) throws IOException {
        return this.Field13564.write(byteBuffer);
    }
    
    @Override
    public boolean Method2482() {
        return this.Field13564 instanceof Class1608 && ((Class1608)this.Field13564).Method2482();
    }
    
    @Override
    public void Method2483() throws IOException {
        if (this.Field13564 instanceof Class1608) {
            ((Class1608)this.Field13564).Method2483();
        }
    }
    
    @Override
    public boolean Method2484() {
        return this.Field13564 instanceof Class1608 && ((Class1608)this.Field13564).Method2484();
    }
    
    @Override
    public int Method2485(final ByteBuffer byteBuffer) throws IOException {
        return (this.Field13564 instanceof Class1608) ? ((Class1608)this.Field13564).Method2485(byteBuffer) : 0;
    }
    
    @Override
    public boolean Method2486() {
        if (this.Field13564 instanceof SocketChannel) {
            return ((SocketChannel)this.Field13564).isBlocking();
        }
        return this.Field13564 instanceof Class1608 && ((Class1608)this.Field13564).Method2486();
    }
}
