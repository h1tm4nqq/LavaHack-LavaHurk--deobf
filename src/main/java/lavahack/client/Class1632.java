/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Charsets
 */
package lavahack.client;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lavahack.client.Class1132;
import lavahack.client.Class2000;
import lavahack.client.Class273;
import lavahack.client.Class734;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/websockets/command/Command;", "Lcom/kisman/cc/websockets/command/ICommand;", "command", "", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "runCommand", "", "line", "args", "", "kisman.cc"})
public abstract class Class1632
implements Class2000 {
    @NotNull
    private final String Field15619;
    private String Field15620 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method1590(@NotNull @NotNull String string, @NotNull @NotNull List list) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"line");
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"args");
        Iterator iterator = this.Method1589(string, list).iterator();
        while (iterator.hasNext()) {
            Class1132 class1132 = (Class1132)iterator.next();
            if (class1132.Method4624() == Class734.Field11110) {
                byte[] byArray;
                Class1132 class11322 = class1132;
                StringBuilder stringBuilder = new StringBuilder().append("true ");
                Base64.Encoder encoder = Base64.getEncoder();
                if (class1132.Method4620() != null) {
                    byte[] byArray2;
                    String string2;
                    Base64.Encoder encoder2 = encoder;
                    StringBuilder stringBuilder2 = stringBuilder;
                    Class1132 class11323 = class11322;
                    Charset charset = Charsets.UTF_8;
                    boolean bl = false;
                    String string3 = string2;
                    if (string3 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    Intrinsics.checkExpressionValueIsNotNull((Object)string3.getBytes(charset), (String)"(this as java.lang.String).getBytes(charset)");
                    class11322 = class11323;
                    stringBuilder = stringBuilder2;
                    encoder = encoder2;
                    byArray = byArray2;
                } else {
                    byArray = null;
                }
                class11322.Method4621(stringBuilder.append(encoder.encodeToString(byArray)).toString());
            }
            Class273.Method1450().Method543(class1132.Method4625());
        }
    }

    @NotNull
    @NotNull
    public final String Method1591() {
        return this.Field15619;
    }

    public Class1632(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"command");
        this.Field15619 = string;
    }

    private static String Method1592(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 234;
            cArray2[n] = (char)(cArray[n] ^ (0x39BE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

