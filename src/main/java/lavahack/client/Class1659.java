//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.item.*;
import net.minecraft.client.entity.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderGetEntitiesINAABBexcluding;", "kotlin.jvm.PlatformType", "invoke" })
final class Class1659 implements Class254
{
    public static final Class1659 Field15722;
    private String Field15723 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public void Method979(final Object o) {
        this.Method6413((Class1894)o);
    }
    
    public final void Method6413(final Class1894 class1894) {
        if (Class1909.Method7082(Class1909.Field16809).Method365()) {
            if (Class1909.Method7085(Class1909.Field16809).Method365()) {
                final EntityPlayerSP player = Class1909.Method7080().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                if (!(player.getHeldItemMainhand().item instanceof ItemPickaxe)) {
                    return;
                }
            }
            class1894.Method158();
        }
    }
    
    static {
        Field15722 = new Class1659();
    }
    
    private static String Method6414(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7EDF ^ 0xE6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
