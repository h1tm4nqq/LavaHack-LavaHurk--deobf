/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class164;
import lavahack.client.Class1928;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/client/DevelopmentHelper;", "Lcom/kisman/cc/features/module/Module;", "()V", "displaySlots", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getDisplaySlots", "()Lcom/kisman/cc/settings/Setting;", "slotType", "getSlotType", "Companion", "kisman.cc"})
public final class Class472
extends Class42 {
    private final Class44 Field9967 = this.Method23(new Class44("Display Slots", (Class42)this, false));
    private final Class44 Field9968 = this.Method23(new Class44("Slot Type", (Class42)this, Class1928.Field16945));
    @Nullable
    private static Class472 Field9969;
    public static final Class164 Field9970;
    private String Field9971 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final Class44 Method2210() {
        return this.Field9967;
    }

    public final Class44 Method2211() {
        return this.Field9968;
    }

    public Class472() {
        super("DevelopmentHelper", "Helps with lavahack development.", Class97.Field8339);
        Field9969 = this;
    }

    static {
        Field9970 = new Class164(null);
    }

    public static final Class472 Method2212() {
        return Field9969;
    }

    public static final void Method2213(Class472 class472) {
        Field9969 = class472;
    }

    @Nullable
    @Nullable
    public static final Class472 Method2214() {
        Class164 class164 = Field9970;
        return Field9969;
    }

    public static final void Method2215(@Nullable @Nullable Class472 class472) {
        Class164 class164 = Field9970;
        Field9969 = class472;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 190;
            cArray2[n] = (char)(cArray[n] ^ (0x795B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

