//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.tileentity.*;

public class Class1067
{
    private static final Minecraft Field12703;
    private static final Class2124 Field12704;
    private static final Class2124 Field12705;
    private static final Class2124 Field12706;
    private String Field12707 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private static void Method4328(final Class424 class424) {
        final Vec3d method2103 = Class447.Method2103((Entity)class424.Method2054(1), (float)class424.Method2054(0));
        Class1067.Field12703.getRenderManager().getEntityRenderObject((Entity)class424.Method2054(1)).doRender((Entity)class424.Method2054(1), method2103.x, method2103.y, method2103.z, ((Entity)class424.Method2054(1)).rotationYaw, (float)class424.Method2054(0));
    }
    
    private static void Method4329(final Class424 class424) {
        TileEntityRendererDispatcher.instance.render((TileEntity)class424.Method2054(1), ((TileEntity)class424.Method2054(1)).getPos().getX() - Class1067.Field12703.renderManager.renderPosX, ((TileEntity)class424.Method2054(1)).getPos().getY() - Class1067.Field12703.renderManager.renderPosY, ((TileEntity)class424.Method2054(1)).getPos().getZ() - Class1067.Field12703.renderManager.renderPosZ, (float)class424.Method2054(0));
    }
    
    static Class2124 Method4330() {
        return Class1067.Field12704;
    }
    
    static Class2124 Method4331() {
        return Class1067.Field12705;
    }
    
    static Class2124 Method4332() {
        return Class1067.Field12706;
    }
    
    static void Method4333(final Class424 class424) {
        Method4329(class424);
    }
    
    static void Method4334(final Class424 class424) {
        Method4328(class424);
    }
    
    static Minecraft Method4335() {
        return Class1067.Field12703;
    }
    
    static {
        Field12703 = Minecraft.getMinecraft();
        Field12704 = Class1763.Method1727(Void.class, Float.class);
        Field12705 = Class1763.Method1727(Void.class, Float.class, Entity.class);
        Field12706 = Class1763.Method1727(Void.class, Float.class, Entity.class);
    }
}
