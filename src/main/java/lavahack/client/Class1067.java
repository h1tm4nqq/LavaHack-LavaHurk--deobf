//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.entity.Entity
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import lavahack.client.Class1763;
import lavahack.client.Class2124;
import lavahack.client.Class424;
import lavahack.client.Class447;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.Vec3d;

public class Class1067 {
    private static final Minecraft Field12703 = Minecraft.getMinecraft();
    private static final Class2124 Field12704 = Class1763.Method1727(Void.class, Float.class);
    private static final Class2124 Field12705 = Class1763.Method1727(Void.class, Float.class, Entity.class);
    private static final Class2124 Field12706 = Class1763.Method1727(Void.class, Float.class, Entity.class);
    private String Field12707 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static void Method4328(Class424 class424) {
        Vec3d vec3d = Class447.Method2103((Entity)class424.Method2054(1), ((Float)class424.Method2054(0)).floatValue());
        Field12703.getRenderManager().getEntityRenderObject((Entity)class424.Method2054(1)).doRender((Entity)class424.Method2054(1), vec3d.x, vec3d.y, vec3d.z, ((Entity)class424.Method2054((int)1)).rotationYaw, ((Float)class424.Method2054(0)).floatValue());
    }

    private static void Method4329(Class424 class424) {
        TileEntityRendererDispatcher.instance.render((TileEntity)class424.Method2054(1), (double)((TileEntity)class424.Method2054(1)).getPos().getX() - Class1067.Field12703.renderManager.renderPosX, (double)((TileEntity)class424.Method2054(1)).getPos().getY() - Class1067.Field12703.renderManager.renderPosY, (double)((TileEntity)class424.Method2054(1)).getPos().getZ() - Class1067.Field12703.renderManager.renderPosZ, ((Float)class424.Method2054(0)).floatValue());
    }

    static Class2124 Method4330() {
        return Field12704;
    }

    static Class2124 Method4331() {
        return Field12705;
    }

    static Class2124 Method4332() {
        return Field12706;
    }

    static void Method4333(Class424 class424) {
        Class1067.Method4329(class424);
    }

    static void Method4334(Class424 class424) {
        Class1067.Method4328(class424);
    }

    static Minecraft Method4335() {
        return Field12703;
    }
}

