//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityEnderPearl
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.monster.EntitySlime
 *  net.minecraft.entity.passive.EntityAnimal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.c329TsrwyQaghkrpEAKnYsAuVtEEsCMs;
import lavahack.client.n3ZtgZxSSwDbWCMM9okOMbPKPncqimzh;
import lavahack.client.n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class j2ejTRqCYqWkD6r8LQZuO6mOB2OwagRH
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17709 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)506507437 ^ 0x404000001E30B0ADL), Double.longBitsToDouble((long)189560537 ^ 0x402000000B4C76D9L), Double.longBitsToDouble(0x95F857D425D4FAA7L ^ 0xD5A857D425D4FAA7L), (boolean)((long)-1686026962 ^ (long)-1686026961)));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17710 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, n3ZtgZxSSwDbWCMM9okOMbPKPncqimzh.Field15780));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field17711 = this.Method54();
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field17712 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Types", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17713 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystals", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2015797520 ^ (long)-2015797519))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17714 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Players", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)140242059L ^ 0x85BEC8B) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17715 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Friends", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1432796926L ^ 0xAA994103) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17716 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mobs", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1843572230 ^ (long)1843572230))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17717 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Animals", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1001653585 ^ (long)-1001653585))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17718 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ender Pearls", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1431148736 ^ (long)-1431148736))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17719 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items(Entity)", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1127618820 ^ (long)1127618820))));
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17720 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1409261499L ^ 0x53FF9FBA) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17721 = this.Method23(this.Field17712.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Items Fix", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1483800652L ^ 0x5871004C) != 0).Method313(this.Field17720::Method365)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field17722 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Config", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17723 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Animation Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 1.0, Double.longBitsToDouble(0x3CF4068CC7BDAC14L ^ 0x7CD0068CC7BDAC14L), ((int)-961226470L ^ 0xC6B4D91A) != 0).Method313(this::Method7703)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17724 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Blur", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)663597243 ^ (long)663597242)).Method313(this::Method7702)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17725 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Radius", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x63671FA11230387L ^ 0x463671FA11230387L), Double.longBitsToDouble(0xF79F20385961F05FL ^ 0xC826B9A1F961F05FL), Double.longBitsToDouble(0x951E4815FDA1E7D9L ^ 0xD53A4815FDA1E7D9L), (boolean)((long)1790761413 ^ (long)1790761413))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17726 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mix", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)1223603086L ^ 0x48EEB38E) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17727 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Red", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)1727989439L ^ 0x66FF06BF) != 0).Method313(this::Method7701)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17728 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Green", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, (boolean)((long)-195486768 ^ (long)-195486768)).Method313(this::Method7700)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17729 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Blue", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, ((int)1302896566L ^ 0x4DA89FB6) != 0).Method313(this::Method7699)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17730 = this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RainBow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1583997892L ^ 0xA1961C3D) != 0).Method313(this::Method7698));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17731 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x63AAA5FA8F0DB040L ^ 0x23F3A5FA8F0DB040L), 1.0, Double.longBitsToDouble((long)610144672 ^ 0x409F4000245E11A0L), (boolean)((long)42776896 ^ (long)42776897))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17732 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Saturation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)649803420 ^ 0x4042000026BB369CL), 0.0, Double.longBitsToDouble(0x813B4E8776CC154BL ^ 0xC1624E8776CC154BL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9942)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17733 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Brightness", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)567319226 ^ 0x4059000021D09ABAL), 0.0, Double.longBitsToDouble(0xFECC31CE3E38A4E8L ^ 0xBE9531CE3E38A4E8L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9942)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17734 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Quality", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0xF6FB58A3A4E228FAL ^ 0xB6CF58A3A4E228FAL), (boolean)((long)-1819300037 ^ (long)-1819300037))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17735 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Gradient Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1270211505 ^ (long)-1270211505)).Method313(this::Method7697)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17736 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Alpha Gradient Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1185766730 ^ 0x406FE00046AD5D4AL), 0.0, Double.longBitsToDouble((long)324306708 ^ 0x406FE00013548714L), ((int)610094956L ^ 0x245D4F6D) != 0).Method313(this::Method7696)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17737 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Duplicate Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)231265446 ^ 0x403400000DC8D4A6L), ((int)388948033L ^ 0x172EE041) != 0).Method313(this::Method7695)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17738 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("More Gradient", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0x391CEAD11B9AF3D4L ^ 0x7938EAD11B9AF3D4L), ((int)1163667237L ^ 0x455C2725) != 0).Method313(this::Method7694)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17739 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Creepy", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)1137063177 ^ 0x4034000043C63509L), (boolean)((long)-1192963422 ^ (long)-1192963422)).Method313(this::Method7693)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17740 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, 1.0, (boolean)((long)782540915 ^ (long)782540915)).Method313(this::Method7692)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17741 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Num Octaves", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)108690182 ^ 0x40140000067A7B06L), 1.0, Double.longBitsToDouble(0xAFE3501A874CD51FL ^ 0xEFDD501A874CD51FL), ((int)-81197653L ^ 0xFB2905AA) != 0).Method313(this::Method7691)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17742 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xF2CEC47E3331BB6EL ^ 0xCD775DE7AAA822F4L), Double.longBitsToDouble(0x9223CB564BDC633EL ^ 0xAD73A91B992DCAC2L), Double.longBitsToDouble((long)646538367 ^ 0x3FB99999BF10FDE5L), (boolean)((long)-537713530 ^ (long)-537713530)).Method313(this::Method7690)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17743 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x9AC3925A676D7A4BL ^ 0xA51A0BC3FEF4E3D1L), 0.0, 1.0, ((int)475423591L ^ 0x1C566367) != 0).Method313(this::Method7689)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17744 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow Strength", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xA46B707543F488B5L ^ 0x9BB8434670C7BB86L), 0.0, 1.0, ((int)2101134418L ^ 0x7D3CC452) != 0).Method313(this::Method7688)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17745 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow Saturation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1164330258 ^ 0x3FE0000045664512L), 0.0, 1.0, (boolean)((long)2132745802 ^ (long)2132745802)).Method313(this::Method7687)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17746 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color 1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)580892171 ^ (long)580892404), (int)((long)-1188876306 ^ (long)-1188876306), (int)((long)-1960238431 ^ (long)-1960238431), (int)((long)-164092200 ^ (long)-164092377)))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17747 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)1561196421 ^ (long)1561196410), (int)-1275399552L ^ 0xB3FAF280, (int)1385568572L ^ 0x5296193C, (int)2041961317L ^ 0x79B5DB9A))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17748 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Filled Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1714341538 ^ (long)-1714341471), (int)((long)1514933670 ^ (long)1514933670), (int)((long)1485297693 ^ (long)1485297693), (int)-577397970L ^ 0xDD959BD1))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17749 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-857003964 ^ (long)-857003845), (int)((long)588329964 ^ (long)588329964), (int)1363913495L ^ 0x514BAB17, (int)((long)-30211859 ^ (long)-30212078)))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17750 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Alpha", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)353237112L ^ 0x150DF879) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17751 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Filled", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1918551707L ^ 0x725AC69B) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17752 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow Filled", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1742012531 ^ (long)-1742012531))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17753 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow Alpha")));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17754 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Circle", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1687887240 ^ (long)1687887240))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17755 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Circle Radius", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x5EA90AD4D89DC527L ^ 0x1EA90AD4D89DC527L), Double.longBitsToDouble(0xFD390681E14879C3L ^ 0xC2809F1878D1E059L), Double.longBitsToDouble(0xC11D8D2C78E310A0L ^ 0x81398D2C78E310A0L), (boolean)((long)-1070756877 ^ (long)-1070756877))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17756 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Glow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1096966029L ^ 0x41625F8D) != 0)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17757 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1219981117 ^ (long)1219981117))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17758 = this.Method23(this.Field17722.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fade Outline", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)2039167505 ^ (long)2039167505))));
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static j2ejTRqCYqWkD6r8LQZuO6mOB2OwagRH Field17759;
    private boolean Field17760 = (int)-194621162L ^ 0xF4665116;
    private boolean Field17761 = (int)2130984530L ^ 0x7F043E52;
    private ArrayList Field17762 = new ArrayList();
    public static HashMap Field17763;
    private final ArrayList Field17764 = new ArrayList();
    private int Field17765;

    public j2ejTRqCYqWkD6r8LQZuO6mOB2OwagRH() {
        super("ShaderCharms", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        super.Method44(this::Method7686);
        super.Method21((boolean)((long)165629181 ^ (long)165629180));
        this.Field8062 = (int)((long)986220632 ^ (long)986220632);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field17711.Method2004();
        this.Field17764.clear();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7680(RenderHandEvent renderHandEvent) {
        if (!this.Field17720.Method365()) return;
        if (!this.Field17721.Method365()) return;
        if (this.Field17760) return;
        renderHandEvent.setCanceled(((int)-758658964L ^ 0xD2C7C86D) != 0);
    }

    @Override
    public void Method45() {
        this.Field17764.clear();
        for (Map.Entry entry : Field17763.entrySet()) {
            c329TsrwyQaghkrpEAKnYsAuVtEEsCMs c329TsrwyQaghkrpEAKnYsAuVtEEsCMs2 = (c329TsrwyQaghkrpEAKnYsAuVtEEsCMs)entry.getKey();
            Supplier supplier = (Supplier)entry.getValue();
            if (!((Boolean)supplier.get()).booleanValue()) continue;
            this.Field17764.add(c329TsrwyQaghkrpEAKnYsAuVtEEsCMs2);
        }
        this.Field17761 = !this.Field17764.isEmpty() ? (int)1500659292L ^ 0x59723E5D : (int)((long)-1533404040 ^ (long)-1533404040);
    }

    public boolean Method7681(Entity entity) {
        int n;
        if (entity != j2ejTRqCYqWkD6r8LQZuO6mOB2OwagRH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && (entity instanceof EntityPlayer && this.Field17714.Method365() || entity instanceof EntityPlayer && this.Field17715.Method365() && n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(entity.getName()) || entity instanceof EntityEnderCrystal && this.Field17713.Method365() || (entity instanceof EntityMob || entity instanceof EntitySlime) && this.Field17716.Method365() || entity instanceof EntityEnderPearl && this.Field17718.Method365() || entity instanceof EntityItem && this.Field17719.Method365() || entity instanceof EntityAnimal && this.Field17717.Method365())) {
            n = (int)-2142837706L ^ 0x8046E437;
            return n != 0;
        }
        n = (int)490162350L ^ 0x1D3748AE;
        return n != 0;
    }

    /*
     * Exception decompiling
     */
    @SubscribeEvent
    @SubscribeEvent
    public void Method7682(RenderWorldLastEvent var1_1) {
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

    public Color Method7683() {
        Color color;
        if (this.Field17730.Method365()) {
            color = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4725(this.Field17731.Method335(), this.Field17732.Method368(), this.Field17733.Method368());
            return color;
        }
        color = new Color(this.Field17727.Method368(), this.Field17728.Method368(), this.Field17729.Method368());
        return color;
    }

    private void Method7684() {
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        Iterator iterator = j2ejTRqCYqWkD6r8LQZuO6mOB2OwagRH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method7685(arrayList));
                return;
            }
            Entity entity = (Entity)iterator.next();
            if (!(entity != j2ejTRqCYqWkD6r8LQZuO6mOB2OwagRH.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && entity != vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderViewEntity() && (entity instanceof EntityPlayer && this.Field17714.Method365() || entity instanceof EntityPlayer && this.Field17715.Method365() && n3v8aSg3DrSZ0fw4XNqlOhNwnCmBgofI.Field11086.Method3043(entity.getName()) || entity instanceof EntityEnderCrystal && this.Field17713.Method365() || (entity instanceof EntityMob || entity instanceof EntitySlime) && this.Field17716.Method365() || entity instanceof EntityEnderPearl && this.Field17718.Method365() || entity instanceof EntityItem && this.Field17719.Method365() || entity instanceof EntityAnimal && this.Field17717.Method365()))) continue;
            arrayList.add(entity);
        }
    }

    private ArrayList Method7685(ArrayList arrayList) throws Exception {
        this.Field17762 = arrayList;
        return this.Field17762;
    }

    private String Method7686() {
        return "[" + this.Field17710.Method359() + "]";
    }

    private Boolean Method7687() {
        int n;
        if (!this.Field17710.Method309("OUTLINE") && !this.Field17710.Method309("InertiaOutline")) {
            n = (int)977569049L ^ 0x3A448519;
            return n != 0;
        }
        n = (int)((long)-1586998347 ^ (long)-1586998348);
        return n != 0;
    }

    private Boolean Method7688() {
        int n;
        if (!this.Field17710.Method309("OUTLINE") && !this.Field17710.Method309("InertiaOutline")) {
            n = (int)((long)-1552029137 ^ (long)-1552029137);
            return n != 0;
        }
        n = (int)-1647959343L ^ 0x9DC622D0;
        return n != 0;
    }

    private Boolean Method7689() {
        int n;
        if (!this.Field17710.Method309("OUTLINE") && !this.Field17710.Method309("InertiaOutline")) {
            n = (int)-1725766335L ^ 0x9922E541;
            return n != 0;
        }
        n = (int)-2146626887L ^ 0x800D12B8;
        return n != 0;
    }

    private Boolean Method7690() {
        return this.Field17710.Method309("GRADIENT");
    }

    private Boolean Method7691() {
        return this.Field17710.Method309("GRADIENT");
    }

    private Boolean Method7692() {
        return this.Field17710.Method309("GRADIENT");
    }

    private Boolean Method7693() {
        return this.Field17710.Method309("GRADIENT");
    }

    private Boolean Method7694() {
        return this.Field17710.Method309("GRADIENT");
    }

    private Boolean Method7695() {
        return this.Field17710.Method309("GRADIENT");
    }

    private Boolean Method7696() {
        return this.Field17710.Method309("GRADIENT");
    }

    private Boolean Method7697() {
        return this.Field17710.Method309("GRADIENT");
    }

    private Boolean Method7698() {
        int n;
        if (!(this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("Outline2"))) {
            n = (int)((long)-1291580753 ^ (long)-1291580753);
            return n != 0;
        }
        n = (int)((long)-1039118336 ^ (long)-1039118335);
        return n != 0;
    }

    private Boolean Method7699() {
        int n;
        if (!(this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline"))) {
            n = (int)616647815L ^ 0x24C14C87;
            return n != 0;
        }
        n = (int)((long)2117465887 ^ (long)2117465886);
        return n != 0;
    }

    private Boolean Method7700() {
        int n;
        if (!(this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline"))) {
            n = (int)((long)-1350830187 ^ (long)-1350830187);
            return n != 0;
        }
        n = (int)((long)1447018979 ^ (long)1447018978);
        return n != 0;
    }

    private Boolean Method7701() {
        int n;
        if (!(this.Field17710.Method309("ITEMGLOW") || this.Field17710.Method309("GLOW") || this.Field17710.Method309("OUTLINE") || this.Field17710.Method309("Outline2") || this.Field17710.Method309("InertiaOutline"))) {
            n = (int)((long)2106634582 ^ (long)2106634582);
            return n != 0;
        }
        n = (int)1495557216L ^ 0x59246461;
        return n != 0;
    }

    private Boolean Method7702() {
        return this.Field17710.Method309("ITEMGLOW");
    }

    private Boolean Method7703() {
        int n;
        if (!this.Field17710.Method309("GRADIENT")) {
            n = (int)-77617608L ^ 0xFB5FA639;
            return n != 0;
        }
        n = (int)((long)-1368070284 ^ (long)-1368070284);
        return n != 0;
    }

    static {
        Field17763 = new HashMap();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-954416576L ^ 0xC71CC240;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1545593958 ^ (long)1545594009);
            int n2 = (int)((long)-1275652260 ^ (long)-1275652273) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-217650667 ^ (long)-217649642) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

