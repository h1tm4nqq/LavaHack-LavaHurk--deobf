//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.*;
import java.util.stream.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;

public class Class142 extends Class42 implements Class1697
{
    private final Class411 Field8536;
    private final Class44 Field8537;
    private final Class44 Field8538;
    private final Class44 Field8539;
    private final Class44 Field8540;
    private final Class44 Field8541;
    private final Class44 Field8542;
    private final Class44 Field8543;
    private final Class44 Field8544;
    private final Class1996 Field8545;
    private final Class909 Field8546;
    private final Class44 Field8547;
    private final Class1996 Field8548;
    private final Class909 Field8549;
    private final Class44 Field8550;
    private final Class1996 Field8551;
    private final Class909 Field8552;
    private final Class44 Field8553;
    private final Class44 Field8554;
    private final Class44 Field8555;
    private final Class44 Field8556;
    private final Class44 Field8557;
    private final Class44 Field8558;
    private final Class44 Field8559;
    private static final Comparator Field8560;
    private static final Comparator Field8561;
    private Map Field8562;
    private Map Field8563;
    private Map Field8564;
    private Map Field8565;
    @Class873
    public static Class142 Field8566;
    private String Field8567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class142() {
        super("HoleESPRewrite2", Class97.Field8342);
        this.Field8536 = this.Method54();
        this.Field8537 = this.Method23(new Class44("Obsidian", this, true).Method355("Obby"));
        this.Field8538 = this.Method23(new Class44("Bedrock", this, true));
        this.Field8539 = this.Method23(new Class44("Custom", this, true));
        this.Field8540 = this.Method23(new Class44("Single", this, true).Method355("1x1"));
        this.Field8541 = this.Method23(new Class44("Double", this, true).Method355("2x1"));
        this.Field8542 = this.Method23(new Class44("Range", this, Double.longBitsToDouble(4622945017495814144L), 1.0, Double.longBitsToDouble(4626322717216342016L), false));
        this.Field8543 = this.Method23(new Class44("Limit", this, 0.0, 0.0, Double.longBitsToDouble(4632233691727265792L), true));
        this.Field8544 = this.Method23(new Class44("IgnoreOwnHole", this, false));
        this.Field8545 = this.Method24(new Class1996(new Class44("Obby", this)));
        this.Field8546 = new Class909(this, Class1480.Field14902, false).Method3814("Obsidian").Method3816(this.Field8545).Method3813().Method3812();
        this.Field8547 = this.Method23(new Class44("HeightObsidian", this, 1.0, 0.0, 1.0, false));
        this.Field8548 = this.Method24(new Class1996(new Class44("Bedrock", this)));
        this.Field8549 = new Class909(this, Class1480.Field14902, false).Method3814("Bedrock").Method3816(this.Field8548).Method3813().Method3812();
        this.Field8550 = this.Method23(new Class44("HeightBedrock", this, 1.0, 0.0, 1.0, false));
        this.Field8551 = this.Method24(new Class1996(new Class44("Custom", this)));
        this.Field8552 = new Class909(this, Class1480.Field14902, false).Method3814("Custom").Method3816(this.Field8551).Method3813().Method3812();
        this.Field8553 = this.Method23(new Class44("Height", this, 1.0, 0.0, 1.0, false));
        this.Field8554 = this.Method23(new Class44("FadeIn", this, false));
        this.Field8555 = this.Method23(new Class44("FadeInTicks", this, Double.longBitsToDouble((long)1628527895 ^ 0x4069000061115D17L), 0.0, Double.longBitsToDouble((long)1657582659 ^ 0x407F400062CCB443L), true));
        this.Field8556 = this.Method23(new Class44("FadeInCool", this, false));
        this.Field8557 = this.Method23(new Class44("FadeOut", this, false));
        this.Field8558 = this.Method23(new Class44("FadeOutTicks", this, Double.longBitsToDouble(4641240890982006784L), 0.0, Double.longBitsToDouble((long)1665823804 ^ 0x407F4000634A743CL), true));
        this.Field8559 = this.Method23(new Class44("FadeOutCool", this, false));
        this.Field8562 = new TreeMap(Class142.Field8560);
        this.Field8563 = new TreeMap(Class142.Field8560);
        this.Field8564 = new TreeMap(Class142.Field8561);
        this.Field8565 = new TreeMap(Class142.Field8561);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        this.Field8536.Method2004();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        this.Field8562.clear();
        this.Field8564.clear();
        this.Field8565.clear();
    }
    
