/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.NG0k51FfRanQAbgOBpE8PUjB7va0iaQF
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class2005;
import lavahack.client.NG0k51FfRanQAbgOBpE8PUjB7va0iaQF;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "", "displaySlot", "", "windowClickSlot", "(Ljava/lang/String;III)V", "getDisplaySlot", "()I", "getWindowClickSlot", "Slot1", "Slot2", "Slot3", "Slot4", "Slot5", "Slot6", "Slot7", "Slot8", "Slot9", "Companion", "kisman.cc"})
public final class Class1051
extends Enum {
    public static final /* enum */ Class1051 Field12648;
    public static final /* enum */ Class1051 Field12649;
    public static final /* enum */ Class1051 Field12650;
    public static final /* enum */ Class1051 Field12651;
    public static final /* enum */ Class1051 Field12652;
    public static final /* enum */ Class1051 Field12653;
    public static final /* enum */ Class1051 Field12654;
    public static final /* enum */ Class1051 Field12655;
    public static final /* enum */ Class1051 Field12656;
    private static final Class1051[] Field12657;
    private final int Field12658;
    private final int Field12659;
    @NotNull
    private static final Class1051 Field12660;
    public static final Class2005 Field12661;
    private String Field12662 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1051[] class1051Array = new Class1051[9];
        Class1051[] class1051Array2 = class1051Array;
        class1051Array[0] = Field12648 = new Class1051("Slot1", 0, 1, 36);
        class1051Array[1] = Field12649 = new Class1051("Slot2", 1, 2, 37);
        class1051Array[2] = Field12650 = new Class1051("Slot3", 2, 3, 38);
        class1051Array[3] = Field12651 = new Class1051("Slot4", 3, 4, 39);
        class1051Array[4] = Field12652 = new Class1051("Slot5", 4, 5, 40);
        class1051Array[5] = Field12653 = new Class1051("Slot6", 5, 6, 41);
        class1051Array[6] = Field12654 = new Class1051("Slot7", 6, 7, 42);
        class1051Array[7] = Field12655 = new Class1051("Slot8", 7, 8, 43);
        class1051Array[8] = Field12656 = new Class1051("Slot9", 8, 9, 44);
        Field12657 = class1051Array;
        Field12661 = new Class2005(null);
        Field12660 = Field12648;
    }

    public final int Method4289() {
        return this.Field12658;
    }

    public final int Method4290() {
        return this.Field12659;
    }

    /*
     * WARNING - void declaration
     */
    private Class1051() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field12658 = var3_1;
        this.Field12659 = var4_2;
    }

    public static final /* bridge */ /* synthetic */ Class1051 Method4291() {
        return Field12660;
    }

    public static Class1051[] values() {
        return (NG0k51FfRanQAbgOBpE8PUjB7va0iaQF[])Field12657.clone();
    }

    public static Class1051 valueOf(String string) {
        return Enum.valueOf(Class1051.class, string);
    }

    private static String Method4292(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 57;
            cArray2[n] = (char)(cArray[n] ^ (0x43F3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

