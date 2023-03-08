//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraftforge.fml.common.gameevent.*;
import org.lwjgl.opengl.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class1973 extends Class42
{
    private final Class44 Field17082;
    private final Class44 Field17083;
    private final Class44 Field17084;
    public final Class44 Field17085;
    public final Class44 Field17086;
    public final Class44 Field17087;
    private final Class44 Field17088;
    public static Class1973 Field17089;
    private int Field17090;
    private int Field17091;
    
    public Class1973() {
        super("Optimizer", Class97.Field8343);
        this.Field17082 = this.Method23(new Class44("Remove Entity AI Watch Closest", this, false));
        this.Field17083 = this.Method23(new Class44("Remove Entity AI LookIdle", this, false));
        this.Field17084 = this.Method23(new Class44("Replace Look Helper", this, true));
        this.Field17085 = this.Method23(new Class44("TileEntity Render Range(Squared)", this, Double.longBitsToDouble(4661225614328463360L), 0.0, Double.longBitsToDouble((long)1592253923 ^ 0x40B000005EE7DDE3L), true));
        this.Field17086 = this.Method23(new Class44("Custom Entity Render Range", this, false));
        this.Field17087 = this.Method23(new Class44("Entity Render Range", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble((long)2005098274 ^ 0x4049000077835F22L), true).Method313(this.Field17086::Method365));
        this.Field17088 = this.Method23(new Class44("Lost Focus", this, false));
        Class1973.Field17089 = this;
    }
    
    @Override
    public void Method38() {
        Class2159.Field17865 = true;
        this.Field17090 = Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate;
    }
    
    @Override
    public void Method39() {
        Class2159.Field17865 = (Class2159.Field17866 = (Class2159.Field17867 = (Class2159.Field17868 = false)));
    }
    
    @Override
    public void Method45() {
        Class2159.Field17866 = this.Field17082.Method365();
        Class2159.Field17867 = this.Field17083.Method365();
        Class2159.Field17868 = this.Field17084.Method365();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7305(final TickEvent$ClientTickEvent tickEvent$ClientTickEvent) {
        if (Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field17088.Method365() && tickEvent$ClientTickEvent.phase != TickEvent$Phase.START) {
            if (!Display.isActive()) {
                if (Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate != 1) {
                    Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate = 1;
                }
            }
            else if (Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate == 1) {
                Class1973.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.limitFramerate = this.Field17090;
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4D01 ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
