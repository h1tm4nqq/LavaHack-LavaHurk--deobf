//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.nio.file.*;

public class Class344 extends Class42
{
    @Class873
    public static Class344 Field9432;
    private int Field9433;
    
    public Class344() {
        super("BetterScreenshot", "offix sori no mne 'eto otchen nado ni termay repy poshaluysta", Class97.Field8339);
    }
    
    public static Image Method1698() throws IOException {
        final ImageIcon imageIcon = new ImageIcon(Files.list(new File(Class344.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameDir.getAbsolutePath() + "/screenshots/").toPath()).filter(Class344::Method1702).max(Comparator.comparingLong((ToLongFunction<? super Path>)Class344::Method1701)).get().toString());
        return (imageIcon.getIconWidth() > 0 && imageIcon.getIconHeight() > 0) ? imageIcon.getImage() : null;
    }
    
    public static void Method1699(final Image image) {
        new Thread(Class344::Method1700).start();
    }
    
    private static void Method1700(final Image image) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new Class963(image), null);
    }
    
    private static long Method1701(final Path path) {
        return path.toFile().lastModified();
    }
    
    private static boolean Method1702(final Path path) {
        return !Files.isDirectory(path, new LinkOption[0]);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3040 ^ 0x8F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
