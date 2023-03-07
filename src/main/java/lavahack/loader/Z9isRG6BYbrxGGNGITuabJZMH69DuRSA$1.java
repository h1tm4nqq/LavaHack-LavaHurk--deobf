/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import lavahack.loader.Z9isRG6BYbrxGGNGITuabJZMH69DuRSA;
import lavahack.loader.ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ;

class Z9isRG6BYbrxGGNGITuabJZMH69DuRSA$1
implements ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ {
    final Z9isRG6BYbrxGGNGITuabJZMH69DuRSA Field16525;
    private String Field16526 = "TheKisDevs & LavaHack Development owns you";

    Z9isRG6BYbrxGGNGITuabJZMH69DuRSA$1(Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA) {
        this.Field16525 = z9isRG6BYbrxGGNGITuabJZMH69DuRSA;
    }

    @Override
    public InetAddress Method141(URI uRI) throws UnknownHostException {
        return InetAddress.getByName(uRI.getHost());
    }
}

