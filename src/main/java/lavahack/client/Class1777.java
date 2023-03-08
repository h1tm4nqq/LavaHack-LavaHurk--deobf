//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import net.minecraft.entity.player.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;
import net.minecraft.entity.*;

public class Class1777 extends Class42
{
    private final Class1303 Field16146;
    private final Class44 Field16147;
    private final Class44 Field16148;
    private Set Field16149;
    private boolean Field16150;
    private int Field16151;
    
    public Class1777() {
        super("LogoutSpotsExploit", Class97.Field8344);
        this.Field16146 = new Class1303("RangeMode", (Class42)this, (Enum)Class656.Field10804).Method5303();
        this.Field16147 = this.Method23(new Class44("Range", this, Double.longBitsToDouble((long)1602267104 ^ 0x404900005F80A7E0L), 0.0, Double.longBitsToDouble((long)21909074 ^ 0x40690000014E4E52L), true).Method313(this::Method6743));
        this.Field16148 = this.Method23(new Class44("Dimension", this, false));
        this.Field16149 = null;
        this.Field16150 = false;
    }
    
    @Override
    public void Method45() {
        if (Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Field16149 = null;
            this.Field16150 = false;
            return;
        }
        if (Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.isSingleplayer() && !this.Field16150) {
            Class1393.Method5507().Method1886("You are in single player");
            this.Field16150 = true;
            return;
        }
        if (this.Field16149 == null) {
            (this.Field16149 = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>())).addAll(Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities);
            return;
        }
        final List playerEntities = Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.playerEntities;
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final EntityPlayer entityPlayer : this.Field16149) {
            if (!playerEntities.contains(entityPlayer)) {
                list.add(entityPlayer);
            }
        }
        for (final EntityPlayer entityPlayer2 : list.stream().filter((Predicate<? super Object>)this::Method6742).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())) {
            Class1393.Method5505().Method1886(entityPlayer2.getName() + " logged out at x: " + entityPlayer2.posX + ", y: " + entityPlayer2.posY + ", z: " + entityPlayer2.posY + this.Method6741(entityPlayer2));
        }
    }
    
    private String Method6741(final EntityPlayer entityPlayer) {
        final int dimension = entityPlayer.dimension;
        String s = "";
        if (this.Field16148.Method365()) {
            final String s2 = " in the ";
            switch (dimension) {
                case 1: {
                    s = s2 + "Overworld";
                    break;
                }
                case 2: {
                    s = s2 + "Nether";
                    break;
                }
                case 3: {
                    s = s2 + "End";
                    break;
                }
                default: {
                    s = s2 + "(Unknown Dimension)";
                    break;
                }
            }
        }
        return s;
    }
    
    private boolean Method6742(final EntityPlayer entityPlayer) {
        return Class1777.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((Entity)entityPlayer) <= this.Field16147.Method367();
    }
    
    private Boolean Method6743() {
        return this.Field16146.Method341() == Class656.Field10804;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x55A4 ^ 0x88));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
