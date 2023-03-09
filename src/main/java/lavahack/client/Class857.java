/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1205;
import lavahack.client.Class686;

public class Class857 {
    public final Class686 Field11615;
    public final String Field11616;
    public final int Field11617;
    public final int Field11618;
    public final int Field11619;
    public Class1205 Field11620 = Class1205.Field13466;
    public int Field11621 = 0;
    public int Field11622 = 0;
    public int Field11623 = 0;
    public int Field11624 = 0;
    public int Field11625 = 0;
    private String Field11626 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class857(Class686 class686, String string) {
        this.Field11615 = class686;
        this.Field11616 = string;
        this.Field11617 = class686.Method2891();
        this.Field11618 = class686.Method2893();
        this.Field11619 = class686.Method2892();
    }

    public boolean Method3605(int n, int n2, int n3) {
        if (n != this.Field11623) return true;
        if (n2 != this.Field11624) return true;
        if (n3 != this.Field11625) return true;
        this.Method3606(Class1205.Field13468);
        this.Field11623 += 16;
        if (this.Field11623 < this.Field11617) return true;
        this.Field11623 = 0;
        this.Field11624 += 16;
        if (this.Field11624 < this.Field11618) return true;
        this.Field11624 = 0;
        this.Field11625 += 16;
        if (this.Field11625 < this.Field11619) return true;
        this.Method3606(Class1205.Field13470);
        return false;
    }

    public void Method3606(Class1205 class1205) {
        this.Field11620 = class1205;
        this.Field11621 = 0;
        this.Field11622 = 0;
    }
}

