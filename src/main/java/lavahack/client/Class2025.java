//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ServerTickEvent
 */
package lavahack.client;

import java.util.ArrayDeque;
import java.util.Queue;
import lavahack.client.Class1079;
import lavahack.client.Class153;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Class2025 {
    public static final Class2025 Field17312 = new Class2025();
    private final Queue Field17313 = new ArrayDeque();
    private String Field17314 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class2025() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7488(TickEvent.ClientTickEvent clientTickEvent) {
        if (clientTickEvent.phase == TickEvent.Phase.START) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
        if (entityPlayerSP == null) return;
        if (entityPlayerSP.connection == null) return;
        if (entityPlayerSP.connection.getNetworkManager().isLocalChannel()) return;
        this.Method7490();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7489(TickEvent.ServerTickEvent serverTickEvent) {
        if (serverTickEvent.phase == TickEvent.Phase.START) {
            return;
        }
        this.Method7490();
    }

    private void Method7490() {
        if (this.Field17313.size() == 0) {
            return;
        }
        Class1079 class1079 = (Class1079)this.Field17313.poll();
        if (class1079 == null) {
            return;
        }
        if (class1079.Method4355()) {
            if (class1079.Method4354()) {
                TextComponentTranslation textComponentTranslation = new TextComponentTranslation("schematica.command.save.started", new Object[]{class1079.Field12816, class1079.Field12802.getName()});
                class1079.Field12800.sendMessage((ITextComponent)textComponentTranslation);
            }
            class1079.Method4353();
        }
        if (class1079.Method4355()) {
            this.Field17313.offer(class1079);
            return;
        }
        Class153.Method998(class1079.Field12802, class1079.Field12803, class1079.Field12799, class1079.Field12800);
    }

    public void Method7491(Class1079 class1079) {
        this.Field17313.offer(class1079);
    }

    private static String Method7492(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 197;
            cArray2[n] = (char)(cArray[n] ^ (0x4ECC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

