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
import lavahack.client.d8NUi994osLCmt6QS9gn2nL3bytx8gy3;
import lavahack.client.j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR;
import lavahack.client.kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$1;
import lavahack.client.kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9;
import lavahack.client.qjHQHUR6cDqJfxr2NHumjHRmiw9YFUmu;
import lavahack.client.sDbMy05tozpen5pcaum6tR3cdSk5JVk7;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;
import org.lwjgl.Sys;

public class kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO {
    private static final Gson Field15217 = new Gson();
    private static HttpServer Field15218;
    private String Field15219 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method6104(j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) {
        String string = "<html><body><h1>You can close this window now.</h1></body></html>";
        new Thread(() -> kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6113(j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2), "Auth Thread").start();
    }

    public static void Method6105() {
        if (Field15218 == null) return;
        Field15218.stop((int)-952031679L ^ 0xC7412641);
        Field15218 = null;
    }

    private static void Method6106(String string, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) throws Throwable {
        q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9 q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92 = new q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9("https://login.live.com/oauth20_token.srf").Method829("Content-Type", "application/x-www-form-urlencoded");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("client_id", "54fd49e4-2103-4044-9603-2b028c814ec3");
        hashMap.put("code", string);
        hashMap.put("grant_type", "authorization_code");
        hashMap.put("redirect_uri", "http://localhost:59125");
        hashMap.put("scope", "XboxLive.signin XboxLive.offline_access");
        q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method831(hashMap);
        if (q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832() != ((int)223779274L ^ 0xD5699D3) << 3) {
            throw new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("accessToken response: " + q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832());
        }
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6107(Field15217.fromJson(q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method833(), JsonObject.class).get("access_token").getAsString(), j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2);
    }

    private static void Method6107(String string, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) throws Throwable {
        j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2.setState("Logging in...");
        q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9 q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92 = new q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9("https://user.auth.xboxlive.com/user/authenticate").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("AuthMethod", "RPS");
        hashMap2.put("SiteName", "user.auth.xboxlive.com");
        hashMap2.put("RpsTicket", "d=" + string);
        hashMap.put("Properties", hashMap2);
        hashMap.put("RelyingParty", "http://auth.xboxlive.com");
        hashMap.put("TokenType", "JWT");
        q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method830(Field15217.toJson(hashMap));
        if (q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832() != ((int)-2100486658L ^ 0x82CD1DE7) << 3) {
            throw new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("xbl response: " + q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832());
        }
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6108(Field15217.fromJson(q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method833(), JsonObject.class).get("Token").getAsString(), j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2);
    }

    private static void Method6108(String string, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) throws Throwable {
        q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9 q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92 = new q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9("https://xsts.auth.xboxlive.com/xsts/authorize").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        hashMap2.put("SandboxId", "RETAIL");
        String[] stringArray = new String[(int)((long)-966960423 ^ (long)-966960424)];
        stringArray[(int)((long)825420112 ^ (long)825420112)] = string;
        hashMap2.put("UserTokens", Arrays.asList(stringArray));
        hashMap.put("Properties", hashMap2);
        hashMap.put("RelyingParty", "rp://api.minecraftservices.com/");
        hashMap.put("TokenType", "JWT");
        q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method830(Field15217.toJson(hashMap));
        if (q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832() == (int)((long)-2111624538 ^ (long)-2111624393)) {
            throw new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("This account doesn't have Minecraft account linked.");
        }
        if (q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832() != ((int)676612817L ^ 0x28544AC8) << 3) {
            throw new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("xsts response: " + q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832());
        }
        JsonObject jsonObject = Field15217.fromJson(q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method833(), JsonObject.class);
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6109(jsonObject.getAsJsonObject("DisplayClaims").getAsJsonArray("xui").get((int)-632659796L ^ 0xDA4A60AC).getAsJsonObject().get("uhs").getAsString(), jsonObject.get("Token").getAsString(), j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2);
    }

