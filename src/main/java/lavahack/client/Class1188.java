//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.file.attribute.*;
import java.nio.file.*;

public class Class1188
{
    private String Field13384 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Path Method4782(final Path path, final String... array) {
        if (array.length < 1) {
            return path;
        }
        final Path method4784 = Method4784(path, array);
        Method4783(method4784);
        return method4784;
    }
    
    public static void Method4783(final Path path) {
        if (!Files.isDirectory(path, new LinkOption[0])) {
            if (Files.exists(path, new LinkOption[0])) {
                Files.delete(path);
            }
            Files.createDirectories(path, (FileAttribute<?>[])new FileAttribute[0]);
        }
    }
    
    public static Path Method4784(final Path path, final String... more) {
        return Paths.get(path.toString(), more);
    }
}
