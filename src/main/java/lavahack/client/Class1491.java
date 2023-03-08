//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import com.kisman.cc.features.rpc.library.*;

public class Class1491 implements Class2142
{
    private static final DiscordRichPresence Field14974;
    private static final DiscordRPC Field14975;
    private String Field14976 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method5967() {
        final DiscordEventHandlers discordEventHandlers = new DiscordEventHandlers();
        discordEventHandlers.disconnected = Class1491::Method5970;
        Class1491.Field14975.Discord_Initialize("895232773961445448", discordEventHandlers, true, (String)null);
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
        Class1491.Field14975.Discord_UpdatePresence(Class1491.Field14974);
        new Thread(Class1491::Method5969, "Discord-RPC-Callback-Handler").start();
    }
    
    public static void Method5968() {
        Class1491.Field14975.Discord_Shutdown();
        Class1491.Field14975.Discord_ClearPresence();
    }
    
    private static void Method5969() {
        if (null.Field10323.Method365()) {
            while (!Thread.currentThread().isInterrupted()) {
                Class1491.Field14974.largeImageKey = ((Class235)null.Field10324.Method341()).Method1303();
                Class1491.Field14975.Discord_RunCallbacks();
                String details;
                if (Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isIntegratedServerRunning() || Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null) {
                    details = Class1796.Method6785();
                }
                else {
                    details = Class1796.Method6785() + " - Playing Multiplayer";
                }
                String state = "";
                if (Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isIntegratedServerRunning()) {
                    state = Class1796.Method6783() + " on tope!";
                }
                else if (Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData() != null) {
                    if (!Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP.equals("")) {
                        state = "Playing on " + Class1491.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP;
                    }
                    else {
                        state = "Main Menu";
                    }
                }
                Class1491.Field14974.details = details;
                Class1491.Field14974.state = state;
                Class1491.Field14975.Discord_UpdatePresence(Class1491.Field14974);
                Thread.sleep(5000L);
            }
        }
    }
    
    private static void Method5970(final int i, final String str) {
        System.out.println("Discord RPC disconnected, var1: " + i + ", var2: " + str);
    }
    
    static {
        Field14974 = new DiscordRichPresence();
        Field14975 = DiscordRPC.INSTANCE;
    }
    
    private static String Method5971(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2F3A ^ 0x0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
