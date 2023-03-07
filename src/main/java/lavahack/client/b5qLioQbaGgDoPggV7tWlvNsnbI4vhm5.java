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
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.rBUbPGhhEYTwVrYPtXKkJHZ6uz7WPyF6;

public class b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private static final DiscordRichPresence Field14974 = new DiscordRichPresence();
    private static final DiscordRPC Field14975 = DiscordRPC.INSTANCE;
    private String Field14976 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5967() {
        DiscordEventHandlers discordEventHandlers = new DiscordEventHandlers();
        discordEventHandlers.disconnected = b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5::Method5970;
        String string = "895232773961445448";
        Field14975.Discord_Initialize(string, discordEventHandlers, (boolean)((long)1828377576 ^ (long)1828377577), null);
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.startTimestamp = System.currentTimeMillis() / (0x522A53EAL & 0x28848FE8L);
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.largeImageKey = "logo";
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.largeImageText = "join discord now: https://discord.gg/NNn7WXfkNB";
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.smallImageKey = "plus";
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.smallImageText = "LavaHack";
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.details = "LavaHack | b0.1.6.5-9";
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.partyId = "5657657-351d-4a4f-ad32-2b9b01c91657";
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.partySize = (int)((long)66786632 ^ (long)66786633);
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.partyMax = (int)((long)-511212187 ^ (long)-511212192) << 1;
        b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.joinSecret = "join";
        Field14975.Discord_UpdatePresence(Field14974);
        new Thread(b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5::Method5969, "Discord-RPC-Callback-Handler").start();
    }

    public static void Method5968() {
        Field14975.Discord_Shutdown();
        Field14975.Discord_ClearPresence();
    }

    private static void Method5969() {
        if (!null.Field10323.Method365()) return;
        while (!Thread.currentThread().isInterrupted()) {
            b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.largeImageKey = ((rBUbPGhhEYTwVrYPtXKkJHZ6uz7WPyF6)null.Field10324.Method341()).Method1303();
            Field14975.Discord_RunCallbacks();
            String string = ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isIntegratedServerRunning() || b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null ? leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6785() : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6785() + " - Playing Multiplayer";
            String string2 = "";
            if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.isIntegratedServerRunning()) {
                string2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + " on tope!";
            } else if (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData() != null) {
                string2 = !b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP.equals("") ? "Playing on " + b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getCurrentServerData().serverIP : "Main Menu";
            }
            b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.details = string;
            b5qLioQbaGgDoPggV7tWlvNsnbI4vhm5.Field14974.state = string2;
            Field14975.Discord_UpdatePresence(Field14974);
            Thread.sleep(0xC1BC8L & 0x230237BEL);
        }
    }

    private static void Method5970(int n, String string) {
        System.out.println("Discord RPC disconnected, var1: " + n + ", var2: " + string);
    }

    private static String Method5971(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-672089258L ^ 0xD7F0BB56;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)101537924 ^ (long)101537915);
            int n2 = (int)((long)-1937814107 ^ (long)-1937814107);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1660937711L ^ 0x9D000D8C) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

