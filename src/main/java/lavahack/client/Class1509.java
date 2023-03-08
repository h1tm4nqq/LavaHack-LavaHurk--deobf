//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.event.*;
import kotlin.*;
import net.minecraft.tileentity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0007\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006?\u0006\t" }, d2 = { "Lcom/kisman/cc/event/events/RenderTileEntityEvent;", "Lcom/kisman/cc/event/Event;", "tileEntity", "Lnet/minecraft/tileentity/TileEntity;", "(Lnet/minecraft/tileentity/TileEntity;)V", "getTileEntity", "()Lnet/minecraft/tileentity/TileEntity;", "Post", "Pre", "kisman.cc" })
public class Class1509 extends Class2157
{
    @NotNull
    private final TileEntity Field15066;
    private String Field15067 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final TileEntity Method1440() {
        return this.Field15066;
    }
    
    public Class1509(@NotNull @NotNull final TileEntity field15066) {
        Intrinsics.checkParameterIsNotNull((Object)field15066, "tileEntity");
        super(new Object[0]);
        this.Field15066 = field15066;
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x62F3 ^ 0x73));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
