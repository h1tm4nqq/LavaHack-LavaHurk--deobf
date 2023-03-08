//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.util.function.*;
import java.util.*;
import net.minecraft.init.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;

public class Class1925 extends Class42
{
    private final Class44 Field16935;
    private final Class44 Field16936;
    private final Class44 Field16937;
    private final Class44 Field16938;
    private final Class650 Field16939;
    private String Field16940 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1925() {
        super("SilentXP", "SilentXp", Class97.Field8338);
        this.Field16935 = this.Method23(new Class44("Custom Pitch", this, true));
        this.Field16936 = this.Method23(new Class44("LookPitch", this, Double.longBitsToDouble((long)1261038792 ^ 0x405680004B29ECC8L), 0.0, Double.longBitsToDouble((long)600844875 ^ 0xC056800023D02A4BL), false).Method313(this.Field16935::Method365));
        this.Field16937 = this.Method23(new Class44("Delay", this, 0.0, 0.0, Double.longBitsToDouble((long)1848913247 ^ 0x405900006E342D5FL), Class467.Field9943));
        this.Field16938 = this.Method23(new Class44("SwitchMode", this, "Packet", new ArrayList((Collection<? extends E>)Arrays.asList("Packet", "Client"))));
        this.Field16939 = new Class650();
    }
    
    @Override
    public void Method38() {
        this.Field16939.Method2801();
    }
    
    @Override
    public void Method45() {
        if (!this.Field16939.Method2797((long)this.Field16937.Method335())) {
            return;
        }
        this.Field16939.Method2801();
        if (Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen == null && Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            final int currentItem = Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            if (Class9.Method116(Items.EXPERIENCE_BOTTLE, 0, 9) == -1) {
                Class1393.Method5504().Method1886("No XP in hotbar! Disabling!");
                this.Method37();
                return;
            }
            final String method359 = this.Field16938.Method359();
            switch (method359.hashCode()) {
                case -1911998296: {
                    if (method359.equals("Packet")) {
                        break;
                    }
                    break;
                }
                case 2021122027: {
                    if (method359.equals("Client")) {
                        break;
                    }
                    break;
                }
            }
            final float rotationPitch = Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
            if (this.Field16935.Method365()) {
                Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = (float)this.Field16936.Method367();
            }
            Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, (float)this.Field16936.Method367(), true));
            Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
            if (this.Field16935.Method365()) {
                Class1925.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = rotationPitch;
            }
            final String method360 = this.Field16938.Method359();
            switch (method360.hashCode()) {
                case -1911998296: {
                    if (method360.equals("Packet")) {
                        break;
                    }
                    break;
                }
                case 2021122027: {
                    if (method360.equals("Client")) {
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x37A6 ^ 0x3A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
