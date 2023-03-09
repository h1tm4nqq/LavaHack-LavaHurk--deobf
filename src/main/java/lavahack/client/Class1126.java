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
import com.kisman.cc.util.Class650;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import lavahack.client.Class115;
import lavahack.client.Class1744;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1917;
import lavahack.client.Class2036;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class887;
import lavahack.client.Class954;
import lavahack.client.Class97;
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

public class Class1126
extends Class42 {
    public static Class1126 Field13077;
    public Class44 Field13078 = this.Method23(new Class44("SpeedMode", (Class42)this, "Strafe", new ArrayList<String>(Arrays.asList("Strafe", "Strafe New", "YPort", "Sti", "Matrix 6.4", "Matrix Bhop", "Sunrise Strafe", "Bhop", "Strafe2", "Matrix", "NCP", "Strafe3"))));
    private final Class44 Field13079 = this.Method23(new Class44("Flag Detect", (Class42)this, true));
    public final Class44 Field13080 = this.Method23(new Class44("Use Timer", (Class42)this, false));
    public final Class44 Field13081 = this.Method23(new Class44("Timer Factor", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)1368031560 ^ 0x40240000518A8148L), true).Method313(this.Field13080::Method365));
    public final Class44 Field13082 = this.Method23(new Class44("Motion X Modifier", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)87740156 ^ 0x3FE00000053ACEFCL), false).Method313(this::Method4616));
    public final Class44 Field13083 = this.Method23(new Class44("Motion Z Modifier", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)5709333 ^ 0x3FE0000000571E15L), false).Method313(this::Method4615));
    public final Class44 Field13084 = this.Method23(new Class44("Strafe Speed", (Class42)this, Double.longBitsToDouble(4598847156441317376L), Double.longBitsToDouble(4591870180174331904L), 1.0, false).Method313(this::Method4614));
    public final Class44 Field13085 = this.Method23(new Class44("Slow", (Class42)this, false).Method313(this::Method4613));
    public final Class44 Field13086 = this.Method23(new Class44("Cap", (Class42)this, Double.longBitsToDouble((long)1787245397 ^ 0x402400006A873355L), 0.0, Double.longBitsToDouble((long)1153620606 ^ 0x4024000044C2DA7EL), false).Method313(this::Method4612));
    public final Class44 Field13087 = this.Method23(new Class44("Scale Cap", (Class42)this, false).Method313(this::Method4611));
    public final Class44 Field13088 = this.Method23(new Class44("Lag Time", (Class42)this, Double.longBitsToDouble(4647503709213818880L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943).Method313(this::Method4610));
    private final Class44 Field13089 = this.Method23(new Class44("YPortSpeed", (Class42)this, Double.longBitsToDouble(4588807732127072256L), Double.longBitsToDouble(4576918229175238656L), Double.longBitsToDouble(4594572340058128384L), false).Method313(this::Method4609));
    private final Class44 Field13090 = this.Method23(new Class44("Water", (Class42)this, false).Method313(this::Method4608));
    private final Class44 Field13091 = this.Method23(new Class44("Lava", (Class42)this, false).Method313(this::Method4607));
    private final Class44 Field13092 = this.Method23(new Class44("StiSpeed", (Class42)this, Double.longBitsToDouble((long)1206939820 ^ 0x4010000047F070ACL), Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble((long)431413892 ^ 0x4024000019B6DA84L), true).Method313(this::Method4606));
    public final Class44 Field13093 = this.Method23(new Class44("Use Motion", (Class42)this, false).Method313(this::Method4605));
    public final Class44 Field13094 = this.Method23(new Class44("Use Motion In Air", (Class42)this, false).Method313(this::Method4604));
    public final Class44 Field13095 = this.Method23(new Class44("Jump Movement Factor Speed", (Class42)this, Double.longBitsToDouble(4598445435265220608L), Double.longBitsToDouble((long)1646939538 ^ 0x3F847AE1222A4D92L), Double.longBitsToDouble(0x4024000000000000L), false).Method313(this::Method4603));
    public final Class44 Field13096 = this.Method23(new Class44("Jump Movement Factor", (Class42)this, false).Method313(this::Method4602));
    public final Class44 Field13097 = this.Method23(new Class44("Boost Speed", (Class42)this, Double.longBitsToDouble((long)1421579436 ^ 0x3FD0F5C2D4BB94ACL), Double.longBitsToDouble((long)1571258108 ^ 0x3F847AE11DA77EFCL), Double.longBitsToDouble((long)1381746498 ^ 0x40240000525BC742L), false).Method313(this::Method4601));
    public final Class44 Field13098 = this.Method23(new Class44("Boost Factor", (Class42)this, false).Method313(this::Method4600));
    private final Class44 Field13099 = this.Method23(new Class44("Strict", (Class42)this, false).Method313(this::Method4599));
    private int Field13100;
    private double Field13101;
    private double Field13102;
    private boolean Field13103;
    private int Field13104;
    private double Field13105;
    private BlockPos Field13106;
    private double Field13107 = 1.0;
    private int Field13108 = 4;
    private double Field13109;
    private double Field13110;
    private boolean Field13111;
    private int Field13112 = 0;
    private double Field13113 = 0.0;
    private double Field13114 = 0.0;
    private boolean Field13115 = false;
    private final Class650 Field13116 = new Class650();
    private double Field13117 = 0.0;
    @Class1801
    private final Class618 Field13118 = new Class618(this::Method4597, 1000, new Predicate[0]);
    @Class1801
    private final Class618 Field13119 = new Class618(this::Method4596, new Predicate[0]);
    private String Field13120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1126() {
        super("Speed", "speed", Class97.Field8340);
        super.Method44(this::Method4598);
        Field13077 = this;
    }

    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field13119);
        Class1796.Field16242.Method706(this.Field13118);
        this.Method4587();
    }

    private void Method4587() {
        Class394.Method1953();
        this.Field13116.Method2801();
        this.Field13100 = 4;
        this.Field13104 = 0;
        this.Field13108 = 4;
        this.Field13109 = 0.0;
        this.Field13110 = 0.0;
        this.Field13111 = false;
        this.Field13112 = 4;
        this.Field13114 = 0.0;
        this.Field13113 = 0.0;
        this.Field13117 = 0.0;
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field13102 = Class1917.Method7157();
        this.Field13101 = Class1917.Method7153();
    }

    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field13119);
        Class1796.Field16242.Method711(this.Field13118);
        this.Method4587();
    }

    @Override
    public void Method45() {
        double d;
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field13102 = Class1917.Method7157();
        if ((this.Field13078.Method309("Strafe New") || this.Field13078.Method309("Strafe4")) && this.Field13080.Method365() && Class115.Field8400.Method837(250)) {
            Class394.Method1952(Float.intBitsToFloat(1066031016) + Float.intBitsToFloat(1006834287) * this.Field13081.Method368());
        }
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward > 0.0f && Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime < 5 && this.Field13078.Method359().equalsIgnoreCase("Strafe")) {
            if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(4600967451314246124L);
                float f = Class1917.Method7160();
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= (double)(MathHelper.sin((float)f) * Float.intBitsToFloat(1045220557));
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ += (double)(MathHelper.cos((float)f) * Float.intBitsToFloat(1045220557));
                return;
            }
            double d2 = Math.sqrt(Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX * Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX + Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ * Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ);
            double d3 = Math.abs(Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead - Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw) < Float.intBitsToFloat(1119092736) ? Double.longBitsToDouble((long)1333210038 ^ 0x3FF01A36AD9C37F5L) : Double.longBitsToDouble(4607186922399644778L);
            double d4 = Class1917.Method7160();
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = -Math.sin(d4) * d3 * d2;
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = Math.cos(d4) * d3 * d2;
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("YPort")) {
            this.Method4590();
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Strafe New") && !Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
            if (!Class115.Field8400.Method837(this.Field13088.Method335())) {
                return;
            }
            if (this.Field13100 == 1 && Class1744.Method6651((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
                this.Field13101 = Double.longBitsToDouble((long)1947586175 ^ 0x3FF59999ED8C57E5L) * Class1917.Method7154(this.Field13085.Method365(), this.Field13084.Method367()) - Double.longBitsToDouble((long)2120220114 ^ 0x3F847AE139F1E9A9L);
            } else if (this.Field13100 == 2 && Class1744.Method6651((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) && Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)725743666 ^ 0x3FD997F6002B1FE7L) + Class1917.Method7155();
                this.Field13101 *= this.Field13103 ? Double.longBitsToDouble(4610260629145325142L) : Double.longBitsToDouble((long)1732865838 ^ 0x3FF651EBE257D77CL);
            } else if (this.Field13100 == 3) {
                this.Field13101 = this.Field13102 - Double.longBitsToDouble((long)1945237818 ^ 0x3FE51EB8221A7C25L) * (this.Field13102 - Class1917.Method7154(this.Field13085.Method365(), this.Field13084.Method367()));
                this.Field13103 = !this.Field13103;
            } else {
                if ((Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes(null, Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, 0.0)).size() > 0 || Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedVertically) && this.Field13100 > 0) {
                    this.Field13100 = Class1744.Method6651((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) ? 1 : 0;
                }
                this.Field13101 = this.Field13102 - this.Field13102 / Double.longBitsToDouble(4639798331726364672L);
            }
            this.Field13101 = Math.min(this.Field13101, this.Method4591());
            this.Field13101 = Math.max(this.Field13101, Class1917.Method7154(this.Field13085.Method365(), this.Field13084.Method367()));
            Class1917.Method7158((float)this.Field13101);
            if (!Class1744.Method6651((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) return;
            ++this.Field13100;
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Matrix Bhop") && Class1744.Method6651((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed = false;
            if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                ((AccessorEntityPlayer)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat(1017799875));
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(0x3DCCCCCD);
                Class394.Method1952(Float.intBitsToFloat(1064346583));
            }
            if (!((double)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance > Double.longBitsToDouble((long)1618754746 ^ 0x3FE33333534F0F89L))) return;
            if (!((double)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Double.longBitsToDouble(4608533498688228557L))) return;
            ((AccessorEntityPlayer)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat(1017799875));
            Class394.Method1952(Float.intBitsToFloat(1072064102));
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Matrix 6.4")) {
            if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 4 == 0) {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
            }
            if (!Class1744.Method6651((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
                return;
            }
            if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.pressed = false;
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                return;
            }
            if ((double)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance <= Double.longBitsToDouble((long)172571511 ^ 0x3FB9999993D0A2EDL)) {
                ((AccessorEntityPlayer)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat(1017477752));
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(1021128475);
                Class394.Method1952(Float.intBitsToFloat(1069547520));
                return;
            }
            if ((double)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance > Double.longBitsToDouble(4591870180066957722L) && (double)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Double.longBitsToDouble((long)1587873053 ^ 0x3FF4CCCC9269C9D0L)) {
                Class394.Method1952(Float.intBitsToFloat(0x3F333333));
                return;
            }
            if (!((double)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance >= Double.longBitsToDouble(4608533498688228557L))) return;
            Class394.Method1953();
            ((AccessorEntityPlayer)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).Method6392(Float.intBitsToFloat(1017477752));
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(0x3CCCCCCD);
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Sunrise Strafe")) {
            if (Class1744.Method6651((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) {
                if (!Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                Class1917.Method7156(Class1917.Method7165(Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw), Class1917.Method7153() * Double.longBitsToDouble(4607272490792564818L));
                return;
            }
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Bhop")) {
            this.Method4592();
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Strafe2") && Class1917.Method7159()) {
            if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                return;
            }
            double d5 = Class1917.Method7160();
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = -Math.sin(d5) * (double)this.Field13082.Method368();
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = Math.cos(d5) * (double)this.Field13083.Method368();
            return;
        }
        if (this.Field13078.Method359().equalsIgnoreCase("Matrix") && Class1917.Method7159() && Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 == 0) {
            if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                return;
            }
            Class1917.Method7147(Double.longBitsToDouble((long)0x828EE8E ^ 0x3FCCFEC565741422L));
            return;
        }
        if (this.Field13078.Method309("NCP") && !Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isElytraFlying()) {
            switch (this.Field13104) {
                case 0: {
                    ++this.Field13104;
                    this.Field13105 = 0.0;
                    break;
                }
                case 2: {
                    if (!Class1917.Method7159() || !Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) break;
                    Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = (this.Method4589() ? Double.longBitsToDouble((long)723568063 ^ 0x3FC99999B2B95C25L) : Double.longBitsToDouble(4600875577881847765L)) + Class1917.Method7155();
                    this.Field13101 *= Double.longBitsToDouble(4612021536599627006L);
                    break;
                }
                case 3: {
                    this.Field13101 = this.Field13105 - Double.longBitsToDouble(4604565827416515150L) * (this.Field13105 - Class1917.Method7154(this.Field13085.Method365(), Double.longBitsToDouble((long)1570438640 ^ 0x3FD2631FD793FF2EL)));
                    break;
                }
                default: {
                    if (this.Method27() || Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
                        this.Field13104 = Class1917.Method7159() ? 0 : 1;
                    }
                    this.Field13101 = this.Field13105 - this.Field13105 / Double.longBitsToDouble(4639798331726364672L);
                }
            }
            this.Field13101 = Math.min(this.Field13101, this.Method4591());
            this.Field13101 = Math.max(this.Field13101, Class1917.Method7154(this.Field13085.Method365(), Double.longBitsToDouble(4598847156609680094L)));
            Class1917.Method7158((float)this.Field13101);
            ++this.Field13104;
            return;
        }
        if (this.Field13078.Method309("Strafe3")) {
            if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround && Class1917.Method7159()) {
                this.Field13108 = 2;
            }
            if (this.Field13108 == 1 && Class1917.Method7159()) {
                ++this.Field13108;
            } else if (this.Field13108 == 2) {
                ++this.Field13108;
                if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround && Class1917.Method7159()) {
                    Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Class1917.Method7146(this.Field13099.Method365());
                    this.Field13109 *= this.Field13111 ? Double.longBitsToDouble(4608839743462889751L) : Double.longBitsToDouble((long)355371953 ^ 0x3FFB0A3D658D5CBBL);
                }
            } else if (this.Field13100 == 3) {
                ++this.Field13108;
            } else if (this.Field13100 == 4) {
                if (this.Method27() || Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedVertically) {
                    this.Field13100 = Class1917.Method7159() ? 1 : 0;
                }
                this.Field13109 = this.Field13110 - this.Field13110 / Double.longBitsToDouble((long)900974526 ^ 0x4063E00035B3C7BEL);
                this.Field13111 = !this.Field13111;
            }
            Class1917.Method7158((float)this.Field13109);
            if (Class1917.Method7159()) return;
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 0.0;
            return;
        }
        if (!this.Field13078.Method309("Strafe4")) return;
        if (Class1917.Method7159()) {
            d = Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevPosX;
            double d6 = Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.prevPosZ;
            this.Field13114 = Math.sqrt(d * d + d6 * d6);
        }
        if (this.Field13112 != 1 || Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward == 0.0f || Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing == 0.0f) {
            if (this.Field13112 == 2 && (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward != 0.0f || Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing != 0.0f)) {
                d = 0.0;
                if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.JUMP_BOOST)) {
                    d += (double)((float)(Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + 1) * Float.intBitsToFloat(0x3DCCCCCD));
                }
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(4600875577881847765L) + d;
                this.Field13113 *= this.Field13115 ? Double.longBitsToDouble((long)1976397250 ^ 0x3FFAEF9DC7E06394L) : Double.longBitsToDouble(4608961340652828754L);
            } else if (this.Field13112 == 3) {
                d = Double.longBitsToDouble((long)1346702686 ^ 0x3FE51EB801AE8841L) * (this.Field13114 - Class1917.Method7152());
                this.Field13113 = this.Field13114 - d;
                this.Field13115 = !this.Field13115;
            } else {
                List list = Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, 0.0));
                if ((list.size() > 0 || Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedVertically) && this.Field13112 > 0) {
                    this.Field13112 = Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveForward == 0.0f && Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.moveStrafing == 0.0f ? 0 : 1;
                }
                this.Field13113 = this.Field13114 - this.Field13114 / Double.longBitsToDouble(4639798331726364672L);
            }
        } else {
            this.Field13113 = Double.longBitsToDouble((long)590950426 ^ 0x3FF59999BAA0A980L) * Class1917.Method7152() - Double.longBitsToDouble(4576918229304087675L);
        }
        this.Field13113 = Math.max(this.Field13113, Class1917.Method7152());
        if (this.Field13117 > 0.0 && this.Field13098.Method365() && !this.Field13116.Method2797(75L) && !Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            this.Field13113 = Math.max(this.Field13113, this.Field13117);
        } else if (this.Field13099.Method365()) {
            this.Field13113 = Math.min(this.Field13113, Double.longBitsToDouble(4601471854472511619L));
        }
        if (!Class1917.Method7159()) {
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 0.0;
        } else {
            this.Method4588(this.Field13113);
        }
        if (Class1917.Method7159()) {
            return;
        }
        ++this.Field13112;
    }

    private void Method4588(double d) {
        double[] dArray = Class1917.Method7150(d);
        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[0];
        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[1];
    }

    public boolean Method4589() {
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, Double.longBitsToDouble(4596734067664517857L), 0.0)).size() <= 0) return false;
        return true;
    }

    public boolean Method27() {
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getCollisionBoxes((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox().offset(0.0, Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY, 0.0)).size() <= 0) return false;
        return true;
    }

    private void Method4590() {
        if (!Class1744.Method6651((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) return;
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() && !this.Field13090.Method365() && Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) {
            if (!this.Field13091.Method365()) return;
        }
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) {
            return;
        }
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            Class394.Method1952(Float.intBitsToFloat(0x3F933333));
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            Class1744.Method6652((EntityLivingBase)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1744.Method6650() + (double)this.Field13089.Method335());
            return;
        }
        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(-4616189618054758400L);
        Class394.Method1953();
    }

    public double Method4591() {
        int n;
        double d = this.Field13086.Method367();
        if (!this.Field13087.Method365()) {
            return d;
        }
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.SPEED)) {
            n = Objects.requireNonNull(Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.SPEED)).getAmplifier();
            d *= 1.0 + Double.longBitsToDouble((long)1055410678 ^ 0x3FC99999A771D06CL) * (double)(n + 1);
        }
        if (!this.Field13085.Method365()) return d;
        if (!Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.SLOWNESS)) return d;
        n = Objects.requireNonNull(Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.SLOWNESS)).getAmplifier();
        d /= 1.0 + Double.longBitsToDouble((long)2078053024 ^ 0x3FC99999E2450B3AL) * (double)(n + 1);
        return d;
    }

    private void Method4592() {
        Class954 class954 = this.Method4593();
        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting(true);
        if (!Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindForward.isKeyDown()) return;
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            if (this.Field13093.Method365() && class954 != null) {
                switch (Class887.Field11724[class954.ordinal()]) {
                    case 1: {
                        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= Double.longBitsToDouble(4591870180066957722L);
                        break;
                    }
                    case 2: {
                        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX += Double.longBitsToDouble((long)293974806 ^ 0x3FB99999881C2A8CL);
                        break;
                    }
                    case 3: {
                        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= Double.longBitsToDouble(4591870180066957722L);
                        break;
                    }
                    case 4: {
                        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY += Double.longBitsToDouble(4591870180066957722L);
                        break;
                    }
                }
            }
            this.Field13107 = 1.0;
            Class394.Method1953();
            if (this.Field13080.Method365()) {
                Class115.Field8400.Field8401.Method6523(this, 2, Float.intBitsToFloat(1067869798));
            }
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            return;
        }
        if (this.Field13096.Method365()) {
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = this.Field13095.Method368();
        }
        if (this.Field13107 == 1.0) {
            this.Field13107 = Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y;
            return;
        }
        if (Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y < this.Field13107) {
            this.Field13107 = Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y;
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            if (this.Field13080.Method365()) {
                Class394.Method1953();
            }
            Class115.Field8400.Field8401.Method6523(this, 2, Float.intBitsToFloat(1098907648));
            return;
        }
        this.Field13107 = Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector().y;
        if (!this.Field13094.Method365()) return;
        if (class954 == null) return;
        switch (Class887.Field11724[class954.ordinal()]) {
            case 1: {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX -= Double.longBitsToDouble((long)923175391 ^ 0x3FC99999AE9F1045L);
                return;
            }
            case 2: {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX += Double.longBitsToDouble(4596373779694328218L);
                return;
            }
            case 3: {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= Double.longBitsToDouble((long)1495356956 ^ 0x3FC99999C0B8CF86L);
                return;
            }
            case 4: {
                Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY += Double.longBitsToDouble(4596373779694328218L);
                return;
            }
        }
    }

    private Class954 Method4593() {
        BlockPos blockPos = new BlockPos(Class394.Method1921((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getX(), Class394.Method1921((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getY(), Class394.Method1921((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getZ());
        if (this.Method4594(blockPos) == Blocks.AIR && this.Field13106 != null) {
            if (blockPos == this.Field13106) return null;
            if (this.Field13106.add(0, 0, -1).equals((Object)blockPos)) {
                return Class954.Field12065;
            }
            if (this.Field13106.add(0, 0, 1).equals((Object)blockPos)) {
                return Class954.Field12063;
            }
            if (this.Field13106.add(1, 0, 0).equals((Object)blockPos)) {
                return Class954.Field12062;
            }
            if (!this.Field13106.add(-1, 0, 0).equals((Object)blockPos)) return null;
            return Class954.Field12064;
        }
        this.Field13106 = new BlockPos(Class394.Method1921((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getX(), Class394.Method1921((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getY(), Class394.Method1921((Entity)Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player).getZ());
        return null;
    }

    private Block Method4594(BlockPos blockPos) {
        if (blockPos == null) return null;
        return Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock();
    }

    private float Method4595() {
        return Math.max((float)this.Field13092.Method367(), Float.intBitsToFloat(0x3DCCCCCD));
    }

    private void Method4596(Class2036 class2036) {
        if (!this.Field13078.Method359().equalsIgnoreCase("Sti")) return;
        Class1126.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = Float.intBitsToFloat(1112014848) / this.Method4595();
    }

    private void Method4597(Class544 class544) {
        if (class544.Method982() instanceof SPacketPlayerPosLook) {
            if (!this.Field13079.Method365()) return;
            this.Method4587();
            return;
        }
        if (!(class544.Method982() instanceof SPacketExplosion)) return;
        SPacketExplosion sPacketExplosion = (SPacketExplosion)class544.Method982();
        this.Field13117 = Math.sqrt(sPacketExplosion.getMotionX() * sPacketExplosion.getMotionX() + sPacketExplosion.getMotionZ() * sPacketExplosion.getMotionZ());
        this.Field13116.Method2801();
    }

    private String Method4598() {
        return "[" + this.Field13078.Method359() + "]";
    }

    private Boolean Method4599() {
        boolean bl;
        if (!this.Field13078.Method309("Strafe3") && !this.Field13078.Method309("Strafe4")) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method4600() {
        boolean bl;
        if (!this.Field13078.Method309("Bhop") && !this.Field13078.Method309("Strafe4")) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
    }

    private Boolean Method4601() {
        boolean bl;
        if (!this.Field13078.Method309("Bhop") && !this.Field13078.Method309("Strafe4")) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
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
        boolean bl;
        if (!this.Field13078.Method309("Strafe New") && !this.Field13078.Method309("YPort")) {
            bl = false;
            return bl;
        }
        bl = true;
        return bl;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 9;
            cArray2[n] = (char)(cArray[n] ^ (0x561C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

