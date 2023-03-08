//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.jvm.functions.*;
import kotlin.*;
import com.kisman.cc.loader.*;
import kotlin.jvm.internal.*;
import java.io.*;
import kotlin.text.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
final class Class951 extends Lambda implements Function0
{
    public static final Class951 Field12051;
    private String Field12052 = "TheKisDevs & LavaHack Development owns you";
    
    public Object invoke() {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
        return Unit.INSTANCE;
    }
    
    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        if (Class1214.Method4883()) {
            final Process exec = Runtime.getRuntime().exec("tasklist");
            Intrinsics.checkExpressionValueIsNotNull((Object)exec, "process");
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            final String s = null;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                final String s2 = line;
                if (s2 == null) {
                    Intrinsics.throwNpe();
                }
                if (Class328.Method1646().contains(StringsKt.split$default((CharSequence)s2, new String[] { " " }, false, 0, 6, (Object)null).get(0))) {
                    Class1214.Method4886();
                }
            }
        }
    }
    
    Class951() {
        super(0);
    }
    
    static {
        Field12051 = new Class951();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x386E ^ 0x63));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
