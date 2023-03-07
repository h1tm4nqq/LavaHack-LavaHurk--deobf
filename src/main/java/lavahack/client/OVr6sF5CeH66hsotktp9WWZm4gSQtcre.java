//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  org.luaj.vm2.LuaClosure
 *  org.luaj.vm2.LuaValue
 */
package lavahack.client;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import lavahack.client.EJSYf7r1COZvKlg7PH8TWM417l2JJTGY;
import lavahack.client.Fyymy8MPWe9GTgSZGRyDRSPKb14FqQfA;
import lavahack.client.GI1YnXdds8IVC7IycuwMgptf06CmJ6TH;
import lavahack.client.GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt;
import lavahack.client.IqjHyBio3p7KLnDEo6TGyuKf2errkonL;
import lavahack.client.KrODVIZzxxZYv96r6plLVRVsjcTDoRSN;
import lavahack.client.OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD;
import lavahack.client.QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XbdjV0hZ7jYtQAOzyWjweTKHEH2QyutI;
import lavahack.client.eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA;
import lavahack.client.enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL;
import lavahack.client.fDlfsOBGafTXq7BTM3GLq7xDwN5OZ2lN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh;
import lavahack.client.jjOnRBuMSSIqT9K6LVXkirV6TXviXau2;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT;
import lavahack.client.rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG;
import lavahack.client.vgnqQU2rNWykQSfirGoZNZFudeuwvXWu;
import net.minecraft.client.Minecraft;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaValue;

