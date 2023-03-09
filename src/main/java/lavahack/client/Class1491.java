//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.features.rpc.library.DiscordEventHandlers
 *  com.kisman.cc.features.rpc.library.DiscordRPC
 *  com.kisman.cc.features.rpc.library.DiscordRichPresence
 */
package lavahack.client;

import com.kisman.cc.features.rpc.library.DiscordEventHandlers;
import com.kisman.cc.features.rpc.library.DiscordRPC;
import com.kisman.cc.features.rpc.library.DiscordRichPresence;
import com.kisman.cc.util.Class2142;
import lavahack.client.Class1796;
import lavahack.client.Class235;

public class Class1491
implements Class2142 {
    private static final DiscordRichPresence Field14974 = new DiscordRichPresence();
    private static final DiscordRPC Field14975 = DiscordRPC.INSTANCE;
    private String Field14976 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5967() {
        DiscordEventHandlers discordEventHandlers = new DiscordEventHandlers();
        discordEventHandlers.disconnected = Class1491::Method5970;
        String string = "895232773961445448";
        Field14975.Discord_Initialize(string, discordEventHandlers, true, null);
        Class1491.Field14974.startTimestamp = System.currentTimeMillis() / 1000L;
        Class1491.Field14974.largeImageKey = "logo";
        Class1491.Field14974.largeImageText = "join discord now: https://discord.gg/NNn7WXfkNB";
        Class1491.Field14974.smallImageKey = "plus";
        Class1491.Field14974.smallImageText = "LavaHack";
        Class1491.Field14974.details = "LavaHack | b0.1.6.5-9";
        Class1491.Field14974.partyId = "5657657-351d-4a4f-ad32-2b9b01c91657";
        Class1491.Field14974.partySize = 1;
        Class1491.Field14974.partyMax = 10;
        Class1491.Field14974.joinSecret = "join";
        Field14975.Discord_UpdatePresence(Field14974);
        new Thread(Class1491::Method5969, "Discord-RPC-Callback-Handler").start();
    }

    public static void Method5968() {
        Field14975.Discord_Shutdown();
        Field14975.Discord_ClearPresence();
    }

    private static void Method5969() {
        if (!null.Field10323.Method365()) return;
        while (!Thread.currentThread().isInterrupted()) {
            Class1491.Field14974.largeImageKey = ((Class235)null.Field10324.Method341()).Method1303();
            Field14975.Discord_RunCallbacks();
            String string = ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isIntegratedServerRunning() || Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null ? Class1796.Method6785() : Class1796.Method6785() + " - Playing Multiplayer";
            String string2 = "";
            if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isIntegratedServerRunning()) {
                string2 = Class1796.Method6783() + " on tope!";
            } else if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData() != null) {
                string2 = !Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP.equals("") ? "Playing on " + Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP : "Main Menu";
            }
            Class1491.Field14974.details = string;
            Class1491.Field14974.state = string2;
            Field14975.Discord_UpdatePresence(Field14974);
            Thread.sleep(5000L);
        }
    }

    private static void Method5970(int n, String string) {
        System.out.println("Discord RPC disconnected, var1: " + n + ", var2: " + string);
    }

    private static String Method5971(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 0;
            cArray2[n] = (char)(cArray[n] ^ (0x2F3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

