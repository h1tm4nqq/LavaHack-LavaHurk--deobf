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
import lavahack.client.Class262;
import lavahack.client.Class341;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.Vec3d;

public class Class1116
extends Class42 {
    private final Class44 Field13021 = this.Method23(new Class44("Amount", (Class42)this, Double.longBitsToDouble((long)1131367579 ^ 0x40140000436F4C9BL), 1.0, Double.longBitsToDouble(0x4024000000000000L), true));
    private final Class44 Field13022 = this.Method23(new Class44("Distance", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), Double.longBitsToDouble(0x4014000000000000L), Double.longBitsToDouble((long)682317252 ^ 0x4049000028AB55C4L), true));
    private final Class44 Field13023 = this.Method23(new Class44("Sprint", (Class42)this, false));
    private final Class44 Field13024 = this.Method23(new Class44("SetPosition", (Class42)this, true));
    Queue Field13025 = new LinkedList();
    private boolean Field13026 = true;
    private String Field13027 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1116() {
        super("FastMove", Class97.Field8344);
    }

    @Override
    public void Method38() {
        if (Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        EnumFacing enumFacing = Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing();
        int n = this.Field13022.Method335() / this.Field13021.Method335();
        int n2 = this.Field13022.Method335() - n * this.Field13021.Method335();
        double d = Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d2 = Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d3 = Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        for (int i = 0; i < n; ++i) {
            Vec3d vec3d = this.Method4562(enumFacing, this.Field13021.Method335(), d, d2, d3);
            int n3 = Class341.Method1678(this.Method4561(d, d2, d3, vec3d.x, vec3d.y, vec3d.z), this.Field13023.Method365());
            CPacketPlayer.Position[] positionArray = Class341.Method1679(n3, true, false, false, false, d, d2, d3, vec3d.x, vec3d.y, vec3d.z);
            this.Field13025.offer(Arrays.asList(positionArray));
            d = vec3d.x;
            d2 = vec3d.y;
            d3 = vec3d.z;
        }
        if (n2 == 0) {
            this.Field13026 = false;
            return;
        }
        Vec3d vec3d = this.Method4562(enumFacing, this.Field13021.Method335(), d, d2, d3);
        int n4 = Class341.Method1678(this.Method4561(d, d2, d3, vec3d.x, vec3d.y, vec3d.z), this.Field13023.Method365());
        CPacketPlayer.Position[] positionArray = Class341.Method1679(n4, true, false, false, false, d, d2, d3, vec3d.x, vec3d.y, vec3d.z);
        this.Field13025.offer(Arrays.asList(positionArray));
        this.Field13026 = false;
    }

    @Override
    public void Method45() {
        if (Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
            Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)position);
            if (!this.Field13024.Method365()) continue;
            Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(position.x, position.y, position.z);
        }
        if (!this.Field13025.isEmpty()) {
            return;
        }
        CPacketPlayer.Position position = (CPacketPlayer.Position)list.get(list.size() - 1);
        Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(position.x, position.y, position.z);
    }

    @Override
    public void Method39() {
        this.Field13025.clear();
        this.Field13026 = true;
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
        switch (Class262.Field9164[enumFacing.ordinal()]) {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 57;
            cArray2[n] = (char)(cArray[n] ^ (0x3487 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

