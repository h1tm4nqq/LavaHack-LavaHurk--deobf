//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004?\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/enums/PhaseModes;", "", "handler", "Lcom/kisman/cc/util/enums/IPhaseMode;", "(Ljava/lang/String;ILcom/kisman/cc/util/enums/IPhaseMode;)V", "update", "", "phase", "Lcom/kisman/cc/features/module/movement/Phase;", "Pearl", "PearlBypass", "kisman.cc" })
public enum Class484
{
    Field10019("Pearl", 0, (Class770)new Class642()), 
    Field10020("PearlBypass", 1, (Class770)new Class643());
    
    private static final Class484[] Field10021;
    private final Class770 Field10022;
    private String Field10023 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final void Method2245(@NotNull @NotNull final Class843 class843) {
        Intrinsics.checkParameterIsNotNull((Object)class843, "phase");
        this.Field10022.Method2773(class843);
    }
    
    private Class484(final String name, final int ordinal, final Class770 field10022) {
        this.Field10022 = field10022;
    }
    
    private static String Method2246(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x347F ^ 0x10));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
