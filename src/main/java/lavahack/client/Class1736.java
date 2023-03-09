/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV
 */
package lavahack.client;

import java.util.List;
import kotlin.Metadata;
import lavahack.client.Class1029;
import lavahack.client.Class1068;
import lavahack.client.Class236;
import lavahack.client.mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0005H&j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "", "(Ljava/lang/String;I)V", "list", "", "T", "Entity", "TileEntity", "Hand", "kisman.cc"})
public abstract class Class1736
extends Enum {
    public static final /* enum */ Class1736 Field15965;
    public static final /* enum */ Class1736 Field15966;
    public static final /* enum */ Class1736 Field15967;
    private static final Class1736[] Field15968;
    private int Field15969;

    static {
        Class1736[] class1736Array = new Class1736[3];
        Class1736[] class1736Array2 = class1736Array;
        class1736Array[0] = Field15965 = new Class1029("Entity", 0);
        class1736Array[1] = Field15966 = new Class1068("TileEntity", 1);
        class1736Array[2] = Field15967 = new Class236("Hand", 2);
        Field15968 = class1736Array;
    }

    @Nullable
    @Nullable
    public abstract List Method1305();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1736() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Class1736() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static Class1736[] values() {
        return (mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV[])Field15968.clone();
    }

    public static Class1736 valueOf(String string) {
        return Enum.valueOf(Class1736.class, string);
    }

    private static String Method1306(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 206;
            cArray2[n] = (char)(cArray[n] ^ (0x26AF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

