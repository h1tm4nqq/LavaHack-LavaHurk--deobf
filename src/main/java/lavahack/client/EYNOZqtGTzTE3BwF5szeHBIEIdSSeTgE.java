//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 */
package lavahack.client;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class EYNOZqtGTzTE3BwF5szeHBIEIdSSeTgE
extends OutputStream {
    private static final Minecraft Field11835 = Minecraft.getMinecraft();
    private final ByteBuffer Field11836 = ByteBuffer.allocate((int)((long)-436883768 ^ (long)-436883767) << 13);
    private int Field11837 = (int)-57298656L ^ 0xFC95B120;
    private String Field11838 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void write(int n) throws IOException {
        if (this.Field11837 == (int)((long)1045760795 ^ (long)-1045760796)) {
            throw new IOException("Output stream is closed");
        }
        this.Field11836.put((byte)n);
        this.Field11837 += (int)((long)332728152 ^ (long)332728153);
    }

    @Override
    public void flush() throws IOException {
        if (this.Field11837 == (int)((long)-78958882 ^ (long)78958881)) {
            throw new IOException("Output stream is closed");
        }
        byte[] byArray = this.Field11836.array();
        String string = new String(byArray, (int)((long)138097919 ^ (long)138097919), this.Field11837);
        this.Field11836.clear();
        this.Field11837 = (int)((long)-1808181025 ^ (long)-1808181025);
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation(string, new Object[(int)-574276790L ^ 0xDDC53B4A]);
        EYNOZqtGTzTE3BwF5szeHBIEIdSSeTgE.Field11835.ingameGUI.getChatGUI().printChatMessage((ITextComponent)textComponentTranslation);
    }

    @Override
    public void close() throws IOException {
        if (this.Field11837 == (int)((long)-471880964 ^ (long)471880963)) {
            throw new IOException("Output stream is closed");
        }
        byte[] byArray = this.Field11836.array();
        String string = new String(byArray, (int)((long)-1541446490 ^ (long)-1541446490), this.Field11837);
        this.Field11836.clear();
        this.Field11837 = (int)431152996L ^ 0xE64D209B;
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation(string, new Object[(int)1437945380L ^ 0x55B54E24]);
        EYNOZqtGTzTE3BwF5szeHBIEIdSSeTgE.Field11835.ingameGUI.getChatGUI().printChatMessage((ITextComponent)textComponentTranslation);
    }

    private static String Method3762(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-450294393L ^ 0xE5290D87;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-906286228L ^ 0xC9FB2B93);
            int n2 = (int)((long)-632418501 ^ (long)-632418402);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1515501434 ^ (long)1515503085) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

