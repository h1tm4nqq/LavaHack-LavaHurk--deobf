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
import lavahack.client.AG5XGLeElVwvXngqViprXwTIlpzeRva6;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.OjCSDzp5kn5BpbvwACM2vDjnF6zsYTmA;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class Vm7CB2P65HBcLaiUMlV18JYxanCNiE4F
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17820 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xAB5934E13572A7CDL ^ 0x94B0AD789572A7CDL), Double.longBitsToDouble(0x2520061D363D444AL ^ 0x1AC0061D363D444AL), 1.0, ((int)-857734583L ^ 0xCCE00249) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17821;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17822;
    private AG5XGLeElVwvXngqViprXwTIlpzeRva6 Field17823;
    private OjCSDzp5kn5BpbvwACM2vDjnF6zsYTmA Field17824;
    private boolean Field17825;
    int Field17826;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17827;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17828;
    private String Field17829 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Vm7CB2P65HBcLaiUMlV18JYxanCNiE4F() {
        super("PacketMineRewrite", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
        String[] stringArray = new String[(int)((long)-1695669340 ^ (long)-1695669339) << 2];
        stringArray[(int)((long)346623023 ^ (long)346623023)] = "None";
        stringArray[(int)-573922156L ^ 0xDDCAA495] = "Vanilla";
        stringArray[(int)((long)-1838488918 ^ (long)-1838488917) << 1] = "Normal";
        stringArray[(int)514029016L ^ 0x1EA375DB] = "Silent";
        this.Field17821 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "None", Arrays.asList(stringArray)));
        this.Field17822 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Queue", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1678814206L ^ 0x9BEF5402) != 0));
        this.Field17823 = null;
        this.Field17825 = (int)((long)-1031903415 ^ (long)-1031903416);
        this.Field17827 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7733, new Predicate[(int)((long)737393637 ^ (long)737393637)]);
        this.Field17828 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7732, new Predicate[(int)732844855L ^ 0x2BAE5337]);
        this.Field17824 = new OjCSDzp5kn5BpbvwACM2vDjnF6zsYTmA();
        this.Field17824.Method1775(this::Method7735);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17828);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17827);
        this.Field17823 = null;
        this.Field17825 = (int)-1436255999L ^ 0xAA647900;
        this.Field17826 = (int)((long)-330145175 ^ (long)330145174);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field17828);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field17827);
        this.Field17823 = null;
        this.Field17825 = (int)742365726L ^ 0x2C3F9A1E;
        this.Field17826 = (int)((long)1765453504 ^ (long)-1765453505);
    }

    @Override
    public void Method45() {
        if (Vm7CB2P65HBcLaiUMlV18JYxanCNiE4F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Vm7CB2P65HBcLaiUMlV18JYxanCNiE4F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field17826 = Vm7CB2P65HBcLaiUMlV18JYxanCNiE4F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (this.Field17823 == null) {
            return;
        }
        this.Field17823.Method3237();
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("" + this.Field17823.Method3235());
        if (this.Field17823.Method3235() >= this.Field17820.Method367()) {
            this.Field17825 = (int)((long)-1239161337 ^ (long)-1239161338);
            this.Method7731(this.Field17823.Method3234(), (boolean)((long)-1434497291 ^ (long)-1434497291));
            return;
        }
        this.Field17824.Method1770();
    }

    private void Method7730(BlockPos blockPos) {
        Vm7CB2P65HBcLaiUMlV18JYxanCNiE4F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.DOWN));
    }

    private void Method7731(int n, boolean bl) {
        String string = this.Field17821.Method359();
        int n2 = (int)((long)-74678545 ^ (long)74678544);
        switch (string.hashCode()) {
            case 2433880: {
                if (!string.equals("None")) return;
                n2 = (int)((long)1076035722 ^ (long)1076035722);
                return;
            }
            case 1897755483: {
                if (!string.equals("Vanilla")) return;
                n2 = (int)((long)-68879479 ^ (long)-68879480);
                return;
            }
            case -1955878649: {
                if (!string.equals("Normal")) return;
                n2 = ((int)-211495448L ^ 0xF364D5E9) << 1;
                return;
            }
            case -1818460043: {
                if (!string.equals("Silent")) return;
                n2 = (int)-1750317902L ^ 0x97AC44B1;
                return;
            }
        }
    }

    private void Method7732(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        SPacketBlockChange sPacketBlockChange = (SPacketBlockChange)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (sPacketBlockChange.getBlockPosition() != this.Field17823.Method3229()) return;
        this.Method7731(this.Field17826, (boolean)((long)-1103956405 ^ (long)-1103956406));
    }

    private void Method7733(PlayerInteractEvent.LeftClickBlock leftClickBlock) {
        if (Vm7CB2P65HBcLaiUMlV18JYxanCNiE4F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Vm7CB2P65HBcLaiUMlV18JYxanCNiE4F.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("Damaged block");
        if (!this.Field17825) {
            if (!this.Field17822.Method365()) return;
        }
        this.Field17825 = (int)-193407061L ^ 0xF478D7AB;
        this.Field17824.Method1766(() -> this.Method7734(leftClickBlock));
        this.Field17823 = new AG5XGLeElVwvXngqViprXwTIlpzeRva6(leftClickBlock.getPos());
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
        int n = (int)-1406882175L ^ 0xAC24AE81;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1560488273 ^ (long)1560488366);
            int n2 = (int)-45766542L ^ 0xFD45A8C3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1404726833L ^ 0xAC45ACA8) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

