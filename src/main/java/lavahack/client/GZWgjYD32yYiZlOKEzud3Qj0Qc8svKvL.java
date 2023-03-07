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
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;

public class GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL {
    private final String Field12731;
    private String Field12732;
    private String Field12733;
    private String Field12734;
    private boolean Field12735;
    private List Field12736 = new ArrayList();
    private String Field12737 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL(String string) {
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

    public void Method4341(GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        this.Field12736.add(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
    }

    public void Method4342() throws IOException {
        Object object2;
        Serializable serializable;
        if (this.Field12732 == null && this.Field12736.isEmpty()) {
            throw new IllegalArgumentException("Set content or add at least one EmbedObject");
        }
        GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, null);
        gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method3663("content", this.Field12732);
        gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method3663("username", this.Field12733);
        gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method3663("avatar_url", this.Field12734);
        gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method3663("tts", this.Field12735);
        if (!this.Field12736.isEmpty()) {
            serializable = new ArrayList();
            for (Object object2 : this.Field12736) {
                Object object3;
                GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2 = new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, null);
                gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("title", ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4895());
                gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("description", ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4896());
                gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("url", ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4897());
                if (((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4898() != null) {
                    gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("color", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4913((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).getRGB());
                }
                GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4899();
                GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4901();
                GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4900();
                GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4902();
                List list = ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object2).Method4903();
                if (gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV != null) {
                    object3 = new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, null);
                    ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object3).Method3663("text", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method822(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV));
                    ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object3).Method3663("icon_url", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method823(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV));
                    gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("footer", object3);
                }
                if (gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV != null) {
                    object3 = new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, null);
                    ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object3).Method3663("url", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method4921(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV));
                    gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("image", object3);
                }
                if (gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS != null) {
                    object3 = new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, null);
                    ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object3).Method3663("url", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Method6810(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS));
                    gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("thumbnail", object3);
                }
                if (gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi != null) {
                    object3 = new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, null);
                    ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object3).Method3663("name", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1830(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
                    ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object3).Method3663("url", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1831(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
                    ((GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)object3).Method3663("icon_url", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1832(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
                    gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("author", object3);
                }
                object3 = new ArrayList();
                for (GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf : list) {
                    GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf3 = new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this, null);
                    gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf3.Method3663("name", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4769(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf));
                    gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf3.Method3663("value", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4770(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf));
                    gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf3.Method3663("inline", GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4771(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf));
                    object3.add(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf3);
                }
                gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2.Method3663("fields", object3.toArray());
                serializable.add(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf2);
            }
            gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method3663("embeds", serializable.toArray());
        }
        serializable = new URL(this.Field12731);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection)((URL)serializable).openConnection();
        httpsURLConnection.addRequestProperty("Content-Type", "application/json");
        httpsURLConnection.addRequestProperty("User-Agent", "Java-DiscordWebhook-BY-Gelox_");
        httpsURLConnection.setDoOutput((boolean)((long)-514868275 ^ (long)-514868276));
        httpsURLConnection.setRequestMethod("POST");
        object2 = httpsURLConnection.getOutputStream();
        ((OutputStream)object2).write(gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.toString().getBytes());
        ((OutputStream)object2).flush();
        ((OutputStream)object2).close();
        httpsURLConnection.getInputStream().close();
        httpsURLConnection.disconnect();
    }

    private static String Method4343(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1772318050L ^ 0x69A36D62;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1708756498 ^ (long)-1708756719);
            int n2 = (int)((long)-1950003218 ^ (long)-1950003217) << 6;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1305909924 ^ (long)-1305930699) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