    @Override
    public void Method45() {
        this.Field8536.Method2005(this::Method968);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method967(final RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Method974(Class588.Field10494).Method3791() || this.Method974(Class588.Field10495).Method3791() || this.Method974(Class588.Field10496).Method3791()) {
            this.Method969(false);
        }
    }
    
    public void Method20() {
        this.Method969(true);
    }
    
    private void Method968() {
        Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method976);
    }
    
    public void Method969(final boolean b) {
        final TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>(Class142.Field8560);
        treeMap.putAll(this.Field8562);
        final TreeMap<Class1621, Object> treeMap2 = new TreeMap<Class1621, Object>(Class142.Field8561);
        final TreeMap<Class1621, Object> treeMap3 = new TreeMap<Class1621, Object>(Class142.Field8561);
        if (this.Field8554.Method365()) {
            final TreeMap<Class1621, Double> field8564 = new TreeMap<Class1621, Double>(Class142.Field8561);
            for (final Map.Entry<Class1621, V> entry : this.Field8564.entrySet()) {
                final Vec3d method4977 = ((Class1240)entry.getKey().Method6307()).Method4977();
                boolean b2 = true;
                if (Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(method4977.x, method4977.y, method4977.z) > this.Field8542.Method367()) {
                    treeMap2.put(entry.getKey(), entry.getValue());
                    b2 = false;
                }
                if (this.Method970((double)entry.getValue(), true)) {
                    treeMap.put(entry.getKey().Method6307(), entry.getKey().Method6308());
                }
                else {
                    final Class1240 class1240 = (Class1240)entry.getKey().Method6307();
                    this.Method974((Class588)entry.getKey().Method6308()).Method3804(class1240.Method4981((double)entry.getValue() * (class1240.Field13620 - class1240.Field13617), (double)entry.getValue() * (class1240.Field13621 - class1240.Field13618), (double)entry.getValue() * (class1240.Field13622 - class1240.Field13619)).Method4989());
                    if (this.Field8556.Method365()) {
                        final double doubleValue = (double)entry.getValue();
                        final double n = 1.0;
                        final double n2 = 1.0 / this.Field8555.Method367();
                        final double n3 = n;
                        final double n4 = doubleValue;
                        return (void)(n4 + (n3 - n4) * n2);
                    }
                    final double d = (double)entry.getValue() + 1.0 / this.Field8555.Method367();
                    if (!b2) {
                        continue;
                    }
                    field8564.put(entry.getKey(), d);
                }
            }
            this.Field8564 = field8564;
        }
        if (this.Field8557.Method365()) {
            final TreeMap<Class1621, Double> field8565 = new TreeMap<Class1621, Double>(Class142.Field8561);
            for (final Map.Entry<Class1621, V> entry2 : this.Field8565.entrySet()) {
                final Vec3d method4978 = ((Class1240)entry2.getKey().Method6307()).Method4977();
                boolean b3 = true;
                if (Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(method4978.x, method4978.y, method4978.z) > this.Field8542.Method367()) {
                    treeMap3.put(entry2.getKey(), entry2.getValue());
                    b3 = false;
                }
                if (this.Method970((double)entry2.getValue(), false)) {
                    continue;
                }
                final Class1240 class1241 = (Class1240)entry2.getKey().Method6307();
                this.Method974((Class588)entry2.getKey().Method6308()).Method3804(class1241.Method4981(1.0 - (double)entry2.getValue() * (class1241.Field13620 - class1241.Field13617), 1.0 - (double)entry2.getValue() * (class1241.Field13621 - class1241.Field13618), 1.0 - (double)entry2.getValue() * (class1241.Field13622 - class1241.Field13619)).Method4989());
                if (this.Field8559.Method365()) {
                    final double doubleValue2 = (double)entry2.getValue();
                    final double n5 = 1.0;
                    final double n6 = 1.0 / this.Field8555.Method367();
                    final double n7 = n5;
                    final double n8 = doubleValue2;
                    return (void)(n8 + (n7 - n8) * n6);
                }
                final double d2 = (double)entry2.getValue() + 1.0 / this.Field8555.Method367();
                if (!b3) {
                    continue;
                }
                field8565.put(entry2.getKey(), d2);
            }
            (this.Field8565 = field8565).putAll(treeMap2);
            this.Field8564.putAll(treeMap3);
        }
        for (final Map.Entry<Object, Object> entry3 : treeMap.entrySet()) {
            if (this.Field8554.Method365() && this.Field8564.containsKey(new Class1621(entry3.getKey(), entry3.getValue()))) {
                continue;
            }
            if (this.Field8557.Method365() && this.Field8565.containsKey(new Class1621(entry3.getKey(), entry3.getValue()))) {
                continue;
            }
            final Class1240 class1242 = entry3.getKey();
            final Class588 class1243 = entry3.getValue();
            final Vec3d method4979 = Class1934.Field16968.Method6696(class1242.Method4989()).Method7191();
            if ((b || this.Method974(class1243).Method3791()) && (b || !this.Method974(class1243).Method3791())) {
                continue;
            }
            this.Method974(class1243).Method3817(class1242.Method4989(), this.Field8563.get(class1242), this.Field8542.Method368(), (float)Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(method4979.x, method4979.y, method4979.z));
        }
    }
    
    private boolean Method970(final double n, final boolean b) {
        if (b) {
            if (this.Field8556.Method365()) {
                return Class567.Method2507(1.0 - n, Double.longBitsToDouble(4547007121832542208L));
            }
            return n >= 1.0;
        }
        else {
            if (this.Field8559.Method365()) {
                return Class567.Method2507(1.0 - n, Double.longBitsToDouble(4547007121832542208L));
            }
            return n >= 1.0;
        }
    }
    
    private Map Method971() {
        final TreeMap<Class1240, Class588> treeMap = new TreeMap<Class1240, Class588>(Class142.Field8560);
        final List method972 = this.Method972(this.Field8542.Method368());
        int n = 0;
        for (final BlockPos blockPos : method972) {
            if (this.Field8543.Method335() != 0 && n > this.Field8543.Method335()) {
                break;
            }
            final Class1862 method973 = Class1914.Method7131(blockPos, false, false);
            final Class422 method974 = method973.Method6959();
            if (method974 == Class422.Field9771) {
                continue;
            }
            if (method974 == Class422.Field9768 && !this.Field8540.Method365()) {
                continue;
            }
            if (method974 == Class422.Field9769 && !this.Field8541.Method365()) {
                continue;
            }
            final Class410 method975 = method973.Method6960();
            if (method973.Method6961() == null) {
                return treeMap;
            }
            Class588 class588;
            if (method975 == Class410.Field9697) {
                class588 = Class588.Field10495;
            }
            else {
                class588 = Class588.Field10494;
            }
            if (method974 == Class422.Field9770) {
                class588 = Class588.Field10496;
            }
            if (class588 == Class588.Field10494 && !this.Field8537.Method365()) {
                continue;
            }
            if (class588 == Class588.Field10495 && !this.Field8538.Method365()) {
                continue;
            }
            if (class588 == Class588.Field10496 && !this.Field8539.Method365()) {
                continue;
            }
            final Class1240 method976 = this.Method973(method973.Method6961(), class588);
            if (!treeMap.containsKey(method976)) {
                treeMap.put(method976, class588);
            }
            ++n;
        }
        return treeMap;
    }
    
    private List Method972(final float n) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(64);
        final List<Object> list2 = (List<Object>)Class394.Method1946(new BlockPos(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), n, (int)(n + 1.0f), false, true, 0).stream().sorted(Class142::Method975).collect(Collectors.toList());
        final BlockPos blockPos = new BlockPos(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        for (final BlockPos blockPos2 : list2) {
            if (this.Field8544.Method365() && blockPos == blockPos2) {
                continue;
            }
            if (!Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add(0, -1, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (!Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add(0, 1, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            if (!Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) {
                continue;
            }
            list.add(blockPos2);
        }
        return list;
    }
    
    private Class1240 Method973(final AxisAlignedBB axisAlignedBB, final Class588 class588) {
        final Class1240 class589 = new Class1240(axisAlignedBB);
        if (class588 == Class588.Field10494) {
            class589.Field13621 = class589.Field13618 + this.Field8547.Method367();
            return class589;
        }
        if (class588 == Class588.Field10495) {
            class589.Field13621 = class589.Field13618 + this.Field8550.Method367();
            return class589;
        }
        class589.Field13621 = class589.Field13618 + this.Field8553.Method367();
        return class589;
    }
    
    private Class909 Method974(final Class588 class588) {
        if (class588 == Class588.Field10495) {
            return this.Field8549;
        }
        if (class588 == Class588.Field10496) {
            return this.Field8552;
        }
        return this.Field8546;
    }
    
    private static int Method975(final BlockPos blockPos, final BlockPos blockPos2) {
        return Double.compare(blockPos.distanceSq(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), blockPos2.distanceSq(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ));
    }
    
    private void Method976() {
        final Map method971 = this.Method971();
        final TreeMap<Class1240, Long> field8563 = new TreeMap<Class1240, Long>(Class142.Field8560);
        final Iterator<Class1240> iterator = method971.keySet().iterator();
        while (iterator.hasNext()) {
            field8563.put(iterator.next(), System.currentTimeMillis());
        }
        if (this.Field8557.Method365()) {
            for (final Map.Entry<Object, V> entry : this.Field8562.entrySet()) {
                if (!method971.containsKey(entry.getKey())) {
                    this.Field8565.put(new Class1621(entry.getKey(), entry.getValue()), 0.0);
                }
            }
        }
        else {
            this.Field8565.clear();
        }
        if (this.Field8554.Method365()) {
            for (final Map.Entry<Class1240, V> entry2 : method971.entrySet()) {
                if (!this.Field8562.containsKey(entry2.getKey())) {
                    this.Field8564.put(new Class1621(entry2.getKey(), entry2.getValue()), 0.0);
                }
            }
        }
        else {
            this.Field8564.clear();
        }
        this.Field8562 = method971;
        this.Field8563 = field8563;
    }
    
    private static int Method977(final Class1621 class1621, final Class1621 class1622) {
        return Double.compare(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(((Class1240)class1622.Method6307()).Method4977().x, ((Class1240)class1622.Method6307()).Method4977().y, ((Class1240)class1622.Method6307()).Method4977().z), Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(((Class1240)class1621.Method6307()).Method4977().x, ((Class1240)class1621.Method6307()).Method4977().y, ((Class1240)class1621.Method6307()).Method4977().z));
    }
    
    private static int Method978(final Class1240 class1240, final Class1240 class1241) {
        return Double.compare(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(class1241.Method4977().x, class1241.Method4977().y, class1241.Method4977().z), Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(class1240.Method4977().x, class1240.Method4977().y, class1240.Method4977().z));
    }
    
    static {
        Field8560 = Class142::Method978;
        Field8561 = Class142::Method977;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7585 ^ 0x27));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
