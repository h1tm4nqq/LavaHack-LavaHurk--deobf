//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Arrays;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.BlockPos;

public class d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12115;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12116;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12117;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12118;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12119;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field12120;
    private int Field12121;

    public d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT() {
        super("Jesus", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        String[] stringArray = new String[(int)((long)-39540884 ^ (long)-39540887)];
        stringArray[(int)285448655L ^ 0x110399CF] = "Matrix";
        stringArray[(int)975063792L ^ 0x3A1E4AF1] = "Matrix 6.3";
        stringArray[(int)((long)-1006245293 ^ (long)-1006245294) << 1] = "MatrixPixel";
        stringArray[(int)-844020973L ^ 0xCDB14310] = "Solid";
        stringArray[((int)332273229L ^ 0x13CE164C) << 2] = "Entity";
        this.Field12115 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Matrix", Arrays.asList(stringArray)));
        this.Field12116 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speeds", this)));
        this.Field12117 = this.Method23(this.Field12116.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed Pixel", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)720118733 ^ 0x401000002AEC23CDL), 1.0, Double.longBitsToDouble((long)1382655913 ^ 0x402400005269A7A9L), (boolean)((long)-1936841015 ^ (long)-1936841016))));
        this.Field12118 = this.Method23(this.Field12116.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed Matrix", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x992AD675C99F8C71L ^ 0xA6C9E546899F8C71L), 0.0, 1.0, (boolean)((long)-1339939020 ^ (long)-1339939020))));
        this.Field12119 = this.Method23(this.Field12116.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed Solid", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0x9476DF4512FD2F30L ^ 0xD476DF4512FD2F30L), ((int)-173280126L ^ 0xF5ABF482) != 0)));
        this.Field12120 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method3960, new Predicate[(int)((long)1151816573 ^ (long)1151816573)]);
        super.Method44(this::Method3961);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field12120);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field12120);
        EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
        if (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat((int)432734439L ^ 0x2568D7ED);
    }

    @Override
    public void Method45() {
        if (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field12115.Method309("Matrix")) {
            if (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY - Double.longBitsToDouble((long)2017830589 ^ 0xBFD7AE14F845A6BDL), d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() != Blocks.WATER) return;
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = 0.0f;
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= this.Field12118.Method367();
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= this.Field12118.Method367();
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)-1591411577L ^ 0xA124FC87;
            if (!d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater()) {
                if (!d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInLava()) return;
            }
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)1110871774L ^ 0x42368EDE;
            return;
        }
        if (this.Field12115.Method309("Solid")) {
            if (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + 1.0, d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById((int)((int)-479601492L ^ 0xE369DCA5))) {
                d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)864383533 ^ 0x3FC70A3DB385722DL);
                return;
            }
            if (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + Double.longBitsToDouble(0x11ABCD77143F4E96L ^ 0x2FD11A858E83E1DEL), d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() != Block.getBlockById((int)((int)-655225049L ^ 0xD8F20F2E))) return;
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = this.Field12119.Method368();
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = 0.0;
            return;
        }
        if (this.Field12115.Method309("Matrix 6.3")) {
            if (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isInWater() && (d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally || d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isPressed())) {
                d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)707586593 ^ 0x3FB70A3D5A8F3D2BL);
                return;
            }
            if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1916(Double.longBitsToDouble((long)497568472 ^ 0x3FD333332E9B79EBL))) {
                d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)174592891 ^ 0x3FB9999993F18AE1L);
                return;
            }
            if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1916(Double.longBitsToDouble(0x8EE145418C439604L ^ 0xB128DCD815DA0F9EL))) {
                EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1953();
                d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)142043804 ^ 0x3FC9999991EEF306L);
                return;
            }
            if (!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1916(0.0)) return;
            EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1952(Float.intBitsToFloat((int)((long)1323445415 ^ (long)1907286122)));
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7161(Double.longBitsToDouble((long)521787201 ^ 0x3FF333332C2AE472L));
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            return;
        }
        if (!this.Field12115.Method309("MatrixPixel")) {
            if (!this.Field12115.Method309("Entity")) return;
            if (!d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) return;
            if (!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1936()) return;
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)1620894633 ^ 0x3FB5C28F009CE3A9L);
            d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ridingEntity.motionY = Double.longBitsToDouble(0xB5BCAE2CE2C99D3EL ^ 0x8A096CA382C99D3EL);
            return;
        }
        if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1916(Double.longBitsToDouble((long)454978570 ^ 0xBFB999998287F590L))) {
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7158(this.Field12117.Method335());
        }
        if (!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1916(Double.longBitsToDouble(0x8F46B0F6F18A66A6L ^ 0xB13C67046B36C9EEL))) return;
        d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
        d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)536768975 ^ 0x3FAEB851FFFE71CFL);
        d9iZ4iG1LDGrSlBemybEvUoQMPs8w6bT.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = Float.intBitsToFloat(0x2E6AA484 ^ 0x1249738E);
    }

    private void Method3960(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!this.Field12115.Method309("Matrix 6.3")) {
            if (!this.Field12115.Method309("MatrixPixel")) return;
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer)) return;
        if (!EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1916(Double.longBitsToDouble((long)1876975052 ^ 0x3FD333335CD36EFFL))) return;
        ((CPacketPlayer)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982()).onGround = (int)1867957764L ^ 0x6F56C604;
    }

    private String Method3961() {
        return "[" + this.Field12115.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)451617567 ^ (long)451617567);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1087864577L ^ 0x40D77FFE);
            int n2 = ((int)-919256003L ^ 0xC935443C) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1144584349 ^ (long)-1144578896) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

