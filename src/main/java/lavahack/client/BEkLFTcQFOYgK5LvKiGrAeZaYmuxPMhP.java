//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 */
package lavahack.client;

import lavahack.client.EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH;
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.OJABlAPdyVebeKqkgNsK8SgjycFXkkna;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.Zhgf3QiCpopc7WZLbt543132rYDzfYwu;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;

@EfXHaWvRZ3sJRgPAk4iWnLScsCeNBnTH
public class BEkLFTcQFOYgK5LvKiGrAeZaYmuxPMhP
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16214 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x125A73A1BB124486L ^ 0x521E73A1BB124486L), 0.0, Double.longBitsToDouble(0x27106A54C4954729L ^ 0x67546A54C4954729L), (boolean)((long)2017974918 ^ (long)2017974918)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16215 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CheckUse", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1014195879L ^ 0x3C7366A7) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16216 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("MaxUse", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)2004394771 ^ 0x402400007778A313L), 0.0, Double.longBitsToDouble((long)537916071 ^ 0x40340000200FF2A7L), ((int)-1719255752L ^ 0x99863D39) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16217 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("BowInHandCheck", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-3373249L ^ 0xFFCC873E) != 0));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field16218 = this.Method25(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8498));
    private boolean Field16219;
    private int Field16220;
    @Zhgf3QiCpopc7WZLbt543132rYDzfYwu
    public EntityPlayer Field16221 = null;
    private String Field16222 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public BEkLFTcQFOYgK5LvKiGrAeZaYmuxPMhP() {
        super("AntiBow", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        super.Method44(this::Method6776);
    }

    @Override
    public void Method38() {
        this.Field16219 = (int)((long)1070426264 ^ (long)1070426264);
        this.Field16221 = null;
    }

    @Override
    public void Method45() {
        if (BEkLFTcQFOYgK5LvKiGrAeZaYmuxPMhP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && BEkLFTcQFOYgK5LvKiGrAeZaYmuxPMhP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field16221 = EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1924(this.Field16214.Method368());
        if (this.Field16221 == null) {
            if (!this.Field16219) return;
            BEkLFTcQFOYgK5LvKiGrAeZaYmuxPMhP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.pressed = (int)((long)-790178741 ^ (long)-790178741);
            if (this.Field16220 != ((int)-1097419691L ^ 0x41694BAA)) {
                lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(this.Field16220, (boolean)((long)-843159464 ^ (long)-843159463));
            }
            this.Field16219 = (int)((long)-178897641 ^ (long)-178897641);
            return;
        }
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method116(Items.SHIELD, (int)1135390098L ^ 0x43ACAD92, (int)((long)1102540756 ^ (long)1102540765));
        if (n == (int)((long)1949376705 ^ (long)-1949376706)) {
            return;
        }
        this.Field16220 = BEkLFTcQFOYgK5LvKiGrAeZaYmuxPMhP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (this.Field16217.Method365()) {
            if (!this.Field16221.getHeldItemMainhand().getItem().equals(Items.BOW)) return;
        }
        if (this.Field16215.Method365() && (double)this.Field16221.getItemInUseMaxCount() <= this.Field16216.Method367()) {
            return;
        }
        if (!BEkLFTcQFOYgK5LvKiGrAeZaYmuxPMhP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem().equals(Items.SHIELD)) {
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method110(n, (boolean)((long)1664387855 ^ (long)1664387854));
        }
        BEkLFTcQFOYgK5LvKiGrAeZaYmuxPMhP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.pressed = (int)((long)1338209346 ^ (long)1338209347);
        OJABlAPdyVebeKqkgNsK8SgjycFXkkna.Method5895((Entity)this.Field16221, (a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf)this.Field16218.Method341());
        this.Field16219 = (int)((long)54870774 ^ (long)54870775);
    }

    private String Method6776() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("[");
        if (this.Field16221 == null) {
            string = "no target no fun";
            return stringBuilder.append(string).append("]").toString();
        }
        string = this.Field16221.getName();
        return stringBuilder.append(string).append("]").toString();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-195042028L ^ 0xF45FE514;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-685433407L ^ 0xD7251D3E);
            int n2 = ((int)1648371777L ^ 0x62402866) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1575675962 ^ (long)1575651993) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

