//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class lEU0NjklWefIAf6ILts5JFGI8QkYno3b
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field16146 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("RangeMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10804).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16147 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)1602267104 ^ 0x404900005F80A7E0L), 0.0, Double.longBitsToDouble((long)21909074 ^ 0x40690000014E4E52L), ((int)-2053364320L ^ 0x859C25A1) != 0).Method313(this::Method6743));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16148 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Dimension", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1683430981L ^ 0x9BA8E1BB) != 0));
    private Set Field16149 = null;
    private boolean Field16150 = (int)523626836L ^ 0x1F35E954;
    private int Field16151;

    public lEU0NjklWefIAf6ILts5JFGI8QkYno3b() {
        super("LogoutSpotsExploit", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method45() {
        if (lEU0NjklWefIAf6ILts5JFGI8QkYno3b.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || lEU0NjklWefIAf6ILts5JFGI8QkYno3b.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Field16149 = null;
            this.Field16150 = (int)((long)-1494860765 ^ (long)-1494860765);
            return;
        }
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer() && !this.Field16150) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1886("You are in single player");
            this.Field16150 = (int)((long)1743814281 ^ (long)1743814280);
            return;
        }
        if (this.Field16149 == null) {
            this.Field16149 = Collections.newSetFromMap(new ConcurrentHashMap());
            this.Field16149.addAll(lEU0NjklWefIAf6ILts5JFGI8QkYno3b.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities);
            return;
        }
        List list = lEU0NjklWefIAf6ILts5JFGI8QkYno3b.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities;
        List<Object> list2 = new ArrayList<EntityPlayer>();
        for (EntityPlayer entityPlayer : this.Field16149) {
            if (list.contains(entityPlayer)) continue;
            list2.add(entityPlayer);
        }
        list2 = list2.stream().filter(this::Method6742).collect(Collectors.toList());
        Iterator<Object> iterator = list2.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer;
            entityPlayer = (EntityPlayer)iterator.next();
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886(entityPlayer.getName() + " logged out at x: " + entityPlayer.posX + ", y: " + entityPlayer.posY + ", z: " + entityPlayer.posY + this.Method6741(entityPlayer));
        }
    }

    private String Method6741(EntityPlayer entityPlayer) {
        int n = entityPlayer.dimension;
        String string = "";
        if (!this.Field16148.Method365()) return string;
        string = " in the ";
        switch (n) {
            case 1: {
                return string + "Overworld";
            }
            case 2: {
                return string + "Nether";
            }
            case 3: {
                return string + "End";
            }
        }
        return string + "(Unknown Dimension)";
    }

    private boolean Method6742(EntityPlayer entityPlayer) {
        int n;
        if (lEU0NjklWefIAf6ILts5JFGI8QkYno3b.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((Entity)entityPlayer) <= this.Field16147.Method367()) {
            n = (int)965190399L ^ 0x3987A2FE;
            return n != 0;
        }
        n = (int)((long)986189562 ^ (long)986189562);
        return n != 0;
    }

    private Boolean Method6743() {
        int n;
        if (this.Field16146.Method341() == lEU0NjklWefIAf6ILts5JFGI8QkYno3b$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10804) {
            n = (int)((long)-1091870185 ^ (long)-1091870186);
            return n != 0;
        }
        n = (int)((long)747209084 ^ (long)747209084);
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1021250175L ^ 0x3CDF0A7F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1773879636L ^ 0x9644BE53);
            int n2 = (int)((long)-1416107994 ^ (long)-1416107977) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-212862376L ^ 0xF34FEF31) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

