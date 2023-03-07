//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.network.play.server.SPacketSoundEffect
 *  net.minecraft.network.play.server.SPacketSpawnObject
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingUpdateEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.function.Supplier;
import lavahack.client.BzYXsCq10aZcNw2atZ2HaBcxYhX2Fc2L;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH;
import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG;
import lavahack.client.GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2;
import lavahack.client.H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb;
import lavahack.client.JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.RG0Ef4LzpvaRaWkCktLl94QMei9n80rd;
import lavahack.client.SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.TbArxPGFZfWuTZUxk7q9FqbgOes6a2Dw;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.Zhgf3QiCpopc7WZLbt543132rYDzfYwu;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$1;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.client.cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs;
import lavahack.client.dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP;
import lavahack.client.dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI;
import lavahack.client.h42E2uqXsP3s7infVMWIoGdBF977g5R8;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import lavahack.client.vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi;
import lavahack.client.wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
public class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14423 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Field12207));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14424 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Main", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14425 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ranges", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14426 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Calc", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14427 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Helpers", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14428 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14429 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Break", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14430 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14431 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14432 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Thread", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14433 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14434 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Optimization", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14435 = this.Method24(this.Field14434.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Multi Thread", this))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14436 = this.Method24(this.Field14435.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Getters", this))));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14437 = this.Method23(this.Field14436.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MT Sphere Getter", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1322319709 ^ (long)1322319709)).Method355("Sphere")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14438 = this.Method23(this.Field14436.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MT Target Getter", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-537011073 ^ (long)-537011073)).Method355("Target")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14439 = this.Method23(this.Field14436.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MT Crystal Getter", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1250010400 ^ (long)-1250010400)).Method355("Break Pos")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14440 = this.Method23(this.Field14435.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MT Extrapolation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)387836860 ^ (long)387836861)).Method355("Extrapolation")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14441 = this.Method23(this.Field14435.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MT CG Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1801805673 ^ 0x402E00006B655F69L), 0.0, Double.longBitsToDouble(0x4D8515835BA614BAL ^ 0xDDC15835BA614BAL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Delay")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14442 = this.Method23(this.Field14434.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Wall Range Usage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2069544700 ^ (long)2069544701))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14443 = this.Method24(this.Field14424.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Stages", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14444 = this.Method23(this.Field14443.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Calc Stage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field14028).Method355("Calc")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14445 = this.Method23(this.Field14443.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Logic Stage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field14028).Method355("Logic")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14446 = this.Method23(this.Field14424.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lag Protect", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)103860598 ^ (long)103860598))));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14447 = this.Method23(this.Field14425.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xEB75C7DA8C9AAD53L ^ 0xAB6DC7DA8C9AAD53L), 0.0, Double.longBitsToDouble(0xA3EC2BDB7BE9E5ADL ^ 0xE3F42BDB7BE9E5ADL), ((int)-2080848250L ^ 0x83F8C686) != 0).Method355("Place")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14448 = this.Method23(this.Field14425.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place Wall Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xEEDC8C7910479DC7L ^ 0xAECE8C7910479DC7L), 0.0, Double.longBitsToDouble((long)2045123838 ^ 0x4018000079E61CFEL), (boolean)((long)876883362 ^ (long)876883362)).Method355("Place Wall")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14449 = this.Method23(this.Field14425.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Break Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xEA435858C37F0F0EL ^ 0xAA5B5858C37F0F0EL), 0.0, Double.longBitsToDouble(0x15B76FED0E09D193L ^ 0x55AF6FED0E09D193L), ((int)-116813699L ^ 0xF909907D) != 0).Method355("Break")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14450 = this.Method23(this.Field14425.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Break Wall Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1338944155 ^ 0x401200004FCEAA9BL), 0.0, Double.longBitsToDouble(0x9C48D11BAA1B9A7L ^ 0x49DC8D11BAA1B9A7L), (boolean)((long)-95754644 ^ (long)-95754644)).Method355("Break Wall")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14451 = this.Method23(this.Field14425.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Target Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x54F4B2E9C02C014EL ^ 0x14D6B2E9C02C014EL), 0.0, Double.longBitsToDouble(0x551B71599909D5C2L ^ 0x152F71599909D5C2L), ((int)663144579L ^ 0x2786C883) != 0).Method355("Target")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14452 = this.Method23(this.Field14424.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro.Field15814)));
    public final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field14453 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Target Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, H8tTkhMasfwgvtiH0P7I7CTYG91Bc2kb.Field15929).Method5304(this.Field14424).Method5303();
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14454 = this.Method23(this.Field14424.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Terrain", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-11143423 ^ (long)-11143423))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14455 = this.Method23(this.Field14424.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr.Field8392)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14456 = this.Method23(this.Field14426.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fast Calc", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1029938075 ^ (long)-1029938076))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14457 = this.Method23(this.Field14426.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Heuristic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.Field15749)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14458 = this.Method23(this.Field14426.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Safety Balance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xD13E634218E81EC6L ^ 0x910A634218E81EC6L), ((int)-89219646L ^ 0xFAAE9DC2) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14459 = this.Method23(this.Field14426.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Safety Scale", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)-1241436729L ^ 0xB6012DC7) != 0)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14460 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14461 = this.Method23(this.Field14460.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Crystal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1254494953L ^ 0x4AC612E9) != 0).Method355("State")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14462 = this.Method23(this.Field14460.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Calc", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-168932655L ^ 0xF5EE4AD1) != 0).Method313(this.Field14461::Method365)).Method355("Calc"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14463 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timings", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.Field15185)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14464 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Advanced Sequential", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)996306625L ^ 0x3B626EC1) != 0).Method355("Advaned Seq")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14465 = this.Method23(this.Field14424.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field13628)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14466 = this.Method23(this.Field14424.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swing Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Field17518).Method313(this::Method5664)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14467 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1723623841L ^ 0x9943965E) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14468 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant Calc", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1018982387 ^ (long)-1018982388)).Method313(this.Field14467::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14469 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-947692787L ^ 0xC7835B0C) != 0).Method313(this.Field14467::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14470 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inhibit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)445572277L ^ 0x1A8EE4B5) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14471 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sound", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-405934385 ^ (long)-405934385))));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14472 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sync", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1220776709 ^ (long)-1220776709))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14473 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sync Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu.Field17836).Method355("Sync")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14474 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6.Field9926)));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field14475 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Rotate Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8498).Method5301(this::Method5663).Method5304(this.Field14427).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14476 = this.Method23(this.Field14427.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Calc Dist Sort", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1502894557 ^ (long)1502894557))));
    private final TbArxPGFZfWuTZUxk7q9FqbgOes6a2Dw Field14477 = ((TbArxPGFZfWuTZUxk7q9FqbgOes6a2Dw)new TbArxPGFZfWuTZUxk7q9FqbgOes6a2Dw(this).Method772(this.Field14427)).Method1330().Method1331();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14478 = this.Method23(this.Field14477.Method1328().Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage Sync Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10076).Method355("Place")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14479 = this.Method23(this.Field14477.Method1328().Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage Sync Break", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10076).Method355("Break")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14480 = this.Method23(this.Field14477.Method1328().Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage Sync Self", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)41328509L ^ 0x2769F7D) != 0).Method355("Self")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14481 = this.Method24(this.Field14427.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extrapolation", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14482 = this.Method23(this.Field14481.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extrapolation State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-959824301L ^ 0xC6CA3E53) != 0).Method355("State")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14483 = this.Method23(this.Field14481.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extrapolation Self", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)290591588L ^ 0x11521364) != 0).Method355("Self")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14484 = this.Method23(this.Field14481.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extrapolation Ticks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0xFA87445BF2B00DL ^ 0x40B387445BF2B00DL), ((int)-1257237437L ^ 0xB5101442) != 0).Method355("Ticks")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14485 = this.Method23(this.Field14481.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extrapolation Out Of Blocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)970756092 ^ (long)970756092)).Method355("Out Of Blocks")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14486 = this.Method23(this.Field14481.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extrapolation Shrink", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)825672101 ^ (long)825672101)).Method355("Shrink")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14487 = this.Method23(this.Field14481.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Extrapolation Render", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)245257695L ^ 0xE9E55DF) != 0).Method355("Render")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14488 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1540406217L ^ 0xA42F4436) != 0)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14489 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Second Check", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2049765707L ^ 0x7A2CF14B) != 0)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14490 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Third Check", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)430935637 ^ (long)430935637))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14491 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fourth Check", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1318976937 ^ (long)-1318976937))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14492 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Multi Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Field16121).Method355("Multi")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14493 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fire Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1769672013L ^ 0x9684F2B3) != 0).Method355("Fire")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14494 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)955422631 ^ (long)955422630)).Method355("Packet")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14495 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("1.13+ Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)29267173 ^ (long)29267173)).Method355("1.13+")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14496 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("1.13 Entities", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1882431139L ^ 0x8FCC615D) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14497 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Feet Replacer", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-39089386 ^ (long)-39089386))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14498 = this.Method24(this.Field14428.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Face", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14499 = this.Method23(this.Field14498.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Face Place", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field9479).Method355("Mode")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14500 = this.Method24(this.Field14498.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Triggers", this))));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14501 = this.Method24(this.Field14500.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Armor", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14502 = this.Method23(this.Field14501.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Armor Breaker State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-630197795L ^ 0xDA6FF1DD) != 0).Method355("State")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14503 = this.Method23(this.Field14501.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Armor Breaker", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xCDD2A2042E454B99L ^ 0x8D8BA2042E454B99L), 0.0, Double.longBitsToDouble(0x6D7C4752C1D8D580L ^ 0x2D254752C1D8D580L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9942).Method355("Value")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14504 = this.Method24(this.Field14500.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Damage", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14505 = this.Method23(this.Field14504.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Min Damage State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1840221157 ^ (long)-1840221157)).Method355("State")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14506 = this.Method23(this.Field14504.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Min Face Place DMG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)741554647 ^ 0x401C00002C3339D7L), 1.0, Double.longBitsToDouble(0xF7A176FB49486104L ^ 0xB7E3F6FB49486104L), ((int)-1280347823L ^ 0xB3AF7150) != 0).Method355("Min")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14507 = this.Method23(this.Field14428.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ray Trace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2046162278 ^ (long)2046162278))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14508 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Break", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1109948210L ^ 0x42287733) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14509 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Break Priority", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field8132).Method355("Priority").Method313(this.Field14508::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14510 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Friend", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w.Field7866).Method313(this.Field14508::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14511 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Client Side", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field14258).Method313(this.Field14508::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14512 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Client Side On", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field15744).Method313(this.Field14508::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14513 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Manual Breaker", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1716509985 ^ (long)1716509985)).Method355("Manual").Method313(this.Field14508::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14514 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Remove After Attack", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1881726199 ^ (long)1881726199)).Method313(this.Field14508::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14515 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Anti Cev Breaker", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8174).Method355("Anti Cev Break").Method313(this.Field14508::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14516 = this.Method23(this.Field14429.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet Break", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-575658694L ^ 0xDDB0253A) != 0).Method355("Packet").Method313(this.Field14508::Method365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14517 = this.Method23(this.Field14430.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field14066).Method355("Mode")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14518 = this.Method23(this.Field14430.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ping Smart Multi", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x3DCEDB7B0FD48C21L ^ 0x7DC6DB7B0FD48C21L), ((int)715648966L ^ 0x2AA7EFC6) != 0)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14519 = this.Method24(this.Field14430.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Default", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14520 = this.Method23(this.Field14519.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Place Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1492293898 ^ 0x409F400058F2990AL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Place")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14521 = this.Method23(this.Field14519.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Break Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)730179817 ^ 0x409F40002B85A8E9L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Break")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14522 = this.Method24(this.Field14430.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("From To", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14523 = this.Method23(this.Field14522.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("From Place To Break Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)165996328 ^ 0x4049000009E4E728L), 0.0, Double.longBitsToDouble((long)1745749499 ^ 0x409F4000680E05FBL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("From P To B")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14524 = this.Method23(this.Field14522.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("From Place To Break Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xED6D0D757BB8A03CL ^ 0xAD240D757BB8A03CL), 0.0, Double.longBitsToDouble((long)1512545435 ^ 0x409F40005A279C9BL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("From B To P")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14525 = this.Method23(this.Field14430.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Calc Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x75CB52089DF68C9L ^ 0x478F3D2089DF68C9L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Calc")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14526 = this.Method23(this.Field14430.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Clear Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1932355819 ^ 0x407F4000732D68EBL), 0.0, Double.longBitsToDouble(0x74613CA9DE4A5254L ^ 0x34FE7CA9DE4A5254L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Clear")));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field14527 = this.Method24(this.Field14430.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sequential", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14528 = this.Method23(this.Field14527.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sequential Break Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xB20DBFC7E6476813L ^ 0xF239BFC7E6476813L), ((int)1329194344L ^ 0x4F39E569) != 0).Method355("Break")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14529 = this.Method23(this.Field14430.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Multiplication", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble((long)286275506 ^ 0x40240000111037B2L), (boolean)((long)-1610750662 ^ (long)-1610750661)).Method355("Multi")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14530 = this.Method23(this.Field14431.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Min DMG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x8EA74CE67B08D518L ^ 0xCEBF4CE67B08D518L), 0.0, Double.longBitsToDouble(0x1D6A71BCAD18CDCDL ^ 0x5D28F1BCAD18CDCDL), ((int)-1329719435L ^ 0xB0BE1774) != 0).Method355("Min")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14531 = this.Method23(this.Field14431.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Max Self DMG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1418939140 ^ 0x4032000054934B04L), 0.0, Double.longBitsToDouble((long)1117540571 ^ 0x40428000429C50DBL), ((int)-1328212989L ^ 0xB0D51402) != 0).Method355("Max Self")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14532 = this.Method23(this.Field14431.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Max Friend DMG", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1850541711 ^ 0x402400006E4D068FL), 0.0, Double.longBitsToDouble(0xB6805D09234B1D45L ^ 0xF6C2DD09234B1D45L), ((int)1291257625L ^ 0x4CF70718) != 0).Method355("Max Friend")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14533 = this.Method23(this.Field14431.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lethal Mult", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1828070173 ^ 0x401800006CF6231DL), (boolean)((long)750410904 ^ (long)750410904))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14534 = this.Method23(this.Field14431.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Suicide", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1034364606 ^ (long)-1034364605))));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14535 = this.Method23(this.Field14432.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Thread Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.Field12586).Method355("Mode")));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14536 = this.Method23(this.Field14432.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Thread Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC77E830461F7143EL ^ 0x8737830461F7143EL), 1.0, Double.longBitsToDouble((long)367874217 ^ 0x408F400015ED50A9L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Delay").Method313(this::Method5662)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14537 = this.Method23(this.Field14432.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Thread Syns", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1672269128 ^ (long)-1672269127)).Method355("Sync").Method313(this::Method5661)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14538 = this.Method23(this.Field14432.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Thread Syns Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)982976691 ^ 0x408F40003A9708B3L), 1.0, Double.longBitsToDouble((long)982553255 ^ 0x40C388003A9092A7L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Sync Delay").Method313(this::Method5660)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14539 = this.Method23(this.Field14432.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Thread Packet Rots", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)705357937L ^ 0x2A0AE871) != 0).Method355("Rotations").Method313(this::Method5659)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14540 = this.Method23(this.Field14432.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Thread Sound Player", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1636857095 ^ 0x4018000061907507L), 0.0, Double.longBitsToDouble(0xB78A1A71703C12D4L ^ 0xF7A21A71703C12D4L), ((int)1175584107L ^ 0x4611FD6A) != 0).Method355("Sound Player").Method313(this::Method5658)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14541 = this.Method23(this.Field14432.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Thread Calc", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-718854496L ^ 0xD52726A1) != 0).Method355("Calc").Method313(this::Method5657)));
    private final cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Field14542 = new cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs(this).Method6046(this.Field14433).Method6042().Method6043();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14543 = this.Method23(this.Field14433.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Text", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-101514539L ^ 0xF9F302D4) != 0)));
    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD Field14544;
    public final List Field14545 = new ArrayList();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14546 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14547 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14548 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14549 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14550 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14551 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14552 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14553 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14554 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private ScheduledExecutorService Field14555;
    private final AtomicBoolean Field14556 = new AtomicBoolean(((int)1158613427L ^ 0x450F09B3) != 0);
    private final AtomicBoolean Field14557 = new AtomicBoolean(((int)-1915112100L ^ 0x8DD9B55C) != 0);
    @Zhgf3QiCpopc7WZLbt543132rYDzfYwu
    public static EntityPlayer Field14558;
    private Thread Field14559;
    public dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI Field14560 = new dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI(null, null, 0.0f, 0.0f, null, null, null);
    public dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI Field14561;
    private v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U Field14562 = new v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U(null, 0.0f, 0.0f, (boolean)((long)-1930401473 ^ (long)-1930401473));
    private Entity Field14563 = null;
    public boolean Field14564;
    private String Field14565 = this.Field14535.Method359();
    private boolean Field14566 = (int)406518217L ^ 0x183AF9C9;
    private BlockPos Field14567 = null;
    public final Supplier Field14568 = this::Method5656;
    private final vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi Field14569 = new vshPN0Zet2trEECZ8oUiA9u7vPR3nQoi(this.Field14441.Method395(), this.Field14440.Method397(), this.Field14484.Method392(), this.Field14485.Method397(), this.Field14486.Method397());
    private final BzYXsCq10aZcNw2atZ2HaBcxYhX2Fc2L Field14570 = new BzYXsCq10aZcNw2atZ2HaBcxYhX2Fc2L(this.Field14477.Method1329(), this::Method5655, this::Method5654);
    private final dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP Field14571 = new dLRp42sXVbFaJ5rZZSCKqqXbZCgvDQiP(this.Field14441.Method395(), this.Field14439.Method397());
    private final h42E2uqXsP3s7infVMWIoGdBF977g5R8 Field14572 = new h42E2uqXsP3s7infVMWIoGdBF977g5R8();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14573 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method5652, new Predicate[(int)((long)-1498075890 ^ (long)-1498075890)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14574 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method5651, new Predicate[(int)((long)1967813530 ^ (long)1967813530)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14575 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method5650, new Predicate[(int)((long)-395388264 ^ (long)-395388264)]);
    private String Field14576 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD() {
        super("AutoRer", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        super.Method44(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD::Method5653);
        Field14544 = this;
    }

    private void Method5587() {
        if (this.Field14551.Method2797(this.Field14526.Method369())) {
            this.Field14545.clear();
            this.Field14551.Method2801();
            this.Field14566 = (int)((long)-321132476 ^ (long)-321132475);
        }
        if (!this.Field14565.equalsIgnoreCase(this.Field14535.Method359())) {
            if (this.Field14555 != null) {
                this.Field14555.shutdown();
            }
            if (this.Field14559 != null) {
                this.Field14556.set((boolean)((long)782881867 ^ (long)782881866));
            }
            this.Field14565 = this.Field14535.Method359();
        }
        if (Field14558 == null) {
            this.Field14560.Method1204(null);
            this.Field14562 = null;
            return;
        }
        this.Method5615();
        this.Method5635();
    }

    private void Method5588() {
        if (!this.Field14488.Method365()) return;
        if (!this.Method5598((boolean)((long)1868956299 ^ (long)1868956299)).Method2797(this.Method5599((boolean)((long)-2056420386 ^ (long)-2056420386)))) return;
        if (this.Field14560.Method1203() == null) {
            if (this.Field14456.Method365()) return;
        }
        if (this.Method5621()) return;
        if (this.Field14560.Method1203() == null) return;
        if (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.OBSIDIAN)) {
            if (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.BEDROCK)) return;
        }
        if (this.Field14472.Method365()) {
            if (this.Field14545.contains(this.Field14560)) return;
        }
        if (!((Boolean)this.Field14570.Method7623(this.Field14560.Method1207(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Method5629(((int)-424560722L ^ 0xE6B1B7AE) != 0, null);
    }

    private void Method5589() {
        if (this.Field14562 == null) return;
        if (this.Field14463.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.Field15185) {
            if (this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) return;
        }
        if (!((Boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Method5637();
    }

    private void Method5590() {
        wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Field17021.Method6685().Method499();
        Field14558 = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Field17021.Method6685().Method496();
        if (this.Field14482.Method365()) {
            this.Field14569.Method5223();
        }
        if (this.Field14452.Method309("PlaceBreak")) {
            this.Method5588();
            this.Method5589();
            return;
        }
        this.Method5589();
        this.Method5588();
    }

    @Override
    public void Method38() {
        super.Method38();
        wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Field17021.Method6687();
        this.Method5591();
        if (!this.Field14535.Method309("None")) {
            this.Method5592();
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field14574);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field14575);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field14573);
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
        Field14558 = null;
        this.Field14564 = (int)((long)-1146474453 ^ (long)-1146474453);
        this.Field14561 = null;
        this.Field14566 = (int)((long)-933351395 ^ (long)-933351396);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field14574);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field14575);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field14573);
        if (this.Field14559 != null) {
            this.Field14556.set((boolean)((long)-1542668385 ^ (long)-1542668385));
        }
        if (this.Field14555 != null) {
            this.Field14555.shutdown();
        }
        this.Method5591();
    }

    private void Method5592() {
        if (this.Field14535.Method309("While")) {
            this.Method5594();
            return;
        }
        if (this.Field14535.Method309("None")) return;
        this.Method5596(((int)-1312556651L ^ 0xB1C3F995) != 0);
    }

    private ScheduledExecutorService Method5593() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Method2419(this), 0L, this.Field14536.Method369(), TimeUnit.MILLISECONDS);
        return scheduledExecutorService;
    }

    private void Method5594() {
        if (this.Field14559 != null && !this.Field14559.isInterrupted() && !this.Field14559.isAlive()) {
            if (!this.Field14554.Method2797(this.Field14538.Method369())) return;
            if (!this.Field14537.Method365()) return;
        }
        if (this.Field14559 == null) {
            this.Field14559 = this.Method5595();
        } else if (this.Field14554.Method2797(this.Field14538.Method369()) && !this.Field14556.get() && this.Field14537.Method365()) {
            this.Field14556.set((boolean)((long)1325732394 ^ (long)1325732395));
            this.Field14554.Method2801();
            return;
        }
        if (this.Field14559 != null && (this.Field14559.isInterrupted() || !this.Field14559.isAlive())) {
            this.Field14559 = this.Method5595();
        }
        if (this.Field14559 == null) return;
        if (!this.Field14559.getState().equals((Object)Thread.State.NEW)) return;
        this.Field14559.start();
        this.Field14554.Method2801();
    }

    private Thread Method5595() {
        Thread thread = new Thread(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Method2419(this));
        thread.setName("AutoReR-Thread-" + new AtomicLong(0L).getAndIncrement());
        return thread;
    }

    private void Method5596(boolean bl) {
        if (!(bl || this.Field14555 == null || this.Field14555.isTerminated() || this.Field14555.isShutdown())) {
            if (!this.Field14554.Method2797(this.Field14538.Method369())) return;
            if (!this.Field14537.Method365()) return;
        }
        if (this.Field14555 != null) {
            this.Field14555.shutdown();
        }
        this.Field14555 = this.Method5593();
        this.Field14554.Method2801();
    }

    @Override
    public void Method45() {
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isGamePaused) {
            return;
        }
        if (this.Field14444.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field14028) {
            this.Method5587();
        }
        if (this.Field14445.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field14028) {
            this.Method5590();
        }
        if (this.Field14565.equalsIgnoreCase(this.Field14535.Method359())) return;
        if (this.Field14555 != null) {
            this.Field14555.shutdown();
        }
        if (this.Field14559 != null) {
            this.Field14556.set(((int)308229601L ^ 0x125F35E0) != 0);
        }
        this.Field14565 = this.Field14535.Method359();
    }

    private IBlockState Method5597(BlockPos blockPos) {
        return b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos);
    }

    private IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Method5598(boolean bl) {
        IBONRcQCNUBg2NBpVpVQf61ykmVfU03E iBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
        if (bl) {
            if (this.Field14517.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field14066) {
                iBONRcQCNUBg2NBpVpVQf61ykmVfU03E = this.Field14547;
                return iBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
            }
            iBONRcQCNUBg2NBpVpVQf61ykmVfU03E = this.Field14548;
            return iBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
        }
        if (this.Field14517.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field14066) {
            iBONRcQCNUBg2NBpVpVQf61ykmVfU03E = this.Field14546;
            return iBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
        }
        iBONRcQCNUBg2NBpVpVQf61ykmVfU03E = this.Field14549;
        return iBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
    }

    private int Method5599(boolean bl) {
        int n;
        if (this.Field14518.Method335() == 0) {
            n = this.Method5600(bl);
            return n;
        }
        n = (int)((double)agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3700() * this.Field14518.Method367());
        return n;
    }

    private int Method5600(boolean bl) {
        int n;
        if (this.Field14517.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field14066) {
            if (bl) {
                n = this.Field14521.Method335();
                return n;
            }
            n = this.Field14520.Method335();
            return n;
        }
        if (bl) {
            n = this.Field14523.Method335();
            return n;
        }
        n = this.Field14524.Method335();
        return n;
    }

    public synchronized void Method20() {
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field14513.Method365()) {
            this.Method5601();
        }
        if (this.Field14456.Method365() && this.Field14550.Method2797(this.Field14525.Method369())) {
            this.Method5615();
            this.Field14550.Method2801();
        }
        if (this.Field14529.Method335() == ((int)-106960713L ^ 0xF99FE8B6)) {
            this.Method5602(null, (boolean)((long)-105536874 ^ (long)-105536873));
            return;
        }
        int n = (int)((long)557411055 ^ (long)557411055);
        while (n < this.Field14529.Method335()) {
            this.Method5602(null, ((int)-2017644596L ^ 0x87BD2FCD) != 0);
            ++n;
        }
    }

    private void Method5601() {
        RayTraceResult rayTraceResult = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver;
        if (!this.Field14553.Method2797(0xACF80E8L & 0x42009C9L)) return;
        if (!b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.isKeyDown()) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() == Items.GOLDEN_APPLE) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() == Items.BOW) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getCurrentItem().getItem() == Items.EXPERIENCE_BOTTLE) return;
        if (rayTraceResult == null) return;
        if (rayTraceResult.typeOfHit.equals((Object)RayTraceResult.Type.ENTITY) && rayTraceResult.entityHit instanceof EntityEnderCrystal) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(rayTraceResult.entityHit));
            this.Field14553.Method2801();
            return;
        }
        if (!rayTraceResult.typeOfHit.equals((Object)RayTraceResult.Type.BLOCK)) return;
        Iterator iterator = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(new BlockPos((double)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getX(), (double)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getY() + 1.0, (double)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos().getZ()))).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!(entity instanceof EntityEnderCrystal)) continue;
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
            this.Field14553.Method2801();
        }
    }

    private void Method5602(RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd, boolean bl) {
        if (this.Field14452.Method309("PlaceBreak")) {
            this.Method5623(rG0Ef4LzpvaRaWkCktLl94QMei9n80rd, bl);
            this.Method5636();
            return;
        }
        this.Method5636();
        this.Method5623(rG0Ef4LzpvaRaWkCktLl94QMei9n80rd, bl);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5603(LivingEvent.LivingUpdateEvent livingUpdateEvent) {
        if (this.Field14444.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field14027) {
            this.Method5587();
        }
        if (this.Field14445.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field14027) return;
        this.Method5590();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5604(RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field14444.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field14029) {
            this.Method5587();
        }
        if (this.Field14445.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field14029) {
            this.Method5590();
        }
        if (Field14558 != null && this.Field14482.Method365() && this.Field14487.Method365() && ((DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH)Field14558).Method2145() != null) {
            this.Field14542.Method3804(((DH1H695Ac7tbIgJH29mL6vYZdjYnf9BH)Field14558).Method2145().getEntityBoundingBox());
        }
        if (this.Field14560.Method1203() == null) return;
        this.Field14572.Method3000(this.Field14542.Field15093.Method368(), this.Field14542.Field15094.Method368(), this.Field14542.Field15095.Method368(), this.Field14542, this.Field14560, this.Field14543.Method365());
    }

    private void Method5605(int n) {
        int n2 = this.Field14469.Method365() && !this.Field14461.Method365() && (this.Field14474.Method309("Break") || this.Field14474.Method309("All")) ? (int)-988298433L ^ 0xC517C33E : (int)-807733463L ^ 0xCFDAF729;
        JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU = new JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU().Method7793();
        CPacketUseEntity cPacketUseEntity = new CPacketUseEntity();
        cPacketUseEntity.entityId = n;
        cPacketUseEntity.action = CPacketUseEntity.Action.ATTACK;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketUseEntity);
        this.Field14547.Method2801();
        this.Field14552.Method2801();
    }

    private void Method5606(int n) {
        Object[] objectArray = new Object[((int)-512620702L ^ 0xE1720763) << 1];
        Object[] objectArray2 = new Object[((int)1072544108L ^ 0x3FEDB96D) << 1];
        objectArray2[(int)((long)182720016 ^ (long)182720016)] = n;
        objectArray2[(int)56795595L ^ 0x362A1CA] = Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG.Field12640;
        objectArray[(int)1464145467L ^ 0x5745163B] = ((a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field14475.Method341()).Method931().Method1726(objectArray2);
        objectArray[(int)((long)1392416771 ^ (long)1392416770)] = ((int)1094658106L ^ 0x413F283A) != 0;
        ((a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field14475.Method341()).Method929().Method1726(objectArray);
    }

    private void Method5607(JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU) {
        Object[] objectArray = new Object[(int)((long)2024347308 ^ (long)2024347309) << 1];
        objectArray[(int)((long)-1112105151 ^ (long)-1112105151)] = jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
        objectArray[(int)((long)1607552486 ^ (long)1607552487)] = (boolean)((long)1078736077 ^ (long)1078736076);
        ((a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field14475.Method341()).Method930().Method1726(objectArray);
    }

    private BlockPos Method5608(int n, BlockPos blockPos) {
        if (this.Field14470.Method365()) {
            this.Field14563 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(n);
        }
        if (this.Field14466.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Field17518) {
            this.Method5643();
        }
        this.Method5605(n);
        if (this.Field14466.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Field17519) {
            this.Method5643();
        }
        this.Field14566 = (int)((long)-827322398 ^ (long)-827322397);
        if (this.Field14473.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu.Field17837) return blockPos;
        this.Method5598((boolean)((long)-1088961371 ^ (long)-1088961371)).Method2801();
        return blockPos;
    }

    private float Method5609(double d, double d2, double d3, EntityPlayer entityPlayer) {
        AxisAlignedBB axisAlignedBB = this.Field14482.Method365() && (entityPlayer != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player || this.Field14483.Method365()) ? this.Field14569.Method5225(entityPlayer).getEntityBoundingBox() : entityPlayer.getEntityBoundingBox();
        return vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7763((World)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, d, d2, d3, (Entity)entityPlayer, axisAlignedBB, (int)552285837L ^ 0x20EB368D, this.Field14454.Method365());
    }

    private float Method5610(BlockPos blockPos, EntityPlayer entityPlayer) {
        return this.Method5609(blockPos.getX(), blockPos.getY(), blockPos.getZ(), entityPlayer);
    }

    private boolean Method5611(EntityPlayer entityPlayer) {
        BlockPos blockPos = oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3015((Entity)entityPlayer);
        int n = (int)((long)1686647746 ^ (long)1686647746);
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n2 = enumFacingArray.length;
        int n3 = (int)((long)-619399487 ^ (long)-619399487);
        while (true) {
            if (n3 >= n2) {
                int cfr_ignored_0 = (int)((long)-1674899816 ^ (long)-1674899813);
                return ((int)553579839L ^ 0x20FEF53F) != 0;
            }
            EnumFacing enumFacing = enumFacingArray[n3];
            if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.offset(enumFacing)).getBlock() != Blocks.AIR) {
                ++n;
            }
            ++n3;
        }
    }

    public boolean Method5612(List list, BlockPos blockPos) {
        EntityPlayer entityPlayer;
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return (int)((long)1234430772 ^ (long)1234430772) != 0;
        } while (n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3042(entityPlayer = (EntityPlayer)iterator.next()) || entityPlayer == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player || !this.Method5613(entityPlayer, blockPos));
        return ((int)1041356113L ^ 0x3E11D550) != 0;
    }

    public boolean Method5613(EntityPlayer entityPlayer, BlockPos blockPos) {
        BlockPos blockPos2 = blockPos.up();
        if (!this.Method5618(blockPos, this.Field14489.Method365(), ((int)1180643007L ^ 0x465F2EBF) != 0, this.Method27(), this.Field14493.Method365(), this.Field14495.Method365(), this.Field14496.Method365())) {
            return (int)((long)1818717952 ^ (long)1818717952) != 0;
        }
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = (int)477860668L ^ 0x1C7B933C;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(blockPos2.offset(enumFacing))).contains(entityPlayer)) return (int)((long)-1984381606 ^ (long)-1984381605) != 0;
            if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB(blockPos2.offset(enumFacing).offset(enumFacing))).contains(entityPlayer)) {
                return (int)((long)-1984381606 ^ (long)-1984381605) != 0;
            }
            ++n2;
        }
        return ((int)993741276L ^ 0x3B3B49DC) != 0;
    }

    private boolean Method5614() {
        int n;
        if (!vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isCallingFromMinecraftThread() && this.Field14557.get()) {
            n = (int)((long)877053676 ^ (long)877053676);
            return n != 0;
        }
        n = (int)1837018149L ^ 0x6D7EAC24;
        return n != 0;
    }

    private void Method5615() {
        this.Method5619();
        if (this.Field14560.Method1203() == null && GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2.Field12832.Method27()) {
            this.Field14560.Method1204(GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2.Field12832.Method4368());
            return;
        }
        GSIRnUIvbcRqoFPctaaGHSk8wVJqzdl2.Field12832.Method4370(((int)-2041898284L ^ 0x864B1AD4) != 0);
    }

    public boolean Method27() {
        int n;
        if (this.Field14492.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Field16121 && (this.Field14492.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Field16122 || this.Method5616())) {
            n = (int)-1556746368L ^ 0xA335EF81;
            return n != 0;
        }
        n = (int)((long)-798069436 ^ (long)-798069436);
        return n != 0;
    }

    public boolean Method28() {
        int n;
        if (this.Field14499.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field9479 && (this.Field14499.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field9480 || this.Method5616())) {
            n = (int)((long)653945874 ^ (long)653945875);
            return n != 0;
        }
        n = (int)1610264529L ^ 0x5FFAAFD1;
        return n != 0;
    }

    private boolean Method5616() {
        int n;
        if (Field14558 != null && (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14558.moveForward != 0.0f || b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14558.moveStrafing != 0.0f)) {
            n = (int)((long)1578278312 ^ (long)1578278313);
            return n != 0;
        }
        n = (int)((long)-1264596752 ^ (long)-1264596752);
        return n != 0;
    }

    public boolean Method5617(float f) {
        int n;
        if (this.Field14505.Method365() && f <= (float)this.Field14506.Method335()) {
            n = (int)-1172498839L ^ 0xBA1D1668;
            return n != 0;
        }
        n = (int)((long)888926279 ^ (long)888926279);
        return n != 0;
    }

    public boolean Method29() {
        int n;
        if (this.Field14502.Method365() && lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method137(Field14558, this.Field14503.Method335())) {
            n = (int)((long)1889240958 ^ (long)1889240959);
            return n != 0;
        }
        n = (int)((long)1814633995 ^ (long)1814633995);
        return n != 0;
    }

    private boolean Method5618(BlockPos blockPos, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        int n;
        if (!b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK)) {
            if (!b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN)) return (int)((long)155111476 ^ (long)155111476) != 0;
        }
        if (!b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)-637438115L ^ 0xDA01775D, (int)((long)1818676587 ^ (long)1818676586), (int)((long)-1424295549 ^ (long)-1424295549))).getBlock().equals(Blocks.AIR)) {
            if (!bl4) return (int)((long)1599665558 ^ (long)1599665558) != 0;
            if (!b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)((long)905378152 ^ (long)905378152), (int)1979022598L ^ 0x75F57D07, (int)-531978268L ^ 0xE04AA7E4)).getBlock().equals(Blocks.FIRE)) {
                return (int)((long)1599665558 ^ (long)1599665558) != 0;
            }
        }
        if (!bl5 && !b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add((int)972970090L ^ 0x39FE586A, ((int)2125947503L ^ 0x7EB7626E) << 1, (int)((long)1445724017 ^ (long)1445724017))).getBlock().equals(Blocks.AIR)) {
            return ((int)606693797L ^ 0x242969A5) != 0;
        }
        BlockPos blockPos2 = blockPos.add((int)1474771958L ^ 0x57E73BF6, (int)((long)-1220397049 ^ (long)-1220397050), (int)((long)-424342549 ^ (long)-424342549));
        if (bl2 && b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB((double)blockPos2.getX(), (double)blockPos2.getY(), (double)blockPos2.getZ(), (double)(blockPos2.getX() + (int)((long)1804734616 ^ (long)1804734617)), (double)(blockPos2.getY() + (bl6 ? (int)((long)-1510231752 ^ (long)-1510231752) : (bl ? ((int)-1715226206L ^ 0x99C3B9A3) << 1 : (int)((long)227872466 ^ (long)227872467)))), (double)(blockPos2.getZ() + ((int)-1848886822L ^ 0x91CC39DB))), arg_0 -> b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Method5649(bl3, arg_0)).size() != 0) {
            n = (int)577380026L ^ 0x226A1EBA;
            return n != 0;
        }
        n = (int)1432389578L ^ 0x556087CB;
        return n != 0;
    }

    private void Method5619() {
        double d = Double.longBitsToDouble((long)1572681971 ^ 0x3FE000005DBD38F3L);
        double d2 = 0.0;
        BlockPos blockPos = null;
        List list = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7758(this.Field14447.Method368(), ((int)947603158L ^ 0x387B46D7) != 0, ((int)-542642581L ^ 0xDFA7EE6B) != 0);
        if (this.Field14476.Method365()) {
            Collections.sort(list);
            Collections.reverse(list);
        }
        int n = list.size();
        int n2 = (int)1531436233L ^ 0x5B47DCC9;
        while (true) {
            if (n2 >= n) {
                this.Field14560 = new dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI((EntityLivingBase)Field14558, blockPos, (float)d2, (float)d, null, null, null);
                return;
            }
            BlockPos blockPos2 = (BlockPos)list.get(n2);
            if ((!this.Field14490.Method365() || this.Method5622(blockPos2)) && this.Method5618(blockPos2, this.Field14489.Method365(), ((int)1937491387L ^ 0x737BC5BA) != 0, this.Method27(), this.Field14493.Method365(), this.Field14495.Method365(), this.Field14496.Method365())) {
                float f = this.Method5609((double)blockPos2.getX() + Double.longBitsToDouble(0x42898781C484492DL ^ 0x7D698781C484492DL), blockPos2.getY() + ((int)1739901384L ^ 0x67B4C9C9), (double)blockPos2.getZ() + Double.longBitsToDouble(0xB164A7106EA398D8L ^ 0x8E84A7106EA398D8L), Field14558);
                SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr = this.Field14570.Method7623(f, (Entity)Field14558);
                if (this.Field14478.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10078) {
                    f = ((Float)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6308()).floatValue();
                }
                if (((Boolean)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).booleanValue() && (this.Method28() && (this.Method5617(f) || this.Method29()) || f > (float)this.Field14530.Method335() || (double)f * this.Field14533.Method367() > (double)(Field14558.getHealth() + Field14558.getAbsorptionAmount()))) {
                    float f2 = this.Method5609((double)blockPos2.getX() + Double.longBitsToDouble(0xEC7BB92CBFAA2F1FL ^ 0xD39BB92CBFAA2F1FL), blockPos2.getY() + (int)((long)67252402 ^ (long)67252403), (double)blockPos2.getZ() + Double.longBitsToDouble(0xCF6F3AA2C1DE2629L ^ 0xF08F3AA2C1DE2629L), (EntityPlayer)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2 = this.Field14570.Method7623(f, (Entity)Field14558);
                    if (this.Field14478.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10078 && this.Field14480.Method365()) {
                        f2 = ((Float)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6308()).floatValue();
                    }
                    if (((Boolean)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6307()).booleanValue() && f2 <= (float)this.Field14531.Method335() && (f2 + 2.0f < b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() || !this.Field14534.Method365()) && f2 < f && d <= (double)(f = this.Method5620(f, f2))) {
                        d = f;
                        d2 = f2;
                        blockPos = blockPos2;
                    }
                }
            }
            ++n2;
        }
    }

    private float Method5620(float f, float f2) {
        switch (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$1.Field16113[((b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r)this.Field14457.Method341()).ordinal()]) {
            case 1: {
                return f;
            }
            case 2: {
                return f - f2;
            }
            case 3: {
                return f * this.Field14459.Method368() - this.Field14458.Method368();
            }
        }
        return f;
    }

    private boolean Method5621() {
        int n;
        if (this.Field14473.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu.Field17839 && !this.Field14566) {
            n = (int)((long)1370368984 ^ (long)1370368985);
            return n != 0;
        }
        n = (int)((long)-1855625278 ^ (long)-1855625278);
        return n != 0;
    }

    public boolean Method5622(BlockPos blockPos) {
        boolean bl;
        double d2 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble((long)1594660155 ^ 0x3FE000005F0C953BL), (double)blockPos.getY(), (double)blockPos.getZ() + Double.longBitsToDouble((long)425215601 ^ 0x3FE0000019584671L));
        d2 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(blockPos) ? this.Field14447.Method367() : this.Field14448.Method367();
        if (d <= d2) {
            bl = (int)-421564402L ^ 0xE6DF700F;
            return bl;
        }
        bl = (int)-2114419204L ^ 0x81F885FC;
        return bl;
    }

    private void Method5623(RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd, boolean bl) {
        if (!this.Field14488.Method365()) return;
        if (!this.Method5598((boolean)((long)-911159654 ^ (long)-911159654)).Method2797(this.Method5599((boolean)((long)1766305130 ^ (long)1766305130)))) return;
        if (this.Field14560.Method1203() == null) {
            if (this.Field14456.Method365()) return;
        }
        if (this.Method5621()) {
            return;
        }
        if (!this.Field14456.Method365() || bl && this.Field14541.Method365()) {
            this.Method5615();
        }
        if (this.Field14560.Method1203() == null) return;
        if (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.OBSIDIAN)) {
            if (!this.Method5597(this.Field14560.Method1203()).getBlock().equals(Blocks.BEDROCK)) return;
        }
        if (this.Field14472.Method365()) {
            if (this.Field14545.contains(this.Field14560)) return;
        }
        if (!((Boolean)this.Field14570.Method7623(this.Field14560.Method1207(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Method5629(bl, rG0Ef4LzpvaRaWkCktLl94QMei9n80rd);
    }

    private void Method5624() {
        if (this.Field14512.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field15745) return;
        if (this.Field14563 == null) return;
        this.Method5642(this.Field14563);
    }

    /*
     * Exception decompiling
     */
    private int[] Method5625(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getInt(SwitchStringRewriter.java:417)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$700(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
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

    private void Method5626(int n) {
        if (n == ((int)-769529583L ^ 0x2DDE16EE)) return;
        if (!this.Field14455.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr.Field8394.name())) return;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n, (boolean)((long)-1598458209 ^ (long)-1598458210));
    }

    private JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU Method5627(boolean bl, RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd) {
        JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU = new JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU().Method7793();
        if (!this.Field14474.Method309("Place")) {
            if (!this.Field14474.Method309("All")) return jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
        }
        Object[] objectArray = new Object[(int)((long)1071285233 ^ (long)1071285232)];
        objectArray[(int)-1125761309L ^ 0xBCE63EE3] = this.Field14560.Method1203();
        float[] fArray = (float[])((a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field14475.Method341()).Method932().Method1726(objectArray);
        if (bl) {
            if (!this.Field14539.Method365()) return jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[(int)((long)1000937220 ^ (long)1000937220)], fArray[(int)((long)-284118767 ^ (long)-284118768)], b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            return jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
        }
        if (!this.Field14461.Method365()) {
            Object[] objectArray2 = new Object[(int)((long)1850456502 ^ (long)1850456503) << 1];
            objectArray2[(int)((long)-1762021029 ^ (long)-1762021029)] = fArray;
            objectArray2[(int)-1093552971L ^ 0xBED1B4B4] = ((int)2121242956L ^ 0x7E6F994C) != 0;
            ((a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field14475.Method341()).Method929().Method1726(objectArray2);
            return jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
        }
        if (rG0Ef4LzpvaRaWkCktLl94QMei9n80rd == null) return jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
        rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method1734(fArray[(int)((long)-485911572 ^ (long)-485911572)]);
        rG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Method1736(fArray[(int)1409649113L ^ 0x540589D8]);
        return jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
    }

    private void Method5628(JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU) {
        if (!this.Field14474.Method309("Place")) {
            if (!this.Field14474.Method309("All")) return;
        }
        this.Method5607(jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU);
    }

    private void Method5629(boolean bl, RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd) {
        JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
        this.Method5624();
        EnumHand enumHand = null;
        boolean bl2 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem().equals(Items.END_CRYSTAL);
        int[] nArray = this.Method5625(bl2);
        if (nArray[(int)-507194699L ^ 0xE1C4D2B4] == ((int)1564736925L ^ 0x5D43FD9C)) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() != Items.END_CRYSTAL && b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL) {
            return;
        }
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) {
            enumHand = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand();
        }
        EnumFacing enumFacing = EnumFacing.UP;
        if (this.Field14507.Method365()) {
            jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU = null;
            jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(new Vec3d(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEyeHeight(), b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), new Vec3d((double)this.Field14560.Method1203().getX() + Double.longBitsToDouble((long)962095817 ^ 0x3FE0000039586AC9L), (double)this.Field14560.Method1203().getY() - Double.longBitsToDouble((long)1064186200 ^ 0x3FE000003F6E3158L), (double)this.Field14560.Method1203().getZ() + Double.longBitsToDouble((long)351840406 ^ 0x3FE0000014F8A896L)));
            enumFacing = jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU == null || ((RayTraceResult)jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU).sideHit == null ? EnumFacing.UP : ((RayTraceResult)jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU).sideHit;
        }
        jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU = this.Method5627(bl, rG0Ef4LzpvaRaWkCktLl94QMei9n80rd);
        this.Method5630(enumFacing, bl2);
        this.Method5628(jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU);
        this.Method5626(nArray[(int)((long)1269922704 ^ (long)1269922704)]);
        if (enumHand == null) return;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setActiveHand(enumHand);
    }

    private void Method5630(EnumFacing enumFacing, boolean bl) {
        if (this.Field14560.Method1203() == null) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection == null) return;
        if (this.Field14466.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Field17518) {
            this.Method5643();
        }
        if (this.Field14494.Method365() && b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection != null) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(this.Field14560.Method1203(), enumFacing, this.Method5631(bl), 0.0f, 0.0f, 0.0f));
        } else {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Field14560.Method1203(), enumFacing, new Vec3d(0.0, 0.0, 0.0), this.Method5631(bl));
        }
        if (this.Field14466.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Field17519) {
            this.Method5643();
        }
        this.Field14566 = (int)-1634636534L ^ 0x9E916D0A;
        this.Method5598(((int)1660381335L ^ 0x62F76897) != 0).Method2801();
    }

    private EnumHand Method5631(boolean bl) {
        EnumHand enumHand;
        if (bl) {
            enumHand = EnumHand.OFF_HAND;
            return enumHand;
        }
        enumHand = EnumHand.MAIN_HAND;
        return enumHand;
    }

    private v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U Method5632() {
        Entity entity = null;
        if (!this.Field14515.Method309("None")) {
            BlockPos blockPos;
            if (this.Field14515.Method309("Cev") || this.Field14515.Method309("Both")) {
                for (Vec3i vec3i : b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14352.Field14354) {
                    blockPos = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().add(vec3i);
                    for (Entity entity2 : b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos))) {
                        if (!(entity2 instanceof EntityEnderCrystal)) continue;
                        entity = entity2;
                    }
                }
            }
            if (this.Field14515.Method309("Civ") || this.Field14515.Method309("Both")) {
                for (Vec3i vec3i : b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field14353.Field14354) {
                    blockPos = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().add(vec3i);
                    for (Entity entity2 : b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos))) {
                        if (!(entity2 instanceof EntityEnderCrystal)) continue;
                        entity = entity2;
                    }
                }
            }
        }
        if (entity == null) return null;
        v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U2 = new v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U((EntityEnderCrystal)entity, 0.0f, 0.0f, (boolean)((long)-982701066 ^ (long)-982701065));
        return v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U2;
    }

    private v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U Method5633() {
        if (Field14558 == null) {
            return null;
        }
        Entity entity = null;
        float f = Float.intBitsToFloat((int)((long)1786227613 ^ (long)1433906077));
        float f2 = Float.intBitsToFloat((int)((long)1233010269 ^ (long)1987984989));
        for (Entity entity2 : b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            if (!(entity2 instanceof EntityEnderCrystal) || this.Field14464.Method365() && this.Field14463.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.Field15184 && entity2.ticksExisted < this.Field14528.Method335()) continue;
            double d = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity2);
            double d2 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen(entity2) ? this.Field14449.Method367() : this.Field14450.Method367();
            if (!(d < d2)) continue;
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = this.Method5644(entity2);
            float f3 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity2.posX, entity2.posY, entity2.posZ, (Entity)Field14558, this.Field14454.Method365());
            SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr = this.Field14570.Method7623(f3, (Entity)Field14558);
            if (this.Field14479.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10078) {
                f3 = ((Float)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6308()).floatValue();
            }
            if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG != null && !this.Field14510.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w.Field7864.name())) {
                if (this.Field14510.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w.Field7866.name()) && b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Field13740) {
                    return null;
                }
                if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Field13741) {
                    return null;
                }
                if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Field13739 >= (double)this.Field14532.Method335()) {
                    return null;
                }
            }
            if (!((Boolean)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307()).booleanValue() || !(f3 > (float)this.Field14530.Method335()) && !((double)f3 * this.Field14533.Method367() > (double)(Field14558.getHealth() + Field14558.getAbsorptionAmount())) && !lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method137(Field14558, this.Field14503.Method335())) continue;
            float f4 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity2.posX, entity2.posY, entity2.posZ, (Entity)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14454.Method365());
            SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2 = this.Field14570.Method7623(f3, (Entity)Field14558);
            if (this.Field14479.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10078 && this.Field14480.Method365()) {
                f4 = ((Float)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6308()).floatValue();
            }
            if (!((Boolean)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6307()).booleanValue() || !(f4 <= (float)this.Field14531.Method335()) || !(f4 + 2.0f <= b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) || !(f4 < f3) || !(f <= f3)) continue;
            f = f3;
            f2 = f4;
            entity = entity2;
        }
        if (entity == null) {
            return null;
        }
        v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U2 = new v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U((EntityEnderCrystal)entity, f2, f, ((int)299388842L ^ 0x11D84FAA) != 0);
        return v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U2;
    }

    private boolean Method5634() {
        int n;
        if ((this.Field14473.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu.Field17838 || this.Field14473.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu.Field17839) && this.Field14566) {
            n = (int)((long)-839807 ^ (long)-839808);
            return n != 0;
        }
        n = (int)1466563726L ^ 0x5769FC8E;
        return n != 0;
    }

    private boolean Method5635() {
        v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U2;
        if (!this.Field14508.Method365()) return (int)((long)-241789323 ^ (long)-241789324) != 0;
        if (!this.Method5598(((int)-275014400L ^ 0xEF9B9D01) != 0).Method2797(this.Method5599((boolean)((long)-948568749 ^ (long)-948568750)))) return (int)((long)-241789323 ^ (long)-241789324) != 0;
        if (this.Method5634()) {
            return (int)((long)-241789323 ^ (long)-241789324) != 0;
        }
        if (((Boolean)this.Field14571.Method2363().get()).booleanValue()) {
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            this.Field14571.Method2361(() -> this.Method5647(atomicReference2));
            if (this.Field14509.Method309("Damage")) {
                atomicReference.set(atomicReference2.get());
            } else {
                this.Field14571.Method2361(() -> this.Method5645(atomicReference));
                atomicReference.set(this.Method5632());
                if (atomicReference.get() == null) {
                    atomicReference.set(atomicReference2.get());
                }
            }
            v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U2 = (v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U)atomicReference.get();
        } else {
            v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U3;
            v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U4 = this.Method5633();
            if (this.Field14509.Method309("Damage")) {
                v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U3 = v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U4;
            } else {
                v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U3 = this.Method5632();
                if (v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U3 == null) {
                    v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U3 = v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U4;
                }
            }
            v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U2 = v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U3;
        }
        this.Field14562 = v6ecTd9knXF4QwbpFDnI4mN2hv9H9n2U2;
        return ((int)-1434388516L ^ 0xAA80F7DC) != 0;
    }

    private void Method5636() {
        if (this.Method5635()) {
            return;
        }
        if (this.Field14562 == null) return;
        if (this.Field14463.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.Field15185) {
            if (this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) return;
        }
        if (!((Boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Method5637();
    }

    private void Method5637() {
        JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU = this.Method5638();
        this.Method5639();
        this.Method5640(jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU);
        this.Method5641();
    }

    private JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU Method5638() {
        JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU = new JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU().Method7793();
        if (!this.Field14474.Method309("Break")) {
            if (!this.Field14474.Method309("All")) return jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
        }
        this.Method5606(this.Field14562.Method3691().getEntityId());
        return jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU;
    }

    private void Method5639() {
        if (this.Field14562 == null) return;
        if (this.Field14562.Method3691() == null) return;
        if (this.Field14463.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.Field15185) {
            if (this.Field14562.Method3691().ticksExisted < this.Field14528.Method335()) return;
        }
        if (!((Boolean)this.Field14570.Method7624(this.Field14562.Method3695(), (Entity)Field14558).Method6307()).booleanValue()) {
            return;
        }
        this.Field14563 = this.Field14562.Method3691();
        if (this.Field14466.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Field17518) {
            this.Method5643();
        }
        if (this.Field14516.Method365()) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)this.Field14562.Method3691()));
        } else {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)this.Field14562.Method3691());
        }
        if (this.Field14466.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea.Field17519) {
            this.Method5643();
        }
        if (this.Field14512.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field15744) {
            this.Method5642((Entity)this.Field14562.Method3691());
            if (this.Field14511.Method365()) {
                b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(this.Field14562.Method3691().entityId);
            }
        }
        this.Method5598((boolean)((long)1154426117 ^ (long)1154426116)).Method2801();
        this.Field14566 = (int)-1440836675L ^ 0xAA1E93BC;
    }

    private void Method5640(JfOy1lP2UqL88yBXCMNp0lo8w80UjXTU jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU) {
        if (!this.Field14474.Method309("Break")) {
            if (!this.Field14474.Method309("All")) return;
        }
        this.Method5607(jfOy1lP2UqL88yBXCMNp0lo8w80UjXTU);
    }

    private void Method5641() {
        if (!this.Field14472.Method365()) return;
        BlockPos blockPos = null;
        int n = (int)((long)1512355769 ^ (long)1512355769);
        while (true) {
            if (n >= this.Field14545.size()) {
                if (blockPos == null) return;
                this.Field14545.remove(dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI.Field8894.Method6018(this.Field14545, blockPos));
                return;
            }
            if (((dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI)this.Field14545.get(n)).Method1203() != null && this.Field14562.Method3691().getDistanceSq(((dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI)this.Field14545.get(n)).Method1203()) <= Double.longBitsToDouble(0xFD35CAB9711F5E6EL ^ 0xBD17CAB9711F5E6EL)) {
                blockPos = ((dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI)this.Field14545.get(n)).Method1203();
            }
            ++n;
        }
    }

    private void Method5642(Entity entity) {
        if (this.Field14511.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field14259 || this.Field14511.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field14261) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(entity.entityId);
            return;
        }
        if (this.Field14511.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field14260) {
            if (this.Field14511.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field14261) return;
        }
        entity.setDead();
    }

    private void Method5643() {
        if (this.Field14465.Method310(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field13629)) {
            return;
        }
        if (this.Field14465.Method310(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field13628)) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(this.Field14465.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field13625.name()) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND));
            return;
        }
        if (this.Field14465.Method310(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field13627)) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND);
            return;
        }
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(this.Field14465.Method310(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field13625) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND);
    }

    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG Method5644(Entity entity) {
        ArrayList<b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG> arrayList = new ArrayList<b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG>();
        for (EntityPlayer entityPlayer : b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities) {
            double d;
            if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == entityPlayer || !n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3042(entityPlayer) || !((d = (double)vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX, entity.posY, entity.posZ, (Entity)Field14558, this.Field14454.Method365())) <= (double)this.Field14532.Method335()) && !(d * this.Field14533.Method367() >= (double)(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()))) continue;
            arrayList.add(new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG(entityPlayer, d, (d * this.Field14533.Method367() >= (double)(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()) ? (int)((long)-1451347839 ^ (long)-1451347840) : (int)-1496516799L ^ 0xA6CCF741) != 0));
        }
        Object object = null;
        double d = Double.longBitsToDouble(0x321789650F790B50L ^ 0xDF789650F790B50L);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG)iterator.next();
            double d2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entity.posX, entity.posY, entity.posZ, (Entity)Field14558, this.Field14454.Method365());
            if (!(d2 > d)) continue;
            d = d2;
            object = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.Field13738, d2);
        }
        return object;
    }

    private void Method5645(AtomicReference atomicReference) {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method5646(atomicReference));
    }

    private void Method5646(AtomicReference atomicReference) {
        atomicReference.set(this.Method5632());
    }

    private void Method5647(AtomicReference atomicReference) {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method5648(atomicReference));
    }

    private void Method5648(AtomicReference atomicReference) {
        atomicReference.set(this.Method5633());
    }

    private static boolean Method5649(boolean bl, Entity entity) {
        int n;
        if (entity instanceof EntityEnderCrystal && !bl) {
            n = (int)34032754L ^ 0x2074C72;
            return n != 0;
        }
        n = (int)((long)-1754745910 ^ (long)-1754745909);
        return n != 0;
    }

    private void Method5650(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        Object object;
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayerTryUseItemOnBlock && b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItem(((CPacketPlayerTryUseItemOnBlock)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982()).getHand()).getItem() == Items.END_CRYSTAL) {
            if (this.Field14491.Method365() && !this.Method5622(((CPacketPlayerTryUseItemOnBlock)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982()).getPos())) {
                tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
                return;
            }
            object = wxL8fG9UatZmfed8YxL8UoB2fZIxRH8L.Field17021.Method6690(((CPacketPlayerTryUseItemOnBlock)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982()).getPos(), (EntityLivingBase)Field14558, this.Field14454.Method365());
            this.Field14545.add(object);
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketUseEntity)) return;
        object = (CPacketUseEntity)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982();
        Entity entity = object.getEntityFromWorld((World)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        if (!object.getAction().equals((Object)CPacketUseEntity.Action.ATTACK)) return;
        if (!(entity instanceof EntityEnderCrystal)) return;
        if (this.Field14497.Method365() && Field14558 != null && this.Method5611(Field14558) && this.Method5613(Field14558, entity.getPosition().down())) {
            this.Field14560.Method1204(entity.getPosition().down());
            this.Method5629((boolean)((long)1448231553 ^ (long)1448231553), null);
        }
        if (!this.Field14514.Method365()) return;
        Objects.requireNonNull(entity).setDead();
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityFromWorld(object.entityId);
    }

    private void Method5651(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        SPacketSpawnObject sPacketSpawnObject;
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSpawnObject && this.Field14467.Method365() && (sPacketSpawnObject = (SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getType() == (int)((long)-24807887 ^ (long)-24807934)) {
            if (!(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(sPacketSpawnObject.getEntityID()) instanceof EntityEnderCrystal)) {
                return;
            }
            BlockPos blockPos = null;
            Iterator iterator = this.Field14545.iterator();
            if (iterator.hasNext()) {
                dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI2 = (dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI)iterator.next();
                BlockPos blockPos2 = dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI2.Method1203();
                boolean bl = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(blockPos2);
                if (!(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos2.getX() + Double.longBitsToDouble((long)2140427329 ^ 0x3FE000007F945441L), (double)blockPos2.getY(), (double)blockPos2.getZ() + Double.longBitsToDouble((long)1381635067 ^ 0x3FE00000525A13FBL)) >= (bl ? this.Field14449.Method367() : this.Field14450.Method367()))) {
                    if (this.Field14468.Method365() && Field14558 != null) {
                        float f;
                        float f2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7761(blockPos2, (Entity)Field14558, this.Field14454.Method365());
                        if ((f2 > (float)this.Field14530.Method335() || (double)f2 * this.Field14533.Method367() > (double)(Field14558.getHealth() + Field14558.getAbsorptionAmount()) || lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method137(Field14558, this.Field14503.Method335())) && (f = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7761(blockPos2, (Entity)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14454.Method365())) <= (float)this.Field14531.Method335() && f + 2.0f <= b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() && f < f2) {
                            blockPos = this.Method5608(sPacketSpawnObject.getEntityID(), blockPos2);
                        }
                    } else {
                        blockPos = this.Method5608(sPacketSpawnObject.getEntityID(), blockPos2);
                    }
                }
            }
            if (blockPos != null) {
                this.Field14545.remove(dpJrqfFxX8JfheUiL7RkOv8ckfQfs2xI.Field8894.Method6018(this.Field14545, blockPos));
            }
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSoundEffect && this.Field14512.Method341() == b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field15746 && this.Field14563 != null && (sPacketSpawnObject = (SPacketSoundEffect)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getCategory() == SoundCategory.BLOCKS && sPacketSpawnObject.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE && this.Field14563.getDistance(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ()) <= Double.longBitsToDouble((long)903352325 ^ 0x4018000035D81005L)) {
            this.Method5642(this.Field14563);
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSoundEffect)) return;
        if (!this.Field14470.Method365() || this.Field14563 == null) {
            if (!this.Field14471.Method365()) return;
        }
        if ((sPacketSpawnObject = (SPacketSoundEffect)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getCategory() == SoundCategory.BLOCKS && sPacketSpawnObject.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE && this.Field14563.getDistance(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ()) <= Double.longBitsToDouble((long)994887407 ^ 0x401800003B4CC6EFL)) {
            this.Field14563.setDead();
        }
        if (!this.Field14535.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.Field12588.name())) return;
        if (!this.Method5614()) return;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        double d = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(new BlockPos(sPacketSpawnObject.getX(), sPacketSpawnObject.getY(), sPacketSpawnObject.getZ()));
        double d2 = this.Field14540.Method335();
        return (void)(d2 * d2);
    }

    private void Method5652(RG0Ef4LzpvaRaWkCktLl94QMei9n80rd rG0Ef4LzpvaRaWkCktLl94QMei9n80rd) {
        if (!this.Field14461.Method365()) return;
        if (Field14558 == null) {
            return;
        }
        if (this.Field14462.Method365() && this.Field14456.Method365() && this.Field14550.Method2797(this.Field14525.Method369())) {
            this.Method5615();
            this.Field14550.Method2801();
        }
        if (this.Field14529.Method335() == ((int)2051906249L ^ 0x7A4D9AC8)) {
            this.Method5602(rG0Ef4LzpvaRaWkCktLl94QMei9n80rd, ((int)-1444115280L ^ 0xA9EC8CB0) != 0);
            return;
        }
        int n = (int)((long)-759303874 ^ (long)-759303874);
        while (n < this.Field14529.Method335()) {
            this.Method5602(rG0Ef4LzpvaRaWkCktLl94QMei9n80rd, (boolean)((long)846248815 ^ (long)846248815));
            ++n;
        }
    }

    private static String Method5653() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("[");
        if (Field14558 == null) {
            string = "no target no fun";
            return stringBuilder.append(string).append("]").toString();
        }
        string = Field14558.getName();
        return stringBuilder.append(string).append("]").toString();
    }

    private Boolean Method5654() {
        int n;
        if (this.Field14479.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10076) {
            n = (int)-917534062L ^ 0xC94F8A93;
            return n != 0;
        }
        n = (int)((long)1825548195 ^ (long)1825548195);
        return n != 0;
    }

    private Boolean Method5655() {
        int n;
        if (this.Field14478.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field10076) {
            n = (int)((long)1938588900 ^ (long)1938588901);
            return n != 0;
        }
        n = (int)1676419466L ^ 0x63EC218A;
        return n != 0;
    }

    private Boolean Method5656() {
        if (!this.Field14455.Method359().equals("Smart")) return (boolean)((long)770860044 ^ (long)770860044);
        if (this.Field14560.Method1201() != Field14558) return (boolean)((long)770860044 ^ (long)770860044);
        if (this.Field14560.Method1203() == null) return (boolean)((long)770860044 ^ (long)770860044);
        if (this.Field14560.Method1205() >= b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount() && b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.TOTEM_OF_UNDYING) {
            return ((int)1042868044L ^ 0x3E28E74C) != 0;
        }
        if (!((double)this.Field14560.Method1207() * this.Field14533.Method367() >= (double)(Field14558.getHealth() + Field14558.getAbsorptionAmount()))) return (boolean)((long)770860044 ^ (long)770860044);
        return ((int)1931926987L ^ 0x7326DDCA) != 0;
    }

    private Boolean Method5657() {
        int n;
        if (!this.Field14535.Method309("None")) {
            n = (int)((long)308999139 ^ (long)308999138);
            return n != 0;
        }
        n = (int)343667019L ^ 0x147BF14B;
        return n != 0;
    }

    private Boolean Method5658() {
        return this.Field14535.Method309("Sound");
    }

    private Boolean Method5659() {
        int n;
        if (!this.Field14535.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.Field12586.name()) && !this.Field14474.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6.Field9926.name())) {
            n = (int)((long)144815874 ^ (long)144815875);
            return n != 0;
        }
        n = (int)((long)-1107222199 ^ (long)-1107222199);
        return n != 0;
    }

    private Boolean Method5660() {
        boolean bl;
        if (!this.Field14535.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.Field12586.name())) {
            bl = (int)563530628L ^ 0x2196CB85;
            return bl;
        }
        bl = (int)354755469L ^ 0x1525238D;
        return bl;
    }

    private Boolean Method5661() {
        int n;
        if (!this.Field14535.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.Field12586.name())) {
            n = (int)1830713387L ^ 0x6D1E782A;
            return n != 0;
        }
        n = (int)((long)783084022 ^ (long)783084022);
        return n != 0;
    }

    private Boolean Method5662() {
        int n;
        if (!this.Field14535.Method309(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.Field12586.name())) {
            n = (int)((long)-1707153648 ^ (long)-1707153647);
            return n != 0;
        }
        n = (int)((long)1008337146 ^ (long)1008337146);
        return n != 0;
    }

    private Boolean Method5663() {
        boolean bl;
        if (!this.Field14474.Method309("None")) {
            bl = (int)-756107993L ^ 0xD2EEB526;
            return bl;
        }
        bl = (int)-1747973214L ^ 0x97D00BA2;
        return bl;
    }

    private Boolean Method5664() {
        boolean bl;
        if (this.Field14465.Method341() != b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN.Field13629) {
            bl = (int)-667978949L ^ 0xD82F733A;
            return bl;
        }
        bl = (int)-1827270393L ^ 0x93161107;
        return bl;
    }

    static Minecraft Method5665() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method5666() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static AtomicBoolean Method5667(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2) {
        return b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2.Field14556;
    }

    static IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Method5668(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2) {
        return b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2.Field14554;
    }

    static Thread Method5669(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2) {
        return b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2.Field14559;
    }

    static AtomicBoolean Method5670(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2) {
        return b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2.Field14557;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-431755528 ^ (long)-431755528);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1347012871L ^ 0x5049C9F8);
            int n2 = (int)-1027767565L ^ 0xC2BD8216;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1415528996 ^ (long)1415521521) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

