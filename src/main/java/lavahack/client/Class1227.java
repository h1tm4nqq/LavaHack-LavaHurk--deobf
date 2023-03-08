//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import net.minecraft.entity.player.*;
import java.util.function.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.client.*;
import net.minecraft.world.*;
import java.util.*;

public class Class1227 extends Class42
{
    public static List Field13571;
    private ConcurrentHashMap Field13572;
    private int Field13573;
    private Class44 Field13574;
    @Class1801
    private final Class618 Field13575;
    private String Field13576 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1227() {
        super("AutoEZ", "", Class97.Field8343);
        this.Field13572 = null;
        this.Field13573 = -1;
        this.Field13574 = new Class44("Random message", this, true);
        this.Field13575 = new Class618(this::Method4943, new Predicate[0]);
        Class1227.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field13574);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field13572 = new ConcurrentHashMap();
        Class1796.Field16242.Method706(this.Field13575);
    }
    
    @Override
    public void Method45() {
        if (Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field13572 == null) {
            this.Field13572 = new ConcurrentHashMap();
        }
        for (final Entity entity : Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (entity instanceof EntityPlayer) {
                final EntityPlayer entityPlayer = (EntityPlayer)entity;
                if (entityPlayer.getHealth() >= 0.0f) {
                    continue;
                }
                final String getName = entityPlayer.getName();
                if (this.Method4940(getName)) {
                    this.Method4941(getName);
                    break;
                }
                continue;
            }
        }
        this.Field13572.forEach(this::Method4944);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method4939(final LivingDeathEvent livingDeathEvent) {
        if (Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            if (this.Field13572 == null) {
                this.Field13572 = new ConcurrentHashMap();
            }
            final EntityLivingBase entityLiving = livingDeathEvent.getEntityLiving();
            if (entityLiving instanceof EntityPlayer) {
                final EntityPlayer entityPlayer = (EntityPlayer)entityLiving;
                if (entityPlayer.getHealth() < 0.0f) {
                    final String getName = entityPlayer.getName();
                    if (this.Method4940(getName)) {
                        this.Method4941(getName);
                    }
                }
            }
        }
    }
    
    private boolean Method4940(final String key) {
        return this.Field13572.containsKey(key);
    }
    
    private void Method4941(final String s) {
        this.Field13572.remove(s);
        if (this.Field13573 >= Class1227.Field13571.size() - 1) {
            this.Field13573 = -1;
        }
        ++this.Field13573;
        String string;
        if (Class1227.Field13571.size() > 0 && this.Field13574.Method365()) {
            string = Class1227.Field13571.get(this.Field13573);
        }
        else {
            string = "{name} ezzzz " + Class1796.Method6783() + " " + Class1796.Method6785() + " on top!";
        }
        String s2 = string.replaceAll("\u0e22\u0e07", "").replace("{name}", s).replace("{player_name}", Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName());
        if (s2.length() > 255) {
            s2 = s2.substring(0, 255);
        }
        Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.sendChatMessage(s2);
    }
    
    public void Method4942(final String s) {
        if (!Objects.equals(s, Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getName())) {
            if (this.Field13572 == null) {
                this.Field13572 = new ConcurrentHashMap();
            }
            this.Field13572.put(s, 20);
        }
    }
    
    @Override
    public void Method39() {
        super.Method39();
        this.Field13572 = null;
    }
    
    private void Method4943(final Class805 class805) {
        if (Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            if (this.Field13572 == null) {
                this.Field13572 = new ConcurrentHashMap();
            }
            if (class805.Method982() instanceof CPacketUseEntity) {
                final CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)class805.Method982();
                if (cPacketUseEntity.action.equals((Object)CPacketUseEntity$Action.ATTACK)) {
                    final Entity getEntityFromWorld = cPacketUseEntity.getEntityFromWorld((World)Class1227.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
                    if (getEntityFromWorld instanceof EntityPlayer) {
                        this.Method4942(getEntityFromWorld.getName());
                    }
                }
            }
        }
    }
    
    private void Method4944(final Object o, final Object o2) {
        if ((int)o2 < 0) {
            this.Field13572.remove(o);
        }
        else {
            this.Field13572.put(o, (int)o2 - 1);
        }
    }
    
    static {
        Class1227.Field13571 = new ArrayList(Arrays.asList("{name} owned by {player_name} with " + Class1796.Method6783(), "gg, {name}!", Class1796.Method6783() + " owning {name}"));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x22DB ^ 0xA6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
