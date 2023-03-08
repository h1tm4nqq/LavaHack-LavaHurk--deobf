//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.item.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.init.*;
import net.minecraft.potion.*;
import java.util.*;

public class Class535 extends Class42
{
    private Class650 Field10259;
    private ItemStack Field10260;
    private String Field10261 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class535() {
        super("AutoPot", "auto potion", Class97.Field8338);
        this.Field10259 = new Class650();
        this.Field10260 = null;
    }
    
    public void Method45() {
        if (Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10260 == null && this.Field10259.Method2800(Float.intBitsToFloat(1120403456))) {
            this.Field10260 = Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand();
        }
        if (this.Method2426() && Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            final float rotationPitch = Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
            Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = Float.intBitsToFloat(1119092736);
            if (!Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive((Potion)Objects.requireNonNull(Potion.getPotionById(1)))) {
                this.Method2424(Class2019.Field17292);
            }
            if (!Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive((Potion)Objects.requireNonNull(Potion.getPotionById(5)))) {
                this.Method2424(Class2019.Field17291);
            }
            if (!Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive((Potion)Objects.requireNonNull(Potion.getPotionById(12)))) {
                this.Method2424(Class2019.Field17293);
            }
            Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = rotationPitch;
            this.Field10259.Method2801();
        }
    }
    
    public boolean Method52() {
        return true;
    }
    
    private void Method2424(final Class2019 class2019) {
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.Method2425(class2019)));
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem));
    }
    
    private int Method2425(final Class2019 class2019) {
        int n;
        for (n = 0; !this.Method2427(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), class2019); ++n) {}
        return n;
    }
    
    private boolean Method2426() {
        for (int n = 0; !this.Method2427(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), Class2019.Field17291) && !this.Method2427(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), Class2019.Field17292) && !this.Method2427(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), Class2019.Field17293); ++n) {}
        return true;
    }
    
    private boolean Method2427(final ItemStack itemStack, final Class2019 class2019) {
        if (itemStack == null) {
            return false;
        }
        if (itemStack.getItem() == Items.SPLASH_POTION) {
            int n = 5;
            switch (Class1211.Field13493[class2019.ordinal()]) {
                case 1: {
                    n = 5;
                    break;
                }
                case 2: {
                    n = 1;
                    break;
                }
                case 3: {
                    n = 12;
                    break;
                }
            }
            final Iterator<PotionEffect> iterator = PotionUtils.getEffectsFromStack(itemStack).iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getPotion() == Potion.getPotionById(n)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7C6C ^ 0x96));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
