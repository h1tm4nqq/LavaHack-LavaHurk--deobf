//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import lavahack.client.Class1240;
import lavahack.client.Class1480;
import lavahack.client.Class1621;
import lavahack.client.Class1697;
import lavahack.client.Class1862;
import lavahack.client.Class1914;
import lavahack.client.Class1934;
import lavahack.client.Class1996;
import lavahack.client.Class394;
import lavahack.client.Class410;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class422;
import lavahack.client.Class44;
import lavahack.client.Class567;
import lavahack.client.Class588;
import lavahack.client.Class873;
import lavahack.client.Class909;
import lavahack.client.Class97;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class142
extends Class42
implements Class1697 {
    private final Class411 Field8536 = this.Method54();
    private final Class44 Field8537 = this.Method23(new Class44("Obsidian", (Class42)this, true).Method355("Obby"));
    private final Class44 Field8538 = this.Method23(new Class44("Bedrock", (Class42)this, true));
    private final Class44 Field8539 = this.Method23(new Class44("Custom", (Class42)this, true));
    private final Class44 Field8540 = this.Method23(new Class44("Single", (Class42)this, true).Method355("1x1"));
    private final Class44 Field8541 = this.Method23(new Class44("Double", (Class42)this, true).Method355("2x1"));
    private final Class44 Field8542 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(4622945017495814144L), 1.0, Double.longBitsToDouble(0x4034000000000000L), false));
    private final Class44 Field8543 = this.Method23(new Class44("Limit", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4049000000000000L), true));
    private final Class44 Field8544 = this.Method23(new Class44("IgnoreOwnHole", (Class42)this, false));
    private final Class1996 Field8545 = this.Method24(new Class1996(new Class44("Obby", this)));
    private final Class909 Field8546 = new Class909(this, Class1480.Field14902, false).Method3814("Obsidian").Method3816(this.Field8545).Method3813().Method3812();
    private final Class44 Field8547 = this.Method23(new Class44("HeightObsidian", (Class42)this, 1.0, 0.0, 1.0, false));
    private final Class1996 Field8548 = this.Method24(new Class1996(new Class44("Bedrock", this)));
    private final Class909 Field8549 = new Class909(this, Class1480.Field14902, false).Method3814("Bedrock").Method3816(this.Field8548).Method3813().Method3812();
    private final Class44 Field8550 = this.Method23(new Class44("HeightBedrock", (Class42)this, 1.0, 0.0, 1.0, false));
    private final Class1996 Field8551 = this.Method24(new Class1996(new Class44("Custom", this)));
    private final Class909 Field8552 = new Class909(this, Class1480.Field14902, false).Method3814("Custom").Method3816(this.Field8551).Method3813().Method3812();
    private final Class44 Field8553 = this.Method23(new Class44("Height", (Class42)this, 1.0, 0.0, 1.0, false));
    private final Class44 Field8554 = this.Method23(new Class44("FadeIn", (Class42)this, false));
    private final Class44 Field8555 = this.Method23(new Class44("FadeInTicks", (Class42)this, Double.longBitsToDouble((long)1628527895 ^ 0x4069000061115D17L), 0.0, Double.longBitsToDouble((long)1657582659 ^ 0x407F400062CCB443L), true));
    private final Class44 Field8556 = this.Method23(new Class44("FadeInCool", (Class42)this, false));
    private final Class44 Field8557 = this.Method23(new Class44("FadeOut", (Class42)this, false));
    private final Class44 Field8558 = this.Method23(new Class44("FadeOutTicks", (Class42)this, Double.longBitsToDouble(4641240890982006784L), 0.0, Double.longBitsToDouble((long)1665823804 ^ 0x407F4000634A743CL), true));
    private final Class44 Field8559 = this.Method23(new Class44("FadeOutCool", (Class42)this, false));
    private static final Comparator Field8560 = Class142::Method978;
    private static final Comparator Field8561 = Class142::Method977;
    private Map Field8562 = new TreeMap(Field8560);
    private Map Field8563 = new TreeMap(Field8560);
    private Map Field8564 = new TreeMap(Field8561);
    private Map Field8565 = new TreeMap(Field8561);
    @Class873
    public static Class142 Field8566;
    private String Field8567 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class142() {
        super("HoleESPRewrite2", Class97.Field8342);
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
    public void Method967(RenderWorldLastEvent renderWorldLastEvent) {
        if (!this.Method974(Class588.Field10494).Method3791() && !this.Method974(Class588.Field10495).Method3791()) {
            if (!this.Method974(Class588.Field10496).Method3791()) return;
        }
        this.Method969(false);
    }

    public void Method20() {
        this.Method969(true);
    }

    private void Method968() {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method976);
    }

    public void Method969(boolean bl) {
        double d;
        Class1240 class1240;
        double d2;
        double d3;
        double d4;
        Class1240 class12402;
        boolean bl2;
        Object object;
        TreeMap treeMap;
        TreeMap<Object, Object> treeMap2 = new TreeMap<Object, Object>(Field8560);
        treeMap2.putAll(this.Field8562);
        TreeMap treeMap3 = new TreeMap(Field8561);
        TreeMap treeMap4 = new TreeMap(Field8561);
        if (this.Field8554.Method365()) {
            treeMap = new TreeMap(Field8561);
            for (Map.Entry object2 : this.Field8564.entrySet()) {
                object = ((Class1240)((Class1621)object2.getKey()).Method6307()).Method4977();
                bl2 = true;
                if (Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(object.x, object.y, object.z) > this.Field8542.Method367()) {
                    treeMap3.put(object2.getKey(), object2.getValue());
                    bl2 = false;
                }
                if (this.Method970((Double)object2.getValue(), true)) {
                    treeMap2.put(((Class1621)object2.getKey()).Method6307(), ((Class1621)object2.getKey()).Method6308());
                    continue;
                }
                class12402 = (Class1240)((Class1621)object2.getKey()).Method6307();
                d4 = class12402.Field13620 - class12402.Field13617;
                d3 = class12402.Field13621 - class12402.Field13618;
                d2 = class12402.Field13622 - class12402.Field13619;
                class1240 = class12402.Method4981((Double)object2.getValue() * d4, (Double)object2.getValue() * d3, (Double)object2.getValue() * d2);
                this.Method974((Class588)((Object)((Class1621)object2.getKey()).Method6308())).Method3804(class1240.Method4989());
                if (this.Field8556.Method365()) {
                    double d5 = 1.0 / this.Field8555.Method367();
                    double d6 = 1.0;
                    double d7 = (Double)object2.getValue();
                    return (void)(d7 + (d6 - d7) * d5);
                }
                d = (Double)object2.getValue() + 1.0 / this.Field8555.Method367();
                if (!bl2) continue;
                treeMap.put(object2.getKey(), d);
            }
            this.Field8564 = treeMap;
        }
        if (this.Field8557.Method365()) {
            treeMap = new TreeMap(Field8561);
            for (Map.Entry entry : this.Field8565.entrySet()) {
                object = ((Class1240)((Class1621)entry.getKey()).Method6307()).Method4977();
                bl2 = true;
                if (Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(object.x, object.y, object.z) > this.Field8542.Method367()) {
                    treeMap4.put(entry.getKey(), entry.getValue());
                    bl2 = false;
                }
                if (this.Method970((Double)entry.getValue(), false)) continue;
                class12402 = (Class1240)((Class1621)entry.getKey()).Method6307();
                d4 = class12402.Field13620 - class12402.Field13617;
                d3 = class12402.Field13621 - class12402.Field13618;
                d2 = class12402.Field13622 - class12402.Field13619;
                class1240 = class12402.Method4981(1.0 - (Double)entry.getValue() * d4, 1.0 - (Double)entry.getValue() * d3, 1.0 - (Double)entry.getValue() * d2);
                this.Method974((Class588)((Object)((Class1621)entry.getKey()).Method6308())).Method3804(class1240.Method4989());
                if (this.Field8559.Method365()) {
                    double d8 = 1.0 / this.Field8555.Method367();
                    double d9 = 1.0;
                    double d10 = (Double)entry.getValue();
                    return (void)(d10 + (d9 - d10) * d8);
                }
                d = (Double)entry.getValue() + 1.0 / this.Field8555.Method367();
                if (!bl2) continue;
                treeMap.put(entry.getKey(), d);
            }
            this.Field8565 = treeMap;
            this.Field8565.putAll(treeMap3);
            this.Field8564.putAll(treeMap4);
        }
        treeMap = treeMap2.entrySet().iterator();
        while (treeMap.hasNext()) {
            Map.Entry entry = (Map.Entry)treeMap.next();
            if (this.Field8554.Method365() && this.Field8564.containsKey(new Class1621(entry.getKey(), entry.getValue())) || this.Field8557.Method365() && this.Field8565.containsKey(new Class1621(entry.getKey(), entry.getValue()))) continue;
            Class1240 class12403 = (Class1240)entry.getKey();
            object = (Class588)((Object)entry.getValue());
            Vec3d vec3d = Class1934.Field16968.Method6696(class12403.Method4989()).Method7191();
            if ((!bl || this.Method974((Class588)((Object)object)).Method3791()) && (bl || !this.Method974((Class588)((Object)object)).Method3791())) continue;
            this.Method974((Class588)((Object)object)).Method3817(class12403.Method4989(), (Long)this.Field8563.get(class12403), this.Field8542.Method368(), (float)Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(vec3d.x, vec3d.y, vec3d.z));
        }
    }

    private boolean Method970(double d, boolean bl) {
        if (bl) {
            if (this.Field8556.Method365()) {
                return Class567.Method2507(1.0 - d, Double.longBitsToDouble(4547007121832542208L));
            }
            if (!(d >= 1.0)) return false;
            return true;
        }
        if (this.Field8559.Method365()) {
            return Class567.Method2507(1.0 - d, Double.longBitsToDouble(4547007121832542208L));
        }
        if (!(d >= 1.0)) return false;
        return true;
    }

    private Map Method971() {
        TreeMap<Class1240, Class588> treeMap = new TreeMap<Class1240, Class588>(Field8560);
        List list = this.Method972(this.Field8542.Method368());
        int n = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (this.Field8543.Method335() != 0 && n > this.Field8543.Method335()) {
                return treeMap;
            }
            Class1862 class1862 = Class1914.Method7131(blockPos, false, false);
            Class422 class422 = class1862.Method6959();
            if (class422 == Class422.Field9771 || class422 == Class422.Field9768 && !this.Field8540.Method365() || class422 == Class422.Field9769 && !this.Field8541.Method365()) continue;
            Class410 class410 = class1862.Method6960();
            AxisAlignedBB axisAlignedBB = class1862.Method6961();
            if (axisAlignedBB == null) {
                return treeMap;
            }
            Class588 class588 = class410 == Class410.Field9697 ? Class588.Field10495 : Class588.Field10494;
            if (class422 == Class422.Field9770) {
                class588 = Class588.Field10496;
            }
            if (class588 == Class588.Field10494 && !this.Field8537.Method365() || class588 == Class588.Field10495 && !this.Field8538.Method365() || class588 == Class588.Field10496 && !this.Field8539.Method365()) continue;
            Class1240 class1240 = this.Method973(class1862.Method6961(), class588);
            if (!treeMap.containsKey(class1240)) {
                treeMap.put(class1240, class588);
            }
            ++n;
        }
        return treeMap;
    }

    private List Method972(float f) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(64);
        List list = Class394.Method1946(new BlockPos(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ), f, (int)(f + 1.0f), false, true, 0);
        list = list.stream().sorted(Class142::Method975).collect(Collectors.toList());
        BlockPos blockPos = new BlockPos(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos2 = (BlockPos)iterator.next();
            if (this.Field8544.Method365() && blockPos == blockPos2 || !Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock().equals(Blocks.AIR) || Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add(0, -1, 0)).getBlock().equals(Blocks.AIR) || !Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add(0, 1, 0)).getBlock().equals(Blocks.AIR) || !Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2.add(0, 2, 0)).getBlock().equals(Blocks.AIR)) continue;
            arrayList.add(blockPos2);
        }
        return arrayList;
    }

    private Class1240 Method973(AxisAlignedBB axisAlignedBB, Class588 class588) {
        Class1240 class1240 = new Class1240(axisAlignedBB);
        if (class588 == Class588.Field10494) {
            class1240.Field13621 = class1240.Field13618 + this.Field8547.Method367();
            return class1240;
        }
        if (class588 == Class588.Field10495) {
            class1240.Field13621 = class1240.Field13618 + this.Field8550.Method367();
            return class1240;
        }
        class1240.Field13621 = class1240.Field13618 + this.Field8553.Method367();
        return class1240;
    }

    private Class909 Method974(Class588 class588) {
        if (class588 == Class588.Field10495) {
            return this.Field8549;
        }
        if (class588 != Class588.Field10496) return this.Field8546;
        return this.Field8552;
    }

    private static int Method975(BlockPos blockPos, BlockPos blockPos2) {
        double d = blockPos.distanceSq(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        double d2 = blockPos2.distanceSq(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        return Double.compare(d, d2);
    }

    private void Method976() {
        Map map = this.Method971();
        TreeMap<Class1240, Long> treeMap = new TreeMap<Class1240, Long>(Field8560);
        for (Class1240 object : map.keySet()) {
            treeMap.put(object, System.currentTimeMillis());
        }
        if (this.Field8557.Method365()) {
            for (Map.Entry entry : this.Field8562.entrySet()) {
                if (map.containsKey(entry.getKey())) continue;
                this.Field8565.put(new Class1621(entry.getKey(), entry.getValue()), 0.0);
            }
        } else {
            this.Field8565.clear();
        }
        if (this.Field8554.Method365()) {
            for (Map.Entry entry : map.entrySet()) {
                if (this.Field8562.containsKey(entry.getKey())) continue;
                this.Field8564.put(new Class1621(entry.getKey(), entry.getValue()), 0.0);
            }
        } else {
            this.Field8564.clear();
        }
        this.Field8562 = map;
        this.Field8563 = treeMap;
    }

    private static int Method977(Class1621 class1621, Class1621 class16212) {
        return Double.compare(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(((Class1240)class16212.Method6307()).Method4977().x, ((Class1240)class16212.Method6307()).Method4977().y, ((Class1240)class16212.Method6307()).Method4977().z), Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(((Class1240)class1621.Method6307()).Method4977().x, ((Class1240)class1621.Method6307()).Method4977().y, ((Class1240)class1621.Method6307()).Method4977().z));
    }

    private static int Method978(Class1240 class1240, Class1240 class12402) {
        return Double.compare(Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(class12402.Method4977().x, class12402.Method4977().y, class12402.Method4977().z), Class142.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(class1240.Method4977().x, class1240.Method4977().y, class1240.Method4977().z));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 39;
            cArray2[n] = (char)(cArray[n] ^ (0x7585 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

