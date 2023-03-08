//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.tileentity.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/event/events/RenderTileEntityEvent$Pre;", "Lcom/kisman/cc/event/events/RenderTileEntityEvent;", "tileEntity", "Lnet/minecraft/tileentity/TileEntity;", "(Lnet/minecraft/tileentity/TileEntity;)V", "kisman.cc" })
public final class Class564 extends Class1509
{
    private String Field10400 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class564(@NotNull @NotNull final TileEntity tileEntity) {
        Intrinsics.checkParameterIsNotNull((Object)tileEntity, "tileEntity");
        super(tileEntity);
    }
    
    private static String Method170(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x71C0 ^ 0x52));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
