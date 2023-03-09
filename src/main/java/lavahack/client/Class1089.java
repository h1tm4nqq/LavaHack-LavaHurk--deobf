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
import lavahack.client.Class1115;
import lavahack.client.Class1147;
import lavahack.client.Class1268;
import lavahack.client.Class1630;
import lavahack.client.Class1643;
import lavahack.client.Class1700;
import lavahack.client.Class1792;
import lavahack.client.Class1796;
import lavahack.client.Class183;
import lavahack.client.Class1908;
import lavahack.client.Class1941;
import lavahack.client.Class268;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class646;
import lavahack.client.Class723;
import lavahack.client.Class768;
import lavahack.client.Class771;
import lavahack.client.Class97;
import lavahack.client.Class978;
import lavahack.client.Class998;
import net.minecraft.client.Minecraft;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaValue;

public class Class1089
extends Class42 {
    protected JsonObject Field12878 = new JsonObject();
    public transient String Field12879;
    private final Path Field12880;
    private boolean Field12881;
    public final transient List Field12882 = new ArrayList();
    public final transient List Field12883 = new ArrayList();
    public final transient List Field12884 = new ArrayList();
    private String Field12885 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1089(String string, String string2) throws IOException {
        super(string, string2, Class97.Field8347);
        this.Field12880 = Paths.get("kisman.cc/Lua/", string);
        this.Field12879 = new String(Files.readAllBytes(this.Field12880));
    }

    public Class1700 Method4452(String string) {
        return this.Field12883.stream().filter(arg_0 -> Class1089.Method4464(string, arg_0)).findFirst().orElse(null);
    }

    public void Method4453() {
        Class1796.Field16241.Field16280.Field10992.clear();
        Class1796.Field16241.Field16280.Field10990.clear();
        Class1796.Field16241.Field16280.Field10991.clear();
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("lua");
        this.Method4455(scriptEngine);
        scriptEngine.eval(this.Field12879);
        scriptEngine.eval("main()");
        if (this.Field12878.has("__toggled")) {
            this.Method21(this.Field12878.get("__toggled").getAsBoolean());
        }
        this.Field12878 = new JsonObject();
        this.Field12881 = true;
    }

    public void Method4454(boolean bl) {
        this.Field12881 = false;
        if (bl) {
            Class1796.Field16241.Field16283.Field15891.remove(this);
            Class1796.Field16241.Field16280.Field10992.clear();
            Class1796.Field16241.Field16280.Field10990.clear();
            Class1796.Field16241.Field16280.Field10991.clear();
            Class1796.Field16241.Field16254.Field8854.removeAll(this.Field12883);
            Class1796.Method6788();
        }
        Iterator iterator = this.Field12883.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Class1796.Field16241.Field16254.Field8854.removeAll(this.Field12883);
                Class1796.Field16241.Field16257.Field9235.removeAll(this.Field12884);
                this.Field12883.clear();
                this.Field12884.clear();
                this.Field12882.clear();
                return;
            }
            Class1700 class1700 = (Class1700)iterator.next();
            Class1796.Field16241.Field16258.Method7570().removeIf(arg_0 -> this.Method4463(class1700, arg_0));
        }
    }

    public void Method20() {
        this.Field12879 = new String(Files.readAllBytes(this.Field12880));
        this.Method4454(false);
        this.Method4453();
    }

    private void Method4455(ScriptEngine scriptEngine) {
        scriptEngine.put("mc", Minecraft.getMinecraft());
        scriptEngine.put("this", this);
        scriptEngine.put("textOf", new Class998());
        scriptEngine.put("box", new Class1792());
        scriptEngine.put("vec2d", new Class1268());
        scriptEngine.put("vec3d", new Class646());
        scriptEngine.put("color", (Object)new Class268());
        scriptEngine.put("colorutil", Class1643.Method6379());
        scriptEngine.put("StopWatch", (Object)new Class1630());
        scriptEngine.put("client", Class1796.Field16241);
        scriptEngine.put("renderer", Class1908.Method7074());
        scriptEngine.put("globals", Class768.Method3193());
        scriptEngine.put("interactions", Class723.Method3023());
        scriptEngine.put("files", Class1941.Method7220());
        scriptEngine.put("Module", Class1700.Method6517());
        scriptEngine.put("GuiBuilder", Class1147.Method4644());
        scriptEngine.put("rotations", Class1796.Field16241.Field16282);
        scriptEngine.put("net", Class978.Field12183.Method985());
        scriptEngine.put("Builder", (Object)new Class1115());
        scriptEngine.put("setmgr", Class1796.Field16241.Field16258);
    }

    public Class183 Method4456(String string, LuaClosure luaClosure) {
        Class183 class183 = new Class183(string, luaClosure, this);
        this.Field12882.add(class183);
        return class183;
    }

    public void Method4457(String string, LuaValue luaValue) {
        if (this.Field12882 == null) return;
        if (this.Field12882.isEmpty()) {
            return;
        }
        int n = 0;
        while (n < this.Field12882.size()) {
            Class183 class183 = (Class183)this.Field12882.get(n);
            if (class183.Field8798.equalsIgnoreCase(string)) {
                class183.Method1110(luaValue);
            }
            ++n;
        }
    }

    public void Method4458(String string) {
        this.Method4457(string, LuaValue.NONE);
    }

    public void Method4459(Class1700 class1700) {
        this.Field12883.add(class1700);
        Class1796.Field16241.Field16254.Field8854.add(class1700);
        Class1796.Method6788();
    }

    public void Method4460(Class771 class771) {
        this.Field12884.add(class771);
        Class1796.Field16241.Field16257.Field9235.add(class771);
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

    private boolean Method4463(Class1700 class1700, Class44 class44) {
        if (class44.Method358().equals(class1700)) return true;
        if (class44.Method358() == null) return true;
        if (class44.Method358().equals(this)) return true;
        return false;
    }

    private static boolean Method4464(String string, Class1700 class1700) {
        return class1700.Method40().equalsIgnoreCase(string);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 64;
            cArray2[n] = (char)(cArray[n] ^ (0xB9F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

