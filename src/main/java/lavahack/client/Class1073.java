//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import javax.net.ssl.*;
import java.net.*;
import java.util.*;
import java.io.*;

public class Class1073
{
    private final String Field12731;
    private String Field12732;
    private String Field12733;
    private String Field12734;
    private boolean Field12735;
    private List Field12736;
    private String Field12737 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1073(final String field12731) {
        this.Field12736 = new ArrayList();
        this.Field12731 = field12731;
    }
    
    public void Method4337(final String field12732) {
        this.Field12732 = field12732;
    }
    
    public void Method4338(final String field12733) {
        this.Field12733 = field12733;
    }
    
    public void Method4339(final String field12734) {
        this.Field12734 = field12734;
    }
    
    public void Method4340(final boolean field12735) {
        this.Field12735 = field12735;
    }
    
    public void Method4341(final Class1215 class1215) {
        this.Field12736.add(class1215);
    }
    
    public void Method4342() throws IOException {
        if (this.Field12732 == null && this.Field12736.isEmpty()) {
            throw new IllegalArgumentException("Set content or add at least one EmbedObject");
        }
        final Class871 class871 = new Class871(this, null);
        class871.Method3663("content", this.Field12732);
        class871.Method3663("username", this.Field12733);
        class871.Method3663("avatar_url", this.Field12734);
        class871.Method3663("tts", this.Field12735);
        if (!this.Field12736.isEmpty()) {
            final ArrayList<Class871> list = new ArrayList<Class871>();
            for (final Class1215 class872 : this.Field12736) {
                final Class871 class873 = new Class871(this, null);
                class873.Method3663("title", class872.Method4895());
                class873.Method3663("description", class872.Method4896());
                class873.Method3663("url", class872.Method4897());
                if (class872.Method4898() != null) {
                    class873.Method3663("color", Class1215.Method4913(class872).getRGB());
                }
                final Class106 method4899 = class872.Method4899();
                final Class1223 method4900 = class872.Method4901();
                final Class1798 method4901 = class872.Method4900();
                final Class374 method4902 = class872.Method4902();
                final List method4903 = class872.Method4903();
                if (method4899 != null) {
                    final Class871 class874 = new Class871(this, null);
                    class874.Method3663("text", Class106.Method822(method4899));
                    class874.Method3663("icon_url", Class106.Method823(method4899));
                    class873.Method3663("footer", class874);
                }
                if (method4900 != null) {
                    final Class871 class875 = new Class871(this, null);
                    class875.Method3663("url", Class1223.Method4921(method4900));
                    class873.Method3663("image", class875);
                }
                if (method4901 != null) {
                    final Class871 class876 = new Class871(this, null);
                    class876.Method3663("url", Class1798.Method6810(method4901));
                    class873.Method3663("thumbnail", class876);
                }
                if (method4902 != null) {
                    final Class871 class877 = new Class871(this, null);
                    class877.Method3663("name", Class374.Method1830(method4902));
                    class877.Method3663("url", Class374.Method1831(method4902));
                    class877.Method3663("icon_url", Class374.Method1832(method4902));
                    class873.Method3663("author", class877);
                }
                final ArrayList<Class871> list2 = new ArrayList<Class871>();
                for (final Class1184 class878 : method4903) {
                    final Class871 class879 = new Class871(this, null);
                    class879.Method3663("name", Class1184.Method4769(class878));
                    class879.Method3663("value", Class1184.Method4770(class878));
                    class879.Method3663("inline", Class1184.Method4771(class878));
                    list2.add(class879);
                }
                class873.Method3663("fields", list2.toArray());
                list.add(class873);
            }
            class871.Method3663("embeds", list.toArray());
        }
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(this.Field12731).openConnection();
        httpsURLConnection.addRequestProperty("Content-Type", "application/json");
        httpsURLConnection.addRequestProperty("User-Agent", "Java-DiscordWebhook-BY-Gelox_");
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setRequestMethod("POST");
        final OutputStream outputStream = httpsURLConnection.getOutputStream();
        outputStream.write(class871.toString().getBytes());
        outputStream.flush();
        outputStream.close();
        httpsURLConnection.getInputStream().close();
        httpsURLConnection.disconnect();
    }
    
    private static String Method4343(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7169 ^ 0x40));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
