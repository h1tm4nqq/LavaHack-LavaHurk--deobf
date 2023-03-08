//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import java.nio.file.*;
import kotlin.*;
import kotlin.io.*;
import java.io.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.util.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\f" }, d2 = { "Lcom/kisman/cc/util/manager/file/ConfigManager$Load;", "", "config", "Lcom/kisman/cc/util/manager/file/ConfigManager;", "(Lcom/kisman/cc/util/manager/file/ConfigManager;)V", "getConfig", "()Lcom/kisman/cc/util/manager/file/ConfigManager;", "init", "", "load", "reader", "Ljava/io/BufferedReader;", "kisman.cc" })
public final class Class258
{
    @NotNull
    private final Class985 Field9158;
    private int Field9159;
    
    public final void Method1420() throws IOException {
        Class1796.Field16250 = this.Field9158.Method4007();
        Class1796.Method6786();
        if (!Files.exists(Paths.get(this.Field9158.Method4001() + this.Field9158.Method4007() + this.Field9158.Method4000(), new String[0]), new LinkOption[0])) {
            return;
        }
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(this.Field9158.Method4001() + this.Field9158.Method4007() + this.Field9158.Method4000(), new String[0]), new OpenOption[0])));
        final Throwable t = null;
        this.Method1421(bufferedReader);
        final Unit instance = Unit.INSTANCE;
        CloseableKt.closeFinally((Closeable)bufferedReader, t);
    }
    
    public final void Method1421(@NotNull @NotNull final BufferedReader bufferedReader) throws IOException {
        Intrinsics.checkParameterIsNotNull((Object)bufferedReader, "reader");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        while (true) {
            final String line = bufferedReader.readLine();
            ref$ObjectRef.element = line;
            final Unit instance = Unit.INSTANCE;
            if (line == null) {
                break;
            }
            final String s = (String)ref$ObjectRef.element;
            final List list2;
            final List list = list2 = ((s != null) ? StringsKt.split$default((CharSequence)s, new String[] { "=" }, (boolean)(0 != 0), 0, 6, (Object)null) : null);
            List<String> split$default = null;
            Label_0125: {
                if (list2 != null) {
                    final String s2 = list2.get(0);
                    if (s2 != null) {
                        split$default = (List<String>)StringsKt.split$default((CharSequence)s2, new String[] { "." }, false, 0, 6, (Object)null);
                        break Label_0125;
                    }
                }
                split$default = null;
            }
            final List<String> list4;
            final List<String> list3 = list4 = split$default;
            final String s3 = (list4 != null) ? list4.get(0) : null;
            if (Intrinsics.areEqual((Object)s3, (Object)this.Field9158.Method4002())) {
                final Class42 method1163 = Class1796.Field16241.Field16254.Method1163((String)list3.get(1), false, false);
                if (method1163 == null) {
                    continue;
                }
                final String s4 = list3.get(2);
                if (Intrinsics.areEqual((Object)s4, (Object)"toggle")) {
                    final boolean boolean1 = Boolean.parseBoolean(list.get(1));
                    if (method1163.Method35() == boolean1) {
                        continue;
                    }
                    method1163.Method21(boolean1);
                }
                else if (Intrinsics.areEqual((Object)s4, (Object)"hold")) {
                    method1163.Field8065 = Boolean.parseBoolean(list.get(1));
                }
                else if (Intrinsics.areEqual((Object)s4, (Object)"visible")) {
                    method1163.Field8064 = Boolean.parseBoolean(list.get(1));
                }
                else if (Intrinsics.areEqual((Object)s4, (Object)"key")) {
                    method1163.Method9(Integer.parseInt(list.get(1)));
                }
                else if (Intrinsics.areEqual((Object)s4, (Object)"button")) {
                    method1163.Method11(Integer.parseInt(list.get(1)));
                }
                else if (Intrinsics.areEqual((Object)s4, (Object)"mouseBind")) {
                    method1163.Method13(Boolean.parseBoolean(list.get(1)) ? Class955.Field12069 : Class955.Field12068);
                }
                else {
                    if (!Intrinsics.areEqual((Object)s4, (Object)this.Field9158.Method4003())) {
                        continue;
                    }
                    final boolean contains$default = StringsKt.contains$default((CharSequence)list3.get(3), (CharSequence)":", false, 2, (Object)null);
                    final boolean b = list3.size() > 4 && StringsKt.contains$default((CharSequence)list3.get(4), (CharSequence)":", false, 2, (Object)null);
                    if (!contains$default) {
                        final Class44 method1164 = Class1796.Field16241.Field16258.Method7573(method1163, (String)list3.get(3), true);
                        if (method1164 == null || method1164.Method382()) {
                            continue;
                        }
                        if (method1164.Method386()) {
                            method1164.Method366(Boolean.parseBoolean(list.get(1)));
                        }
                        if (method1164.Method385() && method1164.Field8115.containsKey(StringsKt.split$default((CharSequence)list.get(1), new String[] { "\"" }, false, 0, 6, (Object)null).get(1))) {
                            method1164.Method360(StringsKt.split$default((CharSequence)list.get(1), new String[] { "\"" }, false, 0, 6, (Object)null).get(1));
                        }
                        if (method1164.Method387()) {
                            method1164.Method370(Double.parseDouble(list.get(1)));
                        }
                        if (!method1164.Method389()) {
                            continue;
                        }
                        final Class44 class44 = method1164;
                        final Class1559 field11115 = Class736.Field11115;
                        final String s5 = list.get(1);
                        final Class2027 method1165 = method1164.Method339();
                        Intrinsics.checkExpressionValueIsNotNull((Object)method1165, "setting.colour");
                        class44.Method340(field11115.Method6140(s5, method1165));
                    }
                    else {
                        final Class44 class45 = contains$default ? Class1796.Field16241.Field16258.Method7573(method1163, (String)StringsKt.split$default((CharSequence)list3.get(3), new String[] { ":" }, false, 0, 6, (Object)null).get(0), true) : Class1796.Field16241.Field16258.Method7573(method1163, (String)list3.get(3), true);
                        if (class45 == null || class45.Method382()) {
                            continue;
                        }
                        final List list5 = contains$default ? StringsKt.split$default((CharSequence)list3.get(3), new String[] { ":" }, false, 0, 6, (Object)null) : StringsKt.split$default((CharSequence)list3.get(4), new String[] { ":" }, false, 0, 6, (Object)null);
                        if (class45.Method386()) {
                            final String s6 = list5.get(1);
                            switch (s6.hashCode()) {
                                case -1377687758: {
                                    if (s6.equals("button")) {
                                        class45.Method11(Integer.parseInt(list.get(1)));
                                        continue;
                                    }
                                    continue;
                                }
                                case 585824898: {
                                    if (s6.equals("mouseBind")) {
                                        class45.Method13(Boolean.parseBoolean(list.get(1)) ? Class955.Field12069 : Class955.Field12068);
                                        continue;
                                    }
                                    continue;
                                }
                                case 106079: {
                                    if (s6.equals("key")) {
                                        class45.Method9(Integer.parseInt(list.get(1)));
                                        continue;
                                    }
                                    continue;
                                }
                                default: {
                                    continue;
                                }
                            }
                        }
                        else {
                            if (!class45.Method385()) {
                                continue;
                            }
                            final String s7 = list5.get(0);
                            if (!class45.Field8115.containsKey(s7)) {
                                continue;
                            }
                            final String s8 = list5.get(1);
                            switch (s8.hashCode()) {
                                case -1377687758: {
                                    if (s8.equals("button")) {
                                        final Class1929 class46 = class45.Field8115.get(s7);
                                        if (class46 == null) {
                                            continue;
                                        }
                                        class46.Method11(Integer.parseInt(list.get(1)));
                                        final Unit instance2 = Unit.INSTANCE;
                                        continue;
                                    }
                                    continue;
                                }
                                case 585824898: {
                                    if (s8.equals("mouseBind")) {
                                        final Class1929 class47 = class45.Field8115.get(s7);
                                        if (class47 == null) {
                                            continue;
                                        }
                                        class47.Method13(Boolean.parseBoolean(list.get(1)) ? Class955.Field12069 : Class955.Field12068);
                                        final Unit instance3 = Unit.INSTANCE;
                                        continue;
                                    }
                                    continue;
                                }
                                case 106079: {
                                    if (s8.equals("key")) {
                                        final Class1929 class48 = class45.Field8115.get(s7);
                                        if (class48 == null) {
                                            continue;
                                        }
                                        class48.Method9(Integer.parseInt(list.get(1)));
                                        final Unit instance4 = Unit.INSTANCE;
                                        continue;
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            else if (Intrinsics.areEqual((Object)s3, (Object)this.Field9158.Method4004())) {
                final Class1249 method1166 = Class1796.Field16241.Field16257.Method1523(list3.get(1));
                if (method1166 == null) {
                    continue;
                }
                final String s9 = list3.get(2);
                if (Intrinsics.areEqual((Object)s9, (Object)"toggle")) {
                    final boolean boolean2 = Boolean.parseBoolean(list.get(1));
                    if (method1166.Method35() == boolean2) {
                        continue;
                    }
                    method1166.Method21(boolean2);
                }
                else if (Intrinsics.areEqual((Object)s9, (Object)"hold")) {
                    method1166.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E = Boolean.parseBoolean(list.get(1));
                }
                else if (Intrinsics.areEqual((Object)s9, (Object)"visible")) {
                    method1166.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro = Boolean.parseBoolean(list.get(1));
                }
                else if (Intrinsics.areEqual((Object)s9, (Object)"key")) {
                    method1166.Method9(Integer.parseInt(list.get(1)));
                }
                else if (Intrinsics.areEqual((Object)s9, (Object)"button")) {
                    method1166.Method11(Integer.parseInt(list.get(1)));
                }
                else if (Intrinsics.areEqual((Object)s9, (Object)"mouseBind")) {
                    method1166.Method13(Boolean.parseBoolean(list.get(1)) ? Class955.Field12069 : Class955.Field12068);
                }
                else if (Intrinsics.areEqual((Object)s9, (Object)"x")) {
                    method1166.Method271(Double.parseDouble(list.get(1)));
                }
                else if (Intrinsics.areEqual((Object)s9, (Object)"y")) {
                    method1166.Method272(Double.parseDouble(list.get(1)));
                }
                else {
                    if (!Intrinsics.areEqual((Object)s9, (Object)this.Field9158.Method4003())) {
                        continue;
                    }
                    final boolean contains$default2 = StringsKt.contains$default((CharSequence)list3.get(3), (CharSequence)":", false, 2, (Object)null);
                    final boolean b2 = list3.size() > 4 && StringsKt.contains$default((CharSequence)list3.get(4), (CharSequence)":", false, 2, (Object)null);
                    if (!contains$default2) {
                        final Class44 method1167 = Class1796.Field16241.Field16258.Method7573((Class42)method1166, (String)list3.get(3), true);
                        if (method1167 == null || method1167.Method382()) {
                            continue;
                        }
                        if (method1167.Method386()) {
                            method1167.Method366(Boolean.parseBoolean(list.get(1)));
                        }
                        if (method1167.Method385()) {
                            method1167.Method360(StringsKt.split$default((CharSequence)list.get(1), new String[] { "\"" }, false, 0, 6, (Object)null).get(1));
                        }
                        if (method1167.Method387()) {
                            method1167.Method370(Double.parseDouble(list.get(1)));
                        }
                        if (!method1167.Method389()) {
                            continue;
                        }
                        final Class44 class49 = method1167;
                        final Class1559 field11116 = Class736.Field11115;
                        final String s10 = list.get(1);
                        final Class2027 method1168 = method1167.Method339();
                        Intrinsics.checkExpressionValueIsNotNull((Object)method1168, "setting.colour");
                        class49.Method340(field11116.Method6140(s10, method1168));
                    }
                    else {
                        final Class44 class50 = contains$default2 ? Class1796.Field16241.Field16258.Method7573((Class42)method1166, (String)StringsKt.split$default((CharSequence)list3.get(3), new String[] { ":" }, false, 0, 6, (Object)null).get(0), true) : Class1796.Field16241.Field16258.Method7573((Class42)method1166, (String)list3.get(3), true);
                        if (class50 == null || class50.Method382()) {
                            continue;
                        }
                        final List list6 = contains$default2 ? StringsKt.split$default((CharSequence)list3.get(3), new String[] { ":" }, false, 0, 6, (Object)null) : StringsKt.split$default((CharSequence)list3.get(4), new String[] { ":" }, false, 0, 6, (Object)null);
                        if (class50.Method386()) {
                            final String s11 = list6.get(1);
                            switch (s11.hashCode()) {
                                case -1377687758: {
                                    if (s11.equals("button")) {
                                        class50.Method11(Integer.parseInt(list.get(1)));
                                        continue;
                                    }
                                    continue;
                                }
                                case 585824898: {
                                    if (s11.equals("mouseBind")) {
                                        class50.Method13(Boolean.parseBoolean(list.get(1)) ? Class955.Field12069 : Class955.Field12068);
                                        continue;
                                    }
                                    continue;
                                }
                                case 106079: {
                                    if (s11.equals("key")) {
                                        class50.Method9(Integer.parseInt(list.get(1)));
                                        continue;
                                    }
                                    continue;
                                }
                                default: {
                                    continue;
                                }
                            }
                        }
                        else {
                            if (!class50.Method385()) {
                                continue;
                            }
                            final String s12 = list6.get(0);
                            if (!class50.Field8115.containsKey(s12)) {
                                continue;
                            }
                            final String s13 = list6.get(1);
                            switch (s13.hashCode()) {
                                case -1377687758: {
                                    if (s13.equals("button")) {
                                        final Class1929 class51 = class50.Field8115.get(s12);
                                        if (class51 == null) {
                                            continue;
                                        }
                                        class51.Method11(Integer.parseInt(list.get(1)));
                                        final Unit instance5 = Unit.INSTANCE;
                                        continue;
                                    }
                                    continue;
                                }
                                case 585824898: {
                                    if (s13.equals("mouseBind")) {
                                        final Class1929 class52 = class50.Field8115.get(s12);
                                        if (class52 == null) {
                                            continue;
                                        }
                                        class52.Method13(Boolean.parseBoolean(list.get(1)) ? Class955.Field12069 : Class955.Field12068);
                                        final Unit instance6 = Unit.INSTANCE;
                                        continue;
                                    }
                                    continue;
                                }
                                case 106079: {
                                    if (s13.equals("key")) {
                                        final Class1929 class53 = class50.Field8115.get(s12);
                                        if (class53 == null) {
                                            continue;
                                        }
                                        class53.Method9(Integer.parseInt(list.get(1)));
                                        final Unit instance7 = Unit.INSTANCE;
                                        continue;
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            else if (Intrinsics.areEqual((Object)s3, (Object)this.Field9158.Method4005())) {
                final String s14 = list3.get(1);
                switch (s14.hashCode()) {
                    case 94842723: {
                        if (s14.equals("color")) {
                            final Class44 method1169 = Class1796.Field16241.Field16263.Method6673().Method5387();
                            final Class1559 field11117 = Class736.Field11115;
                            final String s15 = list.get(1);
                            final Class2027 method1170 = Class1796.Field16241.Field16263.Method6673().Method5387().Method339();
                            Intrinsics.checkExpressionValueIsNotNull((Object)method1170, "Kisman.instance.halqHudG\u2026Frame.colorSetting.colour");
                            method1169.Method340(field11117.Method6140(s15, method1170));
                            continue;
                        }
                        continue;
                    }
                }
            }
            else {
                if (!Intrinsics.areEqual((Object)s3, (Object)this.Field9158.Method4006())) {
                    continue;
                }
                Class726.Field11086.Method3040((String)StringsKt.split$default((CharSequence)list.get(1), new String[] { "\"" }, false, 0, 6, (Object)null).get(1));
            }
        }
    }
    
    @NotNull
    @NotNull
    public final Class985 Method1422() {
        return this.Field9158;
    }
    
    public Class258(@NotNull @NotNull final Class985 field9158) {
        Intrinsics.checkParameterIsNotNull((Object)field9158, "config");
        this.Field9158 = field9158;
    }
    
    private static String Method1423(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x672 ^ 0x1A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
