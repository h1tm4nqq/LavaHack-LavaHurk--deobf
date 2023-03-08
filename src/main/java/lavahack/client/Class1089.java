//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.google.gson.*;
import java.nio.file.*;
import java.io.*;
import java.util.function.*;
import javax.script.*;
import java.util.*;
import net.minecraft.client.*;
import org.luaj.vm2.*;

public class Class1089 extends Class42
{
    protected JsonObject Field12878;
    public transient String Field12879;
    private final Path Field12880;
    private boolean Field12881;
    public final transient List Field12882;
    public final transient List Field12883;
    public final transient List Field12884;
    private String Field12885 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1089(final String s, final String s2) throws IOException {
        super(s, s2, Class97.Field8347);
        this.Field12878 = new JsonObject();
        this.Field12882 = new ArrayList();
        this.Field12883 = new ArrayList();
        this.Field12884 = new ArrayList();
        this.Field12880 = Paths.get("kisman.cc/Lua/", s);
        this.Field12879 = new String(Files.readAllBytes(this.Field12880));
    }
    
    public Class1700 Method4452(final String s) {
        return (Class1700)this.Field12883.stream().filter(Class1089::Method4464).findFirst().orElse(null);
    }
    
    public void Method4453() {
        Class1796.Field16241.Field16280.Field10992.clear();
        Class1796.Field16241.Field16280.Field10990.clear();
        Class1796.Field16241.Field16280.Field10991.clear();
        final ScriptEngine engineByName = new ScriptEngineManager().getEngineByName("lua");
        this.Method4455(engineByName);
        engineByName.eval(this.Field12879);
        engineByName.eval("main()");
        if (this.Field12878.has("__toggled")) {
            this.Method21(this.Field12878.get("__toggled").getAsBoolean());
        }
        this.Field12878 = new JsonObject();
        this.Field12881 = true;
    }
    
    public void Method4454(final boolean b) {
        this.Field12881 = false;
        if (b) {
            Class1796.Field16241.Field16283.Field15891.remove(this);
            Class1796.Field16241.Field16280.Field10992.clear();
            Class1796.Field16241.Field16280.Field10990.clear();
            Class1796.Field16241.Field16280.Field10991.clear();
            Class1796.Field16241.Field16254.Field8854.removeAll(this.Field12883);
            Class1796.Method6788();
        }
        final Iterator<Class1700> iterator = this.Field12883.iterator();
        while (iterator.hasNext()) {
            Class1796.Field16241.Field16258.Method7570().removeIf(this::Method4463);
        }
        Class1796.Field16241.Field16254.Field8854.removeAll(this.Field12883);
        Class1796.Field16241.Field16257.Field9235.removeAll(this.Field12884);
        this.Field12883.clear();
        this.Field12884.clear();
        this.Field12882.clear();
    }
    
    public void Method20() {
        this.Field12879 = new String(Files.readAllBytes(this.Field12880));
        this.Method4454(false);
        this.Method4453();
    }
    
    private void Method4455(final ScriptEngine scriptEngine) {
        scriptEngine.put("mc", Minecraft.getMinecraft());
        scriptEngine.put("this", this);
        scriptEngine.put("textOf", new Class998());
        scriptEngine.put("box", new Class1792());
        scriptEngine.put("vec2d", new Class1268());
        scriptEngine.put("vec3d", new Class646());
        scriptEngine.put("color", new Class268());
        scriptEngine.put("colorutil", Class1643.Method6379());
        scriptEngine.put("StopWatch", new Class1630());
        scriptEngine.put("client", Class1796.Field16241);
        scriptEngine.put("renderer", Class1908.Method7074());
        scriptEngine.put("globals", Class768.Method3193());
        scriptEngine.put("interactions", Class723.Method3023());
        scriptEngine.put("files", Class1941.Method7220());
        scriptEngine.put("Module", Class1700.Method6517());
        scriptEngine.put("GuiBuilder", Class1147.Method4644());
        scriptEngine.put("rotations", Class1796.Field16241.Field16282);
        scriptEngine.put("net", Class978.Field12183.Method985());
        scriptEngine.put("Builder", new Class1115());
        scriptEngine.put("setmgr", Class1796.Field16241.Field16258);
    }
    
    public Class183 Method4456(final String s, final LuaClosure luaClosure) {
        final Class183 class183 = new Class183(s, luaClosure, this);
        this.Field12882.add(class183);
        return class183;
    }
    
    public void Method4457(final String anotherString, final LuaValue luaValue) {
        if (this.Field12882 == null || this.Field12882.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.Field12882.size(); ++i) {
            final Class183 class183 = this.Field12882.get(i);
            if (class183.Field8798.equalsIgnoreCase(anotherString)) {
                class183.Method1110(luaValue);
            }
        }
    }
    
    public void Method4458(final String s) {
        this.Method4457(s, LuaValue.NONE);
    }
    
    public void Method4459(final Class1700 class1700) {
        this.Field12883.add(class1700);
        Class1796.Field16241.Field16254.Field8854.add(class1700);
        Class1796.Method6788();
    }
    
    public void Method4460(final Class771 e) {
        this.Field12884.add(e);
        Class1796.Field16241.Field16257.Field9235.add(e);
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
    
    private boolean Method4463(final Class1700 obj, final Class44 class44) {
        return class44.Method358().equals(obj) || class44.Method358() == null || class44.Method358().equals(this);
    }
    
    private static boolean Method4464(final String anotherString, final Class1700 class1700) {
        return class1700.Method40().equalsIgnoreCase(anotherString);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xB9F ^ 0x40));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
