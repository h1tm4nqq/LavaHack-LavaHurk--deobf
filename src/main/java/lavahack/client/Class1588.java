/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import lavahack.client.Class1302;
import lavahack.client.Class1728;
import lavahack.client.Class1878;
import lavahack.client.Class2129;
import lavahack.client.Class630;

public interface Class1588
extends Class1878 {
    public Class1302 Method1314(Class630 var1, Class2129 var2);

    public Class1302 Method1315(Class630 var1, List var2);

    public ByteChannel Method1316(SocketChannel var1, SelectionKey var2) throws IOException;

    public void Method1317();

    @Override
    default public Class1728 Method1313(Class630 class630, List list) {
        return this.Method1315(class630, list);
    }

    @Override
    default public Class1728 Method1312(Class630 class630, Class2129 class2129) {
        return this.Method1314(class630, class2129);
    }
}

