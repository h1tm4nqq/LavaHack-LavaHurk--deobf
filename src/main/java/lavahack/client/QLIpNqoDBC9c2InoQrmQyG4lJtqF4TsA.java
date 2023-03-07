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
import lavahack.client.MWKsjf2F7eDKYSgsSUOF8imukA0mof8z;
import lavahack.client.k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class QLIpNqoDBC9c2InoQrmQyG4lJtqF4TsA {
    public static final QLIpNqoDBC9c2InoQrmQyG4lJtqF4TsA Field17312 = new QLIpNqoDBC9c2InoQrmQyG4lJtqF4TsA();
    private final Queue Field17313 = new ArrayDeque();
    private String Field17314 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private QLIpNqoDBC9c2InoQrmQyG4lJtqF4TsA() {
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
        k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2 = (k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt)this.Field17313.poll();
        if (k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2 == null) {
            return;
        }
        if (k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Method4355()) {
            if (k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Method4354()) {
                Object[] objectArray = new Object[(int)((long)892417692 ^ (long)892417693) << 1];
                objectArray[(int)((long)-833690851 ^ (long)-833690851)] = k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Field12816;
                objectArray[(int)((long)-1097147674 ^ (long)-1097147673)] = k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Field12802.getName();
                TextComponentTranslation textComponentTranslation = new TextComponentTranslation("schematica.command.save.started", objectArray);
                k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Field12800.sendMessage((ITextComponent)textComponentTranslation);
            }
            k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Method4353();
        }
        if (k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Method4355()) {
            this.Field17313.offer(k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2);
            return;
        }
        MWKsjf2F7eDKYSgsSUOF8imukA0mof8z.Method998(k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Field12802, k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Field12803, k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Field12799, k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2.Field12800);
    }

    public void Method7491(k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2) {
        this.Field17313.offer(k5jJBehjES6dX7LQQbLuDHcmS2aUaXdt2);
    }

    private static String Method7492(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)474426483L ^ 0x1C472C73;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)699687895 ^ (long)699687720);
            int n2 = (int)677997722L ^ 0x28696C5F;
            cArray2[n] = (char)(cArray[n] ^ (((int)1269765963L ^ 0x4BAF04F8) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

