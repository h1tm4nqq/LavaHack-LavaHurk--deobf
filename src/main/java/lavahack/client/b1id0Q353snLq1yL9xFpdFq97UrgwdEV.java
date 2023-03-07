//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class b1id0Q353snLq1yL9xFpdFq97UrgwdEV
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static b1id0Q353snLq1yL9xFpdFq97UrgwdEV Field10890;
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10891 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("StopSprint", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-72962913L ^ 0xFBA6AC9F) != 0));
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10892 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("GroundSpoof", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-66447760 ^ (long)-66447760)));
    private boolean Field10893;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field10894 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2877, new Predicate[(int)-1343310535L ^ 0xAFEEB539]);
    private String Field10895 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public b1id0Q353snLq1yL9xFpdFq97UrgwdEV() {
        super("AntiHunger", "Attempts to negate hunger loss", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        Field10890 = this;
    }

    @Override
    public void Method38() {
        if (b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting() || b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSprinting()) {
            this.Field10893 = (int)((long)16048740 ^ (long)16048741);
            b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.STOP_SPRINTING));
        }
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field10894);
    }

    @Override
    public void Method39() {
        if (b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field10894);
        if (!this.Field10893) return;
        this.Field10893 = (int)-707376257L ^ 0xD5D64B7F;
        b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_SPRINTING));
    }

    private void Method2877(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer) {
            if (!this.Field10892.Method365()) return;
            if (b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) return;
            if (b1id0Q353snLq1yL9xFpdFq97UrgwdEV.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) return;
            ((CPacketPlayer)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982()).onGround = (int)187091602L ^ 0xB26CA93;
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketEntityAction)) return;
        CPacketEntityAction cPacketEntityAction = (CPacketEntityAction)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        if (!cPacketEntityAction.getAction().equals((Object)CPacketEntityAction.Action.START_SPRINTING)) {
            if (!cPacketEntityAction.getAction().equals((Object)CPacketEntityAction.Action.STOP_SPRINTING)) return;
        }
        if (!this.Field10891.Method365()) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1494912372L ^ 0xA6E5728C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)272332649L ^ 0x103B7796);
            int n2 = (int)((long)1590530472 ^ (long)1590530459);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)153177322 ^ (long)153187057) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

