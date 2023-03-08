//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.block.material.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

@Class2012
public class Class569 extends Class42
{
    private final Class44 Field10422;
    private final Class44 Field10423;
    private final Class44 Field10424;
    private final Class44 Field10425;
    private final Class44 Field10426;
    private final Class44 Field10427;
    private final Class44 Field10428;
    private final Class44 Field10429;
    private final Class44 Field10430;
    private final Class44 Field10431;
    private boolean Field10432;
    private final double[] Field10433;
    private int Field10434;
    private boolean Field10435;
    private boolean Field10436;
    private String Field10437 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class569() {
        super("Anchor", "Helps with holes", Class97.Field8340);
        this.Field10422 = this.Method23(new Class44("Mode", (Class42)this, (Enum)Class1771.Field16117));
        this.Field10423 = this.Method23(new Class44("Pitch", (Class42)this, Double.longBitsToDouble((long)1342286949 ^ 0x404E00005001AC65L), 0.0, Double.longBitsToDouble((long)1634373898 ^ 0x40568000616A910AL), false));
        this.Field10424 = this.Method23(new Class44("Timer", (Class42)this, false));
        this.Field10425 = this.Method23(new Class44("Timer Value", (Class42)this, Double.longBitsToDouble(4617315517961601024L), Double.longBitsToDouble((long)764985216 ^ 0x3FB999998D98BF80L), Double.longBitsToDouble((long)101850640 ^ 0x4034000006121E10L), false).Method313((Supplier)this.Field10424::Method365));
        this.Field10426 = this.Method23(new Class44("Disable After Complete", (Class42)this, false));
        this.Field10427 = this.Method23(new Class44("Fast Fall", (Class42)this, false));
        this.Field10428 = this.Method23(new Class44("Fast Fall Motion", (Class42)this, Double.longBitsToDouble((long)1031753378 ^ 0x402400003D7F4EA2L), 1.0, Double.longBitsToDouble((long)313282417 ^ 0x4024000012AC4F71L), false).Method313((Supplier)this.Field10427::Method365));
        this.Field10429 = this.Method23(new Class44("Use Fast Fall Lag Time", (Class42)this, false));
        this.Field10430 = this.Method23(new Class44("Fast Fall Lag Time", (Class42)this, Double.longBitsToDouble(4647503709213818880L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
        this.Field10431 = this.Method23(new Class44("Sync With Reverse Step", (Class42)this, false));
        this.Field10432 = false;
        this.Field10433 = new double[] { Double.longBitsToDouble((long)34175418 ^ 0x3FDAE147AC1D035BL), Double.longBitsToDouble((long)670257742 ^ 0x3FE8000027F3524EL) };
        this.Field10435 = false;
        this.Field10436 = false;
        super.Method44((Supplier)this::Method2516);
    }
    
    private boolean Method2513(final BlockPos blockPos) {
        int n = 0;
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 3, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 2, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 1, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 0)).getBlock() == Blocks.AIR) {
            ++n;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.OBSIDIAN || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.BEDROCK || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, -1, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.OBSIDIAN || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.BEDROCK || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(1, 0, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.OBSIDIAN || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.BEDROCK || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(-1, 0, 0)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.OBSIDIAN || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.BEDROCK || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, 1)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.OBSIDIAN || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.BEDROCK || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos.add(0, 0, -1)).getBlock() == Blocks.ENDER_CHEST) {
            ++n;
        }
        return n >= 9;
    }
    
    private Vec3d Method2514(final double a, final double a2, final double a3) {
        return new Vec3d(Math.floor(a) + Double.longBitsToDouble(4602678819172646912L), Math.floor(a2), Math.floor(a3) + Double.longBitsToDouble(4602678819172646912L));
    }
    
    public void Method38() {
        if (this.Field10432 && this.Field10436) {
            ((Class1913)Class1796.Field16241.Field16254.Method1162("MoveModifier")).Method7102().Method366(true);
        }
        this.Field10432 = false;
    }
    
    public void Method45() {
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null && Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isDead || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY < 0.0) {
            this.Field10432 = false;
            return;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch >= this.Field10423.Method335()) {
            if (this.Method2513(Class1744.Method6638().down(1)) || this.Method2513(Class1744.Method6638().down(2)) || this.Method2513(Class1744.Method6638().down(3)) || this.Method2513(Class1744.Method6638().down(4))) {
                if (this.Field10422.Method359().equals(Class1771.Field16117.name())) {
                    final Vec3d method2514 = this.Method2514(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                    final double abs = Math.abs(method2514.x - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
                    final double abs2 = Math.abs(method2514.z - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                    if (abs > Double.longBitsToDouble((long)1189452443 ^ 0x3FB99999DF7C0301L) || abs2 > Double.longBitsToDouble((long)922663839 ^ 0x3FB99999AF672205L)) {
                        final double n = method2514.x - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                        final double n2 = method2514.z - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                        Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = n / Double.longBitsToDouble(4611686018427387904L);
                        Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = n2 / Double.longBitsToDouble(4611686018427387904L);
                    }
                    this.Field10432 = true;
                }
                else if (this.Field10422.Method359().equals(Class1771.Field16118.name())) {
                    if (!Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                        this.Field10435 = Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown();
                    }
                    if (!this.Field10435 && Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Double.longBitsToDouble((long)119915999 ^ 0x3FE000000725C5DFL) && Class1036.Method4219() && Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Class1036.Method4202() <= Double.longBitsToDouble(4607745368753438720L) && Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Class1036.Method4202() <= Double.longBitsToDouble((long)1186737216 ^ 0x3FEE666620DA4A26L) && !Class394.Method1919() && !Class394.Method1936()) {
                        if (!Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                            ++this.Field10434;
                        }
                        if (!Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround && !Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInsideOfMaterial(Material.WATER) && !Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInsideOfMaterial(Material.LAVA) && !Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown() && !Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isOnLadder() && this.Field10434 > 0) {
                            final BlockPos blockPos = new BlockPos(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                            final double[] field10433 = this.Field10433;
                            for (int length = field10433.length, i = 0; i < length; ++i) {
                                Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Position((double)(blockPos.getX() + Float.intBitsToFloat(1056964608)), Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - field10433[i], (double)(blockPos.getZ() + Float.intBitsToFloat(1056964608)), true));
                            }
                            Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition((double)(blockPos.getX() + Float.intBitsToFloat(1056964608)), Class1036.Method4202() + Double.longBitsToDouble((long)1548330992 ^ 0x3FB99999C5D03E6AL), (double)(blockPos.getZ() + Float.intBitsToFloat(1056964608)));
                            this.Field10434 = 0;
                        }
                    }
                }
                else if (this.Field10422.Method309("MovementStop")) {
                    if (this.Method2513(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition())) {
                        Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
                        Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
                    }
                    else {
                        final Vec3d method2515 = this.Method2514(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                        final double abs3 = Math.abs(method2515.x - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
                        final double abs4 = Math.abs(method2515.z - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                        if (abs3 > Double.longBitsToDouble(4591870180066957722L) || abs4 > Double.longBitsToDouble(4591870180066957722L)) {
                            final double n3 = method2515.x - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                            final double n4 = method2515.z - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                            Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = n3 / Double.longBitsToDouble(4611686018427387904L);
                            Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = n4 / Double.longBitsToDouble(4611686018427387904L);
                        }
                    }
                    this.Field10432 = true;
                }
                if (this.Field10427.Method365() && !this.Method2515()) {
                    Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field10428.Method367();
                }
            }
            else {
                this.Field10432 = false;
            }
        }
        if (this.Method2513(Class1744.Method6638())) {
            this.Field10432 = false;
        }
        if (this.Field10432 && this.Field10424.Method365()) {
            Class394.Method1952(this.Field10425.Method368());
        }
        else {
            Class394.Method1953();
        }
        if (this.Method2513(Class1744.Method6638())) {
            if (this.Field10426.Method365()) {
                super.Method21(false);
            }
            if (this.Field10432) {
                this.Field10432 = false;
            }
        }
        if (this.Field10432 && this.Field10431.Method365()) {
            ((Class1913)Class1796.Field16241.Field16254.Method1162("MoveModifier")).Method7102().Method366(false);
            this.Field10436 = true;
        }
        if (this.Field10436 && !this.Field10432) {
            ((Class1913)Class1796.Field16241.Field16254.Method1162("MoveModifier")).Method7102().Method366(true);
        }
    }
    
    private boolean Method2515() {
        return this.Field10429.Method365() && Class115.Field8400.Method837(this.Field10430.Method335());
    }
    
    private String Method2516() {
        return "[" + this.Field10422.Method359() + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6678 ^ 0xAE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
