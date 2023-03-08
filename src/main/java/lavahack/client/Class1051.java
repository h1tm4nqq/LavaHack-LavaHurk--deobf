//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "", "displaySlot", "", "windowClickSlot", "(Ljava/lang/String;III)V", "getDisplaySlot", "()I", "getWindowClickSlot", "Slot1", "Slot2", "Slot3", "Slot4", "Slot5", "Slot6", "Slot7", "Slot8", "Slot9", "Companion", "kisman.cc" })
public enum Class1051
{
    Field12648("Slot1", 0, 1, 36), 
    Field12649("Slot2", 1, 2, 37), 
    Field12650("Slot3", 2, 3, 38), 
    Field12651("Slot4", 3, 4, 39), 
    Field12652("Slot5", 4, 5, 40), 
    Field12653("Slot6", 5, 6, 41), 
    Field12654("Slot7", 6, 7, 42), 
    Field12655("Slot8", 7, 8, 43), 
    Field12656("Slot9", 8, 9, 44);
    
    private static final Class1051[] Field12657;
    private final int Field12658;
    private final int Field12659;
    @NotNull
    private static final Class1051 Field12660;
    public static final Class2005 Field12661;
    private String Field12662 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field12661 = new Class2005(null);
        Field12660 = Class1051.Field12648;
    }
    
    public final int Method4289() {
        return this.Field12658;
    }
    
    public final int Method4290() {
        return this.Field12659;
    }
    
    private Class1051(final String name, final int ordinal, final int field12658, final int field12659) {
        this.Field12658 = field12658;
        this.Field12659 = field12659;
    }
    
    private static String Method4292(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x43F3 ^ 0x39));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
