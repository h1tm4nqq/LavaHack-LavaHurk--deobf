/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import lavahack.loader.Class11;
import lavahack.loader.Class1654;

class Class1849
implements Class11 {
    final Class1654 Field16525;
    private String Field16526 = "TheKisDevs & LavaHack Development owns you";

    Class1849(Class1654 class1654) {
        this.Field16525 = class1654;
    }

    @Override
    public InetAddress Method141(URI uRI) throws UnknownHostException {
        return InetAddress.getByName(uRI.getHost());
    }
}

