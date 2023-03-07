//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketSpawnMob
 *  net.minecraft.network.play.server.SPacketSpawnObject
 *  net.minecraft.network.play.server.SPacketSpawnPlayer
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.network.play.server.SPacketSpawnMob;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.network.play.server.SPacketSpawnPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15948 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-1601332081L ^ 0xA08D9C70, (int)((long)693592519 ^ (long)693592376), (int)-682611070L ^ 0xD7502E7D, (int)194219470L ^ 0xB938D31)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15949 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Crystals", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1119512208L ^ 0x42BA6691) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15950 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Players", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-124672577 ^ (long)-124672577)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15951 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mobs", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1824074163L ^ 0x9346D64D) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15952 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Boats", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1270944885 ^ (long)-1270944885)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15953 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Duration", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)1733649555 ^ 0x3FB99999C7556493L), Double.longBitsToDouble((long)384489593 ^ 0x4014000016EAD879L), (boolean)((long)147236070 ^ (long)147236070)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15954 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x7ECA83FCC7DC666CL ^ 0x3ECE83FCC7DC666CL), Double.longBitsToDouble((long)945394719 ^ 0x3FB99999A1C00D85L), Double.longBitsToDouble(0x12B0B5298D727D4L ^ 0x410F0B5298D727D4L), ((int)-1754487594L ^ 0x976CA4D6) != 0));
    private final Q0P07aMUQ3JFJN0YlqIiaTt73kvABcQZ Field15955 = this.Method54();
    private final ArrayList Field15956 = new ArrayList();
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field15957 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6602, new Predicate[(int)169266399L ^ 0xA16CCDF]);
    private String Field15958 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8() {
        super("SpawnsESP", "        super(\"SpawnsESP\", )", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field15957);
        this.Field15955.Method2004();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field15957);
    }

    private void Method20() {
        Iterator iterator = this.Field15956.iterator();
        while (iterator.hasNext()) {
            rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
            if ((double)(System.currentTimeMillis() - rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5749(rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) > Double.longBitsToDouble(0xE0FE79E51EF6EDA2L ^ 0xA07139E51EF6EDA2L) * this.Field15953.Method367()) {
                this.Field15956.remove(rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
                continue;
            }
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method6604(rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6601(RenderWorldLastEvent renderWorldLastEvent) {
        this.Field15955.Method2005(this::Method6603);
    }

    private void Method6602(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSpawnObject) {
            if (((SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getType() == (int)((long)-1819226389 ^ (long)-1819226408) && this.Field15949.Method365()) {
                this.Field15956.add(new rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(new Vec3d(((SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getX(), ((SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getY(), ((SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getZ()), Float.intBitsToFloat(0xEE4CAA5 ^ 0x3124CAA5), Float.intBitsToFloat((int)((long)2026374169 ^ (long)1204290585))));
                return;
            }
            if (((SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getType() != (int)((long)1797527094 ^ (long)1797527095)) return;
            if (!this.Field15952.Method365()) return;
            this.Field15956.add(new rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(new Vec3d(((SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getX(), ((SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getY(), ((SPacketSpawnObject)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getZ()), 1.0f, Float.intBitsToFloat((int)((long)1296894220 ^ (long)1913456908))));
            return;
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSpawnPlayer && this.Field15950.Method365()) {
            this.Field15956.add(new rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(new Vec3d(((SPacketSpawnPlayer)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getX(), ((SPacketSpawnPlayer)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getY(), ((SPacketSpawnPlayer)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getZ()), Float.intBitsToFloat(0x46AE67F2 ^ 0x79480194), Float.intBitsToFloat(0x1E92F374 ^ 0x2192F374)));
            return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketSpawnMob)) return;
        if (!this.Field15951.Method365()) return;
        this.Field15956.add(new rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(new Vec3d(((SPacketSpawnMob)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getX(), ((SPacketSpawnMob)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getY(), ((SPacketSpawnMob)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getZ()), Float.intBitsToFloat(0x105C2C20 ^ 0x2FBA4A46), Float.intBitsToFloat((int)625324228L ^ 0x1A45B0C4)));
    }

    private void Method6603() {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method20);
    }

    private void Method6604(rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
        double d = rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5746((rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi).x - rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosX;
        double d2 = rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5746((rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi).y - rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosY;
        double d3 = rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5746((rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi).z - rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getRenderManager().renderPosZ;
        GL11.glLineWidth((float)this.Field15954.Method368());
        GL11.glBegin((int)((int)((long)371534688 ^ (long)371534689)));
        this.Field15948.Method339().Method3632();
        int n = (int)((long)2135016462 ^ (long)2135016462);
        while (true) {
            int cfr_ignored_0 = (int)((long)-1907873944 ^ (long)-1907873979) << 3;
            Vec3d vec3d = new Vec3d(d + Math.sin((double)n * Double.longBitsToDouble(0xB3F59A53BF9F5735L ^ 0xF3FCBBA8EBDB7A2DL) / Double.longBitsToDouble((long)919509432 ^ 0x4066800036CE99B8L)) * (double)rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5747(rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi), d2 + (double)rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5748(rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) * ((double)(System.currentTimeMillis() - rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5749(rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) / (Double.longBitsToDouble((long)2084540661 ^ 0x408F40007C3F90F5L) * this.Field15953.Method367())), d3 + Math.cos((double)n * Double.longBitsToDouble((long)1863033455 ^ 0x400921FB3B4F8F77L) / Double.longBitsToDouble((long)2049302457 ^ 0x406680007A25DFB9L)) * (double)rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5747(rGDU8gHC8ukIlu9kQbum52dfFGCCSxT8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi));
            GL11.glVertex3d((double)vec3d.x, (double)vec3d.y, (double)vec3d.z);
            ++n;
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1010510500 ^ (long)1010510500);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)694241916 ^ (long)694241923);
            int n2 = ((int)-505036468L ^ 0xE1E5C111) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)769091950L ^ 0x2DD762C7) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

