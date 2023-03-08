//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016?\u0006\u0006" }, d2 = { "Lcom/kisman/cc/features/module/Debug/ModuleInstancingKt;", "Lcom/kisman/cc/features/module/Module;", "()V", "update", "", "Companion", "kisman.cc" })
public final class Class2154 extends Class42
{
    @Nullable
    private static Class2154 Field17850;
    public static final Class524 Field17851;
    private int Field17852;
    
    @Override
    public void Method45() {
        if (Method7747().player == null || Method7747().world == null) {
            return;
        }
        Class1393.Method5506().Method1886("Instance of module " + this.Method40() + " is " + ((Class2154.Field17850 == null) ? "NULL" : "NOT NULL"));
    }
    
    public Class2154() {
        super("ModuleInstancingKt", "Tests @ModuleInstance annotation in kotlin.", Class97.Field8345);
    }
    
    static {
        Field17851 = new Class524(null);
    }
    
    public static final Minecraft Method7747() {
        return Class42.Field8052;
    }
    
    public static final void Method7748(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class2154 Method7749() {
        return Class2154.Field17850;
    }
    
    public static final void Method7750(final Class2154 field17850) {
        Class2154.Field17850 = field17850;
    }
    
    @Nullable
    @Nullable
    public static final Class2154 Method7751() {
        Class2154.Field17851;
        return Class2154.Field17850;
    }
    
    public static final void Method7752(@Nullable @Nullable final Class2154 field17850) {
        Class2154.Field17851;
        Class2154.Field17850 = field17850;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2B49 ^ 0xEA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
