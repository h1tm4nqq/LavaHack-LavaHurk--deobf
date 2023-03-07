//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.server.SPacketBlockChange
 *  net.minecraft.network.play.server.SPacketDestroyEntities
 *  net.minecraft.network.play.server.SPacketSoundEffect
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import java.util.function.Predicate;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketDestroyEntities;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field12329 = this.Method54();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12330 = this.Method23(this.Field12329.Method1999().Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Event Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9292)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12331 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Syncronized", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1337762091L ^ 0xB0435ED5) != 0));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field12332 = this.Method25(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field15244));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12333 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RangeCheck", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2145354616 ^ (long)-2145354616)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12334 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x3270F564C6A5E430L ^ 0x7266F564C6A5E430L), 1.0, Double.longBitsToDouble(0x93155FF05E19C400L ^ 0xD3315FF05E19C400L), (boolean)((long)-769064058 ^ (long)-769064058)).Method313(this.Field12333::Method365));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12335 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Safe Dynamic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1448301676 ^ (long)-1448301676)).Method313(this::Method4100));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12336 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extension", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2146413668 ^ (long)2146413668)).Method313(this::Method4099));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12337 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AllEntities", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1822217902L ^ 0x6C9CD6AE) != 0).Method313(this::Method4098));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12338;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12339;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12340;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field12341;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12342;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12343;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12344;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12345;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12346;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12347;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field12348;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12349;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12350;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12351;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12352;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12353;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12354;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12355;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12356;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12357;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12358;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12359;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12360;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12361;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12362;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12363;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12364;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12365;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12366;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12367;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12368;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12369;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12370;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12371;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12372;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12373;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12374;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field12375;
    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA Field12376;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12377;
    private double Field12378;
    private boolean Field12379;
    private Function Field12380;
    private final Queue Field12381;
    private int Field12382;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12383;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12384;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12385;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12386;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12387;
    private String Field12388 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA() {
        super("SurroundRewrite", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338, ((int)1707399817L ^ 0x65C4DA88) != 0);
        String[] stringArray = new String[(int)((long)-103918830 ^ (long)-103918829) << 1];
        stringArray[(int)((long)-1417786553 ^ (long)-1417786553)] = "Obsidian";
        stringArray[(int)((long)1169591870 ^ (long)1169591871)] = "EnderChest";
        this.Field12338 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Obsidian", Arrays.asList(stringArray)));
        this.Field12339 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Smart Block", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1457114444 ^ (long)1457114444)));
        this.Field12340 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Safe E Chest", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)355733545L ^ 0x15341029) != 0).Method313(this::Method4097);
        this.Field12341 = this.Method25(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16723));
        this.Field12342 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SwitchWhen", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field15734));
        this.Field12343 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Center", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-657244892L ^ 0xD8D33D24) != 0));
        this.Field12344 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SmartCenter", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)496651795L ^ 0x1D9A4E13) != 0));
        this.Field12345 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SmartHelping", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1189675174L ^ 0xB916FF5A) != 0));
        this.Field12346 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FightCA", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2065285073 ^ (long)2065285073)));
        this.Field12347 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DetectSound", this).Method313(this.Field12346::Method365));
        this.Field12348 = this.Method25(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("DetectEntity", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16549).Method5301(this.Field12346::Method365));
        this.Field12349 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OnEntityDestruction", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-90308808 ^ (long)-90308808)));
        this.Field12350 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AntiCity", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-164940414 ^ (long)-164940414)));
        this.Field12351 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ManipulateWorld", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-891059973L ^ 0xCAE380FB) != 0));
        this.Field12352 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PostReceive", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)821012074 ^ (long)821012074)));
        this.Field12353 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Toggle", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field16502));
        this.Field12354 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ToggleHeight", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xEB90E90BB67CC637L ^ 0xD44970922FE55FADL), 0.0, 1.0, (boolean)((long)871349691 ^ (long)871349691)).Method313(this::Method4096));
        this.Field12355 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-642118526 ^ (long)-642118526)));
        this.Field12356 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FeetBlocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1104692817L ^ 0x41D84651) != 0));
        this.Field12357 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("HeightLimit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1510122399 ^ 0x407000005A02A39FL), 0.0, Double.longBitsToDouble((long)1734807809 ^ 0x4070000067671101L), (boolean)((long)-619823984 ^ (long)-619823983)));
        this.Field12358 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Down", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1748705899L ^ 0x683B226B) != 0));
        this.Field12359 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("In Air", this)));
        this.Field12360 = this.Method23(this.Field12359.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("In Air", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)651352303L ^ 0x26D2D8EF) != 0).Method355("State")));
        this.Field12361 = this.Method23(this.Field12359.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("In Air Motion Stop", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1663613518L ^ 0x9CD745B2) != 0).Method355("Motion Stop")));
        this.Field12362 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BreakCrystals", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1518184434L ^ 0x5A7DA7F2) != 0));
        this.Field12363 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystal Breaker", this)));
        this.Field12364 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CB Timings", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field11035).Method355("Timings")));
        this.Field12365 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CB Sequential Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)939392141 ^ 0x4024000037FDFC8DL), (boolean)((long)-189469193 ^ (long)-189469194)).Method355("Sequential Delay")));
        String[] stringArray2 = new String[((int)-961015012L ^ 0xC6B8131D) << 1];
        stringArray2[(int)((long)247293176 ^ (long)247293176)] = "SurroundBlocks";
        stringArray2[(int)951160554L ^ 0x38B18EEB] = "Area";
        this.Field12366 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CbMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "SurroundBlocks", Arrays.asList(stringArray2)).Method355("Mode")));
        this.Field12367 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CBRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)546358188 ^ 0x400800002090C3ACL), 1.0, Double.longBitsToDouble(0x7A8162A9F893C58L ^ 0x47B0162A9F893C58L), ((int)-1594282910L ^ 0xA0F92C62) != 0).Method313(this::Method4095).Method355("Range")));
        this.Field12368 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CBDelay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)498491692 ^ 0x404E00001DB6612CL), 0.0, Double.longBitsToDouble(0xD27A5D8F90F8170EL ^ 0x92051D8F90F8170EL), (boolean)((long)794964138 ^ (long)794964139)).Method355("Delay")));
        this.Field12369 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CBRotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1527925072 ^ (long)-1527925072)).Method355("Rotate")));
        this.Field12370 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CBRotateMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10160)).Method312(this.Field12369).Method355("Rotate Mode"));
        this.Field12371 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CBPacket", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1548420899L ^ 0x5C4B0723) != 0).Method355("Packet")));
        this.Field12372 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ClientSide", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-93795961L ^ 0xFA68C987) != 0).Method355("Client Side")));
        this.Field12373 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CbNoSuicide", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)724693816 ^ (long)724693817)).Method355("No Suicide")));
        this.Field12374 = this.Method23(this.Field12363.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CbTerrain", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2143213091L ^ 0x804129DC) != 0).Method313(this.Field12373::Method365)));
        this.Field12375 = this.Method25(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8498));
        this.Field12377 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field12378 = Double.longBitsToDouble(0xDE31EE3E9F6C165L ^ 0xB2131EE3E9F6C165L);
        this.Field12379 = (int)-516637866L ^ 0xE134BB56;
        this.Field12380 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA::Method4094;
        this.Field12381 = new ConcurrentLinkedQueue();
        this.Field12382 = (int)((long)-316876576 ^ (long)-316876576);
        this.Field12383 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4091, new Predicate[(int)-1388161181L ^ 0xAD425763]);
        this.Field12384 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4090, new Predicate[(int)((long)-1232887387 ^ (long)-1232887387)]);
        this.Field12385 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4089, new Predicate[(int)2005267955L ^ 0x7785F5F3]);
        this.Field12386 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4088, new Predicate[(int)((long)-861211405 ^ (long)-861211405)]);
        this.Field12387 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method4087, new Predicate[(int)((long)-870974590 ^ (long)-870974590)]);
        Field12376 = this;
    }

    @SubscribeEvent(priority=EventPriority.HIGH)
    @SubscribeEvent(priority=EventPriority.HIGH)
    public void Method4054(TickEvent tickEvent) {
        if (this.Field12330.Method341() != AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9293) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
            return;
        }
        this.Method4055();
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12383);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12384);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12385);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12386);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12387);
        this.Field12377.Method2801();
        if (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field12378 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        if (this.Field12343.Method365() && !this.Method4063()) {
            this.Method21(((int)-1565491381L ^ 0xA2B07F4B) != 0);
        }
        this.Field12382 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted;
    }

    @Override
    public void Method45() {
        if (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field12330.Method341() != AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field9292) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        } else {
            this.Method4055();
        }
        this.Field12382 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted;
    }

    private void Method4055() {
        this.Field12329.Method2005(this::Method4057);
    }

    private synchronized void Method4056() {
        this.Field12329.Method2005(this::Method4057);
    }

    /*
     * Exception decompiling
     */
    private void Method4057() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12383);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12384);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12385);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12386);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12387);
        this.Field12378 = Double.longBitsToDouble((long)727514944 ^ 0xBFF000002B5CFF40L);
        this.Field12380 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA::Method4093;
        this.Field12377.Method2801();
        this.Field12381.clear();
    }

    private void Method4058(List list) {
        if (!this.Field12377.Method2797(this.Field12368.Method335())) {
            return;
        }
        float[] fArray = new float[((int)-546209517L ^ 0xDF718112) << 1];
        fArray[(int)((long)-388582275 ^ (long)-388582275)] = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        fArray[(int)194631901L ^ 0xB99D8DC] = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        float[] fArray2 = fArray;
        HashSet<EntityEnderCrystal> hashSet = new HashSet<EntityEnderCrystal>((int)((long)2124949830 ^ (long)2124949831) << 6);
        if (this.Field12366.Method359().equals("Area")) {
            double d = this.Field12367.Method367();
            double d2 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - d;
            double d3 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - d;
            double d4 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - d;
            double d5 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d;
            double d6 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d;
            double d7 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d;
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(d2, d3, d4, d5, d6, d7);
            Iterator iterator = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, axisAlignedBB).iterator();
            while (iterator.hasNext()) {
                EntityEnderCrystal entityEnderCrystal = (EntityEnderCrystal)iterator.next();
                if (!this.Method4059(entityEnderCrystal)) {
                    return;
                }
                this.Method4060(entityEnderCrystal, fArray2);
            }
            return;
        }
        Iterator iterator = list.iterator();
        block1: while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, new AxisAlignedBB(blockPos)).iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block1;
                EntityEnderCrystal entityEnderCrystal = (EntityEnderCrystal)iterator2.next();
                if (hashSet.contains(entityEnderCrystal) || !this.Method4059(entityEnderCrystal)) continue;
                this.Method4060(entityEnderCrystal, fArray2);
                hashSet.add(entityEnderCrystal);
            }
            break;
        }
        return;
    }

    private boolean Method4059(EntityEnderCrystal entityEnderCrystal) {
        int n;
        if (this.Field12364.Method309("Sequential") && entityEnderCrystal.ticksExisted < this.Field12365.Method335()) {
            return ((int)1943723775L ^ 0x73DADEFF) != 0;
        }
        if (!this.Field12373.Method365()) {
            return ((int)101770452L ^ 0x610E4D5) != 0;
        }
        float f = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field12374.Method365());
        if (f < AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) {
            n = (int)-725360961L ^ 0xD4C3DEBE;
            return n != 0;
        }
        n = (int)((long)-142761637 ^ (long)-142761637);
        return n != 0;
    }

    private void Method4060(EntityEnderCrystal entityEnderCrystal, float[] fArray) {
        if (this.Field12369.Method365()) {
            float[] fArray2 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6179((Entity)entityEnderCrystal);
            this.Method4061(fArray2);
        }
        if (this.Field12371.Method365()) {
            AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        } else {
            AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)entityEnderCrystal);
        }
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        if (this.Field12372.Method365()) {
            AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entityEnderCrystal.entityId);
        }
        if (!this.Field12369.Method365()) return;
        this.Method4061(fArray);
    }

    private void Method4061(float[] fArray) {
        if (this.Field12370.Method341() == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10160 || this.Field12370.Method341() == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10161) {
            AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[(int)((long)1260629403 ^ (long)1260629403)], fArray[(int)((long)1926926043 ^ (long)1926926042)], AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        }
        if (this.Field12370.Method341() != AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10159) {
            if (this.Field12370.Method341() != AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10161) return;
        }
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = fArray[(int)((long)-841671866 ^ (long)-841671866)];
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = fArray[(int)-280517735L ^ 0xEF47A398];
    }

    private BlockPos Method4062(BlockPos blockPos) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        if (((IBlockState)this.Field12380.apply(blockPos.north().down())).getMaterial().isSolid()) {
            arrayList.add(blockPos.north());
        }
        if (((IBlockState)this.Field12380.apply(blockPos.east().down())).getMaterial().isSolid()) {
            arrayList.add(blockPos.east());
        }
        if (((IBlockState)this.Field12380.apply(blockPos.south().down())).getMaterial().isSolid()) {
            arrayList.add(blockPos.south());
        }
        if (!((IBlockState)this.Field12380.apply(blockPos.west().down())).getMaterial().isSolid()) return arrayList.stream().min(Comparator.comparingDouble(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA::Method4092)).orElse(null);
        arrayList.add(blockPos.west());
        return arrayList.stream().min(Comparator.comparingDouble(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA::Method4092)).orElse(null);
    }

    private boolean Method4063() {
        if (!this.Field12344.Method365()) {
            this.Method4064(new BlockPos(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
            return (int)((long)378601891 ^ (long)378601890) != 0;
        }
        BlockPos blockPos = new BlockPos(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (this.Method4081(blockPos)) {
            blockPos = this.Method4062(blockPos);
        }
        if (blockPos == null) {
            return ((int)-1650196684L ^ 0x9DA3FF34) != 0;
        }
        this.Method4064(blockPos);
        return (int)((long)96376884 ^ (long)96376885) != 0;
    }

    private void Method4064(BlockPos blockPos) {
        Vec3d vec3d = new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(0x331FA5B3107243D4L ^ 0xCFFA5B3107243D4L), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (double)blockPos.getZ() + Double.longBitsToDouble(0x4BC2A4695CB8651BL ^ 0x7422A4695CB8651BL));
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(vec3d.x, vec3d.y, vec3d.z, (boolean)((long)1477043022 ^ (long)1477043023)));
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(vec3d.x, vec3d.y, vec3d.z);
    }

    private void Method4065(List list) {
        Item item;
        ItemStack itemStack;
        int n = this.Method4070();
        if (n == ((int)-1048574343L ^ 0x3E7FF986)) {
            return;
        }
        int n2 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (this.Field12341.Method341() == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16720) {
            Block block;
            itemStack = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n2);
            item = itemStack.getItem();
            if (!(item instanceof ItemBlock)) {
                return;
            }
            Block block2 = ((ItemBlock)item).getBlock();
            if (block2 != (block = this.Method4071())) {
                return;
            }
        }
        itemStack = list.iterator();
        while (itemStack.hasNext()) {
            item = (BlockPos)itemStack.next();
            if (item.getY() > this.Field12357.Method335() || !this.Method4081((BlockPos)item) || this.Method4069((BlockPos)item) || this.Field12333.Method365() && AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((BlockPos)item) > this.Field12334.Method367()) continue;
            ((AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12341.Method341()).Method7027(n, (boolean)((long)869282695 ^ (long)869282695), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field15734);
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4209((BlockPos)item, EnumHand.MAIN_HAND, (a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field12375.Method341(), this.Field12355.Method365());
            ((AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field12341.Method341()).Method7027(n2, (boolean)((long)-728538096 ^ (long)-728538095), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field15734);
        }
    }

    private void Method4066(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!this.Field12350.Method365()) {
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketBlockChange)) {
            return;
        }
        SPacketBlockChange sPacketBlockChange = (SPacketBlockChange)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        BlockPos blockPos = sPacketBlockChange.getBlockPosition();
        if (!sPacketBlockChange.getBlockState().getBlock().isReplaceable((IBlockAccess)AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
            return;
        }
        List list = ((AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm)this.Field12332.Method341()).Method6126();
        if (!list.contains(blockPos)) {
            return;
        }
        if (this.Field12351.Method365()) {
            this.Field12380 = arg_0 -> AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4086(list, arg_0);
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
        } else {
            this.Method4055();
        }
        this.Field12380 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA::Method4085;
    }

    private boolean Method4067(Vec3d vec3d, List list) {
        BlockPos blockPos;
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return ((int)1432734474L ^ 0x5565CB0A) != 0;
        } while (!new AxisAlignedBB(blockPos = (BlockPos)iterator.next()).contains(vec3d));
        return ((int)1643886841L ^ 0x61FBB8F8) != 0;
    }

    private boolean Method4068(AxisAlignedBB axisAlignedBB, List list) {
        BlockPos blockPos;
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return ((int)-803175903L ^ 0xD0208221) != 0;
        } while (!new AxisAlignedBB(blockPos = (BlockPos)iterator.next()).intersects(axisAlignedBB));
        return ((int)1934734225L ^ 0x7351B390) != 0;
    }

    private boolean Method4069(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return ((int)930547803L ^ 0x3777085A) != 0;
        }
        return (int)((long)-1885219102 ^ (long)-1885219102) != 0;
    }

    private int Method4070() {
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.ENDER_CHEST);
        if (this.Field12338.Method309("Obsidian")) {
            this.Field12379 = this.Field12339.Method365() && n == (int)((long)443442161 ^ (long)-443442162) ? (int)((long)535318947 ^ (long)535318946) : (int)((long)-92761794 ^ (long)-92761794);
            return n;
        }
        this.Field12379 = !this.Field12339.Method365() && n2 != ((int)2097548828L ^ 0x7D060E1D) ? (int)-1195464946L ^ 0xB8BEA70F : (int)785834746L ^ 0x2ED6E2FA;
        return n;
    }

    private Block Method4071() {
        if (!this.Field12338.Method359().equals("Obsidian")) return Blocks.ENDER_CHEST;
        return Blocks.OBSIDIAN;
    }

    private List Method4072() {
        if (!this.Field12336.Method365()) return this.Method4073();
        return this.Method4074();
    }

    private List Method4073() {
        List list = this.Method4078((Entity)AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(((int)5911612L ^ 0x5A343D) << 4);
        if (this.Field12356.Method365()) {
            arrayList.addAll(this.Method4079((Entity)AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (int)-1331948147L ^ 0x4F63EA72));
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            List list2 = this.Method4075(blockPos);
            arrayList.addAll(list2);
            arrayList.add(blockPos);
        }
        return arrayList;
    }

    private List Method4074() {
        List list;
        Object object2;
        List list2 = this.Method4073();
        List list3 = new ArrayList();
        Class clazz = this.Field12337.Method365() ? Entity.class : EntityPlayer.class;
        for (Object object2 : list2) {
            list = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(clazz, new AxisAlignedBB((BlockPos)object2));
            if (list3.isEmpty()) {
                list3 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(object2.down()));
            }
            list3.addAll(list);
        }
        ArrayList arrayList = new ArrayList(list2);
        object2 = list3.iterator();
        while (object2.hasNext()) {
            Object object3;
            Object object42;
            list = (Entity)object2.next();
            if (list.equals(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player)) continue;
            List list4 = this.Method4078((Entity)list, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
            ArrayList<BlockPos> arrayList2 = new ArrayList<BlockPos>(((int)-167198911L ^ 0xF608BF40) << 4);
            if (this.Field12356.Method365()) {
                arrayList2.addAll(this.Method4079((Entity)list, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (int)-1342082042L ^ 0x4FFE8BF9));
            }
            for (Object object42 : list4) {
                object3 = this.Method4075((BlockPos)object42);
                arrayList2.addAll((Collection<BlockPos>)object3);
                arrayList2.add((BlockPos)object42);
            }
            ArrayList arrayList3 = new ArrayList(list3);
            arrayList3.add(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            object42 = new ArrayList();
            object3 = arrayList3.iterator();
            while (object3.hasNext()) {
                Entity entity = (Entity)object3.next();
                List list5 = this.Method4079(entity, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, (int)603752557L ^ 0x23FC886D);
                for (BlockPos blockPos : arrayList2) {
                    if (!list5.contains(blockPos)) continue;
                    object42.add(blockPos);
                }
            }
            arrayList2.removeAll((Collection<?>)object42);
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private List Method4075(BlockPos blockPos) {
        if (!this.Field12345.Method365()) return Collections.singletonList(blockPos.down());
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) return Collections.singletonList(blockPos.down());
        return Collections.emptyList();
    }

    private List Method4076() {
        List list = this.Method4077((int)((long)1040501580 ^ (long)1040501580));
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(((int)-1059563816L ^ 0xC0D856D9) << 4);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            BlockPos blockPos2 = blockPos.north();
            BlockPos blockPos3 = blockPos.east();
            BlockPos blockPos4 = blockPos.south();
            BlockPos blockPos5 = blockPos.west();
            if (!list.contains(blockPos2)) {
                arrayList.add(blockPos2);
            }
            if (!list.contains(blockPos3)) {
                arrayList.add(blockPos3);
            }
            if (!list.contains(blockPos4)) {
                arrayList.add(blockPos4);
            }
            if (!list.contains(blockPos5)) {
                arrayList.add(blockPos5);
            }
            if (!this.Field12335.Method365() && (!this.Field12340.Method365() || !this.Field12379)) continue;
            BlockPos blockPos6 = blockPos.north().west();
            BlockPos blockPos7 = blockPos.north().east();
            BlockPos blockPos8 = blockPos.south().east();
            BlockPos blockPos9 = blockPos.south().west();
            if (!list.contains(blockPos6)) {
                arrayList.add(blockPos6);
            }
            if (!list.contains(blockPos7)) {
                arrayList.add(blockPos7);
            }
            if (!list.contains(blockPos8)) {
                arrayList.add(blockPos8);
            }
            if (list.contains(blockPos9)) continue;
            arrayList.add(blockPos9);
        }
        return arrayList;
    }

    private List Method4077(int n) {
        ArrayList arrayList = new ArrayList((int)((long)-139450036 ^ (long)-139450035) << 4);
        Vec3d vec3d = new Vec3d(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble((long)186990098 ^ 0x3FD3333338160D21L), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble(0xC825564A1C8F75A8L ^ 0xF7F665792FBC469BL));
        Vec3d vec3d2 = new Vec3d(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Double.longBitsToDouble(0xED355D5531237D6CL ^ 0xD2E66E6602104E5FL), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble(0x27648D1ABFD00030L ^ 0x18B7BE298CE33303L));
        Vec3d vec3d3 = new Vec3d(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(0x58F1D10F433C0D7DL ^ 0x6722E23C700F3E4EL), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Double.longBitsToDouble((long)489767483 ^ 0x3FD333332E027108L));
        Vec3d vec3d4 = new Vec3d(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - Double.longBitsToDouble(0xFEA06111EB3E9612L ^ 0xC1735222D80DA521L), AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)n, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - Double.longBitsToDouble((long)928587478 ^ 0x3FD33333046A2DE5L));
        this.Method4080(vec3d, arrayList);
        this.Method4080(vec3d2, arrayList);
        this.Method4080(vec3d3, arrayList);
        this.Method4080(vec3d4, arrayList);
        return arrayList;
    }

    private List Method4078(Entity entity, double d) {
        List list = this.Method4079(entity, d, (int)-1029051174L ^ 0xC2A9ECDA);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(((int)1741457231L ^ 0x67CC874E) << 4);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            BlockPos blockPos2 = blockPos.north();
            BlockPos blockPos3 = blockPos.east();
            BlockPos blockPos4 = blockPos.south();
            BlockPos blockPos5 = blockPos.west();
            if (!list.contains(blockPos2)) {
                arrayList.add(blockPos2);
            }
            if (!list.contains(blockPos3)) {
                arrayList.add(blockPos3);
            }
            if (!list.contains(blockPos4)) {
                arrayList.add(blockPos4);
            }
            if (!list.contains(blockPos5)) {
                arrayList.add(blockPos5);
            }
            if (!this.Field12335.Method365() && (!this.Field12340.Method365() || !this.Field12379)) continue;
            BlockPos blockPos6 = blockPos.north().west();
            BlockPos blockPos7 = blockPos.north().east();
            BlockPos blockPos8 = blockPos.south().east();
            BlockPos blockPos9 = blockPos.south().west();
            if (!list.contains(blockPos6)) {
                arrayList.add(blockPos6);
            }
            if (!list.contains(blockPos7)) {
                arrayList.add(blockPos7);
            }
            if (!list.contains(blockPos8)) {
                arrayList.add(blockPos8);
            }
            if (list.contains(blockPos9)) continue;
            arrayList.add(blockPos9);
        }
        return arrayList;
    }

    public List Method4079(Entity entity, double d, int n) {
        ArrayList arrayList = new ArrayList(((int)271628513L ^ 0x1030B8E0) << 4);
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        double d2 = (axisAlignedBB.maxX - axisAlignedBB.minX) / Double.longBitsToDouble(0x85C42C6B736308D5L ^ 0xC5C42C6B736308D5L);
        double d3 = (axisAlignedBB.maxZ - axisAlignedBB.minZ) / Double.longBitsToDouble((long)228445347 ^ 0x400000000D9DCCA3L);
        Vec3d vec3d = new Vec3d(entity.posX + d2, d + (double)n, entity.posZ + d3);
        Vec3d vec3d2 = new Vec3d(entity.posX + d2, d + (double)n, entity.posZ - d3);
        Vec3d vec3d3 = new Vec3d(entity.posX - d2, d + (double)n, entity.posZ + d3);
        Vec3d vec3d4 = new Vec3d(entity.posX - d2, d + (double)n, entity.posZ - d3);
        this.Method4080(vec3d, arrayList);
        this.Method4080(vec3d2, arrayList);
        this.Method4080(vec3d3, arrayList);
        this.Method4080(vec3d4, arrayList);
        return arrayList;
    }

    private void Method4080(Vec3d vec3d, List list) {
        BlockPos blockPos = new BlockPos(vec3d);
        if (!this.Method4081(blockPos)) return;
        if (list.contains(blockPos)) return;
        list.add(blockPos);
    }

    private boolean Method4081(BlockPos blockPos) {
        int n;
        if (blockPos != null && AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null && ((IBlockState)this.Field12380.apply(blockPos)).getMaterial().isReplaceable()) {
            n = (int)((long)1615978569 ^ (long)1615978568);
            return n != 0;
        }
        n = (int)((long)320146567 ^ (long)320146567);
        return n != 0;
    }

    private List Method4082() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>((int)((long)2128137407 ^ (long)2128137406) << 4);
        arrayList.addAll(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field15244.Method6126());
        BlockPos blockPos = new BlockPos(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List list = this.Method4083(blockPos.up());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
            BlockPos blockPos2 = aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2856();
            BlockPos blockPos3 = blockPos2.up();
            BlockPos blockPos4 = blockPos2.offset(aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2857());
            if (this.Method4084(blockPos3) == Blocks.AIR) {
                arrayList.add(blockPos2);
                continue;
            }
            if (this.Method4084(blockPos4) != Blocks.AIR) continue;
            arrayList.add(blockPos2);
        }
        return arrayList;
    }

    private List Method4083(BlockPos blockPos) {
        ArrayList<AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi> arrayList = new ArrayList<AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi>(((int)198058358L ^ 0xBCE2177) << 4);
        arrayList.add(new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos.north(), EnumFacing.NORTH));
        arrayList.add(new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos.east(), EnumFacing.EAST));
        arrayList.add(new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos.south(), EnumFacing.SOUTH));
        arrayList.add(new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos.west(), EnumFacing.WEST));
        return arrayList;
    }

    private Block Method4084(BlockPos blockPos) {
        return ((IBlockState)this.Field12380.apply(blockPos)).getBlock();
    }

    private static IBlockState Method4085(BlockPos blockPos) {
        return AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private static IBlockState Method4086(List list, BlockPos blockPos) {
        if (list.contains(blockPos)) return Blocks.AIR.getDefaultState();
        return AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private void Method4087(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        if (!this.Field12349.Method365()) {
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982() instanceof SPacketDestroyEntities)) {
            return;
        }
        SPacketDestroyEntities sPacketDestroyEntities = (SPacketDestroyEntities)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982();
        int[] nArray = sPacketDestroyEntities.getEntityIDs();
        int n = nArray.length;
        for (int i = (int)-552057388L ^ 0xDF1845D4; i < n; ++i) {
            int n2 = nArray[i];
            AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(n2);
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
            return;
        }
        this.Method4055();
    }

    private void Method4088(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        if (!this.Field12352.Method365()) {
            return;
        }
        this.Method4066(new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method982()));
    }

    private void Method4089(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (this.Field12352.Method365()) {
            return;
        }
        this.Method4066(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
    }

    private void Method4090(qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62) {
        if (!this.Field12346.Method365()) {
            return;
        }
        if (this.Field12348.Method341() == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16549) {
            return;
        }
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV)this.Field12348.Method341();
        Entity entity = qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62.Method855();
        List list = ((AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm)this.Field12332.Method341()).Method6126();
        if (!this.Method4068(entity.getEntityBoundingBox(), list)) {
            return;
        }
        if (aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16551 || aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16549) {
            entity.setDead();
        }
        if (aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16550 || aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16552) {
            AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity(entity);
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
            return;
        }
        this.Method4055();
    }

    private void Method4091(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        List list;
        if (!this.Field12346.Method365()) {
            return;
        }
        if (!this.Field12347.Method365()) {
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSoundEffect)) {
            return;
        }
        SPacketSoundEffect sPacketSoundEffect = (SPacketSoundEffect)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (sPacketSoundEffect.getSound() != SoundEvents.ENTITY_GENERIC_EXPLODE) {
            return;
        }
        Vec3d vec3d = new Vec3d(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ());
        if (!this.Method4067(vec3d, list = ((AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm)this.Field12332.Method341()).Method6126())) {
            return;
        }
        if (this.Field12331.Method365()) {
            this.Method4056();
            return;
        }
        this.Method4055();
    }

    private static double Method4092(BlockPos blockPos) {
        return AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(0x3C61169C60C19EE4L ^ 0x381169C60C19EE4L), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble(0xBBC5F0860A79B229L ^ 0x8425F0860A79B229L));
    }

    private static IBlockState Method4093(BlockPos blockPos) {
        return AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private static IBlockState Method4094(BlockPos blockPos) {
        return AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private Boolean Method4095() {
        return this.Field12366.Method359().equals("Area");
    }

    private Boolean Method4096() {
        int n;
        if (this.Field12353.Method341() != AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field16504 && this.Field12353.Method341() != AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field16505) {
            n = (int)((long)1341875720 ^ (long)1341875720);
            return n != 0;
        }
        n = (int)((long)-135939628 ^ (long)-135939627);
        return n != 0;
    }

    private Boolean Method4097() {
        int n;
        if (this.Field12332.Method341() == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field15251) {
            n = (int)((long)1575978784 ^ (long)1575978785);
            return n != 0;
        }
        n = (int)((long)-1827434692 ^ (long)-1827434692);
        return n != 0;
    }

    private Boolean Method4098() {
        int n;
        if (this.Field12336.Method365() && this.Field12336.Method311()) {
            n = (int)-258492396L ^ 0xF097B815;
            return n != 0;
        }
        n = (int)((long)1309165721 ^ (long)1309165721);
        return n != 0;
    }

    private Boolean Method4099() {
        int n;
        if (this.Field12332.Method341() == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field15251) {
            n = (int)((long)-447250453 ^ (long)-447250454);
            return n != 0;
        }
        n = (int)1186306479L ^ 0x46B599AF;
        return n != 0;
    }

    private Boolean Method4100() {
        int n;
        if (this.Field12332.Method341() == AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field15251) {
            n = (int)((long)-901327411 ^ (long)-901327412);
            return n != 0;
        }
        n = (int)-1722392950L ^ 0x99565E8A;
        return n != 0;
    }

    static List Method4101(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA) {
        return aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4072();
    }

    static List Method4102(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA) {
        return aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method4082();
    }

    static qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4103(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA) {
        return aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12356;
    }

    static Minecraft Method4104() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4105() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4106(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA) {
        return aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12358;
    }

    static Minecraft Method4107() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4108() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4109() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4110(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA) {
        return aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12345;
    }

    static qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4111(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA) {
        return aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12342;
    }

    static Minecraft Method4112() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4113() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4114() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4115() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4116() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4117() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4118() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4119() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-468099703 ^ (long)-468099703);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-520044293 ^ (long)-520044540);
            int n2 = (int)1365827L ^ 0x14D73C;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1041642280 ^ (long)1041636055) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

