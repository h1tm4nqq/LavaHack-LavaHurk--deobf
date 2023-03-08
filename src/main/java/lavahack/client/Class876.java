//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t?\u0006\f" }, d2 = { "Lcom/kisman/cc/features/subsystem/SubSystemManager;", "", "()V", "subsystems", "", "Lcom/kisman/cc/features/subsystem/SubSystem;", "getSubsystems", "()Ljava/util/List;", "setSubsystems", "(Ljava/util/List;)V", "init", "", "kisman.cc" })
public final class Class876
{
    @NotNull
    private List Field11684;
    private String Field11685 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final List Method3668() {
        return this.Field11684;
    }
    
    public final void Method3669(@NotNull @NotNull final List field11684) {
        Intrinsics.checkParameterIsNotNull((Object)field11684, "<set-?>");
        this.Field11684 = field11684;
    }
    
    public final void Method3670() {
        for (final Class166 class166 : this.Field11684) {
            Class1796.Field16243.info("Subsystem Manager: Initializing \"" + class166.Method1063() + "\" subsystem!");
            class166.Method1060();
        }
    }
    
    public Class876() {
        this.Field11684 = CollectionsKt.listOf((Object[])new Class166[] { (Class166)Class1696.Field15860, (Class166)Class223.Field8964 });
    }
    
    private static String Method3671(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x33F8 ^ 0xC1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
