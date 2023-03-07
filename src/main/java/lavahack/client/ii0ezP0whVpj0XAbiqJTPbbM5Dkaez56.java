//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.server.SPacketExplosion
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.AccessorEntityPlayer;
import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ;
import lavahack.client.ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$1;
import lavahack.client.ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public static ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56 Field13077;
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13078;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13079;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13080;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13081;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13082;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13083;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13084;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13085;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13086;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13087;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13088;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13089;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13090;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13091;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13092;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13093;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13094;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13095;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13096;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13097;
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13098;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13099;
    private int Field13100;
    private double Field13101;
    private double Field13102;
    private boolean Field13103;
    private int Field13104;
    private double Field13105;
    private BlockPos Field13106;
    private double Field13107;
    private int Field13108;
    private double Field13109;
    private double Field13110;
    private boolean Field13111;
    private int Field13112;
    private double Field13113;
    private double Field13114;
    private boolean Field13115;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field13116;
    private double Field13117;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13118;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13119;
    private String Field13120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56() {
        super("Speed", "speed", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        String[] stringArray = new String[(int)((long)-455989694 ^ (long)-455989695) << 2];
        stringArray[(int)((long)1483247258 ^ (long)1483247258)] = "Strafe";
        stringArray[(int)-2003766806L ^ 0x8890F1EB] = "Strafe New";
        stringArray[(int)((long)-1833288785 ^ (long)-1833288786) << 1] = "YPort";
        stringArray[(int)((long)2072486800 ^ (long)2072486803)] = "Sti";
        stringArray[((int)1134628859L ^ 0x43A10FFA) << 2] = "Matrix 6.4";
        stringArray[(int)((long)805945202 ^ (long)805945207)] = "Matrix Bhop";
        stringArray[(int)((long)-1692264544 ^ (long)-1692264541) << 1] = "Sunrise Strafe";
        stringArray[(int)151028812L ^ 0x900844B] = "Bhop";
        stringArray[((int)-776387901L ^ 0xD1B942C2) << 3] = "Strafe2";
        stringArray[(int)((long)-2102008648 ^ (long)-2102008655)] = "Matrix";
        stringArray[((int)-1794155744L ^ 0x950F5B25) << 1] = "NCP";
        stringArray[(int)((long)1979209255 ^ (long)1979209260)] = "Strafe3";
        this.Field13078 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SpeedMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Strafe", new ArrayList<String>(Arrays.asList(stringArray))));
        this.Field13079 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Flag Detect", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1503556980L ^ 0xA6618A8D) != 0));
        this.Field13080 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use Timer", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)597166734L ^ 0x23980A8E) != 0));
        this.Field13081 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timer Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)1368031560 ^ 0x40240000518A8148L), ((int)-1746749159L ^ 0x97E2B918) != 0).Method313(this.Field13080::Method365));
        this.Field13082 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion X Modifier", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)87740156 ^ 0x3FE00000053ACEFCL), (boolean)((long)-1944345389 ^ (long)-1944345389)).Method313(this::Method4616));
        this.Field13083 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Z Modifier", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)5709333 ^ 0x3FE0000000571E15L), ((int)-749855578L ^ 0xD34E1CA6) != 0).Method313(this::Method4615));
        this.Field13084 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strafe Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x9992FA65D459A4C1L ^ 0xA640997A5459A4C1L), Double.longBitsToDouble(0x6D516F8A0ACF4E86L ^ 0x52E8F613AACF4E86L), 1.0, (boolean)((long)-1751965797 ^ (long)-1751965797)).Method313(this::Method4614));
        this.Field13085 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)711058560L ^ 0x2A61E480) != 0).Method313(this::Method4613));
        this.Field13086 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1787245397 ^ 0x402400006A873355L), 0.0, Double.longBitsToDouble((long)1153620606 ^ 0x4024000044C2DA7EL), (boolean)((long)-1338355153 ^ (long)-1338355153)).Method313(this::Method4612));
        this.Field13087 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale Cap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-680371565 ^ (long)-680371565)).Method313(this::Method4611));
        this.Field13088 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lag Time", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xAEC09F4A89F31B5L ^ 0x4A9349F4A89F31B5L), 0.0, Double.longBitsToDouble(0x3AA29234383BD4ACL ^ 0x7A2DD234383BD4ACL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method313(this::Method4610));
        this.Field13089 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("YPortSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xAF9C2620B90918E2L ^ 0x90329E71590918E2L), Double.longBitsToDouble(0x1D479B1AAF18D787L ^ 0x22C3E1FBEF18D787L), Double.longBitsToDouble(0xFD052F0146F61B99L ^ 0xC2C61C3206F61B99L), (boolean)((long)-1563504822 ^ (long)-1563504822)).Method313(this::Method4609));
        this.Field13090 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Water", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1356003029 ^ (long)1356003029)).Method313(this::Method4608));
        this.Field13091 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lava", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2099566289 ^ (long)-2099566289)).Method313(this::Method4607));
        this.Field13092 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("StiSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1206939820 ^ 0x4010000047F070ACL), Double.longBitsToDouble(0x70E5D234620C78D6L ^ 0x4F5C4BADFB95E14CL), Double.longBitsToDouble((long)431413892 ^ 0x4024000019B6DA84L), (boolean)((long)1637881643 ^ (long)1637881642)).Method313(this::Method4606));
        this.Field13093 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use Motion", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1930902069 ^ (long)-1930902069)).Method313(this::Method4605));
        this.Field13094 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use Motion In Air", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-718258014 ^ (long)-718258014)).Method313(this::Method4604));
        this.Field13095 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Jump Movement Factor Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xFC0FB02AABD1A06CL ^ 0xC3DF45E82BD1A06CL), Double.longBitsToDouble((long)1646939538 ^ 0x3F847AE1222A4D92L), Double.longBitsToDouble(0xE49E961DA526E43L ^ 0x4E6DE961DA526E43L), ((int)1230026742L ^ 0x4950B7F6) != 0).Method313(this::Method4603));
        this.Field13096 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Jump Movement Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-225722012 ^ (long)-225722012)).Method313(this::Method4602));
        this.Field13097 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Boost Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1421579436 ^ 0x3FD0F5C2D4BB94ACL), Double.longBitsToDouble((long)1571258108 ^ 0x3F847AE11DA77EFCL), Double.longBitsToDouble((long)1381746498 ^ 0x40240000525BC742L), (boolean)((long)1163094251 ^ (long)1163094251)).Method313(this::Method4601));
        this.Field13098 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Boost Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-273275654L ^ 0xEFB624FA) != 0).Method313(this::Method4600));
        this.Field13099 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1819309897 ^ (long)-1819309897)).Method313(this::Method4599));
        this.Field13107 = 1.0;
        this.Field13108 = ((int)586956268L ^ 0x22FC3DED) << 2;
        this.Field13112 = (int)((long)-60877092 ^ (long)-60877092);
        this.Field13113 = 0.0;
        this.Field13114 = 0.0;
        this.Field13115 = (int)-985270087L ^ 0xC545F8B9;
        this.Field13116 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field13117 = 0.0;
        this.Field13118 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4597, ((int)-348574058L ^ 0xEB392EEB) << 3, new Predicate[(int)-172386331L ^ 0xF5B997E5]);
        this.Field13119 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4596, new Predicate[(int)-695802141L ^ 0xD686E6E3]);
        super.Method44(this::Method4598);
        Field13077 = this;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13119);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13118);
        this.Method4587();
    }

    private void Method4587() {
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
        this.Field13116.Method2801();
        this.Field13100 = ((int)-1781224836L ^ 0x95D4AA7D) << 2;
        this.Field13104 = (int)-1162481034L ^ 0xBAB5F276;
        this.Field13108 = ((int)-1773500169L ^ 0x964A88F6) << 2;
        this.Field13109 = 0.0;
        this.Field13110 = 0.0;
        this.Field13111 = (int)1093287667L ^ 0x412A3EF3;
        this.Field13112 = (int)((long)1180477500 ^ (long)1180477501) << 2;
        this.Field13114 = 0.0;
        this.Field13113 = 0.0;
        this.Field13117 = 0.0;
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field13102 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7157();
        this.Field13101 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7153();
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13119);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13118);
        this.Method4587();
    }

    @Override
    public void Method45() {
        double d;
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field13102 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7157();
        if ((this.Field13078.Method309("Strafe New") || this.Field13078.Method309("Strafe4")) && this.Field13080.Method365() && I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Method837(((int)850029982L ^ 0x32AA6DE3) << 1)) {
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)418399922L ^ 0x277A111A) + Float.intBitsToFloat(0x540C64E ^ 0x3943D421) * this.Field13081.Method368());
        }
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward > 0.0f && ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime < ((int)-778444168L ^ 0xD199E27D) && this.Field13078.Method359().equalsIgnoreCase("Strafe")) {
            if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(0xDE5A4D7AE53FE33CL ^ 0xE183A6FFFB87B2D0L);
                float f = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7160();
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= (double)(MathHelper.sin((float)f) * Float.intBitsToFloat((int)((long)1463251213 ^ (long)1769717184)));
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ += (double)(MathHelper.cos((float)f) * Float.intBitsToFloat((int)((long)829068956 ^ (long)254171729)));
                return;
            }
            double d2 = Math.sqrt(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX * ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX + ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ * ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ);
            double d3 = Math.abs(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead - ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw) < Float.intBitsToFloat((int)((long)1678472207 ^ (long)650081295)) ? Double.longBitsToDouble((long)1333210038 ^ 0x3FF01A36AD9C37F5L) : Double.longBitsToDouble(0x639524AE8FAB4D76L ^ 0x5C6520B61CDFF11CL);
            double d4 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7160();
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = -Math.sin(d4) * d3 * d2;
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = Math.cos(d4) * d3 * d2;
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("YPort")) {
            this.Method4590();
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Strafe New") && !ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
            if (!I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Method837(this.Field13088.Method335())) {
                return;
            }
            if (this.Field13100 == (int)((long)1861006467 ^ (long)1861006466) && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
                this.Field13101 = Double.longBitsToDouble((long)1947586175 ^ 0x3FF59999ED8C57E5L) * o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(this.Field13085.Method365(), this.Field13084.Method367()) - Double.longBitsToDouble((long)2120220114 ^ 0x3F847AE139F1E9A9L);
            } else if (this.Field13100 == ((int)-999613674L ^ 0xC46B1B17) << 1 && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)725743666 ^ 0x3FD997F6002B1FE7L) + o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7155();
                this.Field13101 *= this.Field13103 ? Double.longBitsToDouble(0x6497C9043AA01557L ^ 0x5B6D2699888D1B01L) : Double.longBitsToDouble((long)1732865838 ^ 0x3FF651EBE257D77CL);
            } else if (this.Field13100 == ((int)-484358736L ^ 0xE32145B3)) {
                this.Field13101 = this.Field13102 - Double.longBitsToDouble((long)1945237818 ^ 0x3FE51EB8221A7C25L) * (this.Field13102 - o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(this.Field13085.Method365(), this.Field13084.Method367()));
                this.Field13103 = !this.Field13103 ? (int)2044886383L ^ 0x79E27D6E : (int)-391103784L ^ 0xE8B03AD8;
            } else {
                if ((ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes(null, ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, 0.0)).size() > 0 || ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedVertically) && this.Field13100 > 0) {
                    this.Field13100 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) ? (int)292507639L ^ 0x116F4FF6 : (int)832467743L ^ 0x319E731F;
                }
                this.Field13101 = this.Field13102 - this.Field13102 / Double.longBitsToDouble(0xA6B286A119D5CC99L ^ 0xE6D166A119D5CC99L);
            }
            this.Field13101 = Math.min(this.Field13101, this.Method4591());
            this.Field13101 = Math.max(this.Field13101, o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(this.Field13085.Method365(), this.Field13084.Method367()));
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7158((float)this.Field13101);
            if (!PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) return;
            this.Field13100 += (int)-2144432703L ^ 0x802E8DC0;
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Matrix Bhop") && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed = (int)((long)-260055515 ^ (long)-260055515);
            if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                ((AccessorEntityPlayer)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat((int)((long)79679801 ^ (long)940946938)));
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat((int)((long)543407057 ^ (long)498038556));
                EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)255995074L ^ 0x30328F15));
            }
            if (!((double)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance > Double.longBitsToDouble((long)1618754746 ^ 0x3FE33333534F0F89L))) return;
            if (!((double)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Double.longBitsToDouble(0x2DC832D0E1A8263BL ^ 0x123CFE1C2D64EAF6L))) return;
            ((AccessorEntityPlayer)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat(0x14C7DF18 ^ 0x286DBBDB));
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)((long)1780899929 ^ (long)1438647871)));
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Matrix 6.4")) {
            if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % (((int)2108765601L ^ 0x7DB135A0) << 2) == 0) {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
            }
            if (!PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
                return;
            }
            if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed = (int)-825844174L ^ 0xCEC69E32;
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                return;
            }
            if ((double)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance <= Double.longBitsToDouble((long)172571511 ^ 0x3FB9999993D0A2EDL)) {
                ((AccessorEntityPlayer)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat((int)((long)1282001101 ^ (long)1892463285)));
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(0x7392EA9E ^ 0x4F4FC585);
                EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat(0x663447F4 ^ 0x59F447F4));
                return;
            }
            if ((double)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance > Double.longBitsToDouble(0xBE67B05142E4A6D9L ^ 0x81DE29C8DB7D3F43L) && (double)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Double.longBitsToDouble((long)1587873053 ^ 0x3FF4CCCC9269C9D0L)) {
                EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)((long)1704969568 ^ (long)1521284691)));
                return;
            }
            if (!((double)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance >= Double.longBitsToDouble(0x80E0ECE77E45EF41L ^ 0xBF14202BB289238CL))) return;
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
            ((AccessorEntityPlayer)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat((int)2020575231L ^ 0x44CAFD87));
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat((int)((long)528471358 ^ (long)598940147));
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Sunrise Strafe")) {
            if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
                if (!ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7156(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7165(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw), o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7153() * Double.longBitsToDouble(0x514B2021DA0D81D1L ^ 0x6EBB71CA5F133983L));
                return;
            }
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Bhop")) {
            this.Method4592();
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Strafe2") && o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
            if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                return;
            }
            double d5 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7160();
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = -Math.sin(d5) * (double)this.Field13082.Method368();
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = Math.cos(d5) * (double)this.Field13083.Method368();
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Matrix") && o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159() && ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % ((int)((long)1704896924 ^ (long)1704896925) << 1) == 0) {
            if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                return;
            }
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7147(Double.longBitsToDouble((long)0x828EE8E ^ 0x3FCCFEC565741422L));
            return;
        }
        if (this.Field13078.Method309("NCP") && !ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
            switch (this.Field13104) {
                case 0: {
                    this.Field13104 += (int)((long)-1015333586 ^ (long)-1015333585);
                    this.Field13105 = 0.0;
                    break;
                }
                case 2: {
                    if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159() || !ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) break;
                    ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = (this.Method4589() ? Double.longBitsToDouble((long)723568063 ^ 0x3FC99999B2B95C25L) : Double.longBitsToDouble(0x8F8AC2DA216E502DL ^ 0xB053552C0A04B7F8L)) + o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7155();
                    this.Field13101 *= Double.longBitsToDouble(0xA83FC7296D9E916L ^ 0x4A82CD547FA13DE8L);
                    break;
                }
                case 3: {
                    this.Field13101 = this.Field13105 - Double.longBitsToDouble(0x27DBE760276A9C30L ^ 0x183D53597F7AFE7EL) * (this.Field13105 - o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(this.Field13085.Method365(), Double.longBitsToDouble((long)1570438640 ^ 0x3FD2631FD793FF2EL)));
                    break;
                }
                default: {
                    if (this.Method27() || ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
                        this.Field13104 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159() ? (int)((long)-1796255531 ^ (long)-1796255531) : (int)((long)-1472554578 ^ (long)-1472554577);
                    }
                    this.Field13101 = this.Field13105 - this.Field13105 / Double.longBitsToDouble(0x446E0E23E81D0210L ^ 0x40DEE23E81D0210L);
                }
            }
            this.Field13101 = Math.min(this.Field13101, this.Method4591());
            this.Field13101 = Math.max(this.Field13101, o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(this.Field13085.Method365(), Double.longBitsToDouble(0x1769B48A81337764L ^ 0x28BBD7950B3A75BAL)));
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7158((float)this.Field13101);
            this.Field13104 += (int)1134245122L ^ 0x439B3503;
            return;
        }
        if (this.Field13078.Method309("Strafe3")) {
            if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround && o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
                this.Field13108 = (int)((long)1528056037 ^ (long)1528056036) << 1;
            }
            if (this.Field13108 == ((int)-1290939008L ^ 0xB30DD581) && o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
                this.Field13108 += (int)((long)-1192275939 ^ (long)-1192275940);
            } else if (this.Field13108 == (int)((long)1259021238 ^ (long)1259021239) << 1) {
                this.Field13108 += (int)20260221L ^ 0x135257C;
                if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround && o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
                    ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7146(this.Field13099.Method365());
                    this.Field13109 *= this.Field13111 ? Double.longBitsToDouble(0x345CA0C713149D47L ^ 0xBA94394E4DA4450L) : Double.longBitsToDouble((long)355371953 ^ 0x3FFB0A3D658D5CBBL);
                }
            } else if (this.Field13100 == (int)((long)-964511463 ^ (long)-964511462)) {
                this.Field13108 += (int)-446738989L ^ 0xE55F4DD2;
            } else if (this.Field13100 == (int)((long)346227096 ^ (long)346227097) << 2) {
                if (this.Method27() || ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedVertically) {
                    this.Field13100 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159() ? (int)-1836091205L ^ 0x928F78BA : (int)1141108946L ^ 0x4403F0D2;
                }
                this.Field13109 = this.Field13110 - this.Field13110 / Double.longBitsToDouble((long)900974526 ^ 0x4063E00035B3C7BEL);
                this.Field13111 = !this.Field13111 ? (int)-990381352L ^ 0xC4F7FAD9 : (int)1578167303L ^ 0x5E10EC07;
            }
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7158((float)this.Field13109);
            if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 0.0;
            return;
        }
        if (!this.Field13078.Method309("Strafe4")) return;
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
            d = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevPosX;
            double d6 = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevPosZ;
            this.Field13114 = Math.sqrt(d * d + d6 * d6);
        }
        if (this.Field13112 != ((int)1893189559L ^ 0x70D7C7B6) || ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward == 0.0f || ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing == 0.0f) {
            if (this.Field13112 == ((int)-198761200L ^ 0xF4272511) << 1 && (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward != 0.0f || ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing != 0.0f)) {
                d = 0.0;
                if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.JUMP_BOOST)) {
                    d += (double)((float)(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + (int)((long)-906762964 ^ (long)-906762963)) * Float.intBitsToFloat((int)((long)2082401243 ^ (long)1104291606)));
                }
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(0x4D55E2591973B4DFL ^ 0x728C75AF3219530AL) + d;
                this.Field13113 *= this.Field13115 ? Double.longBitsToDouble((long)1976397250 ^ 0x3FFAEF9DC7E06394L) : Double.longBitsToDouble(0xD42409417E9C8FE9L ^ 0xEBD258AAFB8237BBL);
            } else if (this.Field13112 == (int)((long)-422491384 ^ (long)-422491381)) {
                d = Double.longBitsToDouble((long)1346702686 ^ 0x3FE51EB801AE8841L) * (this.Field13114 - o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7152());
                this.Field13113 = this.Field13114 - d;
                this.Field13115 = !this.Field13115 ? (int)((long)-366965640 ^ (long)-366965639) : (int)((long)1749079333 ^ (long)1749079333);
            } else {
                List list = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, 0.0));
                if ((list.size() > 0 || ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedVertically) && this.Field13112 > 0) {
                    this.Field13112 = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward == 0.0f && ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing == 0.0f ? (int)((long)500912089 ^ (long)500912089) : (int)385864696L ^ 0x16FFD3F9;
                }
                this.Field13113 = this.Field13114 - this.Field13114 / Double.longBitsToDouble(0xB4BA263D900529CL ^ 0x4B284263D900529CL);
            }
        } else {
            this.Field13113 = Double.longBitsToDouble((long)590950426 ^ 0x3FF59999BAA0A980L) * o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7152() - Double.longBitsToDouble(0x7A33DEBEE2558D5EL ^ 0x45B7A45FA5FB9925L);
        }
        this.Field13113 = Math.max(this.Field13113, o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7152());
        if (this.Field13117 > 0.0 && this.Field13098.Method365() && !this.Field13116.Method2797(0xA0094DFL & 0x4040604BL) && !ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            this.Field13113 = Math.max(this.Field13113, this.Field13117);
        } else if (this.Field13099.Method365()) {
            this.Field13113 = Math.min(this.Field13113, Double.longBitsToDouble(0x1BDC0536832D9A3BL ^ 0x2407B37322E75AB8L));
        }
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 0.0;
        } else {
            this.Method4588(this.Field13113);
        }
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
            return;
        }
        this.Field13112 += (int)-375359327L ^ 0xE9A078A0;
    }

    private void Method4588(double d) {
        double[] dArray = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7150(d);
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[(int)((long)-499459795 ^ (long)-499459795)];
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[(int)((long)501758198 ^ (long)501758199)];
    }

    public boolean Method4589() {
        int n;
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, Double.longBitsToDouble(0x26A9495CB344651DL ^ 0x1963A81B1D501FFCL), 0.0)).size() > 0) {
            n = (int)-631833599L ^ 0xDA56FC00;
            return n != 0;
        }
        n = (int)((long)-1769707001 ^ (long)-1769707001);
        return n != 0;
    }

    public boolean Method27() {
        int n;
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, 0.0)).size() > 0) {
            n = (int)((long)-1878445991 ^ (long)-1878445992);
            return n != 0;
        }
        n = (int)((long)-1587812149 ^ (long)-1587812149);
        return n != 0;
    }

    private void Method4590() {
        if (!PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6651((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) return;
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() && !this.Field13090.Method365() && ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) {
            if (!this.Field13091.Method365()) return;
        }
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            return;
        }
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)1385424809L ^ 0x6D00D49A));
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6652((EntityLivingBase)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6650() + (double)this.Field13089.Method335());
            return;
        }
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(0xA310465E5403389L ^ 0xB5C10465E5403389L);
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
    }

    public double Method4591() {
        int n;
        double d = this.Field13086.Method367();
        if (!this.Field13087.Method365()) {
            return d;
        }
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.SPEED)) {
            n = Objects.requireNonNull(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.SPEED)).getAmplifier();
            d *= 1.0 + Double.longBitsToDouble((long)1055410678 ^ 0x3FC99999A771D06CL) * (double)(n + ((int)277768465L ^ 0x108E6910));
        }
        if (!this.Field13085.Method365()) return d;
        if (!ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.SLOWNESS)) return d;
        n = Objects.requireNonNull(ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.SLOWNESS)).getAmplifier();
        d /= 1.0 + Double.longBitsToDouble((long)2078053024 ^ 0x3FC99999E2450B3AL) * (double)(n + (int)((long)-1338463005 ^ (long)-1338463006));
        return d;
    }

    private void Method4592() {
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = this.Method4593();
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting((boolean)((long)488529833 ^ (long)488529832));
        if (!ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.isKeyDown()) return;
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            if (this.Field13093.Method365() && ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi != null) {
                switch (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$1.Field11724[ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.ordinal()]) {
                    case 1: {
                        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= Double.longBitsToDouble(0x80F05F1AE925BD48L ^ 0xBF49C68370BC24D2L);
                        break;
                    }
                    case 2: {
                        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX += Double.longBitsToDouble((long)293974806 ^ 0x3FB99999881C2A8CL);
                        break;
                    }
                    case 3: {
                        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= Double.longBitsToDouble(0x5F0DA0A75DFF020BL ^ 0x60B4393EC4669B91L);
                        break;
                    }
                    case 4: {
                        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY += Double.longBitsToDouble(0x4E83E29A93E75138L ^ 0x713A7B030A7EC8A2L);
                        break;
                    }
                }
            }
            this.Field13107 = 1.0;
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
            if (this.Field13080.Method365()) {
                I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Field8401.Method6523(this, (int)((long)1494297096 ^ (long)1494297097) << 1, Float.intBitsToFloat((int)((long)513578529 ^ (long)557510727)));
            }
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            return;
        }
        if (this.Field13096.Method365()) {
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = this.Field13095.Method368();
        }
        if (this.Field13107 == 1.0) {
            this.Field13107 = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y;
            return;
        }
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y < this.Field13107) {
            this.Field13107 = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y;
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            if (this.Field13080.Method365()) {
                EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
            }
            I7F8iz7oQorkIm5qDcfi8iw0hGUOnlSO.Field8400.Field8401.Method6523(this, (int)((long)1974824115 ^ (long)1974824114) << 1, Float.intBitsToFloat(0x31AD7130 ^ 0x702D7130));
            return;
        }
        this.Field13107 = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y;
        if (!this.Field13094.Method365()) return;
        if (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == null) return;
        switch (ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$1.Field11724[ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.ordinal()]) {
            case 1: {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= Double.longBitsToDouble((long)923175391 ^ 0x3FC99999AE9F1045L);
                return;
            }
            case 2: {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX += Double.longBitsToDouble(0x7B2877D47ED4CCDEL ^ 0x44E1EE4DE74D5544L);
                return;
            }
            case 3: {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= Double.longBitsToDouble((long)1495356956 ^ 0x3FC99999C0B8CF86L);
                return;
            }
            case 4: {
                ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY += Double.longBitsToDouble(0xDB6ED65964FCD122L ^ 0xE4A74FC0FD6548B8L);
                return;
            }
        }
    }

    private ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method4593() {
        BlockPos blockPos = new BlockPos(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getX(), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getY(), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getZ());
        if (this.Method4594(blockPos) == Blocks.AIR && this.Field13106 != null) {
            if (blockPos == this.Field13106) return null;
            if (this.Field13106.add((int)-1111804523L ^ 0xBDBB3595, (int)-181921606L ^ 0xF52818BA, (int)-1060437077L ^ 0x3F34FC54).equals((Object)blockPos)) {
                return ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12065;
            }
            if (this.Field13106.add((int)1375425L ^ 0x14FCC1, (int)1593807604L ^ 0x5EFF92F4, (int)7375485L ^ 0x708A7C).equals((Object)blockPos)) {
                return ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12063;
            }
            if (this.Field13106.add((int)-899406933L ^ 0xCA6423AA, (int)((long)547136641 ^ (long)547136641), (int)1918401044L ^ 0x72587A14).equals((Object)blockPos)) {
                return ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12062;
            }
            if (!this.Field13106.add((int)((long)-574773297 ^ (long)574773296), (int)((long)465016238 ^ (long)465016238), (int)((long)-887800972 ^ (long)-887800972)).equals((Object)blockPos)) return null;
            return ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12064;
        }
        this.Field13106 = new BlockPos(EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getX(), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getY(), EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1921((Entity)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getZ());
        return null;
    }

    private Block Method4594(BlockPos blockPos) {
        if (blockPos == null) return null;
        return ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock();
    }

    private float Method4595() {
        return Math.max((float)this.Field13092.Method367(), Float.intBitsToFloat((int)((long)1812687780 ^ (long)1372039017)));
    }

    private void Method4596(ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ) {
        if (!this.Field13078.Method359().equalsIgnoreCase("Sti")) return;
        ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat((int)((long)478169035 ^ (long)1590183883)) / this.Method4595();
    }

    private void Method4597(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerPosLook) {
            if (!this.Field13079.Method365()) return;
            this.Method4587();
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketExplosion)) return;
        SPacketExplosion sPacketExplosion = (SPacketExplosion)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        this.Field13117 = Math.sqrt(sPacketExplosion.getMotionX() * sPacketExplosion.getMotionX() + sPacketExplosion.getMotionZ() * sPacketExplosion.getMotionZ());
        this.Field13116.Method2801();
    }

    private String Method4598() {
        return "[" + this.Field13078.Method359() + "]";
    }

    private Boolean Method4599() {
        int n;
        if (!this.Field13078.Method309("Strafe3") && !this.Field13078.Method309("Strafe4")) {
            n = (int)-242234201L ^ 0xF18FCCA7;
            return n != 0;
        }
        n = (int)-104854889L ^ 0xF9C00A96;
        return n != 0;
    }

    private Boolean Method4600() {
        int n;
        if (!this.Field13078.Method309("Bhop") && !this.Field13078.Method309("Strafe4")) {
            n = (int)((long)-1485228275 ^ (long)-1485228275);
            return n != 0;
        }
        n = (int)-1333410535L ^ 0xB085C518;
        return n != 0;
    }

    private Boolean Method4601() {
        int n;
        if (!this.Field13078.Method309("Bhop") && !this.Field13078.Method309("Strafe4")) {
            n = (int)((long)1636565314 ^ (long)1636565314);
            return n != 0;
        }
        n = (int)40433918L ^ 0x268F8FF;
        return n != 0;
    }

    private Boolean Method4602() {
        return this.Field13078.Method309("Bhop");
    }

    private Boolean Method4603() {
        return this.Field13078.Method309("Bhop");
    }

    private Boolean Method4604() {
        return this.Field13078.Method309("Bhop");
    }

    private Boolean Method4605() {
        return this.Field13078.Method309("Bhop");
    }

    private Boolean Method4606() {
        return this.Field13078.Method309("Sti");
    }

    private Boolean Method4607() {
        return this.Field13078.Method309("YPort");
    }

    private Boolean Method4608() {
        return this.Field13078.Method309("YPort");
    }

    private Boolean Method4609() {
        return this.Field13078.Method309("YPort");
    }

    private Boolean Method4610() {
        return this.Field13078.Method309("Strafe New");
    }

    private Boolean Method4611() {
        return this.Field13078.Method309("Strafe New");
    }

    private Boolean Method4612() {
        return this.Field13078.Method309("Strafe New");
    }

    private Boolean Method4613() {
        int n;
        if (!this.Field13078.Method309("Strafe New") && !this.Field13078.Method309("YPort")) {
            n = (int)1612560663L ^ 0x601DB917;
            return n != 0;
        }
        n = (int)238350969L ^ 0xE34F278;
        return n != 0;
    }

    private Boolean Method4614() {
        return this.Field13078.Method309("Strafe New");
    }

    private Boolean Method4615() {
        return this.Field13078.Method309("Strafe2");
    }

    private Boolean Method4616() {
        return this.Field13078.Method309("Strafe2");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)214251873 ^ (long)214251873);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)827710999 ^ (long)827711208);
            int n2 = (int)((long)-1437890531 ^ (long)-1437890540);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1236841063 ^ (long)-1236838370) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

