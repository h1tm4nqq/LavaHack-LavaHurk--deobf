//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000eH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b?\u0006\u0010" }, d2 = { "Lcom/kisman/cc/gui/other/music/MusicGui$VolumeResponder;", "Lnet/minecraft/client/gui/GuiPageButtonList$GuiResponder;", "()V", "volume", "", "getVolume", "()I", "setVolume", "(I)V", "setEntryValue", "", "p0", "p1", "", "", "", "kisman.cc" })
public final class Class1042 implements GuiPageButtonList$GuiResponder
{
    private int Field12592;
    private String Field12593 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final int getVolume() {
        return this.Field12592;
    }
    
    public final void setVolume(final int field12592) {
        this.Field12592 = field12592;
    }
    
    public void setEntryValue(final int n, final float n2) {
        this.Field12592 = (int)n2;
    }
    
    public void setEntryValue(final int n, final boolean b) {
    }
    
    public void setEntryValue(final int n, @NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "p1");
    }
    
    public Class1042() {
        this.Field12592 = 100;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7803 ^ 0xC8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
