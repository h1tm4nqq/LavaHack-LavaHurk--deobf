//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import com.kisman.cc.util.*;
import net.minecraftforge.client.event.*;
import java.util.function.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import net.minecraft.network.play.server.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.*;

public class Class1737 extends Class42
{
    private final Class44 Field15970;
    private final Class44 Field15971;
    private final Class44 Field15972;
    private final Class44 Field15973;
    private final ArrayList Field15974;
    @Class1801
    private final Class618 Field15975;
    private String Field15976 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1737() {
        super("LogoutSpots", Class97.Field8342);
        this.Field15970 = new Class44("Color", this, "Color", new Class2027(Color.RED));
        this.Field15971 = new Class44("Chat Notify", this, false);
        this.Field15972 = new Class44("Mode", this, (Enum)Class1177.Field13304);
        this.Field15973 = new Class44("Scale", this, Double.longBitsToDouble(4569063951614083072L), Double.longBitsToDouble(4562254509136412672L), Double.longBitsToDouble((long)541767828 ^ 0x3F847AE1604AB894L), false);
        this.Field15974 = new ArrayList();
        this.Field15975 = new Class618(this::Method6609, new Predicate[0]);
        Class1737.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15970);
        Class1737.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15971);
        Class1737.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15972);
        Class1737.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field15973);
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
    public void Method6607(final RenderWorldLastEvent renderWorldLastEvent) {
        if (!this.Field15974.isEmpty()) {
            this.Field15974.forEach(Class1737::Method6612);
        }
    }
    
    public Class872 Method6608(final UUID obj) {
        for (final Class872 class872 : this.Field15974) {
            if (class872.Field11674.equals(obj)) {
                return class872;
            }
        }
        return null;
    }
    
    private void Method6609(final Class544 class544) {
        if (class544.Method982() instanceof SPacketPlayerListItem) {
            final SPacketPlayerListItem sPacketPlayerListItem = (SPacketPlayerListItem)class544.Method982();
            if (Class1737.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || sPacketPlayerListItem.getAction() != SPacketPlayerListItem$Action.ADD_PLAYER || sPacketPlayerListItem.getAction() != SPacketPlayerListItem$Action.REMOVE_PLAYER) {
                return;
            }
            sPacketPlayerListItem.getEntries().stream().filter(Objects::nonNull).filter(Class1737::Method6611).forEach(this::Method6610);
        }
    }
    
    private void Method6610(final SPacketPlayerListItem sPacketPlayerListItem, final SPacketPlayerListItem$AddPlayerData sPacketPlayerListItem$AddPlayerData) {
        switch (Class414.Field9716[sPacketPlayerListItem.getAction().ordinal()]) {
            case 1: {
                if (this.Method6608(sPacketPlayerListItem$AddPlayerData.getProfile().getId()) != null) {
                    final Class872 method6608 = this.Method6608(sPacketPlayerListItem$AddPlayerData.getProfile().getId());
                    if (this.Field15971.Method365()) {
                        Class1393.Method5507().Method1886(method6608.Field11670 + " is back at " + method6608.Field11669.getX() + " " + method6608.Field11669.getY() + " " + method6608.Field11669.getZ());
                    }
                    this.Field15974.remove(method6608);
                    break;
                }
                break;
            }
            case 2: {
                System.out.println("1");
                final EntityPlayer getPlayerEntityByUUID = Class1737.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getPlayerEntityByUUID(sPacketPlayerListItem$AddPlayerData.getProfile().getId());
                if (getPlayerEntityByUUID == null) {
                    return;
                }
                if (this.Field15971.Method365()) {
                    Class1393.Method5507().Method1886(getPlayerEntityByUUID.getName() + " just logout at " + getPlayerEntityByUUID.getPosition().getX() + " " + getPlayerEntityByUUID.getPosition().getY() + " " + getPlayerEntityByUUID.getPosition().getZ());
                }
                this.Field15974.add(new Class872(this, getPlayerEntityByUUID, this.Field15970.Method339()));
                break;
            }
        }
    }
    
    private static boolean Method6611(final SPacketPlayerListItem$AddPlayerData sPacketPlayerListItem$AddPlayerData) {
        return (sPacketPlayerListItem$AddPlayerData.getProfile().getName() != null && !sPacketPlayerListItem$AddPlayerData.getProfile().getName().isEmpty()) || sPacketPlayerListItem$AddPlayerData.getProfile().getId() != null;
    }
    
    private static void Method6612(final RenderWorldLastEvent renderWorldLastEvent, final Class872 class872) {
        class872.Method3666(renderWorldLastEvent.getPartialTicks());
    }
    
    static Minecraft Method6613() {
        return Class1737.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Class44 Method6614(final Class1737 class1737) {
        return class1737.Field15972;
    }
    
    static Minecraft Method6615() {
        return Class1737.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x35C1 ^ 0x2D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
