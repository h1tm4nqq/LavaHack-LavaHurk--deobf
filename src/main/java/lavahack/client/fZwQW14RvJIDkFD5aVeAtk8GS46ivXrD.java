//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import net.minecraft.util.EnumHand;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Deprecated
public class fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private boolean Field9125 = (int)1877056944L ^ 0x6FE19DB1;
    private int Field9126;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9127 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method1368, new Predicate[(int)((long)-1135631755 ^ (long)-1135631755)]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9128 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method1367, new Predicate[(int)710087055L ^ 0x2A53118F]);
    private int Field9129;

    public fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD() {
        super("HandMine", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
        this.Field9125 = (int)2091019635L ^ 0x7CA26D72;
    }

    private void Method1367(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("damage");
        if (!this.Field9125) return;
        aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method158();
    }

    private void Method1368(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2) {
        if (fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindAttack.isKeyDown()) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("move");
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method109(fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos());
        int n2 = fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (n != ((int)1286627517L ^ 0x4CB060BC)) {
            fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
            fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        }
        this.Field9125 = (int)((long)-1097148227 ^ (long)-1097148227);
        fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.onPlayerDamageBlock(fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos(), fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit);
        this.Field9125 = (int)847427855L ^ 0x3282B90E;
        if (n == ((int)960404591L ^ 0xC6C16390)) return;
        fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        fZwQW14RvJIDkFD5aVeAtk8GS46ivXrD.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1996014032L ^ 0x89073E30;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1399455667 ^ (long)1399455564);
            int n2 = ((int)1817853551L ^ 0x6C5A3E46) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)292446960 ^ (long)292432477) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

