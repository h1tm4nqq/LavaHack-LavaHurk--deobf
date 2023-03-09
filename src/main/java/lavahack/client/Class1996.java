/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1303;
import lavahack.client.Class44;
import lavahack.client.Class941;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\nH\u0016J*\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r\"\f\b\u0000\u0010\u000b*\u0006\u0012\u0002\b\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0016R$\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0005j\b\u0012\u0004\u0012\u00020\u0001`\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/settings/types/SettingGroup;", "Lcom/kisman/cc/settings/Setting;", "setting", "(Lcom/kisman/cc/settings/Setting;)V", "settings", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSettings", "()Ljava/util/ArrayList;", "add", "Lcom/kisman/cc/settings/types/SettingArray;", "T", "array", "Lcom/kisman/cc/settings/types/SettingEnum;", "", "enum", "group", "kisman.cc"})
public class Class1996
extends Class44 {
    @NotNull
    private final ArrayList Field17176;
    private String Field17177 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public ArrayList Method7404() {
        return this.Field17176;
    }

    @NotNull
    @NotNull
    public Class44 Method7405(@NotNull @NotNull Class44 class44) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        class44.Field8086 = this;
        this.Method7404().add(class44);
        return class44;
    }

    @NotNull
    @NotNull
    public Class1996 Method7406(@NotNull @NotNull Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, (String)"group");
        class1996.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm = this;
        this.Method7404().add(class1996);
        return class1996;
    }

    @NotNull
    @NotNull
    public Class1303 Method7407(@NotNull @NotNull Class1303 class1303) {
        Intrinsics.checkParameterIsNotNull((Object)class1303, (String)"enum");
        class1303.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm = this;
        this.Method7404().add(class1303);
        return class1303;
    }

    @NotNull
    @NotNull
    public Class941 Method7408(@NotNull @NotNull Class941 class941) {
        Intrinsics.checkParameterIsNotNull((Object)class941, (String)"array");
        class941.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm = this;
        this.Method7404().add(class941);
        return class941;
    }

    public Class1996(@NotNull @NotNull Class44 class44) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        super(class44.Method356(), class44.Method358());
        this.Field17176 = new ArrayList();
        this.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk = "Group";
        this.Method313(class44.Field8073);
    }

    private static String Method409(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x220C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

