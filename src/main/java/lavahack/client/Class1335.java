//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t?\u0006\n" }, d2 = { "Lcom/kisman/cc/gui/hudeditor/HudSettingsFrame;", "Lcom/kisman/cc/gui/halq/Frame;", "x", "", "y", "(II)V", "colorSetting", "Lcom/kisman/cc/settings/Setting;", "getColorSetting", "()Lcom/kisman/cc/settings/Setting;", "kisman.cc" })
public final class Class1335 extends Class354
{
    @NotNull
    private final Class44 Field14107;
    private String Field14108 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class44 Method5387() {
        return this.Field14107;
    }
    
    public Class1335(final int n, final int n2) {
        super(null, n, n2, true, "Settings");
        this.Field14107 = new Class44("Box Color", null, new Class2027(10, 10, 10, 170));
        final int field14604 = Class1419.Field14604;
        int n3 = 0;
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.add(new Class294(this.Field14107, n, n2, field14604, n3, 0));
        final int n4 = field14604 + Class1419.Field14604;
        ++n3;
    }
    
    private static String Method74(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7468 ^ 0x92));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
