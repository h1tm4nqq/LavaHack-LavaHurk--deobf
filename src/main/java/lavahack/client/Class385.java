//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class1180;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class385
implements Supplier {
    public static final Class385 Field9614 = new Class385();
    private String Field9615 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object get() {
        return this.Method1861();
    }

    @NotNull
    @NotNull
    public final String Method1861() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append('[');
        if (Class1180.Field13362.Method5349() == null) {
            string = "No targets";
            return stringBuilder.append(string).append(']').toString();
        }
        Entity entity = Class1180.Field13362.Method5349();
        if (entity != null) {
            string = entity.getName();
            return stringBuilder.append(string).append(']').toString();
        }
        string = null;
        return stringBuilder.append(string).append(']').toString();
    }

    Class385() {
    }

    private static String Method1862(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 234;
            cArray2[n] = (char)(cArray[n] ^ (0x4BD9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

