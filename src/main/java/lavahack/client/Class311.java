//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016?\u0006\t" }, d2 = { "Lcom/kisman/cc/websockets/command/commands/CapeCommand;", "Lcom/kisman/cc/websockets/command/Command;", "()V", "execute", "", "Lcom/kisman/cc/websockets/data/SocketMessage;", "line", "", "args", "kisman.cc" })
public final class Class311 extends Class1632
{
    public static final Class311 Field9323;
    private String Field9324 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public List Method1589(@NotNull @NotNull final String s, @NotNull @NotNull final List list) {
        Intrinsics.checkParameterIsNotNull((Object)s, "line");
        Intrinsics.checkParameterIsNotNull((Object)list, "args");
        Label_0187: {
            switch (list.size()) {
                case 2: {
                    if (Intrinsics.areEqual((Object)list.get(1), (Object)"clear")) {
                        Class1830.Field16451.Method6888();
                        break;
                    }
                    break;
                }
                case 4: {
                    final String s2 = list.get(1);
                    switch (s2.hashCode()) {
                        case 96417: {
                            if (s2.equals("add")) {
                                Class1830.Field16451.Method6889((String)list.get(3), Class1830.Field16451.Method6897((String)list.get(2)));
                                break Label_0187;
                            }
                            break Label_0187;
                        }
                        case -934610812: {
                            if (s2.equals("remove")) {
                                Class1830.Field16451.Method6891((String)list.get(3));
                                break Label_0187;
                            }
                            break Label_0187;
                        }
                    }
                    break;
                }
            }
        }
        return CollectionsKt.emptyList();
    }
    
    private Class311() {
        super("cape");
    }
    
    static {
        Field9323 = new Class311();
    }
    
    private static String Method1592(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x44ED ^ 0x5C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
