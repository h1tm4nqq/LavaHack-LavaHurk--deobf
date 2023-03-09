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
import lavahack.client.Class1431;
import lavahack.client.Class1697;
import lavahack.client.Class377;
import lavahack.client.Class411;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class901;
import lavahack.client.Class97;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class589
extends Class42
implements Class1697 {
    private final Class44 Field10499 = this.Method23(new Class44("Distance(Squared)", (Class42)this, Double.longBitsToDouble((long)1913742116 ^ 0x40AF400072116324L), Double.longBitsToDouble(0x4024000000000000L), Double.longBitsToDouble(4661014508095930368L), true));
    private final ArrayList Field10500 = new ArrayList<Class377>(Arrays.asList(new Class377(Class1431.Field14685, this), new Class377(Class1431.Field14686, this), new Class377(Class1431.Field14687, this), new Class377(Class1431.Field14688, this), new Class377(Class1431.Field14689, this), new Class377(Class1431.Field14690, this), new Class377(Class1431.Field14691, this), new Class377(Class1431.Field14692, this)));
    private final Class411 Field10501 = this.Method54();
    private ArrayList Field10502 = new ArrayList();
    private String Field10503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class589() {
        super("StorageESP", "ESP for storages", Class97.Field8342);
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
        this.Method2552(false);
    }

    public void Method20() {
        this.Method2552(true);
    }

    private void Method2552(boolean bl) {
        Iterator iterator = this.Field10502.iterator();
        block0: while (iterator.hasNext()) {
            TileEntity tileEntity = (TileEntity)iterator.next();
            Iterator iterator2 = this.Field10500.iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block0;
                Class901 class901 = (Class901)iterator2.next();
                class901.Method1836(tileEntity, bl);
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
        var2_2 = Class589.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedTileEntityList.iterator();
        block0: while (true) {
            if (!var2_2.hasNext()) {
                Class589.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask((Callable<ArrayList>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, Method2554(java.util.ArrayList ), ()Ljava/util/ArrayList;)((Class589)this, var1_1));
                return;
            }
            var3_3 = (TileEntity)var2_2.next();
            if (!(Class589.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(var3_3.getPos()) < (double)this.Field10499.Method335())) continue;
            var4_4 = this.Field10500.iterator();
            while (true) {
                if (var4_4.hasNext()) ** break;
                continue block0;
                var5_5 = (Class901)var4_4.next();
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 233;
            cArray2[n] = (char)(cArray[n] ^ (0x69DE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

