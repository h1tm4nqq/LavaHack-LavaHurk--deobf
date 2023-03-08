//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.locks.*;
import net.minecraftforge.common.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;

public class Class769 extends Class42
{
    private static final ReentrantLock Field11260;
    private boolean Field11261;
    public static String Field11262;
    private int Field11263;
    
    public Class769() {
        super("Translate", Class97.Field8343);
        this.Field11261 = false;
    }
    
    public void Method38() {
        super.Method38();
        if (Class769.Field11262 == null) {
            Class1393.Method5504().Method1886("You must select a language. Use: lang <language> command");
            this.Method22();
            return;
        }
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    public void Method39() {
        super.Method39();
        MinecraftForge.EVENT_BUS.unregister((Object)this);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3203(final ClientChatEvent clientChatEvent) {
        final String message = clientChatEvent.getMessage();
        if (message.startsWith("/")) {
            return;
        }
        if (this.Field11261) {
            clientChatEvent.setCanceled(true);
            this.Field11261 = false;
        }
        final String[] split = message.split(" ");
        final String[] array = { null };
        new Thread(Class769::Method3205).start();
        new Thread(this::Method3204).start();
    }
    
    private void Method3204(final String[] array, final String s, final String[] array2, final String s2) {
        Class769.Field11260.lock();
        array[0] = Class278.Method1472(s, array2[0], s2);
        if (!array[0].equals("")) {
            this.Field11261 = true;
            Class769.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(array[0]);
        }
        Class769.Field11260.unlock();
    }
    
    private static void Method3205(final String[] array, final String[] array2) {
        Class769.Field11260.lock();
        final ArrayList<Object> list = new ArrayList<Object>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(Class278.Method1473(array[i]));
        }
        array2[0] = list.stream().collect(Collectors.groupingBy((Function<? super Object, ?>)Function.identity(), Collectors.counting())).entrySet().stream().max((Comparator<? super Object>)Map.Entry.comparingByValue()).map((Function<? super Object, ?>)Map.Entry::getKey).orElse(null);
        Class769.Field11260.unlock();
    }
    
    static {
        Field11260 = new ReentrantLock();
        Class769.Field11262 = null;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x38D1 ^ 0x77));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
