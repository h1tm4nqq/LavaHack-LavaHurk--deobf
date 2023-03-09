/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class1803;
import lavahack.client.Class1876;
import lavahack.client.Class753;

public class Class1039 {
    public static final Color Field12569 = new Color(80, 80, 80, 240);
    public static final Color Field12570 = new Color(20, 20, 20, 150);
    public static final Color Field12571 = new Color(10, 10, 10, 255);
    public static final Color Field12572 = new Color(20, 20, 20, 220);
    public static final Color Field12573 = Color.white;
    private String Field12574;
    private int Field12575;
    private int Field12576;
    private int Field12577;
    private int Field12578;
    private int Field12579;
    private boolean Field12580;
    private int Field12581;
    private int Field12582;
    private Class1803 Field12583;
    private String Field12584 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1039(String string, int n, int n2, int n3, int n4) {
        this.Field12574 = string;
        this.Field12575 = n;
        this.Field12576 = n2;
        this.Field12577 = n3;
        this.Field12578 = n4;
    }

    public void Method4230(Class1876 class1876, int n, int n2) {
        int n3 = class1876.Method2450(this.Field12574);
        int n4 = n3 / 4;
        this.Field12579 = n4 * 2 + n3;
        class1876.Method2445(this.Field12575, this.Field12576, this.Field12577, this.Field12578, Field12572);
        class1876.Method2445(this.Field12575, this.Field12576, this.Field12577, this.Field12579, Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((double)(this.Field12575 / 2), (double)(this.Field12576 / 2), (double)((this.Field12575 + this.Field12577) / 2), (double)((this.Field12576 + this.Field12579) / 2), Field12569, null.Field11788.Method367());
        }
        class1876.Method2448(this.Field12575 + this.Field12577 / 2 - class1876.Method2449(this.Field12574) / 2, this.Field12576 + n4, this.Field12574, null.Field11804.Method365() ? class1876.Method2456() : Field12573);
        if (this.Field12583 == null) return;
        if (this.Field12583.Method679()) {
            this.Field12583.Method680(false);
        }
        this.Field12583.Method672(this.Field12575);
        this.Field12583.Method674(this.Field12576 + this.Field12579);
        this.Field12583.Method676(this.Field12577);
        this.Field12583.Method678(this.Field12578 - this.Field12579);
        this.Field12583.Method668();
    }

    public void Method4231(Class1876 class1876) {
        if (this.Field12583 == null) return;
        this.Field12583.Method669();
    }

    public void Method4232(int n, int n2, int n3) {
        if (this.Field12583 != null) {
            this.Field12583.Method684(n, n2, n3, false);
        }
        if (n != 0) return;
        if (n2 < this.Field12575) return;
        if (n3 < this.Field12576) return;
        if (n2 > this.Field12575 + this.Field12577) return;
        if (n3 > this.Field12576 + this.Field12579) return;
        this.Field12580 = true;
        this.Field12581 = this.Field12575 - n2;
        this.Field12582 = this.Field12576 - n3;
    }

    private void Method4233(int n, int n2) {
        if (!this.Field12580) return;
        this.Field12575 = n + this.Field12581;
        this.Field12576 = n2 + this.Field12582;
    }

    public void Method4234(int n, int n2, int n3) {
        if (this.Field12583 != null) {
            this.Field12583.Method682(n, n2, n3, false);
        }
        if (n != 0) return;
        this.Field12580 = false;
    }

    public void Method4235(int n, int n2) {
        if (this.Field12583 != null) {
            this.Field12583.Method683(n, n2, false);
        }
        this.Method4233(n, n2);
    }

    public Class1803 Method4236() {
        return this.Field12583;
    }

    public void Method4237(Class1803 class1803) {
        this.Field12583 = class1803;
    }

    public void Method4238(int n, char c) {
        if (this.Field12583 == null) return;
        this.Field12583.Method681(n, c);
    }

    public void Method4239(int n) {
        if (this.Field12583 == null) return;
        this.Field12583.Method685(n);
    }

    public int Method4240() {
        return this.Field12575;
    }

    public void Method4241(int n) {
        this.Field12575 = n;
    }

    public int Method4242() {
        return this.Field12576;
    }

    public void Method4243(int n) {
        this.Field12576 = n;
    }

    public int Method4244() {
        return this.Field12577;
    }

    public void Method4245(int n) {
        this.Field12577 = n;
    }

    public int Method4246() {
        return this.Field12578;
    }

    public void Method4247(int n) {
        this.Field12578 = n;
    }

    public String Method4248() {
        return this.Field12574;
    }

    public void Method4249(String string) {
        this.Field12574 = string;
    }
}

