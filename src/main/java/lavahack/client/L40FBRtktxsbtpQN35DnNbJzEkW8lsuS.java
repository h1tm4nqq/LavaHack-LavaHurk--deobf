//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.renderer.DestroyBlockProgress
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA;
import lavahack.client.AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.JmZtWHNRIQ5Ri1a4G0kaFnrTWEDInXfj;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$1;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$AOGOereh29Orfn8LhjxmWQxXsft8Iamu;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DitR6vZ79qQrTZ031J7xzQQWKdUckNea;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$RG0Ef4LzpvaRaWkCktLl94QMei9n80rd;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$jNiJm0uQgY2wVhFel4twUsWMig1Nujvc;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$xthiG5kgsZ7gUpqshm3SOX812RpS42oo;
import lavahack.client.NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2;
import lavahack.client.SsWr9ZAnXhnSq6ZKjOMqLUjyNvgF4Y4z;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD;
import lavahack.client.cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.iOlyf0qO2tpkluftbdahtmamFIPIkMNS;
import lavahack.client.ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.renderer.DestroyBlockProgress;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\b\u0010Z\u001a\u00020UH\u0002J\b\u0010[\u001a\u00020UH\u0002J\b\u0010\\\u001a\u00020UH\u0002J\b\u0010]\u001a\u00020UH\u0002J\b\u0010^\u001a\u00020UH\u0002J\b\u0010_\u001a\u00020UH\u0002J\b\u0010`\u001a\u00020UH\u0002J\b\u0010a\u001a\u00020UH\u0002J\b\u0010b\u001a\u00020UH\u0002J\b\u0010c\u001a\u00020UH\u0002J\b\u0010d\u001a\u00020UH\u0002J\b\u0010e\u001a\u00020UH\u0002J\b\u0010f\u001a\u00020UH\u0002J\u0010\u0010g\u001a\u00020 2\u0006\u0010G\u001a\u00020HH\u0002J\"\u0010h\u001a\u0004\u0018\u00010(2\u0006\u0010G\u001a\u00020H2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u0010H\u0002J\b\u0010k\u001a\u00020UH\u0002J\b\u0010l\u001a\u00020UH\u0002J\b\u0010m\u001a\u00020UH\u0002J\b\u0010n\u001a\u00020UH\u0002J\b\u0010o\u001a\u00020UH\u0002J\u0010\u0010p\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\b\u0010q\u001a\u00020\u000bH\u0002J\n\u0010r\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010s\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\u0010\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010v\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020(H\u0002J\u0010\u0010w\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010x\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0010\u0010y\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\u0018\u0010z\u001a\u00020U2\u0006\u0010Y\u001a\u00020(2\u0006\u0010{\u001a\u00020\u000bH\u0002J\u0018\u0010|\u001a\u00020U2\u0006\u0010Y\u001a\u00020(2\u0006\u0010{\u001a\u00020\u000bH\u0002J\b\u0010}\u001a\u00020\u000bH\u0002J\u0010\u0010~\u001a\u00020U2\u0006\u0010\u007f\u001a\u00020(H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020HH\u0002J\t\u0010\u0081\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u0082\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u0083\u0001\u001a\u00020UH\u0016J\t\u0010\u0084\u0001\u001a\u00020UH\u0016J\u0013\u0010\u0085\u0001\u001a\u00020U2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0007J\u001a\u0010\u0088\u0001\u001a\u00020U2\u0007\u0010\u0089\u0001\u001a\u00020 2\u0006\u0010G\u001a\u00020HH\u0002J\u0011\u0010\u008a\u0001\u001a\u00020U2\u0006\u0010Y\u001a\u00020(H\u0002J\t\u0010\u008b\u0001\u001a\u00020UH\u0002J\t\u0010\u008c\u0001\u001a\u00020UH\u0002J\t\u0010\u008d\u0001\u001a\u00020UH\u0002J\t\u0010\u008e\u0001\u001a\u00020\u000bH\u0002J\t\u0010\u008f\u0001\u001a\u00020UH\u0002J\t\u0010\u0090\u0001\u001a\u00020UH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010?\u001a\n \u0007*\u0004\u0018\u00010@0@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020B0=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010D\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010M\u001a\n \u0007*\u0004\u0018\u00010N0NX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0091\u0001"}, d2={"Lcom/kisman/cc/features/module/combat/Robot;", "Lcom/kisman/cc/features/module/Module;", "()V", "announceTimer", "Lcom/kisman/cc/util/TimerUtils;", "autoTrap", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "bowTicks", "", "cantStep", "", "crystalpvpccMode", "damagePerSecond", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "didChorus", "dpsMovingTrigger", "dropped", "enabledAura", "enabledFastExp", "enabledPacketMine", "enabledStep", "enabledTrap", "forcedHole", "handOnly", "hasMined", "healthMovingTrigger", "holeFiller", "holeOperation", "Lcom/kisman/cc/util/enums/RobotHoleOperation;", "holeTimer", "isEating", "isExping", "isMoving", "isSafe", "landed", "lastHole", "Lnet/minecraft/util/math/BlockPos;", "mineTimer", "minedPos", "mode", "", "needsOnGround", "needsUnSneak", "nextHole", "nextHoleRenderer", "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "nextHoleRendererPattern", "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "packets", "preGappled", "prevChorus", "prevGapples", "prevHealth", "prevPosX", "prevPosZ", "range", "receive", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "renderers", "Lcom/kisman/cc/settings/types/SettingGroup;", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "st", "strafing", "switchedPickaxe", "switchedToSword", "target", "Lnet/minecraft/entity/player/EntityPlayer;", "targetExpPercent", "targetObsidian", "targets", "Lcom/kisman/cc/util/entity/TargetFinder;", "threads", "Lcom/kisman/cc/settings/util/MultiThreaddableModulePattern;", "totalDamagePerSecond1", "triggerMode", "value", "xt", "zt", "breakCrystal", "", "crystal", "Lnet/minecraft/entity/Entity;", "canEnter", "pos", "center", "disableAura", "disableFiller", "disableStep", "disableSurround", "disableTrap", "doEat", "doQuiver", "enableAura", "enableFiller", "enableStep", "enableSurround", "enableTrap", "getHoleOperation", "getNextHole", "force", "forceRadius", "handleChorus", "handleDamage", "handleEat", "handleMineEchest", "handleTower", "isAir", "isBeingCevBreakered", "isBeingRussianed", "isEchest", "isEnemyInSameHole", "player", "isObby", "isPlayerSafe", "isTowering", "isTrapped", "mineBlock", "obby", "mineBlockForEchest", "moveOutHole", "moveToNextHole", "pos1", "needsEffect", "needsMending", "needsObsidian", "onDisable", "onEnable", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "performHoleOperation", "operation", "placeEchest", "reset", "resetMovement", "setUseItemUnpressedIfNeeded", "stepState", "toggleSurround", "update", "kisman.cc"})
public final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13768 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CrystalPvPcc Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-248130031L ^ 0xF135D610) != 0).Method355("crystalpvp.cc"));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13769 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1605945235 ^ 0x406900005FB8C793L), 1.0, Double.longBitsToDouble(0x3103A67FD18E951L ^ 0x43793A67FD18E951L), (boolean)((long)584763683 ^ (long)584763682)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13770 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Health Moving Trigger", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xF5D47E643A4F2B7AL ^ 0xB5E5FE643A4F2B7AL), 1.0, Double.longBitsToDouble((long)1237389133 ^ 0x4042800049C10F4DL), ((int)385853059L ^ 0x16FFA683) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13771 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DPS Moving Trigger", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)341755072 ^ 0x40240000145EC4C0L), 0.0, Double.longBitsToDouble((long)2133437267 ^ 0x404400007F29AB53L), ((int)-2002686669L ^ 0x88A16D33) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13772 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strafing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1381946422 ^ (long)1381946422)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field13773 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Renderers", this)));
    private final cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Field13774;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13775;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13776;
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field13777;
    private final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk Field13778;
    private final RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2 Field13779;
    private EntityPlayer Field13780;
    private double Field13781;
    private double Field13782;
    private double Field13783;
    private double Field13784;
    private int Field13785;
    private int Field13786;
    private int Field13787;
    private int Field13788;
    private int Field13789;
    private int Field13790;
    private int Field13791;
    private int Field13792;
    private int Field13793;
    private boolean Field13794;
    private boolean Field13795;
    private boolean Field13796;
    private boolean Field13797;
    private boolean Field13798;
    private boolean Field13799;
    private boolean Field13800;
    private boolean Field13801;
    private boolean Field13802;
    private boolean Field13803;
    private boolean Field13804;
    private boolean Field13805;
    private boolean Field13806;
    private boolean Field13807;
    private boolean Field13808;
    private boolean Field13809;
    private boolean Field13810;
    private boolean Field13811;
    private boolean Field13812;
    private boolean Field13813;
    private boolean Field13814;
    private boolean Field13815;
    private String Field13816;
    private String Field13817;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field13818;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field13819;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field13820;
    private BlockPos Field13821;
    private BlockPos Field13822;
    private BlockPos Field13823;
    private final HashMap Field13824;
    private NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 Field13825;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13826;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field13827;
    private String Field13828 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private final void Method5127() {
        int n;
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        this.Field13781 = entityPlayerSP.getHealth() + L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getAbsorptionAmount();
        this.Field13782 = 0.0;
        this.Field13783 = 0.0;
        this.Field13784 = 0.0;
        int n2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.mainInventory.stream().filter(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$AOGOereh29Orfn8LhjxmWQxXsft8Iamu.Field15517).mapToInt(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.Field9972).sum();
        EntityPlayerSP entityPlayerSP2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (entityPlayerSP2.getHeldItemOffhand().getItem() == Items.GOLDEN_APPLE) {
            EntityPlayerSP entityPlayerSP3 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP3.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n = itemStack.getCount();
        } else {
            n = (int)928509797L ^ 0x3757EF65;
        }
        this.Field13785 = n2 + n;
        this.Field13794 = (int)-1073906110L ^ 0xBFFD7E42;
        this.Field13795 = (int)-1640681375L ^ 0x9E353061;
        this.Field13796 = (int)((long)-713421367 ^ (long)-713421367);
        this.Field13797 = (int)1639398978L ^ 0x61B73E42;
        this.Field13798 = (int)((long)1899938305 ^ (long)1899938305);
        this.Field13799 = (int)((long)520285933 ^ (long)520285933);
        this.Field13800 = (int)((long)324218251 ^ (long)324218251);
        this.Field13802 = (int)((long)10320685 ^ (long)10320685);
        this.Field13803 = (int)1736529943L ^ 0x67815817;
        this.Field13804 = (int)((long)-1748978606 ^ (long)-1748978606);
        this.Field13806 = (int)2110108384L ^ 0x7DC5B2E0;
        this.Field13807 = (int)-1626272573L ^ 0x9F110CC3;
        this.Field13808 = (int)((long)-1619115193 ^ (long)-1619115193);
        this.Field13809 = (int)((long)1589088617 ^ (long)1589088617);
        this.Field13810 = (int)((long)-679463443 ^ (long)-679463443);
        this.Field13811 = (int)-1632961389L ^ 0x9EAAFC93;
        this.Field13812 = (int)((long)-2037343837 ^ (long)-2037343837);
        this.Field13813 = (int)((long)296506740 ^ (long)296506740);
        this.Field13814 = (int)((long)-1654306784 ^ (long)-1654306784);
        this.Field13815 = (int)((long)-1890333977 ^ (long)-1890333977);
        this.Field13816 = "";
        this.Field13817 = "";
        this.Field13824.clear();
        this.Field13786 = (int)-59270728L ^ 0xFC7799B9;
        this.Field13787 = (int)-2114256756L ^ 0x81FB0087;
        this.Field13789 = (int)((long)400876108 ^ (long)400876108);
        this.Field13790 = (int)((long)63836698 ^ (long)63836698);
        this.Field13791 = (int)((long)1096767946 ^ (long)1096767946);
        this.Field13792 = (int)-931966150L ^ 0xC873533A;
        this.Field13793 = (int)-1823057961L ^ 0x935657D7;
        this.Field13818.Method2801();
        this.Field13819.Method2801();
        this.Field13820.Method2801();
        this.Field13821 = null;
        this.Field13822 = null;
        this.Field13823 = null;
        this.Field13778.Method498();
        this.Method5163();
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13826);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field13827);
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player == null || L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world == null) {
            this.Method21(((int)-337321607L ^ 0xEBE4E179) != 0);
            return;
        }
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2, (String)"AutoRer.instance");
        if (!b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2.Method35()) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD3 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544;
            Intrinsics.checkExpressionValueIsNotNull((Object)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD3, (String)"AutoRer.instance");
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD3.Method21(((int)-151680393L ^ 0xF6F58A76) != 0);
        }
        this.Method5127();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13826);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field13827);
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player == null) return;
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world == null) {
            return;
        }
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544;
        Intrinsics.checkExpressionValueIsNotNull((Object)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2, (String)"AutoRer.instance");
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD2.Method35()) {
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD3 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544;
            Intrinsics.checkExpressionValueIsNotNull((Object)b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD3, (String)"AutoRer.instance");
            b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD3.Method21((boolean)((long)-138349529 ^ (long)-138349529));
        }
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindUseItem.pressed = (int)((long)1667137984 ^ (long)1667137984);
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method5128(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        this.Field13779.Method2998(this.Field13823, this.Field13774);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void Method45() {
        block55: {
            block59: {
                block58: {
                    block57: {
                        block56: {
                            block54: {
                                block53: {
                                    if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player == null) return;
                                    if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world == null) {
                                        return;
                                    }
                                    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.rotationYaw = Float.intBitsToFloat(610141713 ^ 1735001617);
                                    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.rotationPitch = 0.0f;
                                    v0 = this.Field13768;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v0, (String)"crystalpvpccMode");
                                    if (v0.Method365()) {
                                        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.ticksExisted > ((int)-1395298562L ^ -1395298565) << 2 && L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posY >= (double)((int)((long)-94752468 ^ (long)-94752495) << 1)) {
                                            v1 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                                            Intrinsics.checkExpressionValueIsNotNull((Object)v1, (String)"mc.player");
                                            if (Intrinsics.areEqual((Object)v1.getHeldItemOffhand().item, (Object)Items.AIR)) {
                                                L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.sendChatMessage("/kit bot");
                                            }
                                            if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posZ > Double.longBitsToDouble(-297263048802893301L ^ 4308380567362640785L)) {
                                                L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindForward.pressed = (int)((long)-684723871 ^ (long)-684723872);
                                                return;
                                            }
                                            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindForward.pressed = (int)837580132L ^ 837580132;
                                            if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.collidedHorizontally) {
                                                this.Method5165();
                                            }
                                            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindRight.pressed = (int)-903678631L ^ -903678632;
                                            v2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world;
                                            v3 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                                            Intrinsics.checkExpressionValueIsNotNull((Object)v3, (String)"mc.player");
                                            v4 = v2.getBlockState(v3.getPosition().down());
                                            Intrinsics.checkExpressionValueIsNotNull((Object)v4, (String)"mc.world.getBlockState(mc.player.position.down())");
                                            if (Intrinsics.areEqual((Object)v4.getBlock(), (Object)Blocks.AIR) == false) return;
                                            this.Field13812 = (int)833301751L ^ 833301750;
                                            return;
                                        }
                                        if (this.Field13812) {
                                            this.Method5167();
                                            if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.onGround) {
                                                this.Field13813 = (int)-1178493129L ^ -1178493130;
                                            }
                                        }
                                    } else {
                                        this.Field13813 = (int)-290232601L ^ -290232602;
                                    }
                                    if (this.Field13813) {
                                        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.onGround) {
                                            this.Method5154();
                                        }
                                        this.Method5163();
                                        this.Field13813 = (int)((long)-201677861 ^ (long)-201677861);
                                        this.Field13812 = (int)-1564760560L ^ -1564760560;
                                    }
                                    if (this.Field13810) {
                                        var1_1 = this.Field13792;
                                        this.Field13792 = var1_1 + ((int)-668375368L ^ -668375367);
                                        if (this.Field13792 >= (int)((long)-1652456202 ^ (long)-1652456205) << 1) {
                                            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindSneak.pressed = (int)2046678959L ^ 2046678959;
                                            this.Field13810 = (int)((long)-1623467039 ^ (long)-1623467039);
                                        }
                                    }
                                    v5 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v5, (String)"SurroundRewrite.instance");
                                    this.Field13815 = v5.Method35() != false && this.Field13825 != NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13758 ? (int)((long)605214469 ^ (long)605214468) : (int)-1939792412L ^ -1939792412;
                                    v6 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v6, (String)"mc.player");
                                    this.Field13795 = this.Method5169((EntityPlayer)v6);
                                    v7 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v7, (String)"mc.player");
                                    var1_2 = v7.getHealth() + L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.absorptionAmount;
                                    this.Field13778.Method499();
                                    this.Field13780 = this.Field13778.Method496();
                                    this.Method5153();
                                    if (this.Field13794) {
                                        this.Method5129();
                                    }
                                    if (this.Field13780 == null) {
                                        this.Method5167();
                                        return;
                                    }
                                    v8 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                                    v9 = this.Field13780;
                                    if (v9 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    if (v8.getDistance((Entity)v9) > (float)((int)-1544955282L ^ -1544955287)) {
                                        this.Field13809 = (int)-1300289538L ^ -1300289538;
                                    }
                                    this.Method5138();
                                    this.Field13782 = this.Field13824.values().stream().mapToDouble(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB.Field10911).sum();
                                    if (this.Field13802) {
                                        if (!this.Method5164() && !this.Field13815) {
                                            this.Method5165();
                                            this.Field13803 = (int)((long)1742437085 ^ (long)1742437084);
                                        }
                                    } else if (this.Field13803) {
                                        this.Method5166();
                                        this.Field13803 = (int)-2114785199L ^ -2114785199;
                                    }
                                    v10 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                                    v11 = this.Field13780;
                                    if (v11 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    if (!(v10.getDistance((Entity)v11) < (float)(((int)1877033336L ^ 1877033341) << 1))) break block53;
                                    v12 = this.Field13780;
                                    if (v12 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    if (this.Method5169(v12)) break block53;
                                    v13 = var1_2;
                                    v14 = this.Field13770;
                                    Intrinsics.checkExpressionValueIsNotNull((Object)v14, (String)"healthMovingTrigger");
                                    if (v13 < v14.Method367()) ** GOTO lbl-1000
                                }
                                v15 = this.Field13771;
                                Intrinsics.checkExpressionValueIsNotNull((Object)v15, (String)"dpsMovingTrigger");
                                if (this.Field13782 > v15.Method367()) lbl-1000:
                                // 2 sources

                                {
                                    v16 = (int)227392782L ^ 227392783;
                                } else {
                                    v16 = (int)((long)-1509406743 ^ (long)-1509406743);
                                }
                                var2_3 = v16;
                                v17 = this.Field13780;
                                if (v17 == null) {
                                    Intrinsics.throwNpe();
                                }
                                var3_4 = this.Method5170(v17);
                                if (!this.Field13795) break block54;
                                this.Field13814 = (int)2111903118L ^ 2111903118;
                                this.Field13790 = (int)-1279768325L ^ -1279768325;
                                this.Field13791 = (int)-658419004L ^ -658419004;
                                v18 = this.Field13780;
                                if (v18 == null) {
                                    Intrinsics.throwNpe();
                                }
                                this.Field13825 = this.Method5152(v18);
                                v19 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                                Intrinsics.checkExpressionValueIsNotNull((Object)v19, (String)"mc.player");
                                this.Field13822 = v19.getPosition();
                                v20 = this.Field13825;
                                if (v20 == null) {
                                    Intrinsics.throwNpe();
                                }
                                v21 = this.Field13780;
                                if (v21 == null) {
                                    Intrinsics.throwNpe();
                                }
                                this.Method5134(v20, v21);
                                var4_5 = "safe";
                                var5_9 = (int)-1090689389L ^ -1090689389;
                                System.out.println((Object)var4_5);
                                break block55;
                            }
                            var4_6 = "unsafe";
                            var5_10 = (int)((long)680730817 ^ (long)680730817);
                            System.out.println((Object)var4_6);
                            if (this.Field13783 != 0.0 && this.Field13784 != 0.0) {
                                var4_7 = (int)371437292L ^ 371437292;
                                if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posX == this.Field13783) {
                                    var5_10 = this.Field13790;
                                    this.Field13790 = var5_10 + (int)((long)223475918 ^ (long)223475919);
                                    ++var4_7;
                                }
                                if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posZ == this.Field13784) {
                                    var5_10 = this.Field13791;
                                    this.Field13791 = var5_10 + (int)((long)-1182554297 ^ (long)-1182554298);
                                    ++var4_7;
                                }
                                ((int)-1110159252L ^ -1110159251) << 1;
                            }
                            this.Field13820.Method2801();
                            v22 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Field13362.Method5347();
                            if (v22 == null) {
                                Intrinsics.throwNpe();
                            }
                            if (v22.Method35() && this.Field13801) {
                                this.Method5160();
                                this.Field13801 = (int)((long)-1981669757 ^ (long)-1981669757);
                            }
                            v23 = this.Field13776;
                            Intrinsics.checkExpressionValueIsNotNull((Object)v23, (String)"autoTrap");
                            if (!v23.Method365()) break block56;
                            v24 = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Field12889;
                            Intrinsics.checkExpressionValueIsNotNull((Object)v24, (String)"AutoTrap.instance");
                            if (!v24.Method35() || !this.Field13804) break block57;
                        }
                        this.Method5156();
                        this.Field13804 = (int)-1273228637L ^ -1273228637;
                    }
                    v25 = this.Field13775;
                    Intrinsics.checkExpressionValueIsNotNull((Object)v25, (String)"holeFiller");
                    if (!v25.Method365()) break block58;
                    Intrinsics.checkExpressionValueIsNotNull(null, (String)"HoleFillerRewrite.instance");
                    if (!null.Method35()) break block59;
                }
                this.Method5158();
            }
            v26 = var1_2;
            v27 = this.Field13770;
            Intrinsics.checkExpressionValueIsNotNull((Object)v27, (String)"healthMovingTrigger");
            this.Field13811 = v26 <= v27.Method367() ? (int)-647570624L ^ -647570623 : (int)-563636669L ^ -563636669;
            if (this.Field13823 == null) ** GOTO lbl-1000
            v28 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world;
            v29 = this.Field13823;
            if (v29 == null) {
                Intrinsics.throwNpe();
            }
            v30 = v28.getBlockState(v29);
            Intrinsics.checkExpressionValueIsNotNull((Object)v30, (String)"mc.world.getBlockState(nextHole!!)");
            if ((Intrinsics.areEqual((Object)v30.getBlock(), (Object)Blocks.AIR) ^ ((int)-1696023008L ^ -1696023007)) != 0) {
                v31 = (int)-580651318L ^ -580651317;
            } else lbl-1000:
            // 2 sources

            {
                v31 = (int)767582903L ^ 767582903;
            }
            var4_8 = v31;
            v32 = this.Field13780;
            if (v32 == null) {
                Intrinsics.throwNpe();
            }
            this.Field13823 = this.Method5133(v32, (boolean)((long)60457471 ^ (long)60457471), Double.longBitsToDouble(-1563905706743966801L ^ -6165458626009771089L));
            var5_11 = "next hole is " + (this.Field13823 == null ? "" : "non ") + "null";
            var6_12 = (int)((long)-2084538740 ^ (long)-2084538740);
            System.out.print((Object)var5_11);
            if (this.Field13814 || var3_4) {
                v33 = this.Field13780;
                if (v33 == null) {
                    Intrinsics.throwNpe();
                }
                if ((var5_11 = this.Method5133(v33, (boolean)((long)1535639312 ^ (long)1535639313), Double.longBitsToDouble(6963538882097935154L ^ 2343971564322648882L))) != null) {
                    this.Field13823 = var5_11;
                    this.Field13814 = (int)-1228136884L ^ -1228136883;
                }
            }
            if (this.Field13823 != null) {
                v34 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)v34, (String)"mc.player");
                if (Intrinsics.areEqual((Object)this.Field13823, (Object)v34.getPosition())) {
                    this.Method5163();
                    this.Method5167();
                } else {
                    v35 = this.Field13823;
                    if (v35 == null) {
                        Intrinsics.throwNpe();
                    }
                    this.Method5130(v35);
                }
            }
        }
        this.Field13783 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posX;
        this.Field13784 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posZ;
    }

    private final void Method5129() {
        int n;
        int n2;
        int n3 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.mainInventory.stream().filter(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x.Field9601).mapToInt(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$jNiJm0uQgY2wVhFel4twUsWMig1Nujvc.Field11872).sum();
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemOffhand().item, (Object)Items.GOLDEN_APPLE)) {
            EntityPlayerSP entityPlayerSP2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP2.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n2 = itemStack.getCount();
        } else {
            n2 = (int)((long)1846646024 ^ (long)1846646024);
        }
        int n4 = n3 + n2;
        int n5 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.mainInventory.stream().filter(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ItyDJooi2U23sHYdNmIhbJFmcHy1UFNl.Field16224).mapToInt(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$RG0Ef4LzpvaRaWkCktLl94QMei9n80rd.Field11269).sum();
        EntityPlayerSP entityPlayerSP3 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP3.getHeldItemOffhand().item, (Object)Items.CHORUS_FRUIT)) {
            EntityPlayerSP entityPlayerSP4 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP4.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n = itemStack.getCount();
        } else {
            n = (int)((long)-797279824 ^ (long)-797279824);
        }
        int n6 = n5 + n;
        if (n4 >= this.Field13785 && n6 >= this.Field13789) {
            EntityPlayerSP entityPlayerSP5 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP5, (String)"mc.player");
            if ((Intrinsics.areEqual((Object)entityPlayerSP5.getHeldItemMainhand().item, (Object)Items.GOLDEN_APPLE) ^ ((int)280012389L ^ 0x10B0A664)) == 0) return;
            EntityPlayerSP entityPlayerSP6 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP6, (String)"mc.player");
            if ((Intrinsics.areEqual((Object)entityPlayerSP6.getHeldItemMainhand().item, (Object)Items.CHORUS_FRUIT) ^ (int)((long)930641233 ^ (long)930641232)) == 0) return;
        }
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindUseItem.pressed = (int)((long)1503151202 ^ (long)1503151202);
        this.Field13794 = (int)-783342175L ^ 0xD14F25A1;
    }

    private final void Method5130(BlockPos blockPos) {
        BlockPos blockPos2;
        BlockPos blockPos3 = blockPos2 = blockPos.up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos");
        BlockPos blockPos4 = new BlockPos(blockPos3.getX(), oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3016().getY(), blockPos2.getZ());
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13772;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"strafing");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && !(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getDistanceSq(blockPos4) < (double)(((int)2054368673L ^ 0x7A732DA2) << 1)) && !this.Field13811) {
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56 ii0ezP0whVpj0XAbiqJTPbbM5Dkaez562 = ii0ezP0whVpj0XAbiqJTPbbM5Dkaez56.Field13077;
            Intrinsics.checkExpressionValueIsNotNull((Object)ii0ezP0whVpj0XAbiqJTPbbM5Dkaez562, (String)"Speed.instance");
            ii0ezP0whVpj0XAbiqJTPbbM5Dkaez562.Method21(((int)-959170371L ^ 0xC6D438BC) != 0);
        }
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos2).shrink(Double.longBitsToDouble((long)1013945946 ^ 0x3FE000003C6F965AL));
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getDistanceSq(blockPos4) < (double)((int)((long)-1099860208 ^ (long)-1099860207) << 2) && this.Method5164()) {
            this.Method5166();
        }
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posZ > axisAlignedBB.minZ + Double.longBitsToDouble((long)1346295453 ^ 0x3FC00000503ED69DL)) {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindForward.pressed = (int)1408953804L ^ 0x53FAEDCD;
            this.Field13802 = (int)((long)1425447014 ^ (long)1425447015);
        } else {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindForward.pressed = (int)((long)-844582527 ^ (long)-844582528);
        }
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posZ < axisAlignedBB.minZ - Double.longBitsToDouble(0x2E572D289162E8FEL ^ 0x11972D289162E8FEL)) {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindBack.pressed = (int)-340143746L ^ 0xEBB9D17F;
            this.Field13802 = (int)1357566430L ^ 0x50EAD1DF;
        } else {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindBack.pressed = (int)-2147077097L ^ 0x80063416;
        }
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posX > axisAlignedBB.minX + Double.longBitsToDouble(0x4D2FE6FADE56B847L ^ 0x72EFE6FADE56B847L)) {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindLeft.pressed = (int)-474520290L ^ 0xE3B7651F;
            this.Field13802 = (int)-1266828132L ^ 0xB47DBC9D;
        } else {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindLeft.pressed = (int)((long)-399690945 ^ (long)-399690946);
        }
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posX < axisAlignedBB.minX - Double.longBitsToDouble(0xC21788479CE35C2EL ^ 0xFDD788479CE35C2EL)) {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindRight.pressed = (int)((long)709925064 ^ (long)709925065);
            this.Field13802 = (int)-551401153L ^ 0xDF22493E;
            return;
        }
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindRight.pressed = (int)-1159417278L ^ 0xBAE4B243;
    }

    private final boolean Method5131(BlockPos blockPos) {
        int n;
        BlockPos blockPos2 = blockPos.up();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.up()");
        if (this.Method5132(blockPos2)) {
            BlockPos blockPos3 = blockPos.up((int)((long)-1768050868 ^ (long)-1768050867) << 1);
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.up(2)");
            if (this.Method5132(blockPos3)) {
                BlockPos blockPos4 = blockPos.up((int)979348145L ^ 0x3A5FAAB2);
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.up(3)");
                if (this.Method5132(blockPos4)) {
                    BlockPos blockPos5 = blockPos.up((int)((long)793626477 ^ (long)793626476) << 2);
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.up(4)");
                    if (this.Method5132(blockPos5)) {
                        n = (int)159296237L ^ 0x97EAAEC;
                        return n != 0;
                    }
                }
            }
        }
        n = (int)71922090L ^ 0x44971AA;
        return n != 0;
    }

    private final boolean Method5132(BlockPos blockPos) {
        IBlockState iBlockState = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR);
    }

    private final BlockPos Method5133(EntityPlayer entityPlayer, boolean bl, double d) {
        Collection collection = ((TreeMap)x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN.Field8964.Method1273().keySet().stream().filter(new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(this, bl, d, entityPlayer)).collect(Collectors.toMap(new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(bl, entityPlayer), L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field17092, L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field11924, L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field15812))).values();
        Intrinsics.checkExpressionValueIsNotNull(collection, (String)"HoleProcessor.holes.keys\u2026lockPos>()\n    })).values");
        return (BlockPos)CollectionsKt.firstOrNull((Iterable)collection);
    }

    private final void Method5134(NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03, EntityPlayer entityPlayer) {
        BlockPos blockPos;
        block35: {
            block37: {
                block36: {
                    block34: {
                        block33: {
                            this.Method5161();
                            if (this.Field13796 && nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 != NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13755) {
                                L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindUseItem.pressed = (int)-2014826629L ^ 0x87E82F7B;
                                this.Field13796 = (int)((long)2052786920 ^ (long)2052786920);
                            }
                            if (nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 != NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13758) {
                                this.Method5167();
                                if (this.Field13803) {
                                    this.Method5166();
                                }
                                if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.onGround) {
                                    this.Method5154();
                                    this.Field13802 = (int)((long)1882198810 ^ (long)1882198810);
                                }
                            }
                            if (nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 != NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13757) {
                                this.Field13787 = (int)-164669279L ^ 0xF62F58AA;
                            }
                            if (nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 != NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13755) {
                                this.Field13788 = (int)((long)425112436 ^ (long)425112429) << 1;
                            }
                            if (nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 != NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13754) break block33;
                            EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                            if (entityPlayerSP.getHeldItemMainhand().item instanceof ItemSword) break block34;
                        }
                        this.Field13807 = (int)((long)1989458232 ^ (long)1989458232);
                    }
                    if (nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 == NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13754) break block35;
                    if (this.Field13804) break block36;
                    qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13776;
                    Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"autoTrap");
                    if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) break block37;
                }
                this.Method5156();
                this.Field13804 = (int)((long)247067156 ^ (long)247067156);
            }
            if (this.Field13801) {
                this.Method5160();
                this.Field13801 = (int)((long)-1835537108 ^ (long)-1835537108);
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field13775;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"holeFiller");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            this.Method5157();
        } else {
            this.Method5158();
        }
        if (this.Method5150()) {
            blockPos = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H(this);
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world.loadedEntityList.stream().filter(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6.Field11635).forEach(new JmZtWHNRIQ5Ri1a4G0kaFnrTWEDInXfj((Function1)blockPos));
        }
        if ((blockPos = this.Method5151()) != null) {
            Function1 function1 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DWxN8wLIsLoeYiSaIuBiecHxwmChdruN(this);
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world.loadedEntityList.stream().filter(new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DitR6vZ79qQrTZ031J7xzQQWKdUckNea(blockPos)).forEach(new JmZtWHNRIQ5Ri1a4G0kaFnrTWEDInXfj(function1));
        }
        switch (SsWr9ZAnXhnSq6ZKjOMqLUjyNvgF4Y4z.Field15211[nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.ordinal()]) {
            case 1: {
                if (this.Field13794) {
                    return;
                }
                int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.EXPERIENCE_BOTTLE, (int)-958698072L ^ 0xC6DB6DA8, (int)-1069338024L ^ 0xC0433251);
                if (n == ((int)-250982890L ^ 0xEF5B1E9)) return;
                lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n, ((int)1323248256L ^ 0x4EDF2A80) != 0);
                L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindUseItem.pressed = (int)((long)309922239 ^ (long)309922238);
                L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.rotationPitch = Float.intBitsToFloat(0x1A2F3092 ^ 0x589B3092);
                this.Field13796 = (int)((long)-112130556 ^ (long)-112130555);
                this.Field13788 = ((int)-966985636L ^ 0xC65CF859) << 4;
                return;
            }
            case 2: {
                if (!this.Field13794) return;
                this.Method5146();
                return;
            }
            case 3: {
                int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method112((int)((long)-958630279 ^ (long)-958630279), (int)((long)-1916439728 ^ (long)-1916439719), ((int)-1009655989L ^ 0xC3D1DF4B) != 0);
                if (n != (int)((long)7732781 ^ (long)-7732782) && !this.Field13807 && !this.Field13794) {
                    lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n, (boolean)((long)-1631218078 ^ (long)-1631218078));
                    if (!this.Field13801) {
                        this.Method5159();
                        this.Field13801 = (int)2039814010L ^ 0x7995177B;
                    }
                    this.Field13807 = (int)-790973892L ^ 0xD0DAB23D;
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field13776;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"autoTrap");
                if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) return;
                if (!this.Method5168(entityPlayer)) return;
                if (this.Method5149(entityPlayer)) return;
                CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Field12889;
                Intrinsics.checkExpressionValueIsNotNull((Object)cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL, (String)"AutoTrap.instance");
                if (cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Method35()) return;
                this.Method5155();
                this.Field13804 = (int)((long)141071804 ^ (long)141071805);
                return;
            }
            case 4: {
                this.Method5135();
                return;
            }
            case 5: {
                if (this.Field13820.Method2797(0x82021F4L & 0x148D3F4L)) {
                    return;
                }
                EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                float f = entityPlayerSP.getHealth() + L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.absorptionAmount;
                if (!(f >= (float)((int)((long)-1431621867 ^ (long)-1431621872) << 2))) {
                    if (this.Field13794) return;
                    this.Method5144();
                    return;
                }
                if (this.Method5140() && !this.Method5141() && !this.Method5142() && !this.Method5143(entityPlayer)) {
                    this.Method5140();
                    this.Field13802 = (int)-651883602L ^ 0xD9250BAF;
                    return;
                }
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field13776;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"autoTrap");
                if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365() && this.Method5168(entityPlayer)) {
                    CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Field12889;
                    Intrinsics.checkExpressionValueIsNotNull((Object)cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL, (String)"AutoTrap.instance");
                    if (!cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Method35()) {
                        this.Method5155();
                        this.Field13804 = (int)-1403388977L ^ 0xAC59FBCE;
                    }
                }
                this.Method5139();
                return;
            }
            case 6: {
                this.Method5136();
                return;
            }
        }
    }

    private final void Method5135() {
    }

    private final void Method5136() {
    }

    private final void Method5137(Entity entity) {
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
    }

    private final void Method5138() {
        double d = this.Field13824.values().stream().mapToDouble(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk.Field16754).sum();
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        float f = entityPlayerSP.getHealth() + L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.absorptionAmount;
        if (this.Field13794) return;
        EntityPlayerSP entityPlayerSP2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (this.Method5169((EntityPlayer)entityPlayerSP2) && !(d >= (double)(((int)807285554L ^ 0x301E3337) << 1))) {
            int n = this.Field13795 ? (this.Method5150() ? (int)((long)663223030 ^ (long)663223027) << 2 : (int)((long)-899668832 ^ (long)-899668827) << 1) : (int)((long)-1406931852 ^ (long)-1406931845);
            if (!(f < (float)n)) return;
        }
        this.Method5144();
    }

    private final void Method5139() {
        int n;
        if (this.Field13794) return;
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.CHORUS_FRUIT, (int)((long)1981761096 ^ (long)1981761096), (int)-664252498L ^ 0xD8684FA7);
        if (n2 == ((int)1369748204L ^ 0xAE5B4D13)) return;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.currentItem = n2;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindUseItem.pressed = (int)2145783845L ^ 0x7FE61024;
        int n3 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.mainInventory.stream().filter(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field16587).mapToInt(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Field16016).sum();
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemOffhand().item, (Object)Items.CHORUS_FRUIT)) {
            EntityPlayerSP entityPlayerSP2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP2.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n = itemStack.getCount();
        } else {
            n = (int)1244005943L ^ 0x4A260637;
        }
        this.Field13789 = n3 + n;
        this.Field13794 = (int)-282994453L ^ 0xEF21D8EA;
    }

    private final boolean Method5140() {
        BlockPos blockPos = oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3016().up();
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E(this);
        BlockPos blockPos2 = blockPos.down();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"lastHole.down()");
        if (!this.Method5131(blockPos2)) return (int)((long)2066988543 ^ (long)2066988543) != 0;
        BlockPos blockPos3 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"lastHole");
        boolean bl = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos3, EnumFacing.NORTH);
        int n = (int)((long)551196748 ^ (long)551196748);
        int n2 = (int)2038578973L ^ 0x79823F1D;
        boolean bl2 = bl;
        int n3 = (int)1182349252L ^ 0x467937C4;
        if (bl2) {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindForward.pressed = (int)((long)-604160807 ^ (long)-604160808);
            return ((int)-1380296937L ^ 0xADBA5716) != 0;
        }
        bl = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, EnumFacing.EAST);
        n = (int)1490379795L ^ 0x58D56413;
        n2 = (int)-1594954882L ^ 0xA0EEEB7E;
        bl2 = bl;
        n3 = (int)-2079600094L ^ 0x840BD222;
        if (bl2) {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindRight.pressed = (int)((long)-173710782 ^ (long)-173710781);
            return ((int)-1994935951L ^ 0x8917B170) != 0;
        }
        bl = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, EnumFacing.WEST);
        n = (int)2085485085L ^ 0x7C4DFA1D;
        n2 = (int)((long)-648816031 ^ (long)-648816031);
        bl2 = bl;
        n3 = (int)((long)-76967926 ^ (long)-76967926);
        if (bl2) {
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindLeft.pressed = (int)1147820924L ^ 0x446A5B7D;
            return ((int)-825612759L ^ 0xCECA2628) != 0;
        }
        bl = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, EnumFacing.SOUTH);
        n = (int)((long)-9544791 ^ (long)-9544791);
        n2 = (int)-194755764L ^ 0xF464434C;
        bl2 = bl;
        n3 = (int)1251514384L ^ 0x4A989810;
        if (!bl2) return 0 != 0;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindBack.pressed = (int)((long)966159903 ^ (long)966159902);
        return ((int)-1770756740L ^ 0x9674657D) != 0;
    }

    private final boolean Method5141() {
        boolean bl;
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.OBSIDIAN, (int)1534710916L ^ 0x5B79D484, (int)1928027201L ^ 0x72EB5C48) == ((int)-547495146L ^ 0x20A21CE9)) {
            bl = (int)-789106369L ^ 0xD0F7313E;
            return bl;
        }
        bl = (int)-1057920065L ^ 0xC0F16BBF;
        return bl;
    }

    private final boolean Method5142() {
        int n;
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.EXPERIENCE_BOTTLE, (int)((long)731809828 ^ (long)731809828), (int)((long)-1359315661 ^ (long)-1359315654)) != (int)((long)-1894682615 ^ (long)1894682614) && L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.armorInventory.stream().filter(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Field17532).mapToInt(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$W3C0y9394VvVcZKAtDfQSnqXm5zLQGty.Field11526).anyMatch(new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$xthiG5kgsZ7gUpqshm3SOX812RpS42oo(this))) {
            n = (int)((long)1782606274 ^ (long)1782606275);
            return n != 0;
        }
        n = (int)((long)960888974 ^ (long)960888974);
        return n != 0;
    }

    private final boolean Method5143(EntityPlayer entityPlayer) {
        return (int)((long)-169513752 ^ (long)-169513752) != 0;
    }

    private final void Method5144() {
        int n;
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.GOLDEN_APPLE, (int)-590341347L ^ 0xDCD01B1D, (int)-635890696L ^ 0xDA1913F1);
        if (n2 == (int)((long)-2013661409 ^ (long)2013661408)) return;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.currentItem = n2;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindUseItem.pressed = (int)39878027L ^ 0x2607D8A;
        int n3 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.mainInventory.stream().filter(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14158).mapToInt(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field15659).sum();
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (Intrinsics.areEqual((Object)entityPlayerSP.getHeldItemOffhand().item, (Object)Items.GOLDEN_APPLE)) {
            EntityPlayerSP entityPlayerSP2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            ItemStack itemStack = entityPlayerSP2.getHeldItemOffhand();
            Intrinsics.checkExpressionValueIsNotNull((Object)itemStack, (String)"mc.player.heldItemOffhand");
            n = itemStack.getCount();
        } else {
            n = (int)((long)902110348 ^ (long)902110348);
        }
        this.Field13785 = n3 + n;
        this.Field13794 = (int)((long)1371608046 ^ (long)1371608047);
    }

    private final void Method5145(BlockPos blockPos) {
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method120(Blocks.ENDER_CHEST, (int)-1498867580L ^ 0xA6A91884, (int)-1732837174L ^ 0x98B700C3);
        int n2 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.currentItem;
        if (n == ((int)-1973730865L ^ 0x75A4BE30)) return;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.currentItem = n;
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, ((int)1080585851L ^ 0x40686E7B) != 0, ((int)1530740242L ^ 0x5B3D3E12) != 0);
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.inventory.currentItem = n2;
    }

    private final void Method5146() {
        BlockPos blockPos = oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3016().up();
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG(this);
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w(this);
        BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos");
        if (l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos2)) return;
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos);
    }

    private final void Method5147(BlockPos blockPos, boolean bl) {
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro(this);
        BlockPos blockPos2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos, bl);
        if (blockPos2 == null) return;
        this.Method5148(blockPos2, bl);
    }

    private final void Method5148(BlockPos blockPos, boolean bl) {
        if (!this.Field13799) {
            PlayerControllerMP playerControllerMP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().playerController;
            EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
            playerControllerMP.onPlayerDamageBlock(blockPos, entityPlayerSP.getHorizontalFacing());
            this.Field13821 = blockPos;
            this.Field13818.Method2801();
            this.Field13787 = (int)((long)1676191153 ^ (long)1676191154) << 4;
            this.Field13799 = (int)-1489250888L ^ 0xA73BD5B9;
            return;
        }
        if (!this.Field13818.Method2797(bl ? 0x5008FD2L & 0x321027D4L : 0x150CC3ECL & 0x62830BF8L)) return;
        PlayerControllerMP playerControllerMP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().playerController;
        BlockPos blockPos2 = this.Field13821;
        if (blockPos2 == null) {
            Intrinsics.throwNpe();
        }
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        playerControllerMP.onPlayerDamageBlock(blockPos2, entityPlayerSP.getHorizontalFacing());
        this.Field13799 = (int)672493198L ^ 0x28156E8E;
    }

    private final boolean Method5149(EntityPlayer entityPlayer) {
        int n;
        BlockPos blockPos = oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3015((Entity)entityPlayer);
        BlockPos blockPos2 = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.north()");
        if (!this.Method5132(blockPos2)) {
            BlockPos blockPos3 = blockPos.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.west()");
            if (!this.Method5132(blockPos3)) {
                BlockPos blockPos4 = blockPos.east();
                Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.east()");
                if (!this.Method5132(blockPos4)) {
                    BlockPos blockPos5 = blockPos.south();
                    Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.south()");
                    if (!this.Method5132(blockPos5)) {
                        BlockPos blockPos6 = blockPos.down();
                        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"pos.down()");
                        if (!this.Method5132(blockPos6)) {
                            BlockPos blockPos7 = blockPos.up((int)((long)-728150417 ^ (long)-728150418) << 1);
                            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"pos.up(2)");
                            if (!this.Method5132(blockPos7)) {
                                n = (int)-345478620L ^ 0xEB686A25;
                                return n != 0;
                            }
                        }
                    }
                }
            }
        }
        n = (int)((long)-1050816749 ^ (long)-1050816749);
        return n != 0;
    }

    private final boolean Method5150() {
        int n;
        List list = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(oe1ITGLCYHoWTDuRDY0aGgkZ7Y5hw0lT.Method3016().up().up().up()));
        Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.getEntitiesWith\u2026sition().up().up().up()))");
        Collection collection = list;
        int n2 = (int)((long)817713091 ^ (long)817713091);
        if (!collection.isEmpty()) {
            n = (int)519114007L ^ 0x1EF10D16;
            return n != 0;
        }
        n = (int)((long)284082808 ^ (long)284082808);
        return n != 0;
    }

    private final BlockPos Method5151() {
        int n;
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!this.Method5169((EntityPlayer)entityPlayerSP)) {
            return null;
        }
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r(this);
        Map map = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().renderGlobal.damagedBlocks;
        Intrinsics.checkExpressionValueIsNotNull((Object)map, (String)"mc.renderGlobal.damagedBlocks");
        Map map2 = map;
        int n2 = (int)-202567185L ^ 0xF3ED11EF;
        Iterator iterator = map2.entrySet().iterator();
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            Map.Entry entry = iterator.next();
            Object v = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull(v, (String)"entry.value");
            map2 = ((DestroyBlockProgress)v).getPosition();
            BlockPos blockPos = map2.north();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"pos.north()");
            n2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos) ? 1 : 0;
            int n3 = (int)((long)-810514007 ^ (long)-810514007);
            int n4 = (int)-1505847899L ^ 0xA63E95A5;
            n = n2;
            int n5 = (int)-81642566L ^ 0xFB223BBA;
            if (n != 0) {
                return map2.north();
            }
            BlockPos blockPos2 = map2.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.east()");
            n2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos2) ? 1 : 0;
            n3 = (int)-1847201280L ^ 0x91E5F200;
            n4 = (int)((long)1701275228 ^ (long)1701275228);
            n = n2;
            n5 = (int)1221907066L ^ 0x48D4D27A;
            if (n != 0) {
                return map2.east();
            }
            BlockPos blockPos3 = map2.south();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.south()");
            n2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos3) ? 1 : 0;
            n3 = (int)((long)-283335433 ^ (long)-283335433);
            n4 = (int)-280638721L ^ 0xEF45CAFF;
            n = n2;
            n5 = (int)748931640L ^ 0x2CA3CA38;
            if (n != 0) {
                return map2.south();
            }
            BlockPos blockPos4 = map2.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.west()");
            n2 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos4) ? 1 : 0;
            n3 = (int)((long)-1419578360 ^ (long)-1419578360);
            n4 = (int)((long)1995637034 ^ (long)1995637034);
            n = n2;
            n5 = (int)((long)-840078943 ^ (long)-840078943);
        } while (n == 0);
        return map2.west();
    }

    private final NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 Method5152(EntityPlayer entityPlayer) {
        boolean bl = this.Method5168(entityPlayer);
        if (!bl) {
            if (this.Method5142()) {
                return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13755;
            }
            if (this.Method5141()) {
                return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13757;
            }
        } else {
            if (this.Method5141()) return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13758;
            if (this.Method5142()) return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13758;
            if (this.Method5143(entityPlayer)) {
                return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13758;
            }
            float f = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getDistance((Entity)entityPlayer);
            PlayerControllerMP playerControllerMP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
            if (f < playerControllerMP.getBlockReachDistance()) {
                return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13754;
            }
        }
        if (this.Method5169(entityPlayer)) {
            float f = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getDistance((Entity)entityPlayer);
            PlayerControllerMP playerControllerMP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
            if (f < playerControllerMP.getBlockReachDistance()) {
                return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13754;
            }
        }
        if (this.Method5169(entityPlayer)) {
            return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13758;
        }
        if (!this.Method5169(entityPlayer)) {
            float f = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getDistance((Entity)entityPlayer);
            PlayerControllerMP playerControllerMP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().playerController;
            Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
            if (f > playerControllerMP.getBlockReachDistance()) {
                return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13758;
            }
        }
        if (this.Method5169(entityPlayer)) return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13756;
        if (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD.Field14544.Field14560.Method1203() != null) return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13756;
        float f = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getDistance((Entity)entityPlayer);
        PlayerControllerMP playerControllerMP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().playerController;
        Intrinsics.checkExpressionValueIsNotNull((Object)playerControllerMP, (String)"mc.playerController");
        if (!(f < playerControllerMP.getBlockReachDistance())) return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13756;
        return NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03.Field13754;
    }

    private final void Method5153() {
        EntityPlayerSP entityPlayerSP = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        float f = entityPlayerSP.getHealth() + L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.absorptionAmount;
        Object object = this.Field13824;
        int n = (int)-807195324L ^ 0xCFE32D44;
        for (Map.Entry entry : object.entrySet()) {
            if (((Number)entry.getKey()).longValue() >= System.currentTimeMillis()) continue;
            this.Field13824.remove(entry.getKey());
            return;
        }
        if ((double)f < this.Field13781) {
            Map.Entry entry;
            entry = this.Field13824;
            Long l = System.currentTimeMillis() + (0x298A0BEEL & 0x2003F9L);
            object = this.Field13781 - (double)f;
            n = (int)((long)-1394507407 ^ (long)-1394507407);
            entry.put(l, object);
        }
        this.Field13781 = f;
    }

    private final void Method5154() {
    }

    private final void Method5155() {
        CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Field12889;
        Intrinsics.checkExpressionValueIsNotNull((Object)cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL, (String)"AutoTrap.instance");
        cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Method21(((int)725900901L ^ 0x2B445E64) != 0);
    }

    private final void Method5156() {
        CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL = CyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Field12889;
        Intrinsics.checkExpressionValueIsNotNull((Object)cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL, (String)"AutoTrap.instance");
        cyQCgNIrH5Fk8qvTDAV09ZtgulPRtDsL.Method21((boolean)((long)1385577734 ^ (long)1385577734));
    }

    private final void Method5157() {
        Intrinsics.checkExpressionValueIsNotNull(null, (String)"HoleFillerRewrite.instance");
        ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method21((boolean)((long)1350940310 ^ (long)1350940311));
    }

    private final void Method5158() {
        Intrinsics.checkExpressionValueIsNotNull(null, (String)"HoleFillerRewrite.instance");
        ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method21((boolean)((long)-177543665 ^ (long)-177543665));
    }

    private final void Method5159() {
        iOlyf0qO2tpkluftbdahtmamFIPIkMNS iOlyf0qO2tpkluftbdahtmamFIPIkMNS2 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Field13362.Method5347();
        if (iOlyf0qO2tpkluftbdahtmamFIPIkMNS2 == null) {
            Intrinsics.throwNpe();
        }
        iOlyf0qO2tpkluftbdahtmamFIPIkMNS2.Method21((boolean)((long)-966746862 ^ (long)-966746861));
    }

    private final void Method5160() {
        iOlyf0qO2tpkluftbdahtmamFIPIkMNS iOlyf0qO2tpkluftbdahtmamFIPIkMNS2 = iOlyf0qO2tpkluftbdahtmamFIPIkMNS.Field13362.Method5347();
        if (iOlyf0qO2tpkluftbdahtmamFIPIkMNS2 == null) {
            Intrinsics.throwNpe();
        }
        iOlyf0qO2tpkluftbdahtmamFIPIkMNS2.Method21((boolean)((long)860177944 ^ (long)860177944));
    }

    private final void Method5161() {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376;
        if (aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA == null) {
            Intrinsics.throwNpe();
        }
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method21(((int)1109693834L ^ 0x4224958B) != 0);
    }

    private final void Method5162() {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376;
        if (aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA == null) {
            Intrinsics.throwNpe();
        }
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method21((boolean)((long)-789486265 ^ (long)-789486265));
    }

    private final void Method5163() {
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.setVelocity(0.0, L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.motionY, 0.0);
        this.Method5166();
        if (!L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.onGround) return;
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376;
        Intrinsics.checkExpressionValueIsNotNull((Object)aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA, (String)"SurroundRewrite.instance");
        if (!aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Method35()) return;
        this.Method5167();
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA2 = AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA.Field12376;
        Intrinsics.checkExpressionValueIsNotNull((Object)aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA2, (String)"SurroundRewrite.instance");
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA2.Method21(((int)-1177177726L ^ 0xB9D5B183) != 0);
    }

    private final boolean Method5164() {
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16898.Method663();
        if (gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"MoveModifier.instance!!.stepVal");
        return qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365();
    }

    private final void Method5165() {
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16898.Method663();
        if (gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"MoveModifier.instance!!.stepVal");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method366(((int)1052594220L ^ 0x3EBD502D) != 0);
    }

    private final void Method5166() {
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16898.Method663();
        if (gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x == null) {
            Intrinsics.throwNpe();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7101();
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"MoveModifier.instance!!.stepVal");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method366(((int)-220079694L ^ 0xF2E1D9B2) != 0);
    }

    private final void Method5167() {
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindForward.pressed = (int)-283618527L ^ 0xEF185321;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindBack.pressed = (int)((long)-2017161419 ^ (long)-2017161419);
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindLeft.pressed = (int)((long)-2052161004 ^ (long)-2052161004);
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindRight.pressed = (int)2098370571L ^ 0x7D12980B;
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindSneak.pressed = (int)((long)-2122383514 ^ (long)-2122383514);
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().gameSettings.keyBindJump.pressed = (int)((long)627209058 ^ (long)627209058);
    }

    private final boolean Method5168(EntityPlayer entityPlayer) {
        int n;
        if (this.Field13795 && this.Method5169(entityPlayer) && L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getDistance((Entity)entityPlayer) < 1.0f) {
            n = (int)((long)2032929096 ^ (long)2032929097);
            return n != 0;
        }
        n = (int)-1469652492L ^ 0xA866E1F4;
        return n != 0;
    }

    private final boolean Method5169(EntityPlayer entityPlayer) {
        return AyPWGf0RtPJRELT0RVLeRLYWz01HiKiM.Method7129((Entity)entityPlayer, (boolean)((long)-494612583 ^ (long)-494612583), (boolean)((long)-790270950 ^ (long)-790270949));
    }

    private final boolean Method5170(EntityPlayer entityPlayer) {
        int n;
        if (entityPlayer.posY - L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.posY > (double)((int)((long)475326795 ^ (long)475326788))) {
            n = (int)809961485L ^ 0x3047080C;
            return n != 0;
        }
        n = (int)((long)-1264756785 ^ (long)-1264756785);
        return n != 0;
    }

    private final boolean Method5171(BlockPos blockPos) {
        IBlockState iBlockState = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.OBSIDIAN);
    }

    private final boolean Method5172(BlockPos blockPos) {
        IBlockState iBlockState = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(pos)");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.ENDER_CHEST);
    }

    public L40FBRtktxsbtpQN35DnNbJzEkW8lsuS() {
        super("Robot", "crystalpvp.cc goes dead", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2 = new cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs(this);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Field13773;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"renderers");
        this.Field13774 = cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Method6046(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2).Method6042().Method6043();
        this.Field13775 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Hole Filler", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-95721621L ^ 0xFA4B676A) != 0));
        this.Field13776 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Trap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1383887771L ^ 0x527C739A) != 0));
        this.Field13777 = this.Method54();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field13769;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"range");
        Supplier supplier = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method393();
        Intrinsics.checkExpressionValueIsNotNull((Object)supplier, (String)"range.supplierDouble");
        Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ = this.Field13777;
        Intrinsics.checkExpressionValueIsNotNull((Object)q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ, (String)"threads");
        this.Field13778 = new IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk(supplier, q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ);
        this.Field13779 = new RzBuXINbHt5tRWlCGAsjWoWk0p3hR7t2();
        this.Field13786 = (int)815014116L ^ 0x309420E5;
        this.Field13787 = (int)((long)1401884490 ^ (long)1401884481);
        this.Field13816 = "";
        this.Field13817 = "";
        this.Field13818 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field13819 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field13820 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field13824 = new HashMap();
        super.Method44(new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$1(this));
        this.Field13826 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.Field17635, new Predicate[(int)((long)-411959533 ^ (long)-411959533)]);
        this.Field13827 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr(this), new Predicate[(int)-1752108238L ^ 0x9790F332]);
    }

    public static final Minecraft Method5173() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method5174(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final boolean Method5175(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, BlockPos blockPos) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5131(blockPos);
    }

    public static final BlockPos Method5176(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13822;
    }

    public static final void Method5177(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, BlockPos blockPos) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13822 = blockPos;
    }

    public static final void Method5178(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, Entity entity) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5137(entity);
    }

    public static final boolean Method5179(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, BlockPos blockPos) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5132(blockPos);
    }

    public static final int Method5180(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13788;
    }

    public static final void Method5181(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, int n) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13788 = n;
    }

    public static final boolean Method5182(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, BlockPos blockPos) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5172(blockPos);
    }

    public static final void Method5183(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, BlockPos blockPos, boolean bl) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5147(blockPos, bl);
    }

    public static final void Method5184(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, BlockPos blockPos) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5145(blockPos);
    }

    public static final boolean Method5185(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, BlockPos blockPos) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5171(blockPos);
    }

    public static final EntityPlayer Method5186(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13780;
    }

    public static final void Method5187(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, EntityPlayer entityPlayer) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13780 = entityPlayer;
    }

    public static final NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 Method5188(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13825;
    }

    public static final void Method5189(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, NFJ69fwrRBSMOnuHrTZp3AXAGuo62M03 nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13825 = nFJ69fwrRBSMOnuHrTZp3AXAGuo62M03;
    }

    public static final BlockPos Method5190(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13823;
    }

    public static final void Method5191(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, BlockPos blockPos) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13823 = blockPos;
    }

    public static final boolean Method5192(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        return l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13810;
    }

    public static final void Method5193(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, boolean bl) {
        l40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Field13810 = bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)881302378L ^ 0x34879B6A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2000506919L ^ 0x88C2AF26);
            int n2 = ((int)1903733392L ^ 0x7178AA8B) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-887953801 ^ (long)-887953864) << 8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

