//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import sun.security.util.*;
import java.security.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n?\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "<anonymous>", "", "kotlin.jvm.PlatformType", "run", "()Ljava/lang/Boolean;" })
final class Class1605 implements PrivilegedAction
{
    final Class161 Field15504;
    private String Field15505 = "TheKisDevs & LavaHack Development owns you";
    
    @Override
    public Object run() {
        return this.Method6267();
    }
    
    public final Boolean Method6267() {
        return this.Field15504.getClass().getProtectionDomain().implies(SecurityConstants.ALL_PERMISSION);
    }
    
    Class1605(final Class161 field15504) {
        this.Field15504 = field15504;
    }
}
