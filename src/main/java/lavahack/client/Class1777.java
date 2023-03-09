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
import lavahack.client.Class1303;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class656;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class Class1777
extends Class42 {
    private final Class1303 Field16146 = new Class1303("RangeMode", (Class42)this, Class656.Field10804).Method5303();
    private final Class44 Field16147 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)1602267104 ^ 0x404900005F80A7E0L), 0.0, Double.longBitsToDouble((long)21909074 ^ 0x40690000014E4E52L), true).Method313(this::Method6743));
    private final Class44 Field16148 = this.Method23(new Class44("Dimension", (Class42)this, false));
    private Set Field16149 = null;
    private boolean Field16150 = false;
    private int Field16151;

    public Class1777() {
        super("LogoutSpotsExploit", Class97.Field8344);
    }

    @Override
    public void Method45() {
        if (Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Field16149 = null;
            this.Field16150 = false;
            return;
        }
        if (vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer() && !this.Field16150) {
            Class1393.Method5507().Method1886("You are in single player");
            this.Field16150 = true;
            return;
        }
        if (this.Field16149 == null) {
            this.Field16149 = Collections.newSetFromMap(new ConcurrentHashMap());
            this.Field16149.addAll(Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities);
            return;
        }
        List list = Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities;
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
            Class1393.Method5505().Method1886(entityPlayer.getName() + " logged out at x: " + entityPlayer.posX + ", y: " + entityPlayer.posY + ", z: " + entityPlayer.posY + this.Method6741(entityPlayer));
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
        if (!(Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((Entity)entityPlayer) <= this.Field16147.Method367())) return false;
        return true;
    }

    private Boolean Method6743() {
        boolean bl;
        if (this.Field16146.Method341() == Class656.Field10804) {
            bl = true;
            return bl;
        }
        bl = false;
        return bl;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 136;
            cArray2[n] = (char)(cArray[n] ^ (0x55A4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

