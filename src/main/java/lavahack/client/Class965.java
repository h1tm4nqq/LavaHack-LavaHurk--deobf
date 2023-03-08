//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import net.minecraft.client.entity.*;
import net.minecraft.network.play.client.*;

public class Class965 extends Class42
{
    private final Class44 Field12115;
    private final Class1996 Field12116;
    private final Class44 Field12117;
    private final Class44 Field12118;
    private final Class44 Field12119;
    @Class1801
    private final Class618 Field12120;
    private int Field12121;
    
    public Class965() {
        super("Jesus", Class97.Field8340);
        this.Field12115 = this.Method23(new Class44("Mode", (Class42)this, "Matrix", (List)Arrays.asList("Matrix", "Matrix 6.3", "MatrixPixel", "Solid", "Entity")));
        this.Field12116 = this.Method24(new Class1996(new Class44("Speeds", (Class42)this)));
        this.Field12117 = this.Method23(this.Field12116.Method7405(new Class44("Speed Pixel", (Class42)this, Double.longBitsToDouble((long)720118733 ^ 0x401000002AEC23CDL), 1.0, Double.longBitsToDouble((long)1382655913 ^ 0x402400005269A7A9L), true)));
        this.Field12118 = this.Method23(this.Field12116.Method7405(new Class44("Speed Matrix", (Class42)this, Double.longBitsToDouble(4603579539312869376L), 0.0, 1.0, false)));
        this.Field12119 = this.Method23(this.Field12116.Method7405(new Class44("Speed Solid", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(4611686018427387904L), false)));
        this.Field12120 = new Class618(this::Method3960, new Predicate[0]);
        super.Method44((Supplier)this::Method3961);
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field12120);
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field12120);
        Class394.Method1953();
        if (Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(1017370378);
    }
    
    public void Method45() {
        if (Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field12115.Method309("Matrix")) {
            if (Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble((long)2017830589 ^ 0xBFD7AE14F845A6BDL), Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Blocks.WATER) {
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = 0.0f;
                final EntityPlayerSP player = Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player.motionX *= this.Field12118.Method367();
                final EntityPlayerSP player2 = Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player2.motionZ *= this.Field12118.Method367();
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = false;
                if (Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() || Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) {
                    Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = false;
                }
            }
        }
        else if (this.Field12115.Method309("Solid")) {
            if (Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + 1.0, Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById(9)) {
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)864383533 ^ 0x3FC70A3DB385722DL);
            }
            else if (Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(4502148214488346440L), Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById(9)) {
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = this.Field12119.Method368();
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 0.0;
            }
        }
        else if (this.Field12115.Method309("Matrix 6.3")) {
            if (Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() && (Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally || Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isPressed())) {
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)707586593 ^ 0x3FB70A3D5A8F3D2BL);
                return;
            }
            if (Class394.Method1916(Double.longBitsToDouble((long)497568472 ^ 0x3FD333332E9B79EBL))) {
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)174592891 ^ 0x3FB9999993F18AE1L);
            }
            else if (Class394.Method1916(Double.longBitsToDouble(4596373779694328218L))) {
                Class394.Method1953();
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)142043804 ^ 0x3FC9999991EEF306L);
            }
            else if (Class394.Method1916(0.0)) {
                Class394.Method1952(Float.intBitsToFloat(1061997773));
                Class1917.Method7161(Double.longBitsToDouble((long)521787201 ^ 0x3FF333332C2AE472L));
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            }
        }
        else if (this.Field12115.Method309("MatrixPixel")) {
            if (Class394.Method1916(Double.longBitsToDouble((long)454978570 ^ 0xBFB999998287F590L))) {
                Class1917.Method7158((float)this.Field12117.Method335());
            }
            if (Class394.Method1916(Double.longBitsToDouble(4502148214488346440L))) {
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)536768975 ^ 0x3FAEB851FFFE71CFL);
                Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(1008981770);
            }
        }
        else if (this.Field12115.Method309("Entity") && Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding() && Class394.Method1936()) {
            Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)1620894633 ^ 0x3FB5C28F009CE3A9L);
            Class965.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity.motionY = Double.longBitsToDouble(4590789316220813312L);
        }
    }
    
    private void Method3960(final Class805 class805) {
        if ((this.Field12115.Method309("Matrix 6.3") || this.Field12115.Method309("MatrixPixel")) && class805.Method982() instanceof CPacketPlayer && Class394.Method1916(Double.longBitsToDouble((long)1876975052 ^ 0x3FD333335CD36EFFL))) {
            ((CPacketPlayer)class805.Method982()).onGround = false;
        }
    }
    
    private String Method3961() {
        return "[" + this.Field12115.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1BD3 ^ 0x4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
