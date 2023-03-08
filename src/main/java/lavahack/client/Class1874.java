//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.client.gui.*;
import net.minecraft.network.play.client.*;

public class Class1874 extends Class42
{
    private boolean Field16601;
    @Class1801
    private final Class618 Field16602;
    private String Field16603 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1874() {
        super("Ghost", "Allows you to walk after death, after disabling you are respawn", Class97.Field8344);
        this.Field16601 = false;
        this.Field16602 = new Class618(this::Method6971, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field16602);
        this.Field16601 = false;
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field16602);
        if (Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.respawnPlayer();
        }
        this.Field16601 = false;
    }
    
    @Override
    public void Method45() {
        if (Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() == 0.0f) {
            Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setHealth(Float.intBitsToFloat(1101004800));
            Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isDead = false;
            this.Field16601 = true;
            Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.displayGuiScreen((GuiScreen)null);
            Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPositionAndUpdate(Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class1874.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        }
    }
    
    private void Method6971(final Class805 class805) {
        if (this.Field16601 && class805.Method982() instanceof CPacketPlayer) {
            class805.Method158();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2825 ^ 0x7F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
