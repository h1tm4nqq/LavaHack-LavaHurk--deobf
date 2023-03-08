//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import java.nio.*;
import java.io.*;
import net.minecraft.util.text.*;

public class Class907 extends OutputStream
{
    private static final Minecraft Field11835;
    private final ByteBuffer Field11836;
    private int Field11837;
    private String Field11838 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class907() {
        this.Field11836 = ByteBuffer.allocate(8192);
        this.Field11837 = 0;
    }
    
    @Override
    public void write(final int n) throws IOException {
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
        final String s = new String(this.Field11836.array(), 0, this.Field11837);
        this.Field11836.clear();
        this.Field11837 = 0;
        Class907.Field11835.ingameGUI.getChatGUI().printChatMessage((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    @Override
    public void close() throws IOException {
        if (this.Field11837 == -1) {
            throw new IOException("Output stream is closed");
        }
        final String s = new String(this.Field11836.array(), 0, this.Field11837);
        this.Field11836.clear();
        this.Field11837 = -1;
        Class907.Field11835.ingameGUI.getChatGUI().printChatMessage((ITextComponent)new TextComponentTranslation(s, new Object[0]));
    }
    
    static {
        Field11835 = Minecraft.getMinecraft();
    }
    
    private static String Method3762(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x152E ^ 0xA5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
