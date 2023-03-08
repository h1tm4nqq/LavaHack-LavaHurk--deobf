//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.io.*;
import kotlin.jvm.internal.*;
import java.util.*;
import com.kisman.cc.util.*;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\r" }, d2 = { "Lcom/kisman/cc/util/manager/file/ConfigManager$Save;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "fileCheck", "", "init", "save", "writer", "Ljava/io/BufferedWriter;", "kisman.cc" })
public final class Class2143
{
    @NotNull
    private final Class985 Field17806;
    private String Field17807 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method7717() throws IOException {
        Class1796.Method6786();
        this.Method7719();
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[0]).toFile()));
        final Throwable t = null;
        this.Method7718(bufferedWriter);
        final Unit instance = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)bufferedWriter, t);
    }
    
    private final void Method7718(final BufferedWriter bufferedWriter) throws IOException {
        for (final Class42 class43 : Class1796.Field16241.Field16254.Field8854) {
            final Class42 class42 = class43;
            Intrinsics.checkExpressionValueIsNotNull((Object)class43, "module");
            if (class43.Method41() == Class97.Field8347) {
                continue;
            }
            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + ".toggle=" + class42.Method35());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + ".hold=" + class42.Field8065);
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + ".visible=" + class42.Method51());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + ".key=" + class42.Method8());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + ".button=" + class42.Method10());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + ".mouseBind=" + (class42.Method12() == Class955.Field12069));
            bufferedWriter.newLine();
            if (Class1796.Field16241.Field16258.Method7571(class42) == null) {
                continue;
            }
            for (final Class44 class44 : Class1796.Field16241.Field16258.Method7571(class42)) {
                if (class44 != null && !class44.Method382()) {
                    if (class44.Method386()) {
                        bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + '.' + this.Field17806.Method4003() + '.' + class44.Method356() + '=' + class44.Method365());
                        bufferedWriter.newLine();
                        if (class44.Method8() != -1) {
                            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + '.' + this.Field17806.Method4003() + '.' + class44.Method356() + ":key=" + class44.Method8());
                            bufferedWriter.newLine();
                        }
                        if (class44.Method10() != -1) {
                            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + '.' + this.Field17806.Method4003() + '.' + class44.Method356() + ":button=" + class44.Method8());
                            bufferedWriter.newLine();
                        }
                        if (Class695.Field10935.Method7141((Class695)class44)) {
                            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + '.' + this.Field17806.Method4003() + '.' + class44.Method356() + ":mouseBind=" + (class44.Method12() == Class955.Field12069));
                            bufferedWriter.newLine();
                        }
                    }
                    if (class44.Method385()) {
                        bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + '.' + this.Field17806.Method4003() + '.' + class44.Method356() + "=\"" + class44.Method359() + '\"');
                        bufferedWriter.newLine();
                        for (final String str : class44.Field8115.keySet()) {
                            final StringBuilder append = new StringBuilder().append(this.Field17806.Method4002()).append('.').append(class42.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(class44.Method356()).append('.').append(str).append(":key=");
                            final Object value = class44.Field8115.get(str);
                            if (value == null) {
                                Intrinsics.throwNpe();
                            }
                            bufferedWriter.write(append.append(((Class1929)value).Method8()).toString());
                            bufferedWriter.newLine();
                            final StringBuilder append2 = new StringBuilder().append(this.Field17806.Method4002()).append('.').append(class42.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(class44.Method356()).append('.').append(str).append(":mouse=");
                            final Object value2 = class44.Field8115.get(str);
                            if (value2 == null) {
                                Intrinsics.throwNpe();
                            }
                            bufferedWriter.write(append2.append(((Class1929)value2).Method10()).toString());
                            bufferedWriter.newLine();
                            bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + '.' + this.Field17806.Method4003() + '.' + class44.Method356() + '.' + str + ":mouseBind=" + (class44.Method12() == Class955.Field12069));
                            bufferedWriter.newLine();
                        }
                    }
                    if (class44.Method387()) {
                        bufferedWriter.write(this.Field17806.Method4002() + '.' + class42.Method40() + '.' + this.Field17806.Method4003() + '.' + class44.Method356() + '=' + class44.Method367());
                        bufferedWriter.newLine();
                    }
                    if (!class44.Method389()) {
                        continue;
                    }
                    final StringBuilder append3 = new StringBuilder().append(this.Field17806.Method4002()).append('.').append(class42.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(class44.Method356()).append('=');
                    final Class1559 field11115 = Class736.Field11115;
                    final Class2027 method339 = class44.Method339();
                    Intrinsics.checkExpressionValueIsNotNull((Object)method339, "setting.colour");
                    bufferedWriter.write(append3.append(field11115.Method6139(method339)).toString());
                    bufferedWriter.newLine();
                }
            }
        }
        for (final Class1249 class45 : Class1796.Field16241.Field16257.Field9235) {
            final StringBuilder append4 = new StringBuilder().append(this.Field17806.Method4004()).append('.');
            final Class1249 class46 = class45;
            Intrinsics.checkExpressionValueIsNotNull((Object)class46, "hud");
            bufferedWriter.write(append4.append(class46.Method40()).append(".toggle=").append(class45.Method35()).toString());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + ".hold=" + class45.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E);
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + ".visible=" + class45.Method51());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + ".key=" + class45.Method33());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + ".key=" + class45.Method8());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + ".button=" + class45.Method10());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + ".mouseBind=" + (class45.Method12() == Class955.Field12069));
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + ".x=" + class45.Method267());
            bufferedWriter.newLine();
            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + ".y=" + class45.Method268());
            bufferedWriter.newLine();
            if (Class1796.Field16241.Field16258.Method7571((Class42)class45) != null) {
                for (final Class44 class47 : Class1796.Field16241.Field16258.Method7571((Class42)class45)) {
                    if (class47 != null && !class47.Method382()) {
                        if (class47.Method386()) {
                            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + '.' + this.Field17806.Method4003() + '.' + class47.Method356() + '=' + class47.Method365());
                            bufferedWriter.newLine();
                            if (class47.Method8() != -1) {
                                bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + '.' + this.Field17806.Method4003() + '.' + class47.Method356() + ":key=" + class47.Method8());
                                bufferedWriter.newLine();
                            }
                            if (class47.Method10() != -1) {
                                bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + '.' + this.Field17806.Method4003() + '.' + class47.Method356() + ":button=" + class47.Method10());
                                bufferedWriter.newLine();
                            }
                            if (Class695.Field10935.Method7141((Class695)class47)) {
                                bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + '.' + this.Field17806.Method4003() + '.' + class47.Method356() + ":mouseBind=" + (class47.Method12() == Class955.Field12069));
                                bufferedWriter.newLine();
                            }
                        }
                        if (class47.Method385()) {
                            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + '.' + this.Field17806.Method4003() + '.' + class47.Method356() + "=\"" + class47.Method359() + '\"');
                            bufferedWriter.newLine();
                            for (final String str2 : class47.Field8115.keySet()) {
                                final StringBuilder append5 = new StringBuilder().append(this.Field17806.Method4004()).append('.').append(class45.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(class47.Method356()).append('.').append(str2).append(":key=");
                                final Object value3 = class47.Field8115.get(str2);
                                if (value3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                bufferedWriter.write(append5.append(((Class1929)value3).Method8()).toString());
                                bufferedWriter.newLine();
                                final StringBuilder append6 = new StringBuilder().append(this.Field17806.Method4004()).append('.').append(class45.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(class47.Method356()).append('.').append(str2).append(":mouse=");
                                final Object value4 = class47.Field8115.get(str2);
                                if (value4 == null) {
                                    Intrinsics.throwNpe();
                                }
                                bufferedWriter.write(append6.append(((Class1929)value4).Method10()).toString());
                                bufferedWriter.newLine();
                                bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + '.' + this.Field17806.Method4003() + '.' + class47.Method356() + '.' + str2 + ":mouseBind=" + (class47.Method12() == Class955.Field12069));
                                bufferedWriter.newLine();
                            }
                        }
                        if (class47.Method387()) {
                            bufferedWriter.write(this.Field17806.Method4004() + '.' + class45.Method40() + '.' + this.Field17806.Method4003() + '.' + class47.Method356() + '=' + class47.Method367());
                            bufferedWriter.newLine();
                        }
                        if (!class47.Method389()) {
                            continue;
                        }
                        final StringBuilder append7 = new StringBuilder().append(this.Field17806.Method4004()).append('.').append(class45.Method40()).append('.').append(this.Field17806.Method4003()).append('.').append(class47.Method356()).append('=');
                        final Class1559 field11116 = Class736.Field11115;
                        final Class2027 method340 = class47.Method339();
                        Intrinsics.checkExpressionValueIsNotNull((Object)method340, "setting.colour");
                        bufferedWriter.write(append7.append(field11116.Method6139(method340)).toString());
                        bufferedWriter.newLine();
                    }
                }
            }
        }
        bufferedWriter.write(this.Field17806.Method4005() + ".color=" + Class736.Field11115.Method6139(Class1796.Field16241.Field16263.Method6671()));
        bufferedWriter.newLine();
        final Class726 field11117 = Class726.Field11086;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11117, "FriendManager.instance");
        final ArrayList method341 = field11117.Method3039();
        Intrinsics.checkExpressionValueIsNotNull((Object)method341, "FriendManager.instance.friends");
        if (!method341.isEmpty()) {}
    }
    
    private final void Method7719() throws IOException {
        if (Files.exists(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[0]), new LinkOption[0])) {
            new File(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000()).delete();
        }
        else {
            Files.createFile(Paths.get(this.Field17806.Method4001() + this.Field17806.Method4007() + this.Field17806.Method4000(), new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
        }
    }
    
    @NotNull
    @NotNull
    public final Class985 Method7720() {
        return this.Field17806;
    }
    
    public Class2143(@NotNull @NotNull final Class985 field17806) {
        Intrinsics.checkParameterIsNotNull((Object)field17806, "config");
        this.Field17806 = field17806;
    }
    
    private static String Method7721(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5B80 ^ 0x47));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
