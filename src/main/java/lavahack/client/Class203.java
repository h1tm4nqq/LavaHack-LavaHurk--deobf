//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1281;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class Class203
implements Supplier {
    final Class1281 Field8883;
    private int Field8884;

    public Object get() {
        return this.Method1197();
    }

    @NotNull
    @NotNull
    public final String Method1197() {
        String string;
        String string2;
        StringBuilder stringBuilder = new StringBuilder().append('[');
        if (Class1281.Method5186(this.Field8883) == null) {
            string2 = "no target no fun";
            return stringBuilder.append(string2).append(']').toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        EntityPlayer entityPlayer = Class1281.Method5186(this.Field8883);
        if (entityPlayer == null) {
            Intrinsics.throwNpe();
        }
        StringBuilder stringBuilder3 = stringBuilder2.append(entityPlayer.getName()).append("} | Operation: ");
        Object object = Class1281.Method5188(this.Field8883);
        if (object == null || (object = object.name()) == null) {
            object = "nothing";
        }
        StringBuilder stringBuilder4 = stringBuilder3.append((String)object).append(" | Next Hole: ");
        if (Class1281.Method5190(this.Field8883) == null) {
            string = "no hole no fun";
        } else {
            StringBuilder stringBuilder5 = new StringBuilder();
            BlockPos blockPos = Class1281.Method5190(this.Field8883);
            if (blockPos == null) {
                Intrinsics.throwNpe();
            }
            StringBuilder stringBuilder6 = stringBuilder5.append(blockPos.getX()).append('|');
            BlockPos blockPos2 = Class1281.Method5190(this.Field8883);
            if (blockPos2 == null) {
                Intrinsics.throwNpe();
            }
            string = stringBuilder6.append(blockPos2.getZ()).toString();
        }
        string2 = stringBuilder4.append(string).toString();
        return stringBuilder.append(string2).append(']').toString();
    }

    Class203(Class1281 class1281) {
        this.Field8883 = class1281;
    }

    private static String Method1198(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 250;
            cArray2[n] = (char)(cArray[n] ^ (0x3CEB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

