//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1227
extends Class42 {
    public static List Field13571 = new ArrayList<String>(Arrays.asList("{name} owned by {player_name} with " + Class1796.Method6783(), "gg, {name}!", Class1796.Method6783() + " owning {name}"));
    private ConcurrentHashMap Field13572 = null;
    private int Field13573 = -1;
    private Class44 Field13574 = new Class44("Random message", (Class42)this, true);
    @Class1801
    private final Class618 Field13575 = new Class618(this::Method4943, new Predicate[0]);
    private String Field13576 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1227() {
        super("AutoEZ", "", Class97.Field8343);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field13574);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field13572 = new ConcurrentHashMap();
        Class1796.Field16242.Method706(this.Field13575);
    }

    @Override
    public void Method45() {
        if (Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        for (Entity entity : Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            String string;
            EntityPlayer entityPlayer;
            if (!(entity instanceof EntityPlayer) || !((entityPlayer = (EntityPlayer)entity).getHealth() < 0.0f) || !this.Method4940(string = entityPlayer.getName())) continue;
            this.Method4941(string);
            break;
        }
        this.Field13572.forEach(this::Method4944);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method4939(LivingDeathEvent livingDeathEvent) {
        EntityLivingBase entityLivingBase;
        if (Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        if (!((entityLivingBase = livingDeathEvent.getEntityLiving()) instanceof EntityPlayer)) return;
        EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
        if (!(entityPlayer.getHealth() < 0.0f)) return;
        String string = entityPlayer.getName();
        if (!this.Method4940(string)) return;
        this.Method4941(string);
    }

    private boolean Method4940(String string) {
        return this.Field13572.containsKey(string);
    }

    private void Method4941(String string) {
        this.Field13572.remove(string);
        if (this.Field13573 >= Field13571.size() - 1) {
            this.Field13573 = -1;
        }
        ++this.Field13573;
        String string2 = Field13571.size() > 0 && this.Field13574.Method365() ? (String)Field13571.get(this.Field13573) : "{name} ezzzz " + Class1796.Method6783() + " " + Class1796.Method6785() + " on top!";
        String string3 = string2.replaceAll("\u0e22\u0e07", "").replace("{name}", string).replace("{player_name}", Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName());
        if (string3.length() > 255) {
            string3 = string3.substring(0, 255);
        }
        Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(string3);
    }

    public void Method4942(String string) {
        if (Objects.equals(string, Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName())) return;
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        this.Field13572.put(string, 20);
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field13572 = null;
    }

    private void Method4943(Class805 class805) {
        if (Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        if (!(class805.Method982() instanceof CPacketUseEntity)) return;
        CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)class805.Method982();
        if (!cPacketUseEntity.action.equals((Object)CPacketUseEntity.Action.ATTACK)) return;
        Entity entity = cPacketUseEntity.getEntityFromWorld((World)Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        if (!(entity instanceof EntityPlayer)) return;
        this.Method4942(entity.getName());
    }

    private void Method4944(Object object, Object object2) {
        if ((Integer)object2 < 0) {
            this.Field13572.remove(object);
            return;
        }
        this.Field13572.put(object, (Integer)object2 - 1);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 166;
            cArray2[n] = (char)(cArray[n] ^ (0x22DB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