    private static void Method6109(String string, String string2, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) throws Throwable {
        q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9 q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92 = new q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ9("https://api.minecraftservices.com/authentication/login_with_xbox").Method829("Content-Type", "application/json").Method829("Accept", "application/json");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("identityToken", "XBL3.0 x=" + string + ";" + string2);
        q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method830(Field15217.toJson(hashMap));
        if (q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832() != ((int)867301311L ^ 0x33B1F7A6) << 3) {
            throw new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("minecraftToken response: " + q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method832());
        }
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6110(Field15217.fromJson(q9bIbqu0XZzWrTMNzW6fswB1ghauFvQ92.Method833(), JsonObject.class).get("access_token").getAsString(), j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2);
    }

    private static void Method6110(String string, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) throws Throwable {
        j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2.setState("Verifying...");
        sDbMy05tozpen5pcaum6tR3cdSk5JVk7 sDbMy05tozpen5pcaum6tR3cdSk5JVk72 = new sDbMy05tozpen5pcaum6tR3cdSk5JVk7("https://api.minecraftservices.com/entitlements/mcstore").Method4294("Authorization", "Bearer " + string);
        sDbMy05tozpen5pcaum6tR3cdSk5JVk72.Method4295();
        if (sDbMy05tozpen5pcaum6tR3cdSk5JVk72.Method4296() != ((int)-1336754141L ^ 0xB052C03A) << 3) {
            throw new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("minecraftStore response: " + sDbMy05tozpen5pcaum6tR3cdSk5JVk72.Method4296());
        }
        if (Field15217.fromJson(sDbMy05tozpen5pcaum6tR3cdSk5JVk72.Method4297(), JsonObject.class).getAsJsonArray("items").size() == 0) {
            throw new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("This account doesn't own the game.");
        }
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6111(string, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2);
    }

    private static void Method6111(String string, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) throws Throwable {
        sDbMy05tozpen5pcaum6tR3cdSk5JVk7 sDbMy05tozpen5pcaum6tR3cdSk5JVk72 = new sDbMy05tozpen5pcaum6tR3cdSk5JVk7("https://api.minecraftservices.com/minecraft/profile").Method4294("Authorization", "Bearer " + string);
        sDbMy05tozpen5pcaum6tR3cdSk5JVk72.Method4295();
        if (sDbMy05tozpen5pcaum6tR3cdSk5JVk72.Method4296() != (int)((long)1622421892 ^ (long)1622421917) << 3) {
            throw new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("minecraftProfile response: " + sDbMy05tozpen5pcaum6tR3cdSk5JVk72.Method4296());
        }
        JsonObject jsonObject = Field15217.fromJson(sDbMy05tozpen5pcaum6tR3cdSk5JVk72.Method4297(), JsonObject.class);
        String string2 = jsonObject.get("name").getAsString();
        String string3 = jsonObject.get("id").getAsString();
        Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.addScheduledTask(() -> kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6112(minecraft, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2, string2, string3, string));
    }

    private static void Method6112(Minecraft minecraft, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2, String string, String string2, String string3) {
        if (minecraft.currentScreen != j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) return;
        d8NUi994osLCmt6QS9gn2nL3bytx8gy3.Method7476(new Session(string, string2, string3, "mojang"));
        minecraft.displayGuiScreen(null);
    }

    private static void Method6113(j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) {
        if (Field15218 != null) return;
        j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2.setState("Waiting for auth... (Check your browser)");
        if (!qjHQHUR6cDqJfxr2NHumjHRmiw9YFUmu.Method7582("http://minecraft.net")) return;
        Field15218 = HttpServer.create(new InetSocketAddress((int)-143026908L ^ 0xF77973D1), (int)-733455548L ^ 0xD4485B44);
        Field15218.createContext("/", new kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO$1(j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2));
        Field15218.start();
        Sys.openURL((String)"https://login.live.com/oauth20_authorize.srf?client_id=54fd49e4-2103-4044-9603-2b028c814ec3&response_type=code&scope=XboxLive.signin%20XboxLive.offline_access&redirect_uri=http://localhost:59125&prompt=consent");
    }

    static void Method6114(String string, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2) throws Throwable {
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6106(string, j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR2);
    }

    private static String Method6115(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1521228170 ^ (long)1521228170);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2091602010 ^ (long)2091602085);
            int n2 = (int)((long)-551894327 ^ (long)-551894330) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)1291841563L ^ 0x4CFFF444) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

