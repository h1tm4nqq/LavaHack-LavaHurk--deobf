/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Function;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class qqwgmQNjGBIKbNv7q3eANcDuXzI37V3l {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16431;
    private final Function Field16432;
    private final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field16433;
    private int Field16434;

    public qqwgmQNjGBIKbNv7q3eANcDuXzI37V3l(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, Function function) {
        this.Field16431 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        this.Field16432 = function;
        this.Field16433 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Field8085;
    }

    public qqwgmQNjGBIKbNv7q3eANcDuXzI37V3l Method6876(Object object, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD ... qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray) {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD[] qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray;
        int n = qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray2.length;
        int n2 = (int)((long)-356098687 ^ (long)-356098687);
        while (n2 < n) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray2[n2];
            this.Field16433.Method23(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method313(() -> this.Method6880(object)));
            ++n2;
        }
        return this;
    }

    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6877() {
        return this.Field16431;
    }

    public Function Method6878() {
        return this.Field16432;
    }

    public WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Method6879() {
        return this.Field16433;
    }

    private Boolean Method6880(Object object) {
        return this.Field16432.apply(this.Field16431).equals(object);
    }
}

