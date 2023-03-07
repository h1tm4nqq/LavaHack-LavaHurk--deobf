/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.List;
import kotlin.Metadata;
import lavahack.client.mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0005H&j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/util/enums/ShadersObjectTypes;", "", "(Ljava/lang/String;I)V", "list", "", "T", "Entity", "TileEntity", "Hand", "kisman.cc"})
public abstract class mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV
extends Enum {
    public static final /* enum */ mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV Field15965;
    public static final /* enum */ mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV Field15966;
    public static final /* enum */ mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV Field15967;
    private static final mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV[] Field15968;
    private int Field15969;

    static {
        mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV[] mdrs0DGV9HccJLJr4qfxJmgQK03c0dVVArray = new mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV[(int)-788356250L ^ 0xD102A365];
        mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV[] mdrs0DGV9HccJLJr4qfxJmgQK03c0dVVArray2 = mdrs0DGV9HccJLJr4qfxJmgQK03c0dVVArray;
        mdrs0DGV9HccJLJr4qfxJmgQK03c0dVVArray[(int)((long)-197918357 ^ (long)-197918357)] = Field15965 = new mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Entity", (int)-1422272629L ^ 0xAB39D78B);
        mdrs0DGV9HccJLJr4qfxJmgQK03c0dVVArray[(int)((long)1894421585 ^ (long)1894421584)] = Field15966 = new mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV("TileEntity", (int)1887521815L ^ 0x70814C16);
        mdrs0DGV9HccJLJr4qfxJmgQK03c0dVVArray[((int)433058267L ^ 0x19CFF1DA) << 1] = Field15967 = new mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Hand", (int)((long)-1476948919 ^ (long)-1476948920) << 1);
        Field15968 = mdrs0DGV9HccJLJr4qfxJmgQK03c0dVVArray;
    }

    @Nullable
    @Nullable
    public abstract List Method1305();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV[] values() {
        return (mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV[])Field15968.clone();
    }

    public static mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV valueOf(String string) {
        return Enum.valueOf(mdrs0DGV9HccJLJr4qfxJmgQK03c0dVV.class, string);
    }

    private static String Method1306(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)199551292 ^ (long)199551292);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-912367289 ^ (long)-912367176);
            int n2 = (int)((long)549669523 ^ (long)549669620) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1167020474L ^ 0xBA7088E9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

