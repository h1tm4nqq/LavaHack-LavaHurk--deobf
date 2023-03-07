//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiDownloadTerrain
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketConfirmTeleport
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.network.play.server.SPacketPlayerPosLook$EnumFlags
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$1;
import lavahack.client.JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class JYuwLNnxeMekwglmaM1sLih2vGBl6MtT
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT Field8725;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8726 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Type", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14178).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8727 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field8270).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8728 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("JitterBoundsVertical", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8DF348CC62D4055L ^ 0x48E9348CC62D4055L), 0.0, Double.longBitsToDouble(0x5A32B444D1248DBDL ^ 0x1A7BB444D1248DBDL), (boolean)((long)-1035827156 ^ (long)-1035827155)).Method314((this.Field8727.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field8272 ? (int)((long)-1337024583 ^ (long)-1337024584) : (int)((long)1565196903 ^ (long)1565196903)) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8729 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("JitterBoundsHorizontal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC7AD0E087E48C633L ^ 0x87890E087E48C633L), 0.0, Double.longBitsToDouble((long)608360434 ^ 0x404900002442D7F2L), (boolean)((long)-1828032166 ^ (long)-1828032165)).Method314((this.Field8727.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field8272 ? (int)-83698864L ^ 0xFB02DB51 : (int)-215113459L ^ 0xF32DA10D) != 0));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8730 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9616).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8731 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Phase", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field13608).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8732 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16446).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8733 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MultiAxis", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-604499351 ^ (long)-604499351)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8734 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NoPhaseSlow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-721950288L ^ 0xD4F7E9B0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8735 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0xE85890EE77A038CAL ^ 0xA87C90EE77A038CAL), (boolean)((long)1205036744 ^ (long)1205036744)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8736 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0x972FB523D9E07981L ^ 0xD70BB523D9E07981L), (boolean)((long)-355064330 ^ (long)-355064330)).Method313(this::Method1091));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field8737 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("AntiKick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11067).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8738 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-865100602L ^ 0xCC6F9CC6) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8739 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bounds", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-620844216L ^ 0xDAFEAB49) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8740 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Confirm", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1863381378L ^ 0x6F10F182) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8741 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Constrict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)993379895L ^ 0x3B35C637) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8742 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Conceal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-56482174 ^ (long)-56482174)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8743 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ForConceal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1682241404 ^ (long)1682241404)).Method313(this.Field8742::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8744 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ConcealTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)780659828 ^ 0x402400002E87EC74L), 1.0, Double.longBitsToDouble(0x772EC9CE213DF7DAL ^ 0x3760C9CE213DF7DAL), ((int)2014928979L ^ 0x78196052) != 0).Method313(this.Field8742::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8745 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Jitter", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)612509763L ^ 0x24822843) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8746 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("JitterTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x522C8DC3C4A32C90L ^ 0x12308DC3C4A32C90L), Double.longBitsToDouble(0x2EA2CD3481CE1B8DL ^ 0x6EA2CD3481CE1B8DL), Double.longBitsToDouble(0xEEB03625C5EDB158L ^ 0xAE9E3625C5EDB158L), (boolean)((long)-443391299 ^ (long)-443391300)).Method313(this.Field8745::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8747 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ClearTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1064545555 ^ 0x403400003F73AD13L), Double.longBitsToDouble(0xAF88B81B7451CCADL ^ 0xEF88B81B7451CCADL), Double.longBitsToDouble(0x1676410360E5528DL ^ 0x563F410360E5528DL), (boolean)((long)-777365390 ^ (long)-777365389)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8748 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TimerSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0xF14A750FC23D727L ^ 0x30E2C1369A45B141L), (boolean)((long)-1838251061 ^ (long)-1838251061)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8749 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ShrinkBoundingBox", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1110409270L ^ 0x422F8036) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8750 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Facrotize", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)-1929877571L ^ 0x8CF867BD).Method313(this::Method1090));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8751 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x70F9942382FA684DL ^ 0x30ED942382FA684DL), 1.0, Double.longBitsToDouble((long)504282770 ^ 0x403400001E0EBE92L), (boolean)((long)-1593377764 ^ (long)-1593377764)).Method313(this::Method1089));
    private static final Random Field8752;
    private static final double Field8753;
    private int Field8754;
    private CPacketPlayer.Position Field8755;
    private List Field8756 = new ArrayList();
    private Map Field8757 = new ConcurrentHashMap();
    private int Field8758;
    private int Field8759 = (int)((long)577212179 ^ (long)577212179);
    private int Field8760 = (int)((long)-2114574351 ^ (long)-2114574351);
    private boolean Field8761 = (int)((long)475415604 ^ (long)475415604);
    private int Field8762 = (int)((long)651037621 ^ (long)651037621);
    private int Field8763 = (int)511840842L ^ 0x1E82124A;
    private boolean Field8764 = (int)((long)-963298879 ^ (long)-963298879);
    private int Field8765 = (int)-1540400798L ^ 0xA42F5962;
    private double Field8766 = 0.0;
    private double Field8767 = 0.0;
    private double Field8768 = 0.0;
    private int Field8769 = (int)1837075364L ^ 0x6D7F8BA4;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field8770 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8771 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method1087, new Predicate[(int)((long)1212184197 ^ (long)1212184197)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8772 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method1086, new Predicate[(int)((long)1927350609 ^ (long)1927350609)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8773 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method1085, new Predicate[(int)((long)2033327241 ^ (long)2033327241)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8774 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method1084, new Predicate[(int)((long)-1681682754 ^ (long)-1681682754)]);
    private String Field8775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public JYuwLNnxeMekwglmaM1sLih2vGBl6MtT() {
        super("PacketFly", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344, (boolean)((long)-346743743 ^ (long)-346743744));
    }

    @Override
    public void Method38() {
        super.Method38();
        if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer()) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886("You are in Singleplayer: toggling off...");
            this.Method22();
            return;
        }
        this.Field8756.clear();
        this.Field8757.clear();
        this.Field8754 = (int)-1482710999L ^ 0xA79FA029;
        this.Field8758 = (int)-285427150L ^ 0xEEFCBA32;
        this.Field8759 = (int)1150351274L ^ 0x4490F7AA;
        this.Field8760 = (int)519947443L ^ 0x1EFDC4B3;
        this.Field8761 = (int)2086432500L ^ 0x7C5C6EF4;
        this.Field8762 = (int)((long)-503515944 ^ (long)-503515944);
        this.Field8763 = (int)((long)-737561143 ^ (long)-737561143);
        this.Field8764 = (int)2010947286L ^ 0x77DC9ED6;
        this.Field8765 = (int)-237265430L ^ 0xF1DB9DEA;
        this.Field8766 = 0.0;
        this.Field8767 = 0.0;
        this.Field8768 = 0.0;
        this.Field8755 = new CPacketPlayer.Position(this.Method1078(), 1.0, this.Method1078(), JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(this.Field8755);
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)this.Field8755);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
    }

    @Override
    public void Method39() {
        super.Method39();
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(0x54B208A7 ^ 0x16FA08A7);
        if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 0.0;
            JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = (int)((long)-473215187 ^ (long)-473215187);
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
    }

    @Override
    public void Method45() {
        if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(0x12D5268F ^ 0x509D268F) / this.Field8748.Method368();
            return;
        }
        this.Method22();
    }

    private void Method20() {
        this.Field8757.forEach(this::Method1088);
    }

    private void Method1070(double d, double d2, double d3, boolean bl) {
    }

    private List Method1071(Vec3d vec3d) {
        BlockPos[] blockPosArray = new BlockPos[(int)((long)429899640 ^ (long)429899641) << 2];
        blockPosArray[(int)1062801546L ^ 0x3F59108A] = new BlockPos(vec3d.x + Double.longBitsToDouble((long)519187233 ^ 0x3FD333332DC11812L), vec3d.y, vec3d.z + Double.longBitsToDouble(0xAB16C30A12C3C576L ^ 0x94C5F03921F0F645L));
        blockPosArray[(int)993127211L ^ 0x3B31EB2A] = new BlockPos(vec3d.x + Double.longBitsToDouble((long)1946323994 ^ 0x3FD333334731BF29L), vec3d.y, vec3d.z - Double.longBitsToDouble((long)1311870771 ^ 0x3FD333337D02BC00L));
        blockPosArray[((int)-35231432L ^ 0xFDE66939) << 1] = new BlockPos(vec3d.x - Double.longBitsToDouble(0xEB94FDC108DE0EE5L ^ 0xD447CEF23BED3DD6L), vec3d.y, vec3d.z + Double.longBitsToDouble((long)349901278 ^ 0x3FD3333327E822EDL));
        blockPosArray[(int)((long)1264746515 ^ (long)1264746512)] = new BlockPos(vec3d.x - Double.longBitsToDouble(0xE9383CBAB1E2FFE3L ^ 0xD6EB0F8982D1CCD0L), vec3d.y, vec3d.z - Double.longBitsToDouble(0x762D4640F52012B7L ^ 0x49FE7573C6132184L));
        return Stream.of(blockPosArray).distinct().collect(Collectors.toList());
    }

    private void Method1072(double d, double d2, double d3, boolean bl) {
        int n;
        Vec3d vec3d = new Vec3d(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d2, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
        Vec3d vec3d2 = this.Method1076(d, d2, d3);
        int n2 = n = this.Field8730.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9616 && this.Field8762 == 0 ? (int)((long)-961625217 ^ (long)-961625218) : (int)-1137007063L ^ 0xBC3AA629;
        if (this.Field8732.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16446) {
            this.Method1073(vec3d);
            this.Method1074(vec3d2);
            if (!bl) return;
            this.Method1075(vec3d);
            return;
        }
        this.Method1074(vec3d2);
        this.Method1073(vec3d);
        if (!bl) return;
        this.Method1075(vec3d);
    }

    private void Method1073(Vec3d vec3d) {
        CPacketPlayer.Position position = new CPacketPlayer.Position(vec3d.x, vec3d.y, vec3d.z, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(position);
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)position);
    }

    private void Method1074(Vec3d vec3d) {
        CPacketPlayer.Position position = new CPacketPlayer.Position(vec3d.x, vec3d.y, vec3d.z, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
        this.Field8756.add(position);
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)position);
    }

    private void Method1075(Vec3d vec3d) {
        this.Field8754 += (int)((long)650833019 ^ (long)650833018);
        if (this.Field8740.Method365()) {
            JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754 - (int)((long)904391978 ^ (long)904391979)));
        }
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754));
        this.Field8757.put(this.Field8754, new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(new Vec3d(vec3d.x, vec3d.y, vec3d.z), System.currentTimeMillis()));
        if (!this.Field8740.Method365()) return;
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketConfirmTeleport(this.Field8754 + ((int)-1504505163L ^ 0xA65312B4)));
    }

    private Vec3d Method1076(double d, double d2, double d3) {
        double d4;
        switch (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$1.Field8197[((JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)this.Field8727.Method341()).ordinal()]) {
            case 1: {
                double d5;
                double d6 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d;
                if (!this.Field8739.Method365()) {
                    d5 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble((long)2120336853 ^ 0x407A40007E61C5D5L);
                    return new Vec3d(d6, d5, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
                }
                d5 = this.Field8738.Method365() ? (int)((long)-602219820 ^ (long)-602219989) : (int)((long)-1511370532 ^ (long)-1511370531) << 8;
                return new Vec3d(d6, d5, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
            }
            case 2: {
                double d7;
                double d8 = this.Field8739.Method365() ? JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + this.Method1078() : this.Method1078();
                double d9 = this.Field8738.Method365() ? Math.max(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Double.longBitsToDouble(0x709ABC0F72DC4339L ^ 0x309ABC0F72DC4339L)) : JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
                if (this.Field8739.Method365()) {
                    d7 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + this.Method1078();
                    return new Vec3d(d8, d9, d7);
                }
                d7 = this.Method1078();
                return new Vec3d(d8, d9, d7);
            }
            case 3: {
                double d10;
                double d11 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + (this.Field8738.Method365() ? d : this.Method1080());
                double d12 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + this.Method1079();
                double d13 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                if (this.Field8738.Method365()) {
                    d10 = d3;
                    return new Vec3d(d11, d12, d13 + d10);
                }
                d10 = this.Method1080();
                return new Vec3d(d11, d12, d13 + d10);
            }
            case 4: {
                double d14;
                if (this.Field8739.Method365()) {
                    double d15;
                    double d16 = d2 * Double.longBitsToDouble(0x9024D5541A38799CL ^ 0xD05B35541A38799CL);
                    double d17 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d;
                    double d18 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
                    int n = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dimension == (int)((long)-1981443055 ^ (long)1981443054) ? (int)-1072943614L ^ 0xC00C2E7D : (int)1065685984L ^ 0x3F85131F;
                    if (d16 > (double)n) {
                        d15 = -d16;
                        return new Vec3d(d17, d18 + d15, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
                    }
                    if (d16 < 1.0) {
                        d15 = -d16;
                        return new Vec3d(d17, d18 + d15, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
                    }
                    d15 = d16;
                    return new Vec3d(d17, d18 + d15, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
                }
                double d19 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + (d == 0.0 ? (double)(Field8752.nextBoolean() ? (int)-1019948584L ^ 0x3CCB2E2E : (int)((long)610904195 ^ (long)610904198) << 1) : d * Double.longBitsToDouble((long)808847241 ^ 0x4043000030360789L));
                double d20 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d2;
                double d21 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                if (d3 != 0.0) {
                    d14 = d3 * Double.longBitsToDouble((long)452616187 ^ 0x404300001AFA5FFBL);
                    return new Vec3d(d19, d20, d21 + d14);
                }
                d14 = Field8752.nextBoolean() ? (int)1687754111L ^ 0x9B66EA89 : ((int)1581667959L ^ 0x5E465672) << 1;
                return new Vec3d(d19, d20, d21 + d14);
            }
            case 5: {
                return new Vec3d(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + this.Method1078(), Math.max(Double.longBitsToDouble((long)1857884487 ^ 0x3FF800006EBD1147L), Math.min(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d2, Double.longBitsToDouble((long)444761157 ^ 0x406FB0001A828445L))), JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + this.Method1078());
            }
        }
        double d22 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d;
        if (!this.Field8739.Method365()) {
            d4 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble(0x54EF55E611562F2L ^ 0x45DA115E611562F2L);
            return new Vec3d(d22, d4, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
        }
        d4 = this.Field8738.Method365() ? (int)((long)1186479372 ^ (long)1186479373) : (int)((long)-1174055962 ^ (long)-1174055962);
        return new Vec3d(d22, d4, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d3);
    }

    private double[] Method1077(double[] dArray) {
        double d = Math.max(dArray[(int)-825550551L ^ 0xCECB1929], dArray[(int)((long)-1678592760 ^ (long)-1678592759)]) / Field8753;
        double[] dArray2 = new double[((int)-1558902971L ^ 0xA3150744) << 1];
        dArray2[(int)((long)1779520367 ^ (long)1779520367)] = dArray[(int)1993181792L ^ 0x76CD8A60] / d;
        dArray2[(int)((long)838094632 ^ (long)838094633)] = dArray[(int)((long)-1186696031 ^ (long)-1186696032)] / d;
        return dArray2;
    }

    private double Method1078() {
        double d;
        int n = Field8752.nextInt(this.Field8739.Method365() ? ((int)471214162L ^ 0x1C162857) << 4 : (this.Field8727.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field8275 ? (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % ((int)((long)1057479611 ^ (long)1057479610) << 1) == 0 ? (int)((long)-696743869 ^ (long)-696743860) << 5 : ((int)-1249349197L ^ 0xB58871AA) << 2) : (int)((long)-233575477 ^ (long)-233504306) << 6)) + (this.Field8739.Method365() ? (int)-1830185599L ^ 0x92E99584 : ((int)214720312L ^ 0xCCC5F45) << 2);
        if (Field8752.nextBoolean()) {
            d = n;
            return d;
        }
        d = -n;
        return d;
    }

    private double Method1079() {
        double d;
        int n = (((int)-1362696852L ^ 0xAEC6E54F) << 1) + Field8752.nextInt(this.Field8728.Method335());
        if (Field8752.nextBoolean()) {
            d = n;
            return d;
        }
        d = -n;
        return d;
    }

    private double Method1080() {
        double d;
        int n = Field8752.nextInt(this.Field8729.Method335());
        if (Field8752.nextBoolean()) {
            d = n;
            return d;
        }
        d = -n;
        return d;
    }

    private boolean Method1081() {
        int n;
        double d;
        double d2 = d = this.Field8749.Method365() ? Double.longBitsToDouble((long)1483434472 ^ 0xBFB00000586B69E8L) : 0.0;
        if (!JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().expand(d, d, d)).isEmpty()) {
            return (int)((long)-1512321246 ^ (long)-1512321245) != 0;
        }
        if (!JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, Double.longBitsToDouble(0x148DA343448E596DL ^ 0x548DA343448E596DL), 0.0).contract(0.0, Double.longBitsToDouble(0x9F7ED430FDD19D92L ^ 0xA081033AC0A13E45L), 0.0)).isEmpty()) {
            n = (int)((long)2058041624 ^ (long)2058041625);
            return n != 0;
        }
        n = (int)((long)1769960390 ^ (long)1769960390);
        return n != 0;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1082(PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        playerSPPushOutOfBlocksEvent.setCanceled(((int)-380953820L ^ 0xE94B1B25) != 0);
    }

    private static double[] Method1083(double d) {
        float f = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward;
        float f2 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe;
        float f3 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw + (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw - JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevRotationYaw) * vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? (int)2093276470L ^ 0x833B22E5 : (int)-1717079711L ^ 0x99A7714C);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? (int)9169738L ^ 0x8BEB67 : (int)((long)-1569547189 ^ (long)1569547160));
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat((int)1558018984L ^ 0xE35D7BA8);
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat((int)((long)294008128 ^ (long)1395799360))));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat((int)((long)658100640 ^ (long)1703793056))));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        double[] dArray = new double[(int)((long)-1662079985 ^ (long)-1662079986) << 1];
        dArray[(int)((long)230223509 ^ (long)230223509)] = d4;
        dArray[(int)-383089285L ^ 0xE92A857A] = d5;
        return dArray;
    }

    private void Method1084(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer && !(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer.Position)) {
            tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer)) return;
        CPacketPlayer cPacketPlayer = (CPacketPlayer)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        if (this.Field8756.contains(cPacketPlayer)) {
            this.Field8756.remove(cPacketPlayer);
            return;
        }
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private void Method1085(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2) {
        if (this.Field8726.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14180 && this.Field8754 <= 0) {
            return;
        }
        if (this.Field8726.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14179) {
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14103 = this.Field8766;
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14104 = this.Field8767;
            uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2.Field14105 = this.Field8768;
        }
        if (this.Field8731.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field13608 || this.Field8731.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field13609) {
            if (!this.Method1081()) return;
        }
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = (int)-517419318L ^ 0xE128CECB;
    }

    private void Method1086(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerPosLook)) {
            return;
        }
        if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiDownloadTerrain) {
            this.Field8754 = (int)-1141825812L ^ 0xBBF11EEC;
            return;
        }
        SPacketPlayerPosLook sPacketPlayerPosLook = (SPacketPlayerPosLook)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isEntityAlive()) {
            if (this.Field8754 <= 0) {
                this.Field8754 = sPacketPlayerPosLook.getTeleportId();
            } else if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.isBlockLoaded(new BlockPos(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), (boolean)((long)1813174121 ^ (long)1813174121)) && this.Field8726.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14180) {
                if (this.Field8726.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14182) {
                    this.Field8757.remove(sPacketPlayerPosLook.getTeleportId());
                    tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
                    if (this.Field8726.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14179) return;
                    JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(sPacketPlayerPosLook.getX(), sPacketPlayerPosLook.getY(), sPacketPlayerPosLook.getZ());
                    return;
                }
                if (this.Field8757.containsKey(sPacketPlayerPosLook.getTeleportId())) {
                    SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr = (SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)this.Field8757.get(sPacketPlayerPosLook.getTeleportId());
                    if (((Vec3d)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).x == sPacketPlayerPosLook.getX() && ((Vec3d)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).y == sPacketPlayerPosLook.getY() && ((Vec3d)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).z == sPacketPlayerPosLook.getZ()) {
                        this.Field8757.remove(sPacketPlayerPosLook.getTeleportId());
                        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
                        if (this.Field8726.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14179) return;
                        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(sPacketPlayerPosLook.getX(), sPacketPlayerPosLook.getY(), sPacketPlayerPosLook.getZ());
                        return;
                    }
                }
            }
        }
        sPacketPlayerPosLook.yaw = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        sPacketPlayerPosLook.pitch = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        sPacketPlayerPosLook.getFlags().remove(SPacketPlayerPosLook.EnumFlags.X_ROT);
        sPacketPlayerPosLook.getFlags().remove(SPacketPlayerPosLook.EnumFlags.Y_ROT);
        this.Field8754 = sPacketPlayerPosLook.getTeleportId();
    }

    private void Method1087(ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ) {
        if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field8747.Method335() == 0) {
            this.Method20();
        }
        this.Method43("[" + ((JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A)this.Field8726.Method341()).name() + "]");
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        if (this.Field8754 <= 0 && this.Field8726.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14180) {
            this.Field8755 = new CPacketPlayer.Position(this.Method1078(), 1.0, this.Method1078(), JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround);
            this.Field8756.add(this.Field8755);
            JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)this.Field8755);
            return;
        }
        boolean bl = this.Method1081();
        this.Field8766 = 0.0;
        this.Field8767 = 0.0;
        this.Field8768 = 0.0;
        if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown() && (this.Field8760 < ((int)-1076934581L ^ 0xBFCF484A) || this.Field8733.Method365() && bl)) {
            this.Field8767 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % (this.Field8726.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14180 || this.Field8726.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14179 || this.Field8730.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9617 ? (int)((long)-856583019 ^ (long)-856583024) << 1 : (int)((long)-872581241 ^ (long)-872581246) << 2) == 0 ? (this.Field8737.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11066 ? Double.longBitsToDouble((long)2069253171 ^ 0xBFA0624DA9A7E5CFL) : Double.longBitsToDouble(0xFB56E557088B69B5L ^ 0xC4F95B21C03F50EDL)) : Double.longBitsToDouble((long)11854331 ^ 0x3FAFBE76C800D8A3L);
            this.Field8758 = (int)1201026093L ^ 0x4796342D;
            this.Field8759 = (int)((long)1363075850 ^ (long)1363075855);
        } else if (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown() && (this.Field8760 < ((int)1970113199L ^ 0x756D8AAE) || this.Field8733.Method365() && bl)) {
            this.Field8767 = Double.longBitsToDouble((long)495308835 ^ 0xBFAFBE76D531E97BL);
            this.Field8758 = (int)((long)-1459494945 ^ (long)-1459494945);
            this.Field8759 = (int)-1797982168L ^ 0x94D4F82D;
        }
        int n = (int)((long)-900908517 ^ (long)-900908517);
        double[] dArray = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.Method1083((bl && this.Field8731.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field13610 ? (this.Field8734.Method365() ? (this.Field8733.Method365() ? Double.longBitsToDouble((long)1535336834 ^ 0x3FA7CED94D044A80L) : Double.longBitsToDouble(0xAD3CC4520B0AE7CL ^ 0x357C7233E8049724L)) : Double.longBitsToDouble((long)1128947882 ^ 0x3F9FBE768BFE59F2L)) : Double.longBitsToDouble((long)623299412 ^ 0x3FD0A3D72F1BBBF0L)) * this.Field8735.Method367());
        if (this.Field8733.Method365() && bl || !JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown() || !JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && (dArray[(int)759432733L ^ 0x2D44061D] != 0.0 || dArray[(int)((long)1903249033 ^ (long)1903249032)] != 0.0) && (this.Field8759 < ((int)-246665392L ^ 0xF14C2F51) || this.Field8733.Method365() && bl)) {
                if (this.Field8742.Method365() && this.Field8765 == this.Field8744.Method335()) {
                    dArray = this.Method1077(dArray);
                    n = (int)((long)-992431290 ^ (long)-992431289);
                }
                this.Field8766 = dArray[(int)2005777599L ^ 0x778DBCBF];
                this.Field8768 = dArray[(int)((long)1279374142 ^ (long)1279374143)];
                this.Field8760 = (int)((long)1715831136 ^ (long)1715831141);
            }
            if (this.Field8737.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11066 && (this.Field8730.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9616 || this.Field8762 != 0)) {
                if (this.Field8758 < (this.Field8727.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field8274 && !this.Field8739.Method365() ? (int)((long)-1242677049 ^ (long)-1242677050) : (int)((long)-1560111067 ^ (long)-1560111066))) {
                    this.Field8758 += (int)-748919083L ^ 0xD35C66D4;
                } else {
                    this.Field8758 = (int)1617711763L ^ 0x606C5293;
                    if (this.Field8737.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11068 || !bl) {
                        double d = this.Field8767 = this.Field8737.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11069 ? Double.longBitsToDouble(0xBD53E37707F23CB0L ^ 0x2E79996405C28CBL) : Double.longBitsToDouble((long)1510263009 ^ 0xBFA47AE11DAADC9AL);
                    }
                }
            }
        }
        if (bl && (this.Field8731.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field13610 && (double)JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward != 0.0 || (double)JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing != 0.0 && this.Field8767 != 0.0)) {
            this.Field8767 /= Double.longBitsToDouble((long)1568440689 ^ 0x400400005D7C8171L);
        }
        if (this.Field8730.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9616) {
            if (this.Field8762 == 0) {
                this.Field8766 = 0.0;
                this.Field8767 = 0.0;
                this.Field8768 = 0.0;
            } else if (this.Field8762 == (int)((long)1896383922 ^ (long)1896383923) << 1 && this.Field8745.Method365()) {
                if (this.Field8764) {
                    this.Field8766 = 0.0;
                    this.Field8767 = 0.0;
                    this.Field8768 = 0.0;
                }
                this.Field8764 = !this.Field8764 ? (int)((long)2035448700 ^ (long)2035448701) : (int)1047397942L ^ 0x3E6E0636;
            }
        } else if (this.Field8745.Method365() && this.Field8763 == this.Field8746.Method335()) {
            this.Field8766 = 0.0;
            this.Field8767 = 0.0;
            this.Field8768 = 0.0;
        }
        if (this.Field8742.Method365() && this.Field8743.Method365() && this.Field8765 == this.Field8744.Method335()) {
            dArray = this.Method1077(dArray);
            this.Field8766 = dArray[(int)((long)1783555522 ^ (long)1783555522)];
            this.Field8768 = dArray[(int)-918756319L ^ 0xC93CE420];
        }
        switch (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$1.Field8198[((JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A)this.Field8726.Method341()).ordinal()]) {
            case 1: {
                this.Method1070(this.Field8766, this.Field8767, this.Field8768, (boolean)((long)-346889499 ^ (long)-346889500));
                JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(this.Field8766, this.Field8767, this.Field8768);
                this.Method1072(this.Field8766, this.Field8767, this.Field8768, ((int)554109166L ^ 0x210708EF) != 0);
                break;
            }
            case 2: {
                this.Method1070(this.Field8766, this.Field8767, this.Field8768, ((int)-26558295L ^ 0xFE6AC0A8) != 0);
                this.Method1072(this.Field8766, this.Field8767, this.Field8768, (boolean)((long)1755313255 ^ (long)1755313254));
                break;
            }
            case 3: {
                this.Method1070(this.Field8766, this.Field8767, this.Field8768, ((int)2138849922L ^ 0x7F7C4282) != 0);
                JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(this.Field8766, this.Field8767, this.Field8768);
                this.Method1072(this.Field8766, this.Field8767, this.Field8768, (boolean)((long)-753499658 ^ (long)-753499658));
                break;
            }
            case 4: 
            case 5: {
                float f = this.Field8736.Method368();
                if (Keyboard.isKeyDown((int)this.Field8750.Method337()) && this.Field8770.Method2797(0x4080DACL & 0x11C6AFFCL)) {
                    this.Field8770.Method2801();
                    f = this.Field8751.Method368();
                }
                int n2 = (int)Math.floor(f);
                this.Field8769 += (int)1144587160L ^ 0x44390399;
                if (this.Field8769 > (int)(Double.longBitsToDouble((long)187905868 ^ 0x403400000B33374CL) / (((double)f - (double)n2) * Double.longBitsToDouble((long)1713091845 ^ 0x40340000661BB505L)))) {
                    ++n2;
                    this.Field8769 = (int)((long)-2111062851 ^ (long)-2111062851);
                }
                for (int i = (int)46808080L ^ 0x2CA3C11; i <= n2; ++i) {
                    this.Method1070(this.Field8766 * (double)i, this.Field8767 * (double)i, this.Field8768 * (double)i, ((int)-1643590455L ^ 0x9E08CCC8) != 0);
                    JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(this.Field8766 * (double)i, this.Field8767 * (double)i, this.Field8768 * (double)i);
                    this.Method1072(this.Field8766 * (double)i, this.Field8767 * (double)i, this.Field8768 * (double)i, (boolean)((long)73030769 ^ (long)73030768));
                }
                this.Field8766 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX;
                this.Field8767 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY;
                this.Field8768 = JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ;
                break;
            }
        }
        this.Field8759 -= (int)591847180L ^ 0x2346DF0D;
        this.Field8760 -= (int)((long)634706550 ^ (long)634706551);
        if (this.Field8742.Method365() && this.Field8743.Method365() && this.Field8765 == this.Field8744.Method335()) {
            this.Field8766 = dArray[(int)-1597124425L ^ 0xA0CDD0B7];
            this.Field8768 = dArray[(int)-97290873L ^ 0xFA337586];
            n = (int)((long)-378236521 ^ (long)-378236522);
        }
        if (this.Field8741.Method365() && (this.Field8730.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9616 || this.Field8762 > ((int)-1144478739L ^ 0xBBC8A3EC))) {
            JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, JYuwLNnxeMekwglmaM1sLih2vGBl6MtT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ, ((int)1977677415L ^ 0x75E0F667) != 0));
        }
        this.Field8762 += (int)1423523688L ^ 0x54D93F69;
        this.Field8763 += (int)((long)-984287989 ^ (long)-984287990);
        this.Field8765 = !this.Field8742.Method365() ? (int)((long)858548013 ^ (long)858548013) : (this.Field8765 += (int)((long)202157944 ^ (long)202157945));
        if (this.Field8762 > (this.Field8730.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field9617 ? (this.Field8761 ? (int)((long)-1638123045 ^ (long)-1638123046) : (int)((long)-182267617 ^ (long)-182267618) << 1) : (int)496996463L ^ 0x1D9F906C)) {
            this.Field8762 = (int)((long)-1505081845 ^ (long)-1505081845);
            this.Field8761 = !this.Field8761 ? (int)-1560290738L ^ 0xA2FFDA4F : (int)((long)-872135996 ^ (long)-872135996);
        }
        if (this.Field8763 <= this.Field8746.Method335()) return;
        this.Field8763 = (int)-161251607L ^ 0xF6637EE9;
    }

    private void Method1088(Integer n, SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr) {
        if (System.currentTimeMillis() - (Long)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6308() <= TimeUnit.SECONDS.toMillis(0x970007FL & 0x4409A21EL)) return;
        this.Field8757.remove(n);
    }

    private Boolean Method1089() {
        boolean bl;
        if (this.Field8726.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14181) {
            bl = (int)298748881L ^ 0x11CE8BD0;
            return bl;
        }
        bl = (int)1179386916L ^ 0x464C0424;
        return bl;
    }

    private Boolean Method1090() {
        boolean bl;
        if (this.Field8726.Method341() == JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14181) {
            bl = (int)-875314643L ^ 0xCBD3C22C;
            return bl;
        }
        bl = (int)571802555L ^ 0x221503BB;
        return bl;
    }

    private Boolean Method1091() {
        int n;
        if (this.Field8726.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14181 && this.Field8726.Method341() != JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field14182) {
            n = (int)((long)-2138118920 ^ (long)-2138118920);
            return n != 0;
        }
        n = (int)2108973081L ^ 0x7DB46018;
        return n != 0;
    }

    static {
        Field8752 = new Random();
        Field8753 = Double.longBitsToDouble(0x3FE3FFFFFFFFFFFDL & 0x3FE3FFFFFFFFFFFDL);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1079369988 ^ (long)1079369988);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2022590039 ^ (long)-2022590122);
            int n2 = (int)((long)1064692262 ^ (long)1064692263) << 5;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1632573681L ^ 0x9EB0E668) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

