//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import lavahack.client.Class1066;
import lavahack.client.Class2155;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class693;
import lavahack.client.Class817;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1391
extends Class42 {
    public Class44 Field14306 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble((long)794403075 ^ 0x404900002F59A103L), false));
    private final ArrayList Field14307 = new ArrayList<Class1066>(Arrays.asList(new Class1066(Class693.Field10925, this), new Class1066(Class693.Field10926, this), new Class1066(Class693.Field10927, this), new Class1066(Class693.Field10928, this), new Class1066(Class693.Field10929, this), new Class1066(Class693.Field10930, this), new Class1066(Class693.Field10931, this)));
    private ArrayList Field14308 = new ArrayList();
    private final Class411 Field14309 = this.Method54();
    private String Field14310 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1391() {
        super("XRay", "Shows ores", Class97.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field14309.Method2004();
        this.Field14308.clear();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method5499(RenderWorldLastEvent renderWorldLastEvent) {
        this.Field14309.Method2005(this::Method20);
        Iterator iterator = this.Field14308.iterator();
        block0: while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = this.Field14307.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                Class817 class817 = (Class817)iterator2.next();
                class817.Method3474(blockPos);
            }
            break;
        }
        return;
    }

    private void Method20() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = Class2155.Method7756((Entity)Class1391.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14306.Method368(), true, false).iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method5500(arrayList));
                return;
            }
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = this.Field14307.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                Class817 class817 = (Class817)iterator2.next();
                if (!class817.Method3473(blockPos)) continue;
                arrayList.add(blockPos);
            }
            break;
        }
    }

    private ArrayList Method5500(ArrayList arrayList) throws Exception {
        this.Field14308 = arrayList;
        return this.Field14308;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 225;
            cArray2[n] = (char)(cArray[n] ^ (0x90C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

