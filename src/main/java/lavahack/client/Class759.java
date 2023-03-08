//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import kotlin.io.*;
import java.util.*;
import com.kisman.cc.util.*;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\t\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rJ(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\u0011" }, d2 = { "Lcom/kisman/cc/util/manager/file/ConfigManager$ModuleSave;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "fileCheck", "", "init", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "save", "writer", "Ljava/io/BufferedWriter;", "kisman.cc" })
public final class Class759
{
    @NotNull
    private final Class985 Field11214;
    private String Field11215 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method3141(@NotNull @NotNull final ArrayList list) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)list, "modules");
        Class1796.Method6786();
        this.Method3143();
        final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[0]).toFile()));
        final Throwable t = null;
        this.Method3142(bufferedWriter, list);
        final Unit instance = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)bufferedWriter, t);
    }
    
    private final void Method3142(final BufferedWriter bufferedWriter, final ArrayList list) throws IOException {
        for (final Class42 class42 : list) {
            final String s = (class42 instanceof Class1249) ? this.Field11214.Method4004() : this.Field11214.Method4002();
            final StringBuilder append = new StringBuilder().append(s).append('.');
            final Class42 class43 = class42;
            Intrinsics.checkExpressionValueIsNotNull((Object)class43, "module");
            bufferedWriter.write(append.append(class43.Method40()).append(".toggle=").append(class42.Method35()).toString());
            bufferedWriter.newLine();
            bufferedWriter.write(s + '.' + class42.Method40() + ".hold=" + class42.Field8065);
            bufferedWriter.newLine();
            bufferedWriter.write(s + '.' + class42.Method40() + ".visible=" + class42.Method51());
            bufferedWriter.newLine();
            bufferedWriter.write(s + '.' + class42.Method40() + ".key=" + class42.Method8());
            bufferedWriter.newLine();
            bufferedWriter.write(s + '.' + class42.Method40() + ".button=" + class42.Method10());
            bufferedWriter.newLine();
            bufferedWriter.write(s + '.' + class42.Method40() + ".mouseBind=" + (class42.Method12() == Class955.Field12069));
            bufferedWriter.newLine();
            if (class42 instanceof Class1249) {
                bufferedWriter.write(s + '.' + ((Class1249)class42).Method40() + ".x=" + ((Class1249)class42).Method267());
                bufferedWriter.newLine();
                bufferedWriter.write(s + '.' + ((Class1249)class42).Method40() + ".y=" + ((Class1249)class42).Method268());
                bufferedWriter.newLine();
            }
            if (Class1796.Field16241.Field16258.Method7571(class42) != null) {
                for (final Class44 class44 : Class1796.Field16241.Field16258.Method7571(class42)) {
                    if (class44 != null && !class44.Method382()) {
                        if (class44.Method386()) {
                            bufferedWriter.write(s + '.' + class42.Method40() + '.' + this.Field11214.Method4003() + '.' + class44.Method356() + '=' + class44.Method365());
                            bufferedWriter.newLine();
                            if (class44.Method8() != -1) {
                                bufferedWriter.write(s + '.' + class42.Method40() + '.' + this.Field11214.Method4003() + '.' + class44.Method356() + ":key=" + class44.Method8());
                                bufferedWriter.newLine();
                            }
                            if (class44.Method10() != -1) {
                                bufferedWriter.write(s + '.' + class42.Method40() + '.' + this.Field11214.Method4003() + '.' + class44.Method356() + ":button=" + class44.Method8());
                                bufferedWriter.newLine();
                            }
                            if (Class695.Field10935.Method7141((Class695)class44)) {
                                bufferedWriter.write(s + '.' + class42.Method40() + '.' + this.Field11214.Method4003() + '.' + class44.Method356() + ":mouseBind=" + (class44.Method12() == Class955.Field12069));
                                bufferedWriter.newLine();
                            }
                        }
                        if (class44.Method385()) {
                            bufferedWriter.write(s + '.' + class42.Method40() + '.' + this.Field11214.Method4003() + '.' + class44.Method356() + "=\"" + class44.Method359() + '\"');
                            bufferedWriter.newLine();
                            for (final String str : class44.Field8115.keySet()) {
                                final StringBuilder append2 = new StringBuilder().append(s).append('.').append(class42.Method40()).append('.').append(this.Field11214.Method4003()).append('.').append(class44.Method356()).append('.').append(str).append(":key=");
                                final Object value = class44.Field8115.get(str);
                                if (value == null) {
                                    Intrinsics.throwNpe();
                                }
                                bufferedWriter.write(append2.append(((Class1929)value).Method8()).toString());
                                bufferedWriter.newLine();
                                final StringBuilder append3 = new StringBuilder().append(s).append('.').append(class42.Method40()).append('.').append(this.Field11214.Method4003()).append('.').append(class44.Method356()).append('.').append(str).append(":mouse=");
                                final Object value2 = class44.Field8115.get(str);
                                if (value2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                bufferedWriter.write(append3.append(((Class1929)value2).Method10()).toString());
                                bufferedWriter.newLine();
                                bufferedWriter.write(s + '.' + class42.Method40() + '.' + this.Field11214.Method4003() + '.' + class44.Method356() + '.' + str + ":mouseBind=" + (class44.Method12() == Class955.Field12069));
                                bufferedWriter.newLine();
                            }
                        }
                        if (class44.Method387()) {
                            bufferedWriter.write(s + '.' + class42.Method40() + '.' + this.Field11214.Method4003() + '.' + class44.Method356() + '=' + class44.Method367());
                            bufferedWriter.newLine();
                        }
                        if (!class44.Method389()) {
                            continue;
                        }
                        final StringBuilder append4 = new StringBuilder().append(s).append('.').append(class42.Method40()).append('.').append(this.Field11214.Method4003()).append('.').append(class44.Method356()).append('=');
                        final Class1559 field11115 = Class736.Field11115;
                        final Class2027 method339 = class44.Method339();
                        Intrinsics.checkExpressionValueIsNotNull((Object)method339, "setting.colour");
                        bufferedWriter.write(append4.append(field11115.Method6139(method339)).toString());
                        bufferedWriter.newLine();
                    }
                }
            }
        }
    }
    
    private final void Method3143() throws IOException {
        if (Files.exists(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[0]), new LinkOption[0])) {
            new File(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000()).delete();
        }
        else {
            Files.createFile(Paths.get(this.Field11214.Method4001() + this.Field11214.Method4007() + this.Field11214.Method4000(), new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
        }
    }
    
    @NotNull
    @NotNull
    public final Class985 Method3144() {
        return this.Field11214;
    }
    
    public Class759(@NotNull @NotNull final Class985 field11214) {
        Intrinsics.checkParameterIsNotNull((Object)field11214, "config");
        this.Field11214 = field11214;
    }
    
    private static String Method3145(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1671 ^ 0x5F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
