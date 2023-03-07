/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.concurrent.Callable;
import lavahack.client.hZzopKeYTsWI2MGkShyc038fYPumbIKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ma9zo6UmHG7noLaYe920e2UQ4kD2ON6Z;
import lavahack.client.stu696jqc7sGMdra5CxkSDiY4C6u6Est;

public class hZzopKeYTsWI2MGkShyc038fYPumbIKF
implements Runnable {
    private final transient ma9zo6UmHG7noLaYe920e2UQ4kD2ON6Z Field10485;
    private transient boolean Field10486;
    private transient boolean Field10487;
    private int Field10488;

    private hZzopKeYTsWI2MGkShyc038fYPumbIKF(ma9zo6UmHG7noLaYe920e2UQ4kD2ON6Z ma9zo6UmHG7noLaYe920e2UQ4kD2ON6Z2) {
        this.Field10485 = ma9zo6UmHG7noLaYe920e2UQ4kD2ON6Z2;
    }

    @Override
    public void run() {
        if (this.Field10486) {
            throw new IllegalStateException("Already running");
        }
        this.Field10486 = (int)-1974701745L ^ 0x8A4C714E;
        this.Field10485.Field13385.start();
    }

    public hZzopKeYTsWI2MGkShyc038fYPumbIKF Method2535() {
        if (this.Field10486) {
            throw new IllegalStateException("Already running");
        }
        this.Field10486 = (int)((long)1302210113 ^ (long)1302210112);
        this.Field10485.Field13385.start();
        return this;
    }

    public stu696jqc7sGMdra5CxkSDiY4C6u6Est Method2536() {
        if (!this.Field10486) return new stu696jqc7sGMdra5CxkSDiY4C6u6Est(null, (boolean)((long)338817608 ^ (long)338817609));
        if (this.Field10487) {
            return new stu696jqc7sGMdra5CxkSDiY4C6u6Est(null, (boolean)((long)338817608 ^ (long)338817609));
        }
        if (!this.Field10485.Field13387) {
            this.Field10485.Field13385.stop();
            this.Field10486 = (int)((long)-1912585893 ^ (long)-1912585893);
            return new stu696jqc7sGMdra5CxkSDiY4C6u6Est(null, (boolean)((long)1256444992 ^ (long)1256444993));
        }
        this.Field10486 = (int)-179539344L ^ 0xF54C7270;
        return new stu696jqc7sGMdra5CxkSDiY4C6u6Est(this.Field10485.Field13386, ((int)-596790000L ^ 0xDC6DB510) != 0);
    }

    public void Method2537() {
        if (this.Field10487) {
            throw new IllegalStateException("Already paused");
        }
        this.Field10487 = (int)((long)-626241039 ^ (long)-626241040);
        this.Field10485.Field13385.suspend();
    }

    public void Method2538() {
        if (!this.Field10487) {
            throw new IllegalStateException("Not paused");
        }
        this.Field10487 = (int)900489362L ^ 0x35AC6092;
        this.Field10485.Field13385.resume();
    }

    public Object Method2539() {
        if (!this.Field10486) throw new IllegalStateException("No running");
        if (this.Field10487) {
            throw new IllegalStateException("No running");
        }
        hZzopKeYTsWI2MGkShyc038fYPumbIKF.Method2546(this.Field10485.Field13385::join);
        this.Field10486 = (int)((long)-1506542287 ^ (long)-1506542287);
        return this.Field10485.Field13386;
    }

    public Object Method2540() {
        if (!this.Field10486) throw new IllegalStateException("No running");
        if (this.Field10487) {
            throw new IllegalStateException("No running");
        }
        while (!this.Field10485.Field13387) {
        }
        this.Field10486 = (int)834318214L ^ 0x31BAAF86;
        return this.Field10485.Field13386;
    }

    public boolean Method2541() {
        return this.Field10485.Field13387;
    }

    public boolean Method2542() {
        return this.Field10486;
    }

    public boolean Method2543() {
        return this.Field10487;
    }

    public static hZzopKeYTsWI2MGkShyc038fYPumbIKF Method2544(Callable callable) {
        return new hZzopKeYTsWI2MGkShyc038fYPumbIKF(new ma9zo6UmHG7noLaYe920e2UQ4kD2ON6Z(callable));
    }

    private static Object Method2545(Callable callable) {
        callable.call();
        return null;
    }

    private static void Method2546(hZzopKeYTsWI2MGkShyc038fYPumbIKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi hZzopKeYTsWI2MGkShyc038fYPumbIKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        hZzopKeYTsWI2MGkShyc038fYPumbIKF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7342();
    }

    private static String Method2547(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-499001527L ^ 0xE241D749;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-81314015L ^ 0xFB273FDE);
            int n2 = (int)-1014683497L ^ 0xC3852820;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1555511906 ^ (long)1555512511) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

