//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005?\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/features/module/client/DevelopmentHelper;", "Lcom/kisman/cc/features/module/Module;", "()V", "displaySlots", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getDisplaySlots", "()Lcom/kisman/cc/settings/Setting;", "slotType", "getSlotType", "Companion", "kisman.cc" })
public final class Class472 extends Class42
{
    private final Class44 Field9967;
    private final Class44 Field9968;
    @Nullable
    private static Class472 Field9969;
    public static final Class164 Field9970;
    private String Field9971 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final Class44 Method2210() {
        return this.Field9967;
    }
    
    public final Class44 Method2211() {
        return this.Field9968;
    }
    
    public Class472() {
        super("DevelopmentHelper", "Helps with lavahack development.", Class97.Field8339);
        this.Field9967 = this.Method23(new Class44("Display Slots", (Class42)this, false));
        this.Field9968 = this.Method23(new Class44("Slot Type", (Class42)this, (Enum)Class1928.Field16945));
        Class472.Field9969 = this;
    }
    
    static {
        Field9970 = new Class164((DefaultConstructorMarker)null);
    }
    
    public static final Class472 Method2212() {
        return Class472.Field9969;
    }
    
    public static final void Method2213(final Class472 field9969) {
        Class472.Field9969 = field9969;
    }
    
    @Nullable
    @Nullable
    public static final Class472 Method2214() {
        Class472.Field9970;
        return Class472.Field9969;
    }
    
    public static final void Method2215(@Nullable @Nullable final Class472 field9969) {
        Class472.Field9970;
        Class472.Field9969 = field9969;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x795B ^ 0xBE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
