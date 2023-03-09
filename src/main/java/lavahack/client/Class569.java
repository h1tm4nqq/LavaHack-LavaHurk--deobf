//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.material.Material
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import lavahack.client.Class1036;
import lavahack.client.Class115;
import lavahack.client.Class1744;
import lavahack.client.Class1771;
import lavahack.client.Class1796;
import lavahack.client.Class1913;
import lavahack.client.Class2012;
import lavahack.client.Class394;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class97;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

@Class2012
public class Class569
extends Class42 {
    private final Class44 Field10422 = this.Method23(new Class44("Mode", (Class42)this, Class1771.Field16117));
    private final Class44 Field10423 = this.Method23(new Class44("Pitch", (Class42)this, Double.longBitsToDouble((long)1342286949 ^ 0x404E00005001AC65L), 0.0, Double.longBitsToDouble((long)1634373898 ^ 0x40568000616A910AL), false));
    private final Class44 Field10424 = this.Method23(new Class44("Timer", (Class42)this, false));
    private final Class44 Field10425 = this.Method23(new Class44("Timer Value", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), Double.longBitsToDouble((long)764985216 ^ 0x3FB999998D98BF80L), Double.longBitsToDouble((long)101850640 ^ 0x4034000006121E10L), false).Method313(this.Field10424::Method365));
    private final Class44 Field10426 = this.Method23(new Class44("Disable After Complete", (Class42)this, false));
    private final Class44 Field10427 = this.Method23(new Class44("Fast Fall", (Class42)this, false));
    private final Class44 Field10428 = this.Method23(new Class44("Fast Fall Motion", (Class42)this, Double.longBitsToDouble((long)1031753378 ^ 0x402400003D7F4EA2L), 1.0, Double.longBitsToDouble((long)313282417 ^ 0x4024000012AC4F71L), false).Method313(this.Field10427::Method365));
    private final Class44 Field10429 = this.Method23(new Class44("Use Fast Fall Lag Time", (Class42)this, false));
    private final Class44 Field10430 = this.Method23(new Class44("Fast Fall Lag Time", (Class42)this, Double.longBitsToDouble(4647503709213818880L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
    private final Class44 Field10431 = this.Method23(new Class44("Sync With Reverse Step", (Class42)this, false));
    private boolean Field10432 = false;
    private final double[] Field10433 = new double[]{Double.longBitsToDouble((long)34175418 ^ 0x3FDAE147AC1D035BL), Double.longBitsToDouble((long)670257742 ^ 0x3FE8000027F3524EL)};
    private int Field10434;
    private boolean Field10435 = false;
    private boolean Field10436 = false;
    private String Field10437 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class569() {
        super("Anchor", "Helps with holes", Class97.Field8340);
        super.Method44(this::Method2516);
    }

    private boolean Method2513(BlockPos blockPos) {
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
        if (n < 9) return false;
        return true;
    }

    private Vec3d Method2514(double d, double d2, double d3) {
        return new Vec3d(Math.floor(d) + Double.longBitsToDouble(4602678819172646912L), Math.floor(d2), Math.floor(d3) + Double.longBitsToDouble(4602678819172646912L));
    }

    @Override
    public void Method38() {
        if (this.Field10432 && this.Field10436) {
            Class1913 class1913 = (Class1913)Class1796.Field16241.Field16254.Method1162("MoveModifier");
            class1913.Method7102().Method366(true);
        }
        this.Field10432 = false;
    }

    @Override
    public void Method45() {
        Object object;
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null && Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isDead || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY < 0.0) {
            this.Field10432 = false;
            return;
        }
        if (Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch >= (float)this.Field10423.Method335()) {
            if (this.Method2513(Class1744.Method6638().down(1)) || this.Method2513(Class1744.Method6638().down(2)) || this.Method2513(Class1744.Method6638().down(3)) || this.Method2513(Class1744.Method6638().down(4))) {
                if (this.Field10422.Method359().equals(Class1771.Field16117.name())) {
                    object = this.Method2514(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                    double d = Math.abs(((Vec3d)object).x - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
                    double d2 = Math.abs(((Vec3d)object).z - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                    if (!(d <= Double.longBitsToDouble((long)1189452443 ^ 0x3FB99999DF7C0301L)) || !(d2 <= Double.longBitsToDouble((long)922663839 ^ 0x3FB99999AF672205L))) {
                        double d3 = ((Vec3d)object).x - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                        double d4 = ((Vec3d)object).z - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                        Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = d3 / Double.longBitsToDouble(0x4000000000000000L);
                        Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = d4 / Double.longBitsToDouble(0x4000000000000000L);
                    }
                    this.Field10432 = true;
                } else if (this.Field10422.Method359().equals(Class1771.Field16118.name())) {
                    if (!Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                        this.Field10435 = Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown();
                    }
                    if (!this.Field10435 && (double)Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance < Double.longBitsToDouble((long)119915999 ^ 0x3FE000000725C5DFL) && Class1036.Method4219() && Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Class1036.Method4202() <= Double.longBitsToDouble(4607745368753438720L) && Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Class1036.Method4202() <= Double.longBitsToDouble((long)1186737216 ^ 0x3FEE666620DA4A26L) && !Class394.Method1919() && !Class394.Method1936()) {
                        if (!Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
                            ++this.Field10434;
                        }
                        if (!(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInsideOfMaterial(Material.WATER) || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInsideOfMaterial(Material.LAVA) || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown() || Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isOnLadder() || this.Field10434 <= 0)) {
                            object = new BlockPos(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                            for (double d : this.Field10433) {
                                Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position((double)((float)object.getX() + Float.intBitsToFloat(0x3F000000)), Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - d, (double)((float)object.getZ() + Float.intBitsToFloat(0x3F000000)), true));
                            }
                            Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition((double)((float)object.getX() + Float.intBitsToFloat(0x3F000000)), Class1036.Method4202() + Double.longBitsToDouble((long)1548330992 ^ 0x3FB99999C5D03E6AL), (double)((float)object.getZ() + Float.intBitsToFloat(0x3F000000)));
                            this.Field10434 = 0;
                        }
                    }
                } else if (this.Field10422.Method309("MovementStop")) {
                    if (this.Method2513(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition())) {
                        Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
                        Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
                    } else {
                        object = this.Method2514(Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                        double d = Math.abs(((Vec3d)object).x - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX);
                        double d5 = Math.abs(((Vec3d)object).z - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
                        if (!(d <= Double.longBitsToDouble(4591870180066957722L)) || !(d5 <= Double.longBitsToDouble(4591870180066957722L))) {
                            double d6 = ((Vec3d)object).x - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
                            double d7 = ((Vec3d)object).z - Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
                            Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = d6 / Double.longBitsToDouble(0x4000000000000000L);
                            Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = d7 / Double.longBitsToDouble(0x4000000000000000L);
                        }
                    }
                    this.Field10432 = true;
                }
                if (this.Field10427.Method365() && !this.Method2515()) {
                    Class569.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = -this.Field10428.Method367();
                }
            } else {
                this.Field10432 = false;
            }
        }
        if (this.Method2513(Class1744.Method6638())) {
            this.Field10432 = false;
        }
        if (this.Field10432 && this.Field10424.Method365()) {
            Class394.Method1952(this.Field10425.Method368());
        } else {
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
            object = (Class1913)Class1796.Field16241.Field16254.Method1162("MoveModifier");
            ((Class1913)object).Method7102().Method366(false);
            this.Field10436 = true;
        }
        if (!this.Field10436) return;
        if (this.Field10432) return;
        object = (Class1913)Class1796.Field16241.Field16254.Method1162("MoveModifier");
        ((Class1913)object).Method7102().Method366(true);
    }

    private boolean Method2515() {
        if (!this.Field10429.Method365()) return false;
        if (!Class115.Field8400.Method837(this.Field10430.Method335())) return false;
        return true;
    }

    private String Method2516() {
        return "[" + this.Field10422.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 174;
            cArray2[n] = (char)(cArray[n] ^ (0x6678 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

