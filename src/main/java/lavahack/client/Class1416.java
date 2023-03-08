//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import java.util.function.*;
import java.util.concurrent.*;
import net.minecraft.block.state.*;
import com.kisman.cc.util.*;
import net.minecraft.network.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import java.util.concurrent.atomic.*;
import net.minecraft.network.play.client.*;
import java.util.*;
import net.minecraft.network.play.server.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraft.client.*;

@Class2012
@Class99
public class Class1416 extends Class42
{
    private final Class44 Field14423;
    private final Class1996 Field14424;
    private final Class1996 Field14425;
    private final Class1996 Field14426;
    private final Class1996 Field14427;
    private final Class1996 Field14428;
    private final Class1996 Field14429;
    private final Class1996 Field14430;
    private final Class1996 Field14431;
    private final Class1996 Field14432;
    private final Class1996 Field14433;
    private final Class1996 Field14434;
    private final Class1996 Field14435;
    private final Class1996 Field14436;
    public final Class44 Field14437;
    public final Class44 Field14438;
    private final Class44 Field14439;
    private final Class44 Field14440;
    private final Class44 Field14441;
    private final Class44 Field14442;
    private final Class1996 Field14443;
    private final Class44 Field14444;
    private final Class44 Field14445;
    public final Class44 Field14446;
    public final Class44 Field14447;
    private final Class44 Field14448;
    private final Class44 Field14449;
    private final Class44 Field14450;
    public final Class44 Field14451;
    private final Class44 Field14452;
    public final Class1303 Field14453;
    public final Class44 Field14454;
    private final Class44 Field14455;
    private final Class44 Field14456;
    private final Class44 Field14457;
    private final Class44 Field14458;
    private final Class44 Field14459;
    private final Class1996 Field14460;
    private final Class44 Field14461;
    private final Class44 Field14462;
    private final Class44 Field14463;
    private final Class44 Field14464;
    private final Class44 Field14465;
    private final Class44 Field14466;
    private final Class44 Field14467;
    private final Class44 Field14468;
    private final Class44 Field14469;
    private final Class44 Field14470;
    private final Class44 Field14471;
    public final Class44 Field14472;
    private final Class44 Field14473;
    private final Class44 Field14474;
    private final Class1303 Field14475;
    private final Class44 Field14476;
    private final Class246 Field14477;
    private final Class44 Field14478;
    private final Class44 Field14479;
    private final Class44 Field14480;
    private final Class1996 Field14481;
    private final Class44 Field14482;
    private final Class44 Field14483;
    private final Class44 Field14484;
    private final Class44 Field14485;
    private final Class44 Field14486;
    private final Class44 Field14487;
    private final Class44 Field14488;
    public final Class44 Field14489;
    public final Class44 Field14490;
    private final Class44 Field14491;
    private final Class44 Field14492;
    public final Class44 Field14493;
    private final Class44 Field14494;
    private final Class44 Field14495;
    private final Class44 Field14496;
    private final Class44 Field14497;
    private final Class1996 Field14498;
    private final Class44 Field14499;
    private final Class1996 Field14500;
    private final Class1996 Field14501;
    private final Class44 Field14502;
    public final Class44 Field14503;
    private final Class1996 Field14504;
    private final Class44 Field14505;
    private final Class44 Field14506;
    private final Class44 Field14507;
    private final Class44 Field14508;
    private final Class44 Field14509;
    private final Class44 Field14510;
    private final Class44 Field14511;
    private final Class44 Field14512;
    private final Class44 Field14513;
    private final Class44 Field14514;
    private final Class44 Field14515;
    private final Class44 Field14516;
    private final Class44 Field14517;
    private final Class44 Field14518;
    private final Class1996 Field14519;
    private final Class44 Field14520;
    private final Class44 Field14521;
    private final Class1996 Field14522;
    private final Class44 Field14523;
    private final Class44 Field14524;
    private final Class44 Field14525;
    private final Class44 Field14526;
    private final Class1996 Field14527;
    private final Class44 Field14528;
    private final Class44 Field14529;
    public final Class44 Field14530;
    public final Class44 Field14531;
    private final Class44 Field14532;
    public final Class44 Field14533;
    private final Class44 Field14534;
    public final Class44 Field14535;
    public final Class44 Field14536;
    public final Class44 Field14537;
    public final Class44 Field14538;
    private final Class44 Field14539;
    private final Class44 Field14540;
    private final Class44 Field14541;
    private final Class1515 Field14542;
    private final Class44 Field14543;
    public static Class1416 Field14544;
    public final List Field14545;
    private final Class650 Field14546;
    private final Class650 Field14547;
    private final Class650 Field14548;
    private final Class650 Field14549;
    private final Class650 Field14550;
    private final Class650 Field14551;
    private final Class650 Field14552;
    private final Class650 Field14553;
    private final Class650 Field14554;
    private ScheduledExecutorService Field14555;
    private final AtomicBoolean Field14556;
    private final AtomicBoolean Field14557;
    @Class1274
    public static EntityPlayer Field14558;
    private Thread Field14559;
    public Class204 Field14560;
    public Class204 Field14561;
    private Class885 Field14562;
    private Entity Field14563;
    public boolean Field14564;
    private String Field14565;
    private boolean Field14566;
    private BlockPos Field14567;
    public final Supplier Field14568;
    private final Class1285 Field14569;
    private final Class2086 Field14570;
    private final Class511 Field14571;
    private final Class714 Field14572;
    @Class1801
    private final Class618 Field14573;
    @Class1801
    private final Class618 Field14574;
    @Class1801
    private final Class618 Field14575;
    private String Field14576 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1416() {
        super("AutoRer", Class97.Field8338);
        this.Field14423 = this.Method23(new Class44("Mode", this, Class984.Field12207));
        this.Field14424 = this.Method24(new Class1996(new Class44("Main", this)));
        this.Field14425 = this.Method24(new Class1996(new Class44("Ranges", this)));
        this.Field14426 = this.Method24(new Class1996(new Class44("Calc", this)));
        this.Field14427 = this.Method24(new Class1996(new Class44("Helpers", this)));
        this.Field14428 = this.Method24(new Class1996(new Class44("Place", this)));
        this.Field14429 = this.Method24(new Class1996(new Class44("Break", this)));
        this.Field14430 = this.Method24(new Class1996(new Class44("Delay", this)));
        this.Field14431 = this.Method24(new Class1996(new Class44("Damage", this)));
        this.Field14432 = this.Method24(new Class1996(new Class44("Thread", this)));
        this.Field14433 = this.Method24(new Class1996(new Class44("Render", this)));
        this.Field14434 = this.Method24(new Class1996(new Class44("Optimization", this)));
        this.Field14435 = this.Method24(this.Field14434.Method7406(new Class1996(new Class44("Multi Thread", this))));
        this.Field14436 = this.Method24(this.Field14435.Method7406(new Class1996(new Class44("Getters", this))));
        this.Field14437 = this.Method23(this.Field14436.Method7405(new Class44("MT Sphere Getter", this, false).Method355("Sphere")));
        this.Field14438 = this.Method23(this.Field14436.Method7405(new Class44("MT Target Getter", this, false).Method355("Target")));
        this.Field14439 = this.Method23(this.Field14436.Method7405(new Class44("MT Crystal Getter", this, false).Method355("Break Pos")));
        this.Field14440 = this.Method23(this.Field14435.Method7405(new Class44("MT Extrapolation", this, true).Method355("Extrapolation")));
        this.Field14441 = this.Method23(this.Field14435.Method7405(new Class44("MT CG Delay", this, Double.longBitsToDouble((long)1801805673 ^ 0x402E00006B655F69L), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9943).Method355("Delay")));
        this.Field14442 = this.Method23(this.Field14434.Method7405(new Class44("Wall Range Usage", this, true)));
        this.Field14443 = this.Method24(this.Field14424.Method7406(new Class1996(new Class44("Stages", this))));
        this.Field14444 = this.Method23(this.Field14443.Method7405(new Class44("Calc Stage", this, (Enum)Class1310.Field14028).Method355("Calc")));
        this.Field14445 = this.Method23(this.Field14443.Method7405(new Class44("Logic Stage", this, (Enum)Class1310.Field14028).Method355("Logic")));
        this.Field14446 = this.Method23(this.Field14424.Method7405(new Class44("Lag Protect", this, false)));
        this.Field14447 = this.Method23(this.Field14425.Method7405(new Class44("Place Range", this, Double.longBitsToDouble(4618441417868443648L), 0.0, Double.longBitsToDouble(4618441417868443648L), false).Method355("Place")));
        this.Field14448 = this.Method23(this.Field14425.Method7405(new Class44("Place Wall Range", this, Double.longBitsToDouble(4616752568008179712L), 0.0, Double.longBitsToDouble((long)2045123838 ^ 0x4018000079E61CFEL), false).Method355("Place Wall")));
        this.Field14449 = this.Method23(this.Field14425.Method7405(new Class44("Break Range", this, Double.longBitsToDouble(4618441417868443648L), 0.0, Double.longBitsToDouble(4618441417868443648L), false).Method355("Break")));
        this.Field14450 = this.Method23(this.Field14425.Method7405(new Class44("Break Wall Range", this, Double.longBitsToDouble((long)1338944155 ^ 0x401200004FCEAA9BL), 0.0, Double.longBitsToDouble(4618441417868443648L), false).Method355("Break Wall")));
        this.Field14451 = this.Method23(this.Field14425.Method7405(new Class44("Target Range", this, Double.longBitsToDouble(4621256167635550208L), 0.0, Double.longBitsToDouble(4626322717216342016L), false).Method355("Target")));
        this.Field14452 = this.Method23(this.Field14424.Method7405(new Class44("Logic", this, Class1678.Field15814)));
        this.Field14453 = new Class1303("Target Logic", (Class42)this, (Enum)Class1727.Field15929).Method5304(this.Field14424).Method5303();
        this.Field14454 = this.Method23(this.Field14424.Method7405(new Class44("Terrain", this, false)));
        this.Field14455 = this.Method23(this.Field14424.Method7405(new Class44("Switch", this, (Enum)Class113.Field8392)));
        this.Field14456 = this.Method23(this.Field14426.Method7405(new Class44("Fast Calc", this, true)));
        this.Field14457 = this.Method23(this.Field14426.Method7405(new Class44("Heuristic", this, Class1664.Field15749)));
        this.Field14458 = this.Method23(this.Field14426.Method7405(new Class44("Safety Balance", this, 0.0, 0.0, Double.longBitsToDouble(4626322717216342016L), false)));
        this.Field14459 = this.Method23(this.Field14426.Method7405(new Class44("Safety Scale", this, 1.0, 0.0, 1.0, false)));
        this.Field14460 = this.Method24(new Class1996(new Class44("Motion", this)));
        this.Field14461 = this.Method23(this.Field14460.Method7405(new Class44("Motion Crystal", this, false).Method355("State")));
        this.Field14462 = this.Method23(this.Field14460.Method7405(new Class44("Motion Calc", this, false).Method313(this.Field14461::Method365)).Method355("Calc"));
        this.Field14463 = this.Method23(this.Field14427.Method7405(new Class44("Timings", this, Class1539.Field15185)));
        this.Field14464 = this.Method23(this.Field14427.Method7405(new Class44("Advanced Sequential", this, false).Method355("Advaned Seq")));
        this.Field14465 = this.Method23(this.Field14424.Method7405(new Class44("Swing", this, (Enum)Class1241.Field13628)));
        this.Field14466 = this.Method23(this.Field14424.Method7405(new Class44("Swing Logic", this, Class2084.Field17518).Method313(this::Method5664)));
        this.Field14467 = this.Method23(this.Field14427.Method7405(new Class44("Instant", this, true)));
        this.Field14468 = this.Method23(this.Field14427.Method7405(new Class44("Instant Calc", this, true).Method313(this.Field14467::Method365)));
        this.Field14469 = this.Method23(this.Field14427.Method7405(new Class44("Instant Rotate", this, true).Method313(this.Field14467::Method365)));
        this.Field14470 = this.Method23(this.Field14427.Method7405(new Class44("Inhibit", this, false)));
        this.Field14471 = this.Method23(this.Field14427.Method7405(new Class44("Sound", this, false)));
        this.Field14472 = this.Method23(this.Field14427.Method7405(new Class44("Sync", this, false)));
        this.Field14473 = this.Method23(this.Field14427.Method7405(new Class44("Sync Mode", this, Class2149.Field17836).Method355("Sync")));
        this.Field14474 = this.Method23(this.Field14427.Method7405(new Class44("Rotate", this, Class464.Field9926)));
        this.Field14475 = new Class1303("Rotate Mode", (Class42)this, (Enum)Class135.Field8498).Method5301((Supplier)this::Method5663).Method5304(this.Field14427).Method5303();
        this.Field14476 = this.Method23(this.Field14427.Method7405(new Class44("Calc Dist Sort", this, false)));
        this.Field14477 = ((Class246)new Class246(this).Method772(this.Field14427)).Method1330().Method1331();
        this.Field14478 = this.Method23(this.Field14477.Method1328().Method7405(new Class44("Damage Sync Place", this, Class499.Field10076).Method355("Place")));
        this.Field14479 = this.Method23(this.Field14477.Method1328().Method7405(new Class44("Damage Sync Break", this, Class499.Field10076).Method355("Break")));
        this.Field14480 = this.Method23(this.Field14477.Method1328().Method7405(new Class44("Damage Sync Self", this, false).Method355("Self")));
        this.Field14481 = this.Method24(this.Field14427.Method7406(new Class1996(new Class44("Extrapolation", this))));
        this.Field14482 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation State", this, false).Method355("State")));
        this.Field14483 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Self", this, false).Method355("Self")));
        this.Field14484 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Ticks", this, 1.0, 1.0, Double.longBitsToDouble(4632233691727265792L), true).Method355("Ticks")));
        this.Field14485 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Out Of Blocks", this, false).Method355("Out Of Blocks")));
        this.Field14486 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Shrink", this, false).Method355("Shrink")));
        this.Field14487 = this.Method23(this.Field14481.Method7405(new Class44("Extrapolation Render", this, false).Method355("Render")));
        this.Field14488 = this.Method23(this.Field14428.Method7405(new Class44("Place", this, true)));
        this.Field14489 = this.Method23(this.Field14428.Method7405(new Class44("Second Check", this, false)));
        this.Field14490 = this.Method23(this.Field14428.Method7405(new Class44("Third Check", this, false)));
        this.Field14491 = this.Method23(this.Field14428.Method7405(new Class44("Fourth Check", this, false)));
        this.Field14492 = this.Method23(this.Field14428.Method7405(new Class44("Multi Place", this, Class1772.Field16121).Method355("Multi")));
        this.Field14493 = this.Method23(this.Field14428.Method7405(new Class44("Fire Place", this, false).Method355("Fire")));
        this.Field14494 = this.Method23(this.Field14428.Method7405(new Class44("Packet Place", this, true).Method355("Packet")));
        this.Field14495 = this.Method23(this.Field14428.Method7405(new Class44("1.13+ Place", this, false).Method355("1.13+")));
        this.Field14496 = this.Method23(this.Field14428.Method7405(new Class44("1.13 Entities", this, false)));
        this.Field14497 = this.Method23(this.Field14428.Method7405(new Class44("Feet Replacer", this, false)));
        this.Field14498 = this.Method24(this.Field14428.Method7406(new Class1996(new Class44("Face", this))));
        this.Field14499 = this.Method23(this.Field14498.Method7405(new Class44("Face Place", this, Class355.Field9479).Method355("Mode")));
        this.Field14500 = this.Method24(this.Field14498.Method7406(new Class1996(new Class44("Triggers", this))));
        this.Field14501 = this.Method24(this.Field14500.Method7406(new Class1996(new Class44("Armor", this))));
        this.Field14502 = this.Method23(this.Field14501.Method7405(new Class44("Armor Breaker State", this, false).Method355("State")));
        this.Field14503 = this.Method23(this.Field14501.Method7405(new Class44("Armor Breaker", this, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble(4636737291354636288L), Class467.Field9942).Method355("Value")));
        this.Field14504 = this.Method24(this.Field14500.Method7406(new Class1996(new Class44("Damage", this))));
        this.Field14505 = this.Method23(this.Field14504.Method7405(new Class44("Min Damage State", this, false).Method355("State")));
        this.Field14506 = this.Method23(this.Field14504.Method7405(new Class44("Min Face Place DMG", this, Double.longBitsToDouble((long)741554647 ^ 0x401C00002C3339D7L), 1.0, Double.longBitsToDouble(4630404104378646528L), true).Method355("Min")));
        this.Field14507 = this.Method23(this.Field14428.Method7405(new Class44("Ray Trace", this, false)));
        this.Field14508 = this.Method23(this.Field14429.Method7405(new Class44("Break", this, true)));
        this.Field14509 = this.Method23(this.Field14429.Method7405(new Class44("Break Priority", this, Class47.Field8132).Method355("Priority").Method313(this.Field14508::Method365)));
        this.Field14510 = this.Method23(this.Field14429.Method7405(new Class44("Friend", this, (Enum)Class10.Field7866).Method313(this.Field14508::Method365)));
        this.Field14511 = this.Method23(this.Field14429.Method7405(new Class44("Client Side", this, (Enum)Class1381.Field14258).Method313(this.Field14508::Method365)));
        this.Field14512 = this.Method23(this.Field14429.Method7405(new Class44("Client Side On", this, Class1663.Field15744).Method313(this.Field14508::Method365)));
        this.Field14513 = this.Method23(this.Field14429.Method7405(new Class44("Manual Breaker", this, false).Method355("Manual").Method313(this.Field14508::Method365)));
        this.Field14514 = this.Method23(this.Field14429.Method7405(new Class44("Remove After Attack", this, false).Method313(this.Field14508::Method365)));
        this.Field14515 = this.Method23(this.Field14429.Method7405(new Class44("Anti Cev Breaker", this, Class56.Field8174).Method355("Anti Cev Break").Method313(this.Field14508::Method365)));
        this.Field14516 = this.Method23(this.Field14429.Method7405(new Class44("Packet Break", this, false).Method355("Packet").Method313(this.Field14508::Method365)));
        this.Field14517 = this.Method23(this.Field14430.Method7405(new Class44("Delay Mode", this, (Enum)Class1324.Field14066).Method355("Mode")));
        this.Field14518 = this.Method23(this.Field14430.Method7405(new Class44("Ping Smart Multi", this, 0.0, 0.0, Double.longBitsToDouble(4613937818241073152L), false)));
        this.Field14519 = this.Method24(this.Field14430.Method7406(new Class1996(new Class44("Default", this))));
        this.Field14520 = this.Method23(this.Field14519.Method7405(new Class44("Place Delay", this, 0.0, 0.0, Double.longBitsToDouble((long)1492293898 ^ 0x409F400058F2990AL), Class467.Field9943).Method355("Place")));
        this.Field14521 = this.Method23(this.Field14519.Method7405(new Class44("Break Delay", this, 0.0, 0.0, Double.longBitsToDouble((long)730179817 ^ 0x409F40002B85A8E9L), Class467.Field9943).Method355("Break")));
        this.Field14522 = this.Method24(this.Field14430.Method7406(new Class1996(new Class44("From To", this))));
        this.Field14523 = this.Method23(this.Field14522.Method7405(new Class44("From Place To Break Delay", this, Double.longBitsToDouble((long)165996328 ^ 0x4049000009E4E728L), 0.0, Double.longBitsToDouble((long)1745749499 ^ 0x409F4000680E05FBL), Class467.Field9943).Method355("From P To B")));
        this.Field14524 = this.Method23(this.Field14522.Method7405(new Class44("From Place To Break Delay", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)1512545435 ^ 0x409F40005A279C9BL), Class467.Field9943).Method355("From B To P")));
        this.Field14525 = this.Method23(this.Field14430.Method7405(new Class44("Calc Delay", this, 0.0, 0.0, Double.longBitsToDouble(4671226772094713856L), Class467.Field9943).Method355("Calc")));
        this.Field14526 = this.Method23(this.Field14430.Method7405(new Class44("Clear Delay", this, Double.longBitsToDouble((long)1932355819 ^ 0x407F4000732D68EBL), 0.0, Double.longBitsToDouble(4656510908468559872L), Class467.Field9943).Method355("Clear")));
        this.Field14527 = this.Method24(this.Field14430.Method7406(new Class1996(new Class44("Sequential", this))));
        this.Field14528 = this.Method23(this.Field14527.Method7405(new Class44("Sequential Break Delay", this, 0.0, 0.0, Double.longBitsToDouble(4626322717216342016L), true).Method355("Break")));
        this.Field14529 = this.Method23(this.Field14430.Method7405(new Class44("Multiplication", this, 1.0, 1.0, Double.longBitsToDouble((long)286275506 ^ 0x40240000111037B2L), true).Method355("Multi")));
        this.Field14530 = this.Method23(this.Field14431.Method7405(new Class44("Min DMG", this, Double.longBitsToDouble(4618441417868443648L), 0.0, Double.longBitsToDouble(4630404104378646528L), true).Method355("Min")));
        this.Field14531 = this.Method23(this.Field14431.Method7405(new Class44("Max Self DMG", this, Double.longBitsToDouble((long)1418939140 ^ 0x4032000054934B04L), 0.0, Double.longBitsToDouble((long)1117540571 ^ 0x40428000429C50DBL), true).Method355("Max Self")));
        this.Field14532 = this.Method23(this.Field14431.Method7405(new Class44("Max Friend DMG", this, Double.longBitsToDouble((long)1850541711 ^ 0x402400006E4D068FL), 0.0, Double.longBitsToDouble(4630404104378646528L), true).Method355("Max Friend")));
        this.Field14533 = this.Method23(this.Field14431.Method7405(new Class44("Lethal Mult", this, 0.0, 0.0, Double.longBitsToDouble((long)1828070173 ^ 0x401800006CF6231DL), false)));
        this.Field14534 = this.Method23(this.Field14431.Method7405(new Class44("No Suicide", this, true)));
        this.Field14535 = this.Method23(this.Field14432.Method7405(new Class44("Thread Mode", this, (Enum)Class1041.Field12586).Method355("Mode")));
        this.Field14536 = this.Method23(this.Field14432.Method7405(new Class44("Thread Delay", this, Double.longBitsToDouble(4632233691727265792L), 1.0, Double.longBitsToDouble((long)367874217 ^ 0x408F400015ED50A9L), Class467.Field9943).Method355("Delay").Method313(this::Method5662)));
        this.Field14537 = this.Method23(this.Field14432.Method7405(new Class44("Thread Syns", this, true).Method355("Sync").Method313(this::Method5661)));
        this.Field14538 = this.Method23(this.Field14432.Method7405(new Class44("Thread Syns Value", this, Double.longBitsToDouble((long)982976691 ^ 0x408F40003A9708B3L), 1.0, Double.longBitsToDouble((long)982553255 ^ 0x40C388003A9092A7L), Class467.Field9943).Method355("Sync Delay").Method313(this::Method5660)));
        this.Field14539 = this.Method23(this.Field14432.Method7405(new Class44("Thread Packet Rots", this, false).Method355("Rotations").Method313(this::Method5659)));
        this.Field14540 = this.Method23(this.Field14432.Method7405(new Class44("Thread Sound Player", this, Double.longBitsToDouble((long)1636857095 ^ 0x4018000061907507L), 0.0, Double.longBitsToDouble(4622945017495814144L), true).Method355("Sound Player").Method313(this::Method5658)));
        this.Field14541 = this.Method23(this.Field14432.Method7405(new Class44("Thread Calc", this, true).Method355("Calc").Method313(this::Method5657)));
        this.Field14542 = new Class1515(this).Method6046(this.Field14433).Method6042().Method6043();
        this.Field14543 = this.Method23(this.Field14433.Method7405(new Class44("Text", this, true)));
        this.Field14545 = new ArrayList();
        this.Field14546 = new Class650();
        this.Field14547 = new Class650();
        this.Field14548 = new Class650();
        this.Field14549 = new Class650();
        this.Field14550 = new Class650();
        this.Field14551 = new Class650();
        this.Field14552 = new Class650();
        this.Field14553 = new Class650();
        this.Field14554 = new Class650();
        this.Field14556 = new AtomicBoolean(false);
        this.Field14557 = new AtomicBoolean(false);
        this.Field14560 = new Class204(null, null, 0.0f, 0.0f, null, null, null);
        this.Field14562 = new Class885(null, 0.0f, 0.0f, false);
        this.Field14563 = null;
        this.Field14565 = this.Field14535.Method359();
        this.Field14566 = false;
        this.Field14567 = null;
        this.Field14568 = this::Method5656;
        this.Field14569 = new Class1285(this.Field14441.Method395(), this.Field14440.Method397(), this.Field14484.Method392(), this.Field14485.Method397(), this.Field14486.Method397());
        this.Field14570 = new Class2086(this.Field14477.Method1329(), this::Method5655, this::Method5654);
        this.Field14571 = new Class511(this.Field14441.Method395(), this.Field14439.Method397());
        this.Field14572 = new Class714();
        this.Field14573 = new Class618(this::Method5652, new Predicate[0]);
        this.Field14574 = new Class618(this::Method5651, new Predicate[0]);
        this.Field14575 = new Class618(this::Method5650, new Predicate[0]);
        super.Method44(Class1416::Method5653);
        Class1416.Field14544 = this;
    }
    
    private void Method5587() {
        if (this.Field14551.Method2797(this.Field14526.Method369())) {
            this.Field14545.clear();
            this.Field14551.Method2801();
            this.Field14566 = true;
        }
        if (!this.Field14565.equalsIgnoreCase(this.Field14535.Method359())) {
            if (this.Field14555 != null) {
                this.Field14555.shutdown();
            }
            if (this.Field14559 != null) {
                this.Field14556.set(true);
            }
            this.Field14565 = this.Field14535.Method359();
        }
        if (Class1416.Field14558 == null) {
            this.Field14560.Method1204(null);
            this.Field14562 = null;
            return;
        }
        this.Method5615();
        this.Method5635();
    }
    
    private void Method5588() {
        if (!this.Field14488.Method365() || !this.Method5598(false).Method2797((long)this.Method5599(false)) || (this.Field14560.Method1203() == null && this.Field14456.Method365()) || this.Method5621() || this.Field14560.Method1203() == null || (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.OBSIDIAN) && !this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.BEDROCK)) || (this.Field14472.Method365() && this.Field14545.contains(this.Field14560)) || !(boolean)this.Field14570.Method7623(this.Field14560.Method1207(), (Entity)Class1416.Field14558).Method6307()) {
            return;
        }
        this.Method5629(false, null);
    }
    
    private void Method5589() {
        if (this.Field14562 == null || (this.Field14463.Method341() != Class1539.Field15185 && this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) || !(boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Class1416.Field14558).Method6307()) {
            return;
        }
        this.Method5637();
    }
    
    private void Method5590() {
        Class1955.Field17021.Method6685().Method499();
        Class1416.Field14558 = Class1955.Field17021.Method6685().Method496();
        if (this.Field14482.Method365()) {
            this.Field14569.Method5223();
        }
        if (this.Field14452.Method309("PlaceBreak")) {
            this.Method5588();
            this.Method5589();
        }
        else {
            this.Method5589();
            this.Method5588();
        }
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1955.Field17021.Method6687();
        this.Method5591();
        if (!this.Field14535.Method309("None")) {
            this.Method5592();
        }
        Class1796.Field16242.Method706(this.Field14574);
        Class1796.Field16242.Method706(this.Field14575);
        Class1796.Field16242.Method706(this.Field14573);
    }
    
    private void Method5591() {
        this.Field14572.Method2988();
        this.Field14569.Method5222();
        this.Field14570.Method6394();
        this.Field14545.clear();
        this.Field14546.Method2801();
        this.Field14547.Method2801();
        this.Field14548.Method2801();
        this.Field14549.Method2801();
        this.Field14551.Method2801();
        this.Field14552.Method2801();
        this.Field14553.Method2801();
        Class1416.Field14558 = null;
        this.Field14564 = false;
        this.Field14561 = null;
        this.Field14566 = true;
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field14574);
        Class1796.Field16242.Method711(this.Field14575);
        Class1796.Field16242.Method711(this.Field14573);
        if (this.Field14559 != null) {
            this.Field14556.set(false);
        }
        if (this.Field14555 != null) {
            this.Field14555.shutdown();
        }
        this.Method5591();
    }
    
    private void Method5592() {
        if (this.Field14535.Method309("While")) {
            this.Method5594();
        }
        else if (!this.Field14535.Method309("None")) {
            this.Method5596(false);
        }
    }
    
    private ScheduledExecutorService Method5593() {
        final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        singleThreadScheduledExecutor.scheduleAtFixedRate(Class533.Method2419(this), 0L, this.Field14536.Method369(), TimeUnit.MILLISECONDS);
        return singleThreadScheduledExecutor;
    }
    
    private void Method5594() {
        if (this.Field14559 == null || this.Field14559.isInterrupted() || this.Field14559.isAlive() || (this.Field14554.Method2797(this.Field14538.Method369()) && this.Field14537.Method365())) {
            if (this.Field14559 == null) {
                this.Field14559 = this.Method5595();
            }
            else if (this.Field14554.Method2797(this.Field14538.Method369()) && !this.Field14556.get() && this.Field14537.Method365()) {
                this.Field14556.set(true);
                this.Field14554.Method2801();
                return;
            }
            if (this.Field14559 != null && (this.Field14559.isInterrupted() || !this.Field14559.isAlive())) {
                this.Field14559 = this.Method5595();
            }
            if (this.Field14559 != null && this.Field14559.getState().equals(Thread.State.NEW)) {
                this.Field14559.start();
                this.Field14554.Method2801();
            }
        }
    }
    
    private Thread Method5595() {
        final Thread thread = new Thread(Class533.Method2419(this));
        thread.setName("AutoReR-Thread-" + new AtomicLong(0L).getAndIncrement());
        return thread;
    }
    
    private void Method5596(final boolean b) {
        if (b || this.Field14555 == null || this.Field14555.isTerminated() || this.Field14555.isShutdown() || (this.Field14554.Method2797(this.Field14538.Method369()) && this.Field14537.Method365())) {
            if (this.Field14555 != null) {
                this.Field14555.shutdown();
            }
            this.Field14555 = this.Method5593();
            this.Field14554.Method2801();
        }
    }
    
    @Override
    public void Method45() {
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isGamePaused) {
            return;
        }
        if (this.Field14444.Method341() == Class1310.Field14028) {
            this.Method5587();
        }
        if (this.Field14445.Method341() == Class1310.Field14028) {
            this.Method5590();
        }
        if (!this.Field14565.equalsIgnoreCase(this.Field14535.Method359())) {
            if (this.Field14555 != null) {
                this.Field14555.shutdown();
            }
            if (this.Field14559 != null) {
                this.Field14556.set(true);
            }
            this.Field14565 = this.Field14535.Method359();
        }
    }
    
    private IBlockState Method5597(final BlockPos blockPos) {
        return Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }
    
    private Class650 Method5598(final boolean b) {
        return b ? ((this.Field14517.Method341() == Class1324.Field14066) ? this.Field14547 : this.Field14548) : ((this.Field14517.Method341() == Class1324.Field14066) ? this.Field14546 : this.Field14549);
    }
    
    private int Method5599(final boolean b) {
        return (this.Field14518.Method335() == 0) ? this.Method5600(b) : ((int)(Class886.Method3700() * this.Field14518.Method367()));
    }
    
    private int Method5600(final boolean b) {
        return (this.Field14517.Method341() == Class1324.Field14066) ? (b ? this.Field14521.Method335() : this.Field14520.Method335()) : (b ? this.Field14523.Method335() : this.Field14524.Method335());
    }
    
    public synchronized void Method20() {
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field14513.Method365()) {
            this.Method5601();
        }
        if (this.Field14456.Method365() && this.Field14550.Method2797(this.Field14525.Method369())) {
            this.Method5615();
            this.Field14550.Method2801();
        }
        if (this.Field14529.Method335() == 1) {
            this.Method5602(null, true);
        }
        else {
            for (int i = 0; i < this.Field14529.Method335(); ++i) {
                this.Method5602(null, true);
            }
        }
    }
    
    private void Method5601() {
        final RayTraceResult objectMouseOver = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
        if (this.Field14553.Method2797(200L) && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.isKeyDown() && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.GOLDEN_APPLE && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() != Items.GOLDEN_APPLE && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() != Items.BOW && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() != Items.EXPERIENCE_BOTTLE && objectMouseOver != null) {
            if (objectMouseOver.typeOfHit.equals((Object)RayTraceResult$Type.ENTITY) && objectMouseOver.entityHit instanceof EntityEnderCrystal) {
                Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(objectMouseOver.entityHit));
                this.Field14553.Method2801();
            }
            else if (objectMouseOver.typeOfHit.equals((Object)RayTraceResult$Type.BLOCK)) {
                for (final Entity entity : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(new BlockPos((double)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getX(), Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getY() + 1.0, (double)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getZ())))) {
                    if (!(entity instanceof EntityEnderCrystal)) {
                        continue;
                    }
                    Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
                    this.Field14553.Method2801();
                }
            }
        }
    }
    
    private void Method5602(final Class478 class478, final boolean b) {
        if (this.Field14452.Method309("PlaceBreak")) {
            this.Method5623(class478, b);
            this.Method5636();
        }
        else {
            this.Method5636();
            this.Method5623(class478, b);
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5603(final LivingEvent$LivingUpdateEvent livingEvent$LivingUpdateEvent) {
        if (this.Field14444.Method341() == Class1310.Field14027) {
            this.Method5587();
        }
        if (this.Field14445.Method341() == Class1310.Field14027) {
            this.Method5590();
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method5604(final RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field14444.Method341() == Class1310.Field14029) {
            this.Method5587();
        }
        if (this.Field14445.Method341() == Class1310.Field14029) {
            this.Method5590();
        }
        if (Class1416.Field14558 != null && this.Field14482.Method365() && this.Field14487.Method365() && ((Class2051)Class1416.Field14558).Method2145() != null) {
            this.Field14542.Method3804(((Class2051)Class1416.Field14558).Method2145().getEntityBoundingBox());
        }
        if (this.Field14560.Method1203() != null) {
            this.Field14572.Method3000(this.Field14542.Field15093.Method368(), this.Field14542.Field15094.Method368(), this.Field14542.Field15095.Method368(), this.Field14542, this.Field14560, this.Field14543.Method365());
        }
    }
    
    private void Method5605(final int entityId) {
        final boolean b = this.Field14469.Method365() && !this.Field14461.Method365() && (this.Field14474.Method309("Break") || this.Field14474.Method309("All"));
        new Class2160().Method7793();
        final CPacketUseEntity cPacketUseEntity = new CPacketUseEntity();
        cPacketUseEntity.entityId = entityId;
        cPacketUseEntity.action = CPacketUseEntity$Action.ATTACK;
        Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketUseEntity);
        this.Field14547.Method2801();
        this.Field14552.Method2801();
    }
    
    private void Method5606(final int i) {
        ((Class135)this.Field14475.Method341()).Method929().Method1726(((Class135)this.Field14475.Method341()).Method931().Method1726(i, Class1048.Field12640), false);
    }
    
    private void Method5607(final Class2160 class2160) {
        ((Class135)this.Field14475.Method341()).Method930().Method1726(class2160, true);
    }
    
    private BlockPos Method5608(final int n, final BlockPos blockPos) {
        if (this.Field14470.Method365()) {
            this.Field14563 = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(n);
        }
        if (this.Field14466.Method341() == Class2084.Field17518) {
            this.Method5643();
        }
        this.Method5605(n);
        if (this.Field14466.Method341() == Class2084.Field17519) {
            this.Method5643();
        }
        this.Field14566 = true;
        if (this.Field14473.Method341() == Class2149.Field17837) {
            this.Method5598(false).Method2801();
        }
        return blockPos;
    }
    
    private float Method5609(final double n, final double n2, final double n3, final EntityPlayer entityPlayer) {
        return Class2155.Method7763((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, n, n2, n3, (Entity)entityPlayer, (this.Field14482.Method365() && (entityPlayer != Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player || this.Field14483.Method365())) ? this.Field14569.Method5225(entityPlayer).getEntityBoundingBox() : entityPlayer.getEntityBoundingBox(), 0, this.Field14454.Method365());
    }
    
    private float Method5610(final BlockPos blockPos, final EntityPlayer entityPlayer) {
        return this.Method5609(blockPos.getX(), blockPos.getY(), blockPos.getZ(), entityPlayer);
    }
    
    private boolean Method5611(final EntityPlayer entityPlayer) {
        final BlockPos method3015 = Class721.Method3015((Entity)entityPlayer);
        int n = 0;
        final EnumFacing[] HORIZONTALS = EnumFacing.HORIZONTALS;
        for (int length = HORIZONTALS.length, i = 0; i < length; ++i) {
            if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(method3015.offset(HORIZONTALS[i])).getBlock() != Blocks.AIR) {
                ++n;
            }
        }
        return false;
    }
    
    public boolean Method5612(final List list, final BlockPos blockPos) {
        for (final EntityPlayer entityPlayer : list) {
            if (!Class726.Field11086.Method3042(entityPlayer)) {
                if (entityPlayer == Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
                    continue;
                }
                if (this.Method5613(entityPlayer, blockPos)) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    public boolean Method5613(final EntityPlayer entityPlayer, final BlockPos blockPos) {
        final BlockPos up = blockPos.up();
        if (!this.Method5618(blockPos, this.Field14489.Method365(), false, this.Method27(), this.Field14493.Method365(), this.Field14495.Method365(), this.Field14496.Method365())) {
            return false;
        }
        for (final EnumFacing enumFacing : EnumFacing.HORIZONTALS) {
            if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityPlayer.class, new AxisAlignedBB(up.offset(enumFacing))).contains(entityPlayer) || Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)EntityPlayer.class, new AxisAlignedBB(up.offset(enumFacing).offset(enumFacing))).contains(entityPlayer)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean Method5614() {
        return Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isCallingFromMinecraftThread() || !this.Field14557.get();
    }
    
    private void Method5615() {
        this.Method5619();
        if (this.Field14560.Method1203() == null && Class1082.Field12832.Method27()) {
            this.Field14560.Method1204(Class1082.Field12832.Method4368());
        }
        else {
            Class1082.Field12832.Method4370(false);
        }
    }
    
    public boolean Method27() {
        return this.Field14492.Method341() != Class1772.Field16121 && (this.Field14492.Method341() == Class1772.Field16122 || this.Method5616());
    }
    
    public boolean Method28() {
        return this.Field14499.Method341() != Class355.Field9479 && (this.Field14499.Method341() == Class355.Field9480 || this.Method5616());
    }
    
    private boolean Method5616() {
        return Class1416.Field14558 != null && (Class1416.Field14558.moveForward != 0.0f || Class1416.Field14558.moveStrafing != 0.0f);
    }
    
    public boolean Method5617(final float n) {
        return this.Field14505.Method365() && n <= this.Field14506.Method335();
    }
    
    public boolean Method29() {
        return this.Field14502.Method365() && Class9.Method137(Class1416.Field14558, (float)this.Field14503.Method335());
    }
    
    private boolean Method5618(final BlockPos blockPos, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6) {
        if (!Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK) && !Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN)) {
            return false;
        }
        if (!Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.AIR) && (!b4 || !Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock().equals(Blocks.FIRE))) {
            return false;
        }
        if (!b5 && !Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) {
            return false;
        }
        final BlockPos add = blockPos.add(0, 1, 0);
        return !b2 || Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB((double)add.getX(), (double)add.getY(), (double)add.getZ(), (double)(add.getX() + 1), (double)(add.getY() + (b6 ? 0 : (b ? 2 : 1))), (double)(add.getZ() + 1)), Class1416::Method5649).size() == 0;
    }
    
    private void Method5619() {
        double longBitsToDouble = Double.longBitsToDouble((long)1572681971 ^ 0x3FE000005DBD38F3L);
        double n = 0.0;
        BlockPos blockPos = null;
        final List method7758 = Class2155.Method7758(this.Field14447.Method368(), true, false);
        if (this.Field14476.Method365()) {
            Collections.sort((List<Comparable>)method7758);
            Collections.reverse(method7758);
        }
        for (int size = method7758.size(), i = 0; i < size; ++i) {
            final BlockPos blockPos2 = (BlockPos)method7758.get(i);
            if (!this.Field14490.Method365() || this.Method5622(blockPos2)) {
                if (this.Method5618(blockPos2, this.Field14489.Method365(), true, this.Method27(), this.Field14493.Method365(), this.Field14495.Method365(), this.Field14496.Method365())) {
                    float n2 = this.Method5609(blockPos2.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos2.getY() + 1, blockPos2.getZ() + Double.longBitsToDouble(4602678819172646912L), Class1416.Field14558);
                    final Class1621 method7759 = this.Field14570.Method7623(n2, (Entity)Class1416.Field14558);
                    if (this.Field14478.Method341() == Class499.Field10078) {
                        n2 = (float)method7759.Method6308();
                    }
                    if ((boolean)method7759.Method6307() && ((this.Method28() && (this.Method5617(n2) || this.Method29())) || n2 > this.Field14530.Method335() || n2 * this.Field14533.Method367() > Class1416.Field14558.getHealth() + Class1416.Field14558.getAbsorptionAmount())) {
                        float n3 = this.Method5609(blockPos2.getX() + Double.longBitsToDouble(4602678819172646912L), blockPos2.getY() + 1, blockPos2.getZ() + Double.longBitsToDouble(4602678819172646912L), (EntityPlayer)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                        final Class1621 method7760 = this.Field14570.Method7623(n2, (Entity)Class1416.Field14558);
                        if (this.Field14478.Method341() == Class499.Field10078 && this.Field14480.Method365()) {
                            n3 = (float)method7760.Method6308();
                        }
                        if ((boolean)method7760.Method6307() && n3 <= this.Field14531.Method335() && (n3 + 2.0f < Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() || !this.Field14534.Method365()) && n3 < n2) {
                            final float method7761 = this.Method5620(n2, n3);
                            if (longBitsToDouble <= method7761) {
                                longBitsToDouble = method7761;
                                n = n3;
                                blockPos = blockPos2;
                            }
                        }
                    }
                }
            }
        }
        this.Field14560 = new Class204((EntityLivingBase)Class1416.Field14558, blockPos, (float)n, (float)longBitsToDouble, null, null, null);
    }
    
    private float Method5620(final float n, final float n2) {
        switch (Class1769.Field16113[((Class1664)this.Field14457.Method341()).ordinal()]) {
            case 1: {
                return n;
            }
            case 2: {
                return n - n2;
            }
            case 3: {
                return n * this.Field14459.Method368() - this.Field14458.Method368();
            }
            default: {
                return n;
            }
        }
    }
    
    private boolean Method5621() {
        return this.Field14473.Method341() == Class2149.Field17839 && !this.Field14566;
    }
    
    public boolean Method5622(final BlockPos blockPos) {
        return Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(blockPos.getX() + Double.longBitsToDouble((long)1594660155 ^ 0x3FE000005F0C953BL), (double)blockPos.getY(), blockPos.getZ() + Double.longBitsToDouble((long)425215601 ^ 0x3FE0000019584671L)) <= (Class394.Method1917(blockPos) ? this.Field14447.Method367() : this.Field14448.Method367());
    }
    
    private void Method5623(final Class478 class478, final boolean b) {
        if (!this.Field14488.Method365() || !this.Method5598(false).Method2797((long)this.Method5599(false)) || (this.Field14560.Method1203() == null && this.Field14456.Method365()) || this.Method5621()) {
            return;
        }
        if (!this.Field14456.Method365() || (b && this.Field14541.Method365())) {
            this.Method5615();
        }
        if (this.Field14560.Method1203() == null || (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.OBSIDIAN) && !this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.BEDROCK)) || (this.Field14472.Method365() && this.Field14545.contains(this.Field14560)) || !(boolean)this.Field14570.Method7623(this.Field14560.Method1207(), (Entity)Class1416.Field14558).Method6307()) {
            return;
        }
        this.Method5629(b, class478);
    }
    
    private void Method5624() {
        if (this.Field14512.Method341() == Class1663.Field15745 && this.Field14563 != null) {
            this.Method5642(this.Field14563);
        }
    }
    
    private int[] Method5625(final boolean b) {
        final int currentItem = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (Class9.Method116(Items.END_CRYSTAL, 0, 9) == -1 && !b) {
            return new int[] { currentItem, 1 };
        }
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && !b) {
            final String method359 = this.Field14455.Method359();
            switch (method359.hashCode()) {
                case 2433880: {
                    if (method359.equals("None")) {
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
                case 79996329: {
                    if (method359.equals("Smart")) {
                        break;
                    }
                    break;
                }
            }
        }
        return new int[] { currentItem, 0 };
    }
    
    private void Method5626(final int n) {
        if (n != -1 && this.Field14455.Method309(Class113.Field8394.name())) {
            Class9.Method110(n, true);
        }
    }
    
    private Class2160 Method5627(final boolean b, final Class478 class478) {
        final Class2160 method7793 = new Class2160().Method7793();
        if (this.Field14474.Method309("Place") || this.Field14474.Method309("All")) {
            final float[] array = (float[])((Class135)this.Field14475.Method341()).Method932().Method1726(this.Field14560.Method1203());
            if (!b) {
                if (!this.Field14461.Method365()) {
                    ((Class135)this.Field14475.Method341()).Method929().Method1726(array, false);
                }
                else if (class478 != null) {
                    class478.Method1734(array[0]);
                    class478.Method1736(array[1]);
                }
            }
            else if (this.Field14539.Method365()) {
                Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(array[0], array[1], Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            }
        }
        return method7793;
    }
    
    private void Method5628(final Class2160 class2160) {
        if (this.Field14474.Method309("Place") || this.Field14474.Method309("All")) {
            this.Method5607(class2160);
        }
    }
    
    private void Method5629(final boolean b, final Class478 class478) {
        this.Method5624();
        EnumHand getActiveHand = null;
        final boolean equals = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem().equals(Items.END_CRYSTAL);
        final int[] method5625 = this.Method5625(equals);
        if (method5625[1] == 1 || Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL)) {
            return;
        }
        if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) {
            getActiveHand = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand();
        }
        EnumFacing up = EnumFacing.UP;
        if (this.Field14507.Method365()) {
            final RayTraceResult rayTraceBlocks = Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d(this.Field14560.Method1203().getX() + Double.longBitsToDouble((long)962095817 ^ 0x3FE0000039586AC9L), this.Field14560.Method1203().getY() - Double.longBitsToDouble((long)1064186200 ^ 0x3FE000003F6E3158L), this.Field14560.Method1203().getZ() + Double.longBitsToDouble((long)351840406 ^ 0x3FE0000014F8A896L)));
            up = ((rayTraceBlocks == null || rayTraceBlocks.sideHit == null) ? EnumFacing.UP : rayTraceBlocks.sideHit);
        }
        final Class2160 method5626 = this.Method5627(b, class478);
        this.Method5630(up, equals);
        this.Method5628(method5626);
        this.Method5626(method5625[0]);
        if (getActiveHand != null) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setActiveHand(getActiveHand);
        }
    }
    
    private void Method5630(final EnumFacing enumFacing, final boolean b) {
        if (this.Field14560.Method1203() != null && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection != null) {
            if (this.Field14466.Method341() == Class2084.Field17518) {
                this.Method5643();
            }
            if (this.Field14494.Method365() && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection != null) {
                Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(this.Field14560.Method1203(), enumFacing, this.Method5631(b), 0.0f, 0.0f, 0.0f));
            }
            else {
                Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field14560.Method1203(), enumFacing, new Vec3d(0.0, 0.0, 0.0), this.Method5631(b));
            }
            if (this.Field14466.Method341() == Class2084.Field17519) {
                this.Method5643();
            }
            this.Field14566 = false;
            this.Method5598(false).Method2801();
        }
    }
    
    private EnumHand Method5631(final boolean b) {
        return b ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
    }
    
    private Class885 Method5632() {
        EntityEnderCrystal entityEnderCrystal = null;
        if (!this.Field14515.Method309("None")) {
            if (this.Field14515.Method309("Cev") || this.Field14515.Method309("Both")) {
                final Iterator<Vec3i> iterator = Class1404.Field14352.Field14354.iterator();
                while (iterator.hasNext()) {
                    for (final Entity entity : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().add((Vec3i)iterator.next())))) {
                        if (entity instanceof EntityEnderCrystal) {
                            entityEnderCrystal = (EntityEnderCrystal)entity;
                        }
                    }
                }
            }
            if (this.Field14515.Method309("Civ") || this.Field14515.Method309("Both")) {
                final Iterator<Vec3i> iterator3 = Class1404.Field14353.Field14354.iterator();
                while (iterator3.hasNext()) {
                    for (final Entity entity2 : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().add((Vec3i)iterator3.next())))) {
                        if (entity2 instanceof EntityEnderCrystal) {
                            entityEnderCrystal = (EntityEnderCrystal)entity2;
                        }
                    }
                }
            }
        }
        return (entityEnderCrystal != null) ? new Class885(entityEnderCrystal, 0.0f, 0.0f, true) : null;
    }
    
    private Class885 Method5633() {
        if (Class1416.Field14558 == null) {
            return null;
        }
        EntityEnderCrystal entityEnderCrystal = null;
        float intBitsToFloat = Float.intBitsToFloat(1056964608);
        float intBitsToFloat2 = Float.intBitsToFloat(1056964608);
        for (final Entity entity : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (entity instanceof EntityEnderCrystal) {
                if (this.Field14464.Method365() && this.Field14463.Method341() == Class1539.Field15184 && entity.ticksExisted < this.Field14528.Method335()) {
                    continue;
                }
                if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity) >= (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen(entity) ? this.Field14449.Method367() : this.Field14450.Method367())) {
                    continue;
                }
                final Class1271 method5644 = this.Method5644(entity);
                float n = Class2155.Method7759((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX, entity.posY, entity.posZ, (Entity)Class1416.Field14558, this.Field14454.Method365());
                final Class1621 method5645 = this.Field14570.Method7623(n, (Entity)Class1416.Field14558);
                if (this.Field14479.Method341() == Class499.Field10078) {
                    n = (float)method5645.Method6308();
                }
                if (method5644 != null && !this.Field14510.Method309(Class10.Field7864.name())) {
                    if (this.Field14510.Method309(Class10.Field7866.name()) && method5644.Field13740) {
                        return null;
                    }
                    if (method5644.Field13741) {
                        return null;
                    }
                    if (method5644.Field13739 >= this.Field14532.Method335()) {
                        return null;
                    }
                }
                if (!(boolean)method5645.Method6307() || (n <= this.Field14530.Method335() && n * this.Field14533.Method367() <= Class1416.Field14558.getHealth() + Class1416.Field14558.getAbsorptionAmount() && !Class9.Method137(Class1416.Field14558, (float)this.Field14503.Method335()))) {
                    continue;
                }
                float n2 = Class2155.Method7759((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX, entity.posY, entity.posZ, (Entity)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14454.Method365());
                final Class1621 method5646 = this.Field14570.Method7623(n, (Entity)Class1416.Field14558);
                if (this.Field14479.Method341() == Class499.Field10078 && this.Field14480.Method365()) {
                    n2 = (float)method5646.Method6308();
                }
                if (!(boolean)method5646.Method6307() || n2 > this.Field14531.Method335() || n2 + 2.0f > Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() || n2 >= n || intBitsToFloat > n) {
                    continue;
                }
                intBitsToFloat = n;
                intBitsToFloat2 = n2;
                entityEnderCrystal = (EntityEnderCrystal)entity;
            }
        }
        return (entityEnderCrystal == null) ? null : new Class885(entityEnderCrystal, intBitsToFloat2, intBitsToFloat, false);
    }
    
    private boolean Method5634() {
        return (this.Field14473.Method341() == Class2149.Field17838 || this.Field14473.Method341() == Class2149.Field17839) && this.Field14566;
    }
    
    private boolean Method5635() {
        if (!this.Field14508.Method365() || !this.Method5598(true).Method2797((long)this.Method5599(true)) || this.Method5634()) {
            return true;
        }
        Class885 field14562;
        if (this.Field14571.Method2363().get()) {
            final AtomicReference<Class885> atomicReference = new AtomicReference<Class885>();
            final AtomicReference<Class885> atomicReference2 = new AtomicReference<Class885>();
            this.Field14571.Method2361(this::Method5647);
            if (this.Field14509.Method309("Damage")) {
                atomicReference.set(atomicReference2.get());
            }
            else {
                this.Field14571.Method2361(this::Method5645);
                atomicReference.set(this.Method5632());
                if (atomicReference.get() == null) {
                    atomicReference.set(atomicReference2.get());
                }
            }
            field14562 = atomicReference.get();
        }
        else {
            final Class885 method5633 = this.Method5633();
            Class885 method5634;
            if (this.Field14509.Method309("Damage")) {
                method5634 = method5633;
            }
            else {
                method5634 = this.Method5632();
                if (method5634 == null) {
                    method5634 = method5633;
                }
            }
            field14562 = method5634;
        }
        this.Field14562 = field14562;
        return false;
    }
    
    private void Method5636() {
        if (this.Method5635()) {
            return;
        }
        if (this.Field14562 == null || (this.Field14463.Method341() != Class1539.Field15185 && this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) || !(boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Class1416.Field14558).Method6307()) {
            return;
        }
        this.Method5637();
    }
    
    private void Method5637() {
        final Class2160 method5638 = this.Method5638();
        this.Method5639();
        this.Method5640(method5638);
        this.Method5641();
    }
    
    private Class2160 Method5638() {
        final Class2160 method7793 = new Class2160().Method7793();
        if (this.Field14474.Method309("Break") || this.Field14474.Method309("All")) {
            this.Method5606(this.Field14562.Method3691().getEntityId());
        }
        return method7793;
    }
    
    private void Method5639() {
        if (this.Field14562 == null || this.Field14562.Method3691() == null || (this.Field14463.Method341() != Class1539.Field15185 && this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) || !(boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Class1416.Field14558).Method6307()) {
            return;
        }
        this.Field14563 = (Entity)this.Field14562.Method3691();
        if (this.Field14466.Method341() == Class2084.Field17518) {
            this.Method5643();
        }
        if (this.Field14516.Method365()) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)this.Field14562.Method3691()));
        }
        else {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)this.Field14562.Method3691());
        }
        if (this.Field14466.Method341() == Class2084.Field17519) {
            this.Method5643();
        }
        if (this.Field14512.Method341() == Class1663.Field15744) {
            this.Method5642((Entity)this.Field14562.Method3691());
            if (this.Field14511.Method365()) {
                Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(this.Field14562.Method3691().entityId);
            }
        }
        this.Method5598(true).Method2801();
        this.Field14566 = true;
    }
    
    private void Method5640(final Class2160 class2160) {
        if (this.Field14474.Method309("Break") || this.Field14474.Method309("All")) {
            this.Method5607(class2160);
        }
    }
    
    private void Method5641() {
        if (this.Field14472.Method365()) {
            BlockPos method1203 = null;
            for (int i = 0; i < this.Field14545.size(); ++i) {
                if (((Class204)this.Field14545.get(i)).Method1203() != null && this.Field14562.Method3691().getDistanceSq(((Class204)this.Field14545.get(i)).Method1203()) <= Double.longBitsToDouble(4621256167635550208L)) {
                    method1203 = ((Class204)this.Field14545.get(i)).Method1203();
                }
            }
            if (method1203 != null) {
                this.Field14545.remove(Class204.Field8894.Method6018(this.Field14545, method1203));
            }
        }
    }
    
    private void Method5642(final Entity entity) {
        if (this.Field14511.Method341() == Class1381.Field14259 || this.Field14511.Method341() == Class1381.Field14261) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entity.entityId);
        }
        else if (this.Field14511.Method341() == Class1381.Field14260 || this.Field14511.Method341() == Class1381.Field14261) {
            entity.setDead();
        }
    }
    
    private void Method5643() {
        if (this.Field14465.Method310((Enum)Class1241.Field13629)) {
            return;
        }
        if (this.Field14465.Method310((Enum)Class1241.Field13628)) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(this.Field14465.Method309(Class1241.Field13625.name()) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND));
        }
        else if (this.Field14465.Method310((Enum)Class1241.Field13627)) {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm((Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND);
        }
        else {
            Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(this.Field14465.Method310((Enum)Class1241.Field13625) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND);
        }
    }
    
    private Class1271 Method5644(final Entity entity) {
        final ArrayList<Class1271> list = new ArrayList<Class1271>();
        for (final EntityPlayer entityPlayer : Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == entityPlayer) {
                continue;
            }
            if (!Class726.Field11086.Method3042(entityPlayer)) {
                continue;
            }
            final double n = Class2155.Method7759((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX, entity.posY, entity.posZ, (Entity)Class1416.Field14558, this.Field14454.Method365());
            if (n > this.Field14532.Method335() && n * this.Field14533.Method367() < entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()) {
                continue;
            }
            list.add(new Class1271(entityPlayer, n, n * this.Field14533.Method367() >= entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()));
        }
        Class1271 class1271 = null;
        double longBitsToDouble = Double.longBitsToDouble(4602678819172646912L);
        for (final Class1271 class1272 : list) {
            final double n2 = Class2155.Method7759((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX, entity.posY, entity.posZ, (Entity)Class1416.Field14558, this.Field14454.Method365());
            if (n2 > longBitsToDouble) {
                longBitsToDouble = n2;
                class1271 = new Class1271(class1272.Field13738, n2);
            }
        }
        return class1271;
    }
    
    private void Method5645(final AtomicReference atomicReference) {
        Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method5646);
    }
    
    private void Method5646(final AtomicReference atomicReference) {
        atomicReference.set(this.Method5632());
    }
    
    private void Method5647(final AtomicReference atomicReference) {
        Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method5648);
    }
    
    private void Method5648(final AtomicReference atomicReference) {
        atomicReference.set(this.Method5633());
    }
    
    private static boolean Method5649(final boolean b, final Entity entity) {
        return !(entity instanceof EntityEnderCrystal) || b;
    }
    
    private void Method5650(final Class805 class805) {
        if (class805.Method982() instanceof CPacketPlayerTryUseItemOnBlock && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(((CPacketPlayerTryUseItemOnBlock)class805.Method982()).getHand()).getItem() == Items.END_CRYSTAL) {
            if (this.Field14491.Method365() && !this.Method5622(((CPacketPlayerTryUseItemOnBlock)class805.Method982()).getPos())) {
                class805.Method158();
                return;
            }
            this.Field14545.add(Class1955.Field17021.Method6690(((CPacketPlayerTryUseItemOnBlock)class805.Method982()).getPos(), (EntityLivingBase)Class1416.Field14558, this.Field14454.Method365()));
        }
        if (class805.Method982() instanceof CPacketUseEntity) {
            final CPacketUseEntity cPacketUseEntity = (CPacketUseEntity)class805.Method982();
            final Entity getEntityFromWorld = cPacketUseEntity.getEntityFromWorld((World)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
            if (cPacketUseEntity.getAction().equals((Object)CPacketUseEntity$Action.ATTACK) && getEntityFromWorld instanceof EntityEnderCrystal) {
                if (this.Field14497.Method365() && Class1416.Field14558 != null && this.Method5611(Class1416.Field14558) && this.Method5613(Class1416.Field14558, getEntityFromWorld.getPosition().down())) {
                    this.Field14560.Method1204(getEntityFromWorld.getPosition().down());
                    this.Method5629(false, null);
                }
                if (this.Field14514.Method365()) {
                    Objects.requireNonNull(getEntityFromWorld).setDead();
                    Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(cPacketUseEntity.entityId);
                }
            }
        }
    }
    
    private void Method5651(final Class544 class544) {
        if (class544.Method982() instanceof SPacketSpawnObject && this.Field14467.Method365()) {
            final SPacketSpawnObject sPacketSpawnObject = (SPacketSpawnObject)class544.Method982();
            if (sPacketSpawnObject.getType() == 51) {
                if (!(Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(sPacketSpawnObject.getEntityID()) instanceof EntityEnderCrystal)) {
                    return;
                }
                BlockPos blockPos = null;
                final Iterator<Class204> iterator = this.Field14545.iterator();
                if (iterator.hasNext()) {
                    final BlockPos method1203 = iterator.next().Method1203();
                    if (Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(method1203.getX() + Double.longBitsToDouble((long)2140427329 ^ 0x3FE000007F945441L), (double)method1203.getY(), method1203.getZ() + Double.longBitsToDouble((long)1381635067 ^ 0x3FE00000525A13FBL)) < (Class394.Method1917(method1203) ? this.Field14449.Method367() : this.Field14450.Method367())) {
                        if (this.Field14468.Method365() && Class1416.Field14558 != null) {
                            final float method1204 = Class2155.Method7761(method1203, (Entity)Class1416.Field14558, this.Field14454.Method365());
                            if (method1204 > this.Field14530.Method335() || method1204 * this.Field14533.Method367() > Class1416.Field14558.getHealth() + Class1416.Field14558.getAbsorptionAmount() || Class9.Method137(Class1416.Field14558, (float)this.Field14503.Method335())) {
                                final float method1205 = Class2155.Method7761(method1203, (Entity)Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14454.Method365());
                                if (method1205 <= this.Field14531.Method335() && method1205 + 2.0f <= Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() && method1205 < method1204) {
                                    blockPos = this.Method5608(sPacketSpawnObject.getEntityID(), method1203);
                                }
                            }
                        }
                        else {
                            blockPos = this.Method5608(sPacketSpawnObject.getEntityID(), method1203);
                        }
                    }
                }
                if (blockPos != null) {
                    this.Field14545.remove(Class204.Field8894.Method6018(this.Field14545, blockPos));
                }
            }
        }
        if (class544.Method982() instanceof SPacketSoundEffect && this.Field14512.Method341() == Class1663.Field15746 && this.Field14563 != null) {
            final SPacketSoundEffect sPacketSoundEffect = (SPacketSoundEffect)class544.Method982();
            if (sPacketSoundEffect.getCategory() == SoundCategory.BLOCKS && sPacketSoundEffect.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE && this.Field14563.getDistance(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()) <= Double.longBitsToDouble((long)903352325 ^ 0x4018000035D81005L)) {
                this.Method5642(this.Field14563);
            }
        }
        if (class544.Method982() instanceof SPacketSoundEffect && ((this.Field14470.Method365() && this.Field14563 != null) || this.Field14471.Method365())) {
            final SPacketSoundEffect sPacketSoundEffect2 = (SPacketSoundEffect)class544.Method982();
            if (sPacketSoundEffect2.getCategory() == SoundCategory.BLOCKS && sPacketSoundEffect2.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE && this.Field14563.getDistance(sPacketSoundEffect2.getX(), sPacketSoundEffect2.getY(), sPacketSoundEffect2.getZ()) <= Double.longBitsToDouble((long)994887407 ^ 0x401800003B4CC6EFL)) {
                this.Field14563.setDead();
            }
            if (this.Field14535.Method309(Class1041.Field12588.name()) && this.Method5614() && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
                Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(new BlockPos(sPacketSoundEffect2.getX(), sPacketSoundEffect2.getY(), sPacketSoundEffect2.getZ()));
                final double n = this.Field14540.Method335();
                return (void)(n * n);
            }
        }
    }
    
    private void Method5652(final Class478 class478) {
        if (!this.Field14461.Method365() || Class1416.Field14558 == null) {
            return;
        }
        if (this.Field14462.Method365() && this.Field14456.Method365() && this.Field14550.Method2797(this.Field14525.Method369())) {
            this.Method5615();
            this.Field14550.Method2801();
        }
        if (this.Field14529.Method335() == 1) {
            this.Method5602(class478, false);
        }
        else {
            for (int i = 0; i < this.Field14529.Method335(); ++i) {
                this.Method5602(class478, false);
            }
        }
    }
    
    private static String Method5653() {
        return "[" + ((Class1416.Field14558 == null) ? "no target no fun" : Class1416.Field14558.getName()) + "]";
    }
    
    private Boolean Method5654() {
        return this.Field14479.Method341() != Class499.Field10076;
    }
    
    private Boolean Method5655() {
        return this.Field14478.Method341() != Class499.Field10076;
    }
    
    private Boolean Method5656() {
        if (this.Field14455.Method359().equals("Smart") && this.Field14560.Method1201() == Class1416.Field14558 && this.Field14560.Method1203() != null) {
            if (this.Field14560.Method1205() >= Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() && Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING) {
                return false;
            }
            if (this.Field14560.Method1207() * this.Field14533.Method367() >= Class1416.Field14558.getHealth() + Class1416.Field14558.getAbsorptionAmount()) {
                return true;
            }
        }
        return false;
    }
    
    private Boolean Method5657() {
        return !this.Field14535.Method309("None");
    }
    
    private Boolean Method5658() {
        return this.Field14535.Method309("Sound");
    }
    
    private Boolean Method5659() {
        return !this.Field14535.Method309(Class1041.Field12586.name()) && !this.Field14474.Method309(Class464.Field9926.name());
    }
    
    private Boolean Method5660() {
        return !this.Field14535.Method309(Class1041.Field12586.name());
    }
    
    private Boolean Method5661() {
        return !this.Field14535.Method309(Class1041.Field12586.name());
    }
    
    private Boolean Method5662() {
        return !this.Field14535.Method309(Class1041.Field12586.name());
    }
    
    private Boolean Method5663() {
        return !this.Field14474.Method309("None");
    }
    
    private Boolean Method5664() {
        return this.Field14465.Method341() != Class1241.Field13629;
    }
    
    static Minecraft Method5665() {
        return Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static Minecraft Method5666() {
        return Class1416.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    static AtomicBoolean Method5667(final Class1416 class1416) {
        return class1416.Field14556;
    }
    
    static Class650 Method5668(final Class1416 class1416) {
        return class1416.Field14554;
    }
    
    static Thread Method5669(final Class1416 class1416) {
        return class1416.Field14559;
    }
    
    static AtomicBoolean Method5670(final Class1416 class1416) {
        return class1416.Field14557;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x66D5 ^ 0xE5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
