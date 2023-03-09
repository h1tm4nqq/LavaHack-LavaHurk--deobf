//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.multiplayer.WorldClient
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1048;
import lavahack.client.Class1325;
import lavahack.client.Class1471;
import lavahack.client.Class1568;
import lavahack.client.Class424;
import lavahack.client.Class948;
import net.minecraft.client.multiplayer.WorldClient;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "arg", "Lorg/cubic/dynamictask/ArgumentFetcher;", "call"})
final class Class306
implements Class1471 {
    public static final Class306 Field9311 = new Class306();
    private int Field9312;

    @Override
    public Object Method1564(Class424 class424) {
        return this.Method1580(class424);
    }

    public final float[] Method1580(@NotNull @NotNull Class424 class424) {
        Intrinsics.checkParameterIsNotNull((Object)class424, (String)"arg");
        Object object = class424.Method2054(1);
        if (object == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RotationLogic");
        }
        switch (Class948.Field12044[((Class1048)((Object)object)).ordinal()]) {
            case 1: {
                WorldClient worldClient = Class1325.Method5367().world;
                Object object2 = class424.Method2054(0);
                Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"arg.fetch(0)");
                float[] fArray = Class1568.Method6179(worldClient.getEntityByID(((Number)object2).intValue()));
                return fArray;
            }
            case 2: {
                WorldClient worldClient = Class1325.Method5367().world;
                Object object3 = class424.Method2054(0);
                Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)"arg.fetch(0)");
                float[] fArray = Class1568.Method6163(worldClient.getEntityByID(((Number)object3).intValue()));
                return fArray;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    Class306() {
    }

    private static String Method1581(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 190;
            cArray2[n] = (char)(cArray[n] ^ (0x2A3F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

