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
import lavahack.client.GaPkLPXZTwYvvRmB2XEhAJnYS1rwmqZs;
import lavahack.client.NbhfvI825x7ikO8mf4BYe08WilIp6lqm;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/manager/file/FileManager$Companion;", "", "()V", "image", "", "getImage", "Lcom/kisman/cc/util/render/image/NameableImage;", "kisman.cc"})
public final class OFncWSVjhjOmOkuV9Of5vy9mElGH4a9v$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private int Field10809;

    @Nullable
    @Nullable
    public final GaPkLPXZTwYvvRmB2XEhAJnYS1rwmqZs Method2833() {
        if (!Files.exists(Paths.get("kisman.cc/Images/", new String[(int)((long)-1504876325 ^ (long)-1504876325)]), new LinkOption[(int)((long)1879961747 ^ (long)1879961747)])) return null;
        File file = null;
        if (Files.exists(Paths.get("kisman.cc/Images/image.png", new String[(int)-470762334L ^ 0xE3F0BCA2]), new LinkOption[(int)997193379L ^ 0x3B6FF6A3])) {
            file = Paths.get("kisman.cc/Images/image.png", new String[(int)744610233L ^ 0x2C61D9B9]).toFile();
        }
        if (Files.exists(Paths.get("kisman.cc/Images/image.jpg", new String[(int)1984955759L ^ 0x7650056F]), new LinkOption[(int)-847246740L ^ 0xCD800A6C])) {
            file = Paths.get("kisman.cc/Images/image.jpg", new String[(int)((long)-1965792241 ^ (long)-1965792241)]).toFile();
        }
        if (Files.exists(Paths.get("kisman.cc/Images/image.jpeg", new String[(int)-1273402873L ^ 0xB4196A07]), new LinkOption[(int)1754768549L ^ 0x6897A4A5])) {
            file = Paths.get("kisman.cc/Images/image.jpeg", new String[(int)((long)-206568234 ^ (long)-206568234)]).toFile();
        }
        if (file == null) {
            return null;
        }
        String string = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"file.name");
        String[] stringArray = new String[(int)((long)1030598305 ^ (long)1030598304)];
        stringArray[(int)1694187789L ^ 0x64FB410D] = "\\.";
        List list = StringsKt.split$default((CharSequence)string, (String[])stringArray, ((int)128791879L ^ 0x7AD3547) != 0, (int)((int)((long)651068404 ^ (long)651068404)), (int)(((int)1248708071L ^ 0x4A6DC5E4) << 1), null);
        String string2 = (String)list.get(list.size() - (int)((long)-513822859 ^ (long)-513822860));
        String string3 = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"file.name");
        BufferedImage bufferedImage = NbhfvI825x7ikO8mf4BYe08WilIp6lqm.Field16498.Method1594(NbhfvI825x7ikO8mf4BYe08WilIp6lqm.Field16498.Method1596(file));
        String string4 = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"file.name");
        return new GaPkLPXZTwYvvRmB2XEhAJnYS1rwmqZs(string3, NbhfvI825x7ikO8mf4BYe08WilIp6lqm.Field16498.Method1593(bufferedImage, string2, string4));
    }

    private OFncWSVjhjOmOkuV9Of5vy9mElGH4a9v$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public OFncWSVjhjOmOkuV9Of5vy9mElGH4a9v$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method2834(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)890124301L ^ 0x350E380D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-145127631 ^ (long)-145127474);
            int n2 = ((int)2054317718L ^ 0x7A7266A1) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1347519573L ^ 0xAFAE1950 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

