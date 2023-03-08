//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\n" }, d2 = { "Lcom/kisman/cc/features/module/Debug/TextFieldTest;", "Lcom/kisman/cc/features/module/Module;", "()V", "gui", "Lcom/kisman/cc/features/module/Debug/TextFieldTest$TestGui;", "getGui", "()Lcom/kisman/cc/features/module/Debug/TextFieldTest$TestGui;", "onEnable", "", "TestGui", "kisman.cc" })
public final class Class1751 extends Class42
{
    @NotNull
    private final Class2127 Field16030;
    private String Field16031 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class2127 Method6676() {
        return this.Field16030;
    }
    
    @Override
    public void Method38() {
        Method6677().displayGuiScreen((GuiScreen)this.Field16030);
        this.lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = false;
    }
    
    public Class1751() {
        super("TextFieldTest", "Test of GuiTextField handler", Class97.Field8345);
        this.Field16030 = new Class2127();
    }
    
    public static final Minecraft Method6677() {
        return Class42.Field8052;
    }
    
    public static final void Method6678(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AB ^ 0x78));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
