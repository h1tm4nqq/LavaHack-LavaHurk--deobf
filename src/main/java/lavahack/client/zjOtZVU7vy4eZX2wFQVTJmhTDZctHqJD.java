//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.world.World;

public class zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12053 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1010245745L ^ 0xC3C8DF8F) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12054 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OnlyKillAura", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-729075981 ^ (long)-729075981)));
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12055 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method3917, new Predicate[(int)-1219869146L ^ 0xB74A4626]);
    private int Field12056;

    public zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD() {
        super("Criticals", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        super.Method44(this::Method3918);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12055);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12055);
    }

    private void Method3917(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketUseEntity)) return;
        CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        if (!cPacketUseEntity.action.equals((Object)CPacketUseEntity.Action.ATTACK)) return;
        if (!zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
        if (zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) return;
        if (zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater()) return;
        if (zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWeb) return;
        if (this.Field12054.Method365() && !leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162("KillAuraRewrite").Method35()) {
            return;
        }
        Entity entity = cPacketUseEntity.getEntityFromWorld((World)zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        if (!(entity instanceof EntityLivingBase)) return;
        double d = zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d2 = zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        if (this.Field12053.Method365()) {
            zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2 + Double.longBitsToDouble((long)1655709122 ^ 0x3FB1EB857C084C2EL), d3, ((int)-278831321L ^ 0xEF615F27) != 0));
            zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2 + Double.longBitsToDouble((long)1584021396 ^ 0x3FB47AE119C42BEFL), d3, (boolean)((long)297238940 ^ (long)297238940)));
            zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, ((int)1992750420L ^ 0x76C6F554) != 0));
        }
        zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2 + Double.longBitsToDouble((long)314225261 ^ 0x3FA999998B232BF7L), d3, ((int)1296404796L ^ 0x4D45913C) != 0));
        zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, ((int)1126593165L ^ 0x4326728D) != 0));
        zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2 + Double.longBitsToDouble(0xAF5742E30AFDDB10L ^ 0x90DFD197B697A5EAL), d3, ((int)2027849005L ^ 0x78DE852D) != 0));
        zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, d2, d3, ((int)-999589837L ^ 0xC46B7833) != 0));
        zjOtZVU7vy4eZX2wFQVTJmhTDZctHqJD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onCriticalHit(entity);
    }

    private String Method3918() {
        if (!this.Field12053.Method365()) return "";
        return "[Strict]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1994638533 ^ (long)-1994638533);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1068865118L ^ 0x3FB596A1);
            int n2 = (int)((long)-908959869 ^ (long)-908959862) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-2108630905L ^ 0x8250D9E4) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

