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
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.kWERp1cGJ6a4MYS0Qiy9PDz0HdmefSOH;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class q6LSBHqSOmWFZdKPhYSa6ojtR1CL2deX
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final ReentrantLock Field11260 = new ReentrantLock();
    private boolean Field11261 = (int)((long)-2077600849 ^ (long)-2077600849);
    public static String Field11262 = null;
    private int Field11263;

    public q6LSBHqSOmWFZdKPhYSa6ojtR1CL2deX() {
        super("Translate", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Field11262 == null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("You must select a language. Use: lang <language> command");
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
            clientChatEvent.setCanceled(((int)-1374755460L ^ 0xAE0EE57D) != 0);
            this.Field11261 = (int)738798520L ^ 0x2C092BB8;
        }
        String[] stringArray = string.split(" ");
        String[] stringArray2 = new String[(int)((long)865671219 ^ (long)865671218)];
        stringArray2[(int)((long)1571017598 ^ (long)1571017598)] = null;
        String[] stringArray3 = stringArray2;
        new Thread(() -> q6LSBHqSOmWFZdKPhYSa6ojtR1CL2deX.Method3205(stringArray, stringArray3)).start();
        String[] stringArray4 = new String[(int)497134316L ^ 0x1DA1AAED];
        stringArray4[(int)925478552L ^ 0x3729AE98] = "";
        String[] stringArray5 = stringArray4;
        String string2 = Field11262;
        String string3 = string;
        new Thread(() -> this.Method3204(stringArray5, string3, stringArray3, string2)).start();
    }

    private void Method3204(String[] stringArray, String string, String[] stringArray2, String string2) {
        Field11260.lock();
        stringArray[(int)((long)-1775669380 ^ (long)-1775669380)] = kWERp1cGJ6a4MYS0Qiy9PDz0HdmefSOH.Method1472(string, stringArray2[(int)((long)892250897 ^ (long)892250897)], string2);
        if (!stringArray[(int)-1445238919L ^ 0xA9DB6779].equals("")) {
            this.Field11261 = (int)((long)-1628461916 ^ (long)-1628461915);
            q6LSBHqSOmWFZdKPhYSa6ojtR1CL2deX.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(stringArray[(int)((long)-978813907 ^ (long)-978813907)]);
        }
        Field11260.unlock();
    }

    private static void Method3205(String[] stringArray, String[] stringArray2) {
        Field11260.lock();
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray3 = stringArray;
        int n = stringArray3.length;
        int n2 = (int)((long)0x5C55CBB ^ (long)0x5C55CBB);
        while (true) {
            if (n2 >= n) {
                stringArray2[(int)((long)1833041097 ^ (long)1833041097)] = arrayList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
                Field11260.unlock();
                return;
            }
            String string = stringArray3[n2];
            arrayList.add(kWERp1cGJ6a4MYS0Qiy9PDz0HdmefSOH.Method1473(string));
            ++n2;
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1235467731L ^ 0xB65C422D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)181549190L ^ 0xAD23879);
            int n2 = (int)-1260439459L ^ 0xB4DF382A;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1134579430 ^ (long)-1134589493) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

