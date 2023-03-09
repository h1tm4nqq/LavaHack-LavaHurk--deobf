//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.world.World
 *  net.minecraftforge.client.settings.IKeyConflictContext
 *  net.minecraftforge.client.settings.KeyConflictContext
 *  net.minecraftforge.client.settings.KeyModifier
 *  net.minecraftforge.common.ForgeHooks
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent
 */
package lavahack.client;

import lavahack.client.Class1434;
import lavahack.client.Class1479;
import lavahack.client.Class46;
import lavahack.client.Class483;
import lavahack.client.Class617;
import lavahack.client.Class934;
import lavahack.client.Class992;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.settings.IKeyConflictContext;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class Class373 {
    public static final Class373 Field9563 = new Class373();
    private static final KeyBinding Field9564 = new KeyBinding("schematica.key.load", 181, "schematica.key.category");
    private static final KeyBinding Field9565 = new KeyBinding("schematica.key.save", 55, "schematica.key.category");
    private static final KeyBinding Field9566 = new KeyBinding("schematica.key.control", 74, "schematica.key.category");
    private static final KeyBinding Field9567 = new KeyBinding("schematica.key.layerInc", 0, "schematica.key.category");
    private static final KeyBinding Field9568 = new KeyBinding("schematica.key.layerDec", 0, "schematica.key.category");
    private static final KeyBinding Field9569 = new KeyBinding("schematica.key.layerToggle", 0, "schematica.key.category");
    private static final KeyBinding Field9570 = new KeyBinding("schematica.key.renderToggle", 0, "schematica.key.category");
    private static final KeyBinding Field9571 = new KeyBinding("schematica.key.moveHere", 0, "schematica.key.category");
    private static final KeyBinding Field9572 = new KeyBinding("schematica.key.pickBlock", (IKeyConflictContext)KeyConflictContext.IN_GAME, KeyModifier.SHIFT, -98, "schematica.key.category");
    public static final KeyBinding[] Field9573 = new KeyBinding[]{Field9564, Field9565, Field9566, Field9567, Field9568, Field9569, Field9570, Field9571, Field9572};
    private final Minecraft Field9574 = Minecraft.getMinecraft();
    private String Field9575 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class373() {
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1824(InputEvent inputEvent) {
        Class1479 class1479;
        if (this.Field9574.currentScreen != null) return;
        if (Field9564.isPressed()) {
            this.Field9574.displayGuiScreen((GuiScreen)new Class483(this.Field9574.currentScreen));
        }
        if (Field9565.isPressed()) {
            this.Field9574.displayGuiScreen((GuiScreen)new Class1434(this.Field9574.currentScreen));
        }
        if (Field9566.isPressed()) {
            this.Field9574.displayGuiScreen((GuiScreen)new Class992(this.Field9574.currentScreen));
        }
        if (Field9567.isPressed() && (class1479 = Class46.Field8122) != null && class1479.Field14898 != Class617.Field10633) {
            class1479.Field14899 = MathHelper.clamp((int)(class1479.Field14899 + 1), (int)0, (int)(class1479.getHeight() - 1));
            Class934.Field11944.refresh();
        }
        if (Field9568.isPressed() && (class1479 = Class46.Field8122) != null && class1479.Field14898 != Class617.Field10633) {
            class1479.Field14899 = MathHelper.clamp((int)(class1479.Field14899 - 1), (int)0, (int)(class1479.getHeight() - 1));
            Class934.Field11944.refresh();
        }
        if (Field9569.isPressed() && (class1479 = Class46.Field8122) != null) {
            class1479.Field14898 = Class617.Method1105(class1479.Field14898);
            Class934.Field11944.refresh();
        }
        if (Field9570.isPressed() && (class1479 = Class46.Field8122) != null) {
            class1479.Field14897 = !class1479.Field14897;
            Class934.Field11944.refresh();
        }
        if (Field9571.isPressed() && (class1479 = Class46.Field8122) != null) {
            Class46.Method425(class1479);
            Class934.Field11944.refresh();
        }
        if (!Field9572.isPressed()) return;
        class1479 = Class46.Field8122;
        if (class1479 == null) return;
        if (!class1479.Field14897) return;
        this.Method1825(class1479, Class46.Field8129);
    }

    private boolean Method1825(Class1479 class1479, RayTraceResult rayTraceResult) {
        if (rayTraceResult == null) {
            return false;
        }
        if (rayTraceResult.typeOfHit == RayTraceResult.Type.MISS) {
            return false;
        }
        EntityPlayerSP entityPlayerSP = this.Field9574.player;
        if (!ForgeHooks.onPickBlock((RayTraceResult)rayTraceResult, (EntityPlayer)entityPlayerSP, (World)class1479)) {
            return true;
        }
        if (!entityPlayerSP.capabilities.isCreativeMode) return false;
        int n = entityPlayerSP.inventoryContainer.inventorySlots.size() - 10 + entityPlayerSP.inventory.currentItem;
        this.Field9574.playerController.sendSlotPacket(entityPlayerSP.inventory.getStackInSlot(entityPlayerSP.inventory.currentItem), n);
        return true;
    }

    private static String Method1826(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 159;
            cArray2[n] = (char)(cArray[n] ^ (0x1042 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

