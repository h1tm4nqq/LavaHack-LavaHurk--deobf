//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import java.util.*;

public class Class1116 extends Class42
{
    private final Class44 Field13021;
    private final Class44 Field13022;
    private final Class44 Field13023;
    private final Class44 Field13024;
    Queue Field13025;
    private boolean Field13026;
    private String Field13027 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1116() {
        super("FastMove", Class97.Field8344);
        this.Field13021 = this.Method23(new Class44("Amount", this, Double.longBitsToDouble((long)1131367579 ^ 0x40140000436F4C9BL), 1.0, Double.longBitsToDouble(4621819117588971520L), true));
        this.Field13022 = this.Method23(new Class44("Distance", this, Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble((long)682317252 ^ 0x4049000028AB55C4L), true));
        this.Field13023 = this.Method23(new Class44("Sprint", this, false));
        this.Field13024 = this.Method23(new Class44("SetPosition", this, true));
        this.Field13025 = new LinkedList();
        this.Field13026 = true;
    }
    
    @Override
    public void Method38() {
        if (Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        final EnumFacing getHorizontalFacing = Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing();
        final int n = this.Field13022.Method335() / this.Field13021.Method335();
        final int n2 = this.Field13022.Method335() - n * this.Field13021.Method335();
        double n3 = Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double n4 = Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double n5 = Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        for (int i = 0; i < n; ++i) {
            final Vec3d method4562 = this.Method4562(getHorizontalFacing, this.Field13021.Method335(), n3, n4, n5);
            this.Field13025.offer(Arrays.asList(Class341.Method1679(Class341.Method1678(this.Method4561(n3, n4, n5, method4562.x, method4562.y, method4562.z), this.Field13023.Method365()), true, false, false, false, n3, n4, n5, method4562.x, method4562.y, method4562.z)));
            n3 = method4562.x;
            n4 = method4562.y;
            n5 = method4562.z;
        }
        if (n2 == 0) {
            this.Field13026 = false;
            return;
        }
        final Vec3d method4563 = this.Method4562(getHorizontalFacing, this.Field13021.Method335(), n3, n4, n5);
        this.Field13025.offer(Arrays.asList(Class341.Method1679(Class341.Method1678(this.Method4561(n3, n4, n5, method4563.x, method4563.y, method4563.z), this.Field13023.Method365()), true, false, false, false, n3, n4, n5, method4563.x, method4563.y, method4563.z)));
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
        final List<CPacketPlayer$Position> list = this.Field13025.poll();
        for (final CPacketPlayer$Position cPacketPlayer$Position : list) {
            if (cPacketPlayer$Position == null) {
                continue;
            }
            Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)cPacketPlayer$Position);
            if (!this.Field13024.Method365()) {
                continue;
            }
            Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(cPacketPlayer$Position.x, cPacketPlayer$Position.y, cPacketPlayer$Position.z);
        }
        if (!this.Field13025.isEmpty()) {
            return;
        }
        final CPacketPlayer$Position cPacketPlayer$Position2 = list.get(list.size() - 1);
        Class1116.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(cPacketPlayer$Position2.x, cPacketPlayer$Position2.y, cPacketPlayer$Position2.z);
    }
    
    @Override
    public void Method39() {
        this.Field13025.clear();
        this.Field13026 = true;
    }
    
    private double Method4561(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final double n7 = n - n4;
        final double n8 = n2 - n5;
        final double n9 = n3 - n6;
        return Math.sqrt(n7 * n7 + n8 * n8 + n9 * n9);
    }
    
    private Vec3d Method4562(final EnumFacing enumFacing, final double n, final double n2, final double n3, final double n4) {
        double n5 = n2;
        switch (Class262.Field9164[enumFacing.ordinal()]) {
            case 1: {
                return new Vec3d(n5, n3, n4 - n);
            }
            case 2: {
                n5 += n;
            }
            case 3: {}
        }
        return new Vec3d(n2, n3, n4);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3487 ^ 0x39));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
