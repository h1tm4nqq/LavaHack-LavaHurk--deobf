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
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.kH5qweyg5D4KZEzu1aXxMsKPxNoU8khU;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;

public class GzmoWF6qmgY8MP6NqLQIkvJFGmBKIYzk
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static GzmoWF6qmgY8MP6NqLQIkvJFGmBKIYzk Field9432;
    private int Field9433;

    public GzmoWF6qmgY8MP6NqLQIkvJFGmBKIYzk() {
        super("BetterScreenshot", "offix sori no mne 'eto otchen nado ni termay repy poshaluysta", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
    }

    public static Image Method1698() throws IOException {
        ImageIcon imageIcon = new ImageIcon(Files.list(new File(GzmoWF6qmgY8MP6NqLQIkvJFGmBKIYzk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameDir.getAbsolutePath() + "/screenshots/").toPath()).filter(GzmoWF6qmgY8MP6NqLQIkvJFGmBKIYzk::Method1702).max(Comparator.comparingLong(GzmoWF6qmgY8MP6NqLQIkvJFGmBKIYzk::Method1701)).get().toString());
        if (imageIcon.getIconWidth() <= 0) return null;
        if (imageIcon.getIconHeight() <= 0) return null;
        Image image = imageIcon.getImage();
        return image;
    }

    public static void Method1699(Image image) {
        new Thread(() -> GzmoWF6qmgY8MP6NqLQIkvJFGmBKIYzk.Method1700(image)).start();
    }

    private static void Method1700(Image image) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new kH5qweyg5D4KZEzu1aXxMsKPxNoU8khU(image), null);
    }

    private static long Method1701(Path path) {
        return path.toFile().lastModified();
    }

    private static boolean Method1702(Path path) {
        int n;
        if (!Files.isDirectory(path, new LinkOption[(int)((long)-123387423 ^ (long)-123387423)])) {
            n = (int)-626438014L ^ 0xDAA95083;
            return n != 0;
        }
        n = (int)((long)1304578160 ^ (long)1304578160);
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)151308836 ^ (long)151308836);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)11012008 ^ (long)11011927);
            int n2 = (int)((long)535244452 ^ (long)535244331);
            cArray2[n] = (char)(cArray[n] ^ (((int)1667418142L ^ 0x6362C8DF) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

