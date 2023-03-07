//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import lavahack.client.QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr$1;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XDiY4GRhFsGdqmqYgbrvieuwziIHGbpS;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.Vec3d;

public class QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13021 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Amount", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1131367579 ^ 0x40140000436F4C9BL), 1.0, Double.longBitsToDouble(0x8092F8CF9CCF5C9BL ^ 0xC0B6F8CF9CCF5C9BL), (boolean)((long)1674300455 ^ (long)1674300454)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13022 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x4A16676A8F0B3FA7L ^ 0xA32676A8F0B3FA7L), Double.longBitsToDouble(0x7ED92DCE12032758L ^ 0x3ECD2DCE12032758L), Double.longBitsToDouble((long)682317252 ^ 0x4049000028AB55C4L), (boolean)((long)473317688 ^ (long)473317689)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13023 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sprint", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2011805329L ^ 0x77E9B691) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13024 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SetPosition", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)64672942 ^ (long)64672943)));
    Queue Field13025 = new LinkedList();
    private boolean Field13026 = (int)1159599199L ^ 0x451E145E;
    private String Field13027 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr() {
        super("FastMove", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        if (QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        EnumFacing enumFacing = QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing();
        int n = this.Field13022.Method335() / this.Field13021.Method335();
        int n2 = this.Field13022.Method335() - n * this.Field13021.Method335();
        double d = QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d2 = QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        for (int i = (int)((long)-1887545005 ^ (long)-1887545005); i < n; ++i) {
            Vec3d vec3d = this.Method4562(enumFacing, this.Field13021.Method335(), d, d2, d3);
            int n3 = XDiY4GRhFsGdqmqYgbrvieuwziIHGbpS.Method1678(this.Method4561(d, d2, d3, vec3d.x, vec3d.y, vec3d.z), this.Field13023.Method365());
            CPacketPlayer.Position[] positionArray = XDiY4GRhFsGdqmqYgbrvieuwziIHGbpS.Method1679(n3, (boolean)((long)-1793835861 ^ (long)-1793835862), ((int)-11851485L ^ 0xFF4B2923) != 0, (boolean)((long)1546235479 ^ (long)1546235479), (boolean)((long)364624368 ^ (long)364624368), d, d2, d3, vec3d.x, vec3d.y, vec3d.z);
            this.Field13025.offer(Arrays.asList(positionArray));
            d = vec3d.x;
            d2 = vec3d.y;
            d3 = vec3d.z;
        }
        if (n2 == 0) {
            this.Field13026 = (int)((long)-344867202 ^ (long)-344867202);
            return;
        }
        Vec3d vec3d = this.Method4562(enumFacing, this.Field13021.Method335(), d, d2, d3);
        int n4 = XDiY4GRhFsGdqmqYgbrvieuwziIHGbpS.Method1678(this.Method4561(d, d2, d3, vec3d.x, vec3d.y, vec3d.z), this.Field13023.Method365());
        CPacketPlayer.Position[] positionArray = XDiY4GRhFsGdqmqYgbrvieuwziIHGbpS.Method1679(n4, ((int)1100550015L ^ 0x41990F7E) != 0, ((int)-1509478066L ^ 0xA607314E) != 0, (boolean)((long)1686968004 ^ (long)1686968004), (boolean)((long)954390958 ^ (long)954390958), d, d2, d3, vec3d.x, vec3d.y, vec3d.z);
        this.Field13025.offer(Arrays.asList(positionArray));
        this.Field13026 = (int)((long)11280043 ^ (long)11280043);
    }

    @Override
    public void Method45() {
        if (QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (this.Field13026) {
            return;
        }
        if (this.Field13025.isEmpty()) {
            this.Method22();
            return;
        }
        List list = (List)this.Field13025.poll();
        for (CPacketPlayer.Position position : list) {
            if (position == null) continue;
            QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)position);
            if (!this.Field13024.Method365()) continue;
            QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(position.x, position.y, position.z);
        }
        if (!this.Field13025.isEmpty()) {
            return;
        }
        CPacketPlayer.Position position = (CPacketPlayer.Position)list.get(list.size() - (int)((long)2116924014 ^ (long)2116924015));
        QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(position.x, position.y, position.z);
    }

    @Override
    public void Method39() {
        this.Field13025.clear();
        this.Field13026 = (int)((long)1832430419 ^ (long)1832430418);
    }

    private double Method4561(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        return Math.sqrt(d7 * d7 + d8 * d8 + d9 * d9);
    }

    private Vec3d Method4562(EnumFacing enumFacing, double d, double d2, double d3, double d4) {
        double d5 = d2;
        double d6 = d4;
        switch (QvbIAI2FqbJKSJsv3d9CDP6zojHXnNxr$1.Field9164[enumFacing.ordinal()]) {
            case 1: {
                return new Vec3d(d5, d3, d6 -= d);
            }
            case 2: {
                d5 += d;
            }
            case 3: {
                d6 += d;
            }
            case 4: {
                d5 -= d;
            }
        }
        return new Vec3d(d2, d3, d4);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)719351954 ^ (long)719351954);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2004867496 ^ (long)2004867415);
            int n2 = (int)682994410L ^ 0x28B5AAD3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)321436039 ^ (long)321424640) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

