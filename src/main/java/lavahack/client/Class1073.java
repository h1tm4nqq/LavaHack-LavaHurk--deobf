/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import lavahack.client.Class106;
import lavahack.client.Class1184;
import lavahack.client.Class1215;
import lavahack.client.Class1223;
import lavahack.client.Class1798;
import lavahack.client.Class374;
import lavahack.client.Class871;

public class Class1073 {
    private final String Field12731;
    private String Field12732;
    private String Field12733;
    private String Field12734;
    private boolean Field12735;
    private List Field12736 = new ArrayList();
    private String Field12737 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1073(String string) {
        this.Field12731 = string;
    }

    public void Method4337(String string) {
        this.Field12732 = string;
    }

    public void Method4338(String string) {
        this.Field12733 = string;
    }

    public void Method4339(String string) {
        this.Field12734 = string;
    }

    public void Method4340(boolean bl) {
        this.Field12735 = bl;
    }

    public void Method4341(Class1215 class1215) {
        this.Field12736.add(class1215);
    }

    public void Method4342() throws IOException {
        Object object2;
        Serializable serializable;
        if (this.Field12732 == null && this.Field12736.isEmpty()) {
            throw new IllegalArgumentException("Set content or add at least one EmbedObject");
        }
        Class871 class871 = new Class871(this, null);
        class871.Method3663("content", this.Field12732);
        class871.Method3663("username", this.Field12733);
        class871.Method3663("avatar_url", this.Field12734);
        class871.Method3663("tts", this.Field12735);
        if (!this.Field12736.isEmpty()) {
            serializable = new ArrayList();
            for (Object object2 : this.Field12736) {
                Object object3;
                Class871 class8712 = new Class871(this, null);
                class8712.Method3663("title", ((Class1215)object2).Method4895());
                class8712.Method3663("description", ((Class1215)object2).Method4896());
                class8712.Method3663("url", ((Class1215)object2).Method4897());
                if (((Class1215)object2).Method4898() != null) {
                    class8712.Method3663("color", Class1215.Method4913((Class1215)object2).getRGB());
                }
                Class106 class106 = ((Class1215)object2).Method4899();
                Class1223 class1223 = ((Class1215)object2).Method4901();
                Class1798 class1798 = ((Class1215)object2).Method4900();
                Class374 class374 = ((Class1215)object2).Method4902();
                List list = ((Class1215)object2).Method4903();
                if (class106 != null) {
                    object3 = new Class871(this, null);
                    ((Class871)object3).Method3663("text", Class106.Method822(class106));
                    ((Class871)object3).Method3663("icon_url", Class106.Method823(class106));
                    class8712.Method3663("footer", object3);
                }
                if (class1223 != null) {
                    object3 = new Class871(this, null);
                    ((Class871)object3).Method3663("url", Class1223.Method4921(class1223));
                    class8712.Method3663("image", object3);
                }
                if (class1798 != null) {
                    object3 = new Class871(this, null);
                    ((Class871)object3).Method3663("url", Class1798.Method6810(class1798));
                    class8712.Method3663("thumbnail", object3);
                }
                if (class374 != null) {
                    object3 = new Class871(this, null);
                    ((Class871)object3).Method3663("name", Class374.Method1830(class374));
                    ((Class871)object3).Method3663("url", Class374.Method1831(class374));
                    ((Class871)object3).Method3663("icon_url", Class374.Method1832(class374));
                    class8712.Method3663("author", object3);
                }
                object3 = new ArrayList();
                for (Class1184 class1184 : list) {
                    Class871 class8713 = new Class871(this, null);
                    class8713.Method3663("name", Class1184.Method4769(class1184));
                    class8713.Method3663("value", Class1184.Method4770(class1184));
                    class8713.Method3663("inline", Class1184.Method4771(class1184));
                    object3.add(class8713);
                }
                class8712.Method3663("fields", object3.toArray());
                serializable.add(class8712);
            }
            class871.Method3663("embeds", serializable.toArray());
        }
        serializable = new URL(this.Field12731);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)((URL)serializable).openConnection();
        httpsURLConnection.addRequestProperty("Content-Type", "application/json");
        httpsURLConnection.addRequestProperty("User-Agent", "Java-DiscordWebhook-BY-Gelox_");
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setRequestMethod("POST");
        object2 = httpsURLConnection.getOutputStream();
        ((OutputStream)object2).write(class871.toString().getBytes());
        ((OutputStream)object2).flush();
        ((OutputStream)object2).close();
        httpsURLConnection.getInputStream().close();
        httpsURLConnection.disconnect();
    }

    private static String Method4343(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 64;
            cArray2[n] = (char)(cArray[n] ^ (0x7169 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

