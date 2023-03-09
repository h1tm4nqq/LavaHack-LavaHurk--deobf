/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class Class1188 {
    private String Field13384 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Path Method4782(Path path, String ... stringArray) {
        if (stringArray.length < 1) {
            return path;
        }
        Path path2 = Class1188.Method4784(path, stringArray);
        Class1188.Method4783(path2);
        return path2;
    }

    public static void Method4783(Path path) {
        if (Files.isDirectory(path, new LinkOption[0])) return;
        if (Files.exists(path, new LinkOption[0])) {
            Files.delete(path);
        }
        Files.createDirectories(path, new FileAttribute[0]);
    }

    public static Path Method4784(Path path, String ... stringArray) {
        return Paths.get(path.toString(), stringArray);
    }
}

