//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.nio.file.*;
import java.io.*;
import kotlin.text.*;
import java.util.*;
import java.awt.image.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T?\u0006\u0002\n\u0000?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/util/manager/file/FileManager$Companion;", "", "()V", "image", "", "getImage", "Lcom/kisman/cc/util/render/image/NameableImage;", "kisman.cc" })
public final class Class658
{
    private int Field10809;
    
    @Nullable
    @Nullable
    public final Class2106 Method2833() {
        if (!Files.exists(Paths.get("kisman.cc/Images/", new String[0]), new LinkOption[0])) {
            return null;
        }
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
        final String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)name, "file.name");
        final List split$default = StringsKt.split$default((CharSequence)name, new String[] { "\\." }, false, 0, 6, (Object)null);
        final String s = split$default.get(split$default.size() - 1);
        final String name2 = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)name2, "file.name");
        final Class313 field16498 = Class1842.Field16498;
        final BufferedImage method1594 = Class1842.Field16498.Method1594(Class1842.Field16498.Method1596(file));
        final String s2 = s;
        final String name3 = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)name3, "file.name");
        return new Class2106(name2, field16498.Method1593(method1594, s2, name3));
    }
    
    private Class658() {
    }
    
    public Class658(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method2834(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x62FB ^ 0xDC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
