/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u001a\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/features/catlua/mapping/TSrgUtil$Method;", "", "obf", "", "obfSig", "deobf", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeobf", "()Ljava/lang/String;", "setDeobf", "(Ljava/lang/String;)V", "getObf", "setObf", "getObfSig", "setObfSig", "component1", "component2", "component3", "copy", "equals", "", "other", "getDeobfSig", "classNames", "", "hashCode", "", "toString", "kisman.cc"})
public final class SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV {
    @NotNull
    private String Field11522;
    @NotNull
    private String Field11523;
    @NotNull
    private String Field11524;
    private String Field11525 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public String toString() {
        return this.Field11522 + (((int)1116152989L ^ 0x4287249C) << 5) + this.Field11523 + (((int)-483090866L ^ 0xE3349E4F) << 5) + this.Field11524;
    }

    @NotNull
    @NotNull
    public final String Method3537(@NotNull @NotNull Map map) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)map, (String)"classNames");
        int n2 = (int)-2036972804L ^ 0x869642FC;
        List list = new ArrayList();
        String string = "";
        int n3 = (int)1320926555L ^ 0x4EBBBD5B;
        CharSequence charSequence = this.Field11523;
        int n4 = (int)((long)-654198650 ^ (long)-654198650);
        CharSequence charSequence2 = charSequence;
        block4: for (int i = (int)792050055L ^ 0x2F35B987; i < charSequence2.length(); ++i) {
            char c;
            char c2 = c = charSequence2.charAt(i);
            n = (int)1412861905L ^ 0x54368FD1;
            switch (c2) {
                case 'L': {
                    string = "";
                    n3 = (int)((long)463153587 ^ (long)463153586);
                    continue block4;
                }
                case ';': {
                    list.add(string);
                    n3 = (int)836823892L ^ 0x31E0EB54;
                    continue block4;
                }
                default: {
                    continue block4;
                }
            }
        }
        charSequence = this.Field11523;
        Iterable iterable = list;
        int n5 = (int)1572362929L ^ 0x5DB85AB1;
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            Object t = iterator.next();
            String string2 = (String)t;
            n = (int)-693001261L ^ 0xD6B1A3D3;
            if (!map.containsKey(string2)) continue;
            String string3 = ((int)((long)687410765 ^ (long)687410782) << 2) + string2 + (char)((int)1608950065L ^ 0x5FE6A10A);
            StringBuilder stringBuilder = new StringBuilder().append(((int)681830330L ^ 0x28A3E7A9) << 2);
            Object v = map.get(string2);
            if (v == null) {
                Intrinsics.throwNpe();
            }
            charSequence = StringsKt.replace$default((String)charSequence, (String)string3, (String)stringBuilder.append((String)v).append((char)((int)1437504379L ^ 0x55AE9340)).toString(), ((int)1037194283L ^ 0x3DD2542B) != 0, (int)(((int)1738801526L ^ 0x67A40177) << 2), null);
        }
        return charSequence;
    }

    @NotNull
    @NotNull
    public final String Method3538() {
        return this.Field11522;
    }

    public final void Method3539(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field11522 = string;
    }

    @NotNull
    @NotNull
    public final String Method3540() {
        return this.Field11523;
    }

    public final void Method3541(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field11523 = string;
    }

    @NotNull
    @NotNull
    public final String Method3542() {
        return this.Field11524;
    }

    public final void Method3543(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field11524 = string;
    }

    public SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull String string3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"obf");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"obfSig");
        Intrinsics.checkParameterIsNotNull((Object)string3, (String)"deobf");
        this.Field11522 = string;
        this.Field11523 = string2;
        this.Field11524 = string3;
    }

    @NotNull
    @NotNull
    public final String Method3544() {
        return this.Field11522;
    }

    @NotNull
    @NotNull
    public final String Method3545() {
        return this.Field11523;
    }

    @NotNull
    @NotNull
    public final String Method3546() {
        return this.Field11524;
    }

    @NotNull
    @NotNull
    public final SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method3547(@NotNull @NotNull String string, @NotNull @NotNull String string2, @NotNull @NotNull String string3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"obf");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"obfSig");
        Intrinsics.checkParameterIsNotNull((Object)string3, (String)"deobf");
        return new SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(string, string2, string3);
    }

    @NotNull
    @NotNull
    public static SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method3548(SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, String string, String string2, String string3, int n, Object object) {
        if ((n & (int)((long)1543374552 ^ (long)1543374553)) != 0) {
            string = sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field11522;
        }
        if ((n & (int)((long)732671267 ^ (long)732671266) << 1) != 0) {
            string2 = sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field11523;
        }
        if ((n & (int)((long)711769587 ^ (long)711769586) << 2) == 0) return sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method3547(string, string2, string3);
        string3 = sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field11524;
        return sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method3547(string, string2, string3);
    }

    public int hashCode() {
        int n;
        String string = this.Field11522;
        String string2 = this.Field11523;
        int n2 = ((string != null ? string.hashCode() : (int)((long)-88387168 ^ (long)-88387168)) * ((int)-2045950735L ^ 0x860D44EE) + (string2 != null ? string2.hashCode() : (int)((long)-1612142485 ^ (long)-1612142485))) * (int)((long)1233873835 ^ (long)1233873844);
        String string3 = this.Field11524;
        if (string3 != null) {
            n = string3.hashCode();
            return n2 + n;
        }
        n = (int)861584014L ^ 0x335ABA8E;
        return n2 + n;
    }

    public boolean equals(@Nullable @Nullable Object object) {
        if (this == object) return ((int)-1606628794L ^ 0xA03CCA47) != 0;
        if (!(object instanceof SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)) return (int)((long)1041877097 ^ (long)1041877097) != 0;
        SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = (SFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)object;
        if (!Intrinsics.areEqual((Object)this.Field11522, (Object)sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field11522)) return (int)((long)1041877097 ^ (long)1041877097) != 0;
        if (!Intrinsics.areEqual((Object)this.Field11523, (Object)sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field11523)) return (int)((long)1041877097 ^ (long)1041877097) != 0;
        if (!Intrinsics.areEqual((Object)this.Field11524, (Object)sFfmOouuBkOMM7mhUarZdRlXN36cNqDl$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field11524)) return (int)((long)1041877097 ^ (long)1041877097) != 0;
        return ((int)-1606628794L ^ 0xA03CCA47) != 0;
    }

    private static String Method3549(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-701632246 ^ (long)-701632246);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)214506124 ^ (long)214506099);
            int n2 = ((int)-237164113L ^ 0xF1DD2988) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-819208235 ^ (long)-819203378) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

