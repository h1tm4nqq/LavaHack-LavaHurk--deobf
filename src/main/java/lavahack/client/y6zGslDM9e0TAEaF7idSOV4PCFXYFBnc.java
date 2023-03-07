/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import lavahack.client.y6zGslDM9e0TAEaF7idSOV4PCFXYFBnc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.y6zGslDM9e0TAEaF7idSOV4PCFXYFBnc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\f\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/command/commands/TestCommand;", "Lcom/kisman/cc/features/command/Command;", "()V", "getDescription", "", "getSyntax", "runCommand", "", "s", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "SubTestCommand1", "SubTestCommand2", "kisman.cc"})
public final class y6zGslDM9e0TAEaF7idSOV4PCFXYFBnc
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private int Field15922;

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
        this.Method446(string, stringArray);
    }

    @Override
    @NotNull
    @NotNull
    public String Method447() {
        return "Just a test command";
    }

    @Override
    @NotNull
    @NotNull
    public String Method448() {
        return "test1 test2";
    }

    public y6zGslDM9e0TAEaF7idSOV4PCFXYFBnc() {
        super("test1");
        hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb[] hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray = new hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb[(int)((long)1891444580 ^ (long)1891444581) << 1];
        hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray[(int)((long)597728832 ^ (long)597728832)] = new y6zGslDM9e0TAEaF7idSOV4PCFXYFBnc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this);
        hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray[(int)-997773283L ^ 0xC487301C] = new y6zGslDM9e0TAEaF7idSOV4PCFXYFBnc$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this);
        this.Method445(hbD4kseV1VTER7aHOSIdAw4x7SiMKhfbArray);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2002375717 ^ (long)2002375717);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)372965500L ^ 0x163B0083);
            int n2 = (int)((long)658149264 ^ (long)658149325) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1824411449L ^ 0x6CBE43DA) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

