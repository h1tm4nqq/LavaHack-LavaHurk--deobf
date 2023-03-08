//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\n\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassModuleManager;", "", "()V", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "getModules", "()Ljava/util/ArrayList;", "getModulesByCategory", "category", "Lcom/kisman/cc/features/module/Category;", "Lcom/kisman/cc/pingbypass/server/features/modules/PingBypassCategory;", "init", "", "kisman.cc" })
public final class Class1338
{
    @NotNull
    private static final ArrayList Field14115;
    public static final Class1338 Field14116;
    private String Field14117 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final ArrayList Method5389() {
        return Class1338.Field14115;
    }
    
    public final void Method5390() {
        for (final Class42 class42 : Class1796.Field16241.Field16254.Field8854) {
            final Class42 e = class42;
            Intrinsics.checkExpressionValueIsNotNull((Object)class42, "module");
            if (class42.Method30()) {
                Class1338.Field14115.add(e);
            }
        }
    }
    
    @NotNull
    @NotNull
    public final ArrayList Method5391(@NotNull @NotNull final Class97 class97) {
        Intrinsics.checkParameterIsNotNull((Object)class97, "category");
        final ArrayList<Class42> list = new ArrayList<Class42>();
        for (final Class42 class98 : Class1338.Field14115) {
            final Class42 e = class98;
            Intrinsics.checkExpressionValueIsNotNull((Object)class98, "module");
            if (class98.Method41() == class97) {
                list.add(e);
            }
        }
        return list;
    }
    
    @NotNull
    @NotNull
    public final ArrayList Method5392(@NotNull @NotNull final Class2130 class2130) {
        Intrinsics.checkParameterIsNotNull((Object)class2130, "category");
        return this.Method5391(class2130.Method7667());
    }
    
    private Class1338() {
    }
    
    static {
        Field14116 = new Class1338();
        Field14115 = new ArrayList();
    }
    
    private static String Method5393(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x12AF ^ 0x43));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
