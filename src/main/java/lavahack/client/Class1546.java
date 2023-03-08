//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.google.gson.*;
import java.util.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.client.gui.*;
import java.net.*;
import com.sun.net.httpserver.*;
import org.lwjgl.*;

public class Class1546
{
    private static final Gson Field15217;
    private static HttpServer Field15218;
    private String Field15219 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method6104(final Class2174 class2174) {
        new Thread(Class1546::Method6113, "Auth Thread").start();
    }
    
    public static void Method6105() {
        if (Class1546.Field15218 != null) {
            Class1546.Field15218.stop(0);
            Class1546.Field15218 = null;
        }
    }
    
    private static void Method6106(final String s, final Class2174 class2174) throws Throwable {
        final Class114 method829 = new Class114("https://login.live.com/oauth20_token.srf").Method829("Content-Type", "application/x-www-form-urlencoded");
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("client_id", "54fd49e4-2103-4044-9603-2b028c814ec3");
        hashMap.put("code", s);
        hashMap.put("grant_type", "authorization_code");
        hashMap.put("redirect_uri", "http://localhost:59125");
        hashMap.put("scope", "XboxLive.signin XboxLive.offline_access");
        method829.Method831((Map)hashMap);
        if (method829.Method832() != 200) {
            throw new Class1818("accessToken response: " + method829.Method832());
        }
        Method6107(((JsonObject)Class1546.Field15217.fromJson(method829.Method833(), (Class)JsonObject.class)).get("access_token").getAsString(), class2174);
    }
    
    private static void Method6107(final String str, final Class2174 class2174) throws Throwable {
        class2174.setState("Logging in...");
        final Class114 method829 = new Class114("https://user.auth.xboxlive.com/user/authenticate").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        final HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
        final HashMap<String, String> value = new HashMap<String, String>();
        value.put("AuthMethod", "RPS");
        value.put("SiteName", "user.auth.xboxlive.com");
        value.put("RpsTicket", "d=" + str);
        hashMap.put("Properties", value);
        hashMap.put("RelyingParty", (HashMap<String, String>)"http://auth.xboxlive.com");
        hashMap.put("TokenType", (HashMap<String, String>)"JWT");
        method829.Method830(Class1546.Field15217.toJson((Object)hashMap));
        if (method829.Method832() != 200) {
            throw new Class1818("xbl response: " + method829.Method832());
        }
        Method6108(((JsonObject)Class1546.Field15217.fromJson(method829.Method833(), (Class)JsonObject.class)).get("Token").getAsString(), class2174);
    }
    
    private static void Method6108(final String s, final Class2174 class2174) throws Throwable {
        final Class114 method829 = new Class114("https://xsts.auth.xboxlive.com/xsts/authorize").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        final HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
        final HashMap<String, String> value = new HashMap<String, String>();
        value.put("SandboxId", "RETAIL");
        value.put("UserTokens", (String)Arrays.asList(s));
        hashMap.put("Properties", value);
        hashMap.put("RelyingParty", (HashMap<String, String>)"rp://api.minecraftservices.com/");
        hashMap.put("TokenType", (HashMap<String, String>)"JWT");
        method829.Method830(Class1546.Field15217.toJson((Object)hashMap));
        if (method829.Method832() == 401) {
            throw new Class1818("This account doesn't have Minecraft account linked.");
        }
        if (method829.Method832() != 200) {
            throw new Class1818("xsts response: " + method829.Method832());
        }
        final JsonObject jsonObject = (JsonObject)Class1546.Field15217.fromJson(method829.Method833(), (Class)JsonObject.class);
        Method6109(jsonObject.getAsJsonObject("DisplayClaims").getAsJsonArray("xui").get(0).getAsJsonObject().get("uhs").getAsString(), jsonObject.get("Token").getAsString(), class2174);
    }
    
    private static void Method6109(final String str, final String str2, final Class2174 class2174) throws Throwable {
        final Class114 method829 = new Class114("https://api.minecraftservices.com/authentication/login_with_xbox").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("identityToken", "XBL3.0 x=" + str + ";" + str2);
        method829.Method830(Class1546.Field15217.toJson((Object)hashMap));
        if (method829.Method832() != 200) {
            throw new Class1818("minecraftToken response: " + method829.Method832());
        }
        Method6110(((JsonObject)Class1546.Field15217.fromJson(method829.Method833(), (Class)JsonObject.class)).get("access_token").getAsString(), class2174);
    }
    
    private static void Method6110(final String str, final Class2174 class2174) throws Throwable {
        class2174.setState("Verifying...");
        final Class1053 method4294 = new Class1053("https://api.minecraftservices.com/entitlements/mcstore").Method4294("Authorization", "Bearer " + str);
        method4294.Method4295();
        if (method4294.Method4296() != 200) {
            throw new Class1818("minecraftStore response: " + method4294.Method4296());
        }
        if (((JsonObject)Class1546.Field15217.fromJson(method4294.Method4297(), (Class)JsonObject.class)).getAsJsonArray("items").size() == 0) {
            throw new Class1818("This account doesn't own the game.");
        }
        Method6111(str, class2174);
    }
    
    private static void Method6111(final String str, final Class2174 class2174) throws Throwable {
        final Class1053 method4294 = new Class1053("https://api.minecraftservices.com/minecraft/profile").Method4294("Authorization", "Bearer " + str);
        method4294.Method4295();
        if (method4294.Method4296() != 200) {
            throw new Class1818("minecraftProfile response: " + method4294.Method4296());
        }
        final JsonObject jsonObject = (JsonObject)Class1546.Field15217.fromJson(method4294.Method4297(), (Class)JsonObject.class);
        final String asString = jsonObject.get("name").getAsString();
        final String asString2 = jsonObject.get("id").getAsString();
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        getMinecraft.addScheduledTask(Class1546::Method6112);
    }
    
    private static void Method6112(final Minecraft minecraft, final Class2174 class2174, final String s, final String s2, final String s3) {
        if (minecraft.currentScreen == class2174) {
            Class2018.Method7476(new Session(s, s2, s3, "mojang"));
            minecraft.displayGuiScreen((GuiScreen)null);
        }
    }
    
    private static void Method6113(final Class2174 class2174) {
        if (Class1546.Field15218 == null) {
            class2174.setState("Waiting for auth... (Check your browser)");
            if (Class2067.Method7582("http://minecraft.net")) {
                (Class1546.Field15218 = HttpServer.create(new InetSocketAddress(59125), 0)).createContext("/", new Class2110(class2174));
                Class1546.Field15218.start();
                Sys.openURL("https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&redirect_uri=http://localhost:59125&prompt=consent");
            }
        }
    }
    
    static void Method6114(final String s, final Class2174 class2174) throws Throwable {
        Method6106(s, class2174);
    }
    
    static {
        Field15217 = new Gson();
    }
    
    private static String Method6115(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x117C ^ 0xF0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
