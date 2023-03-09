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
import lavahack.client.Class726;
import lavahack.client.Class955;
import lavahack.client.Class97;
import lavahack.client.Class985;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/util/manager/file/ConfigManager$Save;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "fileCheck", "", "init", "save", "writer", "Ljava/io/BufferedWriter;", "kisman.cc"})
public final class Class2143 {
    @NotNull
    private final Class985 Field17806;
    private String Field17807 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method7717() throws IOException {
        Class1796.Method6786();
        this.Method7719();
        Closeable closeable = new BufferedWriter(new FileWriter(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[0]).toFile()));
        boolean bl = false;
        Throwable throwable = null;
        BufferedWriter bufferedWriter = (BufferedWriter)closeable;
        boolean bl2 = false;
        this.Method7718(bufferedWriter);
        bufferedWriter = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)closeable, (Throwable)throwable);
    }

    /*
     * Unable to fully structure code
     */
    private final void Method7718(BufferedWriter var1_1) throws IOException {
        var3_2 = Class1796.Field16241.Field16254.Field8854.iterator();
        while (true) {
            if (!var3_2.hasNext()) break;
            var2_4 = (Class42)var3_2.next();
            v0 = var2_4;
            Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"module");
            if (v0.Method41() == Class97.Field8347) continue;
            var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + ".toggle=" + var2_4.Method35());
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + ".hold=" + var2_4.Field8065);
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + ".visible=" + var2_4.Method51());
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + ".key=" + var2_4.Method8());
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + ".button=" + var2_4.Method10());
            var1_1.newLine();
            var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + ".mouseBind=" + (var2_4.Method12() == Class955.Field12069));
            var1_1.newLine();
            if (Class1796.Field16241.Field16258.Method7571((Class42)var2_4) == null) continue;
            var5_6 = Class1796.Field16241.Field16258.Method7571((Class42)var2_4).iterator();
            while (true) {
                if (!var5_6.hasNext()) ** break;
                var4_5 = (Class44)var5_6.next();
                if (var4_5 == null || var4_5.Method382()) continue;
                if (var4_5.Method386()) {
                    var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + '=' + var4_5.Method365());
                    var1_1.newLine();
                    if (var4_5.Method8() != -1) {
                        var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + ":key=" + var4_5.Method8());
                        var1_1.newLine();
                    }
                    if (var4_5.Method10() != -1) {
                        var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + ":button=" + var4_5.Method8());
                        var1_1.newLine();
                    }
                    if (Class695.Field10935.Method7141(var4_5)) {
                        var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + ":mouseBind=" + (var4_5.Method12() == Class955.Field12069));
                        var1_1.newLine();
                    }
                }
                if (var4_5.Method385()) {
                    var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + "=\"" + var4_5.Method359() + '\"');
                    var1_1.newLine();
                    for (String var6_7 : var4_5.Field8115.keySet()) {
                        v1 = new StringBuilder().append(this.Field17806.Method4002()).append('.').append(var2_4.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(var4_5.Method356()).append('.').append(var6_7).append(":key=");
                        v2 = var4_5.Field8115.get(var6_7);
                        if (v2 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v1.append(((Class1929)v2).Method8()).toString());
                        var1_1.newLine();
                        v3 = new StringBuilder().append(this.Field17806.Method4002()).append('.').append(var2_4.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(var4_5.Method356()).append('.').append(var6_7).append(":mouse=");
                        v4 = var4_5.Field8115.get(var6_7);
                        if (v4 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v3.append(((Class1929)v4).Method10()).toString());
                        var1_1.newLine();
                        var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + '.' + var6_7 + ":mouseBind=" + (var4_5.Method12() == Class955.Field12069));
                        var1_1.newLine();
                    }
                }
                if (var4_5.Method387()) {
                    var1_1.write(this.Field17806.Method4002() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + '=' + var4_5.Method367());
                    var1_1.newLine();
                }
                if (!var4_5.Method389()) continue;
                v5 = new StringBuilder().append(this.Field17806.Method4002()).append('.').append(var2_4.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(var4_5.Method356()).append('=');
                v6 = var4_5.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"setting.colour");
                var1_1.write(v5.append(Class736.Field11115.Method6139(v6)).toString());
                var1_1.newLine();
            }
            break;
        }
        var3_2 = Class1796.Field16241.Field16257.Field9235.iterator();
        while (true) {
            if (var3_2.hasNext()) {
                var2_4 = (Class1249)var3_2.next();
                v7 = new StringBuilder().append(this.Field17806.Method4004()).append('.');
                v8 = var2_4;
                Intrinsics.checkExpressionValueIsNotNull((Object)v8, (String)"hud");
                var1_1.write(v7.append(v8.Method40()).append(".toggle=").append(var2_4.Method35()).toString());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + ".hold=" + var2_4.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E);
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + ".visible=" + var2_4.Method51());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + ".key=" + var2_4.Method33());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + ".key=" + var2_4.Method8());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + ".button=" + var2_4.Method10());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + ".mouseBind=" + (var2_4.Method12() == Class955.Field12069));
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + ".x=" + var2_4.Method267());
                var1_1.newLine();
                var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + ".y=" + var2_4.Method268());
                var1_1.newLine();
                if (Class1796.Field16241.Field16258.Method7571((Class42)var2_4) == null) continue;
            } else {
                var1_1.write(this.Field17806.Method4005() + ".color=" + Class736.Field11115.Method6139(Class1796.Field16241.Field16263.Method6671()));
                var1_1.newLine();
                v9 = Class726.Field11086;
                Intrinsics.checkExpressionValueIsNotNull((Object)v9, (String)"FriendManager.instance");
                v10 = v9.Method3039();
                Intrinsics.checkExpressionValueIsNotNull((Object)v10, (String)"FriendManager.instance.friends");
                var2_4 = v10;
                var3_3 = false;
                if (var2_4.isEmpty() != false) return;
                return;
            }
            var5_6 = Class1796.Field16241.Field16258.Method7571((Class42)var2_4).iterator();
            while (true) {
                if (!var5_6.hasNext()) ** break;
                var4_5 = (Class44)var5_6.next();
                if (var4_5 == null || var4_5.Method382()) continue;
                if (var4_5.Method386()) {
                    var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + '=' + var4_5.Method365());
                    var1_1.newLine();
                    if (var4_5.Method8() != -1) {
                        var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + ":key=" + var4_5.Method8());
                        var1_1.newLine();
                    }
                    if (var4_5.Method10() != -1) {
                        var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + ":button=" + var4_5.Method10());
                        var1_1.newLine();
                    }
                    if (Class695.Field10935.Method7141(var4_5)) {
                        var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + ":mouseBind=" + (var4_5.Method12() == Class955.Field12069));
                        var1_1.newLine();
                    }
                }
                if (var4_5.Method385()) {
                    var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + "=\"" + var4_5.Method359() + '\"');
                    var1_1.newLine();
                    for (String var6_7 : var4_5.Field8115.keySet()) {
                        v11 = new StringBuilder().append(this.Field17806.Method4004()).append('.').append(var2_4.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(var4_5.Method356()).append('.').append(var6_7).append(":key=");
                        v12 = var4_5.Field8115.get(var6_7);
                        if (v12 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v11.append(((Class1929)v12).Method8()).toString());
                        var1_1.newLine();
                        v13 = new StringBuilder().append(this.Field17806.Method4004()).append('.').append(var2_4.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(var4_5.Method356()).append('.').append(var6_7).append(":mouse=");
                        v14 = var4_5.Field8115.get(var6_7);
                        if (v14 == null) {
                            Intrinsics.throwNpe();
                        }
                        var1_1.write(v13.append(((Class1929)v14).Method10()).toString());
                        var1_1.newLine();
                        var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + '.' + var6_7 + ":mouseBind=" + (var4_5.Method12() == Class955.Field12069));
                        var1_1.newLine();
                    }
                }
                if (var4_5.Method387()) {
                    var1_1.write(this.Field17806.Method4004() + '.' + var2_4.Method40() + '.' + this.Field17806.Method4003() + '.' + var4_5.Method356() + '=' + var4_5.Method367());
                    var1_1.newLine();
                }
                if (!var4_5.Method389()) continue;
                v15 = new StringBuilder().append(this.Field17806.Method4004()).append('.').append(var2_4.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(var4_5.Method356()).append('=');
                v16 = var4_5.Method339();
                Intrinsics.checkExpressionValueIsNotNull((Object)v16, (String)"setting.colour");
                var1_1.write(v15.append(Class736.Field11115.Method6139(v16)).toString());
                var1_1.newLine();
            }
            break;
        }
    }

    private final void Method7719() throws IOException {
        if (Files.exists(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[0]), new LinkOption[0])) {
            new File(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000()).delete();
            return;
        }
        Files.createFile(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[0]), new FileAttribute[0]);
    }

    @NotNull
    @NotNull
    public final Class985 Method7720() {
        return this.Field17806;
    }

    public Class2143(@NotNull @NotNull Class985 class985) {
        Intrinsics.checkParameterIsNotNull((Object)class985, (String)"config");
        this.Field17806 = class985;
    }

    private static String Method7721(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 71;
            cArray2[n] = (char)(cArray[n] ^ (0x5B80 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

