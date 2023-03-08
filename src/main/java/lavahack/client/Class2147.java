//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.network.play.server.*;
import net.minecraftforge.event.entity.player.*;

public class Class2147 extends Class42
{
    private final Class44 Field17820;
    private final Class44 Field17821;
    private final Class44 Field17822;
    private Class776 Field17823;
    private Class352 Field17824;
    private boolean Field17825;
    int Field17826;
    private final Class618 Field17827;
    private final Class618 Field17828;
    private String Field17829 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2147() {
        super("PacketMineRewrite", Class97.Field8344);
        this.Field17820 = this.Method23(new Class44("Speed", this, Double.longBitsToDouble(4605380979056443392L), Double.longBitsToDouble(4602678819172646912L), 1.0, false));
        this.Field17821 = this.Method23(new Class44("Switch", this, "None", Arrays.asList("None", "Vanilla", "Normal", "Silent")));
        this.Field17822 = this.Method23(new Class44("Queue", this, false));
        this.Field17823 = null;
        this.Field17825 = true;
        this.Field17827 = new Class618(this::Method7733, new Predicate[0]);
        this.Field17828 = new Class618(this::Method7732, new Predicate[0]);
        (this.Field17824 = new Class352()).Method1775(this::Method7735);
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field17828);
        Class1796.Field16242.Method706(this.Field17827);
        this.Field17823 = null;
        this.Field17825 = true;
        this.Field17826 = -1;
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field17828);
        Class1796.Field16242.Method711(this.Field17827);
        this.Field17823 = null;
        this.Field17825 = false;
        this.Field17826 = -1;
    }
    
    @Override
    public void Method45() {
        if (Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field17826 = Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (this.Field17823 == null) {
            return;
        }
        this.Field17823.Method3237();
        Class1393.Method5506().Method1886("" + this.Field17823.Method3235());
        if (this.Field17823.Method3235() >= this.Field17820.Method367()) {
            this.Field17825 = true;
            this.Method7731(this.Field17823.Method3234(), false);
            return;
        }
        this.Field17824.Method1770();
    }
    
    private void Method7730(final BlockPos blockPos) {
        Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
    }
    
    private void Method7731(final int n, final boolean b) {
        final String method359 = this.Field17821.Method359();
        switch (method359.hashCode()) {
            case 2433880: {
                if (method359.equals("None")) {
                    break;
                }
                break;
            }
            case 1897755483: {
                if (method359.equals("Vanilla")) {
                    break;
                }
                break;
            }
            case -1955878649: {
                if (method359.equals("Normal")) {
                    break;
                }
                break;
            }
            case -1818460043: {
                if (method359.equals("Silent")) {
                    break;
                }
                break;
            }
        }
    }
    
    private void Method7732(final Class544 class544) {
        if (!(class544.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        if (((SPacketBlockChange)class544.Method982()).getBlockPosition() == this.Field17823.Method3229()) {
            this.Method7731(this.Field17826, true);
        }
    }
    
    private void Method7733(final PlayerInteractEvent$LeftClickBlock playerInteractEvent$LeftClickBlock) {
        if (Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Class1393.Method5506().Method1886("Damaged block");
        if (this.Field17825 || this.Field17822.Method365()) {
            this.Field17825 = false;
            this.Field17824.Method1766(this::Method7734);
            (this.Field17823 = new Class776(playerInteractEvent$LeftClickBlock.getPos())).Method3231();
        }
    }
    
    private void Method7734(final PlayerInteractEvent$LeftClickBlock playerInteractEvent$LeftClickBlock) {
        this.Method7730(playerInteractEvent$LeftClickBlock.getPos());
    }
    
    private boolean Method7735() {
        return this.Field17825;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7ACE ^ 0xB1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
