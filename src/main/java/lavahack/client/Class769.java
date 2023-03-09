//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.ClientChatEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.stream.Collectors;
import lavahack.client.Class1393;
import lavahack.client.Class278;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class769
extends Class42 {
    private static final ReentrantLock Field11260 = new ReentrantLock();
    private boolean Field11261 = false;
    public static String Field11262 = null;
    private int Field11263;

    public Class769() {
        super("Translate", Class97.Field8343);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Field11262 == null) {
            Class1393.Method5504().Method1886("You must select a language. Use: lang <language> command");
            this.Method22();
            return;
        }
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    @Override
    public void Method39() {
        super.Method39();
        MinecraftForge.EVENT_BUS.unregister((Object)this);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3203(ClientChatEvent clientChatEvent) {
        String string = clientChatEvent.getMessage();
        if (string.startsWith("/")) {
            return;
        }
        if (this.Field11261) {
            clientChatEvent.setCanceled(true);
            this.Field11261 = false;
        }
        String[] stringArray = string.split(" ");
        String[] stringArray2 = new String[]{null};
        new Thread(() -> Class769.Method3205(stringArray, stringArray2)).start();
        String[] stringArray3 = new String[]{""};
        String string2 = Field11262;
        String string3 = string;
        new Thread(() -> this.Method3204(stringArray3, string3, stringArray2, string2)).start();
    }

    private void Method3204(String[] stringArray, String string, String[] stringArray2, String string2) {
        Field11260.lock();
        stringArray[0] = Class278.Method1472(string, stringArray2[0], string2);
        if (!stringArray[0].equals("")) {
            this.Field11261 = true;
            Class769.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(stringArray[0]);
        }
        Field11260.unlock();
    }

    private static void Method3205(String[] stringArray, String[] stringArray2) {
        Field11260.lock();
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray3 = stringArray;
        int n = stringArray3.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                stringArray2[0] = arrayList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
                Field11260.unlock();
                return;
            }
            String string = stringArray3[n2];
            arrayList.add(Class278.Method1473(string));
            ++n2;
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 119;
            cArray2[n] = (char)(cArray[n] ^ (0x38D1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

