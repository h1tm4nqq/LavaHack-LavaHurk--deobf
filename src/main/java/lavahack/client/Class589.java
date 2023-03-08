//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.tileentity.*;
import java.util.*;
import java.util.concurrent.*;

public class Class589 extends Class42 implements Class1697
{
    private final Class44 Field10499;
    private final ArrayList Field10500;
    private final Class411 Field10501;
    private ArrayList Field10502;
    private String Field10503 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class589() {
        super("StorageESP", "ESP for storages", Class97.Field8342);
        this.Field10499 = this.Method23(new Class44("Distance(Squared)", (Class42)this, Double.longBitsToDouble((long)1913742116 ^ 0x40AF400072116324L), Double.longBitsToDouble(4621819117588971520L), Double.longBitsToDouble(4661014508095930368L), true));
        this.Field10500 = new ArrayList((Collection<? extends E>)Arrays.asList(new Class377(Class1431.Field14685, (Class42)this), new Class377(Class1431.Field14686, (Class42)this), new Class377(Class1431.Field14687, (Class42)this), new Class377(Class1431.Field14688, (Class42)this), new Class377(Class1431.Field14689, (Class42)this), new Class377(Class1431.Field14690, (Class42)this), new Class377(Class1431.Field14691, (Class42)this), new Class377(Class1431.Field14692, (Class42)this)));
        this.Field10501 = this.Method54();
        this.Field10502 = new ArrayList();
    }
    
    public void Method38() {
        super.Method38();
        this.Field10501.Method2004();
        this.Field10502.clear();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method2551(final RenderWorldLastEvent renderWorldLastEvent) {
        this.Field10501.Method2005(this::Method2553);
        this.Method2552(false);
    }
    
    public void Method20() {
        this.Method2552(true);
    }
    
    private void Method2552(final boolean b) {
        for (final TileEntity tileEntity : this.Field10502) {
            final Iterator<Class901> iterator2 = (Iterator<Class901>)this.Field10500.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().Method1836(tileEntity, b);
            }
        }
    }
    
    private void Method2553() {
        final ArrayList<TileEntity> list = new ArrayList<TileEntity>();
        for (final TileEntity e : Class589.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedTileEntityList) {
            if (Class589.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(e.getPos()) < this.Field10499.Method335()) {
                final Iterator<Class901> iterator2 = this.Field10500.iterator();
                while (iterator2.hasNext()) {
                    if (iterator2.next().Method1835(e, null)) {
                        list.add(e);
                    }
                }
            }
        }
        Class589.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask((Callable)this::Method2554);
    }
    
    private ArrayList Method2554(final ArrayList field10502) throws Exception {
        return this.Field10502 = field10502;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x69DE ^ 0xE9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
