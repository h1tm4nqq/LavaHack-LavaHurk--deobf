//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.item.ItemPickaxe
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1894;
import lavahack.client.Class1909;
import lavahack.client.Class254;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemPickaxe;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventRenderGetEntitiesINAABBexcluding;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1659
implements Class254 {
    public static final Class1659 Field15722 = new Class1659();
    private String Field15723 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6413((Class1894)object);
    }

    public final void Method6413(Class1894 class1894) {
        if (!Class1909.Method7082(Class1909.Field16809).Method365()) return;
        if (Class1909.Method7085(Class1909.Field16809).Method365()) {
            EntityPlayerSP entityPlayerSP = Class1909.Method7080().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemPickaxe)) return;
        }
        class1894.Method158();
    }

    Class1659() {
    }

    private static String Method6414(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 230;
            cArray2[n] = (char)(cArray[n] ^ (0x7EDF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

