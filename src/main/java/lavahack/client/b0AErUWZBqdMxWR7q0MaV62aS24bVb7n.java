//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.T9g0jeLq0v1889IjzjfPZDEB60aTemz3;
import lavahack.client.WKrkcHk4xNIl957OiVzz4uUHftElYfcd;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.c329TsrwyQaghkrpEAKnYsAuVtEEsCMs;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class b0AErUWZBqdMxWR7q0MaV62aS24bVb7n
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J
implements c329TsrwyQaghkrpEAKnYsAuVtEEsCMs {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10499 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Distance(Squared)", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1913742116 ^ 0x40AF400072116324L), Double.longBitsToDouble(0x3485BBFE84D4F3DEL ^ 0x74A1BBFE84D4F3DEL), Double.longBitsToDouble(0xD54BD6F121296027L ^ 0x95E496F121296027L), ((int)-1430608576L ^ 0xAABAA541) != 0));
    private final ArrayList Field10500;
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field10501;
    private ArrayList Field10502;
    private String Field10503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public b0AErUWZBqdMxWR7q0MaV62aS24bVb7n() {
        super("StorageESP", "ESP for storages", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
        T9g0jeLq0v1889IjzjfPZDEB60aTemz3[] t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3[(int)((long)-597709853 ^ (long)-597709854) << 3];
        t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array[(int)697887232L ^ 0x2998EA00] = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3(rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z.Field14685, this);
        t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array[(int)-1494492130L ^ 0xA6EBDC1F] = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3(rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z.Field14686, this);
        t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array[(int)((long)721747466 ^ (long)721747467) << 1] = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3(rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z.Field14687, this);
        t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array[(int)((long)-123989750 ^ (long)-123989751)] = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3(rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z.Field14688, this);
        t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array[((int)1064580443L ^ 0x3F74355A) << 2] = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3(rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z.Field14689, this);
        t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array[(int)((long)-799611070 ^ (long)-799611065)] = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3(rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z.Field14690, this);
        t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array[(int)((long)815676883 ^ (long)815676880) << 1] = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3(rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z.Field14691, this);
        t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array[(int)1109765213L ^ 0x4225AC5A] = new T9g0jeLq0v1889IjzjfPZDEB60aTemz3(rQ5lrztQK8V9kw3Btd6Tv2vQoIi5o18Z.Field14692, this);
        this.Field10500 = new ArrayList<T9g0jeLq0v1889IjzjfPZDEB60aTemz3>(Arrays.asList(t9g0jeLq0v1889IjzjfPZDEB60aTemz3Array));
        this.Field10501 = this.Method54();
        this.Field10502 = new ArrayList();
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field10501.Method2004();
        this.Field10502.clear();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2551(RenderWorldLastEvent renderWorldLastEvent) {
        this.Field10501.Method2005(this::Method2553);
        this.Method2552((boolean)((long)-90042281 ^ (long)-90042281));
    }

    public void Method20() {
        this.Method2552((boolean)((long)-1715697745 ^ (long)-1715697746));
    }

    private void Method2552(boolean bl) {
        Iterator iterator = this.Field10502.iterator();
        block0: while (iterator.hasNext()) {
            TileEntity tileEntity = (TileEntity)iterator.next();
            Iterator iterator2 = this.Field10500.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                WKrkcHk4xNIl957OiVzz4uUHftElYfcd wKrkcHk4xNIl957OiVzz4uUHftElYfcd = (WKrkcHk4xNIl957OiVzz4uUHftElYfcd)iterator2.next();
                wKrkcHk4xNIl957OiVzz4uUHftElYfcd.Method1836(tileEntity, bl);
            }
            break;
        }
        return;
    }

    /*
     * Unable to fully structure code
     */
    private void Method2553() {
        var1_1 = new ArrayList<TileEntity>();
        var2_2 = b0AErUWZBqdMxWR7q0MaV62aS24bVb7n.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedTileEntityList.iterator();
        block0: while (true) {
            if (!var2_2.hasNext()) {
                b0AErUWZBqdMxWR7q0MaV62aS24bVb7n.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask((Callable<ArrayList>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, Method2554(java.util.ArrayList ), ()Ljava/util/ArrayList;)((b0AErUWZBqdMxWR7q0MaV62aS24bVb7n)this, var1_1));
                return;
            }
            var3_3 = (TileEntity)var2_2.next();
            if (!(b0AErUWZBqdMxWR7q0MaV62aS24bVb7n.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(var3_3.getPos()) < (double)this.Field10499.Method335())) continue;
            var4_4 = this.Field10500.iterator();
            while (true) {
                if (var4_4.hasNext()) ** break;
                continue block0;
                var5_5 = (WKrkcHk4xNIl957OiVzz4uUHftElYfcd)var4_4.next();
                if (!var5_5.Method1835(var3_3, null)) continue;
                var1_1.add(var3_3);
            }
            break;
        }
    }

    private ArrayList Method2554(ArrayList arrayList) throws Exception {
        this.Field10502 = arrayList;
        return this.Field10502;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)527196168L ^ 0x1F6C6008;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2061763133L ^ 0x7AE402C2);
            int n2 = (int)((long)-2102833676 ^ (long)-2102833891);
            cArray2[n] = (char)(cArray[n] ^ (((int)1823019174L ^ 0x6CA92449) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

