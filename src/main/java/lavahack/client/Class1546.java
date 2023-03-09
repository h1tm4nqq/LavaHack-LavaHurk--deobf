//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.Session
 *  org.lwjgl.Sys
 */
package lavahack.client;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.HashMap;
import lavahack.client.Class1053;
import lavahack.client.Class114;
import lavahack.client.Class1818;
import lavahack.client.Class2018;
import lavahack.client.Class2067;
import lavahack.client.Class2110;
import lavahack.client.Class2174;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.lwjgl.Sys;

public class Class1546 {
    private static final Gson Field15217 = new Gson();
    private static HttpServer Field15218;
    private String Field15219 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method6104(Class2174 class2174) {
        String string = "<html><body><h1>You can close this window now.</h1></body></html>";
        new Thread(() -> Class1546.Method6113(class2174), "Auth Thread").start();
    }

    public static void Method6105() {
        if (Field15218 == null) return;
        Field15218.stop(0);
        Field15218 = null;
    }

    private static void Method6106(String string, Class2174 class2174) throws Throwable {
        Class114 class114 = new Class114("https://login.live.com/oauth20_token.srf").Method829("Content-Type", "application/x-www-form-urlencoded");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("client_id", "54fd49e4-2103-4044-9603-2b028c814ec3");
        hashMap.put("code", string);
        hashMap.put("grant_type", "authorization_code");
        hashMap.put("redirect_uri", "http://localhost:59125");
        hashMap.put("scope", "XboxLive.signin XboxLive.offline_access");
        class114.Method831(hashMap);
        if (class114.Method832() != 200) {
            throw new Class1818("accessToken response: " + class114.Method832());
        }
        Class1546.Method6107(Field15217.fromJson(class114.Method833(), JsonObject.class).get("access_token").getAsString(), class2174);
    }

    private static void Method6107(String string, Class2174 class2174) throws Throwable {
        class2174.setState("Logging in...");
        Class114 class114 = new Class114("https://user.auth.xboxlive.com/user/authenticate").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("AuthMethod", "RPS");
        hashMap2.put("SiteName", "user.auth.xboxlive.com");
        hashMap2.put("RpsTicket", "d=" + string);
        hashMap.put("Properties", hashMap2);
        hashMap.put("RelyingParty", "http://auth.xboxlive.com");
        hashMap.put("TokenType", "JWT");
        class114.Method830(Field15217.toJson(hashMap));
        if (class114.Method832() != 200) {
            throw new Class1818("xbl response: " + class114.Method832());
        }
        Class1546.Method6108(Field15217.fromJson(class114.Method833(), JsonObject.class).get("Token").getAsString(), class2174);
    }

    private static void Method6108(String string, Class2174 class2174) throws Throwable {
        Class114 class114 = new Class114("https://xsts.auth.xboxlive.com/xsts/authorize").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        hashMap2.put("SandboxId", "RETAIL");
        hashMap2.put("UserTokens", Arrays.asList(string));
        hashMap.put("Properties", hashMap2);
        hashMap.put("RelyingParty", "rp://api.minecraftservices.com/");
        hashMap.put("TokenType", "JWT");
        class114.Method830(Field15217.toJson(hashMap));
        if (class114.Method832() == 401) {
            throw new Class1818("This account doesn't have Minecraft account linked.");
        }
        if (class114.Method832() != 200) {
            throw new Class1818("xsts response: " + class114.Method832());
        }
        JsonObject jsonObject = Field15217.fromJson(class114.Method833(), JsonObject.class);
        Class1546.Method6109(jsonObject.getAsJsonObject("DisplayClaims").getAsJsonArray("xui").get(0).getAsJsonObject().get("uhs").getAsString(), jsonObject.get("Token").getAsString(), class2174);
    }

    private static void Method6109(String string, String string2, Class2174 class2174) throws Throwable {
        Class114 class114 = new Class114("https://api.minecraftservices.com/authentication/login_with_xbox").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("identityToken", "XBL3.0 x=" + string + ";" + string2);
        class114.Method830(Field15217.toJson(hashMap));
        if (class114.Method832() != 200) {
            throw new Class1818("minecraftToken response: " + class114.Method832());
        }
        Class1546.Method6110(Field15217.fromJson(class114.Method833(), JsonObject.class).get("access_token").getAsString(), class2174);
    }

    private static void Method6110(String string, Class2174 class2174) throws Throwable {
        class2174.setState("Verifying...");
        Class1053 class1053 = new Class1053("https://api.minecraftservices.com/entitlements/mcstore").Method4294("Authorization", "Bearer " + string);
        class1053.Method4295();
        if (class1053.Method4296() != 200) {
            throw new Class1818("minecraftStore response: " + class1053.Method4296());
        }
        if (Field15217.fromJson(class1053.Method4297(), JsonObject.class).getAsJsonArray("items").size() == 0) {
            throw new Class1818("This account doesn't own the game.");
        }
        Class1546.Method6111(string, class2174);
    }

    private static void Method6111(String string, Class2174 class2174) throws Throwable {
        Class1053 class1053 = new Class1053("https://api.minecraftservices.com/minecraft/profile").Method4294("Authorization", "Bearer " + string);
        class1053.Method4295();
        if (class1053.Method4296() != 200) {
            throw new Class1818("minecraftProfile response: " + class1053.Method4296());
        }
        JsonObject jsonObject = Field15217.fromJson(class1053.Method4297(), JsonObject.class);
        String string2 = jsonObject.get("name").getAsString();
        String string3 = jsonObject.get("id").getAsString();
        Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.addScheduledTask(() -> Class1546.Method6112(minecraft, class2174, string2, string3, string));
    }

    private static void Method6112(Minecraft minecraft, Class2174 class2174, String string, String string2, String string3) {
        if (minecraft.currentScreen != class2174) return;
        Class2018.Method7476(new Session(string, string2, string3, "mojang"));
        minecraft.displayGuiScreen(null);
    }

    private static void Method6113(Class2174 class2174) {
        if (Field15218 != null) return;
        class2174.setState("Waiting for auth... (Check your browser)");
        if (!Class2067.Method7582("http://minecraft.net")) return;
        Field15218 = HttpServer.create(new InetSocketAddress(59125), 0);
        Field15218.createContext("/", new Class2110(class2174));
        Field15218.start();
        Sys.openURL((String)"https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&redirect_uri=http://localhost:59125&prompt=consent");
    }

    static void Method6114(String string, Class2174 class2174) throws Throwable {
        Class1546.Method6106(string, class2174);
    }

    private static String Method6115(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 240;
            cArray2[n] = (char)(cArray[n] ^ (0x117C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

