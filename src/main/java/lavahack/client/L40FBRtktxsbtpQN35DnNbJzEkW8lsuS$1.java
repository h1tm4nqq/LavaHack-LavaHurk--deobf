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
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "get"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$1
implements Supplier {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS Field8883;
    private int Field8884;

    public Object get() {
        return this.Method1197();
    }

    @NotNull
    @NotNull
    public final String Method1197() {
        String string;
        String string2;
        StringBuilder stringBuilder = new StringBuilder().append((char)((int)1043128652L ^ 0x3E2CE117));
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5186(this.Field8883) == null) {
            string2 = "no target no fun";
            return stringBuilder.append(string2).append((char)((long)-1527617729 ^ (long)-1527617694)).toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        EntityPlayer entityPlayer = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5186(this.Field8883);
        if (entityPlayer == null) {
            Intrinsics.throwNpe();
        }
        StringBuilder stringBuilder3 = stringBuilder2.append(entityPlayer.getName()).append("} | Operation: ");
        Object object = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5188(this.Field8883);
        if (object == null || (object = object.name()) == null) {
            object = "nothing";
        }
        StringBuilder stringBuilder4 = stringBuilder3.append((String)object).append(" | Next Hole: ");
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5190(this.Field8883) == null) {
            string = "no hole no fun";
        } else {
            StringBuilder stringBuilder5 = new StringBuilder();
            BlockPos blockPos = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5190(this.Field8883);
            if (blockPos == null) {
                Intrinsics.throwNpe();
            }
            StringBuilder stringBuilder6 = stringBuilder5.append(blockPos.getX()).append(((int)1007522605L ^ 0x3C0D9332) << 2);
            BlockPos blockPos2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5190(this.Field8883);
            if (blockPos2 == null) {
                Intrinsics.throwNpe();
            }
            string = stringBuilder6.append(blockPos2.getZ()).toString();
        }
        string2 = stringBuilder4.append(string).toString();
        return stringBuilder.append(string2).append((char)((long)-1527617729 ^ (long)-1527617694)).toString();
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$1(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        this.Field8883 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
    }

    private static String Method1198(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2064360499 ^ (long)-2064360499);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-760299630L ^ 0xD2AEBF6D);
            int n2 = ((int)-1647298949L ^ 0x9DD03606) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)269225466 ^ (long)269234449) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

