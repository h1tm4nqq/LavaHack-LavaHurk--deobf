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

public class Class907
extends OutputStream {
    private static final Minecraft Field11835 = Minecraft.getMinecraft();
    private final ByteBuffer Field11836 = ByteBuffer.allocate(8192);
    private int Field11837 = 0;
    private String Field11838 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void write(int n) throws IOException {
        if (this.Field11837 == -1) {
            throw new IOException("Output stream is closed");
        }
        this.Field11836.put((byte)n);
        ++this.Field11837;
    }

    @Override
    public void flush() throws IOException {
        if (this.Field11837 == -1) {
            throw new IOException("Output stream is closed");
        }
        byte[] byArray = this.Field11836.array();
        String string = new String(byArray, 0, this.Field11837);
        this.Field11836.clear();
        this.Field11837 = 0;
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation(string, new Object[0]);
        Class907.Field11835.ingameGUI.getChatGUI().printChatMessage((ITextComponent)textComponentTranslation);
    }

    @Override
    public void close() throws IOException {
        if (this.Field11837 == -1) {
            throw new IOException("Output stream is closed");
        }
        byte[] byArray = this.Field11836.array();
        String string = new String(byArray, 0, this.Field11837);
        this.Field11836.clear();
        this.Field11837 = -1;
        TextComponentTranslation textComponentTranslation = new TextComponentTranslation(string, new Object[0]);
        Class907.Field11835.ingameGUI.getChatGUI().printChatMessage((ITextComponent)textComponentTranslation);
    }

    private static String Method3762(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 165;
            cArray2[n] = (char)(cArray[n] ^ (0x152E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

