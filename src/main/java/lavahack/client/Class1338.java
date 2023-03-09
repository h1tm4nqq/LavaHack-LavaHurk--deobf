/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1796;
import lavahack.client.Class2130;
import lavahack.client.Class42;
import lavahack.client.Class97;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\n\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassModuleManager;", "", "()V", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "getModules", "()Ljava/util/ArrayList;", "getModulesByCategory", "category", "Lcom/kisman/cc/features/module/Category;", "Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;", "init", "", "kisman.cc"})
public final class Class1338 {
    @NotNull
    private static final ArrayList Field14115;
    public static final Class1338 Field14116;
    private String Field14117 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final ArrayList Method5389() {
        return Field14115;
    }

    public final void Method5390() {
        Iterator iterator = Class1796.Field16241.Field16254.Field8854.iterator();
        while (iterator.hasNext()) {
            Class42 class42;
            Class42 class422 = class42 = (Class42)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)class422, (String)"module");
            if (!class422.Method30()) continue;
            Field14115.add(class42);
        }
    }

    @NotNull
    @NotNull
    public final ArrayList Method5391(@NotNull @NotNull Class97 class97) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class97), (String)"category");
        ArrayList<Class42> arrayList = new ArrayList<Class42>();
        Iterator iterator = Field14115.iterator();
        while (iterator.hasNext()) {
            Class42 class42;
            Class42 class422 = class42 = (Class42)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)class422, (String)"module");
            if (class422.Method41() != class97) continue;
            arrayList.add(class42);
        }
        return arrayList;
    }

    @NotNull
    @NotNull
    public final ArrayList Method5392(@NotNull @NotNull Class2130 class2130) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class2130), (String)"category");
        return this.Method5391(class2130.Method7667());
    }

    private Class1338() {
    }

    static {
        Class1338 class1338;
        Field14116 = class1338 = new Class1338();
        Field14115 = new ArrayList();
    }

    private static String Method5393(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 67;
            cArray2[n] = (char)(cArray[n] ^ (0x12AF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

