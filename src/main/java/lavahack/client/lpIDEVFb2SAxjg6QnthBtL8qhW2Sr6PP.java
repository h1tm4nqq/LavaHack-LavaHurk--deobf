//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.network.play.server.SPacketAnimation
 *  net.minecraft.network.play.server.SPacketDestroyEntities
 *  net.minecraft.network.play.server.SPacketEntityStatus
 *  net.minecraft.network.play.server.SPacketExplosion
 *  net.minecraft.network.play.server.SPacketSoundEffect
 *  net.minecraft.network.play.server.SPacketSpawnObject
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraft.world.WorldServer
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import com.mojang.authlib.GameProfile;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.Zhgf3QiCpopc7WZLbt543132rYDzfYwu;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$1;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.server.SPacketAnimation;
import net.minecraft.network.play.server.SPacketDestroyEntities;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
public class lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13973 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Safety", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field11442).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13974 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SafetyBalance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x2E1FFF80E998FBF5L ^ 0x6E1FFF80E998FBF5L), 0.0, Double.longBitsToDouble(0x20CA4898BE07BF2EL ^ 0x60EE4898BE07BF2EL), (boolean)((long)530947874 ^ (long)530947874)));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13975 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("TargetMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field9318).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13976 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("TargetRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)497238144 ^ 0x402800001DA34080L), 1.0, Double.longBitsToDouble((long)1971954024 ^ 0x403000007589A168L), (boolean)((long)-678504210 ^ (long)-678504210)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13977 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PopFocus", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1531550942L ^ 0xA4B66322) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13978 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PopFocusTimeOut", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xD2F6C9A827811A3EL ^ 0x92C8C9A827811A3EL), 0.0, Double.longBitsToDouble(0x907A473B29099D32L ^ 0xD024473B29099D32L), ((int)1087894216L ^ 0x40D7F2C9) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13979 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Predict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1257925511 ^ (long)1257925511)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13980 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PredictTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)340109512 ^ 0x400000001445A8C8L), 0.0, Double.longBitsToDouble((long)1315049511 ^ 0x403400004E621027L), (boolean)((long)-572535044 ^ (long)-572535043)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13981 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)224854881 ^ (long)224854881)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13982 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("YawStep", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC10EEA8DF10AD9CBL ^ 0x81456A8DF10AD9CBL), 1.0, Double.longBitsToDouble((long)212867646 ^ 0x406680000CB01A3EL), ((int)-1055165321L ^ 0xC11B7476) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13983 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1573505697L ^ 0x5DC9CAA0) != 0));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13984 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("SwingingHand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.Field15419).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13985 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Timings", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field17498).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field13986 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16533).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13987 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x7B88C31AD7CF0019L ^ 0x3BBCC31AD7CF0019L), 0.0, Double.longBitsToDouble(0xEC0638966435741AL ^ 0xAC3238966435741AL), ((int)388123401L ^ 0x17224B09) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13988 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PacketPlace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1991431386L ^ 0x894D2B27) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13989 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Raytrace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-212765783L ^ 0xF35173A9) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13990 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("StrictFacing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1280177035L ^ 0xB3B20C75) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13991 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("AntiStuck", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1634149937L ^ 0x61672631) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13992 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NoPlaceSuicide", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1843273437 ^ (long)1843273436)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13993 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BreakSpeed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x645ADC2C57FFC22L ^ 0x4677CBA4A3199A44L), 0.0, Double.longBitsToDouble((long)853595302 ^ 0x4034000032E0D4A6L), ((int)1857253730L ^ 0x6EB37162) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13994 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Inhibit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1232937192L ^ 0x497D20E8) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13995 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("InhibitTimeOut", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x2AC35FDEC80D7B22L ^ 0x6AFD5FDEC80D7B22L), 1.0, Double.longBitsToDouble((long)331737499 ^ 0x404E000013C5E99BL), ((int)661566835L ^ 0x276EB572) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13996 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PacketBreak", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2070430516 ^ (long)2070430517)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13997 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BreakRaytrace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1469397521 ^ (long)1469397520)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13998 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NoBreakSuicide", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1405060601L ^ 0x53BF85F8) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13999 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1578236087L ^ 0x5E11F8B7) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14000 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("InstantPacket", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-558233002L ^ 0xDEBA0A57) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14001 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("InstantSync", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1825581350L ^ 0x932FD6DA) != 0));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field14002 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Sync", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field11090).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14003 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1410434638 ^ 0x401400005411864EL), 0.0, Double.longBitsToDouble(0xCDA52647254B8D74L ^ 0x8DBD2647254B8D74L), ((int)-663684840L ^ 0xD870F918) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14004 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("PlaceWallRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1021976508 ^ 0x400800003CEA1FBCL), 0.0, Double.longBitsToDouble(0x7F51DFA96A85CB88L ^ 0x3F49DFA96A85CB88L), ((int)-1584633027L ^ 0xA18C6B3D) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14005 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BreakRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)806154494 ^ 0x40140000300CF0FEL), 0.0, Double.longBitsToDouble(0x152D63594C9C1CC1L ^ 0x553563594C9C1CC1L), ((int)2063447617L ^ 0x7AFDB641) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14006 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BreakWallRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x77BBCAD715B66998L ^ 0x37B3CAD715B66998L), 0.0, Double.longBitsToDouble(0x76F9182A920BF7A9L ^ 0x36E1182A920BF7A9L), ((int)-2079170253L ^ 0x84126133) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14007 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("FirePlace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)298659373L ^ 0x11CD2E2D) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14008 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Terrain", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1645183367 ^ (long)-1645183367)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14009 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MinPlaceDamage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x5DEFDAEE61AE9EB9L ^ 0x1DFBDAEE61AE9EB9L), 0.0, Double.longBitsToDouble(0xF11BCC7A9C8F056DL ^ 0xB159CC7A9C8F056DL), ((int)1140698409L ^ 0x43FDAD29) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14010 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MaxSelfPlace", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1350222190 ^ 0x40200000507AC16EL), 0.0, Double.longBitsToDouble(0x218A770269B50335L ^ 0x61C8770269B50335L), (boolean)((long)-1371523365 ^ (long)-1371523365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14011 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MinBreakDamage", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x2942BAF6CF602DBEL ^ 0x6956BAF6CF602DBEL), 0.0, Double.longBitsToDouble((long)1860335545 ^ 0x404200006EE277B9L), ((int)100878865L ^ 0x6034A11) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14012 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MaxSelfBreak", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1499678005 ^ 0x4020000059634535L), 0.0, Double.longBitsToDouble((long)202010014 ^ 0x404200000C0A6D9EL), ((int)-1758874293L ^ 0x9729B54B) != 0));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field14013 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this).Method3788().Method3789();
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP Field14014;
    private Thread Field14015 = null;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14016 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14017 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14018 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    @Zhgf3QiCpopc7WZLbt543132rYDzfYwu
    public EntityPlayer Field14019 = null;
    private final List Field14020 = new Vector();
    private final Map Field14021 = new ConcurrentHashMap();
    private BlockPos Field14022 = null;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field14023 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method5335, new Predicate[(int)((long)-951779286 ^ (long)-951779286)]);
    private int Field14024;

    public lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP() {
        super("Kys+", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338, (boolean)((long)562412258 ^ (long)562412259));
    }

    @Override
    public void Method38() {
        super.Method38();
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field14016.Method2801();
            this.Field14017.Method2801();
            this.Field14018.Method2801();
            this.Method5319();
            this.Method5308();
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
            return;
        }
        this.Method21((boolean)((long)-2018216681 ^ (long)-2018216681));
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
        this.Field14015.interrupt();
        this.Field14015 = null;
        this.Field14016.Method2801();
        this.Field14017.Method2801();
        this.Field14018.Method2801();
        this.Field14019 = null;
        this.Field14021.clear();
        this.Field14022 = null;
    }

    @Override
    public void Method45() {
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1560(this::Method5338);
            return;
        }
        this.Method21(((int)-1399776280L ^ 0xAC911BE8) != 0);
    }

    private void Method5308() {
        AtomicBoolean atomicBoolean = new AtomicBoolean((boolean)((long)1581177622 ^ (long)1581177623));
        this.Field14015 = new Thread(() -> this.Method5337(atomicBoolean));
        this.Field14015.start();
    }

    private void Method5309(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, boolean bl) throws InterruptedException {
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16532) {
            if (this.Field13985.Method341() != lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field17499) {
                this.Method5311((boolean)((long)-1337092489 ^ (long)-1337092490));
                this.Method5310(((int)-787788742L ^ 0xD10B4C3B) != 0);
                return;
            }
            if (!bl) {
                v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1561(Math.round(Double.longBitsToDouble(0x999F1DF536438F08L ^ 0xD9105DF536438F08L) - Double.longBitsToDouble((long)397524082 ^ 0x4049000017B1BC72L) * this.Field13987.Method367()));
            }
            this.Method5311((boolean)((long)-450702741 ^ (long)-450702741));
            v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1561(Math.round(Double.longBitsToDouble((long)1048896347 ^ 0x408F40003E84E35BL) - Double.longBitsToDouble((long)1962826449 ^ 0x4049000074FE5AD1L) * this.Field13993.Method367()));
            this.Method5310(((int)-640826628L ^ 0xD9CDC2FC) != 0);
            return;
        }
        if (this.Field13985.Method341() != lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Field17499) {
            this.Method5310((boolean)((long)-1177076933 ^ (long)-1177076934));
            this.Method5311(((int)-1697237246L ^ 0x9AD63703) != 0);
            return;
        }
        if (!bl) {
            v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1561(Math.round(Double.longBitsToDouble((long)1974387358 ^ 0x408F400075AEC29EL) - Double.longBitsToDouble((long)1894271406 ^ 0x4049000070E849AEL) * this.Field13993.Method367()));
        }
        this.Method5310(((int)-1256316928L ^ 0xB51E2000) != 0);
        v0g8pW3GlhMbLHzjgWkgyF5NX5bzTTO2.Method1561(Math.round(Double.longBitsToDouble((long)1141696444 ^ 0x408F4000440CE7BCL) - Double.longBitsToDouble((long)1351288872 ^ 0x40490000508B0828L) * this.Field13987.Method367()));
        this.Method5311((boolean)((long)-919894280 ^ (long)-919894280));
    }

    private void Method5310(boolean bl) {
        if (bl && !this.Field14017.Method2797(Math.round(Double.longBitsToDouble((long)419740390 ^ 0x408F40001904BAE6L) - Double.longBitsToDouble((long)1315442283 ^ 0x404900004E680E6BL) * this.Field13993.Method367()))) {
            return;
        }
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = this.Method5320();
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == null) {
            return;
        }
        this.Method5314(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4036());
        this.Field14021.put(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4036(), System.currentTimeMillis());
        if (this.Field14002.Method341() == lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field11089) {
            this.Method5318(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4036());
        }
        if (!bl) return;
        this.Field14017.Method2801();
    }

    private void Method5311(boolean bl) {
        if (bl && !this.Field14016.Method2797(Math.round(Double.longBitsToDouble(0x5933E4FAAC41B9FAL ^ 0x19BCA4FAAC41B9FAL) - Double.longBitsToDouble(0x4A2BA96A907EF105L ^ 0xA62A96A907EF105L) * this.Field13987.Method367()))) {
            return;
        }
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = this.Method5321();
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV == null) {
            this.Field14022 = null;
            return;
        }
        this.Field14022 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6401();
        this.Method5312(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6401());
        this.Field14020.add(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (!bl) return;
        this.Field14016.Method2801();
    }

    private void Method5312(BlockPos blockPos) {
        RayTraceResult rayTraceResult = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4206(), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(0x80FA790D24C56BC4L ^ 0xBF1A790D24C56BC4L), (double)blockPos.getY() + Double.longBitsToDouble(0xF793B65BE82D61BL ^ 0x30993B65BE82D61BL), (double)blockPos.getZ() + Double.longBitsToDouble(0x68FD8A3F9859D15CL ^ 0x571D8A3F9859D15CL)));
        EnumFacing enumFacing = rayTraceResult == null ? (this.Field13990.Method365() ? EnumFacing.UP : EnumFacing.DOWN) : (this.Field13989.Method365() ? rayTraceResult.sideHit : (this.Field13990.Method365() ? EnumFacing.UP : EnumFacing.DOWN));
        float[] fArray = new float[(int)((long)727531535 ^ (long)727531534) << 1];
        fArray[(int)((long)-1496091510 ^ (long)-1496091510)] = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        fArray[(int)1000746306L ^ 0x3BA62D43] = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        float[] fArray2 = fArray;
        float[] fArray3 = YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4300(blockPos);
        if (this.Field13981.Method365()) {
            this.Method5316(fArray3, fArray2);
        }
        if (this.Field13988.Method365()) {
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, this.Method5313(), 0.0f, 0.0f, 0.0f));
        } else {
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.processRightClickBlock(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos, enumFacing, new Vec3d(0.0, 0.0, 0.0), this.Method5313());
        }
        if (!this.Field13981.Method365()) return;
        this.Method5316(fArray2, fArray3);
    }

    public EnumHand Method5313() {
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() == Items.END_CRYSTAL) {
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
            return EnumHand.MAIN_HAND;
        }
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemOffhand().getItem() != Items.END_CRYSTAL) return null;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.syncCurrentPlayItem();
        return EnumHand.OFF_HAND;
    }

    private void Method5314(EntityEnderCrystal entityEnderCrystal) {
        float[] fArray = new float[(int)((long)-119735164 ^ (long)-119735163) << 1];
        fArray[(int)((long)171324426 ^ (long)171324426)] = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        fArray[(int)492791409L ^ 0x1D5F6670] = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        float[] fArray2 = fArray;
        float[] fArray3 = YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4299((Entity)entityEnderCrystal);
        if (this.Field13981.Method365()) {
            this.Method5316(fArray3, fArray2);
        }
        if (this.Field13996.Method365()) {
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketUseEntity((Entity)entityEnderCrystal));
        } else {
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.attackEntity((EntityPlayer)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Entity)entityEnderCrystal);
        }
        this.Method5315();
        if (!this.Field13981.Method365()) return;
        this.Method5316(fArray2, fArray3);
    }

    private void Method5315() {
        int n;
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.HASTE)) {
            n = ((int)((long)1804988421 ^ (long)1804988422) << 1) - ((int)((long)261144719 ^ (long)261144718) + lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.HASTE).getAmplifier());
        } else {
            int n2 = n = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(MobEffects.MINING_FATIGUE) ? (((int)1563938718L ^ 0x5D37CF9D) << 1) + (((int)507164972L ^ 0x1E3AB92D) + lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActivePotionEffect(MobEffects.MINING_FATIGUE).getAmplifier()) * (((int)-1135898771L ^ 0xBC4B8F6C) << 1) : ((int)-1320681875L ^ 0xB147FE6E) << 1;
        }
        if (this.Field13983.Method365() && (!lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSwingInProgress || lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt >= n / ((int)((long)1279852139 ^ (long)1279852138) << 1) || lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt < 0)) {
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingProgressInt = (int)((long)-1291161689 ^ (long)1291161688);
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isSwingInProgress = (int)((long)1450989249 ^ (long)1450989248);
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingingHand = ((lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)this.Field13984.Method341()).Method6229();
            if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.world instanceof WorldServer) {
                ((WorldServer)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.world).getEntityTracker().sendToTracking((Entity)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, (Packet)new SPacketAnimation((Entity)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, ((lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)this.Field13984.Method341()).Method6229() == EnumHand.OFF_HAND ? (int)((long)-1720330739 ^ (long)-1720330738) : (int)((long)-1260582891 ^ (long)-1260582891)));
            }
        }
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketAnimation(((lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS)this.Field13984.Method341()).Method6229()));
    }

    private void Method5316(float[] fArray, float[] fArray2) {
        float f;
        if (this.Field13982.Method335() >= (int)((long)1744998204 ^ (long)1744998161) << 3) {
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[(int)((long)-250084551 ^ (long)-250084551)], fArray[(int)893503791L ^ 0x3541C92E], lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = fArray[(int)2039131972L ^ 0x798AAF44];
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = fArray[(int)((long)-710157422 ^ (long)-710157421)];
            return;
        }
        float f2 = MathHelper.wrapDegrees((float)(fArray2[(int)316952602L ^ 0x12E4501A] - fArray[(int)-163763092L ^ 0xF63D2C6C]));
        if (f2 < (f = MathHelper.wrapDegrees((float)(fArray[(int)59383374L ^ 0x38A1E4E] - fArray2[(int)((long)227225310 ^ (long)227225310)])))) {
            float f3 = Math.abs(f2) / this.Field13982.Method368();
            float f4 = 0.0f;
            int n = (int)((long)-1773253679 ^ (long)-1773253679);
            while (true) {
                if (f4 < Math.abs(f2)) {
                    lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = fArray[(int)((long)521575137 ^ (long)521575137)];
                    lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = fArray[(int)2072857975L ^ 0x7B8D4D76];
                    return;
                }
                lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[(int)-1310907290L ^ 0xB1DD2466] - (float)n * f3, fArray[(int)-1387037119L ^ 0xAD537E40], lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
                f4 += f3;
                ++n;
            }
        }
        float f5 = Math.abs(f) / this.Field13982.Method368();
        float f6 = 0.0f;
        int n = (int)1935370690L ^ 0x735B69C2;
        while (true) {
            if (f6 < Math.abs(f)) {
                lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedYaw = fArray[(int)((long)1137719923 ^ (long)1137719923)];
                lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.lastReportedPitch = fArray[(int)((long)1106129194 ^ (long)1106129195)];
                return;
            }
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[(int)1672789107L ^ 0x63B4BC73] + (float)n * f5, fArray[(int)((long)1290087329 ^ (long)1290087328)], lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
            f6 += f5;
            ++n;
        }
    }

    private void Method5317(int n) {
        Entity entity = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID(n);
        if (entity instanceof EntityEnderCrystal) {
            this.Field14021.put((EntityEnderCrystal)entity, System.currentTimeMillis());
        }
        if (!this.Field14000.Method365() && entity instanceof EntityEnderCrystal) {
            this.Method5314((EntityEnderCrystal)entity);
            if (!this.Field14001.Method365()) return;
            this.Method5318((EntityEnderCrystal)entity);
            return;
        }
        CPacketUseEntity cPacketUseEntity = new CPacketUseEntity();
        cPacketUseEntity.entityId = n;
        cPacketUseEntity.action = CPacketUseEntity.Action.ATTACK;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketUseEntity);
        this.Method5315();
    }

    private void Method5318(EntityEnderCrystal entityEnderCrystal) {
        entityEnderCrystal.setDead();
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5334(entityEnderCrystal));
    }

    private void Method5319() {
        this.Field14019 = this.Method5323();
        if (!this.Field13979.Method365()) return;
        this.Field14019 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5329(this.Field14019, this.Field13980.Method335());
    }

    private lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method5320() {
        if (this.Field14019 == null) {
            return null;
        }
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null, Double.longBitsToDouble((long)1307899945 ^ 0xBFF000004DF4F829L), Double.longBitsToDouble((long)1910717184 ^ 0xBFF0000071E33B00L));
        for (Entity entity : lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList) {
            EntityEnderCrystal entityEnderCrystal;
            if (!(entity instanceof EntityEnderCrystal) || !this.Method5328((Entity)(entityEnderCrystal = (EntityEnderCrystal)entity), this.Field14005.Method367(), this.Field14006.Method367()) || this.Field13997.Method365() && !lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen((Entity)entityEnderCrystal) || this.Field13994.Method365() && this.Field14021.containsKey(entityEnderCrystal)) continue;
            double d = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)this.Field14019, this.Field14008.Method365());
            double d2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, entityEnderCrystal.posX, entityEnderCrystal.posY, entityEnderCrystal.posZ, (Entity)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
            if (this.Field13998.Method365() && d2 >= (double)(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) || (d = this.Method5322(d, d2)) < this.Field14011.Method367() || d2 > this.Field14012.Method367()) continue;
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(entityEnderCrystal, d, d2);
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4039(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
        }
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4037() < 0.0) {
            return null;
        }
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi3 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        return lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi3;
    }

    private lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV Method5321() {
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(BlockPos.ORIGIN, Double.longBitsToDouble((long)308410921 ^ 0xBFF000001261FA29L), Double.longBitsToDouble(0x39D2E1A717D0EDD9L ^ 0x8622E1A717D0EDD9L));
        for (BlockPos blockPos : vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7758(this.Field14003.Method368(), (boolean)((long)621721425 ^ (long)621721424), (boolean)((long)-215483360 ^ (long)-215483360))) {
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2;
            if (!this.Method5327(blockPos, this.Field14003.Method367(), this.Field14004.Method367()) || !vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7755(blockPos, (boolean)((long)-318637510 ^ (long)-318637509), ((int)-875090988L ^ 0xCBD72BD5) != 0, (boolean)((long)873318303 ^ (long)873318303), this.Field14007.Method365()) || this.Field13989.Method365() && !EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(blockPos)) continue;
            double d = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos.getX() + Double.longBitsToDouble((long)2114228470 ^ 0x3FE000007E0490F6L), blockPos.getY() + ((int)-343520458L ^ 0xEB864B37), (double)blockPos.getZ() + Double.longBitsToDouble((long)240512014 ^ 0x3FE000000E55EC0EL), (Entity)this.Field14019, this.Field14008.Method365());
            double d2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos.getX() + Double.longBitsToDouble((long)766968331 ^ 0x3FE000002DB7020BL), blockPos.getY() + (int)((long)813087481 ^ (long)813087480), (double)blockPos.getZ() + Double.longBitsToDouble((long)2022764637 ^ 0x3FE000007890F05DL), (Entity)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
            if (this.Field13991.Method365() && !lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, (AxisAlignedBB)(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = new AxisAlignedBB((double)(blockPos.getX() - (int)((long)-801242423 ^ (long)-801242424)), (double)blockPos.getY() - Double.longBitsToDouble(0xA2E65302B2CADAD4L ^ 0x9D065302B2CADAD4L), (double)(blockPos.getZ() - (int)((long)-859910795 ^ (long)-859910796)), (double)(blockPos.getX() + ((int)((long)-1814912831 ^ (long)-1814912832) << 1)), (double)(blockPos.getY() + (int)((long)1613696945 ^ (long)1613696944)), (double)(blockPos.getZ() + ((int)((long)20730652 ^ (long)20730653) << 1))))).isEmpty() || this.Field13992.Method365() && d2 >= (double)(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() - lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount()) || (d = this.Method5322(d, d2)) < this.Field14009.Method367() || d2 > this.Field14010.Method367()) continue;
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(blockPos, d, d2);
            lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6404(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV2);
        }
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method6405(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) < 0.0) {
            return null;
        }
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
        return lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV3;
    }

    private double Method5322(double d, double d2) {
        switch (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$1.Field13218[((lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)this.Field13973.Method341()).ordinal()]) {
            case 1: {
                return d;
            }
            case 2: {
                return d - d2;
            }
            case 3: {
                return d + this.Field13974.Method367() * Double.longBitsToDouble((long)157535746 ^ 0x3FE000000963CE02L) - (d2 + this.Field13974.Method367());
            }
        }
        return d;
    }

    private EntityPlayer Method5323() {
        EntityPlayer entityPlayer = null;
        double d = Double.longBitsToDouble(0xE7153150EF3C3112L ^ 0xA7573150EF3C3112L);
        double d2 = Double.longBitsToDouble((long)1487056093 ^ 0x3FE0000058A2ACDDL);
        double d3 = this.Field13976.Method367() + 1.0;
        Iterator iterator = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer2 = (EntityPlayer)iterator.next();
            if (this.Method5325(entityPlayer2, this.Field13976.Method367())) continue;
            double d4 = entityPlayer2.getHealth() + entityPlayer2.getAbsorptionAmount();
            double d5 = this.Method5326(entityPlayer2);
            double d6 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer2);
            if (this.Field13975.Method341() == lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field9318 && d6 < d3) {
                entityPlayer = entityPlayer2;
                d3 = d6;
                continue;
            }
            if (this.Field13975.Method341() == lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field9319 && d4 < d) {
                entityPlayer = entityPlayer2;
                d3 = d4;
                continue;
            }
            if (this.Field13975.Method341() != lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Field9320 || !(d5 > d2)) continue;
            entityPlayer = entityPlayer2;
            d2 = d5;
        }
        return entityPlayer;
    }

    private AxisAlignedBB Method5324(double d) {
        return new AxisAlignedBB(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX - d, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - d, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ - d, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + d, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + d, lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + d);
    }

    private boolean Method5325(EntityPlayer entityPlayer, double d) {
        int n;
        if (!((double)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((Entity)entityPlayer) > d || entityPlayer.equals((Object)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) || entityPlayer.getHealth() <= 0.0f || entityPlayer.isDead || n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(entityPlayer.getName()))) {
            n = (int)((long)-283799011 ^ (long)-283799011);
            return n != 0;
        }
        n = (int)((long)733657470 ^ (long)733657471);
        return n != 0;
    }

    private float Method5326(EntityPlayer entityPlayer) {
        float f = Float.intBitsToFloat((int)((long)1009390062 ^ (long)53088750));
        Iterator iterator = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7758(this.Field14003.Method368(), ((int)1577443683L ^ 0x5E05E162) != 0, (boolean)((long)804979879 ^ (long)804979879)).iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (!this.Method5327(blockPos, this.Field14003.Method367(), this.Field14004.Method367()) || !vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7755(blockPos, (boolean)((long)-289829737 ^ (long)-289829738), ((int)1985981858L ^ 0x765FADA3) != 0, (boolean)((long)1387593842 ^ (long)1387593842), this.Field14007.Method365())) continue;
            f = Math.max(f, vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (double)blockPos.getX() + Double.longBitsToDouble(0xA892733BAA201D4EL ^ 0x9772733BAA201D4EL), blockPos.getY() + (int)((long)35144381 ^ (long)35144380), (double)blockPos.getZ() + Double.longBitsToDouble((long)629478382 ^ 0x3FE00000258513EEL), (Entity)entityPlayer, this.Field14008.Method365()));
        }
        return f;
    }

    private boolean Method5327(BlockPos blockPos, double d, double d2) {
        int n;
        double d3 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)blockPos.getX() + Double.longBitsToDouble(0x3450FCF9CCACFDFL ^ 0x3CA50FCF9CCACFDFL), (double)blockPos.getY() + Double.longBitsToDouble((long)1420108837 ^ 0x3FE0000054A52425L), (double)blockPos.getZ() + Double.longBitsToDouble(0x3AF4D925FA833449L ^ 0x514D925FA833449L));
        double d4 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(blockPos) ? d : d2;
        if (d3 <= d4) {
            n = (int)((long)1707649393 ^ (long)1707649392);
            return n != 0;
        }
        n = (int)((long)1456792359 ^ (long)1456792359);
        return n != 0;
    }

    private boolean Method5328(Entity entity, double d, double d2) {
        int n;
        double d3 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity);
        double d4 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.canEntityBeSeen(entity) ? d : d2;
        if (d3 <= d4) {
            n = (int)((long)-474562621 ^ (long)-474562622);
            return n != 0;
        }
        n = (int)1484899217L ^ 0x5881C391;
        return n != 0;
    }

    private static EntityPlayer Method5329(EntityPlayer entityPlayer, int n) {
        AxisAlignedBB axisAlignedBB = entityPlayer.getEntityBoundingBox();
        double d = entityPlayer.posX;
        double d2 = entityPlayer.posY;
        double d3 = entityPlayer.posZ;
        double d4 = entityPlayer.motionX;
        double d5 = entityPlayer.motionY;
        double d6 = entityPlayer.motionZ;
        int n2 = (int)((long)1856231455 ^ (long)1856231454);
        int n3 = (int)-1545343253L ^ 0xA3E3EEEA;
        for (int i = (int)((long)-1773101097 ^ (long)-1773101097); i < n; ++i) {
            axisAlignedBB.offset(d4, d5, d6);
            if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5331(axisAlignedBB, new Vec3d(d += d4, d2 += d5, d3 += d6), d4, d5, d6)) {
                d -= d4;
                d2 -= d5;
                d3 -= d6;
                axisAlignedBB.offset(-d4, -d5, -d6);
                n3 = (int)2004809291L ^ 0x777EF64B;
                continue;
            }
            if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5330(axisAlignedBB, new Vec3d(d, d2, d3), d4, d5, d6)) {
                d -= d4;
                d2 -= d5;
                d3 -= d6;
                axisAlignedBB.offset(-d4, -d5, -d6);
                n2 = (int)1495528332L ^ 0x5923F38C;
                continue;
            }
            d4 += Double.longBitsToDouble((long)1483607087 ^ 0x3FE99999C1F795B5L);
            d6 += Double.longBitsToDouble((long)1067008454 ^ 0x3FE99999A600D85CL);
            d5 *= d5 < 0.0 ? Double.longBitsToDouble((long)1835445181 ^ 0x3FF266660B00CDDBL) : Double.longBitsToDouble(0x17CEC7DFDBCC5132L ^ 0x2828A1B9BDAA3754L);
        }
        EntityOtherPlayerMP entityOtherPlayerMP = new EntityOtherPlayerMP((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new GameProfile(entityPlayer.getUniqueID(), entityPlayer.getName()));
        entityOtherPlayerMP.setPosition(d, d2, d3);
        entityOtherPlayerMP.inventory.copyInventory(entityPlayer.inventory);
        entityOtherPlayerMP.setHealth(entityPlayer.getHealth());
        entityOtherPlayerMP.prevPosX = entityPlayer.prevPosX;
        entityOtherPlayerMP.prevPosY = entityPlayer.prevPosY;
        entityOtherPlayerMP.prevPosZ = entityPlayer.prevPosZ;
        Iterator iterator = entityPlayer.getActivePotionEffects().iterator();
        while (iterator.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)iterator.next();
            entityOtherPlayerMP.addPotionEffect(potionEffect);
        }
        return entityOtherPlayerMP;
    }

    private static boolean Method5330(AxisAlignedBB axisAlignedBB, Vec3d vec3d, double d, double d2, double d3) {
        int n;
        boolean bl = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d);
        if (d2 * d2 > d * d + d3 * d3) {
            n = (int)-30861416L ^ 0xFE291799;
            return bl &= n;
        }
        n = (int)((long)-1822072371 ^ (long)-1822072371);
        return bl &= n;
    }

    private static boolean Method5331(AxisAlignedBB axisAlignedBB, Vec3d vec3d, double d, double d2, double d3) {
        int n;
        boolean bl = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), vec3d);
        bl |= lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.Method5332(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ), vec3d);
        if (d * d + d3 * d3 > d2 * d2) {
            n = (int)((long)-1836276408 ^ (long)-1836276407);
            return bl &= n;
        }
        n = (int)212752009L ^ 0xCAE5689;
        return bl &= n;
    }

    private static boolean Method5332(WorldClient worldClient, Vec3d vec3d, Vec3d vec3d2) {
        int n;
        RayTraceResult rayTraceResult = worldClient.rayTraceBlocks(vec3d, vec3d2, (boolean)((long)-1145490174 ^ (long)-1145490174), (boolean)((long)-68400770 ^ (long)-68400769), ((int)-703586209L ^ 0xD610205F) != 0);
        if (rayTraceResult == null) {
            return ((int)242377486L ^ 0xE72630F) != 0;
        }
        if (worldClient.getBlockState(rayTraceResult.getBlockPos()).getBlock() != Blocks.AIR) {
            n = (int)699436324L ^ 0x29B08D25;
            return n != 0;
        }
        n = (int)((long)409609081 ^ (long)409609081);
        return n != 0;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5333(RenderWorldLastEvent renderWorldLastEvent) {
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        if (this.Field14022 == null) {
            return;
        }
        this.Field14013.Method3805(this.Field14022);
    }

    private static void Method5334(EntityEnderCrystal entityEnderCrystal) {
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity((Entity)entityEnderCrystal);
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntityDangerously((Entity)entityEnderCrystal);
    }

    private void Method5335(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        Object object;
        SPacketSoundEffect sPacketSoundEffect;
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSoundEffect && (sPacketSoundEffect = (SPacketSoundEffect)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getCategory() == SoundCategory.BLOCKS && sPacketSoundEffect.getSound() == SoundEvents.ENTITY_GENERIC_EXPLODE) {
            object = new HashSet();
            this.Field14021.forEach((arg_0, arg_1) -> this.Method5336(sPacketSoundEffect, (Set)object, arg_0, arg_1));
            EntityEnderCrystal entityEnderCrystal = object.iterator();
            while (entityEnderCrystal.hasNext()) {
                EntityEnderCrystal entityEnderCrystal2 = (EntityEnderCrystal)entityEnderCrystal.next();
                this.Field14021.remove(entityEnderCrystal2);
            }
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketExplosion) {
            sPacketSoundEffect = (SPacketExplosion)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
            for (EntityEnderCrystal entityEnderCrystal : lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(EntityEnderCrystal.class, new AxisAlignedBB(new BlockPos(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ())))) {
                this.Field14021.remove(entityEnderCrystal);
                if (this.Field14002.Method341() != lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field11090) continue;
                this.Method5318(entityEnderCrystal);
            }
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketDestroyEntities) {
            sPacketSoundEffect = (SPacketDestroyEntities)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
            object = sPacketSoundEffect.getEntityIDs();
            int n = ((int[])object).length;
            for (int i = (int)-1156975266L ^ 0xBB09F55E; i < n; ++i) {
                Object object2 = object[i];
                Entity entity = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntityByID((int)object2);
                if (!(entity instanceof EntityEnderCrystal)) {
                    return;
                }
                EntityEnderCrystal entityEnderCrystal = (EntityEnderCrystal)entity;
                this.Field14021.remove(entityEnderCrystal);
                if (this.Field14002.Method341() != lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field11090) continue;
                this.Method5318(entityEnderCrystal);
            }
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketEntityStatus && (sPacketSoundEffect = (SPacketEntityStatus)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getOpCode() == ((int)-206876618L ^ 0xF3AB5015) && sPacketSoundEffect.getEntity((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world) instanceof EntityPlayer && this.Field13977.Method365() && (double)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(sPacketSoundEffect.getEntity((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world)) <= this.Field13976.Method367()) {
            this.Field14019 = (EntityPlayer)sPacketSoundEffect.getEntity((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
            this.Field14018.Method2801();
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSpawnObject)) return;
        if (!this.Field13999.Method365()) return;
        sPacketSoundEffect = (SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (sPacketSoundEffect.getType() != (int)((long)-1457158018 ^ (long)-1457158067)) {
            return;
        }
        if (!this.Method5327(new BlockPos(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()), this.Field14005.Method367(), this.Field14006.Method367())) {
            return;
        }
        if (this.Field13997.Method365() && EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1917(new BlockPos(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()))) {
            return;
        }
        double d = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ(), (Entity)this.Field14019, this.Field14008.Method365());
        double d2 = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7759((World)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ(), (Entity)lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14008.Method365());
        if (this.Field13998.Method365() && d2 >= (double)(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHealth() + lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getAbsorptionAmount())) {
            return;
        }
        if ((d = this.Method5322(d, d2)) < this.Field14011.Method367()) {
            return;
        }
        if (d2 > this.Field14012.Method367()) {
            return;
        }
        this.Method5317(sPacketSoundEffect.getEntityID());
    }

    private void Method5336(SPacketSoundEffect sPacketSoundEffect, Set set, EntityEnderCrystal entityEnderCrystal, Long l) {
        if (entityEnderCrystal.getDistance(sPacketSoundEffect.getX(), sPacketSoundEffect.getY(), sPacketSoundEffect.getZ()) >= Double.longBitsToDouble(0x1BD9AA39FB5CC81AL ^ 0x5BC1AA39FB5CC81AL)) {
            return;
        }
        set.add(entityEnderCrystal);
        if (this.Field14002.Method341() != lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field11090) return;
        this.Method5318(entityEnderCrystal);
    }

    private void Method5337(AtomicBoolean atomicBoolean) {
        while (!Thread.currentThread().isInterrupted()) {
            if (this.Method5313() == null) {
                atomicBoolean.set((boolean)((long)-925299305 ^ (long)-925299306));
                continue;
            }
            this.Method5309((lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field13986.Method341(), atomicBoolean.get());
            atomicBoolean.set(((int)-282544789L ^ 0xEF28B56B) != 0);
        }
    }

    private void Method5338() {
        long l = (long)this.Field13995.Method335() * (0x44021437L & 0x1088832L);
        this.Field14021.forEach((arg_0, arg_1) -> this.Method5339(l, arg_0, arg_1));
        if (this.Field13977.Method365() && !this.Field14018.Method2797((long)this.Field13978.Method335() * (0x600A30B2L & 0xA900132L))) {
            return;
        }
        this.Method5319();
    }

    private void Method5339(long l, EntityEnderCrystal entityEnderCrystal, Long l2) {
        if (System.currentTimeMillis() - l2 < l) return;
        this.Field14021.remove(entityEnderCrystal);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1451669861L ^ 0xA979469B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1676547967L ^ 0x9C11E87E);
            int n2 = ((int)1284620969L ^ 0x4C91C2E8) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-2136145317L ^ 0x80AD12A0) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