public class OVr6sF5CeH66hsotktp9WWZm4gSQtcre
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    protected JsonObject Field12878 = new JsonObject();
    public transient String Field12879;
    private final Path Field12880;
    private boolean Field12881;
    public final transient List Field12882 = new ArrayList();
    public final transient List Field12883 = new ArrayList();
    public final transient List Field12884 = new ArrayList();
    private String Field12885 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public OVr6sF5CeH66hsotktp9WWZm4gSQtcre(String string, String string2) throws IOException {
        super(string, string2, qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8347);
        String[] stringArray = new String[(int)((long)784857851 ^ (long)784857850)];
        stringArray[(int)((long)1345816225 ^ (long)1345816225)] = string;
        this.Field12880 = Paths.get("kisman.cc/Lua/", stringArray);
        this.Field12879 = new String(Files.readAllBytes(this.Field12880));
    }

    public IqjHyBio3p7KLnDEo6TGyuKf2errkonL Method4452(String string) {
        return this.Field12883.stream().filter(arg_0 -> OVr6sF5CeH66hsotktp9WWZm4gSQtcre.Method4464(string, arg_0)).findFirst().orElse(null);
    }

    public void Method4453() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16280.Field10992.clear();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16280.Field10990.clear();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16280.Field10991.clear();
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("lua");
        this.Method4455(scriptEngine);
        scriptEngine.eval(this.Field12879);
        scriptEngine.eval("main()");
        if (this.Field12878.has("__toggled")) {
            this.Method21(this.Field12878.get("__toggled").getAsBoolean());
        }
        this.Field12878 = new JsonObject();
        this.Field12881 = (int)-1478664675L ^ 0xA7DD5E1C;
    }

    public void Method4454(boolean bl) {
        this.Field12881 = (int)-2016971223L ^ 0x87C77629;
        if (bl) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16283.Field15891.remove(this);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16280.Field10992.clear();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16280.Field10990.clear();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16280.Field10991.clear();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.removeAll(this.Field12883);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6788();
        }
        Iterator iterator = this.Field12883.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.removeAll(this.Field12883);
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Field9235.removeAll(this.Field12884);
                this.Field12883.clear();
                this.Field12884.clear();
                this.Field12882.clear();
                return;
            }
            IqjHyBio3p7KLnDEo6TGyuKf2errkonL iqjHyBio3p7KLnDEo6TGyuKf2errkonL = (IqjHyBio3p7KLnDEo6TGyuKf2errkonL)iterator.next();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258.Method7570().removeIf(arg_0 -> this.Method4463(iqjHyBio3p7KLnDEo6TGyuKf2errkonL, arg_0));
        }
    }

    public void Method20() {
        this.Field12879 = new String(Files.readAllBytes(this.Field12880));
        this.Method4454(((int)-1352214180L ^ 0xAF66D95C) != 0);
        this.Method4453();
    }

    private void Method4455(ScriptEngine scriptEngine) {
        scriptEngine.put("mc", Minecraft.getMinecraft());
        scriptEngine.put("this", this);
        scriptEngine.put("textOf", new Fyymy8MPWe9GTgSZGRyDRSPKb14FqQfA());
        scriptEngine.put("box", new rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG());
        scriptEngine.put("vec2d", new QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz());
        scriptEngine.put("vec3d", new r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT());
        scriptEngine.put("color", (Object)new XbdjV0hZ7jYtQAOzyWjweTKHEH2QyutI());
        scriptEngine.put("colorutil", enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL.Method6379());
        scriptEngine.put("StopWatch", (Object)new eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA());
        scriptEngine.put("client", leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241);
        scriptEngine.put("renderer", GI1YnXdds8IVC7IycuwMgptf06CmJ6TH.Method7074());
        scriptEngine.put("globals", OkOddXa5CSlIjPrP8NCn9tV8gPV3kzXD.Method3193());
        scriptEngine.put("interactions", KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.Method3023());
        scriptEngine.put("files", jjOnRBuMSSIqT9K6LVXkirV6TXviXau2.Method7220());
        scriptEngine.put("Module", IqjHyBio3p7KLnDEo6TGyuKf2errkonL.Method6517());
        scriptEngine.put("GuiBuilder", EJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Method4644());
        scriptEngine.put("rotations", leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16282);
        scriptEngine.put("net", vgnqQU2rNWykQSfirGoZNZFudeuwvXWu.Field12183.Method985());
        scriptEngine.put("Builder", (Object)new fDlfsOBGafTXq7BTM3GLq7xDwN5OZ2lN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        scriptEngine.put("setmgr", leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16258);
    }

    public gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh Method4456(String string, LuaClosure luaClosure) {
        gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2 = new gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh(string, luaClosure, this);
        this.Field12882.add(gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2);
        return gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2;
    }

    public void Method4457(String string, LuaValue luaValue) {
        if (this.Field12882 == null) return;
        if (this.Field12882.isEmpty()) {
            return;
        }
        int n = (int)((long)1569776642 ^ (long)1569776642);
        while (n < this.Field12882.size()) {
            gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2 = (gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh)this.Field12882.get(n);
            if (gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2.Field8798.equalsIgnoreCase(string)) {
                gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2.Method1110(luaValue);
            }
            ++n;
        }
    }

    public void Method4458(String string) {
        this.Method4457(string, LuaValue.NONE);
    }

    public void Method4459(IqjHyBio3p7KLnDEo6TGyuKf2errkonL iqjHyBio3p7KLnDEo6TGyuKf2errkonL) {
        this.Field12883.add(iqjHyBio3p7KLnDEo6TGyuKf2errkonL);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Field8854.add(iqjHyBio3p7KLnDEo6TGyuKf2errkonL);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6788();
    }

    public void Method4460(GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt ggNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt) {
        this.Field12884.add(ggNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16257.Field9235.add(ggNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt);
    }

    public List Method4461() {
        return this.Field12882;
    }

    public Path Method4462() {
        return this.Field12880;
    }

    public boolean Method29() {
        return this.Field12881;
    }

    private boolean Method4463(IqjHyBio3p7KLnDEo6TGyuKf2errkonL iqjHyBio3p7KLnDEo6TGyuKf2errkonL, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2) {
        int n;
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method358().equals(iqjHyBio3p7KLnDEo6TGyuKf2errkonL) && qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method358() != null && !qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method358().equals(this)) {
            n = (int)((long)-496289526 ^ (long)-496289526);
            return n != 0;
        }
        n = (int)((long)-5152022 ^ (long)-5152021);
        return n != 0;
    }

    private static boolean Method4464(String string, IqjHyBio3p7KLnDEo6TGyuKf2errkonL iqjHyBio3p7KLnDEo6TGyuKf2errkonL) {
        return iqjHyBio3p7KLnDEo6TGyuKf2errkonL.Method40().equalsIgnoreCase(string);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1012795345 ^ (long)1012795345);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1067062074L ^ 0xC065EC39);
            int n2 = ((int)1507943751L ^ 0x59E16546) << 6;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1587692673 ^ (long)1587695390) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

