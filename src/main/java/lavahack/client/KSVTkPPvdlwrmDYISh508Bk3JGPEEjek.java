//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.MoverType
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.util.MovementInput
 *  net.minecraft.util.MovementInputFromOptions
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.InputUpdateEvent
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.KSVTkPPvdlwrmDYISh508Bk3JGPEEjek$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.KSVTkPPvdlwrmDYISh508Bk3JGPEEjek$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class KSVTkPPvdlwrmDYISh508Bk3JGPEEjek
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field17918 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Holes", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10371).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field17919 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("HoleType", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9224).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17920 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HoleRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)717586480 ^ 0x401000002AC58030L), 1.0, Double.longBitsToDouble(0xA6C3E2BC61D72A94L ^ 0xE6EDE2BC61D72A94L), ((int)1009117712L ^ 0x3C25EA10) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17921 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HoleYRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)332335877 ^ 0x4010000013CF0B05L), 1.0, Double.longBitsToDouble((long)955124051 ^ 0x4020000038EE0953L), (boolean)((long)-493702389 ^ (long)-493702389)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17922 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timeout", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)162971374 ^ (long)162971375)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17923 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TimeoutTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xE273781F115923E0L ^ 0xA247781F115923E0L), 0.0, Double.longBitsToDouble((long)52714992 ^ 0x4059000003245DF0L), ((int)-354370857L ^ 0xEAE0BAD6) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17924 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("StuckTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1228165964 ^ 0x401400004934534CL), 0.0, Double.longBitsToDouble((long)147648560 ^ 0x4044000008CCF030L), ((int)-795193347L ^ 0xD09A4FFC) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17925 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xA57238F202E0E44BL ^ 0x9AA05BED88E9E695L), Double.longBitsToDouble((long)796706795 ^ 0x3FA99999B6E55E71L), Double.longBitsToDouble((long)342917163 ^ 0x3FE000001470802BL), (boolean)((long)-1830842732 ^ (long)-1830842732)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17926 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Snap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-343999819L ^ 0xEB7EFAB4) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17927 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timer", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)445296929 ^ (long)445296929)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17928 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TimerSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x461168063E1C0EB2L ^ 0x79E000748E3CCA2EL), 1.0, Double.longBitsToDouble((long)164807849 ^ 0x4014000009D2C4A9L), (boolean)((long)1239235646 ^ (long)1239235646)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17929 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1216272894 ^ (long)-1216272893)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17930 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LineWidth", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)705963975 ^ 0x3FF800002A1427C7L), Double.longBitsToDouble(0x449F190B0BDE2316L ^ 0x7B7F190B0BDE2316L), Double.longBitsToDouble((long)1588305122 ^ 0x401000005EAB9CE2L), ((int)764273476L ^ 0x2D8DE344) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17931 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)1702480225L ^ 0x6579C99E, (int)((long)142773697 ^ (long)142773566), (int)1137926280L ^ 0x43D36077, (int)((long)-1386798524 ^ (long)-1386798405))));
    private int Field17932 = (int)2019112664L ^ 0x785936D8;
    private int Field17933 = (int)-294283718L ^ 0xEE75963A;
    private AxisAlignedBB Field17934 = null;
    private float Field17935;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17936 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7823, new Predicate[(int)-369831103L ^ 0xE9F4D341]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17937 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7822, new Predicate[(int)1536153670L ^ 0x5B8FD846]);
    private String Field17938 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public KSVTkPPvdlwrmDYISh508Bk3JGPEEjek() {
        super("HoleSnap", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340, (boolean)((long)-48538078 ^ (long)-48538077));
    }

    @Override
    public void Method38() {
        super.Method38();
        if (KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field17935 = KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength;
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
        KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = this.Field17935;
        this.Field17932 = (int)((long)-1549523167 ^ (long)-1549523167);
        this.Field17933 = (int)99163105L ^ 0x5E91BE1;
        this.Field17934 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7813(RenderWorldLastEvent renderWorldLastEvent) {
        if (KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (this.Field17934 == null) {
            return;
        }
        if (!this.Field17929.Method365()) {
            return;
        }
        Vec3d vec3d = this.Method7816(this.Field17934);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        GL11.glLineWidth((float)this.Field17930.Method368());
        bufferBuilder.begin((int)((long)1570245798 ^ (long)1570245797), DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ).color(this.Field17931.Method322() / Float.intBitsToFloat((int)((long)1606209712 ^ (long)482594992)), this.Field17931.Method324() / Float.intBitsToFloat((int)1735427658L ^ 0x240F864A), this.Field17931.Method326() / Float.intBitsToFloat((int)1885522763L ^ 0x331DCB4B), this.Field17931.Method328() / Float.intBitsToFloat((int)((long)753111183 ^ (long)1872531599)));
        bufferBuilder.pos(vec3d.x - KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosX, vec3d.y - KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosY, vec3d.z - KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.renderManager.viewerPosZ).color(this.Field17931.Method322() / Float.intBitsToFloat((int)((long)806800787 ^ (long)1936313747)), this.Field17931.Method324() / Float.intBitsToFloat((int)((long)179731849 ^ (long)1237941641)), this.Field17931.Method326() / Float.intBitsToFloat(0x17E7F113 ^ 0x5498F113), this.Field17931.Method328() / Float.intBitsToFloat((int)((long)1952717403 ^ (long)924523099)));
        tessellator.draw();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7814(InputUpdateEvent inputUpdateEvent) {
        if (!(inputUpdateEvent.getMovementInput() instanceof MovementInputFromOptions)) {
            return;
        }
        if (this.Field17934 == null) {
            return;
        }
        MovementInput movementInput = inputUpdateEvent.getMovementInput();
        movementInput.moveForward = 0.0f;
        movementInput.moveStrafe = 0.0f;
        movementInput.forwardKeyDown = (int)((long)1495172228 ^ (long)1495172228);
        movementInput.backKeyDown = (int)((long)447510587 ^ (long)447510587);
        movementInput.leftKeyDown = (int)1830837374L ^ 0x6D205C7E;
        movementInput.rightKeyDown = (int)883552192L ^ 0x34A9EFC0;
    }

    private boolean Method7815(AxisAlignedBB axisAlignedBB, AxisAlignedBB axisAlignedBB2) {
        int n3 = (int)-629092200L ^ 0xDA80D098;
        n3 = n3 | axisAlignedBB.contains(new Vec3d(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.minZ));
        n3 = n3 | axisAlignedBB.contains(new Vec3d(axisAlignedBB2.minX, axisAlignedBB2.minY, axisAlignedBB2.maxZ));
        n3 = n3 | axisAlignedBB.contains(new Vec3d(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.minZ));
        return (n3 | axisAlignedBB.contains(new Vec3d(axisAlignedBB2.maxX, axisAlignedBB2.minY, axisAlignedBB2.maxZ))) != 0;
    }

    private Vec3d Method7816(AxisAlignedBB axisAlignedBB) {
        double d = axisAlignedBB.maxX - axisAlignedBB.minX;
        double d2 = axisAlignedBB.maxZ - axisAlignedBB.minZ;
        return new Vec3d(axisAlignedBB.minX + d / Double.longBitsToDouble((long)932221853 ^ 0x400000003790939DL), axisAlignedBB.minY, axisAlignedBB.minZ + d2 / Double.longBitsToDouble((long)777287270 ^ 0x400000002E547666L));
    }

    private AxisAlignedBB Method7817() {
        Set set = this.Method7818();
        ArrayList<AxisAlignedBB> arrayList = new ArrayList<AxisAlignedBB>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7131(blockPos, ((int)781234576L ^ 0x2E90B190) != 0, ((int)1034715855L ^ 0x3DAC82CF) != 0);
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6959();
            AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6960();
            if (ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV == AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9771 || !((KSVTkPPvdlwrmDYISh508Bk3JGPEEjek$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field17918.Method341()).Method2468(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) || !((KSVTkPPvdlwrmDYISh508Bk3JGPEEjek$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field17919.Method341()).Method1495(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)) continue;
            arrayList.add(ayPWGf0RtPJRELT0RVLeRLYWz01HiKiM$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6961());
        }
        return arrayList.stream().filter(KSVTkPPvdlwrmDYISh508Bk3JGPEEjek::Method7821).filter(this::Method7820).min(Comparator.comparingDouble(this::Method7819)).orElse(null);
    }

    private Set Method7818() {
        HashSet<BlockPos> hashSet = new HashSet<BlockPos>();
        List list = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7758(this.Field17920.Method368(), ((int)-1987139115L ^ 0x898EA9D4) != 0, ((int)-129977661L ^ 0xF840B2C3) != 0);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
            if (!KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).isEmpty() || !KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)647537307 ^ (long)647537307), (int)((long)-651544891 ^ (long)651544890), (int)-1460226188L ^ 0xA8F6B774)).getBlock().equals(Blocks.AIR) || !KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)-125035293 ^ (long)-125035293), (int)((long)-1162099688 ^ (long)-1162099687), (int)((long)698570790 ^ (long)698570790))).getBlock().equals(Blocks.AIR) || !KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)1357747038L ^ 0x50ED935E, (int)((long)1344520671 ^ (long)1344520670) << 1, (int)((long)-644305411 ^ (long)-644305411))).getBlock().equals(Blocks.AIR)) continue;
            hashSet.add(blockPos);
        }
        return hashSet;
    }

    private double Method7819(AxisAlignedBB axisAlignedBB) {
        return KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(this.Method7816((AxisAlignedBB)axisAlignedBB).x, this.Method7816((AxisAlignedBB)axisAlignedBB).y, this.Method7816((AxisAlignedBB)axisAlignedBB).z);
    }

    private boolean Method7820(AxisAlignedBB axisAlignedBB) {
        int n;
        if (KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - axisAlignedBB.minY <= this.Field17921.Method367()) {
            n = (int)644100563L ^ 0x266431D2;
            return n != 0;
        }
        n = (int)((long)1143432534 ^ (long)1143432534);
        return n != 0;
    }

    private static boolean Method7821(AxisAlignedBB axisAlignedBB) {
        boolean bl;
        if (axisAlignedBB.minY < KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY) {
            bl = (int)1320582920L ^ 0x4EB67F09;
            return bl;
        }
        bl = (int)-1927227618L ^ 0x8D20D71E;
        return bl;
    }

    private void Method7822(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2) {
        if (uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14102 != MoverType.SELF) {
            return;
        }
        if (this.Field17934 == null) {
            this.Field17934 = this.Method7817();
        }
        this.Field17932 = this.Field17934 == null ? (this.Field17932 += (int)((long)-275135295 ^ (long)-275135296)) : (int)-611882522L ^ 0xDB8769E6;
        if (this.Field17934 == null && this.Field17922.Method365() && this.Field17932 > this.Field17923.Method335()) {
            this.Method22();
            return;
        }
        if (this.Field17934 == null) {
            return;
        }
        double d = Math.hypot(KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ);
        if (this.Field17933 > this.Field17924.Method335()) {
            this.Method22();
            return;
        }
        Vec3d vec3d = this.Method7816(this.Field17934);
        if (this.Field17926.Method365() && this.Method7815(this.Field17934, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().expand(0.0, Double.longBitsToDouble((long)786191787 ^ 0xBFA99999B745CC31L), 0.0))) {
            KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(vec3d.x, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, vec3d.z, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(vec3d.x, KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, vec3d.z);
            this.Method22();
            return;
        }
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Method158();
        if (this.Field17927.Method365()) {
            KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat((int)1495896966L ^ 0x1B619386) / this.Field17928.Method368();
        }
        Vec3d vec3d2 = KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
        double d2 = Math.toRadians(YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4303(vec3d2, vec3d)[(int)-18403856L ^ 0xFEE72DF0]);
        double d3 = Math.hypot(vec3d.x - vec3d2.x, vec3d.z - vec3d2.z);
        if (!this.Field17926.Method365() && d3 == 0.0) {
            this.Method22();
            return;
        }
        double d4 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1959((EntityLivingBase)KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field17925.Method367());
        double d5 = KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround ? d4 : Math.max(d + Double.longBitsToDouble((long)2022481171 ^ 0x3F947AE13F228968L), d4);
        double d6 = Math.min(d5, d3);
        KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14103 = -Math.sin(d2) * d6;
        uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14105 = Math.cos(d2) * d6;
        if (KSVTkPPvdlwrmDYISh508Bk3JGPEEjek.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            this.Field17933 += (int)-505069822L ^ 0xE1E53F03;
            return;
        }
        this.Field17933 = (int)((long)-959888995 ^ (long)-959888995);
    }

    private void Method7823(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerPosLook)) return;
        this.Method22();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)811433407L ^ 0x305D7DBF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1916723420 ^ (long)1916723235);
            int n2 = ((int)-338649791L ^ 0xEBD09D7A) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-597329150L ^ 0xDC655137) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

