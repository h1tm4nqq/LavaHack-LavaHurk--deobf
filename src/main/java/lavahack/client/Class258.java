/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.io.CloseableKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Ref$ObjectRef
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import com.kisman.cc.util.Class736;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import lavahack.client.Class1796;
import lavahack.client.Class1929;
import lavahack.client.Class42;
import lavahack.client.Class726;
import lavahack.client.Class955;
import lavahack.client.Class985;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/manager/file/ConfigManager$Load;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "init", "", "load", "reader", "Ljava/io/BufferedReader;", "kisman.cc"})
public final class Class258 {
    @NotNull
    private final Class985 Field9158;
    private int Field9159;

    public final void Method1420() throws IOException {
        Class1796.Field16250 = this.Field9158.Method4007();
        Class1796.Method6786();
        if (!Files.exists(Paths.get(this.Field9158.Method4001() + this.Field9158.Method4007() + this.Field9158.Method4000(), new String[0]), new LinkOption[0])) {
            return;
        }
        Closeable closeable = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(this.Field9158.Method4001() + this.Field9158.Method4007() + this.Field9158.Method4000(), new String[0]), new OpenOption[0])));
        boolean bl = false;
        Throwable throwable = null;
        BufferedReader bufferedReader = (BufferedReader)closeable;
        boolean bl2 = false;
        this.Method1421(bufferedReader);
        bufferedReader = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)closeable, (Throwable)throwable);
    }

    /*
     * Unable to fully structure code
     */
    public final void Method1421(@NotNull @NotNull BufferedReader var1_1) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)var1_1, (String)"reader");
        var2_2 = new Ref.ObjectRef();
        block23: while (true) {
            block57: {
                block59: {
                    block62: {
                        block60: {
                            block61: {
                                block58: {
                                    block51: {
                                        block53: {
                                            block56: {
                                                block54: {
                                                    block55: {
                                                        block52: {
                                                            var3_3 = var1_1.readLine();
                                                            var4_5 = false;
                                                            var5_7 = false;
                                                            var6_8 = var3_3;
                                                            var7_9 = false;
                                                            var2_2.element = var6_8;
                                                            if (var3_3 == null) return;
                                                            v0 = (String)var2_2.element;
                                                            var3_3 = v0 != null ? StringsKt.split$default((CharSequence)v0, (String[])new String[]{"="}, (boolean)false, (int)0, (int)6, null) : null;
                                                            v1 = var3_3;
                                                            v2 = var4_4 = v1 != null && (v1 = (String)v1.get(0)) != null ? StringsKt.split$default((CharSequence)v1, (String[])new String[]{"."}, (boolean)false, (int)0, (int)6, null) : null;
                                                            v3 = var5_6 = v2 != null ? (String)v2.get(0) : null;
                                                            if (!Intrinsics.areEqual((Object)var5_6, (Object)this.Field9158.Method4002())) break block51;
                                                            var6_8 = Class1796.Field16241.Field16254.Method1163((String)var4_4.get(1), false, false);
                                                            if (var6_8 == null) continue;
                                                            var7_10 = (String)var4_4.get(2);
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"toggle")) {
                                                                var8_12 = Boolean.parseBoolean((String)var3_3.get(1));
                                                                if (var6_8.Method35() == var8_12) continue;
                                                                var6_8.Method21(var8_12);
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"hold")) {
                                                                var6_8.Field8065 = Boolean.parseBoolean((String)var3_3.get(1));
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"visible")) {
                                                                var6_8.Field8064 = Boolean.parseBoolean((String)var3_3.get(1));
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"key")) {
                                                                var6_8.Method9(Integer.parseInt((String)var3_3.get(1)));
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"button")) {
                                                                var6_8.Method11(Integer.parseInt((String)var3_3.get(1)));
                                                                continue;
                                                            }
                                                            if (Intrinsics.areEqual((Object)var7_10, (Object)"mouseBind")) {
                                                                var6_8.Method13(Boolean.parseBoolean((String)var3_3.get(1)) != false ? Class955.Field12069 : Class955.Field12068);
                                                                continue;
                                                            }
                                                            if (!Intrinsics.areEqual((Object)var7_10, (Object)this.Field9158.Method4003())) continue;
                                                            var8_12 = StringsKt.contains$default((CharSequence)((CharSequence)var4_4.get(3)), (CharSequence)":", (boolean)false, (int)2, null);
                                                            v4 = var9_13 = var4_4.size() > 4 ? StringsKt.contains$default((CharSequence)((CharSequence)var4_4.get(4)), (CharSequence)":", (boolean)false, (int)2, null) : false;
                                                            if (var8_12) break block52;
                                                            var10_14 = Class1796.Field16241.Field16258.Method7573((Class42)var6_8, (String)var4_4.get(3), true);
                                                            if (var10_14 == null) continue;
                                                            break block53;
                                                        }
                                                        var10_14 = var8_12 != false ? Class1796.Field16241.Field16258.Method7573((Class42)var6_8, (String)StringsKt.split$default((CharSequence)((CharSequence)var4_4.get(3)), (String[])new String[]{":"}, (boolean)false, (int)0, (int)6, null).get(0), true) : Class1796.Field16241.Field16258.Method7573((Class42)var6_8, (String)var4_4.get(3), true);
                                                        if (var10_14 == null || var10_14.Method382()) continue;
                                                        v5 = var11_15 = var8_12 != false ? StringsKt.split$default((CharSequence)((CharSequence)var4_4.get(3)), (String[])new String[]{":"}, (boolean)false, (int)0, (int)6, null) : StringsKt.split$default((CharSequence)((CharSequence)var4_4.get(4)), (String[])new String[]{":"}, (boolean)false, (int)0, (int)6, null);
                                                        if (!var10_14.Method386()) break block54;
                                                        var12_16 = (String)var11_15.get(1);
                                                        switch (var12_16.hashCode()) {
                                                            case -1377687758: {
                                                                if (!var12_16.equals("button")) continue block23;
                                                                break;
                                                            }
                                                            case 585824898: {
                                                                if (!var12_16.equals("mouseBind")) continue block23;
                                                                break block55;
                                                            }
                                                            case 106079: {
                                                                if (!var12_16.equals("key")) continue block23;
                                                                var10_14.Method9(Integer.parseInt((String)var3_3.get(1)));
                                                                continue block23;
                                                            }
                                                        }
                                                        var10_14.Method11(Integer.parseInt((String)var3_3.get(1)));
                                                        continue;
                                                    }
                                                    var10_14.Method13(Boolean.parseBoolean((String)var3_3.get(1)) != false ? Class955.Field12069 : Class955.Field12068);
                                                    continue;
                                                }
                                                if (!var10_14.Method385() || !var10_14.Field8115.containsKey(var12_16 = (String)var11_15.get(0))) continue;
                                                var13_17 = (String)var11_15.get(1);
                                                switch (var13_17.hashCode()) {
                                                    case -1377687758: {
                                                        if (!var13_17.equals("button")) ** break;
                                                        break;
                                                    }
                                                    case 585824898: {
                                                        if (!var13_17.equals("mouseBind")) ** break;
                                                        break block56;
                                                    }
                                                    case 106079: {
                                                        if (!var13_17.equals("key")) ** break;
                                                        v6 = (Class1929)var10_14.Field8115.get(var12_16);
                                                        if (v6 != null) {
                                                            v6.Method9(Integer.parseInt((String)var3_3.get(1)));
                                                            v7 = Unit.INSTANCE;
                                                            continue block23;
                                                        }
                                                        v7 = null;
                                                        ** break;
                                                    }
                                                }
                                                v8 = (Class1929)var10_14.Field8115.get(var12_16);
                                                if (v8 != null) {
                                                    v8.Method11(Integer.parseInt((String)var3_3.get(1)));
                                                    v9 = Unit.INSTANCE;
                                                    continue;
                                                }
                                                v9 = null;
                                                ** break;
                                            }
                                            v10 = (Class1929)var10_14.Field8115.get(var12_16);
                                            if (v10 != null) {
                                                v10.Method13(Boolean.parseBoolean((String)var3_3.get(1)) != false ? Class955.Field12069 : Class955.Field12068);
                                                v11 = Unit.INSTANCE;
                                                continue;
                                            }
                                            v11 = null;
                                            ** break;
lbl115:
                                            // 7 sources

                                            continue;
                                        }
                                        if (var10_14.Method382()) continue;
                                        if (var10_14.Method386()) {
                                            var10_14.Method366(Boolean.parseBoolean((String)var3_3.get(1)));
                                        }
                                        if (var10_14.Method385() && var10_14.Field8115.containsKey(StringsKt.split$default((CharSequence)((CharSequence)var3_3.get(1)), (String[])new String[]{"\""}, (boolean)false, (int)0, (int)6, null).get(1))) {
                                            var10_14.Method360((String)StringsKt.split$default((CharSequence)((CharSequence)var3_3.get(1)), (String[])new String[]{"\""}, (boolean)false, (int)0, (int)6, null).get(1));
                                        }
                                        if (var10_14.Method387()) {
                                            var10_14.Method370(Double.parseDouble((String)var3_3.get(1)));
                                        }
                                        if (!var10_14.Method389()) continue;
                                        v12 = (String)var3_3.get(1);
                                        v13 = var10_14.Method339();
                                        Intrinsics.checkExpressionValueIsNotNull((Object)v13, (String)"setting.colour");
                                        var10_14.Method340(Class736.Field11115.Method6140(v12, v13));
                                        continue;
                                    }
                                    if (!Intrinsics.areEqual((Object)var5_6, (Object)this.Field9158.Method4004())) break block57;
                                    var6_8 = Class1796.Field16241.Field16257.Method1523((String)var4_4.get(1));
                                    if (var6_8 == null) continue;
                                    var7_11 = (String)var4_4.get(2);
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"toggle")) {
                                        var8_12 = Boolean.parseBoolean((String)var3_3.get(1));
                                        if (var6_8.Method35() == var8_12) continue;
                                        var6_8.Method21(var8_12);
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"hold")) {
                                        var6_8.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E = Boolean.parseBoolean((String)var3_3.get(1));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"visible")) {
                                        var6_8.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro = Boolean.parseBoolean((String)var3_3.get(1));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"key")) {
                                        var6_8.Method9(Integer.parseInt((String)var3_3.get(1)));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"button")) {
                                        var6_8.Method11(Integer.parseInt((String)var3_3.get(1)));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"mouseBind")) {
                                        var6_8.Method13(Boolean.parseBoolean((String)var3_3.get(1)) != false ? Class955.Field12069 : Class955.Field12068);
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"x")) {
                                        var6_8.Method271(Double.parseDouble((String)var3_3.get(1)));
                                        continue;
                                    }
                                    if (Intrinsics.areEqual((Object)var7_11, (Object)"y")) {
                                        var6_8.Method272(Double.parseDouble((String)var3_3.get(1)));
                                        continue;
                                    }
                                    if (!Intrinsics.areEqual((Object)var7_11, (Object)this.Field9158.Method4003())) continue;
                                    var8_12 = StringsKt.contains$default((CharSequence)((CharSequence)var4_4.get(3)), (CharSequence)":", (boolean)false, (int)2, null);
                                    v14 = var9_13 = var4_4.size() > 4 ? StringsKt.contains$default((CharSequence)((CharSequence)var4_4.get(4)), (CharSequence)":", (boolean)false, (int)2, null) : false;
                                    if (var8_12) break block58;
                                    var10_14 = Class1796.Field16241.Field16258.Method7573((Class42)var6_8, (String)var4_4.get(3), true);
                                    if (var10_14 == null) continue;
                                    break block59;
                                }
                                var10_14 = var8_12 != false ? Class1796.Field16241.Field16258.Method7573((Class42)var6_8, (String)StringsKt.split$default((CharSequence)((CharSequence)var4_4.get(3)), (String[])new String[]{":"}, (boolean)false, (int)0, (int)6, null).get(0), true) : Class1796.Field16241.Field16258.Method7573((Class42)var6_8, (String)var4_4.get(3), true);
                                if (var10_14 == null || var10_14.Method382()) continue;
                                v15 = var11_15 = var8_12 != false ? StringsKt.split$default((CharSequence)((CharSequence)var4_4.get(3)), (String[])new String[]{":"}, (boolean)false, (int)0, (int)6, null) : StringsKt.split$default((CharSequence)((CharSequence)var4_4.get(4)), (String[])new String[]{":"}, (boolean)false, (int)0, (int)6, null);
                                if (!var10_14.Method386()) break block60;
                                var12_16 = (String)var11_15.get(1);
                                switch (var12_16.hashCode()) {
                                    case -1377687758: {
                                        if (!var12_16.equals("button")) continue block23;
                                        break;
                                    }
                                    case 585824898: {
                                        if (!var12_16.equals("mouseBind")) continue block23;
                                        break block61;
                                    }
                                    case 106079: {
                                        if (!var12_16.equals("key")) continue block23;
                                        var10_14.Method9(Integer.parseInt((String)var3_3.get(1)));
                                        continue block23;
                                    }
                                }
                                var10_14.Method11(Integer.parseInt((String)var3_3.get(1)));
                                continue;
                            }
                            var10_14.Method13(Boolean.parseBoolean((String)var3_3.get(1)) != false ? Class955.Field12069 : Class955.Field12068);
                            continue;
                        }
                        if (!var10_14.Method385() || !var10_14.Field8115.containsKey(var12_16 = (String)var11_15.get(0))) continue;
                        var13_17 = (String)var11_15.get(1);
                        switch (var13_17.hashCode()) {
                            case -1377687758: {
                                if (!var13_17.equals("button")) ** break;
                                break;
                            }
                            case 585824898: {
                                if (!var13_17.equals("mouseBind")) ** break;
                                break block62;
                            }
                            case 106079: {
                                if (!var13_17.equals("key")) ** break;
                                v16 = (Class1929)var10_14.Field8115.get(var12_16);
                                if (v16 != null) {
                                    v16.Method9(Integer.parseInt((String)var3_3.get(1)));
                                    v17 = Unit.INSTANCE;
                                    continue block23;
                                }
                                v17 = null;
                                ** break;
                            }
                        }
                        v18 = (Class1929)var10_14.Field8115.get(var12_16);
                        if (v18 != null) {
                            v18.Method11(Integer.parseInt((String)var3_3.get(1)));
                            v19 = Unit.INSTANCE;
                            continue;
                        }
                        v19 = null;
                        ** break;
                    }
                    v20 = (Class1929)var10_14.Field8115.get(var12_16);
                    if (v20 != null) {
                        v20.Method13(Boolean.parseBoolean((String)var3_3.get(1)) != false ? Class955.Field12069 : Class955.Field12068);
                        v21 = Unit.INSTANCE;
                        continue;
                    }
                    v21 = null;
                    ** break;
