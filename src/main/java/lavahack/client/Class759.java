/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.io.CloseableKt
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class736;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1249;
import lavahack.client.Class1796;
import lavahack.client.Class1929;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class695;
import lavahack.client.Class955;
import lavahack.client.Class985;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\t\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rJ(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/util/manager/file/ConfigManager$ModuleSave;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "fileCheck", "", "init", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "save", "writer", "Ljava/io/BufferedWriter;", "kisman.cc"})
public final class Class759 {
    @NotNull
    private final Class985 Field11214;
    private String Field11215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method3141(@NotNull @NotNull ArrayList arrayList) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)arrayList, (String)"modules");
        Class1796.Method6786();
        this.Method3143();
        Closeable closeable = new BufferedWriter(new FileWriter(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[0]).toFile()));
        boolean bl = false;
        Throwable throwable = null;
        BufferedWriter bufferedWriter = (BufferedWriter)closeable;
        boolean bl2 = false;
        this.Method3142(bufferedWriter, arrayList);
        bufferedWriter = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)closeable, (Throwable)throwable);
    }

    /*
     * Unable to fully structure code
     */
    private final void Method3142(BufferedWriter var1_1, ArrayList var2_2) throws IOException {
        var4_3 = var2_2.iterator();
        block0: while (true) {
            if (var4_3.hasNext() == false) return;
            var3_4 = (Class42)var4_3.next();
            var5_5 = var3_4 instanceof Class1249 != false ? this.Field11214.Method4004() : this.Field11214.Method4002();
            v0 = new StringBuilder().append(var5_5).append('.');
            v1 = var3_4;
            Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"module");
            var1_1.write(v0.append(v1.Method40()).append(".toggle=").append(var3_4.Method35()).toString());
            var1_1.newLine();
            var1_1.write(var5_5 + '.' + var3_4.Method40() + ".hold=" + var3_4.Field8065);
            var1_1.newLine();
            var1_1.write(var5_5 + '.' + var3_4.Method40() + ".visible=" + var3_4.Method51());
            var1_1.newLine();
            var1_1.write(var5_5 + '.' + var3_4.Method40() + ".key=" + var3_4.Method8());
            var1_1.newLine();
            var1_1.write(var5_5 + '.' + var3_4.Method40() + ".button=" + var3_4.Method10());
            var1_1.newLine();
            var1_1.write(var5_5 + '.' + var3_4.Method40() + ".mouseBind=" + (var3_4.Method12() == Class955.Field12069));
            var1_1.newLine();
            if (var3_4 instanceof Class1249) {
                var1_1.write(var5_5 + '.' + ((Class1249)var3_4).Method40() + ".x=" + ((Class1249)var3_4).Method267());
                var1_1.newLine();
                var1_1.write(var5_5 + '.' + ((Class1249)var3_4).Method40() + ".y=" + ((Class1249)var3_4).Method268());
                var1_1.newLine();
            }
            if (Class1796.Field16241.Field16258.Method7571(var3_4) == null) continue;
            var7_7 = Class1796.Field16241.Field16258.Method7571(var3_4).iterator();
            while (true) {
                if (var7_7.hasNext()) ** break;
                continue block0;
                var6_6 = (Class44)var7_7.next();
                if (var6_6 == null || var6_6.Method382()) continue;
                if (var6_6.Method386()) {
                    var1_1.write(var5_5 + '.' + var3_4.Method40() + '.' + this.Field11214.Method4003() + '.' + var6_6.Method356() + '=' + var6_6.Method365());
                    var1_1.newLine();
                    if (var6_6.Method8() != -1) {
                        var1_1.write(var5_5 + '.' + var3_4.Method40() + '.' + this.Field11214.Method4003() + '.' + var6_6.Method356() + ":key=" + var6_6.Method8());
                        var1_1.newLine();
                    }
                    if (var6_6.Method10() != -1) {
                        var1_1.write(var5_5 + '.' + var3_4.Method40() + '.' + this.Field11214.Method4003() + '.' + var6_6.Method356() + ":button=" + var6_6.Method8());
                        var1_1.newLine();
                    }
                    if (Class695.Field10935.Method7141(var6_6)) {
                        var1_1.write(var5_5 + '.' + var3_4.Method40() + '.' + this.Field11214.Method4003() + '.' + var6_6.Method356() + ":mouseBind=" + (var6_6.Method12() == Class955.Field12069));
                        var1_1.newLine();
                    }
                }
                if (var6_6.Method385()) {
                    var1_1.write(var5_5 + '.' + var3_4.Method40() + '.' + this.Field11214.Method4003() + '.' + var6_6.Method356() + "=\"" + var6_6.Method359() + '\"');
                    var1_1.newLine();
                    for (String var8_8 : var6_6.Field8115.keySet()) {
                        v2 = new StringBuilder().append(var5_5).append('.').append(var3_4.Method40()).append('.').append(this.Field11214.Method4003()).append('.').append(var6_6.Method356()).append('.').append(var8_8).append(":key=");
                        v3 = var6_6.Field8115.get(var8_8);
                        if (v3 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v2.append(((Class1929)v3).Method8()).toString());
                        var1_1.newLine();
                        v4 = new StringBuilder().append(var5_5).append('.').append(var3_4.Method40()).append('.').append(this.Field11214.Method4003()).append('.').append(var6_6.Method356()).append('.').append(var8_8).append(":mouse=");
                        v5 = var6_6.Field8115.get(var8_8);
                        if (v5 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v4.append(((Class1929)v5).Method10()).toString());
                        var1_1.newLine();
                        var1_1.write(var5_5 + '.' + var3_4.Method40() + '.' + this.Field11214.Method4003() + '.' + var6_6.Method356() + '.' + var8_8 + ":mouseBind=" + (var6_6.Method12() == Class955.Field12069));
                        var1_1.newLine();
                    }
                }
                if (var6_6.Method387()) {
                    var1_1.write(var5_5 + '.' + var3_4.Method40() + '.' + this.Field11214.Method4003() + '.' + var6_6.Method356() + '=' + var6_6.Method367());
                    var1_1.newLine();
                }
                if (!var6_6.Method389()) continue;
                v6 = new StringBuilder().append(var5_5).append('.').append(var3_4.Method40()).append('.').append(this.Field11214.Method4003()).append('.').append(var6_6.Method356()).append('=');
                v7 = var6_6.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"setting.colour");
                var1_1.write(v6.append(Class736.Field11115.Method6139(v7)).toString());
                var1_1.newLine();
            }
            break;
        }
    }

    private final void Method3143() throws IOException {
        if (Files.exists(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[0]), new LinkOption[0])) {
            new File(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000()).delete();
            return;
        }
        Files.createFile(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[0]), new FileAttribute[0]);
    }

    @NotNull
    @NotNull
    public final Class985 Method3144() {
        return this.Field11214;
    }

    public Class759(@NotNull @NotNull Class985 class985) {
        Intrinsics.checkParameterIsNotNull((Object)class985, (String)"config");
        this.Field11214 = class985;
    }

    private static String Method3145(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 95;
            cArray2[n] = (char)(cArray[n] ^ (0x1671 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

