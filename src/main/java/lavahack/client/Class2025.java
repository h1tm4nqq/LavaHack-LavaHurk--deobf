//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.gameevent.*;
import net.minecraft.util.text.*;

public class Class2025
{
    public static final Class2025 Field17312;
    private final Queue Field17313;
    private String Field17314 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2025() {
        this.Field17313 = new ArrayDeque();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7488(final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        if (tickEvent$ClientTickEvent.phase == TickEvent$Phase.START) {
            return;
        }
        final EntityPlayerSP player = Minecraft.getMinecraft().player;
        if (player != null && player.connection != null && !player.connection.getNetworkManager().isLocalChannel()) {
            this.Method7490();
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7489(final TickEvent$ServerTickEvent tickEvent$ServerTickEvent) {
        if (tickEvent$ServerTickEvent.phase == TickEvent$Phase.START) {
            return;
        }
        this.Method7490();
    }
    
    private void Method7490() {
        if (this.Field17313.size() == 0) {
            return;
        }
        final Class1079 class1079 = this.Field17313.poll();
        if (class1079 == null) {
            return;
        }
        if (class1079.Method4355()) {
            if (class1079.Method4354()) {
                class1079.Field12800.sendMessage((ITextComponent)new TextComponentTranslation("schematica.command.save.started", new Object[] { class1079.Field12816, class1079.Field12802.getName() }));
            }
            class1079.Method4353();
        }
        if (class1079.Method4355()) {
            this.Field17313.offer(class1079);
        }
        else {
            Class153.Method998(class1079.Field12802, class1079.Field12803, class1079.Field12799, class1079.Field12800);
        }
    }
    
    public void Method7491(final Class1079 class1079) {
        this.Field17313.offer(class1079);
    }
    
    static {
        Field17312 = new Class2025();
    }
    
    private static String Method7492(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4ECC ^ 0xC5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
