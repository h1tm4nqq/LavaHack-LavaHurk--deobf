//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.play.server.SPacketPlayerListItem
 *  net.minecraft.network.play.server.SPacketPlayerListItem$Action
 *  net.minecraft.network.play.server.SPacketPlayerListItem$AddPlayerData
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;
import lavahack.client.Class1177;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class414;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class872;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1737
extends Class42 {
    private final Class44 Field15970 = new Class44("Color", (Class42)this, "Color", new Class2027(Color.RED));
    private final Class44 Field15971 = new Class44("Chat Notify", (Class42)this, false);
    private final Class44 Field15972 = new Class44("Mode", (Class42)this, Class1177.Field13304);
    private final Class44 Field15973 = new Class44("Scale", (Class42)this, Double.longBitsToDouble(4569063951614083072L), Double.longBitsToDouble(4562254509136412672L), Double.longBitsToDouble((long)541767828 ^ 0x3F847AE1604AB894L), false);
    private final ArrayList Field15974 = new ArrayList();
    @Class1801
    private final Class618 Field15975 = new Class618(this::Method6609, new Predicate[0]);
    private String Field15976 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1737() {
        super("LogoutSpots", Class97.Field8342);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15970);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15971);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15972);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15973);
    }

    @Override
    public boolean Method52() {
        return true;
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field15974.clear();
        Class1796.Field16242.Method706(this.Field15975);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field15975);
        this.Field15974.clear();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6607(RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field15974.isEmpty()) return;
        this.Field15974.forEach(arg_0 -> Class1737.Method6612(renderWorldLastEvent, arg_0));
    }

    public Class872 Method6608(UUID uUID) {
        Class872 class872;
        Iterator iterator = this.Field15974.iterator();
        do {
            if (!iterator.hasNext()) return null;
            class872 = (Class872)iterator.next();
        } while (!class872.Field11674.equals(uUID));
        return class872;
    }

    private void Method6609(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerListItem)) return;
        SPacketPlayerListItem sPacketPlayerListItem = (SPacketPlayerListItem)class544.Method982();
        if (Class1737.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (sPacketPlayerListItem.getAction() != SPacketPlayerListItem.Action.ADD_PLAYER) return;
        if (sPacketPlayerListItem.getAction() != SPacketPlayerListItem.Action.REMOVE_PLAYER) {
            return;
        }
        sPacketPlayerListItem.getEntries().stream().filter(Objects::nonNull).filter(Class1737::Method6611).forEach(arg_0 -> this.Method6610(sPacketPlayerListItem, arg_0));
    }

    private void Method6610(SPacketPlayerListItem sPacketPlayerListItem, SPacketPlayerListItem.AddPlayerData addPlayerData) {
        switch (Class414.Field9716[sPacketPlayerListItem.getAction().ordinal()]) {
            case 1: {
                if (this.Method6608(addPlayerData.getProfile().getId()) == null) return;
                Class872 class872 = this.Method6608(addPlayerData.getProfile().getId());
                if (this.Field15971.Method365()) {
                    Class1393.Method5507().Method1886(class872.Field11670 + " is back at " + class872.Field11669.getX() + " " + class872.Field11669.getY() + " " + class872.Field11669.getZ());
                }
                this.Field15974.remove(class872);
                return;
            }
            case 2: {
                System.out.println("1");
                EntityPlayer entityPlayer = Class1737.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getPlayerEntityByUUID(addPlayerData.getProfile().getId());
                if (entityPlayer == null) {
                    return;
                }
                if (this.Field15971.Method365()) {
                    Class1393.Method5507().Method1886(entityPlayer.getName() + " just logout at " + entityPlayer.getPosition().getX() + " " + entityPlayer.getPosition().getY() + " " + entityPlayer.getPosition().getZ());
                }
                this.Field15974.add(new Class872(this, entityPlayer, this.Field15970.Method339()));
                return;
            }
        }
    }

    private static boolean Method6611(SPacketPlayerListItem.AddPlayerData addPlayerData) {
        if (addPlayerData.getProfile().getName() != null) {
            if (!addPlayerData.getProfile().getName().isEmpty()) return true;
        }
        if (addPlayerData.getProfile().getId() != null) return true;
        return false;
    }

    private static void Method6612(RenderWorldLastEvent renderWorldLastEvent, Class872 class872) {
        class872.Method3666(renderWorldLastEvent.getPartialTicks());
    }

    static Minecraft Method6613() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Class44 Method6614(Class1737 class1737) {
        return class1737.Field15972;
    }

    static Minecraft Method6615() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 45;
            cArray2[n] = (char)(cArray[n] ^ (0x35C1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

