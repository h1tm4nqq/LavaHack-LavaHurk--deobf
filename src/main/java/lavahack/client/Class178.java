//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/gui/csgo/Utils$Companion;", "", "()V", "formatTime", "", "l", "", "kisman.cc" })
public final class Class178
{
    private int Field8787;
    
    @Nullable
    @Nullable
    public final String Method1102(final long n) {
        final long lng = n / 1000 / 60;
        final long n2 = n - lng * 1000 * 60;
        final long lng2 = n2 / 1000;
        final long lng3 = n2 - lng2 * 1000;
        final StringBuilder sb = new StringBuilder();
        if (lng != 0L) {
            sb.append(lng).append("min ");
        }
        if (lng2 != 0L) {
            sb.append(lng2).append("s ");
        }
        if (lng3 != 0L || (lng == 0L && lng2 == 0L)) {
            sb.append(lng3).append("ms ");
        }
        return sb.substring(0, sb.length() - 1);
    }
    
    private Class178() {
    }
    
    public Class178(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method1103(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1BA3 ^ 0xE6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
