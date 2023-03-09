/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1703;
import lavahack.client.Class1707;
import lavahack.client.Class1708;
import lavahack.client.Class1710;
import lavahack.client.Class1712;
import lavahack.client.Class1714;
import lavahack.client.Class1717;
import lavahack.client.Class1718;
import lavahack.client.Class1719;
import lavahack.client.Class1752;
import lavahack.client.aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/features/module/movement/speed/SpeedModes;", "", "mode", "Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "(Ljava/lang/String;ILcom/kisman/cc/features/module/movement/speed/ISpeedMode;)V", "getMode", "()Lcom/kisman/cc/features/module/movement/speed/ISpeedMode;", "Strafe", "YPort", "StrafeNew", "MatrixBhop", "MatrixStrafe", "Bhop", "Strafe2", "Matrix", "Companion", "kisman.cc"})
public final class Class961
extends Enum {
    public static final /* enum */ Class961 Field12092;
    public static final /* enum */ Class961 Field12093;
    public static final /* enum */ Class961 Field12094;
    public static final /* enum */ Class961 Field12095;
    public static final /* enum */ Class961 Field12096;
    public static final /* enum */ Class961 Field12097;
    public static final /* enum */ Class961 Field12098;
    public static final /* enum */ Class961 Field12099;
    private static final Class961[] Field12100;
    @NotNull
    private final Class1703 Field12101;
    public static final Class1752 Field12102;
    private String Field12103 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class961[] class961Array = new Class961[8];
        Class961[] class961Array2 = class961Array;
        class961Array[0] = Field12092 = new Class961("Strafe", 0, (Class1703)new Class1718());
        class961Array[1] = Field12093 = new Class961("YPort", 1, (Class1703)new Class1719());
        class961Array[2] = Field12094 = new Class961("StrafeNew", 2, (Class1703)new Class1714());
        class961Array[3] = Field12095 = new Class961("MatrixBhop", 3, (Class1703)new Class1717());
        class961Array[4] = Field12096 = new Class961("MatrixStrafe", 4, (Class1703)new Class1710());
        class961Array[5] = Field12097 = new Class961("Bhop", 5, (Class1703)new Class1712());
        class961Array[6] = Field12098 = new Class961("Strafe2", 6, (Class1703)new Class1707());
        class961Array[7] = Field12099 = new Class961("Matrix", 7, (Class1703)new Class1708());
        Field12100 = class961Array;
        Field12102 = new Class1752(null);
    }

    @NotNull
    @NotNull
    public final Class1703 Method3949() {
        return this.Field12101;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class961() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field12101 = var3_1;
    }

    public static Class961[] values() {
        return (aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8[])Field12100.clone();
    }

    public static Class961 valueOf(String string) {
        return Enum.valueOf(Class961.class, string);
    }

    private static String Method3950(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 149;
            cArray2[n] = (char)(cArray[n] ^ (0x7060 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

