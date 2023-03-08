//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.nio.channels.*;
import java.io.*;

public interface Class1588 extends Class1878
{
    Class1302 Method1314(final Class630 p0, final Class2129 p1);
    
    Class1302 Method1315(final Class630 p0, final List p1);
    
    ByteChannel Method1316(final SocketChannel p0, final SelectionKey p1) throws IOException;
    
    void Method1317();
    
    default Class1728 Method1313(final Class630 class630, final List list) {
        return (Class1728)this.Method1315(class630, list);
    }
    
    default Class1728 Method1312(final Class630 class630, final Class2129 class631) {
        return (Class1728)this.Method1314(class630, class631);
    }
}
