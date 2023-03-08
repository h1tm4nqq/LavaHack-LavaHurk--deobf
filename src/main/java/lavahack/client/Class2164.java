//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0002J \u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0016J \u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015?\u0006!" }, d2 = { "Lcom/kisman/cc/gui/hudeditor/DraggableBox;", "Lcom/kisman/cc/gui/api/Component;", "module", "Lcom/kisman/cc/features/hud/HudModule;", "(Lcom/kisman/cc/features/hud/HudModule;)V", "drag", "", "getDrag", "()Z", "setDrag", "(Z)V", "dragX", "", "getDragX", "()I", "setDragX", "(I)V", "dragY", "getDragY", "setDragY", "getModule", "()Lcom/kisman/cc/features/hud/HudModule;", "drawScreen", "", "mouseX", "mouseY", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "kisman.cc" })
public final class Class2164 implements Class1520
{
    private int Field17896;
    private int Field17897;
    private boolean Field17898;
    @NotNull
    private final Class1249 Field17899;
    private String Field17900 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final int Method7796() {
        return this.Field17896;
    }
    
    public final void Method7797(final int field17896) {
        this.Field17896 = field17896;
    }
    
    public final int Method7798() {
        return this.Field17897;
    }
    
    public final void Method7799(final int field17897) {
        this.Field17897 = field17897;
    }
    
    public final boolean Method7800() {
        return this.Field17898;
    }
    
    public final void Method7801(final boolean field17898) {
        this.Field17898 = field17898;
    }
    
    public void Method623(final int n, final int n2) {
        if (this.Field17899.Method35()) {
            if (this.Field17898) {
                this.Field17899.Method271((double)(n - this.Field17896));
                this.Field17899.Method272((double)(n2 - this.Field17897));
            }
            Class662.Field10816.Method2466((Class732)this.Field17899);
            Class753.drawRectWH(this.Field17899.Method267(), this.Field17899.Method268(), this.Field17899.Method269(), this.Field17899.Method270(), Class1796.Field16241.Field16263.Method6671().Method3626());
        }
        else {
            this.Field17898 = false;
        }
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Field17899.Method35()) {
            this.Field17898 = this.Method7802(n, n2);
            this.Field17896 = (int)(n - this.Field17899.Method267());
            this.Field17897 = (int)(n2 - this.Field17899.Method268());
        }
    }
    
    public void Method626(final int n, final int n2, final int n3) {
        this.Field17898 = false;
    }
    
    private final boolean Method7802(final int n, final int n2) {
        return n > this.Field17899.Method267() && n < this.Field17899.Method267() + this.Field17899.Method269() && n2 > this.Field17899.Method268() && n2 < this.Field17899.Method268() + this.Field17899.Method270();
    }
    
    @NotNull
    @NotNull
    public final Class1249 Method7803() {
        return this.Field17899;
    }
    
    public Class2164(@NotNull @NotNull final Class1249 field17899) {
        Intrinsics.checkParameterIsNotNull((Object)field17899, "module");
        this.Field17899 = field17899;
    }
    
    private static String Method7804(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5526 ^ 0x81));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
