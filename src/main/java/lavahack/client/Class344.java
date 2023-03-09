//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Comparator;
import javax.swing.ImageIcon;
import lavahack.client.Class42;
import lavahack.client.Class873;
import lavahack.client.Class963;
import lavahack.client.Class97;

public class Class344
extends Class42 {
    @Class873
    public static Class344 Field9432;
    private int Field9433;

    public Class344() {
        super("BetterScreenshot", "offix sori no mne 'eto otchen nado ni termay repy poshaluysta", Class97.Field8339);
    }

    public static Image Method1698() throws IOException {
        ImageIcon imageIcon = new ImageIcon(Files.list(new File(Class344.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameDir.getAbsolutePath() + "/screenshots/").toPath()).filter(Class344::Method1702).max(Comparator.comparingLong(Class344::Method1701)).get().toString());
        if (imageIcon.getIconWidth() <= 0) return null;
        if (imageIcon.getIconHeight() <= 0) return null;
        Image image = imageIcon.getImage();
        return image;
    }

    public static void Method1699(Image image) {
        new Thread(() -> Class344.Method1700(image)).start();
    }

    private static void Method1700(Image image) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new Class963(image), null);
    }

    private static long Method1701(Path path) {
        return path.toFile().lastModified();
    }

    private static boolean Method1702(Path path) {
        if (Files.isDirectory(path, new LinkOption[0])) return false;
        return true;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 143;
            cArray2[n] = (char)(cArray[n] ^ (0x3040 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

