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
import lavahack.client.CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I;
import lavahack.client.D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4;
import lavahack.client.vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class KuKQ3zpJSCMiBL7TG8qV1Mb3lqldAdwO
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    public qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14306 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x521ED85477B30CFAL ^ 0x1257D85477B30CFAL), 0.0, Double.longBitsToDouble((long)794403075 ^ 0x404900002F59A103L), (boolean)((long)-2120847068 ^ (long)-2120847068)));
    private final ArrayList Field14307;
    private ArrayList Field14308;
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field14309;
    private String Field14310 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public KuKQ3zpJSCMiBL7TG8qV1Mb3lqldAdwO() {
        super("XRay", "Shows ores", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4[] tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array = new tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4[(int)1397449720L ^ 0x534B63FF];
        tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array[(int)((long)1653621771 ^ (long)1653621771)] = new tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4(CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I.Field10925, this);
        tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array[(int)((long)1834279357 ^ (long)1834279356)] = new tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4(CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I.Field10926, this);
        tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array[((int)228772896L ^ 0xDA2CC21) << 1] = new tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4(CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I.Field10927, this);
        tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array[(int)((long)1909207820 ^ (long)1909207823)] = new tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4(CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I.Field10928, this);
        tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array[(int)((long)65194191 ^ (long)65194190) << 2] = new tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4(CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I.Field10929, this);
        tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array[(int)((long)2011384787 ^ (long)2011384790)] = new tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4(CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I.Field10930, this);
        tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array[((int)18360640L ^ 0x1182943) << 1] = new tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4(CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I.Field10931, this);
        this.Field14307 = new ArrayList<tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4>(Arrays.asList(tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4Array));
        this.Field14308 = new ArrayList();
        this.Field14309 = this.Method54();
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
                D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC d0pXhJZVaWbHnj5YhJoLNx9ToiussNYC = (D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC)iterator2.next();
                d0pXhJZVaWbHnj5YhJoLNx9ToiussNYC.Method3474(blockPos);
            }
            break;
        }
        return;
    }

    private void Method20() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        Iterator iterator = vrUAMLSucDqz8jN1fYOSRyd9hflXkHZy.Method7756((Entity)KuKQ3zpJSCMiBL7TG8qV1Mb3lqldAdwO.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, this.Field14306.Method368(), ((int)565250599L ^ 0x21B10A26) != 0, (boolean)((long)1265292646 ^ (long)1265292646)).iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method5500(arrayList));
                return;
            }
            BlockPos blockPos = (BlockPos)iterator.next();
            Iterator iterator2 = this.Field14307.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC d0pXhJZVaWbHnj5YhJoLNx9ToiussNYC = (D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC)iterator2.next();
                if (!d0pXhJZVaWbHnj5YhJoLNx9ToiussNYC.Method3473(blockPos)) continue;
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
        int n = (int)((long)-506283597 ^ (long)-506283597);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)391563442L ^ 0x1756C84D);
            int n2 = (int)-661903673L ^ 0xD88C2626;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2147104834 ^ (long)-2147105283) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

