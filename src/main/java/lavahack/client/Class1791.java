//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import java.util.function.*;
import net.minecraft.init.*;
import net.minecraft.entity.*;

@Class99
public class Class1791 extends Class42
{
    private final Class44 Field16214;
    private final Class44 Field16215;
    private final Class44 Field16216;
    private final Class44 Field16217;
    private final Class1303 Field16218;
    private boolean Field16219;
    private int Field16220;
    @Class1274
    public EntityPlayer Field16221;
    private String Field16222 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1791() {
        super("AntiBow", Class97.Field8338);
        this.Field16214 = this.Method23(new Class44("Range", this, Double.longBitsToDouble(4630826316843712512L), 0.0, Double.longBitsToDouble(4630826316843712512L), false));
        this.Field16215 = this.Method23(new Class44("CheckUse", this, false));
        this.Field16216 = this.Method23(new Class44("MaxUse", this, Double.longBitsToDouble((long)2004394771 ^ 0x402400007778A313L), 0.0, Double.longBitsToDouble((long)537916071 ^ 0x40340000200FF2A7L), true));
        this.Field16217 = this.Method23(new Class44("BowInHandCheck", this, true));
        this.Field16218 = this.Method25(new Class1303("Rotate", (Class42)this, (Enum)Class135.Field8498));
        this.Field16221 = null;
        super.Method44(this::Method6776);
    }
    
    @Override
    public void Method38() {
        this.Field16219 = false;
        this.Field16221 = null;
    }
    
    @Override
    public void Method45() {
        if (Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field16221 = Class394.Method1924(this.Field16214.Method368());
        if (this.Field16221 == null) {
            if (this.Field16219) {
                Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.pressed = false;
                if (this.Field16220 != -1) {
                    Class9.Method110(this.Field16220, true);
                }
                this.Field16219 = false;
            }
        }
        else {
            final int method116 = Class9.Method116(Items.SHIELD, 0, 9);
            if (method116 == -1) {
                return;
            }
            this.Field16220 = Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
            if ((this.Field16217.Method365() && !this.Field16221.getHeldItemMainhand().getItem().equals(Items.BOW)) || (this.Field16215.Method365() && this.Field16221.getItemInUseMaxCount() <= this.Field16216.Method367())) {
                return;
            }
            if (!Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem().equals(Items.SHIELD)) {
                Class9.Method110(method116, true);
            }
            Class1791.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindUseItem.pressed = true;
            Class1464.Method5895((Entity)this.Field16221, (Class135)this.Field16218.Method341());
            this.Field16219 = true;
        }
    }
    
    private String Method6776() {
        return "[" + ((this.Field16221 == null) ? "no target no fun" : this.Field16221.getName()) + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x62A3 ^ 0x4E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
