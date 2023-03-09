/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1318;
import lavahack.client.Class1319;
import lavahack.client.Class1321;
import lavahack.client.Class1322;
import lavahack.client.Class1776;
import lavahack.client.rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/enums/BlockESPBlocks;", "", "handler", "Lcom/kisman/cc/util/interfaces/Validable;", "Lnet/minecraft/util/math/BlockPos;", "(Ljava/lang/String;ILcom/kisman/cc/util/interfaces/Validable;)V", "getHandler", "()Lcom/kisman/cc/util/interfaces/Validable;", "Web", "NetherPortal", "EndPortal", "Burrow", "kisman.cc"})
public final class Class1456
extends Enum {
    public static final /* enum */ Class1456 Field14811;
    public static final /* enum */ Class1456 Field14812;
    public static final /* enum */ Class1456 Field14813;
    public static final /* enum */ Class1456 Field14814;
    private static final Class1456[] Field14815;
    @NotNull
    private final Class1776 Field14816;
    private int Field14817;

    static {
        Class1456[] class1456Array = new Class1456[4];
        Class1456[] class1456Array2 = class1456Array;
        class1456Array[0] = Field14811 = new Class1456("Web", 0, (Class1776)new Class1319());
        class1456Array[1] = Field14812 = new Class1456("NetherPortal", 1, (Class1776)new Class1318());
        class1456Array[2] = Field14813 = new Class1456("EndPortal", 2, (Class1776)new Class1322());
        class1456Array[3] = Field14814 = new Class1456("Burrow", 3, (Class1776)new Class1321());
        Field14815 = class1456Array;
    }

    @NotNull
    @NotNull
    public final Class1776 Method5813() {
        return this.Field14816;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1456() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field14816 = var3_1;
    }

    public static Class1456[] values() {
        return (rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89[])Field14815.clone();
    }

    public static Class1456 valueOf(String string) {
        return Enum.valueOf(Class1456.class, string);
    }

    private static String Method5814(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 181;
            cArray2[n] = (char)(cArray[n] ^ (0x62C6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

