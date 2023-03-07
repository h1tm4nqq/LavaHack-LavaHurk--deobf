//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.EntityFishHook
 *  net.minecraft.network.play.server.SPacketEntityStatus
 *  net.minecraft.network.play.server.SPacketEntityVelocity
 *  net.minecraft.network.play.server.SPacketExplosion
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.Arrays;
import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.jNiJm0uQgY2wVhFel4twUsWMig1Nujvc;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16322;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16323;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16324;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16325;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16326;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16327;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16328;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16329;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16330;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16331;
    private String Field16332 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l() {
        super("Velocity", "akb", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        String[] stringArray = new String[((int)-38459324L ^ 0xFDB52845) << 2];
        stringArray[(int)1223795678L ^ 0x48F1A3DE] = "None";
        stringArray[(int)755482037L ^ 0x2D07BDB4] = "Matrix";
        stringArray[(int)((long)-772548525 ^ (long)-772548526) << 1] = "Matrix 6.4";
        stringArray[(int)-22396516L ^ 0xFEAA419F] = "Vanilla";
        this.Field16322 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "None", Arrays.asList(stringArray)));
        this.Field16323 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Explosion", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-126581257L ^ 0xF87485F6) != 0));
        this.Field16324 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Bobbers", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)225798181L ^ 0xD756824) != 0));
        this.Field16325 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NoPush", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1601808631L ^ 0x5F79A8F6) != 0));
        this.Field16326 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Horizontal", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xAE5FB9450187586CL ^ 0xEE0939450187586CL), 0.0, Double.longBitsToDouble(0x8D7A2CE2AC5D9179L ^ 0xCD232CE2AC5D9179L), (boolean)((long)-1450466847 ^ (long)-1450466848)));
        this.Field16327 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Vertical", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x738B1C2B180AA9F1L ^ 0x33D21C2B180AA9F1L), 0.0, Double.longBitsToDouble((long)593972255 ^ 0x4059000023674C1FL), ((int)-1884331097L ^ 0x8FAF63A6) != 0));
        this.Field16328 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6831, new Predicate[(int)1723416908L ^ 0x66B9414C]);
        this.Field16329 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6830, new Predicate[(int)-1068054152L ^ 0xC056C978]);
        this.Field16330 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6829, new Predicate[(int)241486094L ^ 0xE64C90E]);
        this.Field16331 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6828, new Predicate[(int)((long)-943432869 ^ (long)-943432869)]);
        super.Method44(this::Method6832);
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16331);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16328);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16329);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16330);
    }

    @Override
    public void Method45() {
        if (Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field16322.Method309("Matrix") && Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(new BlockPos(Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ)).getBlock() == Block.getBlockById((int)((int)-264239275L ^ 0xF0400755)) && Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime > 0) {
            Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(0xD0945725593F9030L ^ 0x6F5DCEBCC0A609AAL);
            return;
        }
        if (this.Field16322.Method309("Matrix 6.4") && Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime > ((int)-899415653L ^ 0xCA64019A) << 3) {
            Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = (int)-345955168L ^ 0xEB6124A1;
            return;
        }
        if (!this.Field16322.Method309("Vanilla")) return;
        if (Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.hurtTime != Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.maxHurtTime) return;
        Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX *= (double)this.Field16326.Method335() / Double.longBitsToDouble(0x3D3904625098E839L ^ 0x7D6004625098E839L);
        Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY *= (double)this.Field16327.Method335() / Double.longBitsToDouble((long)2003348113 ^ 0x405900007768AA91L);
        Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ *= (double)this.Field16326.Method335() / Double.longBitsToDouble(0xA2DC21609500281CL ^ 0xE28521609500281CL);
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16331);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16328);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16329);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16330);
    }

    private void Method6828(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketEntityVelocity && ((SPacketEntityVelocity)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982()).getEntityID() == Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityId()) {
            tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
        }
        if (tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketExplosion && this.Field16323.Method365()) {
            tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
        }
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketEntityStatus)) return;
        if (!this.Field16324.Method365()) return;
        SPacketEntityStatus sPacketEntityStatus = (SPacketEntityStatus)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
        if (sPacketEntityStatus.getOpCode() != ((int)680568143L ^ 0x2890A550)) return;
        Entity entity = sPacketEntityStatus.getEntity((World)Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world);
        if (!(entity instanceof EntityFishHook)) return;
        if (((EntityFishHook)entity).caughtEntity != Xvj1qISIlLAZS3zmtzeSfswmsICuvT6l.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
    }

    private void Method6829(jNiJm0uQgY2wVhFel4twUsWMig1Nujvc jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2) {
        if (!this.Field16325.Method365()) return;
        jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2.Method158();
    }

    private void Method6830(DsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB dsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB) {
        if (!this.Field16325.Method365()) return;
        dsAaAHmL7Yq0IkjnWsKfUDurp0luEZxB.Method158();
    }

    private void Method6831(u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ2) {
        if (!this.Field16325.Method365()) return;
        u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ2.Method158();
    }

    private String Method6832() {
        return "[" + this.Field16322 + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)214012932 ^ (long)214012932);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1518259246L ^ 0x5A7ECCD1);
            int n2 = ((int)-1966083323L ^ 0x8ACFF34A) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1129646774L ^ 0xBCAAF78B) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

