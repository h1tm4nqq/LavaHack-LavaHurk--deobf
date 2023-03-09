/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Ref$ObjectRef
 */
package lavahack.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bR\u0011\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/net/URLReader;", "", "url", "", "(Ljava/lang/String;)V", "Ljava/net/URL;", "(Ljava/net/URL;)V", "getUrl", "()Ljava/net/URL;", "get", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "kisman.cc"})
public final class Class1890 {
    @NotNull
    private final URL Field16706;
    private int Field16707;

    @NotNull
    @NotNull
    public final ArrayList Method6999() {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.Field16706.openStream()));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        while (true) {
            Object object = bufferedReader.readLine();
            boolean bl = false;
            boolean bl2 = false;
            String string = object;
            boolean bl3 = false;
            Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"it");
            objectRef.element = objectRef.element;
            if (object == null) return arrayList;
            object = arrayList;
            String string2 = (String)objectRef.element;
            bl2 = false;
            object.add(string2);
        }
    }

    @NotNull
    @NotNull
    public final URL Method7000() {
        return this.Field16706;
    }

    public Class1890(@NotNull @NotNull URL uRL) {
        Intrinsics.checkParameterIsNotNull((Object)uRL, (String)"url");
        this.Field16706 = uRL;
    }

    public Class1890(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"url");
        this(new URL(string));
    }

    private static String Method7001(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 73;
            cArray2[n] = (char)(cArray[n] ^ (0x5C73 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

