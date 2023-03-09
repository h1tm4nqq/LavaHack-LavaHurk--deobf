//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1161;
import lavahack.client.Class1624;
import lavahack.client.Class254;
import lavahack.client.Class44;
import net.minecraft.client.renderer.GlStateManager;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventItemRenderer;", "kotlin.jvm.PlatformType", "invoke"})
final class Class1739
implements Class254 {
    public static final Class1739 Field15979 = new Class1739();
    private String Field15980 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6618((Class1624)object);
    }

    public final void Method6618(Class1624 class1624) {
        Class44 class44 = Class1161.Method4682(Class1161.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"handRotateX");
        GlStateManager.rotate((float)(class44.Method368() * class1624.Field15601), (float)1.0f, (float)0.0f, (float)0.0f);
        Class44 class442 = Class1161.Method4683(Class1161.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"handRotateY");
        GlStateManager.rotate((float)(class442.Method368() * class1624.Field15601), (float)0.0f, (float)1.0f, (float)0.0f);
        Class44 class443 = Class1161.Method4684(Class1161.Field13248);
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"handRotateZ");
        GlStateManager.rotate((float)(class443.Method368() * class1624.Field15601), (float)0.0f, (float)0.0f, (float)1.0f);
    }

    Class1739() {
    }

    private static String Method6619(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 128;
            cArray2[n] = (char)(cArray[n] ^ (0xDFC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

