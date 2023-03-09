/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class1842;
import lavahack.client.Class2106;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/manager/file/FileManager$Companion;", "", "()V", "image", "", "getImage", "Lcom/kisman/cc/util/render/image/NameableImage;", "kisman.cc"})
public final class Class658 {
    private int Field10809;

    @Nullable
    @Nullable
    public final Class2106 Method2833() {
        if (!Files.exists(Paths.get("kisman.cc/Images/", new String[0]), new LinkOption[0])) return null;
        File file = null;
        if (Files.exists(Paths.get("kisman.cc/Images/image.png", new String[0]), new LinkOption[0])) {
            file = Paths.get("kisman.cc/Images/image.png", new String[0]).toFile();
        }
        if (Files.exists(Paths.get("kisman.cc/Images/image.jpg", new String[0]), new LinkOption[0])) {
            file = Paths.get("kisman.cc/Images/image.jpg", new String[0]).toFile();
        }
        if (Files.exists(Paths.get("kisman.cc/Images/image.jpeg", new String[0]), new LinkOption[0])) {
            file = Paths.get("kisman.cc/Images/image.jpeg", new String[0]).toFile();
        }
        if (file == null) {
            return null;
        }
        String string = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"file.name");
        List list = StringsKt.split$default((CharSequence)string, (String[])new String[]{"\\."}, (boolean)false, (int)0, (int)6, null);
        String string2 = (String)list.get(list.size() - 1);
        String string3 = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"file.name");
        BufferedImage bufferedImage = Class1842.Field16498.Method1594(Class1842.Field16498.Method1596(file));
        String string4 = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"file.name");
        return new Class2106(string3, Class1842.Field16498.Method1593(bufferedImage, string2, string4));
    }

    private Class658() {
    }

    public Class658(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method2834(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 220;
            cArray2[n] = (char)(cArray[n] ^ (0x62FB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

