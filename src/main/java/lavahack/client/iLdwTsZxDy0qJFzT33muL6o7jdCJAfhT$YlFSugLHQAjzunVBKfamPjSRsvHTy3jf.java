/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001b"}, d2={"Lcom/kisman/cc/features/catlua/mapping/MappingsGenerator$FieldMapping;", "", "deobfField", "", "deobfClass", "clientObfTotal", "serverObfTotal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientObfTotal", "()Ljava/lang/String;", "setClientObfTotal", "(Ljava/lang/String;)V", "getDeobfClass", "getDeobfField", "getServerObfTotal", "setServerObfTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kisman.cc"})
final class iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    @NotNull
    private final String Field16289;
    @NotNull
    private final String Field16290;
    @Nullable
    private String Field16291;
    @Nullable
    private String Field16292;
    private int Field16293;

    @NotNull
    @NotNull
    public String toString() {
        return this.Field16290 + (((int)507063277L ^ 0x1E392BFA) << 1) + this.Field16289 + " (client: " + this.Field16291 + ") (server: " + this.Field16292 + (char)((int)-830497654L ^ 0xCE7F9CA3);
    }

    @NotNull
    @NotNull
    public final String Method6796() {
        return this.Field16289;
    }

    @NotNull
    @NotNull
    public final String Method6797() {
        return this.Field16290;
    }

    @Nullable
    @Nullable
    public final String Method6798() {
        return this.Field16291;
    }

    public final void Method6799(@Nullable @Nullable String string) {
        this.Field16291 = string;
    }

    @Nullable
    @Nullable
    public final String Method6800() {
        return this.Field16292;
    }

    public final void Method6801(@Nullable @Nullable String string) {
        this.Field16292 = string;
    }

    public iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(@NotNull @NotNull String string, @NotNull @NotNull String string2, @Nullable @Nullable String string3, @Nullable @Nullable String string4) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"deobfField");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"deobfClass");
        this.Field16289 = string;
        this.Field16290 = string2;
        this.Field16291 = string3;
        this.Field16292 = string4;
    }

    public iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(String string, String string2, String string3, String string4, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & ((int)-1332211397L ^ 0xB098113A) << 2) != 0) {
            string3 = null;
        }
        if ((n & (int)((long)62974834 ^ (long)62974835) << 3) != 0) {
            string4 = null;
        }
        this(string, string2, string3, string4);
    }

    @NotNull
    @NotNull
    public final String Method6802() {
        return this.Field16289;
    }

    @NotNull
    @NotNull
    public final String Method6803() {
        return this.Field16290;
    }

    @Nullable
    @Nullable
    public final String Method6804() {
        return this.Field16291;
    }

    @Nullable
    @Nullable
    public final String Method6805() {
        return this.Field16292;
    }

    @NotNull
    @NotNull
    public final iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Method6806(@NotNull @NotNull String string, @NotNull @NotNull String string2, @Nullable @Nullable String string3, @Nullable @Nullable String string4) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"deobfField");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"deobfClass");
        return new iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(string, string2, string3, string4);
    }

    @NotNull
    @NotNull
    public static iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Method6807(iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, String string, String string2, String string3, String string4, int n, Object object) {
        if ((n & ((int)1778329849L ^ 0x69FF28F8)) != 0) {
            string = iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16289;
        }
        if ((n & (int)((long)1717383002 ^ (long)1717383003) << 1) != 0) {
            string2 = iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16290;
        }
        if ((n & ((int)-2087702311L ^ 0x839030D8) << 2) != 0) {
            string3 = iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16291;
        }
        if ((n & ((int)447837476L ^ 0x1AB17525) << 3) == 0) return iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method6806(string, string2, string3, string4);
        string4 = iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16292;
        return iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method6806(string, string2, string3, string4);
    }

    public int hashCode() {
        int n;
        String string = this.Field16289;
        String string2 = this.Field16290;
        String string3 = this.Field16291;
        int n2 = (((string != null ? string.hashCode() : (int)((long)160600976 ^ (long)160600976)) * ((int)-311214658L ^ 0xED733DA1) + (string2 != null ? string2.hashCode() : (int)1381502839L ^ 0x52580F77)) * (int)((long)-1628593390 ^ (long)-1628593395) + (string3 != null ? string3.hashCode() : (int)1052603343L ^ 0x3EBD73CF)) * (int)((long)1163645110 ^ (long)1163645097);
        String string4 = this.Field16292;
        if (string4 != null) {
            n = string4.hashCode();
            return n2 + n;
        }
        n = (int)-671018112L ^ 0xD8011380;
        return n2 + n;
    }

    public boolean equals(@Nullable @Nullable Object object) {
        if (this == object) return (int)((long)1781467135 ^ (long)1781467134) != 0;
        if (!(object instanceof iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)) return ((int)-585917629L ^ 0xDD139B43) != 0;
        iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = (iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object;
        if (!Intrinsics.areEqual((Object)this.Field16289, (Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16289)) return ((int)-585917629L ^ 0xDD139B43) != 0;
        if (!Intrinsics.areEqual((Object)this.Field16290, (Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16290)) return ((int)-585917629L ^ 0xDD139B43) != 0;
        if (!Intrinsics.areEqual((Object)this.Field16291, (Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16291)) return ((int)-585917629L ^ 0xDD139B43) != 0;
        if (!Intrinsics.areEqual((Object)this.Field16292, (Object)iLdwTsZxDy0qJFzT33muL6o7jdCJAfhT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16292)) return ((int)-585917629L ^ 0xDD139B43) != 0;
        return (int)((long)1781467135 ^ (long)1781467134) != 0;
    }

    private static String Method6808(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)853665966 ^ (long)853665966);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-204326723 ^ (long)-204326846);
            int n2 = ((int)-2013846451L ^ 0x87F7240E) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-551851840L ^ 0xDF1B037B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

