/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  lavahack.client.FJU7WrfQ7bSUF3WFz5GrfCi4CQDN4X0P
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class642;
import lavahack.client.Class643;
import lavahack.client.Class770;
import lavahack.client.Class843;
import lavahack.client.FJU7WrfQ7bSUF3WFz5GrfCi4CQDN4X0P;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/enums/PhaseModes;", "", "handler", "Lcom/kisman/cc/util/enums/IPhaseMode;", "(Ljava/lang/String;ILcom/kisman/cc/util/enums/IPhaseMode;)V", "update", "", "phase", "Lcom/kisman/cc/features/module/movement/Phase;", "Pearl", "PearlBypass", "kisman.cc"})
public final class Class484
extends Enum {
    public static final /* enum */ Class484 Field10019;
    public static final /* enum */ Class484 Field10020;
    private static final Class484[] Field10021;
    private final Class770 Field10022;
    private String Field10023 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class484[] class484Array = new Class484[2];
        Class484[] class484Array2 = class484Array;
        class484Array[0] = Field10019 = new Class484("Pearl", 0, (Class770)new Class642());
        class484Array[1] = Field10020 = new Class484("PearlBypass", 1, (Class770)new Class643());
        Field10021 = class484Array;
    }

    public final void Method2245(@NotNull @NotNull Class843 class843) {
        Intrinsics.checkParameterIsNotNull((Object)class843, (String)"phase");
        this.Field10022.Method2773(class843);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class484() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10022 = var3_1;
    }

    public static Class484[] values() {
        return (FJU7WrfQ7bSUF3WFz5GrfCi4CQDN4X0P[])Field10021.clone();
    }

    public static Class484 valueOf(String string) {
        return Enum.valueOf(Class484.class, string);
    }

    private static String Method2246(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 16;
            cArray2[n] = (char)(cArray[n] ^ (0x347F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

