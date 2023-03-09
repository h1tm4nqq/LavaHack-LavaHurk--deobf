//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.network.play.server.SPacketBlockChange
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$LeftClickBlock
 */
package lavahack.client;

import java.util.Arrays;
import java.util.function.Predicate;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class352;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class776;
import lavahack.client.Class97;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class Class2147
extends Class42 {
    private final Class44 Field17820 = this.Method23(new Class44("Speed", (Class42)this, Double.longBitsToDouble(4605380979056443392L), Double.longBitsToDouble(4602678819172646912L), 1.0, false));
    private final Class44 Field17821 = this.Method23(new Class44("Switch", (Class42)this, "None", Arrays.asList("None", "Vanilla", "Normal", "Silent")));
    private final Class44 Field17822 = this.Method23(new Class44("Queue", (Class42)this, false));
    private Class776 Field17823 = null;
    private Class352 Field17824;
    private boolean Field17825 = true;
    int Field17826;
    private final Class618 Field17827 = new Class618(this::Method7733, new Predicate[0]);
    private final Class618 Field17828 = new Class618(this::Method7732, new Predicate[0]);
    private String Field17829 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2147() {
        super("PacketMineRewrite", Class97.Field8344);
        this.Field17824 = new Class352();
        this.Field17824.Method1775(this::Method7735);
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
        if (Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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

    private void Method7730(BlockPos blockPos) {
        Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
    }

    private void Method7731(int n, boolean bl) {
        String string = this.Field17821.Method359();
        int n2 = -1;
        switch (string.hashCode()) {
            case 2433880: {
                if (!string.equals("None")) return;
                return;
            }
            case 1897755483: {
                if (!string.equals("Vanilla")) return;
                return;
            }
            case -1955878649: {
                if (!string.equals("Normal")) return;
                return;
            }
            case -1818460043: {
                if (!string.equals("Silent")) return;
                return;
            }
        }
    }

    private void Method7732(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        SPacketBlockChange sPacketBlockChange = (SPacketBlockChange)class544.Method982();
        if (sPacketBlockChange.getBlockPosition() != this.Field17823.Method3229()) return;
        this.Method7731(this.Field17826, true);
    }

    private void Method7733(PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        if (Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class2147.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Class1393.Method5506().Method1886("Damaged block");
        if (!this.Field17825) {
            if (!this.Field17822.Method365()) return;
        }
        this.Field17825 = false;
        this.Field17824.Method1766(() -> this.Method7734(leftClickBlock));
        this.Field17823 = new Class776(leftClickBlock.getPos());
        this.Field17823.Method3231();
    }

    private void Method7734(PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        this.Method7730(leftClickBlock.getPos());
    }

    private boolean Method7735() {
        return this.Field17825;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 177;
            cArray2[n] = (char)(cArray[n] ^ (0x7ACE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