lbl241:
                    // 7 sources

                    continue;
                }
                if (var10_14.Method382()) continue;
                if (var10_14.Method386()) {
                    var10_14.Method366(Boolean.parseBoolean((String)var3_3.get(1)));
                }
                if (var10_14.Method385()) {
                    var10_14.Method360((String)StringsKt.split$default((CharSequence)((CharSequence)var3_3.get(1)), (String[])new String[]{"\""}, (boolean)false, (int)0, (int)6, null).get(1));
                }
                if (var10_14.Method387()) {
                    var10_14.Method370(Double.parseDouble((String)var3_3.get(1)));
                }
                if (!var10_14.Method389()) continue;
                v22 = (String)var3_3.get(1);
                v23 = var10_14.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)v23, (String)"setting.colour");
                var10_14.Method340(Class736.Field11115.Method6140(v22, v23));
                continue;
            }
            if (Intrinsics.areEqual((Object)var5_6, (Object)this.Field9158.Method4005())) {
                var6_8 = (String)var4_4.get(1);
                switch (var6_8.hashCode()) {
                    case 94842723: {
                        if (!var6_8.equals("color")) continue block23;
                        v24 = Class1796.Field16241.Field16263.Method6673().Method5387();
                        v25 = (String)var3_3.get(1);
                        v26 = Class1796.Field16241.Field16263.Method6673().Method5387().Method339();
                        Intrinsics.checkExpressionValueIsNotNull((Object)v26, (String)"Kisman.instance.halqHudG\u2026Frame.colorSetting.colour");
                        v24.Method340(Class736.Field11115.Method6140(v25, v26));
                        continue block23;
                    }
                }
                continue;
            }
            if (!Intrinsics.areEqual((Object)var5_6, (Object)this.Field9158.Method4006())) continue;
            Class726.Field11086.Method3040((String)StringsKt.split$default((CharSequence)((CharSequence)var3_3.get(1)), (String[])new String[]{"\""}, (boolean)false, (int)0, (int)6, null).get(1));
        }
    }

    @NotNull
    @NotNull
    public final Class985 Method1422() {
        return this.Field9158;
    }

    public Class258(@NotNull @NotNull Class985 class985) {
        Intrinsics.checkParameterIsNotNull((Object)class985, (String)"config");
        this.Field9158 = class985;
    }

    private static String Method1423(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 26;
            cArray2[n] = (char)(cArray[n] ^ (0x672 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

