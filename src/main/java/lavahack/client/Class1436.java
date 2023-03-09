/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import lavahack.client.Class168;
import lavahack.client.Class628;

class Class1436
implements Class628 {
    final Class168 Field14727;
    private String Field14728 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1436(Class168 class168) {
        this.Field14727 = class168;
    }

    @Override
    public InetAddress Method2724(URI uRI) throws UnknownHostException {
        return InetAddress.getByName(uRI.getHost());
    }
}

