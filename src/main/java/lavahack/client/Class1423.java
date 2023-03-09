//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class1497;
import net.minecraft.entity.player.EntityPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "get"})
final class Class1423
implements Supplier {
    public static final Class1423 Field14620 = new Class1423();
    private String Field14621 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method5686();
    }

    public final String Method5686() {
        if (Class1497.Method6015(Class1497.Field15034).Method496() == null) {
            return "";
        }
        EntityPlayer entityPlayer = Class1497.Method6015(Class1497.Field15034).Method496();
        String string = '[' + (entityPlayer != null ? entityPlayer.getName() : null) + ']';
        return string;
    }

    Class1423() {
    }

    private static String Method5687(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 142;
            cArray2[n] = (char)(cArray[n] ^ (0x3DAC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

