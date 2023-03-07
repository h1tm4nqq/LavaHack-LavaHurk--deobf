//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketChat
 *  net.minecraft.util.text.TextComponentString
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.util.text.TextComponentString;

public class izbWdj2ogdqtHQe8DQ4vANuXMqhYPWxD
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static izbWdj2ogdqtHQe8DQ4vANuXMqhYPWxD Field11583;
    public ArrayList Field11584 = new ArrayList();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field11585 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method3585, new Predicate[(int)((long)-1869641454 ^ (long)-1869641454)]);
    private int Field11586;

    public izbWdj2ogdqtHQe8DQ4vANuXMqhYPWxD() {
        super("AntiSpammer", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        Field11583 = this;
    }

    @Override
    public boolean Method52() {
        return (int)((long)891070256 ^ (long)891070257) != 0;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field11585);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field11585);
    }

    private void Method3585(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketChat)) return;
        if (!((SPacketChat)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).isSystem()) {
            return;
        }
        String string = ((SPacketChat)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).chatComponent.getFormattedText();
        Iterator iterator = this.Field11584.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                ((SPacketChat)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).chatComponent = new TextComponentString(string);
                return;
            }
            String string2 = (String)iterator.next();
            string = string.replaceAll(string2, "");
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1562987001L ^ 0x5D2949F9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-887256299 ^ (long)-887256086);
            int n2 = (int)((long)-839495488 ^ (long)-839495501);
            cArray2[n] = (char)(cArray[n] ^ (((int)-2049390090L ^ 0x85D8C5F5) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

