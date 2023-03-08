//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.nio.channels.*;
import java.io.*;

public class Class1298 implements Class1588
{
    private String Field13931 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public Class1302 Method1314(final Class630 class630, final Class2129 class631) {
        return new Class1302(class630, class631);
    }
    
    @Override
    public Class1302 Method1315(final Class630 class630, final List list) {
        return new Class1302(class630, list);
    }
    
    public SocketChannel Method5266(final SocketChannel socketChannel, final SelectionKey selectionKey) {
        return socketChannel;
    }
    
    @Override
    public void Method1317() {
    }
    
    @Override
    public ByteChannel Method1316(final SocketChannel socketChannel, final SelectionKey selectionKey) throws IOException {
        return this.Method5266(socketChannel, selectionKey);
    }
    
    @Override
    public Class1728 Method1313(final Class630 class630, final List list) {
        return this.Method1315(class630, list);
    }
    
    @Override
    public Class1728 Method1312(final Class630 class630, final Class2129 class631) {
        return this.Method1314(class630, class631);
    }
}
